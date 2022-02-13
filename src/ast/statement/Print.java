package ast.statement;

import ast.expression.Expression;

public class Print extends AbstractStatement{

    private Expression expression;

    public Print(int line, int column) {
        super(line, column);
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
