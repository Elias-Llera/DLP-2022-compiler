package ast.type;

import ast.AstNode;
import semantic.Visitor;

public class CharType extends AbstractType{

    private static CharType instance;

    private CharType(){
        super(0,0);
    }

    public static CharType getInstance(){
        if(instance == null){
            instance = new CharType();
        }
        return instance;
    }

    @Override
    public boolean isBuiltIn() {
        return true;
    }

    @Override
    public Type arithmetic(AstNode node) {
        return IntegerType.getInstance();
    }

    @Override
    public Type arithmetic(Type otherType, AstNode node) {
        if (otherType instanceof ErrorType)
            return otherType;
        else if (otherType instanceof CharType)
            return IntegerType.getInstance();
        else
            return super.arithmetic(otherType, node);
    }

    @Override
    public Type promotesTo(Type otherType, AstNode node) {
        if (otherType instanceof ErrorType || otherType instanceof CharType || otherType instanceof IntegerType || otherType instanceof DoubleType)
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
            return IntegerType.getInstance();
        else
            return super.comparison(otherType, node);
    }

    @Override
    public String toString(){
        return "Char";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
