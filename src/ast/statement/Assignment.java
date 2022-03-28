package ast.statement;

import ast.expression.Expression;
import semantic.Visitor;

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

    @Override
    public String toString(){
        return leftSideExpression.toString() + " = " + rightSideExpression.toString();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
