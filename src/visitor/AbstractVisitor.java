package visitor;

import ast.AstNode;
import ast.Program;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.expression.ArrayAccess;
import ast.expression.FieldAccess;
import ast.expression.FunctionInvocation;
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
import ast.statement.*;
import ast.type.*;

public abstract class AbstractVisitor<TP, TR> implements Visitor<TP, TR> {

    @Override
    public TR visit(Program program, TP param) {
        for (AstNode astNode : program.getProgram()) {
            astNode.accept(this, param);
        }
        return null;
    }

    @Override
    public TR visit(FunctionDefinition functionDefinition, TP param) {
        functionDefinition.getType().accept(this, param);
        for (AstNode astNode : functionDefinition.getFunctionVariables()) {
            astNode.accept(this, param);
        }
        for (AstNode astNode : functionDefinition.getFunctionStatements()) {
            astNode.accept(this, param);
        }
        return null;
    }

    @Override
    public TR visit(VariableDefinition variableDefinition, TP param) {
        variableDefinition.getType().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Print print, TP param) {
        print.getExpression().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Input input, TP param) {
        input.getExpression().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Return returnSt, TP param) {
        returnSt.getExpression().accept(this, param);
        return null;
    }

    @Override
    public TR visit(While whileSt, TP param) {
        whileSt.getCondition().accept(this, param);
        for (AstNode astNode : whileSt.getBody()) {
            astNode.accept(this, param);
        }
        return null;
    }

    @Override
    public TR visit(IfElse ifElse, TP param) {
        ifElse.getCondition().accept(this, param);
        for (AstNode astNode : ifElse.getIfBody()) {
            astNode.accept(this, param);
        }
        for (AstNode astNode : ifElse.getElseBody()) {
            astNode.accept(this, param);
        }
        return null;
    }

    @Override
    public TR visit(Assignment assignment, TP param) {
        assignment.getLeftSideExpression().accept(this, param);
        assignment.getRightSideExpression().accept(this, param);
        return null;
    }

    @Override
    public TR visit(UnaryMinus unaryMinus, TP param) {
        unaryMinus.getExpression().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Negation negation, TP param){
        negation.getExpression().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Cast cast, TP param) {
        cast.getCastType().accept(this, param);
        cast.getExpression().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Arithmetic arithmetic, TP param) {
        arithmetic.getLeftExpression().accept(this, param);
        arithmetic.getRightExpression().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Logical logical, TP param) {
        logical.getLeftExpression().accept(this, param);
        logical.getRightExpression().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Comparison comparison, TP param) {
        comparison.getLeftExpression().accept(this, param);
        comparison.getRightExpression().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Variable variable, TP param) {
        return null;
    }

    @Override
    public TR visit(IntLiteral intLiteral, TP param) {
        return null;
    }

    @Override
    public TR visit(DoubleLiteral doubleLiteral, TP param) {
        return null;
    }

    @Override
    public TR visit(CharLiteral charLiteral, TP param) {
        return null;
    }

    @Override
    public TR visit(FieldAccess fieldAccess, TP param) {
        fieldAccess.getExpression().accept(this, param);
        return null;
    }

    @Override
    public TR visit(ArrayAccess arrayAccess, TP param) {
        arrayAccess.getLeftExpression().accept(this, param);
        arrayAccess.getRightExpression().accept(this, param);
        return null;
    }

    @Override
    public TR visit(FunctionInvocation functionInvocation, TP param) {
        functionInvocation.getVariable().accept(this, param);
        for (AstNode astNode : functionInvocation.getParameters()){
            astNode.accept(this, param);
        }
        return null;
    }

    @Override
    public TR visit(FunctionType functionType, TP param) {
        functionType.getReturnType().accept(this, param);
        for (AstNode astNode : functionType.getParameters()){
            astNode.accept(this, param);
        }
        return null;
    }

    @Override
    public TR visit(CharType charType, TP param) {
        return null;
    }

    @Override
    public TR visit(DoubleType doubleType, TP param) {
        return null;
    }

    @Override
    public TR visit(IntegerType integerType, TP param) {
        return null;
    }

    @Override
    public TR visit(RecordType recordType, TP param) {
        for (AstNode astNode : recordType.getFields()){
            astNode.accept(this, param);
        }
        return null;
    }

    @Override
    public TR visit(ArrayType arrayType, TP param) {
        arrayType.getOfType().accept(this, param);
        return null;
    }

    @Override
    public TR visit(VoidType voidType, TP param) {
        return null;
    }

    @Override
    public TR visit(RecordField recordField, TP param) {
        recordField.getType().accept(this, param);
        return null;
    }

    @Override
    public TR visit(ErrorType errorType, TP param) {
        return null;
    }
}
