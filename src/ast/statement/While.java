package ast.statement;

import ast.expression.AbstractExpression;
import ast.expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class While extends AbstractStatement {

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

    @Override
    public String toString(){
        String str = "While " + condition.toString() + " : \n";
        for (Statement stmnt: body) {
            str.concat(stmnt.toString() + "\n");
        }
        return str;
    }
}
