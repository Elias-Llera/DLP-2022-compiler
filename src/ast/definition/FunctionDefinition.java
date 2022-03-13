package ast.definition;

import ast.statement.Statement;
import ast.type.Type;

import java.util.ArrayList;
import java.util.List;

public class FunctionDefinition extends AbstractDefinition {

    private List<Statement> functionStatements;
    private List<VariableDefinition> variableDefinitions;

    public FunctionDefinition(String name, Type type, List<Statement> functionStatements, List<VariableDefinition> variableDefinitions, int line, int column) {
        super(name, type, line, column);
        this.functionStatements = functionStatements;
        this.variableDefinitions = variableDefinitions;
    }

    public FunctionDefinition(String name, Type type, int line, int column) {
        super(name, type, line, column);
        this.functionStatements = new ArrayList<>();
        this.variableDefinitions = new ArrayList<>();
    }

    public List<VariableDefinition> getFunctionVariables() {
        return new ArrayList<VariableDefinition>(variableDefinitions);
    }

    public List<Statement> getFunctionStatements() {
        return new ArrayList<Statement>(functionStatements);
    }

    public void addStatements(List<Statement> statements) {
        this.functionStatements.addAll(statements);
    }

    public void addVariableDefinitions(List<VariableDefinition> variableDefinitions) {
        this.variableDefinitions.addAll(variableDefinitions);
    }

    @Override
    public String toString() {
        String str = getName() + ": " + getType().toString() + "\n";
        for (VariableDefinition var : variableDefinitions) {
            str.concat(var.toString() + "\n");
        }
        for( Statement statement : functionStatements){
            str.concat(statement.toString() + "\n");
        }
        return str;
    }
}
