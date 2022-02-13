package ast.expression.unary;

import ast.type.Type;

public class Cast extends UnaryOperation{

    private Type type;

    public Cast(int line, int column) {
        super(line, column);
    }

    private Type getType(){
        return type;
    }

    private void setType(Type type){
        this.type = type;
    }
}
