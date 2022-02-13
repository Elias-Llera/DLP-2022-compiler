package ast.expression;

public class ArrayAccess extends AbstractExpression{

    private Expression leftExpression;
    private Expression rightExpression;

    public ArrayAccess(int line, int column) {
        super(line, column);
    }

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public void setLeftExpression(Expression leftExpression) {
        this.leftExpression = leftExpression;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }

    public void setRightExpression(Expression rightExpression) {
        this.rightExpression = rightExpression;
    }
}
