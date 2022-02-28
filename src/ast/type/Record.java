package ast.type;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Record extends AbstractType{

    private List<RecordField> fields;

    public Record(List<RecordField> recordFields, int line, int column) {
        super(line, column);
        this.fields = recordFields;
    }

    private List<RecordField> getFields(){
        return new ArrayList<>(fields);
    }

    private void addField(RecordField field){
        this.fields.add(field);
    }

}
