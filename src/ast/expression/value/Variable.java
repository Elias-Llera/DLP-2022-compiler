package ast.expression.value;

import ast.expression.AbstractExpression;

public class Variable extends AbstractExpression {

    private String name;

    public Variable(int line, int column) {
        super(line, column);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
