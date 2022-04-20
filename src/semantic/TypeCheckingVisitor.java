package semantic;

import ast.AstNode;
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

import java.util.stream.Collectors;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Void> {

    //Expressions
    @Override
    public Void visit(UnaryMinus unaryMinus, Type param) {
        unaryMinus.setLvalue(false);
        unaryMinus.getExpression().accept(this, param);

        unaryMinus.setType(unaryMinus.getExpression().getType().arithmetic(unaryMinus));
        return null;
    }

    @Override
    public Void visit(Negation negation, Type param){
        negation.setLvalue(false);
        negation.getExpression().accept(this, param);

        negation.setType(negation.getExpression().getType().logical(negation));
        return null;
    }

    @Override
    public Void visit(Cast cast, Type param) {
        cast.setLvalue(false);
        cast.getCastType().accept(this, param);
        cast.getExpression().accept(this, param);

        cast.setType(cast.getExpression().getType().canBeCast(cast.getCastType(), cast));
        return null;
    }

    @Override
    public Void visit(Arithmetic arithmetic, Type param) {
        arithmetic.setLvalue(false);
        arithmetic.getLeftExpression().accept(this, param);
        arithmetic.getRightExpression().accept(this, param);

        arithmetic.setType(arithmetic.getLeftExpression().getType().arithmetic(arithmetic.getRightExpression().getType(), arithmetic));
        return null;
    }

    @Override
    public Void visit(Logical logical, Type param) {
        logical.setLvalue(false);
        logical.getLeftExpression().accept(this, param);
        logical.getRightExpression().accept(this, param);

        logical.setType(logical.getLeftExpression().getType().logical(logical.getRightExpression().getType(), logical));
        return null;
    }

    @Override
    public Void visit(Comparison comparison, Type param) {
        comparison.setLvalue(false);
        comparison.getLeftExpression().accept(this, param);
        comparison.getRightExpression().accept(this, param);

        comparison.setType(comparison.getLeftExpression().getType().comparison(comparison.getRightExpression().getType(), comparison));
        return null;
    }

    @Override
    public Void visit(Variable variable, Type param) {
        variable.setLvalue(true);

        variable.setType(variable.getDefinition().getType());
        return null;
    }

    @Override
    public Void visit(IntLiteral intLiteral, Type param) {
        intLiteral.setLvalue(false);

        intLiteral.setType(IntegerType.getInstance());
        return null;
    }

    @Override
    public Void visit(DoubleLiteral doubleLiteral, Type param) {
        doubleLiteral.setLvalue(false);
        doubleLiteral.setType(DoubleType.getInstance());
        return null;
    }

    @Override
    public Void visit(CharLiteral charLiteral, Type param) {
        charLiteral.setLvalue(false);
        charLiteral.setType(CharType.getInstance());
        return null;
    }

    @Override
    public Void visit(FieldAccess fieldAccess, Type param) {
        super.visit(fieldAccess, param);

        fieldAccess.setLvalue(true);

        fieldAccess.setType(fieldAccess.getExpression().getType().dot(fieldAccess.getFieldName(), fieldAccess));
        return null;
    }

    @Override
    public Void visit(ArrayAccess arrayAccess, Type param) {
        super.visit(arrayAccess, param);

        arrayAccess.setLvalue(true);

        arrayAccess.setType(arrayAccess.getLeftExpression().getType().squareBrackets(arrayAccess.getRightExpression().getType(), arrayAccess));

        return null;
    }

    //Function

    @Override
    public Void visit(FunctionDefinition functionDefinition, Type param) {
        functionDefinition.getType().accept(this,param);
        for (AstNode astNode : functionDefinition.getFunctionVariables()) {
            astNode.accept(this, param);
        }

        Type returnType = ((FunctionType)functionDefinition.getType()).getReturnType();
        boolean hasReturn = false;
        for (Statement statement : functionDefinition.getFunctionStatements()){
            statement.accept(this, returnType);

            if (statement instanceof Return)
                hasReturn = true;
        }

        if (!hasReturn && !(((FunctionType)functionDefinition.getType()).getReturnType() instanceof VoidType))
            new ErrorType("Expected return statement of type " + ((FunctionType)functionDefinition.getType()).getReturnType(),
                    functionDefinition.getLine(), functionDefinition.getColumn());


        return null;
    }

    @Override
    public Void visit(FunctionType functionType, Type param) {
        if(!functionType.getReturnType().isBuiltIn())
            functionType.setReturnType(new ErrorType("The return type must be built in.",
                    functionType.getLine(), functionType.getColumn()));

        for (VarDefinition parameter : functionType.getParameters())
            if (!parameter.getType().isBuiltIn())
                parameter.setType(new ErrorType("The parameter must be of a built in type.",
                        parameter.getLine(), parameter.getColumn()));

        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, Type param) {
        super.visit(functionInvocation, param);

        functionInvocation.setLvalue(false);

        functionInvocation.setType(functionInvocation.getVariable().getDefinition().getType().parenthesis(
                functionInvocation.getParameters().stream().map(e-> e.getType()).collect(Collectors.toList()), functionInvocation));

        return null;
    }


    //Statements
    @Override
    public Void visit(Assignment assignment, Type param) {
        super.visit(assignment, param);

        if(!assignment.getLeftSideExpression().getLvalue()){
            new ErrorType("Cannot write on a non l-value expression.",
                    assignment.getLine(), assignment.getColumn());
        }

        assignment.getRightSideExpression().getType().promotesTo(assignment.getLeftSideExpression().getType(), assignment);

        return null;
    }

    @Override
    public Void visit(Return returnStatement, Type param) {
        super.visit(returnStatement, param);

        if (param instanceof VoidType){
            returnStatement.getExpression().setType(new ErrorType("This function cannot have a return statement.",
                    returnStatement.getLine(), returnStatement.getColumn()));
        }

        if (returnStatement.getExpression().getType().promotesTo(param, returnStatement) == null)
            returnStatement.getExpression().setType(new ErrorType("Expected return with type "+ param
                    ,returnStatement.getLine(), returnStatement.getColumn()));

        return null;
    }

    @Override
    public Void visit(IfElse ifElse, Type param) {
        super.visit(ifElse, param);

        if (!ifElse.getCondition().getType().isLogical())
            ifElse.getCondition().setType(new ErrorType("Expected logical expression as a condition, got " + ifElse.getCondition().getType(),
                    ifElse.getCondition().getLine(), ifElse.getCondition().getColumn()));

        return null;
    }

    @Override
    public Void visit(While whileStatement, Type param) {
        super.visit(whileStatement, param);

        if (!whileStatement.getCondition().getType().isLogical())
            whileStatement.getCondition().setType(new ErrorType("Expected logical expression as a condition, got " + whileStatement.getCondition().getType(),
                    whileStatement.getCondition().getLine(), whileStatement.getCondition().getColumn()));

        return null;
    }

    @Override
    public Void visit(Input input, Type param) {
        super.visit(input, param);

            if (!input.getExpression().getLvalue())
                new ErrorType("Cannot write on a non l-value expression.", input.getLine(),input.getColumn());

        return null;
    }
}
