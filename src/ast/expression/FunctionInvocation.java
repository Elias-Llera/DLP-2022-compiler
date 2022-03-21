package ast.expression;

import ast.AbstractAstNode;
import ast.expression.value.Variable;
import ast.statement.Statement;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionInvocation extends AbstractAstNode implements Expression, Statement {

    private Variable variable;
    private List<Expression> parameters;

    public FunctionInvocation(Variable variable, List<Expression> parameters, int line, int column) {
        super(line, column);
        this.variable = variable;
        this.parameters = new ArrayList<>(parameters);
    }

    public FunctionInvocation(Variable variable, int line, int column) {
        super(line, column);
        this.variable = variable;
        this.parameters = new ArrayList<>();
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

    @Override
    public String toString(){
        String str = variable.toString() + "(";
        if(!parameters.isEmpty()){
            str.concat(parameters.get(0).toString());
            if(parameters.size()>1){
                for (int i = 1; i<parameters.size(); i++){
                    str.concat("," + parameters.get(i).toString());
                }
            }
        }
        str.concat(")");
        return str;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
