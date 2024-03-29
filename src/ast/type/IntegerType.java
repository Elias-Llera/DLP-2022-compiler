package ast.type;

import ast.AstNode;
import ast.expression.Expression;
import codegenerator.CodeGenerator;
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
    public Type arithmetic(AstNode node) {
        return this;
    }

    @Override
    public Type arithmetic(Type otherType,AstNode node) {
        if (otherType instanceof ErrorType || otherType.equals(IntegerType.getInstance()))
            return otherType;
        else
            return super.arithmetic(otherType, node);
    }

    @Override
    public Type promotesTo(Type otherType, AstNode node) {
        if (otherType instanceof ErrorType || otherType.equals(IntegerType.getInstance())
                || otherType.equals(DoubleType.getInstance()))
            return otherType;
        else
            return super.promotesTo(otherType, node);
    }

    @Override
    public Type canBeCast(Type otherType, AstNode node) {
        if (otherType instanceof ErrorType || otherType.equals(IntegerType.getInstance())
                || otherType.equals(CharType.getInstance()) || otherType.equals(DoubleType.getInstance()))
            return otherType;
        else
            return super.canBeCast(otherType, node);
    }

    @Override
    public Type comparison(Type otherType, AstNode node) {
        if (otherType instanceof ErrorType)
            return otherType;
        else if (otherType.equals(IntegerType.getInstance()) || otherType.equals(CharType.getInstance())
                ||  otherType.equals(DoubleType.getInstance()))
            return BooleanType.getInstance();
        else
            return super.comparison(otherType, node);
    }

    @Override
    public int numberOfBytes(){
        return 2;
    }

    @Override
    public String toString(){
        return "Integer";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    public void promote(Expression expression, CodeGenerator codeGenerator){
        if (expression.getType().equals(DoubleType.getInstance()))
            codeGenerator.f2i();
        else if (expression.getType().equals(CharType.getInstance()))
            codeGenerator.b2i();
        else if (!(expression.getType().equals(IntegerType.getInstance())))
            super.promote(expression, codeGenerator);
    }

    public char suffix(){
        return 'i';
    }

}
