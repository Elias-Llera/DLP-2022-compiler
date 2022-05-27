grammar Pmm;	

@header{
import ast.*;
import ast.definition.*;
import ast.expression.*;
import ast.expression.binary.*;
import ast.expression.unary.*;
import ast.expression.value.*;
import ast.statement.*;
import ast.type.*;
import errorhandler.*;
import parser.*;
}

program returns [ Program ast ] locals [ List<Definition> definitions = new ArrayList<>() ]:
    (definition { $definitions.addAll($definition.ast); } )* main_definition { $definitions.add($main_definition.ast); } EOF
    {
        $ast = new Program($definitions, 0, 0);
    }
    ;

main_definition returns [ FunctionDefinition ast ] :
    'def' idFunction='main' '(' ')'
    ':'
    {
        FunctionType funcType = new FunctionType(VoidType.getInstance(), $idFunction.getLine(), $idFunction.getCharPositionInLine()+1);
        $ast = new FunctionDefinition($idFunction.text, funcType, $idFunction.getLine(), $idFunction.getCharPositionInLine()+1);
    }
    '{' (variable_definition {$ast.addVariableDefinitions($variable_definition.ast);} )* (statement {$ast.addStatements($statement.ast);} )* '}'
;

definition returns [ List<Definition> ast = new ArrayList<>() ] :
       variable_definition
       {
        $ast.addAll($variable_definition.ast);
       }
     | function_definition
     {
        $ast.add($function_definition.ast);
     }
    ;

variable_definition returns [ List<VarDefinition> ast = new ArrayList<>() ] locals [List<String> names = new ArrayList<>()] :
    id1=ID
    {
        if($names.contains($id1.text))
            new ErrorType("There cannot be two variables with the same name", $id1.getLine(), $id1.getCharPositionInLine()+1);
        $names.add($id1.text);
    }
    (',' id2=ID
    {
        if($names.contains($id2.text))
                new ErrorType("There cannot be two variables with the same name", $id2.getLine(), $id2.getCharPositionInLine()+1);
        $names.add($id2.text);
    })*
    ':' type ';'
    {
        $names.forEach( name-> $ast.add(new VarDefinition(name, $type.ast, $id1.getLine(), $id1.getCharPositionInLine()+1)));
    }
;

function_definition returns [ FunctionDefinition ast ] locals [ List<VarDefinition> paramDefinitions = new ArrayList<>(), Type returnType = VoidType.getInstance() ]:
    'def' idFunction=ID
    '(' (id1=ID ':' t1=built_in_type { $paramDefinitions.add(new VarDefinition($id1.text, $t1.ast, $id1.getLine(), $id1.getCharPositionInLine()+1)); }
    (',' id2=ID ':' t2=built_in_type { $paramDefinitions.add(new VarDefinition($id2.text, $t2.ast, $id2.getLine(), $id2.getCharPositionInLine()+1)); })*)? ')'
    ':' (type { $returnType = $type.ast; } )?
    {
        FunctionType funcType = new FunctionType($returnType, $idFunction.getLine(), $idFunction.getCharPositionInLine()+1);
        $ast = new FunctionDefinition($idFunction.text, funcType, $idFunction.getLine(), $idFunction.getCharPositionInLine()+1);
    }
    '{' (variable_definition {$ast.addVariableDefinitions($variable_definition.ast);} )* (statement {$ast.addStatements($statement.ast);} )* '}'
    {
        $paramDefinitions.forEach(varDef->funcType.addParameter(varDef));
    }
;

statement returns [ List<Statement> ast = new ArrayList<>() ] locals[List<Statement> elseBody = new ArrayList<>()]:
           'print' ex1=expression { $ast.add(new Print($ex1.ast, $ex1.ast.getLine(), $ex1.ast.getColumn())); }
                (',' ex2=expression { $ast.add(new Print($ex2.ast, $ex2.ast.getLine(), $ex2.ast.getColumn())); })* ';'
         | 'input' expression ';'
         {
            $ast.add(new Input($expression.ast, $expression.ast.getLine(), $expression.ast.getColumn()));
         }
         | ex1=expression '=' ex2=expression ';'
         {
            $ast.add(new Assignment($ex1.ast, $ex2.ast, $ex1.ast.getLine(), $ex1.ast.getColumn()));
         }
         | 'if' expression ':' b1=body ('else' b2=body {$elseBody=$b2.ast;})?
         {
            IfElse ifElse = new IfElse($expression.ast, $b1.ast, $elseBody, $expression.ast.getLine(), $expression.ast.getColumn());
            $ast.add(ifElse);
         }
         | 'while' expression ':' body
         {
            $ast.add(new While($expression.ast, $body.ast, $expression.ast.getLine(), $expression.ast.getColumn()));
         }
         | 'return' expression ';'
         {
            $ast.add(new Return($expression.ast, $expression.ast.getLine(), $expression.ast.getColumn()));
         }
         | /* Function invocation**/ ID {
                                    int line, column;
                                    line = $ID.getLine();
                                    column = $ID.getCharPositionInLine()+1;
                                    FunctionInvocation functionInvocation = new FunctionInvocation(
                                                                                new Variable($ID.text, line, column),
                                                                                line, column);
                               }
            '(' (ex1=expression { functionInvocation.addParameter($ex1.ast); }
                (','ex2=expression { functionInvocation.addParameter($ex2.ast); } )*)? ')'';'
            {
                $ast.add(functionInvocation);
            }
         ;

body returns [ List<Statement> ast = new ArrayList<>() ] :
    '{' (statement { $ast.addAll($statement.ast); } )* '}'
    | statement { $ast.addAll($statement.ast); }
    ;

expression returns [ Expression ast ]:
            INT_CONSTANT
            {
                $ast = new IntLiteral(LexerHelper.lexemeToInt($INT_CONSTANT.text),
                    $INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine()+1);
            }
          | CHAR_CONSTANT
            {
                $ast = new CharLiteral(LexerHelper.lexemeToChar($CHAR_CONSTANT.text),
                    $CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine()+1);
            }
          | REAL_CONSTANT
            {
                $ast = new DoubleLiteral(LexerHelper.lexemeToReal($REAL_CONSTANT.text),
                    $REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine()+1);
            }
          | BOOL_CONSTANT
            {
                $ast = new BoolLiteral(LexerHelper.lexemeToBoolean($BOOL_CONSTANT.text),
                    $BOOL_CONSTANT.getLine(), $BOOL_CONSTANT.getCharPositionInLine()+1);
            }
          | ID
            {
                $ast = new Variable($ID.text,
                   $ID.getLine(), $ID.getCharPositionInLine()+1);
            }
          | /* Function invocation**/ ID {
                                    int line, column;
                                    line = $ID.getLine();
                                    column = $ID.getCharPositionInLine()+1;
                                    FunctionInvocation functionInvocation = new FunctionInvocation(
                                                                                new Variable($ID.text, line, column),
                                                                                line, column);
                               }
            '(' (ex1=expression { functionInvocation.addParameter($ex1.ast); }
                (','ex2=expression { functionInvocation.addParameter($ex2.ast); } )*)? ')'
            {
                $ast = functionInvocation;
            }
          | '(' expression ')'
            {
                $ast = $expression.ast;
            }
          | ex1=expression '[' ex2=expression ']'
            {
                $ast = new ArrayAccess($ex1.ast, $ex2.ast,
                    $ex1.ast.getLine(), $ex1.ast.getColumn());
            }
          | ex=expression '.' ID
            {
                $ast = new FieldAccess($ex.ast, $ID.text,
                    $ex.ast.getLine(), $ex.ast.getColumn());
            }
          | '(' built_in_type ')' expression
            {
                $ast = new Cast($built_in_type.ast, $expression.ast,
                    $expression.ast.getLine(), $expression.ast.getColumn());
            }
          | '-' expression
            {
                $ast = new UnaryMinus($expression.ast,
                    $expression.ast.getLine(), $expression.ast.getColumn());
            }
          | '!' expression
            {
                $ast = new Negation($expression.ast,
                    $expression.ast.getLine(), $expression.ast.getColumn());
            }
          | ex1=expression OP=('*' | '/' | '%') ex2=expression
            {
                $ast = new Arithmetic($ex1.ast, $OP.text, $ex2.ast,
                    $ex1.ast.getLine(), $ex1.ast.getColumn());
            }
          | ex1=expression OP=('+' | '-') ex2=expression
            {
                $ast = new Arithmetic($ex1.ast, $OP.text, $ex2.ast,
                    $ex1.ast.getLine(), $ex1.ast.getColumn());
            }
          | ex1=expression OP=('>='| '>' | '<=' | '<' | '!=' | '==') ex2=expression
            {
                $ast = new Comparison($ex1.ast, $OP.text, $ex2.ast,
                    $ex1.ast.getLine(), $ex1.ast.getColumn());
            }
          | ex1=expression OP=('&&' | '||') ex2=expression
            {
                $ast = new Logical($ex1.ast, $OP.text, $ex2.ast,
                    $ex1.ast.getLine(), $ex1.ast.getColumn());
            }
          ;

built_in_type returns [ Type ast ]:
               'char'
                {
                    $ast = CharType.getInstance();
                }
              | 'int'
                {
                    $ast = IntegerType.getInstance();
                }
              | 'double'
                {
                    $ast = DoubleType.getInstance();
                }
              | 'boolean'
                {
                    $ast = BooleanType.getInstance();
                }
              ;

type returns [ Type ast ] locals [List<Token> fieldIds = new ArrayList<>(), List<String> fieldNames = new ArrayList()]:
    built_in_type
    {
        $ast = $built_in_type.ast;
    }
    | lineMarker='[' INT_CONSTANT ']' type
    {
        $ast = new ArrayType(LexerHelper.lexemeToInt($INT_CONSTANT.text), $type.ast,
            $lineMarker.getLine(), $lineMarker.getCharPositionInLine()+1);
    }
    | struct_keyword='struct' { RecordType record = new RecordType($struct_keyword.getLine(), $struct_keyword.getCharPositionInLine()+1); }
        '{'
        (id1=ID
        {
            if($fieldNames.contains($id1.text)){
                new ErrorType("There cannot be two fields with the same name", $id1.getLine(), $id1.getCharPositionInLine()+1);
                ErrorHandler.getInstance().showErrors(System.out);
            }
            $fieldIds.add($id1);
            $fieldNames.add($id1.text);
        }
        (',' id2=ID
        {
            if($fieldNames.contains($id2.text)){
                new ErrorType("There cannot be two fields with the same name", $id2.getLine(), $id2.getCharPositionInLine()+1);
                ErrorHandler.getInstance().showErrors(System.out);
            }
            $fieldIds.add($id2);
            $fieldNames.add($id2.text);
        })*
        ':' type';'
        {
            $fieldIds.forEach(id -> record.addField(new RecordField($type.ast, id.getText(), id.getLine(), id.getCharPositionInLine()+1)));
            $fieldIds = new ArrayList<>();
        }
        )* '}'
        {
            $ast = record;
        }
    ;



fragment
ONE_LINE_COMMENT: '#' .*? '\r'? ('\n'|EOF)
;

fragment
MULTI_LINE_COMMENT: '"''"''"' .*? '"''"''"'
;

fragment
NUMBER: [0-9]
;

fragment
LETTER: [a-zA-Z];

INT_CONSTANT: [1-9]NUMBER* | '0'
;

BOOL_CONSTANT: 'true' | 'false'
;

fragment
DECIMAL_PART: NUMBER*[1-9] | '0'
;

fragment
NORMAL_DOUBLE: ((INT_CONSTANT'.'DECIMAL_PART) | ('.'DECIMAL_PART) | (INT_CONSTANT'.'))
;

fragment
EXPONENT_DOUBLE: (NORMAL_DOUBLE | INT_CONSTANT)('E'|'e')('+'|'-')?(INT_CONSTANT)
;

REAL_CONSTANT: NORMAL_DOUBLE | EXPONENT_DOUBLE
;

fragment
ASCII_CODE: '\\' NUMBER NUMBER NUMBER
;

CHAR_CONSTANT: '\''( . | '\\n' | '\\t' | ASCII_CODE) '\''
;

ID: ('_'|LETTER)('_'|LETTER|NUMBER)*
;

TRASH: ([ \n\t\r] | ONE_LINE_COMMENT | MULTI_LINE_COMMENT) -> skip;