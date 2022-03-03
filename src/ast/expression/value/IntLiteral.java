package ast.expression.value;

import ast.expression.AbstractExpression;

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
}
