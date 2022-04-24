package codegenerator;


import ast.expression.ArrayAccess;
import ast.expression.FieldAccess;
import ast.expression.binary.Arithmetic;
import ast.expression.binary.Comparison;
import ast.expression.binary.Logical;
import ast.expression.unary.Cast;
import ast.expression.unary.Negation;
import ast.expression.unary.UnaryMinus;
import ast.expression.value.CharLiteral;
import ast.expression.value.DoubleLiteral;
import ast.expression.value.IntLiteral;
import ast.expression.value.Variable;
import ast.type.*;

public class ValueCGVisitor extends AbstractCGVisitor{

    private AddressCGVisitor addressCGVisitor;

    public ValueCGVisitor(CodeGenerator codeGenerator) {
        super(codeGenerator);
        this.addressCGVisitor = new AddressCGVisitor(codeGenerator, this);
    }

    @Override
    public Void visit (Arithmetic arithmetic, Void param){
        arithmetic.getLeftExpression().accept(this, null);
        arithmetic.getType().promote(arithmetic.getLeftExpression(), codeGenerator);
        arithmetic.getRightExpression().accept(this, null);
        arithmetic.getType().promote(arithmetic.getRightExpression(), codeGenerator);

        switch (arithmetic.getOperator()){
            case "+":
                codeGenerator.add(arithmetic.getType());
                break;
            case "-":
                codeGenerator.sub(arithmetic.getType());
                break;
            case "*":
                codeGenerator.mul(arithmetic.getType());
                break;
            case "/":
                codeGenerator.div(arithmetic.getType());
                break;
            case "%":
                codeGenerator.mod(arithmetic.getType());
                break;
        }

        return null;
    }

    @Override
    public Void visit (Logical logical, Void param){
        logical.getLeftExpression().accept(this,null);
        logical.getLeftExpression().accept(this,null);

        switch (logical.getOperator()){
            case "&&":
                codeGenerator.and();
                break;
            case "||":
                codeGenerator.or();
                break;
        }

        return null;
    }

    @Override
    public Void visit (Comparison comparison, Void param){
        Type comparisonType = comparison.getRightExpression().getType();

        // Left operand type has preference
        if(comparison.getRightExpression().getType().promotesTo(comparison.getLeftExpression().getType(), comparison)
                instanceof ErrorType){
            comparisonType = comparison.getLeftExpression().getType();
        }

        comparison.getLeftExpression().accept(this,null);
        comparisonType.promote(comparison.getRightExpression(), codeGenerator);

        comparison.getRightExpression().accept(this,null);
        comparisonType.promote(comparison.getLeftExpression(), codeGenerator);

        switch (comparison.getOperator()){
            case ">":
                codeGenerator.gt(comparisonType);
                break;
            case "<":
                codeGenerator.lt(comparisonType);
                break;
            case ">=":
                codeGenerator.ge(comparisonType);
                break;
            case "<=":
                codeGenerator.le(comparisonType);
                break;
            case "==":
                codeGenerator.eq(comparisonType);
                break;
            case "!=":
                codeGenerator.ne(comparisonType);
                break;
        }

        return null;
    }

    @Override
    public Void visit (Cast cast, Void param){
        cast.getExpression().accept(this,null);
        cast.getCastType().promote(cast.getExpression(), codeGenerator);
        return null;
    }

    @Override
    public Void visit (Negation negation, Void param){
        negation.getExpression().accept(this, null);
        codeGenerator.not();
        return null;
    }

    @Override
    public Void visit (UnaryMinus unaryMinus, Void param){
        codeGenerator.push(0);
        unaryMinus.getExpression().accept(this, null);
        codeGenerator.sub(unaryMinus.getType());

        return null;
    }

    @Override
    public Void visit (Variable variable, Void param){
        variable.accept(this.addressCGVisitor, null);
        codeGenerator.load(variable.getDefinition().getType());
        return null;
    }

    @Override
    public Void visit (IntLiteral intLiteral, Void param){
        codeGenerator.push(intLiteral.getValue());
        return null;
    }

    @Override
    public Void visit (DoubleLiteral doubleLiteral, Void param){
        codeGenerator.push(doubleLiteral.getValue());
        return null;
    }

    @Override
    public Void visit (CharLiteral charLiteral, Void param){
        codeGenerator.push(charLiteral.getValue());
        return null;
    }

    @Override
    public Void visit (ArrayAccess arrayAccess, Void param){
        arrayAccess.accept(this.addressCGVisitor, null);

        codeGenerator.load(((ArrayType)arrayAccess.getLeftExpression().getType()).getOfType());

        return null;
    }

    @Override
    public Void visit (FieldAccess fieldAccess, Void param){
        fieldAccess.accept(this.addressCGVisitor, null);

        for (RecordField recordField : ((RecordType)fieldAccess.getExpression().getType()).getFields())
            if (recordField.getName().equals(fieldAccess.getFieldName()))
                codeGenerator.load(recordField.getType());

        return null;
    }

}
