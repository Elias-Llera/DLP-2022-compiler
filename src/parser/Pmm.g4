grammar Pmm;	

program: 
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