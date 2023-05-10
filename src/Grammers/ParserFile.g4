parser grammar ParserFile;

options {
  tokenVocab=LexerFile;
}

// The entry point for the parser.
widget: scaffold | container | text | image | listView | appBar | textField | column | row | card | iconButton
        |   inkWell | expanded | bottomNavigationBar | slider | tabBar | tabBarView | drawer
        | floatingActionButton | wrap | flex | textFormField | textButton | icon | sizedBox;

//---------------------------    WIDGETS     -------------------------------
scaffold: SCAFFOLD OPEN_PAREN scaffoldArgs*  CLOSE_PAREN;
container: CONTAINER OPEN_PAREN containerArgs* CLOSE_PAREN;
text: TEXT OPEN_PAREN textArgs* CLOSE_PAREN;
textStyle:TEXT_STYLE OPEN_PAREN textStyleArgs* CLOSE_PAREN;
image: IMAGE OPEN_PAREN imageArgs* CLOSE_PAREN;
listView: LIST_VIEW OPEN_PAREN listviewArgs* CLOSE_PAREN ;
appBar: APP_BAR OPEN_PAREN appBarArgs* CLOSE_PAREN;
textField: TEXT_FIELD OPEN_PAREN textFieldArgs* CLOSE_PAREN;
column: COLUMN OPEN_PAREN columnArgs* CLOSE_PAREN;
row: ROW OPEN_PAREN rowArgs* CLOSE_PAREN;
card: CARD OPEN_PAREN cardArgs* CLOSE_PAREN;
iconButton: ICON_BUTTON OPEN_PAREN iconButtonArgs* CLOSE_PAREN;
inkWell:  INK_WELL OPEN_PAREN inkwellArgs* CLOSE_PAREN;
expanded: EXPANDED OPEN_PAREN expandedArgs* CLOSE_PAREN;
bottomNavigationBar: BOTTOM_NAVIGATION_BAR OPEN_PAREN bottomNavigationBarArgs*  CLOSE_PAREN;
slider: SLIDER OPEN_PAREN  sliderArgs* CLOSE_PAREN;
tabBar: TAB_BAR OPEN_PAREN  tabBarArgs* CLOSE_PAREN;
tabBarView: TAB_BAR_VIEW OPEN_PAREN  tabBarViewArgs* CLOSE_PAREN;
drawer: DRAWER OPEN_PAREN  drawerArgs* CLOSE_PAREN;
floatingActionButton: FLOATING_ACTION_BUTTON OPEN_PAREN  floatingActionButtonArgs* CLOSE_PAREN;
wrap: WRAP OPEN_PAREN  wrapArgs* CLOSE_PAREN;
flex: FLEX OPEN_PAREN  flexArgs* CLOSE_PAREN;
textFormField: TEXT_FORM_FIELD OPEN_PAREN  textFormFieldArgs* CLOSE_PAREN;
textButton: TEXT_BUTTON OPEN_PAREN  textButtonArgs* CLOSE_PAREN;
icon: ICON OPEN_PAREN  iconArgs* CLOSE_PAREN;
sizedBox: SIZED_BOX OPEN_PAREN sizedBoxArgs* CLOSE_PAREN ;

//------------------------- WIDGETS ARGS ---------------------
scaffoldArgs:body|drawerArg|appBarArg|bottomNavigationBarArg|floatingActionButtonArg|backGroundColor;
containerArgs:child|width|height|color|margin|padding;
textArgs:STRING style;
imageArgs: imageArg|color|height|width;
listviewArgs:children|padding;
appBarArgs:title|leading|actions|backGroundColor;
textFieldArgs:style;
columnArgs:children|mainAxis|crossAxis;
rowArgs:children|mainAxis|crossAxis;
cardArgs:color|margin|child;
iconButtonArgs:iconArg|color|padding;
inkwellArgs:child;
expandedArgs:child|flexArg;
bottomNavigationBarArgs:items|backGroundColor|currentIndex;
sliderArgs:min|max;
tabBarArgs:tabs|padding;
tabBarViewArgs:children;
drawerArgs:backGroundColor|child|width;
floatingActionButtonArgs:child|backGroundColor;
wrapArgs:children|crossAxis;
flexArgs:child|flex;
textFormFieldArgs:style;
textButtonArgs:child|style;
iconArgs:size|color;
sizedBoxArgs:child|height|width;
textStyleArgs: backGroundColor|color|fontSize;


//---------------------------- ARGS --------------------------

body:BODY COLON widget;
drawerArg:DRAWER_ARG COLON drawer;
appBarArg:APP_BAR_ARG COLON appBar;
bottomNavigationBarArg:BOTTOM_NAVIGATION_BAR_ARG COLON bottomNavigationBar;
floatingActionButtonArg:FLOATING_ACTION_BUTTON_ARG COLON floatingActionButton;
child:CHILD COLON widget;
children: CHILDREN COLON OPEN_SQUARE widget* CLOSE_SQUARE;
height:HEIGHT COLON (DOUBLE|INT);
width:WIDTH COLON (DOUBLE|INT);
color:COLOR COLON colors;
margin:MARGIN COLON (DOUBLE|INT);
padding:PADDING COLON (DOUBLE|INT);
items:ITEMS COLON OPEN_SQUARE widget* CLOSE_SQUARE;
currentIndex: CURRENT_INDEX COLON INT;
backGroundColor:BACKGROUND_COLOR COLON colors;
crossAxis:CROSS_AXIS_ALIGNMENT COLON axisValues;
mainAxis:MAIN_AXIS_ALIGNMENT COLON axisValues;
style:STYLE COLON textStyle;
fontSize:FONT_SIZE COLON (DOUBLE|INT);
imageArg:IMAGE_ARG COLON STRING;
leading:LEADING COLON widget;
title:TITLE COLON widget;
actions:ACTIONS COLON OPEN_SQUARE widget* CLOSE_SQUARE;
iconArg:ICON_ARG COLON widget;
flexArg:FLEX_ARG COLON INT;
min:MIN COLON (DOUBLE|INT);
max:MAX COLON (DOUBLE|INT);
tabs:TABS COLON OPEN_SQUARE widget* CLOSE_SQUARE;
size:SIZE COLON (DOUBLE|INT);

//---------------------------- CONST ---------------------
colors: RED
          | BLUE
          | YELLOW
          | BLACK
          | WHITE
          | GREY
          | GREEN
          | GOLD
          | PURBLE
          | PINK ;

axisValues:START|CENTER|END;

