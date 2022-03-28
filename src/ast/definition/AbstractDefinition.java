package ast.definition;

import ast.AbstractAstNode;
import ast.type.Type;

public abstract class AbstractDefinition extends AbstractAstNode implements Definition{

    private String name;
    private Type type;
    private int scope;

    public AbstractDefinition(String name, Type type, int line, int column) {
        super(line, column);
        this.type = type;
        this.name = name;
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

    @Override
    public void setScope(int scope){
        this.scope = scope;
    }

    @Override
    public int getScope(){
        return scope;
    }

}
