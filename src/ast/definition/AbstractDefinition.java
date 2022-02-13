package ast.definition;

import ast.AbstractAstNode;
import ast.type.Type;

public abstract class AbstractDefinition extends AbstractAstNode implements Definition{

    private String name;
    private Type type;

    public AbstractDefinition(int line, int column) {
        super(line, column);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
