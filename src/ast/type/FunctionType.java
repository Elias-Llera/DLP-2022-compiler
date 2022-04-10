package ast.type;

import ast.AstNode;
import ast.definition.VarDefinition;
import semantic.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionType extends AbstractType {

    private List<VarDefinition> parameters;
    private Type returnType;

    public FunctionType(List<VarDefinition> parameters, Type type, int line, int column) {
        super(line, column);
        this.parameters = parameters;
        this.returnType = type;
    }

    public FunctionType(Type type, int line, int column) {
        super(line, column);
        this.parameters = new ArrayList<>();
        this.returnType = type;
    }

    public List<VarDefinition> getParameters() {
        return new ArrayList<>(parameters);
    }

    public void addParameter(VarDefinition parameter) {
        this.parameters.add(parameter);
    }

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    @Override
    public Type parenthesis(List<Type> paramsTypes, AstNode node) {
        if (paramsTypes.size() != parameters.size())
            return new ErrorType("The number of parameters is not correct.", node.getLine(),node.getColumn());

        for (int i = 0; i < parameters.size(); i++) {
            paramsTypes.get(i).promotesTo(parameters.get(i).getType(), paramsTypes.get(i));
        }

        return returnType;
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
