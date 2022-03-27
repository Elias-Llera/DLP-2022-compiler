package visitor;

import ast.AstNode;
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
import ast.statement.Assignment;
import ast.type.ErrorType;

public class TypeCheckingVisitor extends AbstractVisitor<Void, Void> {

    @Override
    public Void visit(UnaryMinus unaryMinus, Void param) {
        unaryMinus.setLvalue(false);
        unaryMinus.getExpression().accept(this, param);
        return null;
    }

    @Override
    public Void visit(Negation negation, Void param){
        negation.setLvalue(false);
        negation.getExpression().accept(this, param);
        return null;
    }

    @Override
    public Void visit(Cast cast, Void param) {
        cast.setLvalue(false);
        cast.getCastType().accept(this, param);
        cast.getExpression().accept(this, param);
        return null;
    }

    @Override
    public Void visit(Arithmetic arithmetic, Void param) {
        arithmetic.setLvalue(false);
        arithmetic.getLeftExpression().accept(this, param);
        arithmetic.getRightExpression().accept(this, param);
        return null;
    }

    @Override
    public Void visit(Logical logical, Void param) {
        logical.setLvalue(false);
        logical.getLeftExpression().accept(this, param);
        logical.getRightExpression().accept(this, param);
        return null;
    }

    @Override
    public Void visit(Comparison comparison, Void param) {
        comparison.setLvalue(false);
        comparison.getLeftExpression().accept(this, param);
        comparison.getRightExpression().accept(this, param);
        return null;
    }

    @Override
    public Void visit(Variable variable, Void param) {
        variable.setLvalue(true);
        return null;
    }

    @Override
    public Void visit(IntLiteral intLiteral, Void param) {
        intLiteral.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(DoubleLiteral doubleLiteral, Void param) {
        doubleLiteral.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(CharLiteral charLiteral, Void param) {
        charLiteral.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(FieldAccess fieldAccess, Void param) {
        fieldAccess.setLvalue(true);
        fieldAccess.getExpression().accept(this, param);
        return null;
    }

    @Override
    public Void visit(ArrayAccess arrayAccess, Void param) {
        arrayAccess.setLvalue(true);
        arrayAccess.getLeftExpression().accept(this, param);
        arrayAccess.getRightExpression().accept(this, param);
        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param) {
        functionInvocation.setLvalue(false);
        functionInvocation.getVariable().accept(this, param);
        for (AstNode astNode : functionInvocation.getParameters()){
            astNode.accept(this, param);
        }
        return null;
    }

    @Override
    public Void visit(Assignment assignment, Void param) {
        assignment.getLeftSideExpression().accept(this, param);
        assignment.getLeftSideExpression().accept(this, param);
        if(!assignment.getLeftSideExpression().getLvalue()){
            new ErrorType("Not valid expression on the left side of the assignment.",
                    assignment.getLine(), assignment.getColumn());
        }
        return null;
    }

}
