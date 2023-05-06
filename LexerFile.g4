lexer grammar LexerFile;


//------------------- WIDGETS --------------------
SCAFFOLD: 'Scaffold' ;
CONTAINER: 'Container' ;

//-------------------- UTILS  ------------------
DECORATION: 'Decoration' ;

//------------------ ATTRIBUTES  --------------
BODY_ATTR: 'body' ;
DRAWER_ATTR:'drawer';
APP_BAR_ATTR:'appBar';
BOTTOM_NAVIGATION_BAR_ATTR:'bottonNavigationBar';
FLOATING_ACTION_BUTTON_ATTR:'floatinActionButton';
BACKGROUNG_COLOR_ATTR:'backgroundColor';
CHILD_ATTR: 'child' ;
WIDTH_ATTR: 'width' ;
HEIGHT_ATTR: 'height' ;
COLOR_ATTR: 'color' ;
DECORATION_ATTR: 'decoration' ;
PADDING_ATTR: 'padding' ;

//-----------------------  CLASS   -------------
COLORS: 'Colors' ;
EDGEINSETS: 'EdgeInsets' ;
//----------------- BASE -------------------------
INT :  '0'| [1-9][0-9]* ;
DOUBLE : '-'? INT (DOT [0-9])*;
LETTER
    :    'a' .. 'z'
    |    'A' .. 'Z'
    ;

    IDENTIFIER: [a-zA-Z_$][a-zA-Z0-9_$]*;
    ARROW: '=>';
    WS: [ \t\n\r]+ -> skip;
//---------------  SYMBOLS  ------------
COMMA: ',';
SEMICOLON: ' '* ';';
COLON: ':';
DOT: '.';

//------------------ BRACKETS  --------------------
OPEN_PAREN: ' '* '(' ' '*;
CLOSE_PAREN: ' '* ')';
OPEN_SQUARE: '[';
CLOSE_SQUARE: ']';
OPEN_BRACE: '{';
CLOSE_BRACE: '}';

//-------------------  OPERATORS  -------------------
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVISION: '/';
EQUAL: '=';
LARGER: '>';
SMALLER: '<';
LARGER_OR_EQUAL: '>=';
SMALLER_OR_EQUAL: '<=';
NOT_EQUAL: '!=';
AND: '&&';
OR: '||';
NOT: '!';

QUOTES_SQ:'\'\'';
QUOTES_DQ:'""';

//-------------- COLORS ------------
RED:'red';
BLUE:'blue';
YELLOW:'yellow';
BLACK:'black';
WHITE:'white';
GREY:'grey';
GREEN:'green';
GOLD:'gold';
PURBLE:'purble';
PINK:'pink';

//---------------  STYLE  ------------------
ITALIC:'italic';
NORMAL:'normal';



//Besher's..
SLIDER: 'Slider'; //






// Besher's ..
VALUE : 'value';
ONCHANGED: 'onChanged';
MAX: 'max';
MIN:'min';
INACTIVE_COLOR:'inactiveColor';
LABEL: 'label';
