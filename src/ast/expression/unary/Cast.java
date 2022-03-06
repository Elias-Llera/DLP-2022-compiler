package ast.expression.unary;

import ast.expression.Expression;
import ast.expression.unary.UnaryOperation;
import ast.type.Type;

public class Cast extends UnaryOperation {

    private Type type;

    public Cast(Type type, Expression expression, int line, int column) {
        super(expression, line, column);
        this.type = type;
    }


    private Type getType(){
        return type;
    }

    private void setType(Type type){
        this.type = type;
    }
}
