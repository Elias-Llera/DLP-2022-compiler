package ast.expression;

public class FieldAccess extends AbstractExpression{

    private Expression expression;
    private String fieldName;

    public FieldAccess(Expression expression, String fieldName, int line, int column) {
        super(line, column);
        this.expression = expression;
        this.fieldName = fieldName;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
