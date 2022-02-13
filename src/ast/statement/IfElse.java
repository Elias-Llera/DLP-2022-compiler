package ast.statement;

import ast.definition.AbstractDefinition;
import ast.expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class IfElse extends AbstractStatement {

    private List<Statement> ifBody;
    private List<Statement> elseBody;
    private Expression condition;

    public IfElse(int line, int column) {
        super(line, column);
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public List<Statement> getIfBody() {
        return new ArrayList<Statement>(ifBody);
    }

    public List<Statement> getElseBody() {
        return new ArrayList<Statement>(elseBody);
    }

    public void addStatementToIfBody(Statement statement){
        ifBody.add(statement);
    }

    public void addStatementToElseBody(Statement statement){
        elseBody.add(statement);
    }
}
