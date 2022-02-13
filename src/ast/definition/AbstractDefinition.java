package ast.definition;

import ast.AbstractAstNode;

public abstract class AbstractDefinition extends AbstractAstNode implements Definition{
    public AbstractDefinition(int line, int column) {
        super(line, column);
    }
}
