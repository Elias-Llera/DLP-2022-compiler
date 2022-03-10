package ast.expression.binary;

import ast.expression.Expression;

public class Comparison extends BinaryOperation{

    public Comparison(Expression leftExpression, String operator, Expression rightExpression, int line, int column) {
        super(operator, rightExpression, leftExpression, line, column);
    }

    @Override
    public String toString() {
        return getLeftExpression().toString() + getOperator() + getRightExpression().toString();
    }
}
