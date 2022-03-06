package ast.statement;

import ast.expression.AbstractExpression;
import ast.expression.Expression;

public class Assignment extends AbstractStatement {

    private Expression rightSideExpression;
    private Expression leftSideExpression;

    public Assignment(Expression leftSideExpression, Expression rightSideExpression, int line, int column) {
        super(line, column);
        this.leftSideExpression = leftSideExpression;
        this.rightSideExpression = rightSideExpression;
    }

    public Expression getRightSideExpression() {
        return rightSideExpression;
    }

    public void setRightSideExpression(Expression rightSideExpression) {
        this.rightSideExpression = rightSideExpression;
    }

    public Expression getLeftSideExpression() {
        return leftSideExpression;
    }

    public void setLeftSideExpression(Expression leftSideExpression) {
        this.leftSideExpression = leftSideExpression;
    }
}
