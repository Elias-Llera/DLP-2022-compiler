package ast.type;

import ast.AstNode;
import semantic.Visitor;

public class IntegerType extends AbstractType{
    
    private static IntegerType instance;

    private IntegerType(){
        super(0,0);
    }

    public static IntegerType getInstance(){
        if(instance == null){
            instance = new IntegerType();
        }
        return instance;
    }

    @Override
    public boolean isBuiltIn() {
        return true;
    }

    @Override
    public boolean isLogical() {
        return true;
    }

    @Override
    public Type arithmetic(AstNode node) {
        return this;
    }

    @Override
    public Type arithmetic(Type otherType,AstNode node) {
        if (otherType instanceof IntegerType || otherType instanceof ErrorType)
            return otherType;
        else
            return super.arithmetic(otherType, node);
    }

    @Override
    public Type logical(AstNode node) {
        return this;
    }

    @Override
    public Type logical(Type otherType, AstNode node) {
        if (otherType instanceof IntegerType || otherType instanceof ErrorType)
            return otherType;
        else
            return super.logical(otherType, node);
    }

    @Override
    public Type promotesTo(Type otherType, AstNode node) {
        if (otherType instanceof ErrorType || otherType instanceof IntegerType || otherType instanceof DoubleType)
            return otherType;
        else
            return super.promotesTo(otherType, node);
    }

    @Override
    public Type canBeCast(Type otherType, AstNode node) {
        if (otherType instanceof ErrorType || otherType instanceof CharType || otherType instanceof IntegerType || otherType instanceof DoubleType)
            return otherType;
        else
            return super.canBeCast(otherType, node);
    }

    @Override
    public Type comparison(Type otherType, AstNode node) {
        if (otherType instanceof ErrorType)
            return otherType;
        else if (otherType instanceof CharType || otherType instanceof IntegerType || otherType instanceof DoubleType)
            return this;
        else
            return super.comparison(otherType, node);
    }

    @Override
    public String toString(){
        return "Integer";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
