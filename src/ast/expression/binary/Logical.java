package ast.expression.binary;

import ast.expression.Expression;

public class Logical extends BinaryOperation{
    public Logical(String operator, Expression rightExpression, Expression leftExpression, int line, int column) {
        super(operator, rightExpression, leftExpression, line, column);
    }
}
