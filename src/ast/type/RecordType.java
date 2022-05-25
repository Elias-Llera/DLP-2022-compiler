package ast.type;

import ast.AstNode;
import semantic.Visitor;

import java.util.ArrayList;
import java.util.List;

public class RecordType extends AbstractType{

    private List<RecordField> fields;

    public RecordType(List<RecordField> recordFields, int line, int column) {
        super(line, column);
        this.fields = recordFields;
    }

    public RecordType(int line, int column) {
        super(line, column);
        this.fields = new ArrayList<>();
    }

    public List<RecordField> getFields(){
        return new ArrayList<>(fields);
    }

    public void addField(RecordField field){
        this.fields.add(field);
    }

    @Override
    public Type dot(String fieldName, AstNode node) {
        for (RecordField field : fields) {
            if (field.getName().equals(fieldName))
                return field.getType();
        }
        return new ErrorType("The field " + fieldName + " does not exist.", node.getLine(),node.getColumn());
    }

    @Override
    public Type promotesTo(Type otherType, AstNode node) {
        if (otherType instanceof ErrorType || otherType instanceof RecordType)
            return otherType;
        else
            return super.promotesTo(otherType, node);
    }

    @Override
    public int numberOfBytes(){
        int numberOfBytes = 0;
        for(RecordField field : fields){
            numberOfBytes += field.getType().numberOfBytes();
        }
        return numberOfBytes;
    }

    @Override
    public String toString(){
         return "struct";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

}
