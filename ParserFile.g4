parser grammar ParserFile;

options {
  tokenVocab=LexerFile;
}

// The entry point for the parser.
widget: scaffold | container | text | image | listView | appBar | textField | column | row | card | iconButton
        | checkBox | radio | inkWell | expanded | bottomNavigationBar | slider | tabBar | tabView | drawer
        | floatingActionButton | wrap | flex | textFormField | textButton | icon ;





//---------------------------    WIDGETS     -------------------------------
scaffold: SCAFFOLD OPEN_PAREN (scaffoldAttributes COMMA)* scaffoldAttributes? CLOSE_PAREN;
container: CONTAINER OPEN_PAREN (containerAttributes COMMA)* containerAttributes? CLOSE_PAREN;
text: COLON;
image: COLON;
listView:COLON ;
appBar: COLON;
textField: COLON;
column:COLON ;
row:COLON ;
card: COLON;
iconButton:COLON ;
checkBox: COLON;
radio:COLON ;
inkWell:COLON ;
expanded: COLON;
bottomNavigationBar: COLON;
slider: SLIDER OPEN_PAREN  (sliderAttributes COMMA)* sliderAttributes? CLOSE_PAREN;
tabBar: COLON;
tabView: COLON;
drawer:DRAWER OPEN_PAREN (drawerAttr COMMA)* drawerAttr? CLOSE_PAREN  ;
floatingActionButton: FLOATING_ACTION_BUTTON_ATTR COLON widget;
wrap: WRAP OPEN_PAREN (wrapAttr COMMA)* wrapAttr?  CLOSE_PAREN;
flex: FLEX OPEN_PAREN (flexAttr COMMA)* flexAttr? CLOSE_PAREN;
textFormField:TEXTFORMFIELD OPEN_BRACE (textFormFieldAttr COMMA)* textFormFieldAttr? CLOSE_BRACE;
textButton:  TEXT_BUTTON OPEN_PAREN (textButtonAttr COMMA)* textButtonAttr? CLOSE_PAREN ;
icon: ICON_BUTTON OPEN_PAREN (iconButtonAttr COMMA)* iconButtonAttr? CLOSE_PAREN;

//----------------------------- UTILS ------------------------
decoration: DECORATION OPEN_PAREN (decorationAttr COMMA)* decorationAttr? CLOSE_PAREN;
padding: EDGEINSETS OPEN_PAREN (paddingAttr COMMA)* paddingAttr? CLOSE_PAREN;


//-------------------------- DECORATION ATTRIBUTES ----------------------------
decorationAttr:;
paddingAttr:;




//-------------------------- SHARED ATTRIBUTES  ------------------

sharedBackGroundColorAttr: BACKGROUNG_COLOR_ATTR COLON widget ;
sharedDecorationAttr: DECORATION_ATTR COLON decoration;
sharedPaddingAttr: PADDING_ATTR COLON padding;
sharedChildAttr: CHILD_ATTR COLON widget ;
sharedIconAttr: ICON_ATTR COLON widget ;
sharedchildrenAttr: CHILDREN_ATTR COLON widget* ;
 sharedOnPressed: ON_PRESSED_ATTR COLON functionCall;


//-------------------------- CONST ATTRIBUTES  ------------------
width: WIDTH_ATTR COLON DOUBLE ;
height: HEIGHT_ATTR COLON DOUBLE ;
color: COLOR_ATTR COLON colorClass;
max : MAX_ATTR COLON DOUBLE;
min : MIN_ATTR COLON DOUBLE;
label:LABEL_ATTR COLON STRING;
elevation: ELEVATION_ATTR COLON DOUBLE;


//------------------------- CLASS ----------------------

colorClass: COLORS DOT colorStatic ;
alignmentClass: ALIGNMENT DOT alignmentStatic;
axisClass: AXIS DOT axisStatic ;




//------------------------  STATIC ----------------

colorStatic: RED | BLUE | YELLOW | BLACK | WHITE | GREY | GREEN | GOLD | PURBLE | PINK ;
alignmentStatic: END|START|CENTER|SPACE_BETWEEN;
axisStatic: HORIZONTAL| VERTICAL;
bool: TRUE| FALSE;


/**---------------------------    WIDGETS ATTRIBUTES    -------------------------------**/

//---------------------------    SCAFFOLD ATTRIBUTES     -------------------------------
scaffoldAttributes: scaffoldAttrBody | scaffoldAttrDrawer | scaffoldAttrAppBar
                  | scaffoldAttrBottomNavigationBar | scaffoldAttrFloatingActionButton | sharedBackGroundColorAttr ;
scaffoldAttrBody:BODY_ATTR COLON widget;
scaffoldAttrDrawer:DRAWER_ATTR COLON drawer ;
scaffoldAttrAppBar: APP_BAR_ATTR COLON appBar;
scaffoldAttrBottomNavigationBar:BOTTOM_NAVIGATION_BAR_ATTR COLON bottomNavigationBar ;
scaffoldAttrFloatingActionButton: FLOATING_ACTION_BUTTON_ATTR COLON floatingActionButton;



//---------------------------    CONTAINER ATTRIBUTES     -------------------------------
containerAttributes: sharedChildAttr | width | height | color | sharedDecorationAttr
                   | sharedPaddingAttr ;



//---------------------------    Slider ATTRIBUTES     -------------------------------
sliderAttributes: value| onChanged|max|min|inactiveColor|label  ;
value : VALUE_ATTR COLON DOUBLE;
onChanged: functionCall;
inactiveColor : INACTIVE_COLOR_ATTR COLON  colorClass;



//---------------------------    Drawer ATTRIBUTES     -------------------------------
drawerAttr: sharedChildAttr| width | sharedBackGroundColorAttr | elevation ;


//---------------------------    Wrap ATTRIBUTES     -------------------------------
wrapAttr : alignmentClass| sharedchildrenAttr |spacingAttr  ;
spacingAttr: SPACING_ATTR COLON DOUBLE;


//---------------------------    FLEX ATTRIBUTES     -------------------------------
flexAttr :sharedchildrenAttr| directionAttr ;
directionAttr : DIRECTION_ATTR COLON axisClass ;

//---------------------------  TEXTFORM FIELD ATTR -----------------



textFormFieldAttr: labelText | hintText | prefixIcon | suffixIcon | obscureText| onTap|maxLength|onChanged;
labelText: LABEL_TEXT_ATTR COLON STRING;
hintText: HINT_TEXT_ATTR COLON STRING;
prefixIcon: PREFIX_iCON_ATTR COLON ;
suffixIcon: SUFFIX_ICON_ATTR COLON ;
obscureText: OBSCURE_TEXT_ATTR COLON bool;
onTap : ON_TAP_ATTR COLON functionCall;
maxLength: MAX_LENGTH_ATTR COLON INT;

//-------------------------- TEXT BUTTON ATTR -----------------------
textButtonAttr:  sharedOnPressed|sharedChildAttr
// |enabled | opacity
 ;
//  enabled: ENABLED_ATTR COLON bool ;
//  opacity: OPACITY_ATTR COLON INT ;

//----------------------ICON ATTR ------------
iconButtonAttr:  sharedOnPressed|sharedIconAttr|color|iconSize ;
iconSize: ICON_SIZE_ATTR COLON DOUBLE;

//------------------------  FUNCTION CALL ----------------
functionCall: ID OPEN_PAREN arguments? CLOSE_PAREN;
arguments: argument (COMMA argument)*;
argument: expression;
expression: ID
          | INT
          | FLOAT
          | STRING
          | functionCall
          | mapLiteral
          | listLiteral
          | identifier;
mapLiteral: OPEN_BRACE mapEntry (COMMA mapEntry)* CLOSE_BRACE;
mapEntry: expression COLON expression;
listLiteral: OPEN_BRACE expression (COMMA expression)* CLOSE_BRACE;
identifier: ID;