package visitor;

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

public interface Visitor<TP, TR> {

    // Program
    TR visit(Program program, TP param);

    // Definitions
    TR visit(FunctionDefinition functionDefinition, TP param);
    TR visit(VariableDefinition variableDefinition, TP param);

    // Statement
    TR visit(Print print, TP param);
    TR visit(Input input, TP param);
    TR visit(Return returnSt, TP param);
    TR visit(While whileSt, TP param);
    TR visit(IfElse ifElse, TP param);
    TR visit(Assignment assignment, TP param);

    // Expresion
    TR visit(UnaryMinus unaryMinus, TP param);
    TR visit(Negation negation, TP param);
    TR visit(Cast cast, TP param);
    TR visit(Arithmetic arithmetic, TP param);
    TR visit(Logical logical, TP param);
    TR visit(Comparison comparison, TP param);
    TR visit(Variable variable, TP param);
    TR visit(IntLiteral intLiteral, TP param);
    TR visit(DoubleLiteral doubleLiteral, TP param);
    TR visit(CharLiteral charLiteral, TP param);
    TR visit(FieldAccess fieldAccess, TP param);
    TR visit(ArrayAccess arrayAccess, TP param);
    TR visit(FunctionInvocation functionInvocation, TP param);

    // Type
    TR visit(FunctionType functionType, TP param);
    TR visit(CharType charType, TP param);
    TR visit(DoubleType doubleType, TP param);
    TR visit(IntegerType integerType, TP param);
    TR visit(RecordType recordType, TP param);
    TR visit(ArrayType arrayType, TP param);
    TR visit(VoidType voidType, TP param);
    TR visit(RecordField recordField, TP param);
    TR visit(ErrorType errorType, TP param);

}
