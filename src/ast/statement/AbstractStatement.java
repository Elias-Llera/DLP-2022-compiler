package ast.statement;

import ast.AbstractAstNode;

public abstract class AbstractStatement extends AbstractAstNode implements Statement{
    public AbstractStatement(int line, int column) {
        super(line, column);
    }
}
