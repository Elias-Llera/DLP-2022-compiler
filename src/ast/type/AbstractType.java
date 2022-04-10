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

    public Type arithmetic(Type otherType, AstNode node){
        return new ErrorType("Cannot do arithmetic operation with types "
                + this.toString() + " and "+  otherType.toString(),
                node.getLine(),node.getColumn());
    }

    public Type arithmetic(AstNode node){
        return new ErrorType("Cannot do arithmetic operation with type "
                + this.toString(),
                node.getLine(),node.getColumn());
    }

    public Type comparison(Type otherType, AstNode node){
        return new ErrorType("Cannot compare types "
                + this.toString() + " and " +  otherType.toString(),
                node.getLine(),node.getColumn());
    }

    public Type logical(Type otherType, AstNode node){
        return new ErrorType("Cannot do logical operation with types "
                + this.toString() + " and " +  otherType.toString(),
                node.getLine(),node.getColumn());
    }

    public Type logical(AstNode node){
        return new ErrorType("Cannot do logical operation with type "
                + this.toString(),
                node.getLine(),node.getColumn());
    }

    public Type dot(String name, AstNode node){
        return new ErrorType("The type is not struct.", node.getLine(), node.getColumn());
    }

    public Type squareBrackets(Type otherType, AstNode node){
        return new ErrorType("The type is not array.", node.getLine(), node.getColumn());
    }

    public boolean isBuiltIn(){
        return false;
    }

    public Type canBeCast(Type otherType, AstNode node){
        return new ErrorType("Cannot cast type "
                + this.toString() + " to type " +  otherType.toString(),
                node.getLine(),node.getColumn());
    }

    public Type parenthesis(List<Type> params, AstNode node){
        return new ErrorType("The type is not function.", node.getLine(), node.getColumn());
    }

    public Type promotesTo(Type otherType, AstNode node){
        return new ErrorType("Cannot promote type  "
                + this.toString() + " to type " +  otherType.toString(),
                node.getLine(),node.getColumn());
    }
}
