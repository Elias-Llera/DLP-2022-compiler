package ast.expression.unary;

import ast.expression.AbstractExpression;
import ast.expression.Expression;

public abstract class UnaryOperation extends AbstractExpression {

    private String operator;
    private Expression expression;

    public UnaryOperation(int line, int column) {
        super(line, column);
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
