package ast.type;

import visitor.Visitor;

public class ErrorType extends AbstractType{

    private String message;

    public ErrorType(String message, int line, int column) {
        super(line, column);
        this.message = message;
        ErrorHandler.getInstance().addError(this);
    }

    @Override
    public String toString(){
        return message +" line: " + getLine() + ", column: " + getColumn();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
