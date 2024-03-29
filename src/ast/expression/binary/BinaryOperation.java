package ast.expression.binary;

import ast.expression.AbstractExpression;
import ast.expression.Expression;

public abstract class BinaryOperation extends AbstractExpression
{
    private Expression rightExpression;
    private Expression leftExpression;
    private String operator;

    public BinaryOperation(String operator, Expression rightExpression, Expression leftExpression, int line, int column) {
        super(line, column);
        this.operator = operator;
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }

    public void setRightExpression(Expression rightExpression) {
        this.rightExpression = rightExpression;
    }

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public void setLeftExpression(Expression leftExpression) {
        this.leftExpression = leftExpression;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
