package codegenerator;

import ast.Program;
import ast.definition.FunctionDefinition;
import ast.definition.VarDefinition;
import ast.expression.value.Variable;
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

    @Override
    public Void visit (Program program, Void param){

        program.getProgram().stream().filter( definition -> definition instanceof VarDefinition)
                .forEach( definition -> definition.accept(this,null));

        codeGenerator.mainCall();

        program.getProgram().stream().filter( definition -> definition instanceof FunctionDefinition)
                .forEach( definition -> definition.accept(this,null));

        return null;
    }

    @Override
    public Void visit (VarDefinition varDefinition, Void param){
        codeGenerator.writeComment(
                varDefinition.getType().toString() + " " + varDefinition.getName()
                        + " (offset "+ varDefinition.getOffset()+")");
        return null;
    }

    @Override
    public Void visit (FunctionDefinition functionDefinition, Void param){

        codeGenerator.writeLine(functionDefinition);

        codeGenerator.generateLabel(functionDefinition.getName());
        functionDefinition.getType().accept(this,null);

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

    @Override
    public Void visit (FunctionType functionType, Void param){
        codeGenerator.writeComment("Parameters");

        for (VarDefinition parameter : functionType.getParameters()){
            functionType.accept(this,null);
        }

        return null;
    }


    @Override
    public Void visit (Input input, Void param){
        codeGenerator.writeLine(input);
        codeGenerator.writeComment("Read");

        input.getExpression().accept(this.addressCGVisitor, null);

        codeGenerator.in(input.getExpression().getType());
        codeGenerator.store(input.getExpression().getType());

        return null;
    }

    @Override
    public Void visit (Print print, Void param){
        codeGenerator.writeLine(print);
        codeGenerator.writeComment("Write");

        print.accept(this.valueCGVisitor, null);

        codeGenerator.out(print.getExpression().getType());

        return null;
    }



}
