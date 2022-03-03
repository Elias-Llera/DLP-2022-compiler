package ast.expression.binary;

import ast.expression.Expression;

public class Logical extends BinaryOperation{
    public Logical(Expression leftExpression, String operator, Expression rightExpression,  int line, int column) {
        super(operator, rightExpression, leftExpression, line, column);
    }
}
