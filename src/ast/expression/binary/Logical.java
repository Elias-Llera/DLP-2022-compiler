package ast.expression.binary;

import ast.expression.Expression;
import visitor.Visitor;

public class Logical extends BinaryOperation{

    public Logical(Expression leftExpression, String operator, Expression rightExpression,  int line, int column) {
        super(operator, rightExpression, leftExpression, line, column);
    }

    @Override
    public String toString() {
        return getLeftExpression().toString() + getOperator() + getRightExpression().toString();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
