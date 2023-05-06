parser grammar ParserFile;

options {
  tokenVocab=LexerFile;
}

// The entry point for the parser.
widget: scaffold|container|text|image|listView|appBar|textField|column|row|card|iconButton|checkBox|radio|inkWell
        |expanded|bottomNavigationBar|slider|tabBar|tabView|drawer|floatingActionButton|wrap|flex|textFormField
        |textButton|icon;


//---------------------------    WIDGETS     -------------------------------
scaffold:SCAFFOLD PARENTHESES_OPEN (scaffoldAttributes COMMA)* scaffoldAttributes? PARENTHESES_CLOSE;
container: ;
text: ;
image: ;
listView: ;
appBar: ;
textField: ;
column: ;
row: ;
card: ;
iconButton: ;
checkBox: ;
radio: ;
inkWell: ;
expanded: ;
bottomNavigationBar: ;
slider: SLIDER PARENTHESES_OPEN  sliderAttributes PARENTHESES_CLOSE;
tabBar: ;
tabView: ;
drawer: ;
floatingActionButton: ;
wrap: ;
flex: ;
textFormField: ;
textButton: ;
icon: ;

//---------------------------    SCAFFOLD ATTRIBUTES     -------------------------------
scaffoldAttributes:scaffoldAttrBody|scaffoldAttrDrawer|scaffoldAttrAppBar|bottomNavigationBarAttr|floatingActionButtonAttr|backGroundColorAttr;
scaffoldAttrBody:BODY_ATTR COLON widget;
scaffoldAttrDrawer:DRAWER_ATTR COLON widget ;
scaffoldAttrAppBar: APP_BAR_ATTR COLON widget;
bottomNavigationBarAttr:BOTTOM_NAVIGATION_BAR_ATTR COLON widget ;
floatingActionButtonAttr: FLOATING_ACTION_BUTTON_ATTR COLON widget;
backGroundColorAttr:BACKGROUNG_COLOR_ATTR COLON widget ;

//---------------------------    CONTAINER ATTRIBUTES     -------------------------------
sliderAttributes:






//---------------------------    Slider ATTRIBUTES     -------------------------------



