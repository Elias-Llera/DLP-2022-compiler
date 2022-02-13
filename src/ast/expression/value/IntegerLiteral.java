package ast.expression.value;

import ast.expression.AbstractExpression;

public class IntegerLiteral extends AbstractExpression {
    public IntegerLiteral(int line, int column) {
        super(line, column);
    }
}
