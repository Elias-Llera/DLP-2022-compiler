package ast.expression.binary;

import ast.expression.AbstractExpression;
import ast.expression.Expression;

public class Arithmetic extends BinaryOperation {


    public Arithmetic(Expression leftExpression, String operator, Expression rightExpression, int line, int column) {
        super(operator, rightExpression, leftExpression, line, column);
    }
}
