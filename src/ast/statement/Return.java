package ast.statement;

import ast.expression.Expression;

public class Return extends AbstractStatement {

    private Expression expression;

    public Return(Expression expression, int line, int column) {
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
