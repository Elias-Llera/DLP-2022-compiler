package ast.expression;

public class FieldAccess extends AbstractExpression{

    private Expression expression;

    public FieldAccess(int line, int column) {
        super(line, column);
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
