package ast.type;

import ast.definition.VariableDefinition;

public class RecordField {

    private VariableDefinition variableDefinition;
    private String name;

    public VariableDefinition getVariableDefinition() {
        return variableDefinition;
    }

    public void setVariableDefinition(VariableDefinition variableDefinition) {
        this.variableDefinition = variableDefinition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
