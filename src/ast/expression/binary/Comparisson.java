package ast.expression.binary;

import ast.expression.Expression;

public class Comparisson extends BinaryOperation{

    public Comparisson(Expression leftExpression, String operator, Expression rightExpression,  int line, int column) {
        super(operator, rightExpression, leftExpression, line, column);
    }
}
