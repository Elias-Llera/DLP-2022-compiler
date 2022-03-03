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
import parser.*;
}

/*program: (variable_definition | funtion_definition)* funtion_definition EOF
       ;
 */

program returns [AstNode ast]:
    expression{ $ast = $expression.ast; }
    ;

variable_definition: ID (',' ID)* ':' type ';'
;

funtion_definition: 'def' ID '(' (ID ':' built_in_type (',' ID ':' built_in_type)*)? ')' ':' type? '{' variable_definition* statement* '}'
;

statement: 'print' expression (',' expression)* ';'
         | 'input' expression ';'
         | expression '=' expression ';'
         | 'if' expression ':' body? ('else' body?)?
         | 'while' expression ':' body?
         | 'return' expression ';'
         | /* Function|procedure **/ ID '(' (expression (','expression)*)? ')' ';'
         ;

body: '{' statement* '}'
    | statement
    ;

expression returns [ Expression ast ] :
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
          | ID
            {
             $ast = new Variable($ID.text,
                $ID.getLine(), $ID.getCharPositionInLine()+1);
            }
          | /* Function **/ ID '(' (expression (','expression)*)? ')'
          | '(' expression ')'
            {
                $ast = $expression.ast;
            }
          | ex1=expression '[' ex2=expression ']'
            {
                $ast = new ArrayAccess($ex1.ast, $ex2.ast,
                    $ex1.ast.getLine(), $ex1.ast.getColumn());
            }
          | expression '.' ID
            {
                $ast = new FieldAccess($expression.ast, $ID.text,
                    $expression.ast.getLine(), $expression.ast.getColumn());
            }
          | '(' built_in_type ')' expression
          | '-' expression
          | '!' expression
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
                $ast = new Comparisson($ex1.ast, $OP.text, $ex2.ast,
                    $ex1.ast.getLine(), $ex1.ast.getColumn());
            }
          | ex1=expression OP=('&&' | '||') ex2=expression
            {
                $ast = new Logical($ex1.ast, $OP.text, $ex2.ast,
                    $ex1.ast.getLine(), $ex1.ast.getColumn());
            }
          ;

built_in_type : 'char'
              | 'int'
              | 'double'
              ;

type: built_in_type
    | '[' INT_CONSTANT ']' type
    | 'struct' '{' (ID':' type';')* '}'
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