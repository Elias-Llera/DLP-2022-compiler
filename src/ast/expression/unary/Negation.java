package ast.expression.unary;

import ast.expression.Expression;

public class Negation extends UnaryOperation{
    public Negation(Expression expression, int line, int column) {
        super(expression, line, column);
    }

    @Override
    public String toString(){
        return "!" + getExpression().toString();
    }

}
