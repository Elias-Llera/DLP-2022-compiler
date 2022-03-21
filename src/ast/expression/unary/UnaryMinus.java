package ast.expression.unary;

import ast.expression.Expression;
import visitor.Visitor;

public class UnaryMinus extends UnaryOperation {

    public UnaryMinus(Expression expression, int line, int column) {
        super(expression, line, column);
    }

    @Override
    public String toString() {
        return "-" + getExpression().toString();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
