package ast.type;

import ast.definition.VariableDefinition;
import visitor.Visitor;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

public class FunctionType extends AbstractType {

    private List<VariableDefinition> parameters;
    private Type returnType;

    public FunctionType(List<VariableDefinition> parameters, Type type, int line, int column) {
        super(line, column);
        this.parameters = parameters;
        this.returnType = type;
    }

    public FunctionType(Type type, int line, int column) {
        super(line, column);
        this.parameters = new ArrayList<>();
        this.returnType = type;
    }

    public List<VariableDefinition> getParameters() {
        return new ArrayList<>(parameters);
    }

    public void addParameter(VariableDefinition parameter) {
        this.parameters.add(parameter);
    }

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    @Override
    public String toString(){
        String str = returnType.toString() + "(";
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
