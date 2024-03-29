package ast.definition;

import ast.type.Type;
import semantic.Visitor;

public class VarDefinition extends AbstractDefinition{

    private int offset;

    public VarDefinition(String name, Type type, int line, int column) {
        super(name, type, line, column);
    }

    public VarDefinition(int line, int column, String name, Type type) {
        this(name, type, line, column);
    }

    public int getOffset(){return offset;}

    public void setOffset(int offset){this.offset=offset;}

    @Override
    public String toString() {
        return getType().toString() + ": " + getName() ;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
