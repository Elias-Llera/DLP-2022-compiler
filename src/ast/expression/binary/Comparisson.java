package ast.expression.binary;

import ast.expression.Expression;

public class Comparisson extends BinaryOperation{

    public Comparisson(String operator, Expression rightExpression, Expression leftExpression, int line, int column) {
        super(operator, rightExpression, leftExpression, line, column);
    }
}
