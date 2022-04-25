package codegenerator;

import ast.Program;
import ast.definition.FunctionDefinition;
import ast.definition.VarDefinition;
import ast.statement.Assignment;
import ast.statement.Input;
import ast.statement.Print;
import ast.statement.Statement;
import ast.type.FunctionType;
import ast.type.VoidType;

public class ExecuteCGVisitor extends AbstractCGVisitor {

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
    public Void visit (Program program, Void param){

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
    public Void visit (VarDefinition varDefinition, Void param){
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
    public Void visit (FunctionDefinition functionDefinition, Void param){
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
            statement.accept(this,null);
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
    public Void visit (Assignment assignment, Void param){
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
    public Void visit (Input input, Void param){
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
    public Void visit (Print print, Void param){
        codeGenerator.writeLine(print);
        codeGenerator.writeComment("Write");

        print.accept(this.valueCGVisitor, null);

        codeGenerator.out(print.getExpression().getType());

        return null;
    }

    /**
     * execute[[WhileStatement : statement1 -> expression statement2*]]() =
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


    /**
     * execute[[IfElseStatement : statement1 -> expression statement2* statement3*]]() =
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

    /**
     * execute[[FunctionInvocation : statement -> expression1 expression2*]]() =
     *          value[[(Expression)statement]]()
     *          if(((Expression)statement).type.equals(VoidType.getInstance()))
     *              <pop> ((Expression)statement).type.suffix()
     */

    /**
     * execute[[Return : statement -> expression]](functionDefinition) =
     *          value[[expression]]()
     *          <ret > functionDefinition.type.numberOfBytes
     *              <, > functionDefinition.bytesForLocals
     *              <,> functionDefinition.type.bytesForParams
     */

}
