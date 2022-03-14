package ast.type;

public class ErrorType extends AbstractType{

    private String message;

    public ErrorType(String message, int line, int column) {
        super(line, column);
        this.message = message;
    }

    @Override
    public String toString(){
        return message +" line: " + getLine() + ", column: " + getColumn();
    }
}
