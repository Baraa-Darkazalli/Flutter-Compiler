parser grammar ParserFile;

options {
  tokenVocab=LexerFile;
}

// The entry point for the parser.
widget: scaffold | container | text | image | listView | appBar | textField | column | row | card | iconButton
        | checkBox | radio | inkWell | expanded | bottomNavigationBar | slider | tabBar | tabView | drawer
        | floatingActionButton | wrap | flex | textFormField | textButton | icon | sizedBox;


//---------------------------    WIDGETS     -------------------------------
scaffold: SCAFFOLD OPEN_PAREN (scaffoldAttributes COMMA)* scaffoldAttributes? CLOSE_PAREN;
container: CONTAINER OPEN_PAREN (containerAttributes COMMA)* containerAttributes? CLOSE_PAREN;
text: COLON;
image: COLON;
listView: LISTVIEW OPEN_PAREN listviewArgs CLOSE_PAREN COMMA;
appBar: COLON;
textField: COLON;
column: COLUMN OPEN_PAREN columnArgs CLOSE_PAREN COMMA;
row: ROW OPEN_PAREN rowArgs CLOSE_PAREN COMMA;
card: CARD OPEN_PAREN cardArgs?  CLOSE_PAREN COMMA;
iconButton: ICONBUTTON OPEN_PAREN iconArgs CLOSE_PAREN COMMA;
checkBox: COLON;
radio:COLON ;
inkWell:  INKWELL OPEN_PAREN inkwellArgs? CLOSE_PAREN COMMA;
expanded: EXPANDED OPEN_PAREN expandedArgs CLOSE_PAREN COMMA;
bottomNavigationBar: BOTTOM_NAVIGATION_BAR_ATTR OPEN_PAREN bottomNavigationBarArgs  CLOSE_PAREN COMMA;
slider: SLIDER OPEN_PAREN  sliderAttributes CLOSE_PAREN;
tabBar: COLON;
tabView: COLON;
drawer:COLON ;
floatingActionButton: COLON;
wrap: COLON;
flex: COLON;
textFormField:COLON ;
textButton: COLON;
icon: COLON;
sizedBox: SIZEDBOX OPEN_PAREN width COMMA height COMMA child CLOSE_PAREN COMMA;


//----------------------------- UTILS ------------------------
decoration: DECORATION OPEN_PAREN (decorationAttr COMMA)* decorationAttr? CLOSE_PAREN;
padding: EDGEINSETS OPEN_PAREN (paddingAttr COMMA)* paddingAttr? CLOSE_PAREN;

//-----------------    BOTTOM_NAVIGATION_BAR ATTRIBUTES     -------------------------------
bottomNavigationBarArgs: currentIndex onTap items ;
currentIndex: CURRENTINDEX COLON INT COMMA ;
items: ITEMS COLON SQUARE_OPEN bottomNavigationBarItem+ SQUARE_CLOSE COMMA ;
bottomNavigationBarItem: BOTTOM_NAVIGATION_BAR_ITEM  OPEN_PAREN icon label CLOSE_PAREN COMMA ;
label: LABEL COLON STRING COMMA;

//---------------------------    SCAFFOLD ATTRIBUTES     -------------------------------
scaffoldAttributes: scaffoldAttrBody | scaffoldAttrDrawer | scaffoldAttrAppBar
                  | scaffoldAttrBottomNavigationBar | scaffoldAttrFloatingActionButton
                  | sharedBackGroundColorAttr ;
scaffoldAttrBody:BODY_ATTR COLON widget;
scaffoldAttrDrawer:DRAWER_ATTR COLON drawer ;
scaffoldAttrAppBar: APP_BAR_ATTR COLON appBar;
scaffoldAttrBottomNavigationBar:BOTTOM_NAVIGATION_BAR_ATTR COLON bottomNavigationBar ;
scaffoldAttrFloatingActionButton: FLOATING_ACTION_BUTTON_ATTR COLON floatingActionButton;

//---------------------------    CONTAINER ATTRIBUTES     -------------------------------
containerAttributes: sharedChildAttr | sharedWidthAttr | sharedHeightAttr | sharedColorAttr | sharedDecorationAttr
                   | sharedPaddingAttr ;


//-------------------------- DECORATION ATTRIBUTES ----------------------------
decorationAttr:;
paddingAttr:;


//---------------------------    Slider ATTRIBUTES     -------------------------------
sliderAttributes:;



//-------------------------- SHARED ATTRIBUTES  ------------------
sharedBackGroundColorAttr: BACKGROUNG_COLOR_ATTR COLON widget ;
sharedChildAttr: CHILD_ATTR COLON widget ;
sharedWidthAttr: WIDTH_ATTR COLON widget ;
sharedHeightAttr: HEIGHT_ATTR COLON widget ;
sharedColorAttr: COLOR_ATTR COLON colorClass;
sharedDecorationAttr: DECORATION_ATTR COLON decoration;
sharedPaddingAttr: PADDING_ATTR COLON padding;
crossAxisAlignmentCrossAxisAlignmentContent:  CROSSAXISALIGNMENT COLON CROSSAXISALIGNMENT_CLASS DOT IDENTIFIER COMMA;
mainAxisAlignmentMainAxisAlignmentContent: MAINAXISALIGNMENT COLON MAINAXISALIGNMENT_CLASS DOT IDENTIFIER COMMA ;
children: CHILDREN COLON SQUARE_OPEN (widget)+ SQUARE_CLOSE COMMA;
child: CHILD COLON widget ;
onTap: ONTAP Colon functionExpr;
onPressed:ONPRESSED Colon functionExpr;
width:WIDTH COLON (DOUBLE|INT) COMMA;
height:HEIGHT COLON (DOUBLE|INT) COMMA;
color: COLOR COLON COLORS DOT colorValue COMMA;
colorValue: RED
          | BLUE
          | YELLOW
          | BLACK
          | WHITE
          | GREY
          | GREEN
          | GOLD
          | PURBLE
          | PINK ;


//------------------------- CLASS ----------------------
colorClass: COLORS DOT colorStatic ;




//------------------------  STATIC ----------------
colorStatic: RED | BLUE | YELLOW | BLACK | WHITE | GREY | GREEN | GOLD | PURBLE | PINK ;


//-----------------    DART     -------------------------------
functionExpr: OPEN_PAREN parameterList? CLOSE_PAREN functionBody;
parameterList: IDENTIFIER (Comma IDENTIFIER)*;
functionBody: expression | block;
expression: ARROW statement COMMA;
block: CURLY_OPEN statement* CURLY_CLOSE COMMA;
statement : expr_Stmt
          | if_Stmt
          | while_Stmt
          | print_Stmt
          ;

expr_Stmt : expr ';' ;

if_Stmt : IF OPEN_PAREN expr CLOSE_PAREN statement (ELSE statement)? ;

while_Stmt : WHILE OPEN_PAREN expr CLOSE_PAREN statement ;

print_Stmt : PRINT expr COMMA ;

expr : INT
     | DOUBLE
     | STRING
     | ID
     | expr op=('*'|'/'|'+'|'-'|'%'|'~/') expr
     | '(' expr ')'
     | '-' expr
     | '!' expr
     ;


//-----------------    ListView ATTRIBUTES     -------------------------------
listviewArgs: (padding)? children;

//-----------------    Column ATTRIBUTES     -------------------------------
columnArgs: (crossAxisAlignmentCrossAxisAlignmentContent | mainAxisAlignmentMainAxisAlignmentContent)?  children ;

//-----------------    Row ATTRIBUTES     -------------------------------
rowArgs: (crossAxisAlignmentCrossAxisAlignmentContent | mainAxisAlignmentMainAxisAlignmentContent)?  children ;

//-----------------    INKWELL ATTRIBUTES     -------------------------------
inkwellArgs: (onTap)? child;

//-----------------    SIZEDBOX ATTRIBUTES     -------------------------------

//-----------------    EXPANDED ATTRIBUTES     -------------------------------
expandedArgs: expandedflex? (child)? ;
expandedflex: FLEX COLON (INT) COMMA ;

//-----------------    CARD ATTRIBUTES     -------------------------------
cardArgs: elevationArgs? child? ;
elevationArgs: ELEVATION COLON (DOUBLE|INT) COMMA ;

//-----------------    ICON_BUTTON ATTRIBUTES     -------------------------------
iconArgs: iconParam COMMA onPressed? ;
iconParam : ICON COLON ICON_CLASS  OPEN_PAREN ICON_CLASS DOT STRING COMMA color? CLOSE_PAREN COMMA ;

