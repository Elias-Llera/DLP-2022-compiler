package ast.type;

import ast.AbstractAstNode;
import ast.AstNode;

import java.util.List;

public abstract class AbstractType extends AbstractAstNode implements Type {

    public AbstractType(int line, int column) {
        super(line, column);
    }

    public boolean isLogical(){
        return false;
    }

    public Type arithmetic(Type type, AstNode node){
        return new ErrorType("Cannot do arithmetics operations with these types.", node.getLine(), node.getColumn());
    }

    public Type arithmetic(AstNode node){
        return new ErrorType("Cannot do arithmetic operations with this type.", node.getLine(), node.getColumn());
    }

    public Type comparison(Type type, AstNode node){
        return new ErrorType("Cannot do a comparison between these types.", node.getLine(), node.getColumn());
    }

    public Type logical(Type type, AstNode node){
        return new ErrorType("Cannot do a logical operation with these types.", node.getLine(), node.getColumn());
    }

    public Type logical(AstNode node){
        return new ErrorType("Cannot do a logical operation with this type.", node.getLine(), node.getColumn());
    }

    public Type dot(String name, AstNode node){
        return new ErrorType("The type is not struct.", node.getLine(), node.getColumn());
    }

    public Type squareBrackets(Type type, AstNode node){
        return new ErrorType("The type is not array.", node.getLine(), node.getColumn());
    }

    public boolean isBuiltIn(){
        return false;
    }

    public Type canBeCast(Type type, AstNode node){
        return new ErrorType("Cannot do cast operation.", node.getLine(), node.getColumn());
    }

    public Type parenthesis(List<Type> params, AstNode node){
        return new ErrorType("The type is not function.", node.getLine(), node.getColumn());
    }

    public Type promotesTo(Type type, AstNode node){
        return new ErrorType("Promotion is not allowed for this type.", node.getLine(), node.getColumn());
    }
}
