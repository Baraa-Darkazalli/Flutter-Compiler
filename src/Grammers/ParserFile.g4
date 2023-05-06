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

//----------------------------- UTILS ------------------------
decoration: DECORATION OPEN_PAREN (decorationAttr COMMA)* decorationAttr? CLOSE_PAREN;
padding: EDGEINSETS OPEN_PAREN (paddingAttr COMMA)* paddingAttr? CLOSE_PAREN;

//---------------------------    SCAFFOLD ATTRIBUTES     -------------------------------
scaffoldAttributes: scaffoldAttrBody | scaffoldAttrDrawer | scaffoldAttrAppBar
                  | scaffoldAttrBottomNavigationBar | scaffoldAttrFloatingActionButton | sharedBackGroundColorAttr ;
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


//------------------------- CLASS ----------------------
colorClass: COLORS DOT colorStatic ;




//------------------------  STATIC ----------------
colorStatic: RED | BLUE | YELLOW | BLACK | WHITE | GREY | GREEN | GOLD | PURBLE | PINK ;
