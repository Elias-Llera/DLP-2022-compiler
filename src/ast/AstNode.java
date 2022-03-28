package ast;

import semantic.Visitor;

public interface AstNode {

    int getLine();
    int getColumn();

    <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param);

}
