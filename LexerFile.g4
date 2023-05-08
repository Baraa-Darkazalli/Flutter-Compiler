lexer grammar LexerFile;


//------------------- WIDGETS --------------------
SCAFFOLD: 'Scaffold' ;
CONTAINER: 'Container' ;


//Besher's..
SLIDER: 'Slider'; //
DRAWER: 'Drawer';
WRAP: 'Wrap';
TEXTFORMFIELD: 'TextFormField';
FLEX: 'Flex';
TEXT_BUTTON: 'TextButton' ;
ICON_BUTTON:'IconButton';


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
CHILDREN_ATTR: 'children' ;
WIDTH_ATTR: 'width' ;
HEIGHT_ATTR: 'height' ;
COLOR_ATTR: 'color' ;
DECORATION_ATTR: 'decoration' ;
PADDING_ATTR: 'padding' ;

// Besher's ..
VALUE_ATTR : 'value';
ONCHANGED_ATTR: 'onChanged';
MAX_ATTR: 'max';
MIN_ATTR:'min';
INACTIVE_COLOR_ATTR:'inactiveColor';
LABEL_ATTR: 'label';
ELEVATION_ATTR: 'elevation';
SPACING_ATTR:'spacing';
ALIGNMENT:'alignment';
DIRECTION_ATTR : 'direction';
LABEL_TEXT_ATTR: 'labelText';
HINT_TEXT_ATTR: 'hintText';
PREFIX_iCON_ATTR:'prefixIcon';
SUFFIX_ICON_ATTR:   'suffixIcon';
OBSCURE_TEXT_ATTR:   'obscureText';
ON_TAP_ATTR: 'onTap';
MAX_LENGTH_ATTR: 'maxLength';
ENABLED_ATTR:'enabled';
OPACITY_ATTR:'opacity';
ICON_ATTR:'icon';
ON_PRESSED_ATTR:'onPressed';
ICON_SIZE_ATTR:'iconSize';

//-----------------------  CLASS   -------------
COLORS: 'Colors' ;
EDGEINSETS: 'EdgeInsets' ;
//----------------- BASE -------------------------
fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];
INT: DIGIT+;
DOUBLE : '-'? INT (DOT [0-9])*;
 ID: LETTER (LETTER | DIGIT | '_')*;
  FLOAT: DIGIT+ '.' DIGIT* | '.' DIGIT+;
   STRING      : '"' (~["\\\r\n] | '\\' .)* '"';
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

//------------  ALIGMENT -----------
END: 'end';
CENTER: 'center';
SPACE_BETWEEN : 'spaceBetween';
START: 'start';
//--------------------AXIS ----------
AXIS:'Axis';
HORIZONTAL: 'horizontal';
VERTICAL: 'vertical';
//-------------- STATIC ----------
TRUE:'true';
FALSE:'false';








