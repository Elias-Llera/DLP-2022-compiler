package ast.expression;

import ast.expression.value.Variable;
import ast.statement.Statement;

public class FunctionInvocation extends AbstractExpression implements Statement {

    private Variable variable;

    public FunctionInvocation(int line, int column) {
        super(line, column);
    }

    public Variable getVariable(){
        return  variable;
    }

    public void setVariable(Variable variable){
        this.variable = variable;
    }

}
