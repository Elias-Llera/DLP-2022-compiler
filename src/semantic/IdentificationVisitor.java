package semantic;

import ast.definition.Definition;
import ast.definition.FunctionDefinition;
import ast.definition.VarDefinition;
import ast.expression.FunctionInvocation;
import ast.expression.value.Variable;
import ast.type.ErrorType;
import symboltable.SymbolTable;

public class IdentificationVisitor extends AbstractVisitor<Void, Void>{

    private SymbolTable symbolTable = new SymbolTable();

    @Override
    public Void visit(Variable variable, Void param) {
        Definition varDefinition = symbolTable.find(variable.getName());
        if(varDefinition == null){
            variable.setDefinition(new VarDefinition("ERROR",
                    new ErrorType("Variable does not exist.", variable.getLine(), variable.getColumn()),
                    0, 0));
        } else {
            variable.setDefinition(varDefinition);
        }
        return null;
    }

    @Override
    public Void visit(FunctionInvocation funcInvocation, Void param) {
        Definition functionDefinition = symbolTable.find(funcInvocation.getVariable().getName());
        if(functionDefinition == null){
            funcInvocation.getVariable().setDefinition(new VarDefinition("ERROR",
                    new ErrorType("Function does not exist.", funcInvocation.getLine(), funcInvocation.getColumn()),
                    0, 0));
        } else {
            funcInvocation.getVariable().setDefinition(functionDefinition);
        }
        super.visit(funcInvocation, param);
        return null;
    }

    @Override
    public Void visit(VarDefinition varDefinition, Void param) {
        if(!symbolTable.insert(varDefinition)){
            new ErrorType("Duplicated definition name.", varDefinition.getLine(), varDefinition.getColumn());
        }
        return null;
    }

    @Override
    public Void visit(FunctionDefinition functionDefinition, Void param) {
        if(!symbolTable.insert(functionDefinition)){
            new ErrorType("Duplicated definition name.", functionDefinition.getLine(), functionDefinition.getColumn());
        }
        symbolTable.set();
        super.visit(functionDefinition, param);
        symbolTable.reset();
        return null;
    }

}
