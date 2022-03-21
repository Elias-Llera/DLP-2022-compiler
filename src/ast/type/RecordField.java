package ast.type;

import ast.AbstractAstNode;
import visitor.Visitor;

public class RecordField extends AbstractAstNode {

    private Type type;
    private String name;

    public RecordField(Type type, String name, int line, int column) {
        super(line, column);
        this.type = type;
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name + ": " + type.toString();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
