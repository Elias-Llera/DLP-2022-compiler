package ast.expression.unary;

import ast.expression.Expression;

public class UnaryMinus extends UnaryOperation {

    public UnaryMinus(Expression expression, int line, int column) {
        super(expression, line, column);
    }

    @Override
    public String toString() {
        return "-" + getExpression().toString();
    }
}
