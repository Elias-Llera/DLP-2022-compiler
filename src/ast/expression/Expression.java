package ast.expression;

import ast.AstNode;
import ast.type.Type;

public interface Expression extends AstNode {

    boolean getLvalue();
    void setLvalue(boolean lvalue);

    Type getType();
    void setType(Type type);

}
