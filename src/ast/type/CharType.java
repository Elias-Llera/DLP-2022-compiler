package ast.type;

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
    public String toString(){
        return "Char";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
