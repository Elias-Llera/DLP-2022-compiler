package ast.type;

import ast.AstNode;

import java.util.List;

public interface Type extends AstNode {

    boolean isLogical();

    Type arithmetic(Type type, AstNode node);

    Type arithmetic(AstNode node);

    Type comparison(Type type, AstNode node);

    Type logical(Type type, AstNode node);

    Type logical(AstNode node);

    Type dot(String name, AstNode node);

    Type squareBrackets(Type type, AstNode node);

    boolean isBuiltIn();

    Type canBeCast(Type type, AstNode node);

    Type parenthesis(List<Type> params, AstNode node);

    Type promotesTo(Type type, AstNode node);

    int numberOfBytes();

}
