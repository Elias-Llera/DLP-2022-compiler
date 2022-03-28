package ast;

public abstract class AbstractAstNode implements AstNode{

    private int line;
    private int column;

    public AbstractAstNode(int line, int column){
        this.line = line;
        this.column = column;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

}