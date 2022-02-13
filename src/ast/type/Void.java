package ast.type;

public class Void extends AbstractType{

    private static Void instance;

    private Void(){
        super(0,0);
    }

    public static Void getInstance(){
        if(instance == null){
            instance = new Void();
        }
        return instance;
    }

}
