package ast.type;

import ast.AstNode;
import errorhandler.ErrorHandler;
import semantic.Visitor;

import java.util.List;

public class ErrorType extends AbstractType{

    private String message;

    public ErrorType(String message, int line, int column) {
        super(line, column);
        this.message = message;
        ErrorHandler.getInstance().addError(this);
    }

    @Override
    public Type arithmetic(AstNode node) {
        return this;
    }

    @Override
    public Type arithmetic(Type otherType, AstNode node) {
        return this;
    }

    @Override
    public Type logical(Type otherType, AstNode node) {
        return this;
    }

    @Override
    public Type logical(AstNode node) {
        return this;
    }

    @Override
    public Type promotesTo(Type otherType, AstNode node) {
        return this;
    }

    @Override
    public Type canBeCast(Type otherType, AstNode node) {
        return this;
    }

    @Override
    public Type comparison(Type otherType, AstNode node) {
        return this;
    }

    @Override
    public Type squareBrackets(Type otherType, AstNode node) {
        return this;
    }

    @Override
    public Type dot(String field, AstNode node) {
        return this;
    }

    @Override
    public Type parenthesis(List<Type> other, AstNode node) {
        return this;
    }

    @Override
    public String toString(){
        return message +" line: " + getLine() + ", column: " + getColumn();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
