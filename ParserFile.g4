parser grammar ParserFile;

options {
  tokenVocab=LexerFile;
}

// The entry point for the parser.
widget: scaffold|container|text|image|listView|appBar|textField|column|row|card|iconButton|checkBox|radio|inkWell
        |expanded|bottomNavigationBar|slider|tabBar|tabView|drawer|floatingActionButton|wrap|flex|textFormField
        |textButton|icon;


//---------------------------    WIDGETS     -------------------------------
scaffold:SCAFFOLD PARENTHESES_OPEN scaffoldAttributes PARENTHESES_CLOSE;
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
slider: ;
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
scaffoldAttributes:bodyAttr|drawerAttr|appBarAttr|bottomNavigationBarAttr|floatingActionButtonAttr|backGroundColorAttr;
bodyAttr: ;
drawerAttr: ;
appBarAttr: ;
bottomNavigationBarAttr: ;
floatingActionButtonAttr: ;
backGroundColorAttr: ;

//---------------------------    CONTAINER ATTRIBUTES     -------------------------------



