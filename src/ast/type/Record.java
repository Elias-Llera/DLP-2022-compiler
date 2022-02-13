package ast.type;

import java.util.ArrayList;
import java.util.List;

public class Record extends AbstractType{

    private List<RecordField> fields;

    public Record(int line, int column) {
        super(line, column);
    }

    private List<RecordField> getFields(){
        return new ArrayList<>(fields);
    }

    private void addField(RecordField field){
        this.fields.add(field);
    }

}
