package ast.expression.unary;

import ast.expression.Expression;
import ast.type.Type;
import semantic.Visitor;

public class Cast extends UnaryOperation {

    private Type castType;

    public Cast(Type type, Expression expression, int line, int column) {
        super(expression, line, column);
        this.castType = type;
    }

    public Type getCastType(){
        return castType;
    }

    private void setCastType(Type castType){
        this.castType = castType;
    }

    @Override
    public String toString(){
        return "(" + castType.toString() + ")" + getExpression().toString();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
