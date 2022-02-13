package ast.expression;

import ast.expression.value.Variable;
import ast.statement.Statement;

import java.util.ArrayList;
import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Statement {

    private Variable variable;
    private List<Expression> parameters;

    public FunctionInvocation(int line, int column) {
        super(line, column);
    }

    public Variable getVariable(){
        return  variable;
    }

    public void setVariable(Variable variable){
        this.variable = variable;
    }

    public List<Expression> getParameters(){return new ArrayList<Expression>(parameters);}

    public void addParameter(Expression parameter){
        this.parameters.add(parameter);
    }

}
