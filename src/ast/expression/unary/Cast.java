package ast.expression.unary;

import ast.expression.Expression;
import ast.type.Type;

public class Cast extends UnaryOperation {

    private Type castType;

    public Cast(Type type, Expression expression, int line, int column) {
        super(expression, line, column);
        this.castType = type;
    }

    private Type getCastType(){
        return castType;
    }

    private void setCastType(Type castType){
        this.castType = castType;
    }

    @Override
    public String toString(){
        return "(" + castType.toString() + ")" + getExpression().toString();
    }

}
