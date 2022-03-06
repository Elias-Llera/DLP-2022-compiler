package ast.expression.unary;

import ast.expression.AbstractExpression;
import ast.expression.Expression;

public abstract class UnaryOperation extends AbstractExpression {

    private Expression expression;

    public UnaryOperation(Expression expression, int line, int column) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
