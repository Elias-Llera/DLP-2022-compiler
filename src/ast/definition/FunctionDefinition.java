package ast.definition;

import ast.statement.Statement;
import ast.type.Type;

import java.util.ArrayList;
import java.util.List;

public class FunctionDefinition extends AbstractDefinition{

    private List<Statement> functionStatements;
    private List<VariableDefinition> variableStatements;

    public FunctionDefinition(String name, Type type, List<Statement> functionStatements, List<VariableDefinition> variableStatements, int line, int column) {
        super(name, type, line, column);
        this.functionStatements = functionStatements;
        this.variableStatements = variableStatements;
    }

    public FunctionDefinition(String name, Type type, int line, int column) {
        super(name, type, line, column);
        this.functionStatements = new ArrayList<>();
        this.variableStatements = new ArrayList<>();
    }

    public List<VariableDefinition> getFunctionVariables(){
        return new ArrayList<VariableDefinition>(variableStatements);
    }

    public List<Statement> getFunctionStatements(){
        return new ArrayList<Statement>(functionStatements);
    }

    public void addStatements(List<Statement> statements){
        this.functionStatements.addAll(statements);
    }

    public void addVariableDefinitions(List<VariableDefinition> variableDefinitions){
        this.variableStatements.addAll(variableDefinitions);
    }
}
