package codegenerator;

import ast.Program;
import ast.definition.FunctionDefinition;
import ast.definition.VarDefinition;
import ast.expression.ArrayAccess;
import ast.expression.FieldAccess;
import ast.expression.FunctionInvocation;
import ast.expression.binary.Arithmetic;
import ast.expression.binary.Comparison;
import ast.expression.binary.Logical;
import ast.expression.unary.Cast;
import ast.expression.unary.Negation;
import ast.expression.unary.UnaryMinus;
import ast.expression.value.*;
import ast.statement.*;
import ast.type.*;
import semantic.Visitor;

public abstract class AbstractCGVisitor<TP> implements Visitor<TP, Void> {

    CodeGenerator codeGenerator;

    public AbstractCGVisitor(CodeGenerator codeGenerator){
        this.codeGenerator = codeGenerator;
    }

    @Override
    public Void visit(Program program, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(FunctionDefinition functionDefinition, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(VarDefinition variableDefinition, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(Print print, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(Input input, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(Return returnSt, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(While whileSt, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(IfElse ifElse, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(Assignment assignment, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(UnaryMinus unaryMinus, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(Negation negation, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(Cast cast, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(Arithmetic arithmetic, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(Logical logical, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(Comparison comparison, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(Variable variable, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(IntLiteral intLiteral, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(DoubleLiteral doubleLiteral, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(CharLiteral charLiteral, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(BoolLiteral boolLiteral, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(FieldAccess fieldAccess, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(ArrayAccess arrayAccess, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(FunctionType functionType, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(CharType charType, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(DoubleType doubleType, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(IntegerType integerType, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(BooleanType booleanType, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(RecordType recordType, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(ArrayType arrayType, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(VoidType voidType, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(RecordField recordField, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(ErrorType errorType, TP param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

}
