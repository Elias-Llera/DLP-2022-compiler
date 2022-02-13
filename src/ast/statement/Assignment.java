package ast.statement;

import ast.expression.AbstractExpression;
import ast.expression.Expression;

public class Assignment extends AbstractExpression {

    private Expression rightSideExpression;
    private Expression leftSideExpression;

    public Assignment(int line, int column) {
        super(line, column);
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
