package ast.definition;

import ast.type.Type;

public class VariableDefinition extends AbstractDefinition{

    public VariableDefinition(String name, Type type, int line, int column) {
        super(name, type, line, column);
    }
}
