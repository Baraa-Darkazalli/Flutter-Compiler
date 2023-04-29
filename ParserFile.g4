parser grammar ParserFile;

options {
  tokenVocab=LexerFile;
}

// The entry point for the parser.
flutterApp
  :  scaffold | appContent+
  ;

appContent
     :  appBar
     |  drawer
     |  body
     |  column
     |  container
     |  text
     |  sizedBox
     |  image
     |  row
     |  materialButton
     ;

scaffold
  :  SCAFFOLD PARENTHESES_OPEN  (appBarAppBarContent)?  (drawerDrawerContent)?  (bodyBodyContent)?  PARENTHESES_CLOSE
  ;

appBarAppBarContent
  :   APPBAR  COLON  appBar
  ;

drawerDrawerContent
  :  DRAWER COLON drawer
  ;

bodyBodyContent
  :  BODY COLON body
  ;

appBar
  :  APPBAR_CONS PARENTHESES_OPEN appBarBody? PARENTHESES_CLOSE COMMA
  ;

appBarBody
        : (appBarAttributes)*
        ;

appBarAttributes
        : (LEADING COLON widget )
        | (TITLE COLON widget )
        | (ACTIONS COLON SQUARE_OPEN widget+ SQUARE_CLOSE COMMA);

drawer
  :  DRAWER_CONS PARENTHESES_OPEN drawerBody? PARENTHESES_CLOSE COMMA
  ;

drawerBody
        : (drawerAttributes)*
        ;

drawerAttributes
        :  childGrammar
        |  backgroundColorGrammar
        |  widthGrammar
        ;

childGrammar:CHILD COLON widget;

colorGrammar:COLOR COLON COLORS_CLASS DOT color COMMA;

backgroundColorGrammar:BACKGROUND_COLOR COLON COLORS_CLASS DOT color COMMA;

widthGrammar:WIDTH COLON (DOUBLE|INT) COMMA;

heightGrammar:HEIGHT COLON (DOUBLE|INT) COMMA;

fontFamilyGrammar:FONTFAMILY COLON stringLiteral COMMA;

fontSizeGrammar:FONTSIZE COLON (DOUBLE|INT) COMMA;

fontStyleGrammar:FONTSTYLE COLON FONTSTYLE_CLASS DOT style COMMA;

style:
    ITALIC
    |NORMAL;

color:
    RED
    |BLUE
    |YELLOW
    |BLACK
    |WHITE
    |GREY
    |GREEN
    |GOLD
    |PURBLE
    |PINK;
body
 : widget
 ;

crossAxisAlignmentCrossAxisAlignmentContent
  :  CROSSAXISALIGNMENT COLON CROSSAXISALIGNMENT_CLASS DOT IDENTIFIER COMMA
  ;

mainAxisAlignmentMainAxisAlignmentContent
  :  MAINAXISALIGNMENT COLON MAINAXISALIGNMENT_CLASS DOT IDENTIFIER COMMA
  ;

childrenChildrenContent
  :  CHILDREN COLON SQUARE_OPEN (widget)+ SQUARE_CLOSE COMMA
  ;

  childrenChildrenContentStack
    :  CHILDREN COLON SQUARE_OPEN (widgetPositioned|widget)+ SQUARE_CLOSE COMMA
    ;

widget
  :  container
  |  text
  |  sizedBox
  |  image
  |  listview
  |  column
  |  row
  |  stack
  |  materialButton
  ;

container
  :  CONTAINER_CONS PARENTHESES_OPEN (colorGrammar)?  (heightGrammar)? (widthWidthContent)? (CHILD COLON widget)? PARENTHESES_CLOSE COMMA
  ;

widthWidthContent
  :  WIDTH COLON DOUBLE COMMA
  ;

text
  :  TEXT_CONS PARENTHESES_OPEN textBody PARENTHESES_CLOSE COMMA
  ;

textBody: stringLiteral COMMA textAttributes* ;

textAttributes: textStyle;

textStyle:STYLE COLON TEXTSTYLE_CONS PARENTHESES_OPEN textStyleAttributes* PARENTHESES_CLOSE COMMA;

textStyleAttributes:
           colorGrammar
           |heightGrammar
           |fontFamilyGrammar
           |fontStyleGrammar
           |fontSizeGrammar
        ;

stringLiteral:
        STRING_SINGLE_QU
       |STRING_SINGLE_DOUBLE_QU;

sizedBox
  :  SIZEDBOX PARENTHESES_OPEN (heightGrammar)? PARENTHESES_CLOSE COMMA
  ;

image
  :  IMAGE_CONS DOT ASSET PARENTHESES_OPEN STRING_LITERAL PARENTHESES_CLOSE COMMA
  ;

row
  :  ROW PARENTHESES_OPEN (mainAxisAlignmentMainAxisAlignmentContent)? (childrenChildrenContent)+ PARENTHESES_CLOSE COMMA
  ;

materialButton
  :  MATERIALBUTTON PARENTHESES_OPEN (onPressedOnPressedContent)? (CHILD COLON widget)? PARENTHESES_CLOSE COMMA
  ;

onPressedOnPressedContent
  :  ONPRESSED COLON PARENTHESES_OPEN PARENTHESES_CLOSE CURLY_OPEN (printPrintContent)? CURLY_CLOSE  COMMA
  ;

printPrintContent
  :  PRINT PARENTHESES_OPEN STRING_LITERAL PARENTHESES_CLOSE SEMICOLON
  ;

column
  :  COLUMN PARENTHESES_OPEN (crossAxisAlignmentCrossAxisAlignmentContent)? (childrenChildrenContent)+ PARENTHESES_CLOSE COMMA
  ;

listview
  :  LISTVIEW PARENTHESES_OPEN (padding)? (childrenChildrenContent)+ PARENTHESES_CLOSE COMMA
  ;

padding: CONST EDGEINSETS DOT ALL PARENTHESES_OPEN DIGIT PARENTHESES_CLOSE COMMA ;

stack
  :  STACK PARENTHESES_OPEN (widthWidthContent | heightGrammar)? (childrenChildrenContentStack)+ PARENTHESES_CLOSE
  ;

  widgetPositioned: POSITIONED PARENTHESES_OPEN positionedParams? PARENTHESES_CLOSE (widget)+
                  ;

  positionedParams: LEFT EQUAL FLOAT
                   | TOP EQUAL FLOAT
                   | RIGHT EQUAL FLOAT
                   | BOTTOM EQUAL FLOAT
                   ;
