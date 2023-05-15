lexer grammar LexerFile;


//------------------- BEGGINING ----------------
CLASS:'class';
EXTENDS:'extends';
VOID:'void';
MAIN:'main';
RUN_APP:'runApp';
STATELESS_WIDGET:'StatelessWidget';
WIDGET:'widget';
BUILD:'build';
RETURN:'return';
REQUIRED:'required';
THIS:'this';
DATA_TYPE:'String'|'int'|'double';




//------------------- WIDGETS --------------------
SCAFFOLD: 'Scaffold' ;
CONTAINER: 'Container' ;
ROW: 'Row';
COLUMN: 'Column';
LIST_VIEW : 'ListView' ;
SIZED_BOX: 'SizedBox';
EXPANDED: 'Expanded';
CARD: 'Card';
ICON_BUTTON: 'IconButton';
ICON:'Icon';
SLIDER: 'Slider';
DRAWER: 'Drawer';
WRAP: 'Wrap';
FLEX: 'Flex';
TEXT_BUTTON: 'TextButton' ;
TEXT:'Text';
IMAGE:'Image';
APP_BAR:'AppBar';
TEXT_FIELD:'TextField';
CHECK_BOX:'CheckBox';
RADIO:'Radio';
INK_WELL: 'InkWell';
BOTTOM_NAVIGATION_BAR:'BottomNavigationBar';
TAB_BAR:'TabBar';
TAB_BAR_VIEW:'TabBarView';
FLOATING_ACTION_BUTTON:'FloatingActionButton';
TEXT_FORM_FIELD:'TextFormField';
TEXT_STYLE:'TextStyle';
CENTER:'Center';
IDENTIFIER: [a-zA-Z][a-zA-Z0-9_$]*;


//-------------- COLORS ------------

COLORS:
'red'|
'blue'|
'yellow'|
'black'|
'white'|
'grey'|
'green'|
'gold'|
'purble'|
'pink';


//-------------------- ICONS -----------
ICONS:
'back';


//--------------------AXIS ----------
AXIS:
'start'|
'end'|
'center';

//------------------ WIDGET ARGS  --------------
BODY: 'body' ;
DRAWER_ARG:'drawer';
APP_BAR_ARG:'appBar';
BOTTOM_NAVIGATION_BAR_ARG:'bottomNavigationBar';
FLOATING_ACTION_BUTTON_ARG:'floatingActionButton';
BACKGROUND_COLOR:'backgroundColor';
CHILD: 'child' ;
CHILDREN: 'children' ;
WIDTH: 'width' ;
HEIGHT: 'height' ;
COLOR: 'color' ;
VALUE: 'value';
MAX: 'max';
MIN:'min';
LABEL: 'label';
ICON_ARG:'icon';
CROSS_AXIS_ALIGNMENT: 'crossAxisAlignment';
MAIN_AXIS_ALIGNMENT:'mainAxisAlignment';
FLEX_ARG: 'flex';
CURRENT_INDEX:'currentIndex';
ITEMS :'items';
MARGIN:'margin';
PADDING:'padding';
STYLE:'style';
FONT_SIZE:'fontSize';
IMAGE_ARG:'image';
TITLE:'title';
LEADING:'leading';
ACTIONS:'actions';
TABS:'tabs';
TEXT_Arg:'text';

//--------------------- FUNCTIONS --------------------
ON_TAP:'onTap';
//---------------------- NAVIGATION -------------------
NAVIGATOR:'Navigator';
PUSH:'push';
POP:'pop';
//----------------- BASE -------------------------
fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];
DOUBLE :  INT (DOT [0-9]*)?;
INT: DIGIT+;
 ID: LETTER (LETTER | DIGIT | '_')*;
  FLOAT: DIGIT+ '.' DIGIT* | '.' DIGIT+;
  STRING:('\''|'"') (LETTER|DIGIT|WS|DOT)* ('\''|'"')*;
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
UNDER_SCORE:'_';

QUOTES_SQ:'\'\'';
QUOTES_DQ:'""';


