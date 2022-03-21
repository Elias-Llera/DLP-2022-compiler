package ast.expression;

import ast.AstNode;

public interface Expression extends AstNode {

    boolean getLvalue();
    void setLvalue(boolean lvalue);

}
