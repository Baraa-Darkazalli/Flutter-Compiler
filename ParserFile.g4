parser grammar ParserFile;

options {
  tokenVocab=LexerFile;
}

// The entry point for the parser.
widget: scaffold|container|text|image|listView|appBar|textField|column|row|card|iconButton|checkBox|radio|inkWell
        |expanded|bottomNavigationBar|slider|tabBar|tabView|drawer|floatingActionButton|wrap|flex|textFormField
        |textButton|icon;


//---------------------------    WIDGETS     -------------------------------
scaffold:bodyAttr|drawerAttr|appBarAttr|bottomNavigationBarAttr|floatingActionButtonAttr|backGroundColorAttr ;
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
bodyAttr: ;
drawerAttr: ;
appBarAttr: ;
bottomNavigationBarAttr: ;
floatingActionButtonAttr: ;
backGroundColorAttr: ;

//---------------------------    CONTAINER ATTRIBUTES     -------------------------------



