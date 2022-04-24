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
import ast.expression.value.CharLiteral;
import ast.expression.value.DoubleLiteral;
import ast.expression.value.IntLiteral;
import ast.expression.value.Variable;
import ast.statement.*;
import ast.type.*;
import semantic.Visitor;

public class AbstractCGVisitor implements Visitor<Void, Void> {

    CodeGenerator codeGenerator;

    public AbstractCGVisitor(CodeGenerator codeGenerator){
        this.codeGenerator = codeGenerator;
    }

    @Override
    public Void visit(Program program, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(FunctionDefinition functionDefinition, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(VarDefinition variableDefinition, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(Print print, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(Input input, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(Return returnSt, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(While whileSt, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(IfElse ifElse, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(Assignment assignment, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(UnaryMinus unaryMinus, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(Negation negation, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(Cast cast, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(Arithmetic arithmetic, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(Logical logical, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(Comparison comparison, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(Variable variable, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(IntLiteral intLiteral, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(DoubleLiteral doubleLiteral, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(CharLiteral charLiteral, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(FieldAccess fieldAccess, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(ArrayAccess arrayAccess, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(FunctionType functionType, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(CharType charType, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(DoubleType doubleType, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(IntegerType integerType, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(RecordType recordType, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(ArrayType arrayType, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(VoidType voidType, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(RecordField recordField, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

    @Override
    public Void visit(ErrorType errorType, Void param) {
        throw new IllegalStateException("Cannot call " + this.getClass().getName() + " for this class.");
    }

}
