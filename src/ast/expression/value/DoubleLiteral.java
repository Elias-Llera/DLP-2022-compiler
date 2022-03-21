package ast.expression.value;

import ast.expression.AbstractExpression;
import visitor.Visitor;

public class DoubleLiteral extends AbstractExpression {

    private double value;

    public DoubleLiteral(double value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return Double.toString(value);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
