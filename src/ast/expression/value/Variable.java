package ast.expression.value;

import ast.expression.AbstractExpression;

public class Variable extends AbstractExpression {

    private String name;

    public Variable(String name, int line, int column) {
        super(line, column); this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

}
