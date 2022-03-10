package ast.expression;

public class ArrayAccess extends AbstractExpression{

    private Expression leftExpression;
    private Expression rightExpression;

    public ArrayAccess(Expression leftExpression, Expression rightExpression, int line, int column) {
        super(line, column);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
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

    @Override
    public String toString(){
        return leftExpression.toString() + "[" + rightExpression + "]";
    }
}
