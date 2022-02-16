package ast.expression.binary;

import ast.expression.AbstractExpression;
import ast.expression.Expression;

public class Arithmetic extends BinaryOperation {


    public Arithmetic(String operator, Expression rightExpression, Expression leftExpression, int line, int column) {
        super(operator, rightExpression, leftExpression, line, column);
    }
}
