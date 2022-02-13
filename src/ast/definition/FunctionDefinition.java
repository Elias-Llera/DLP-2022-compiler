package ast.definition;

import ast.statement.Statement;

import java.util.ArrayList;
import java.util.List;

public class FunctionDefinition extends AbstractDefinition{

    private List<Statement> functionStatements;
    private List<VariableDefinition> functionVariables;

    public FunctionDefinition(int line, int column) {
        super(line, column);
    }

    public List<VariableDefinition> getFunctionVariables(){
        return new ArrayList<VariableDefinition>(functionVariables);
    }

    public List<Statement> getFunctionStatements(){
        return new ArrayList<Statement>(functionStatements);
    }

    public void addStatement(Statement statement){
        this.functionStatements.add(statement);
    }

    public void addVariableDefinition(VariableDefinition variableDefinition){
        this.functionVariables.add(variableDefinition);
    }
}
