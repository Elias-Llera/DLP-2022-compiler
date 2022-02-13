package ast.expression;

import ast.AbstractAstNode;

public abstract class AbstractExpression extends AbstractAstNode implements  Expression{
    public AbstractExpression(int line, int column) {
        super(line, column);
    }
}
