package ast.type;

import ast.AstNode;
import semantic.Visitor;

public class ArrayType extends AbstractType {

    private int size;
    private Type ofType;

    public ArrayType(int size, Type ofType, int line, int column) {
        super(line, column);
        this.size = size;
        this.ofType = ofType;
    }

    @Override
    public Type promotesTo(Type otherType, AstNode node) {
        if (otherType instanceof ErrorType || otherType instanceof ArrayType)
            return otherType;
        else
            return super.promotesTo(otherType, node);
    }

    @Override
    public Type squareBrackets(Type otherType, AstNode node) {
        if (otherType instanceof ErrorType)
            return otherType;
        if (!otherType.equals(IntegerType.getInstance()))
            return new ErrorType("The index for array access must an Integer", node.getLine(), node.getColumn());

        return ofType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Type getOfType() {
        return ofType;
    }

    public void setOfType(Type ofType) {
        this.ofType = ofType;
    }

    @Override
    public String toString(){
        return "[" + size + "]" + ofType.toString();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
