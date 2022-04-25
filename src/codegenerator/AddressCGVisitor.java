package codegenerator;

import ast.definition.VarDefinition;
import ast.expression.ArrayAccess;
import ast.expression.FieldAccess;
import ast.expression.value.Variable;
import ast.type.IntegerType;
import ast.type.RecordField;
import ast.type.RecordType;


public class AddressCGVisitor extends AbstractCGVisitor{

    public ValueCGVisitor valueCGVisitor;

    public AddressCGVisitor(CodeGenerator codeGenerator, ValueCGVisitor valueCGVisitor) {
        super(codeGenerator);
        this.valueCGVisitor = valueCGVisitor;
    }

    /**
     * address[[Variable : expression -> ID]]()=
     *      if (expression.definition.scope == 0)
     *          <pusha> expression.definition.offset
     *      else {
     *          <push bp>
     *          <push> expression.definition.offset
     *          <add>
     *      }
     */
    @Override
    public Void visit(Variable variable, Void param){
        VarDefinition definition = ((VarDefinition)variable.getDefinition());
        if (definition.getScope() == 0){
            codeGenerator.pusha(definition.getOffset());
        } else {
            codeGenerator.pushBP();
            codeGenerator.push(definition.getOffset());
            codeGenerator.add(IntegerType.getInstance());
        }
        return null;
    }

    /**
     * address[[ArrayAccess : expression1 -> expression2 "[" expression3 "]"]]()=
     *      address[[expression2]]()
     *      value[[expression3]]()
     *      <pushi> expression2.type.numberOfBytes
     *      <muli>
     *      <addi>
     */
    @Override
    public Void visit(ArrayAccess arrayAccess, Void param){
        arrayAccess.getLeftExpression().accept(this,null);
        arrayAccess.getRightExpression().accept(this.valueCGVisitor, null);

        codeGenerator.push(arrayAccess.getLeftExpression().getType().numberOfBytes());
        codeGenerator.mul(IntegerType.getInstance());
        codeGenerator.add(IntegerType.getInstance());

        return null;
    }

    /**
     * address[[FieldAccess : expression1 -> expression2 "." ID]]()=
     *      address[[expression2]]()
     *      for (RecordField field : expression2.type.fields)
     *          if (field.name.equals(ID)){
     *              <pushi> field.offset
     *              <addi>
     *          }
     */
    @Override
    public Void visit(FieldAccess fieldAccess, Void param){
        fieldAccess.getExpression().accept(this,null);

        for (RecordField recordField : ((RecordType)fieldAccess.getExpression().getType()).getFields()){
            if (recordField.getName().equals(fieldAccess.getFieldName())) {
                codeGenerator.push(recordField.getOffset());
                codeGenerator.add(IntegerType.getInstance());
            }
        }

        return null;
    }

}
