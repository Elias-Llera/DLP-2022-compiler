package ast.expression.unary;

import ast.expression.Expression;
import ast.expression.binary.BinaryOperation;

public class UnaryMinus extends UnaryOperation {


    public UnaryMinus(String operator, Expression expression, int line, int column) {
        super(operator, expression, line, column);
    }
}
