package ast.type;

import visitor.Visitor;

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
    public String toString(){
        return "Integer";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
