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
DECIMAL_PART: NUMBER+[1-9] | '0'
;

fragment
NORMAL_DOUBLE: (('.'INT_CONSTANT) | (INT_CONSTANT'.') | (INT_CONSTANT'.'INT_CONSTANT))
;



DOUBLE_CONSTANT: NORMAL_DOUBLE
;


TRASH: ([ \n\t\r] | ONE_LINE_COMMENT | MULTI_LINE_COMMENT) -> skip;