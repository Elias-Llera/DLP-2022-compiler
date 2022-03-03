package ast.expression.value;

import ast.expression.AbstractExpression;

public class DoubleLiteral extends AbstractExpression {

    private double value;

    public DoubleLiteral(double value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
