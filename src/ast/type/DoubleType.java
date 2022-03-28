package ast.type;

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
    public String toString(){
        return "Double";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
