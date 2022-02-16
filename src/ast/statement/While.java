package ast.statement;

import ast.expression.AbstractExpression;
import ast.expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class While extends AbstractExpression {

    private Expression condition;
    private List<Statement> body;

    public While(Expression condition, List<Statement> body, int line, int column) {
        super(line, column);
        this.condition = condition;
        this.body = body;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public List<Statement> getBody() {
        return new ArrayList<>(body);
    }

    public void addStatementToBody(Statement statement) {
        this.body.add(statement);
    }
}
