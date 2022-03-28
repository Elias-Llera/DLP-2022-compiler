package ast.expression.value;

import ast.expression.AbstractExpression;
import semantic.Visitor;

public class IntLiteral extends AbstractExpression {

    private int value;

    public IntLiteral(int value, int line, int column) {
        super(line, column); this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return Integer.toString(value);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
