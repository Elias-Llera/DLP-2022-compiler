package ast.expression;

import ast.AbstractAstNode;

public abstract class AbstractExpression extends AbstractAstNode implements  Expression{

    boolean lvalue;

    public AbstractExpression(int line, int column) {
        super(line, column);
    }

    @Override
    public boolean getLvalue(){
        return lvalue;
    }

    @Override
    public void setLvalue(boolean lvalue){
        this.lvalue = lvalue;
    }

}
