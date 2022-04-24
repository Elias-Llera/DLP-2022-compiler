package ast.type;

import ast.AstNode;
import ast.expression.Expression;
import codegenerator.CodeGenerator;
import semantic.Visitor;

public class DoubleType extends AbstractType {

    private static DoubleType instance;

    private DoubleType(){
        super(0,0);
    }

    public static DoubleType getInstance(){
        if(instance == null){
            instance = new DoubleType();
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
    public Type arithmetic(Type otherType, AstNode node) {
        if (otherType instanceof ErrorType || otherType.equals(DoubleType.getInstance()))
            return otherType;
        else
            return super.arithmetic(otherType, node);
    }

    @Override
    public Type promotesTo(Type otherType, AstNode node) {
        if (otherType instanceof ErrorType || otherType.equals(DoubleType.getInstance()))
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
        return 4;
    }

    @Override
    public String toString(){
        return "Double";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    public void promote(Expression expression, CodeGenerator codeGenerator){
        if (expression.getType().equals(IntegerType.getInstance()))
            codeGenerator.i2f();
        else if (expression.getType().equals(CharType.getInstance())) {
            codeGenerator.b2i();
            codeGenerator.i2f();
        } else if (!(expression.getType().equals(DoubleType.getInstance())))
            super.promote(expression, codeGenerator);
    }

    public char suffix(){
        return 'f';
    }

}
