package ast.statement;

import ast.expression.Expression;

public class Input extends AbstractStatement{

    private Expression expression;

    public Input(Expression expression, int line, int column) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString(){
        return "Input " + expression.toString();
    }
}
