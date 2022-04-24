package ast.type;

import ast.AstNode;
import ast.expression.Expression;
import codegenerator.CodeGenerator;
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
        else if (otherType.equals(CharType.getInstance()))
            return IntegerType.getInstance();
        else
            return super.arithmetic(otherType, node);
    }

    @Override
    public Type promotesTo(Type otherType, AstNode node) {
        if (otherType instanceof ErrorType || otherType.equals(CharType.getInstance())
                || otherType.equals(IntegerType.getInstance()) || otherType.equals(DoubleType.getInstance()))
            return otherType;
        else
            return super.promotesTo(otherType, node);
    }
    @Override
    public Type canBeCast(Type otherType, AstNode node) {
        if (otherType instanceof ErrorType || otherType.equals(CharType.getInstance())
                || otherType.equals(IntegerType.getInstance()) || otherType.equals(DoubleType.getInstance()))
            return otherType;
        else
            return super.canBeCast(otherType, node);
    }

    @Override
    public Type comparison(Type otherType, AstNode node) {
        if (otherType instanceof ErrorType)
            return otherType;
        else if (otherType.equals(CharType.getInstance()) || otherType.equals(IntegerType.getInstance())
                || otherType.equals(DoubleType.getInstance()))
            return IntegerType.getInstance();
        else
            return super.comparison(otherType, node);
    }

    @Override
    public int numberOfBytes(){
        return 1;
    }

    @Override
    public String toString(){
        return "Char";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    public void promote(Expression expression, CodeGenerator codeGenerator){
        if (expression.getType().equals(IntegerType.getInstance()))
            codeGenerator.i2b();
        else if (expression.getType().equals(DoubleType.getInstance())) {
            codeGenerator.f2i();
            codeGenerator.i2b();
        } else if (!(expression.getType().equals(CharType.getInstance()))) {
            super.promote(expression, codeGenerator);
        }
    }

    public char suffix(){
        return 'b';
    }

}
