package ast.type;

import ast.definition.VariableDefinition;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

public class FunctionType extends AbstractType{

    private List<VariableDefinition> parameters;
    private Type returnType;

    public FunctionType(int line, int column) {
        super(line, column);
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
}
