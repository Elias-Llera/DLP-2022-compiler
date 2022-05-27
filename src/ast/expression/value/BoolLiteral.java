package ast.expression.value;

import ast.AbstractAstNode;
import ast.expression.AbstractExpression;
import semantic.Visitor;

public class BoolLiteral extends AbstractExpression {

    private boolean value;

    public BoolLiteral(boolean value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return Boolean.toString(value);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
