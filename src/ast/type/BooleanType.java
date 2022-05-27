package ast.type;

import ast.AstNode;
import ast.expression.Expression;
import codegenerator.CodeGenerator;
import semantic.Visitor;

public class BooleanType extends AbstractType{

    private static BooleanType instance;

    private BooleanType(){
        super(0,0);
    }

    public static BooleanType getInstance(){
        if(instance == null){
            instance = new BooleanType();
        }
        return instance;
    }

    @Override
    public boolean isBuiltIn() {
        return true;
    }

    @Override
    public boolean isLogical(){
        return true;
    }

    @Override
    public Type logical(AstNode node) {
        return this;
    }

    @Override
    public Type logical(Type otherType, AstNode node) {
        if (otherType instanceof ErrorType || otherType.equals(this))
            return this;
        else
            return super.logical(otherType, node);
    }

    @Override
    public Type promotesTo(Type otherType, AstNode node) {
        if (otherType instanceof ErrorType || otherType.equals(BooleanType.getInstance()))
            return otherType;
        else
            return super.promotesTo(otherType, node);
    }

    @Override
    public int numberOfBytes(){
        return 2;
    }

    @Override
    public String toString(){
        return "Boolean";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    public void promote(Expression expression, CodeGenerator codeGenerator){
        if (!(expression.getType().equals(BooleanType.getInstance()))) {
            super.promote(expression, codeGenerator);
        }
    }

    public char suffix(){
        return 'i';
    }
}
