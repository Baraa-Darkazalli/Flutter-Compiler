parser grammar ParserFile;

options {
  tokenVocab=LexerFile;
}

// The entry point for the parser.
root:main dartClass*;

main:VOID MAIN OPEN_PAREN CLOSE_PAREN OPEN_BRACE expression* CLOSE_BRACE;

dartClass:CLASS className (EXTENDS STATELESS_WIDGET)? OPEN_BRACE classBody* CLOSE_BRACE;

classBody: classArg | constructorDeclaration | buildFunctionDeclaration;

classArg: dataType attributeName SEMICOLON;

constructorDeclaration: className OPEN_PAREN constructorArg* CLOSE_PAREN SEMICOLON;

buildFunctionDeclaration: WIDGET BUILD OPEN_PAREN CLOSE_PAREN OPEN_BRACE buildBody CLOSE_BRACE;

constructorArg: dataType attributeName ;

buildBody:RETURN widget SEMICOLON;

dataType:DATA_TYPE;

attributeName: IDENTIFIER;

className: IDENTIFIER;

widget: scaffold | container | text | image | listView | appBar | textField | column | row | card | iconButton
        |  inkWell  | expanded | bottomNavigationBar | slider | tabBar | tabBarView | drawer
        | floatingActionButton | wrap | flex | textFormField | textButton | icon | sizedBox|center|blocProvider|blocConsumer|blocListener|blocBuilder;

//---------------------------    WIDGETS     -------------------------------
scaffold: SCAFFOLD OPEN_PAREN (scaffoldArgs COMMA?)*  CLOSE_PAREN;
container: CONTAINER OPEN_PAREN (containerArgs COMMA?)* CLOSE_PAREN;
text: TEXT OPEN_PAREN (textArgs COMMA?)* CLOSE_PAREN;
textStyle:TEXT_STYLE OPEN_PAREN (textStyleArgs COMMA?)* CLOSE_PAREN;
image: IMAGE OPEN_PAREN (imageArgs COMMA?)* CLOSE_PAREN;
listView: LIST_VIEW OPEN_PAREN (listviewArgs COMMA?)* CLOSE_PAREN ;
appBar: APP_BAR OPEN_PAREN (appBarArgs COMMA?)* CLOSE_PAREN;
textField: TEXT_FIELD OPEN_PAREN (textFieldArgs COMMA?)* CLOSE_PAREN;
column: COLUMN OPEN_PAREN (columnArgs COMMA?)* CLOSE_PAREN;
row: ROW OPEN_PAREN (rowArgs COMMA?)* CLOSE_PAREN;
card: CARD OPEN_PAREN (cardArgs COMMA?)* CLOSE_PAREN;
iconButton: ICON_BUTTON OPEN_PAREN (iconButtonArgs COMMA?)* CLOSE_PAREN;
inkWell:  INK_WELL OPEN_PAREN (inkwellArgs COMMA?)* CLOSE_PAREN;
expanded: EXPANDED OPEN_PAREN (expandedArgs COMMA?)* CLOSE_PAREN;
bottomNavigationBar: BOTTOM_NAVIGATION_BAR OPEN_PAREN (bottomNavigationBarArgs COMMA?)*  CLOSE_PAREN;
slider: SLIDER OPEN_PAREN  (sliderArgs COMMA?)* CLOSE_PAREN;
tabBar: TAB_BAR OPEN_PAREN  (tabBarArgs COMMA?)* CLOSE_PAREN;
tabBarView: TAB_BAR_VIEW OPEN_PAREN  (tabBarViewArgs COMMA?)* CLOSE_PAREN;
drawer: DRAWER OPEN_PAREN  (drawerArgs COMMA?)* CLOSE_PAREN;
floatingActionButton: FLOATING_ACTION_BUTTON OPEN_PAREN  (floatingActionButtonArgs COMMA?)* CLOSE_PAREN;
wrap: WRAP OPEN_PAREN  (wrapArgs COMMA?)* CLOSE_PAREN;
flex: FLEX OPEN_PAREN  (flexArgs COMMA?)* CLOSE_PAREN;
textFormField: TEXT_FORM_FIELD OPEN_PAREN  (textFormFieldArgs COMMA?)* CLOSE_PAREN;
textButton: TEXT_BUTTON OPEN_PAREN  (textButtonArgs COMMA?)* CLOSE_PAREN;
icon: ICON OPEN_PAREN  (iconArgs COMMA?)* CLOSE_PAREN;
sizedBox: SIZED_BOX OPEN_PAREN (sizedBoxArgs COMMA?)* CLOSE_PAREN ;
center: CENTER OPEN_PAREN (centerArgs COMMA?) CLOSE_PAREN ;
blocProvider:BLOCPROVIDER OPEN_PAREN (blocProviderArgs COMMA?)* CLOSE_PAREN;
blocConsumer:BLOCCONSUMER OPEN_PAREN (blocConsumerArgs COMMA?)* CLOSE_PAREN;
blocListener:BLOCLISTENER OPEN_PAREN (blocListenerArgs COMMA?)* CLOSE_PAREN;
blocBuilder:BLOCBUILDER OPEN_PAREN (blocBuilderArgs COMMA?)* CLOSE_PAREN;



//------------------------- WIDGETS ARGS ---------------------

scaffoldArgs:body|drawerArg|appBarArg|bottomNavigationBarArg|floatingActionButtonArg|backGroundColor;
containerArgs:child|width|height|color|margin|padding;
textArgs:textArg|style;
imageArgs: imageArg|color|height|width;
listviewArgs:children|padding;
appBarArgs:title|leading|actions|backGroundColor;
textFieldArgs:style;
columnArgs:children|mainAxis|crossAxis;
rowArgs:children|mainAxis|crossAxis;
cardArgs:color|margin|child;
iconButtonArgs:iconArg|color|padding;
inkwellArgs:child|onTap;
expandedArgs:child|flexArg;
bottomNavigationBarArgs:items|backGroundColor|currentIndex;
sliderArgs:min|max;
tabBarArgs:tabs|padding;
tabBarViewArgs:children;
drawerArgs:backGroundColor|child|width;
floatingActionButtonArgs:child|backGroundColor;
wrapArgs:children|crossAxis;
flexArgs:child|flexArg;
textFormFieldArgs:style;
textButtonArgs:child|style;
iconArgs:size|color|ICONS;
sizedBoxArgs:child|height|width;
textStyleArgs: backGroundColor|color|fontSize;
centerArgs: child;
blocProviderArgs:create|child;
blocConsumerArgs:builder|listener|child;
blocListenerArgs:listener|child;
blocBuilderArgs:builder;

//---------------------------- ARGS --------------------------

body:BODY COLON widget;
drawerArg:DRAWER_ARG COLON drawer;
appBarArg:APP_BAR_ARG COLON appBar;
bottomNavigationBarArg:BOTTOM_NAVIGATION_BAR_ARG COLON bottomNavigationBar;
floatingActionButtonArg:FLOATING_ACTION_BUTTON_ARG COLON floatingActionButton;
child:CHILD COLON widget;
children: CHILDREN COLON OPEN_SQUARE (widget COMMA?)* CLOSE_SQUARE;
height:HEIGHT COLON DOUBLE;
width:WIDTH COLON DOUBLE;
color:COLOR COLON COLORS;
margin:MARGIN COLON DOUBLE;
padding:PADDING COLON DOUBLE;
items:ITEMS COLON OPEN_SQUARE (widget COMMA?)* CLOSE_SQUARE;
currentIndex: CURRENT_INDEX COLON INT;
backGroundColor:BACKGROUND_COLOR COLON COLORS;
crossAxis:CROSS_AXIS_ALIGNMENT COLON AXIS;
mainAxis:MAIN_AXIS_ALIGNMENT COLON AXIS;
style:STYLE COLON textStyle;
fontSize:FONT_SIZE COLON DOUBLE;
textArg:STRING|IDENTIFIER;
imageArg:IMAGE_ARG COLON (STRING|IDENTIFIER);
leading:LEADING COLON widget;
title:TITLE COLON widget;
actions:ACTIONS COLON OPEN_SQUARE (widget COMMA?)* CLOSE_SQUARE;
iconArg:ICON_ARG COLON widget;
flexArg:FLEX_ARG COLON INT;
min:MIN COLON DOUBLE;
max:MAX COLON DOUBLE;
tabs:TABS COLON OPEN_SQUARE (widget COMMA?)* CLOSE_SQUARE;
size:SIZE COLON DOUBLE;
onTap:ON_TAP COLON OPEN_PAREN CLOSE_PAREN OPEN_BRACE expression* CLOSE_BRACE;
create:CREATE COLON OPEN_PAREN IDENTIFIER CLOSE_PAREN EQUAL LARGER className OPEN_PAREN CLOSE_PAREN;
builder:BUILDER COLON OPEN_PAREN IDENTIFIER COMMA IDENTIFIER CLOSE_PAREN OPEN_BRACE RETURN widget SEMICOLON CLOSE_BRACE ;
listener:LISTENER COLON OPEN_PAREN IDENTIFIER COMMA IDENTIFIER CLOSE_PAREN OPEN_BRACE expression* CLOSE_BRACE;
//------------------------ NAVIGATION  ------------------
expression:allowExp SEMICOLON;

allowExp:navigateExp|runAppExp|setStateExp;

runAppExp:RUN_APP OPEN_PAREN constructor CLOSE_PAREN;

navigateExp:NAVIGATOR DOT transtion;

transtion:push|pop;

push:PUSH OPEN_PAREN constructor CLOSE_PAREN;

pop:POP OPEN_PAREN CLOSE_PAREN;

constructor:IDENTIFIER OPEN_PAREN (constructoFilled COMMA?)* CLOSE_PAREN;

constructoFilled:STRING|DOUBLE;

setStateExp:SETSTATE OPEN_PAREN CLOSE_PAREN OPEN_BRACE expression* CLOSE_BRACE;





