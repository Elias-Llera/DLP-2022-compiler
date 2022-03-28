package ast.definition;

import ast.statement.Statement;
import ast.type.Type;
import semantic.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionDefinition extends AbstractDefinition {

    private List<Statement> functionStatements;
    private List<VarDefinition> variableDefinitions;

    public FunctionDefinition(String name, Type type, List<Statement> functionStatements, List<VarDefinition> variableDefinitions, int line, int column) {
        super(name, type, line, column);
        this.functionStatements = functionStatements;
        this.variableDefinitions = variableDefinitions;
    }

    public FunctionDefinition(String name, Type type, int line, int column) {
        super(name, type, line, column);
        this.functionStatements = new ArrayList<>();
        this.variableDefinitions = new ArrayList<>();
    }

    public List<VarDefinition> getFunctionVariables() {
        return new ArrayList<VarDefinition>(variableDefinitions);
    }

    public List<Statement> getFunctionStatements() {
        return new ArrayList<Statement>(functionStatements);
    }

    public void addStatements(List<Statement> statements) {
        this.functionStatements.addAll(statements);
    }

    public void addVariableDefinitions(List<VarDefinition> variableDefinitions) {
        this.variableDefinitions.addAll(variableDefinitions);
    }

    @Override
    public String toString() {
        String str = getName() + ": " + getType().toString() + "\n";
        for (VarDefinition var : variableDefinitions) {
            str.concat(var.toString() + "\n");
        }
        for( Statement statement : functionStatements){
            str.concat(statement.toString() + "\n");
        }
        return str;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
