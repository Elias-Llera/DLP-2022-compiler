package codegenerator;

import ast.Program;
import ast.definition.FunctionDefinition;
import ast.definition.VarDefinition;
import ast.expression.FunctionInvocation;
import ast.statement.*;
import ast.type.FunctionType;
import ast.type.Type;
import ast.type.VoidType;

public class ExecuteCGVisitor extends AbstractCGVisitor<FunctionDefinition> {

    private ValueCGVisitor valueCGVisitor;
    private AddressCGVisitor addressCGVisitor;

    public ExecuteCGVisitor(CodeGenerator codeGenerator){
        super(codeGenerator);
        this.valueCGVisitor = new ValueCGVisitor(codeGenerator);
        this.addressCGVisitor = new AddressCGVisitor(codeGenerator, valueCGVisitor);
    }

    /**
     * execute [[Program : program -> definition*]]() =
     *      for (Definition definition : definition*)
     *          if (definition instanceof VarDefinition)
     *              execute[[definition]]()
     *      <call main>
     *      <halt>
     *      for (Definition definition : definition*)
     *          if (definition instanceof FunctionDefinition)
     *             execute[[definition]]()
     */
    @Override
    public Void visit (Program program, FunctionDefinition param){

        program.getProgram().stream().filter( definition -> definition instanceof VarDefinition)
                .forEach( definition -> definition.accept(this,null));

        codeGenerator.mainCall();

        program.getProgram().stream().filter( definition -> definition instanceof FunctionDefinition)
                .forEach( definition -> definition.accept(this,null));

        return null;
    }

    /**
     * execute [[VarDefinition : varDefinition -> ID type]]() =
     *      < ' * > type + < > + ID <(offset > varDefinition.offset <)>
     */
    @Override
    public Void visit (VarDefinition varDefinition, FunctionDefinition param){
        codeGenerator.writeComment(
                varDefinition.getType().toString() + " " + varDefinition.getName()
                        + " (offset "+ varDefinition.getOffset()+")");
        return null;
    }

    /**
     * execute [[FunctionDefinition : functionDefinition -> ID functionType VarDefinition* Statement*]]() =
     *      <#Line > functionDefinition.line
     *      ID <:>
     *
     *      execute[[functionType]]()
     *
     *      < ' * Local variables>
     *      for (VarDefinition varDefinition : VarDefinition*)
     *          execute[[varDefinition]]()
     *
     *      <enter> -1 * functionDefinition.bytesForLocals
     *
     *      for (Statement statement : Statement*)
     *          execute[[statement]]()
     *
     *      if (functionType.returnType.equals(VoidType.getInstance))
     *          <ret> 0 <,> functionDefinition.bytesForLocals <,> functionType.bytesForParams
     *
     */
    @Override
    public Void visit (FunctionDefinition functionDefinition, FunctionDefinition param){
        codeGenerator.writeLine(functionDefinition);
        codeGenerator.generateLabel(functionDefinition.getName());

        codeGenerator.writeComment("Parameters");
        for (VarDefinition parameter : ((FunctionType)functionDefinition.getType()).getParameters()){
            parameter.accept(this,null);
        }

        codeGenerator.writeComment("Local variables");
        for (VarDefinition varDefinition : functionDefinition.getFunctionVariables()){
            varDefinition.accept(this,null);
        }

        codeGenerator.enter(functionDefinition.getBytesForLocals());

        for (Statement statement : functionDefinition.getFunctionStatements()){
            statement.accept(this, functionDefinition);
        }

        FunctionType functionType = (FunctionType)functionDefinition.getType();
        if (functionType.getReturnType().equals(VoidType.getInstance()))
            codeGenerator.ret(0,functionDefinition.getBytesForLocals(),functionType.getBytesForParams());

        return null;
    }

    /**
     * execute[[Assignment : statement -> expression1 expression2]]() =
     *      address[[expression1]]()
     *      value[[expression2]]()
     *      expression1.type.promote(expression2, codeGenerator);
     *      <store>expression1.type.suffix()
     */
    @Override
    public Void visit (Assignment assignment, FunctionDefinition param){
        codeGenerator.writeLine(assignment);
        codeGenerator.writeComment("Assignment");

        assignment.getLeftSideExpression().accept(this.addressCGVisitor, null);
        assignment.getRightSideExpression().accept(this.valueCGVisitor, null);

        assignment.getLeftSideExpression().getType().promote(assignment.getRightSideExpression(), codeGenerator);
        codeGenerator.store(assignment.getLeftSideExpression().getType());

        return null;
    }

    /**
     * execute[[Input : statement -> expression]]() =
     *          <#Line > expression.line
     *          <' * Read>
     *          address[[expression]]()
     *
     *          <in>expression.type.suffix()
     *          <store>expression.type.suffix()
     */
    @Override
    public Void visit (Input input, FunctionDefinition param){
        codeGenerator.writeLine(input);
        codeGenerator.writeComment("Read");

        input.getExpression().accept(this.addressCGVisitor, null);

        codeGenerator.in(input.getExpression().getType());
        codeGenerator.store(input.getExpression().getType());

        return null;
    }

    /**
     * execute[[Write : statement -> expression]]() =
     *          <#Line > expression.line
     *          <' * Read>
     *          value[[expression]]()
     *          <out>expression.type.suffix()
     */
    @Override
    public Void visit (Print print, FunctionDefinition param){
        codeGenerator.writeLine(print);
        codeGenerator.writeComment("Write");

        print.getExpression().accept(this.valueCGVisitor, null);

        codeGenerator.out(print.getExpression().getType());

        return null;
    }

    /**
     * execute[[While : statement1 -> expression statement2*]]() =
     *          int end = codeGenerator.getLabel()
     *          int condition = codeGenerator.getLabel()
     *          <LABEL_> condition <:>
     *          value[[expression]]()
     *          <jz LABEL_> end
     *          for(Statement statement : statement2*)
     *              execute[[statement]]()
     *          <jmp LABEL_> condition
     *          <LABEL_> end <:>
     */
    @Override
    public Void visit (While whileStatement, FunctionDefinition param){

        codeGenerator.writeLine(whileStatement);
        codeGenerator.writeComment("While");

        int endLabel, conditionLabel;
        endLabel = codeGenerator.generateLabel();
        conditionLabel = codeGenerator.generateLabel();

        codeGenerator.writeLabel(conditionLabel);
        whileStatement.getCondition().accept(valueCGVisitor, null);
        codeGenerator.jz(endLabel);

        codeGenerator.writeComment("While body");
        for (Statement statement : whileStatement.getBody()) {
            statement.accept(this, param);
        }

        codeGenerator.jmp(conditionLabel);
        codeGenerator.writeLabel(endLabel);

        return null;
    }


    /**
     * execute[[IfElse : statement1 -> expression statement2* statement3*]]() =
     *          int else = codeGenerator.getLabel()
     *          int end = codeGenerator.getLabel()
     *          value[[expression]]()
     *          <jz LABEL_> else
     *          for(Statement statement : statement2*)
     *              execute[[statement]]()
     *          <jmp LABEL_> end
     *          <LABEL_> else <:>
     *          for(Statement statement : statement3*)
     *              execute[[statement]]()
     *          <LABEL_> end <:>
     */
    @Override
    public Void visit (IfElse ifElse, FunctionDefinition param){

        codeGenerator.writeLine(ifElse);
        codeGenerator.writeComment("If-Else");

        int endLabel = codeGenerator.generateLabel();
        int elseLabel = codeGenerator.generateLabel();

        ifElse.getCondition().accept(valueCGVisitor, null);
        codeGenerator.jz(elseLabel);

        for (Statement statement : ifElse.getIfBody()) {
            codeGenerator.writeComment("If body");
            statement.accept(this, param);
        }
        codeGenerator.jmp(endLabel);

        codeGenerator.writeLabel(elseLabel);
        for (Statement statement : ifElse.getElseBody()) {
            codeGenerator.writeComment("Else body");
            statement.accept(this, param);
        }

        codeGenerator.writeLabel(endLabel);

        return null;
    }

    /**
     * execute[[FunctionInvocation : statement -> expression1 expression2*]]() =
     *          value[[(Expression)statement]]()
     *          if(((Expression)statement).type.returnType.equals(VoidType.getInstance()))
     *              <pop> ((Expression)statement).type.suffix()
     */
    @Override
    public Void visit (FunctionInvocation functionInvocation, FunctionDefinition param){

        codeGenerator.writeLine(functionInvocation);
        codeGenerator.writeComment("Invocation of function " + functionInvocation.getVariable().getName());

        functionInvocation.accept(this.valueCGVisitor, null);

        Type functionReturnType = ((FunctionType)functionInvocation.getVariable().getDefinition().getType()).getReturnType();
        if(!functionReturnType.equals(VoidType.getInstance())){
            codeGenerator.pop(functionReturnType);
        }

        return null;
    }

    /**
     * execute[[Return : statement -> expression]](functionDefinition) =
     *          value[[expression]]()
     *          <ret > functionDefinition.type.numberOfBytes
     *              <, > functionDefinition.bytesForLocals
     *              <, > functionDefinition.type.bytesForParams
     */
    @Override
    public Void visit (Return returnStatement, FunctionDefinition param){

        codeGenerator.writeLine(returnStatement);
        codeGenerator.writeComment("Return");

        returnStatement.getExpression().accept(this.valueCGVisitor, null);

        int returnTypeSize = ((FunctionType)param.getType()).getReturnType().numberOfBytes();
        int localsSize = param.getBytesForLocals();
        int paramsSize = ((FunctionType)param.getType()).getBytesForParams();
        codeGenerator.ret(returnTypeSize, localsSize, paramsSize);

        return null;
    }

}
