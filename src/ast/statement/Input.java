package ast.statement;

import ast.expression.Expression;

public class Input extends AbstractStatement{

    private Expression expression;

    public Input(int line, int column) {
        super(line, column);
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
