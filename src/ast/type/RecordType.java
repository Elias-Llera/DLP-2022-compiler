package ast.type;

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

    private List<RecordField> getFields(){
        return new ArrayList<>(fields);
    }

    public void addField(RecordField field){
        this.fields.add(field);
    }

    @Override
    public String toString(){
        String str = "struct: \n";
        for (RecordField field: fields) {
            str.concat(field.toString() + "\n");
        }
        return str;
    }

}
