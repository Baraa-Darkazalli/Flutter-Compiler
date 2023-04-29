// Generated from C:/Users/AHMAD AL BAGHDADI/IdeaProjects/compiler_project\ParserFile.g4 by ANTLR 4.10.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserFile extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, DOUBLE=2, LETTER=3, DIGIT=4, EXPONENT=5, HEX_DIGIT=6, ESC=7, UNICODE=8, 
		SCAFFOLD=9, STRING_SINGLE_QU=10, STRING_SINGLE_DOUBLE_QU=11, KEYWORD=12, 
		COMMA=13, SEMICOLON=14, COLON=15, DOT=16, PLUS=17, MINUS=18, MULTIPLY=19, 
		DIVISION=20, EQUAL=21, LARGER=22, SMALLER=23, LARGER_OR_EQUAL=24, SMALLER_OR_EQUAL=25, 
		NOT_EQUAL=26, AND=27, OR=28, NOT=29, PARENTHESES_OPEN=30, PARENTHESES_CLOSE=31, 
		SQUARE_OPEN=32, SQUARE_CLOSE=33, CURLY_OPEN=34, CURLY_CLOSE=35, APPBAR=36, 
		DRAWER=37, BODY=38, COLOR=39, SIZE=40, FONTSIZE=41, FONTFAMILY=42, FONTSTYLE=43, 
		STYLE=44, HEIGHT=45, WIDTH=46, STACK=47, POSITIONED=48, TOP=49, BOTTOM=50, 
		RIGHT=51, LEFT=52, CHILD=53, CHILDREN=54, ALL=55, BUILDER=56, IMAGE=57, 
		ASSET=58, CONTAINER=59, PADDING=60, ONPRESSED=61, PRINT=62, CROSSAXISALIGNMENT=63, 
		MAINAXISALIGNMENT=64, MainAxisSize=65, LEADING=66, TITLE=67, ACTIONS=68, 
		BACKGROUND_COLOR=69, APPBAR_CONS=70, DRAWER_CONS=71, CONTAINER_CONS=72, 
		IMAGE_CONS=73, STACK_CONS=74, POSITIONED_CONS=75, TEXT_CONS=76, SIZEDBOX_CONS=77, 
		ROW_CONS=78, COLUMN_CONS=79, LISTVIEW_CONS=80, MATERIAL_BUTTON_CONS=81, 
		TEXT_BUTTON_CONS=82, PADDING_CONS=83, TEXTSTYLE_CONS=84, CROSSAXISALIGNMENT_CLASS=85, 
		MAINAXISALIGNMENT_CLASS=86, EDGEINSETS_CLASS=87, COLORS_CLASS=88, FONTSTYLE_CLASS=89, 
		RED=90, BLUE=91, YELLOW=92, BLACK=93, WHITE=94, GREY=95, GREEN=96, GOLD=97, 
		PURBLE=98, PINK=99, ITALIC=100, NORMAL=101, ASSERT=102, BREAK=103, CASE=104, 
		CATCH=105, CLASS=106, CONST=107, CONTINUE=108, DEFAULT=109, DO=110, ELSE=111, 
		ENUM=112, EXTENDS=113, FALSE=114, FINAL=115, FINALLY=116, FOR=117, IF=118, 
		IN=119, IS=120, NEW=121, NULL=122, RETHROW=123, RETURN=124, SUPER=125, 
		SWITCH=126, THIS=127, THROW=128, TRUE=129, TRY=130, VAR=131, VOID=132, 
		WHILE=133, WITH=134, ABSTRACT=135, AS=136, COVARIANT=137, DEFERRED=138, 
		DYNAMIC=139, EXPORT=140, EXTENSION=141, EXTERNAL=142, FACTORY=143, FUNCTION=144, 
		GET=145, IMPLEMENTS=146, IMPORT=147, INTERFACE=148, LATE=149, LIBRARY=150, 
		OPERATOR=151, MIXIN=152, PART=153, REQUIRED=154, SET=155, STATIC=156, 
		TYPEDEF=157, AWAIT=158, YIELD=159, ASYNC=160, HIDE=161, OF=162, ON=163, 
		SHOW=164, SYNC=165, WHEN=166, NUMBER=167, HEX_NUMBER=168, RAW_SINGLE_LINE_STRING=169, 
		RAW_MULTI_LINE_STRING=170, SIMPLE_STRING_INTERPOLATION=171, HEX_DIGIT_SEQUENCE=172, 
		STRING_CONTENT_COMMON=173, STRING_CONTENT_SQ=174, SINGLE_LINE_STRING_SQ_BEGIN_END=175, 
		SINGLE_LINE_STRING_SQ_BEGIN_MID=176, SINGLE_LINE_STRING_SQ_MID_MID=177, 
		SINGLE_LINE_STRING_SQ_MID_END=178, STRING_CONTENT_DQ=179, SINGLE_LINE_STRING_DQ_BEGIN_END=180, 
		SINGLE_LINE_STRING_DQ_BEGIN_MID=181, SINGLE_LINE_STRING_DQ_MID_MID=182, 
		SINGLE_LINE_STRING_DQ_MID_END=183, QUOTES_SQ=184, STRING_CONTENT_TSQ=185, 
		MULTI_LINE_STRING_SQ_BEGIN_END=186, MULTI_LINE_STRING_SQ_BEGIN_MID=187, 
		MULTI_LINE_STRING_SQ_MID_MID=188, MULTI_LINE_STRING_SQ_MID_END=189, QUOTES_DQ=190, 
		STRING_CONTENT_TDQ=191, MULTI_LINE_STRING_DQ_BEGIN_END=192, MULTI_LINE_STRING_DQ_BEGIN_MID=193, 
		MULTI_LINE_STRING_DQ_MID_MID=194, MULTI_LINE_STRING_DQ_MID_END=195, LBRACE=196, 
		RBRACE=197, IDENTIFIER_START_NO_DOLLAR=198, IDENTIFIER_PART_NO_DOLLAR=199, 
		IDENTIFIER_NO_DOLLAR=200, IDENTIFIER_START=201, IDENTIFIER_PART=202, SCRIPT_TAG=203, 
		IDENTIFIER=204, SINGLE_LINE_COMMENT=205, MULTI_LINE_COMMENT=206, FEFF=207, 
		ID=208, INTEGER=209, WS=210, NEWLINE=211, SEA_WS=212, SIZEDBOX=213, STRING_LITERAL=214, 
		ROW=215, MATERIALBUTTON=216, COLUMN=217, LISTVIEW=218, EDGEINSETS=219, 
		FLOAT=220;
	public static final int
		RULE_flutterApp = 0, RULE_appContent = 1, RULE_scaffold = 2, RULE_appBarAppBarContent = 3, 
		RULE_drawerDrawerContent = 4, RULE_bodyBodyContent = 5, RULE_appBar = 6, 
		RULE_appBarBody = 7, RULE_appBarAttributes = 8, RULE_drawer = 9, RULE_drawerBody = 10, 
		RULE_drawerAttributes = 11, RULE_childGrammar = 12, RULE_colorGrammar = 13, 
		RULE_backgroundColorGrammar = 14, RULE_widthGrammar = 15, RULE_heightGrammar = 16, 
		RULE_fontFamilyGrammar = 17, RULE_fontSizeGrammar = 18, RULE_fontStyleGrammar = 19, 
		RULE_style = 20, RULE_color = 21, RULE_body = 22, RULE_crossAxisAlignmentCrossAxisAlignmentContent = 23, 
		RULE_mainAxisAlignmentMainAxisAlignmentContent = 24, RULE_childrenChildrenContent = 25, 
		RULE_childrenChildrenContentStack = 26, RULE_widget = 27, RULE_container = 28, 
		RULE_widthWidthContent = 29, RULE_text = 30, RULE_textBody = 31, RULE_textAttributes = 32, 
		RULE_textStyle = 33, RULE_textStyleAttributes = 34, RULE_stringLiteral = 35, 
		RULE_sizedBox = 36, RULE_image = 37, RULE_row = 38, RULE_materialButton = 39, 
		RULE_onPressedOnPressedContent = 40, RULE_printPrintContent = 41, RULE_column = 42, 
		RULE_listview = 43, RULE_padding = 44, RULE_stack = 45, RULE_widgetPositioned = 46, 
		RULE_positionedParams = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"flutterApp", "appContent", "scaffold", "appBarAppBarContent", "drawerDrawerContent", 
			"bodyBodyContent", "appBar", "appBarBody", "appBarAttributes", "drawer", 
			"drawerBody", "drawerAttributes", "childGrammar", "colorGrammar", "backgroundColorGrammar", 
			"widthGrammar", "heightGrammar", "fontFamilyGrammar", "fontSizeGrammar", 
			"fontStyleGrammar", "style", "color", "body", "crossAxisAlignmentCrossAxisAlignmentContent", 
			"mainAxisAlignmentMainAxisAlignmentContent", "childrenChildrenContent", 
			"childrenChildrenContentStack", "widget", "container", "widthWidthContent", 
			"text", "textBody", "textAttributes", "textStyle", "textStyleAttributes", 
			"stringLiteral", "sizedBox", "image", "row", "materialButton", "onPressedOnPressedContent", 
			"printPrintContent", "column", "listview", "padding", "stack", "widgetPositioned", 
			"positionedParams"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "'Scaffold'", null, 
			null, null, "','", null, "':'", "'.'", "'+'", "'-'", "'*'", "'/'", "'='", 
			"'>'", "'<'", "'>='", "'<='", "'!='", "'&&'", "'||'", "'!'", null, null, 
			"'['", "']'", null, "'}'", "'appBar'", "'drawer'", "'body'", "'color'", 
			"'size'", "'fontSize'", "'fontFamily'", "'fontStyle'", "'style'", "'height'", 
			"'width'", "'stack'", "'positioned'", "'top'", "'bottom'", "'right'", 
			"'left'", "'child'", "'children'", "'all'", "'builder'", "'image'", "'asset'", 
			"'container'", "'padding'", "'onPressed'", "'print'", "'crossAxisAlignment'", 
			"'mainAxisAlignment'", "'mainAxisSize'", "'leading'", "'title'", "'actions'", 
			"'backgroundColor'", "'AppBar'", "'Drawer'", "'Container'", "'Image'", 
			"'Stack'", "'Positioned'", "'Text'", "'SizedBox'", "'Row'", "'Column'", 
			"'ListView'", "'MaterialButton'", "'TextButton'", "'Padding'", "'TextStyle'", 
			"'CrossAxisAlignment'", "'MainAxisAlignment'", "'EdgeInsets'", "'Colors'", 
			"'FontStyle'", "'red'", "'blue'", "'yellow'", "'black'", "'white'", "'grey'", 
			"'green'", "'gold'", "'purble'", "'pink'", "'italic'", "'normal'", "'assert'", 
			"'break'", "'case'", "'catch'", "'class'", "'const'", "'continue'", "'default'", 
			"'do'", "'else'", "'enum'", "'extends'", "'false'", "'final'", "'finally'", 
			"'for'", "'if'", "'in'", "'is'", "'new'", "'null'", "'rethrow'", "'return'", 
			"'super'", "'switch'", "'this'", "'throw'", "'true'", "'try'", "'var'", 
			"'void'", "'while'", "'with'", "'abstract'", "'as'", "'covariant'", "'deferred'", 
			"'dynamic'", "'export'", "'extension'", "'external'", "'factory'", "'Function'", 
			"'get'", "'implements'", "'import'", "'interface'", "'late'", "'library'", 
			"'operator'", "'mixin'", "'part'", "'required'", "'set'", "'static'", 
			"'typedef'", "'await'", "'yield'", "'async'", "'hide'", "'of'", "'on'", 
			"'show'", "'sync'", "'when'", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'\\uFEFF'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "DOUBLE", "LETTER", "DIGIT", "EXPONENT", "HEX_DIGIT", "ESC", 
			"UNICODE", "SCAFFOLD", "STRING_SINGLE_QU", "STRING_SINGLE_DOUBLE_QU", 
			"KEYWORD", "COMMA", "SEMICOLON", "COLON", "DOT", "PLUS", "MINUS", "MULTIPLY", 
			"DIVISION", "EQUAL", "LARGER", "SMALLER", "LARGER_OR_EQUAL", "SMALLER_OR_EQUAL", 
			"NOT_EQUAL", "AND", "OR", "NOT", "PARENTHESES_OPEN", "PARENTHESES_CLOSE", 
			"SQUARE_OPEN", "SQUARE_CLOSE", "CURLY_OPEN", "CURLY_CLOSE", "APPBAR", 
			"DRAWER", "BODY", "COLOR", "SIZE", "FONTSIZE", "FONTFAMILY", "FONTSTYLE", 
			"STYLE", "HEIGHT", "WIDTH", "STACK", "POSITIONED", "TOP", "BOTTOM", "RIGHT", 
			"LEFT", "CHILD", "CHILDREN", "ALL", "BUILDER", "IMAGE", "ASSET", "CONTAINER", 
			"PADDING", "ONPRESSED", "PRINT", "CROSSAXISALIGNMENT", "MAINAXISALIGNMENT", 
			"MainAxisSize", "LEADING", "TITLE", "ACTIONS", "BACKGROUND_COLOR", "APPBAR_CONS", 
			"DRAWER_CONS", "CONTAINER_CONS", "IMAGE_CONS", "STACK_CONS", "POSITIONED_CONS", 
			"TEXT_CONS", "SIZEDBOX_CONS", "ROW_CONS", "COLUMN_CONS", "LISTVIEW_CONS", 
			"MATERIAL_BUTTON_CONS", "TEXT_BUTTON_CONS", "PADDING_CONS", "TEXTSTYLE_CONS", 
			"CROSSAXISALIGNMENT_CLASS", "MAINAXISALIGNMENT_CLASS", "EDGEINSETS_CLASS", 
			"COLORS_CLASS", "FONTSTYLE_CLASS", "RED", "BLUE", "YELLOW", "BLACK", 
			"WHITE", "GREY", "GREEN", "GOLD", "PURBLE", "PINK", "ITALIC", "NORMAL", 
			"ASSERT", "BREAK", "CASE", "CATCH", "CLASS", "CONST", "CONTINUE", "DEFAULT", 
			"DO", "ELSE", "ENUM", "EXTENDS", "FALSE", "FINAL", "FINALLY", "FOR", 
			"IF", "IN", "IS", "NEW", "NULL", "RETHROW", "RETURN", "SUPER", "SWITCH", 
			"THIS", "THROW", "TRUE", "TRY", "VAR", "VOID", "WHILE", "WITH", "ABSTRACT", 
			"AS", "COVARIANT", "DEFERRED", "DYNAMIC", "EXPORT", "EXTENSION", "EXTERNAL", 
			"FACTORY", "FUNCTION", "GET", "IMPLEMENTS", "IMPORT", "INTERFACE", "LATE", 
			"LIBRARY", "OPERATOR", "MIXIN", "PART", "REQUIRED", "SET", "STATIC", 
			"TYPEDEF", "AWAIT", "YIELD", "ASYNC", "HIDE", "OF", "ON", "SHOW", "SYNC", 
			"WHEN", "NUMBER", "HEX_NUMBER", "RAW_SINGLE_LINE_STRING", "RAW_MULTI_LINE_STRING", 
			"SIMPLE_STRING_INTERPOLATION", "HEX_DIGIT_SEQUENCE", "STRING_CONTENT_COMMON", 
			"STRING_CONTENT_SQ", "SINGLE_LINE_STRING_SQ_BEGIN_END", "SINGLE_LINE_STRING_SQ_BEGIN_MID", 
			"SINGLE_LINE_STRING_SQ_MID_MID", "SINGLE_LINE_STRING_SQ_MID_END", "STRING_CONTENT_DQ", 
			"SINGLE_LINE_STRING_DQ_BEGIN_END", "SINGLE_LINE_STRING_DQ_BEGIN_MID", 
			"SINGLE_LINE_STRING_DQ_MID_MID", "SINGLE_LINE_STRING_DQ_MID_END", "QUOTES_SQ", 
			"STRING_CONTENT_TSQ", "MULTI_LINE_STRING_SQ_BEGIN_END", "MULTI_LINE_STRING_SQ_BEGIN_MID", 
			"MULTI_LINE_STRING_SQ_MID_MID", "MULTI_LINE_STRING_SQ_MID_END", "QUOTES_DQ", 
			"STRING_CONTENT_TDQ", "MULTI_LINE_STRING_DQ_BEGIN_END", "MULTI_LINE_STRING_DQ_BEGIN_MID", 
			"MULTI_LINE_STRING_DQ_MID_MID", "MULTI_LINE_STRING_DQ_MID_END", "LBRACE", 
			"RBRACE", "IDENTIFIER_START_NO_DOLLAR", "IDENTIFIER_PART_NO_DOLLAR", 
			"IDENTIFIER_NO_DOLLAR", "IDENTIFIER_START", "IDENTIFIER_PART", "SCRIPT_TAG", 
			"IDENTIFIER", "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "FEFF", "ID", 
			"INTEGER", "WS", "NEWLINE", "SEA_WS", "SIZEDBOX", "STRING_LITERAL", "ROW", 
			"MATERIALBUTTON", "COLUMN", "LISTVIEW", "EDGEINSETS", "FLOAT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ParserFile.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserFile(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FlutterAppContext extends ParserRuleContext {
		public ScaffoldContext scaffold() {
			return getRuleContext(ScaffoldContext.class,0);
		}
		public List<AppContentContext> appContent() {
			return getRuleContexts(AppContentContext.class);
		}
		public AppContentContext appContent(int i) {
			return getRuleContext(AppContentContext.class,i);
		}
		public FlutterAppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flutterApp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFlutterApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFlutterApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFlutterApp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlutterAppContext flutterApp() throws RecognitionException {
		FlutterAppContext _localctx = new FlutterAppContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_flutterApp);
		int _la;
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCAFFOLD:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				scaffold();
				}
				break;
			case STACK:
			case APPBAR_CONS:
			case DRAWER_CONS:
			case CONTAINER_CONS:
			case IMAGE_CONS:
			case TEXT_CONS:
			case SIZEDBOX:
			case ROW:
			case MATERIALBUTTON:
			case COLUMN:
			case LISTVIEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(97);
					appContent();
					}
					}
					setState(100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (STACK - 47)) | (1L << (APPBAR_CONS - 47)) | (1L << (DRAWER_CONS - 47)) | (1L << (CONTAINER_CONS - 47)) | (1L << (IMAGE_CONS - 47)) | (1L << (TEXT_CONS - 47)))) != 0) || ((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (SIZEDBOX - 213)) | (1L << (ROW - 213)) | (1L << (MATERIALBUTTON - 213)) | (1L << (COLUMN - 213)) | (1L << (LISTVIEW - 213)))) != 0) );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AppContentContext extends ParserRuleContext {
		public AppBarContext appBar() {
			return getRuleContext(AppBarContext.class,0);
		}
		public DrawerContext drawer() {
			return getRuleContext(DrawerContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public SizedBoxContext sizedBox() {
			return getRuleContext(SizedBoxContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public MaterialButtonContext materialButton() {
			return getRuleContext(MaterialButtonContext.class,0);
		}
		public AppContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAppContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAppContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAppContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppContentContext appContent() throws RecognitionException {
		AppContentContext _localctx = new AppContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_appContent);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				appBar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				drawer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				column();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				container();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
				text();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(110);
				sizedBox();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(111);
				image();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(112);
				row();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(113);
				materialButton();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScaffoldContext extends ParserRuleContext {
		public TerminalNode SCAFFOLD() { return getToken(ParserFile.SCAFFOLD, 0); }
		public TerminalNode PARENTHESES_OPEN() { return getToken(ParserFile.PARENTHESES_OPEN, 0); }
		public TerminalNode PARENTHESES_CLOSE() { return getToken(ParserFile.PARENTHESES_CLOSE, 0); }
		public AppBarAppBarContentContext appBarAppBarContent() {
			return getRuleContext(AppBarAppBarContentContext.class,0);
		}
		public DrawerDrawerContentContext drawerDrawerContent() {
			return getRuleContext(DrawerDrawerContentContext.class,0);
		}
		public BodyBodyContentContext bodyBodyContent() {
			return getRuleContext(BodyBodyContentContext.class,0);
		}
		public ScaffoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterScaffold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitScaffold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitScaffold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaffoldContext scaffold() throws RecognitionException {
		ScaffoldContext _localctx = new ScaffoldContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_scaffold);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(SCAFFOLD);
			setState(117);
			match(PARENTHESES_OPEN);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==APPBAR) {
				{
				setState(118);
				appBarAppBarContent();
				}
			}

			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DRAWER) {
				{
				setState(121);
				drawerDrawerContent();
				}
			}

			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BODY) {
				{
				setState(124);
				bodyBodyContent();
				}
			}

			setState(127);
			match(PARENTHESES_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AppBarAppBarContentContext extends ParserRuleContext {
		public TerminalNode APPBAR() { return getToken(ParserFile.APPBAR, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public AppBarContext appBar() {
			return getRuleContext(AppBarContext.class,0);
		}
		public AppBarAppBarContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appBarAppBarContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAppBarAppBarContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAppBarAppBarContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAppBarAppBarContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppBarAppBarContentContext appBarAppBarContent() throws RecognitionException {
		AppBarAppBarContentContext _localctx = new AppBarAppBarContentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_appBarAppBarContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(APPBAR);
			setState(130);
			match(COLON);
			setState(131);
			appBar();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DrawerDrawerContentContext extends ParserRuleContext {
		public TerminalNode DRAWER() { return getToken(ParserFile.DRAWER, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public DrawerContext drawer() {
			return getRuleContext(DrawerContext.class,0);
		}
		public DrawerDrawerContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawerDrawerContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterDrawerDrawerContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitDrawerDrawerContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitDrawerDrawerContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawerDrawerContentContext drawerDrawerContent() throws RecognitionException {
		DrawerDrawerContentContext _localctx = new DrawerDrawerContentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_drawerDrawerContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(DRAWER);
			setState(134);
			match(COLON);
			setState(135);
			drawer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyBodyContentContext extends ParserRuleContext {
		public TerminalNode BODY() { return getToken(ParserFile.BODY, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public BodyBodyContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyBodyContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBodyBodyContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBodyBodyContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBodyBodyContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyBodyContentContext bodyBodyContent() throws RecognitionException {
		BodyBodyContentContext _localctx = new BodyBodyContentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bodyBodyContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(BODY);
			setState(138);
			match(COLON);
			setState(139);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AppBarContext extends ParserRuleContext {
		public TerminalNode APPBAR_CONS() { return getToken(ParserFile.APPBAR_CONS, 0); }
		public TerminalNode PARENTHESES_OPEN() { return getToken(ParserFile.PARENTHESES_OPEN, 0); }
		public TerminalNode PARENTHESES_CLOSE() { return getToken(ParserFile.PARENTHESES_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public AppBarBodyContext appBarBody() {
			return getRuleContext(AppBarBodyContext.class,0);
		}
		public AppBarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appBar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAppBar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAppBar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAppBar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppBarContext appBar() throws RecognitionException {
		AppBarContext _localctx = new AppBarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_appBar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(APPBAR_CONS);
			setState(142);
			match(PARENTHESES_OPEN);
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(143);
				appBarBody();
				}
				break;
			}
			setState(146);
			match(PARENTHESES_CLOSE);
			setState(147);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AppBarBodyContext extends ParserRuleContext {
		public List<AppBarAttributesContext> appBarAttributes() {
			return getRuleContexts(AppBarAttributesContext.class);
		}
		public AppBarAttributesContext appBarAttributes(int i) {
			return getRuleContext(AppBarAttributesContext.class,i);
		}
		public AppBarBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appBarBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAppBarBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAppBarBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAppBarBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppBarBodyContext appBarBody() throws RecognitionException {
		AppBarBodyContext _localctx = new AppBarBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_appBarBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LEADING - 66)) | (1L << (TITLE - 66)) | (1L << (ACTIONS - 66)))) != 0)) {
				{
				{
				setState(149);
				appBarAttributes();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AppBarAttributesContext extends ParserRuleContext {
		public TerminalNode LEADING() { return getToken(ParserFile.LEADING, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public List<WidgetContext> widget() {
			return getRuleContexts(WidgetContext.class);
		}
		public WidgetContext widget(int i) {
			return getRuleContext(WidgetContext.class,i);
		}
		public TerminalNode TITLE() { return getToken(ParserFile.TITLE, 0); }
		public TerminalNode ACTIONS() { return getToken(ParserFile.ACTIONS, 0); }
		public TerminalNode SQUARE_OPEN() { return getToken(ParserFile.SQUARE_OPEN, 0); }
		public TerminalNode SQUARE_CLOSE() { return getToken(ParserFile.SQUARE_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public AppBarAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appBarAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAppBarAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAppBarAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAppBarAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppBarAttributesContext appBarAttributes() throws RecognitionException {
		AppBarAttributesContext _localctx = new AppBarAttributesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_appBarAttributes);
		int _la;
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEADING:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(155);
				match(LEADING);
				setState(156);
				match(COLON);
				setState(157);
				widget();
				}
				}
				break;
			case TITLE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(158);
				match(TITLE);
				setState(159);
				match(COLON);
				setState(160);
				widget();
				}
				}
				break;
			case ACTIONS:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(161);
				match(ACTIONS);
				setState(162);
				match(COLON);
				setState(163);
				match(SQUARE_OPEN);
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(164);
					widget();
					}
					}
					setState(167); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (STACK - 47)) | (1L << (CONTAINER_CONS - 47)) | (1L << (IMAGE_CONS - 47)) | (1L << (TEXT_CONS - 47)))) != 0) || ((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (SIZEDBOX - 213)) | (1L << (ROW - 213)) | (1L << (MATERIALBUTTON - 213)) | (1L << (COLUMN - 213)) | (1L << (LISTVIEW - 213)))) != 0) );
				setState(169);
				match(SQUARE_CLOSE);
				setState(170);
				match(COMMA);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DrawerContext extends ParserRuleContext {
		public TerminalNode DRAWER_CONS() { return getToken(ParserFile.DRAWER_CONS, 0); }
		public TerminalNode PARENTHESES_OPEN() { return getToken(ParserFile.PARENTHESES_OPEN, 0); }
		public TerminalNode PARENTHESES_CLOSE() { return getToken(ParserFile.PARENTHESES_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public DrawerBodyContext drawerBody() {
			return getRuleContext(DrawerBodyContext.class,0);
		}
		public DrawerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterDrawer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitDrawer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitDrawer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawerContext drawer() throws RecognitionException {
		DrawerContext _localctx = new DrawerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_drawer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(DRAWER_CONS);
			setState(175);
			match(PARENTHESES_OPEN);
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(176);
				drawerBody();
				}
				break;
			}
			setState(179);
			match(PARENTHESES_CLOSE);
			setState(180);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DrawerBodyContext extends ParserRuleContext {
		public List<DrawerAttributesContext> drawerAttributes() {
			return getRuleContexts(DrawerAttributesContext.class);
		}
		public DrawerAttributesContext drawerAttributes(int i) {
			return getRuleContext(DrawerAttributesContext.class,i);
		}
		public DrawerBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawerBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterDrawerBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitDrawerBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitDrawerBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawerBodyContext drawerBody() throws RecognitionException {
		DrawerBodyContext _localctx = new DrawerBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_drawerBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (WIDTH - 46)) | (1L << (CHILD - 46)) | (1L << (BACKGROUND_COLOR - 46)))) != 0)) {
				{
				{
				setState(182);
				drawerAttributes();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DrawerAttributesContext extends ParserRuleContext {
		public ChildGrammarContext childGrammar() {
			return getRuleContext(ChildGrammarContext.class,0);
		}
		public BackgroundColorGrammarContext backgroundColorGrammar() {
			return getRuleContext(BackgroundColorGrammarContext.class,0);
		}
		public WidthGrammarContext widthGrammar() {
			return getRuleContext(WidthGrammarContext.class,0);
		}
		public DrawerAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawerAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterDrawerAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitDrawerAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitDrawerAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawerAttributesContext drawerAttributes() throws RecognitionException {
		DrawerAttributesContext _localctx = new DrawerAttributesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_drawerAttributes);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				childGrammar();
				}
				break;
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				backgroundColorGrammar();
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				widthGrammar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChildGrammarContext extends ParserRuleContext {
		public TerminalNode CHILD() { return getToken(ParserFile.CHILD, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public ChildGrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childGrammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterChildGrammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitChildGrammar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitChildGrammar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildGrammarContext childGrammar() throws RecognitionException {
		ChildGrammarContext _localctx = new ChildGrammarContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_childGrammar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(CHILD);
			setState(194);
			match(COLON);
			setState(195);
			widget();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColorGrammarContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(ParserFile.COLOR, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode COLORS_CLASS() { return getToken(ParserFile.COLORS_CLASS, 0); }
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public ColorGrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorGrammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterColorGrammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitColorGrammar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitColorGrammar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorGrammarContext colorGrammar() throws RecognitionException {
		ColorGrammarContext _localctx = new ColorGrammarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_colorGrammar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(COLOR);
			setState(198);
			match(COLON);
			setState(199);
			match(COLORS_CLASS);
			setState(200);
			match(DOT);
			setState(201);
			color();
			setState(202);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BackgroundColorGrammarContext extends ParserRuleContext {
		public TerminalNode BACKGROUND_COLOR() { return getToken(ParserFile.BACKGROUND_COLOR, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode COLORS_CLASS() { return getToken(ParserFile.COLORS_CLASS, 0); }
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public BackgroundColorGrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backgroundColorGrammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBackgroundColorGrammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBackgroundColorGrammar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBackgroundColorGrammar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackgroundColorGrammarContext backgroundColorGrammar() throws RecognitionException {
		BackgroundColorGrammarContext _localctx = new BackgroundColorGrammarContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_backgroundColorGrammar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(BACKGROUND_COLOR);
			setState(205);
			match(COLON);
			setState(206);
			match(COLORS_CLASS);
			setState(207);
			match(DOT);
			setState(208);
			color();
			setState(209);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidthGrammarContext extends ParserRuleContext {
		public TerminalNode WIDTH() { return getToken(ParserFile.WIDTH, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public TerminalNode DOUBLE() { return getToken(ParserFile.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(ParserFile.INT, 0); }
		public WidthGrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widthGrammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterWidthGrammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitWidthGrammar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitWidthGrammar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthGrammarContext widthGrammar() throws RecognitionException {
		WidthGrammarContext _localctx = new WidthGrammarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_widthGrammar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(WIDTH);
			setState(212);
			match(COLON);
			setState(213);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(214);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeightGrammarContext extends ParserRuleContext {
		public TerminalNode HEIGHT() { return getToken(ParserFile.HEIGHT, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public TerminalNode DOUBLE() { return getToken(ParserFile.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(ParserFile.INT, 0); }
		public HeightGrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heightGrammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHeightGrammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHeightGrammar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHeightGrammar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeightGrammarContext heightGrammar() throws RecognitionException {
		HeightGrammarContext _localctx = new HeightGrammarContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_heightGrammar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(HEIGHT);
			setState(217);
			match(COLON);
			setState(218);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(219);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FontFamilyGrammarContext extends ParserRuleContext {
		public TerminalNode FONTFAMILY() { return getToken(ParserFile.FONTFAMILY, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public FontFamilyGrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFamilyGrammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFontFamilyGrammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFontFamilyGrammar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFontFamilyGrammar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFamilyGrammarContext fontFamilyGrammar() throws RecognitionException {
		FontFamilyGrammarContext _localctx = new FontFamilyGrammarContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fontFamilyGrammar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(FONTFAMILY);
			setState(222);
			match(COLON);
			setState(223);
			stringLiteral();
			setState(224);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FontSizeGrammarContext extends ParserRuleContext {
		public TerminalNode FONTSIZE() { return getToken(ParserFile.FONTSIZE, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public TerminalNode DOUBLE() { return getToken(ParserFile.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(ParserFile.INT, 0); }
		public FontSizeGrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontSizeGrammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFontSizeGrammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFontSizeGrammar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFontSizeGrammar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontSizeGrammarContext fontSizeGrammar() throws RecognitionException {
		FontSizeGrammarContext _localctx = new FontSizeGrammarContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fontSizeGrammar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(FONTSIZE);
			setState(227);
			match(COLON);
			setState(228);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(229);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FontStyleGrammarContext extends ParserRuleContext {
		public TerminalNode FONTSTYLE() { return getToken(ParserFile.FONTSTYLE, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode FONTSTYLE_CLASS() { return getToken(ParserFile.FONTSTYLE_CLASS, 0); }
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public FontStyleGrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontStyleGrammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFontStyleGrammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFontStyleGrammar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFontStyleGrammar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontStyleGrammarContext fontStyleGrammar() throws RecognitionException {
		FontStyleGrammarContext _localctx = new FontStyleGrammarContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fontStyleGrammar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(FONTSTYLE);
			setState(232);
			match(COLON);
			setState(233);
			match(FONTSTYLE_CLASS);
			setState(234);
			match(DOT);
			setState(235);
			style();
			setState(236);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StyleContext extends ParserRuleContext {
		public TerminalNode ITALIC() { return getToken(ParserFile.ITALIC, 0); }
		public TerminalNode NORMAL() { return getToken(ParserFile.NORMAL, 0); }
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_style);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !(_la==ITALIC || _la==NORMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode RED() { return getToken(ParserFile.RED, 0); }
		public TerminalNode BLUE() { return getToken(ParserFile.BLUE, 0); }
		public TerminalNode YELLOW() { return getToken(ParserFile.YELLOW, 0); }
		public TerminalNode BLACK() { return getToken(ParserFile.BLACK, 0); }
		public TerminalNode WHITE() { return getToken(ParserFile.WHITE, 0); }
		public TerminalNode GREY() { return getToken(ParserFile.GREY, 0); }
		public TerminalNode GREEN() { return getToken(ParserFile.GREEN, 0); }
		public TerminalNode GOLD() { return getToken(ParserFile.GOLD, 0); }
		public TerminalNode PURBLE() { return getToken(ParserFile.PURBLE, 0); }
		public TerminalNode PINK() { return getToken(ParserFile.PINK, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_color);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (RED - 90)) | (1L << (BLUE - 90)) | (1L << (YELLOW - 90)) | (1L << (BLACK - 90)) | (1L << (WHITE - 90)) | (1L << (GREY - 90)) | (1L << (GREEN - 90)) | (1L << (GOLD - 90)) | (1L << (PURBLE - 90)) | (1L << (PINK - 90)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			widget();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CrossAxisAlignmentCrossAxisAlignmentContentContext extends ParserRuleContext {
		public TerminalNode CROSSAXISALIGNMENT() { return getToken(ParserFile.CROSSAXISALIGNMENT, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode CROSSAXISALIGNMENT_CLASS() { return getToken(ParserFile.CROSSAXISALIGNMENT_CLASS, 0); }
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ParserFile.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public CrossAxisAlignmentCrossAxisAlignmentContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossAxisAlignmentCrossAxisAlignmentContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCrossAxisAlignmentCrossAxisAlignmentContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCrossAxisAlignmentCrossAxisAlignmentContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCrossAxisAlignmentCrossAxisAlignmentContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrossAxisAlignmentCrossAxisAlignmentContentContext crossAxisAlignmentCrossAxisAlignmentContent() throws RecognitionException {
		CrossAxisAlignmentCrossAxisAlignmentContentContext _localctx = new CrossAxisAlignmentCrossAxisAlignmentContentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_crossAxisAlignmentCrossAxisAlignmentContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(CROSSAXISALIGNMENT);
			setState(245);
			match(COLON);
			setState(246);
			match(CROSSAXISALIGNMENT_CLASS);
			setState(247);
			match(DOT);
			setState(248);
			match(IDENTIFIER);
			setState(249);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainAxisAlignmentMainAxisAlignmentContentContext extends ParserRuleContext {
		public TerminalNode MAINAXISALIGNMENT() { return getToken(ParserFile.MAINAXISALIGNMENT, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode MAINAXISALIGNMENT_CLASS() { return getToken(ParserFile.MAINAXISALIGNMENT_CLASS, 0); }
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ParserFile.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public MainAxisAlignmentMainAxisAlignmentContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainAxisAlignmentMainAxisAlignmentContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterMainAxisAlignmentMainAxisAlignmentContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitMainAxisAlignmentMainAxisAlignmentContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitMainAxisAlignmentMainAxisAlignmentContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainAxisAlignmentMainAxisAlignmentContentContext mainAxisAlignmentMainAxisAlignmentContent() throws RecognitionException {
		MainAxisAlignmentMainAxisAlignmentContentContext _localctx = new MainAxisAlignmentMainAxisAlignmentContentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_mainAxisAlignmentMainAxisAlignmentContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(MAINAXISALIGNMENT);
			setState(252);
			match(COLON);
			setState(253);
			match(MAINAXISALIGNMENT_CLASS);
			setState(254);
			match(DOT);
			setState(255);
			match(IDENTIFIER);
			setState(256);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChildrenChildrenContentContext extends ParserRuleContext {
		public TerminalNode CHILDREN() { return getToken(ParserFile.CHILDREN, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode SQUARE_OPEN() { return getToken(ParserFile.SQUARE_OPEN, 0); }
		public TerminalNode SQUARE_CLOSE() { return getToken(ParserFile.SQUARE_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public List<WidgetContext> widget() {
			return getRuleContexts(WidgetContext.class);
		}
		public WidgetContext widget(int i) {
			return getRuleContext(WidgetContext.class,i);
		}
		public ChildrenChildrenContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childrenChildrenContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterChildrenChildrenContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitChildrenChildrenContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitChildrenChildrenContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildrenChildrenContentContext childrenChildrenContent() throws RecognitionException {
		ChildrenChildrenContentContext _localctx = new ChildrenChildrenContentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_childrenChildrenContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(CHILDREN);
			setState(259);
			match(COLON);
			setState(260);
			match(SQUARE_OPEN);
			setState(262); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(261);
				widget();
				}
				}
				setState(264); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (STACK - 47)) | (1L << (CONTAINER_CONS - 47)) | (1L << (IMAGE_CONS - 47)) | (1L << (TEXT_CONS - 47)))) != 0) || ((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (SIZEDBOX - 213)) | (1L << (ROW - 213)) | (1L << (MATERIALBUTTON - 213)) | (1L << (COLUMN - 213)) | (1L << (LISTVIEW - 213)))) != 0) );
			setState(266);
			match(SQUARE_CLOSE);
			setState(267);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChildrenChildrenContentStackContext extends ParserRuleContext {
		public TerminalNode CHILDREN() { return getToken(ParserFile.CHILDREN, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode SQUARE_OPEN() { return getToken(ParserFile.SQUARE_OPEN, 0); }
		public TerminalNode SQUARE_CLOSE() { return getToken(ParserFile.SQUARE_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public List<WidgetPositionedContext> widgetPositioned() {
			return getRuleContexts(WidgetPositionedContext.class);
		}
		public WidgetPositionedContext widgetPositioned(int i) {
			return getRuleContext(WidgetPositionedContext.class,i);
		}
		public List<WidgetContext> widget() {
			return getRuleContexts(WidgetContext.class);
		}
		public WidgetContext widget(int i) {
			return getRuleContext(WidgetContext.class,i);
		}
		public ChildrenChildrenContentStackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childrenChildrenContentStack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterChildrenChildrenContentStack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitChildrenChildrenContentStack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitChildrenChildrenContentStack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildrenChildrenContentStackContext childrenChildrenContentStack() throws RecognitionException {
		ChildrenChildrenContentStackContext _localctx = new ChildrenChildrenContentStackContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_childrenChildrenContentStack);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(CHILDREN);
			setState(270);
			match(COLON);
			setState(271);
			match(SQUARE_OPEN);
			setState(274); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(274);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case POSITIONED:
					{
					setState(272);
					widgetPositioned();
					}
					break;
				case STACK:
				case CONTAINER_CONS:
				case IMAGE_CONS:
				case TEXT_CONS:
				case SIZEDBOX:
				case ROW:
				case MATERIALBUTTON:
				case COLUMN:
				case LISTVIEW:
					{
					setState(273);
					widget();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (STACK - 47)) | (1L << (POSITIONED - 47)) | (1L << (CONTAINER_CONS - 47)) | (1L << (IMAGE_CONS - 47)) | (1L << (TEXT_CONS - 47)))) != 0) || ((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (SIZEDBOX - 213)) | (1L << (ROW - 213)) | (1L << (MATERIALBUTTON - 213)) | (1L << (COLUMN - 213)) | (1L << (LISTVIEW - 213)))) != 0) );
			setState(278);
			match(SQUARE_CLOSE);
			setState(279);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidgetContext extends ParserRuleContext {
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public SizedBoxContext sizedBox() {
			return getRuleContext(SizedBoxContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public ListviewContext listview() {
			return getRuleContext(ListviewContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public StackContext stack() {
			return getRuleContext(StackContext.class,0);
		}
		public MaterialButtonContext materialButton() {
			return getRuleContext(MaterialButtonContext.class,0);
		}
		public WidgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitWidget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetContext widget() throws RecognitionException {
		WidgetContext _localctx = new WidgetContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_widget);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTAINER_CONS:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				container();
				}
				break;
			case TEXT_CONS:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				text();
				}
				break;
			case SIZEDBOX:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				sizedBox();
				}
				break;
			case IMAGE_CONS:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				image();
				}
				break;
			case LISTVIEW:
				enterOuterAlt(_localctx, 5);
				{
				setState(285);
				listview();
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 6);
				{
				setState(286);
				column();
				}
				break;
			case ROW:
				enterOuterAlt(_localctx, 7);
				{
				setState(287);
				row();
				}
				break;
			case STACK:
				enterOuterAlt(_localctx, 8);
				{
				setState(288);
				stack();
				}
				break;
			case MATERIALBUTTON:
				enterOuterAlt(_localctx, 9);
				{
				setState(289);
				materialButton();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContainerContext extends ParserRuleContext {
		public TerminalNode CONTAINER_CONS() { return getToken(ParserFile.CONTAINER_CONS, 0); }
		public TerminalNode PARENTHESES_OPEN() { return getToken(ParserFile.PARENTHESES_OPEN, 0); }
		public TerminalNode PARENTHESES_CLOSE() { return getToken(ParserFile.PARENTHESES_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public ColorGrammarContext colorGrammar() {
			return getRuleContext(ColorGrammarContext.class,0);
		}
		public HeightGrammarContext heightGrammar() {
			return getRuleContext(HeightGrammarContext.class,0);
		}
		public WidthWidthContentContext widthWidthContent() {
			return getRuleContext(WidthWidthContentContext.class,0);
		}
		public TerminalNode CHILD() { return getToken(ParserFile.CHILD, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public ContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitContainer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitContainer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerContext container() throws RecognitionException {
		ContainerContext _localctx = new ContainerContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_container);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(CONTAINER_CONS);
			setState(293);
			match(PARENTHESES_OPEN);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLOR) {
				{
				setState(294);
				colorGrammar();
				}
			}

			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HEIGHT) {
				{
				setState(297);
				heightGrammar();
				}
			}

			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WIDTH) {
				{
				setState(300);
				widthWidthContent();
				}
			}

			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD) {
				{
				setState(303);
				match(CHILD);
				setState(304);
				match(COLON);
				setState(305);
				widget();
				}
			}

			setState(308);
			match(PARENTHESES_CLOSE);
			setState(309);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidthWidthContentContext extends ParserRuleContext {
		public TerminalNode WIDTH() { return getToken(ParserFile.WIDTH, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode DOUBLE() { return getToken(ParserFile.DOUBLE, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public WidthWidthContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widthWidthContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterWidthWidthContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitWidthWidthContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitWidthWidthContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthWidthContentContext widthWidthContent() throws RecognitionException {
		WidthWidthContentContext _localctx = new WidthWidthContentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_widthWidthContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(WIDTH);
			setState(312);
			match(COLON);
			setState(313);
			match(DOUBLE);
			setState(314);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT_CONS() { return getToken(ParserFile.TEXT_CONS, 0); }
		public TerminalNode PARENTHESES_OPEN() { return getToken(ParserFile.PARENTHESES_OPEN, 0); }
		public TextBodyContext textBody() {
			return getRuleContext(TextBodyContext.class,0);
		}
		public TerminalNode PARENTHESES_CLOSE() { return getToken(ParserFile.PARENTHESES_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(TEXT_CONS);
			setState(317);
			match(PARENTHESES_OPEN);
			setState(318);
			textBody();
			setState(319);
			match(PARENTHESES_CLOSE);
			setState(320);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextBodyContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public List<TextAttributesContext> textAttributes() {
			return getRuleContexts(TextAttributesContext.class);
		}
		public TextAttributesContext textAttributes(int i) {
			return getRuleContext(TextAttributesContext.class,i);
		}
		public TextBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTextBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTextBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTextBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextBodyContext textBody() throws RecognitionException {
		TextBodyContext _localctx = new TextBodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_textBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			stringLiteral();
			setState(323);
			match(COMMA);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STYLE) {
				{
				{
				setState(324);
				textAttributes();
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextAttributesContext extends ParserRuleContext {
		public TextStyleContext textStyle() {
			return getRuleContext(TextStyleContext.class,0);
		}
		public TextAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTextAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTextAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTextAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextAttributesContext textAttributes() throws RecognitionException {
		TextAttributesContext _localctx = new TextAttributesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_textAttributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			textStyle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextStyleContext extends ParserRuleContext {
		public TerminalNode STYLE() { return getToken(ParserFile.STYLE, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode TEXTSTYLE_CONS() { return getToken(ParserFile.TEXTSTYLE_CONS, 0); }
		public TerminalNode PARENTHESES_OPEN() { return getToken(ParserFile.PARENTHESES_OPEN, 0); }
		public TerminalNode PARENTHESES_CLOSE() { return getToken(ParserFile.PARENTHESES_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public List<TextStyleAttributesContext> textStyleAttributes() {
			return getRuleContexts(TextStyleAttributesContext.class);
		}
		public TextStyleAttributesContext textStyleAttributes(int i) {
			return getRuleContext(TextStyleAttributesContext.class,i);
		}
		public TextStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTextStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTextStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTextStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextStyleContext textStyle() throws RecognitionException {
		TextStyleContext _localctx = new TextStyleContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_textStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(STYLE);
			setState(333);
			match(COLON);
			setState(334);
			match(TEXTSTYLE_CONS);
			setState(335);
			match(PARENTHESES_OPEN);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLOR) | (1L << FONTSIZE) | (1L << FONTFAMILY) | (1L << FONTSTYLE) | (1L << HEIGHT))) != 0)) {
				{
				{
				setState(336);
				textStyleAttributes();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			match(PARENTHESES_CLOSE);
			setState(343);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextStyleAttributesContext extends ParserRuleContext {
		public ColorGrammarContext colorGrammar() {
			return getRuleContext(ColorGrammarContext.class,0);
		}
		public HeightGrammarContext heightGrammar() {
			return getRuleContext(HeightGrammarContext.class,0);
		}
		public FontFamilyGrammarContext fontFamilyGrammar() {
			return getRuleContext(FontFamilyGrammarContext.class,0);
		}
		public FontStyleGrammarContext fontStyleGrammar() {
			return getRuleContext(FontStyleGrammarContext.class,0);
		}
		public FontSizeGrammarContext fontSizeGrammar() {
			return getRuleContext(FontSizeGrammarContext.class,0);
		}
		public TextStyleAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textStyleAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTextStyleAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTextStyleAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTextStyleAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextStyleAttributesContext textStyleAttributes() throws RecognitionException {
		TextStyleAttributesContext _localctx = new TextStyleAttributesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_textStyleAttributes);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				colorGrammar();
				}
				break;
			case HEIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				heightGrammar();
				}
				break;
			case FONTFAMILY:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				fontFamilyGrammar();
				}
				break;
			case FONTSTYLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(348);
				fontStyleGrammar();
				}
				break;
			case FONTSIZE:
				enterOuterAlt(_localctx, 5);
				{
				setState(349);
				fontSizeGrammar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode STRING_SINGLE_QU() { return getToken(ParserFile.STRING_SINGLE_QU, 0); }
		public TerminalNode STRING_SINGLE_DOUBLE_QU() { return getToken(ParserFile.STRING_SINGLE_DOUBLE_QU, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if ( !(_la==STRING_SINGLE_QU || _la==STRING_SINGLE_DOUBLE_QU) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SizedBoxContext extends ParserRuleContext {
		public TerminalNode SIZEDBOX() { return getToken(ParserFile.SIZEDBOX, 0); }
		public TerminalNode PARENTHESES_OPEN() { return getToken(ParserFile.PARENTHESES_OPEN, 0); }
		public TerminalNode PARENTHESES_CLOSE() { return getToken(ParserFile.PARENTHESES_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public HeightGrammarContext heightGrammar() {
			return getRuleContext(HeightGrammarContext.class,0);
		}
		public SizedBoxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizedBox; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSizedBox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSizedBox(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSizedBox(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizedBoxContext sizedBox() throws RecognitionException {
		SizedBoxContext _localctx = new SizedBoxContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_sizedBox);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(SIZEDBOX);
			setState(355);
			match(PARENTHESES_OPEN);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HEIGHT) {
				{
				setState(356);
				heightGrammar();
				}
			}

			setState(359);
			match(PARENTHESES_CLOSE);
			setState(360);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImageContext extends ParserRuleContext {
		public TerminalNode IMAGE_CONS() { return getToken(ParserFile.IMAGE_CONS, 0); }
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public TerminalNode ASSET() { return getToken(ParserFile.ASSET, 0); }
		public TerminalNode PARENTHESES_OPEN() { return getToken(ParserFile.PARENTHESES_OPEN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ParserFile.STRING_LITERAL, 0); }
		public TerminalNode PARENTHESES_CLOSE() { return getToken(ParserFile.PARENTHESES_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_image);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(IMAGE_CONS);
			setState(363);
			match(DOT);
			setState(364);
			match(ASSET);
			setState(365);
			match(PARENTHESES_OPEN);
			setState(366);
			match(STRING_LITERAL);
			setState(367);
			match(PARENTHESES_CLOSE);
			setState(368);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowContext extends ParserRuleContext {
		public TerminalNode ROW() { return getToken(ParserFile.ROW, 0); }
		public TerminalNode PARENTHESES_OPEN() { return getToken(ParserFile.PARENTHESES_OPEN, 0); }
		public TerminalNode PARENTHESES_CLOSE() { return getToken(ParserFile.PARENTHESES_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public MainAxisAlignmentMainAxisAlignmentContentContext mainAxisAlignmentMainAxisAlignmentContent() {
			return getRuleContext(MainAxisAlignmentMainAxisAlignmentContentContext.class,0);
		}
		public List<ChildrenChildrenContentContext> childrenChildrenContent() {
			return getRuleContexts(ChildrenChildrenContentContext.class);
		}
		public ChildrenChildrenContentContext childrenChildrenContent(int i) {
			return getRuleContext(ChildrenChildrenContentContext.class,i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(ROW);
			setState(371);
			match(PARENTHESES_OPEN);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAINAXISALIGNMENT) {
				{
				setState(372);
				mainAxisAlignmentMainAxisAlignmentContent();
				}
			}

			setState(376); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(375);
				childrenChildrenContent();
				}
				}
				setState(378); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHILDREN );
			setState(380);
			match(PARENTHESES_CLOSE);
			setState(381);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaterialButtonContext extends ParserRuleContext {
		public TerminalNode MATERIALBUTTON() { return getToken(ParserFile.MATERIALBUTTON, 0); }
		public TerminalNode PARENTHESES_OPEN() { return getToken(ParserFile.PARENTHESES_OPEN, 0); }
		public TerminalNode PARENTHESES_CLOSE() { return getToken(ParserFile.PARENTHESES_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public OnPressedOnPressedContentContext onPressedOnPressedContent() {
			return getRuleContext(OnPressedOnPressedContentContext.class,0);
		}
		public TerminalNode CHILD() { return getToken(ParserFile.CHILD, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public MaterialButtonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materialButton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterMaterialButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitMaterialButton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitMaterialButton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaterialButtonContext materialButton() throws RecognitionException {
		MaterialButtonContext _localctx = new MaterialButtonContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_materialButton);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(MATERIALBUTTON);
			setState(384);
			match(PARENTHESES_OPEN);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONPRESSED) {
				{
				setState(385);
				onPressedOnPressedContent();
				}
			}

			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD) {
				{
				setState(388);
				match(CHILD);
				setState(389);
				match(COLON);
				setState(390);
				widget();
				}
			}

			setState(393);
			match(PARENTHESES_CLOSE);
			setState(394);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnPressedOnPressedContentContext extends ParserRuleContext {
		public TerminalNode ONPRESSED() { return getToken(ParserFile.ONPRESSED, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode PARENTHESES_OPEN() { return getToken(ParserFile.PARENTHESES_OPEN, 0); }
		public TerminalNode PARENTHESES_CLOSE() { return getToken(ParserFile.PARENTHESES_CLOSE, 0); }
		public TerminalNode CURLY_OPEN() { return getToken(ParserFile.CURLY_OPEN, 0); }
		public TerminalNode CURLY_CLOSE() { return getToken(ParserFile.CURLY_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public PrintPrintContentContext printPrintContent() {
			return getRuleContext(PrintPrintContentContext.class,0);
		}
		public OnPressedOnPressedContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onPressedOnPressedContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterOnPressedOnPressedContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitOnPressedOnPressedContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitOnPressedOnPressedContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnPressedOnPressedContentContext onPressedOnPressedContent() throws RecognitionException {
		OnPressedOnPressedContentContext _localctx = new OnPressedOnPressedContentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_onPressedOnPressedContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(ONPRESSED);
			setState(397);
			match(COLON);
			setState(398);
			match(PARENTHESES_OPEN);
			setState(399);
			match(PARENTHESES_CLOSE);
			setState(400);
			match(CURLY_OPEN);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRINT) {
				{
				setState(401);
				printPrintContent();
				}
			}

			setState(404);
			match(CURLY_CLOSE);
			setState(405);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintPrintContentContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ParserFile.PRINT, 0); }
		public TerminalNode PARENTHESES_OPEN() { return getToken(ParserFile.PARENTHESES_OPEN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ParserFile.STRING_LITERAL, 0); }
		public TerminalNode PARENTHESES_CLOSE() { return getToken(ParserFile.PARENTHESES_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserFile.SEMICOLON, 0); }
		public PrintPrintContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printPrintContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterPrintPrintContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitPrintPrintContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitPrintPrintContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintPrintContentContext printPrintContent() throws RecognitionException {
		PrintPrintContentContext _localctx = new PrintPrintContentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_printPrintContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(PRINT);
			setState(408);
			match(PARENTHESES_OPEN);
			setState(409);
			match(STRING_LITERAL);
			setState(410);
			match(PARENTHESES_CLOSE);
			setState(411);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(ParserFile.COLUMN, 0); }
		public TerminalNode PARENTHESES_OPEN() { return getToken(ParserFile.PARENTHESES_OPEN, 0); }
		public TerminalNode PARENTHESES_CLOSE() { return getToken(ParserFile.PARENTHESES_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public CrossAxisAlignmentCrossAxisAlignmentContentContext crossAxisAlignmentCrossAxisAlignmentContent() {
			return getRuleContext(CrossAxisAlignmentCrossAxisAlignmentContentContext.class,0);
		}
		public List<ChildrenChildrenContentContext> childrenChildrenContent() {
			return getRuleContexts(ChildrenChildrenContentContext.class);
		}
		public ChildrenChildrenContentContext childrenChildrenContent(int i) {
			return getRuleContext(ChildrenChildrenContentContext.class,i);
		}
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(COLUMN);
			setState(414);
			match(PARENTHESES_OPEN);
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CROSSAXISALIGNMENT) {
				{
				setState(415);
				crossAxisAlignmentCrossAxisAlignmentContent();
				}
			}

			setState(419); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(418);
				childrenChildrenContent();
				}
				}
				setState(421); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHILDREN );
			setState(423);
			match(PARENTHESES_CLOSE);
			setState(424);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListviewContext extends ParserRuleContext {
		public TerminalNode LISTVIEW() { return getToken(ParserFile.LISTVIEW, 0); }
		public TerminalNode PARENTHESES_OPEN() { return getToken(ParserFile.PARENTHESES_OPEN, 0); }
		public TerminalNode PARENTHESES_CLOSE() { return getToken(ParserFile.PARENTHESES_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public PaddingContext padding() {
			return getRuleContext(PaddingContext.class,0);
		}
		public List<ChildrenChildrenContentContext> childrenChildrenContent() {
			return getRuleContexts(ChildrenChildrenContentContext.class);
		}
		public ChildrenChildrenContentContext childrenChildrenContent(int i) {
			return getRuleContext(ChildrenChildrenContentContext.class,i);
		}
		public ListviewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listview; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterListview(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitListview(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitListview(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListviewContext listview() throws RecognitionException {
		ListviewContext _localctx = new ListviewContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_listview);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(LISTVIEW);
			setState(427);
			match(PARENTHESES_OPEN);
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(428);
				padding();
				}
			}

			setState(432); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(431);
				childrenChildrenContent();
				}
				}
				setState(434); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHILDREN );
			setState(436);
			match(PARENTHESES_CLOSE);
			setState(437);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PaddingContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ParserFile.CONST, 0); }
		public TerminalNode EDGEINSETS() { return getToken(ParserFile.EDGEINSETS, 0); }
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public TerminalNode ALL() { return getToken(ParserFile.ALL, 0); }
		public TerminalNode PARENTHESES_OPEN() { return getToken(ParserFile.PARENTHESES_OPEN, 0); }
		public TerminalNode DIGIT() { return getToken(ParserFile.DIGIT, 0); }
		public TerminalNode PARENTHESES_CLOSE() { return getToken(ParserFile.PARENTHESES_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public PaddingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_padding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterPadding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitPadding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitPadding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaddingContext padding() throws RecognitionException {
		PaddingContext _localctx = new PaddingContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_padding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(CONST);
			setState(440);
			match(EDGEINSETS);
			setState(441);
			match(DOT);
			setState(442);
			match(ALL);
			setState(443);
			match(PARENTHESES_OPEN);
			setState(444);
			match(DIGIT);
			setState(445);
			match(PARENTHESES_CLOSE);
			setState(446);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StackContext extends ParserRuleContext {
		public TerminalNode STACK() { return getToken(ParserFile.STACK, 0); }
		public TerminalNode PARENTHESES_OPEN() { return getToken(ParserFile.PARENTHESES_OPEN, 0); }
		public TerminalNode PARENTHESES_CLOSE() { return getToken(ParserFile.PARENTHESES_CLOSE, 0); }
		public WidthWidthContentContext widthWidthContent() {
			return getRuleContext(WidthWidthContentContext.class,0);
		}
		public HeightGrammarContext heightGrammar() {
			return getRuleContext(HeightGrammarContext.class,0);
		}
		public List<ChildrenChildrenContentStackContext> childrenChildrenContentStack() {
			return getRuleContexts(ChildrenChildrenContentStackContext.class);
		}
		public ChildrenChildrenContentStackContext childrenChildrenContentStack(int i) {
			return getRuleContext(ChildrenChildrenContentStackContext.class,i);
		}
		public StackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterStack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitStack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitStack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackContext stack() throws RecognitionException {
		StackContext _localctx = new StackContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_stack);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(STACK);
			setState(449);
			match(PARENTHESES_OPEN);
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDTH:
				{
				setState(450);
				widthWidthContent();
				}
				break;
			case HEIGHT:
				{
				setState(451);
				heightGrammar();
				}
				break;
			case CHILDREN:
				break;
			default:
				break;
			}
			setState(455); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(454);
				childrenChildrenContentStack();
				}
				}
				setState(457); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHILDREN );
			setState(459);
			match(PARENTHESES_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidgetPositionedContext extends ParserRuleContext {
		public TerminalNode POSITIONED() { return getToken(ParserFile.POSITIONED, 0); }
		public TerminalNode PARENTHESES_OPEN() { return getToken(ParserFile.PARENTHESES_OPEN, 0); }
		public TerminalNode PARENTHESES_CLOSE() { return getToken(ParserFile.PARENTHESES_CLOSE, 0); }
		public PositionedParamsContext positionedParams() {
			return getRuleContext(PositionedParamsContext.class,0);
		}
		public List<WidgetContext> widget() {
			return getRuleContexts(WidgetContext.class);
		}
		public WidgetContext widget(int i) {
			return getRuleContext(WidgetContext.class,i);
		}
		public WidgetPositionedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widgetPositioned; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterWidgetPositioned(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitWidgetPositioned(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitWidgetPositioned(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetPositionedContext widgetPositioned() throws RecognitionException {
		WidgetPositionedContext _localctx = new WidgetPositionedContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_widgetPositioned);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(POSITIONED);
			setState(462);
			match(PARENTHESES_OPEN);
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOP) | (1L << BOTTOM) | (1L << RIGHT) | (1L << LEFT))) != 0)) {
				{
				setState(463);
				positionedParams();
				}
			}

			setState(466);
			match(PARENTHESES_CLOSE);
			setState(468); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(467);
					widget();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(470); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PositionedParamsContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(ParserFile.LEFT, 0); }
		public TerminalNode EQUAL() { return getToken(ParserFile.EQUAL, 0); }
		public TerminalNode FLOAT() { return getToken(ParserFile.FLOAT, 0); }
		public TerminalNode TOP() { return getToken(ParserFile.TOP, 0); }
		public TerminalNode RIGHT() { return getToken(ParserFile.RIGHT, 0); }
		public TerminalNode BOTTOM() { return getToken(ParserFile.BOTTOM, 0); }
		public PositionedParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionedParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterPositionedParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitPositionedParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitPositionedParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionedParamsContext positionedParams() throws RecognitionException {
		PositionedParamsContext _localctx = new PositionedParamsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_positionedParams);
		try {
			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(LEFT);
				setState(473);
				match(EQUAL);
				setState(474);
				match(FLOAT);
				}
				break;
			case TOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				match(TOP);
				setState(476);
				match(EQUAL);
				setState(477);
				match(FLOAT);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				match(RIGHT);
				setState(479);
				match(EQUAL);
				setState(480);
				match(FLOAT);
				}
				break;
			case BOTTOM:
				enterOuterAlt(_localctx, 4);
				{
				setState(481);
				match(BOTTOM);
				setState(482);
				match(EQUAL);
				setState(483);
				match(FLOAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00dc\u01e7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u0001\u0000\u0001\u0000\u0004"+
		"\u0000c\b\u0000\u000b\u0000\f\u0000d\u0003\u0000g\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001s\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002x\b\u0002\u0001\u0002\u0003\u0002"+
		"{\b\u0002\u0001\u0002\u0003\u0002~\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0091\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0005\u0007\u0097\b\u0007\n\u0007\f\u0007"+
		"\u009a\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0004\b\u00a6\b\b\u000b\b\f\b\u00a7\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u00ad\b\b\u0001\t\u0001\t\u0001\t\u0003\t\u00b2\b\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0005\n\u00b8\b\n\n\n\f\n\u00bb\t\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c0\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0004\u0019\u0107\b\u0019"+
		"\u000b\u0019\f\u0019\u0108\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0004\u001a\u0113\b\u001a"+
		"\u000b\u001a\f\u001a\u0114\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u0123\b\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u0128\b\u001c\u0001\u001c\u0003\u001c\u012b\b"+
		"\u001c\u0001\u001c\u0003\u001c\u012e\b\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u0133\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u0146\b\u001f\n\u001f\f\u001f\u0149\t\u001f"+
		"\u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u0152\b!\n!\f"+
		"!\u0155\t!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u015f\b\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0003$\u0166\b"+
		"$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0003&\u0176\b&\u0001&\u0004&\u0179\b&\u000b"+
		"&\f&\u017a\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0003\'\u0183"+
		"\b\'\u0001\'\u0001\'\u0001\'\u0003\'\u0188\b\'\u0001\'\u0001\'\u0001\'"+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0193\b(\u0001(\u0001"+
		"(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001"+
		"*\u0003*\u01a1\b*\u0001*\u0004*\u01a4\b*\u000b*\f*\u01a5\u0001*\u0001"+
		"*\u0001*\u0001+\u0001+\u0001+\u0003+\u01ae\b+\u0001+\u0004+\u01b1\b+\u000b"+
		"+\f+\u01b2\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0003-\u01c5\b-\u0001"+
		"-\u0004-\u01c8\b-\u000b-\f-\u01c9\u0001-\u0001-\u0001.\u0001.\u0001.\u0003"+
		".\u01d1\b.\u0001.\u0001.\u0004.\u01d5\b.\u000b.\f.\u01d6\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0003/\u01e5\b/\u0001/\u0000\u00000\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^\u0000\u0004\u0001\u0000\u0001\u0002\u0001\u0000de\u0001"+
		"\u0000Zc\u0001\u0000\n\u000b\u01f4\u0000f\u0001\u0000\u0000\u0000\u0002"+
		"r\u0001\u0000\u0000\u0000\u0004t\u0001\u0000\u0000\u0000\u0006\u0081\u0001"+
		"\u0000\u0000\u0000\b\u0085\u0001\u0000\u0000\u0000\n\u0089\u0001\u0000"+
		"\u0000\u0000\f\u008d\u0001\u0000\u0000\u0000\u000e\u0098\u0001\u0000\u0000"+
		"\u0000\u0010\u00ac\u0001\u0000\u0000\u0000\u0012\u00ae\u0001\u0000\u0000"+
		"\u0000\u0014\u00b9\u0001\u0000\u0000\u0000\u0016\u00bf\u0001\u0000\u0000"+
		"\u0000\u0018\u00c1\u0001\u0000\u0000\u0000\u001a\u00c5\u0001\u0000\u0000"+
		"\u0000\u001c\u00cc\u0001\u0000\u0000\u0000\u001e\u00d3\u0001\u0000\u0000"+
		"\u0000 \u00d8\u0001\u0000\u0000\u0000\"\u00dd\u0001\u0000\u0000\u0000"+
		"$\u00e2\u0001\u0000\u0000\u0000&\u00e7\u0001\u0000\u0000\u0000(\u00ee"+
		"\u0001\u0000\u0000\u0000*\u00f0\u0001\u0000\u0000\u0000,\u00f2\u0001\u0000"+
		"\u0000\u0000.\u00f4\u0001\u0000\u0000\u00000\u00fb\u0001\u0000\u0000\u0000"+
		"2\u0102\u0001\u0000\u0000\u00004\u010d\u0001\u0000\u0000\u00006\u0122"+
		"\u0001\u0000\u0000\u00008\u0124\u0001\u0000\u0000\u0000:\u0137\u0001\u0000"+
		"\u0000\u0000<\u013c\u0001\u0000\u0000\u0000>\u0142\u0001\u0000\u0000\u0000"+
		"@\u014a\u0001\u0000\u0000\u0000B\u014c\u0001\u0000\u0000\u0000D\u015e"+
		"\u0001\u0000\u0000\u0000F\u0160\u0001\u0000\u0000\u0000H\u0162\u0001\u0000"+
		"\u0000\u0000J\u016a\u0001\u0000\u0000\u0000L\u0172\u0001\u0000\u0000\u0000"+
		"N\u017f\u0001\u0000\u0000\u0000P\u018c\u0001\u0000\u0000\u0000R\u0197"+
		"\u0001\u0000\u0000\u0000T\u019d\u0001\u0000\u0000\u0000V\u01aa\u0001\u0000"+
		"\u0000\u0000X\u01b7\u0001\u0000\u0000\u0000Z\u01c0\u0001\u0000\u0000\u0000"+
		"\\\u01cd\u0001\u0000\u0000\u0000^\u01e4\u0001\u0000\u0000\u0000`g\u0003"+
		"\u0004\u0002\u0000ac\u0003\u0002\u0001\u0000ba\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000eg\u0001\u0000\u0000\u0000f`\u0001\u0000\u0000\u0000fb\u0001\u0000"+
		"\u0000\u0000g\u0001\u0001\u0000\u0000\u0000hs\u0003\f\u0006\u0000is\u0003"+
		"\u0012\t\u0000js\u0003,\u0016\u0000ks\u0003T*\u0000ls\u00038\u001c\u0000"+
		"ms\u0003<\u001e\u0000ns\u0003H$\u0000os\u0003J%\u0000ps\u0003L&\u0000"+
		"qs\u0003N\'\u0000rh\u0001\u0000\u0000\u0000ri\u0001\u0000\u0000\u0000"+
		"rj\u0001\u0000\u0000\u0000rk\u0001\u0000\u0000\u0000rl\u0001\u0000\u0000"+
		"\u0000rm\u0001\u0000\u0000\u0000rn\u0001\u0000\u0000\u0000ro\u0001\u0000"+
		"\u0000\u0000rp\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000s\u0003"+
		"\u0001\u0000\u0000\u0000tu\u0005\t\u0000\u0000uw\u0005\u001e\u0000\u0000"+
		"vx\u0003\u0006\u0003\u0000wv\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xz\u0001\u0000\u0000\u0000y{\u0003\b\u0004\u0000zy\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|~\u0003\n\u0005"+
		"\u0000}|\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005\u001f\u0000\u0000\u0080\u0005\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0005$\u0000\u0000\u0082\u0083\u0005\u000f"+
		"\u0000\u0000\u0083\u0084\u0003\f\u0006\u0000\u0084\u0007\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0005%\u0000\u0000\u0086\u0087\u0005\u000f\u0000\u0000"+
		"\u0087\u0088\u0003\u0012\t\u0000\u0088\t\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005&\u0000\u0000\u008a\u008b\u0005\u000f\u0000\u0000\u008b\u008c"+
		"\u0003,\u0016\u0000\u008c\u000b\u0001\u0000\u0000\u0000\u008d\u008e\u0005"+
		"F\u0000\u0000\u008e\u0090\u0005\u001e\u0000\u0000\u008f\u0091\u0003\u000e"+
		"\u0007\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u001f"+
		"\u0000\u0000\u0093\u0094\u0005\r\u0000\u0000\u0094\r\u0001\u0000\u0000"+
		"\u0000\u0095\u0097\u0003\u0010\b\u0000\u0096\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u000f\u0001\u0000\u0000\u0000"+
		"\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009c\u0005B\u0000\u0000\u009c"+
		"\u009d\u0005\u000f\u0000\u0000\u009d\u00ad\u00036\u001b\u0000\u009e\u009f"+
		"\u0005C\u0000\u0000\u009f\u00a0\u0005\u000f\u0000\u0000\u00a0\u00ad\u0003"+
		"6\u001b\u0000\u00a1\u00a2\u0005D\u0000\u0000\u00a2\u00a3\u0005\u000f\u0000"+
		"\u0000\u00a3\u00a5\u0005 \u0000\u0000\u00a4\u00a6\u00036\u001b\u0000\u00a5"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005!\u0000\u0000\u00aa\u00ab"+
		"\u0005\r\u0000\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u009b\u0001"+
		"\u0000\u0000\u0000\u00ac\u009e\u0001\u0000\u0000\u0000\u00ac\u00a1\u0001"+
		"\u0000\u0000\u0000\u00ad\u0011\u0001\u0000\u0000\u0000\u00ae\u00af\u0005"+
		"G\u0000\u0000\u00af\u00b1\u0005\u001e\u0000\u0000\u00b0\u00b2\u0003\u0014"+
		"\n\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u001f\u0000"+
		"\u0000\u00b4\u00b5\u0005\r\u0000\u0000\u00b5\u0013\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b8\u0003\u0016\u000b\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u0015\u0001\u0000\u0000\u0000"+
		"\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00c0\u0003\u0018\f\u0000\u00bd"+
		"\u00c0\u0003\u001c\u000e\u0000\u00be\u00c0\u0003\u001e\u000f\u0000\u00bf"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf"+
		"\u00be\u0001\u0000\u0000\u0000\u00c0\u0017\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u00055\u0000\u0000\u00c2\u00c3\u0005\u000f\u0000\u0000\u00c3\u00c4"+
		"\u00036\u001b\u0000\u00c4\u0019\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005"+
		"\'\u0000\u0000\u00c6\u00c7\u0005\u000f\u0000\u0000\u00c7\u00c8\u0005X"+
		"\u0000\u0000\u00c8\u00c9\u0005\u0010\u0000\u0000\u00c9\u00ca\u0003*\u0015"+
		"\u0000\u00ca\u00cb\u0005\r\u0000\u0000\u00cb\u001b\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0005E\u0000\u0000\u00cd\u00ce\u0005\u000f\u0000\u0000\u00ce"+
		"\u00cf\u0005X\u0000\u0000\u00cf\u00d0\u0005\u0010\u0000\u0000\u00d0\u00d1"+
		"\u0003*\u0015\u0000\u00d1\u00d2\u0005\r\u0000\u0000\u00d2\u001d\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0005.\u0000\u0000\u00d4\u00d5\u0005\u000f"+
		"\u0000\u0000\u00d5\u00d6\u0007\u0000\u0000\u0000\u00d6\u00d7\u0005\r\u0000"+
		"\u0000\u00d7\u001f\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005-\u0000\u0000"+
		"\u00d9\u00da\u0005\u000f\u0000\u0000\u00da\u00db\u0007\u0000\u0000\u0000"+
		"\u00db\u00dc\u0005\r\u0000\u0000\u00dc!\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0005*\u0000\u0000\u00de\u00df\u0005\u000f\u0000\u0000\u00df\u00e0"+
		"\u0003F#\u0000\u00e0\u00e1\u0005\r\u0000\u0000\u00e1#\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0005)\u0000\u0000\u00e3\u00e4\u0005\u000f\u0000\u0000"+
		"\u00e4\u00e5\u0007\u0000\u0000\u0000\u00e5\u00e6\u0005\r\u0000\u0000\u00e6"+
		"%\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005+\u0000\u0000\u00e8\u00e9\u0005"+
		"\u000f\u0000\u0000\u00e9\u00ea\u0005Y\u0000\u0000\u00ea\u00eb\u0005\u0010"+
		"\u0000\u0000\u00eb\u00ec\u0003(\u0014\u0000\u00ec\u00ed\u0005\r\u0000"+
		"\u0000\u00ed\'\u0001\u0000\u0000\u0000\u00ee\u00ef\u0007\u0001\u0000\u0000"+
		"\u00ef)\u0001\u0000\u0000\u0000\u00f0\u00f1\u0007\u0002\u0000\u0000\u00f1"+
		"+\u0001\u0000\u0000\u0000\u00f2\u00f3\u00036\u001b\u0000\u00f3-\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0005?\u0000\u0000\u00f5\u00f6\u0005\u000f"+
		"\u0000\u0000\u00f6\u00f7\u0005U\u0000\u0000\u00f7\u00f8\u0005\u0010\u0000"+
		"\u0000\u00f8\u00f9\u0005\u00cc\u0000\u0000\u00f9\u00fa\u0005\r\u0000\u0000"+
		"\u00fa/\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005@\u0000\u0000\u00fc\u00fd"+
		"\u0005\u000f\u0000\u0000\u00fd\u00fe\u0005V\u0000\u0000\u00fe\u00ff\u0005"+
		"\u0010\u0000\u0000\u00ff\u0100\u0005\u00cc\u0000\u0000\u0100\u0101\u0005"+
		"\r\u0000\u0000\u01011\u0001\u0000\u0000\u0000\u0102\u0103\u00056\u0000"+
		"\u0000\u0103\u0104\u0005\u000f\u0000\u0000\u0104\u0106\u0005 \u0000\u0000"+
		"\u0105\u0107\u00036\u001b\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108"+
		"\u0109\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0005!\u0000\u0000\u010b\u010c\u0005\r\u0000\u0000\u010c3\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u00056\u0000\u0000\u010e\u010f\u0005\u000f"+
		"\u0000\u0000\u010f\u0112\u0005 \u0000\u0000\u0110\u0113\u0003\\.\u0000"+
		"\u0111\u0113\u00036\u001b\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112"+
		"\u0111\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114"+
		"\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0005!\u0000\u0000\u0117\u0118"+
		"\u0005\r\u0000\u0000\u01185\u0001\u0000\u0000\u0000\u0119\u0123\u0003"+
		"8\u001c\u0000\u011a\u0123\u0003<\u001e\u0000\u011b\u0123\u0003H$\u0000"+
		"\u011c\u0123\u0003J%\u0000\u011d\u0123\u0003V+\u0000\u011e\u0123\u0003"+
		"T*\u0000\u011f\u0123\u0003L&\u0000\u0120\u0123\u0003Z-\u0000\u0121\u0123"+
		"\u0003N\'\u0000\u0122\u0119\u0001\u0000\u0000\u0000\u0122\u011a\u0001"+
		"\u0000\u0000\u0000\u0122\u011b\u0001\u0000\u0000\u0000\u0122\u011c\u0001"+
		"\u0000\u0000\u0000\u0122\u011d\u0001\u0000\u0000\u0000\u0122\u011e\u0001"+
		"\u0000\u0000\u0000\u0122\u011f\u0001\u0000\u0000\u0000\u0122\u0120\u0001"+
		"\u0000\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u01237\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0005H\u0000\u0000\u0125\u0127\u0005\u001e\u0000"+
		"\u0000\u0126\u0128\u0003\u001a\r\u0000\u0127\u0126\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012a\u0001\u0000\u0000\u0000"+
		"\u0129\u012b\u0003 \u0010\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012a"+
		"\u012b\u0001\u0000\u0000\u0000\u012b\u012d\u0001\u0000\u0000\u0000\u012c"+
		"\u012e\u0003:\u001d\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0001\u0000\u0000\u0000\u012e\u0132\u0001\u0000\u0000\u0000\u012f\u0130"+
		"\u00055\u0000\u0000\u0130\u0131\u0005\u000f\u0000\u0000\u0131\u0133\u0003"+
		"6\u001b\u0000\u0132\u012f\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000"+
		"\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135\u0005\u001f"+
		"\u0000\u0000\u0135\u0136\u0005\r\u0000\u0000\u01369\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\u0005.\u0000\u0000\u0138\u0139\u0005\u000f\u0000\u0000"+
		"\u0139\u013a\u0005\u0002\u0000\u0000\u013a\u013b\u0005\r\u0000\u0000\u013b"+
		";\u0001\u0000\u0000\u0000\u013c\u013d\u0005L\u0000\u0000\u013d\u013e\u0005"+
		"\u001e\u0000\u0000\u013e\u013f\u0003>\u001f\u0000\u013f\u0140\u0005\u001f"+
		"\u0000\u0000\u0140\u0141\u0005\r\u0000\u0000\u0141=\u0001\u0000\u0000"+
		"\u0000\u0142\u0143\u0003F#\u0000\u0143\u0147\u0005\r\u0000\u0000\u0144"+
		"\u0146\u0003@ \u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146\u0149\u0001"+
		"\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001"+
		"\u0000\u0000\u0000\u0148?\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000"+
		"\u0000\u0000\u014a\u014b\u0003B!\u0000\u014bA\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0005,\u0000\u0000\u014d\u014e\u0005\u000f\u0000\u0000\u014e"+
		"\u014f\u0005T\u0000\u0000\u014f\u0153\u0005\u001e\u0000\u0000\u0150\u0152"+
		"\u0003D\"\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0152\u0155\u0001"+
		"\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001"+
		"\u0000\u0000\u0000\u0154\u0156\u0001\u0000\u0000\u0000\u0155\u0153\u0001"+
		"\u0000\u0000\u0000\u0156\u0157\u0005\u001f\u0000\u0000\u0157\u0158\u0005"+
		"\r\u0000\u0000\u0158C\u0001\u0000\u0000\u0000\u0159\u015f\u0003\u001a"+
		"\r\u0000\u015a\u015f\u0003 \u0010\u0000\u015b\u015f\u0003\"\u0011\u0000"+
		"\u015c\u015f\u0003&\u0013\u0000\u015d\u015f\u0003$\u0012\u0000\u015e\u0159"+
		"\u0001\u0000\u0000\u0000\u015e\u015a\u0001\u0000\u0000\u0000\u015e\u015b"+
		"\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015d"+
		"\u0001\u0000\u0000\u0000\u015fE\u0001\u0000\u0000\u0000\u0160\u0161\u0007"+
		"\u0003\u0000\u0000\u0161G\u0001\u0000\u0000\u0000\u0162\u0163\u0005\u00d5"+
		"\u0000\u0000\u0163\u0165\u0005\u001e\u0000\u0000\u0164\u0166\u0003 \u0010"+
		"\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000"+
		"\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0168\u0005\u001f\u0000"+
		"\u0000\u0168\u0169\u0005\r\u0000\u0000\u0169I\u0001\u0000\u0000\u0000"+
		"\u016a\u016b\u0005I\u0000\u0000\u016b\u016c\u0005\u0010\u0000\u0000\u016c"+
		"\u016d\u0005:\u0000\u0000\u016d\u016e\u0005\u001e\u0000\u0000\u016e\u016f"+
		"\u0005\u00d6\u0000\u0000\u016f\u0170\u0005\u001f\u0000\u0000\u0170\u0171"+
		"\u0005\r\u0000\u0000\u0171K\u0001\u0000\u0000\u0000\u0172\u0173\u0005"+
		"\u00d7\u0000\u0000\u0173\u0175\u0005\u001e\u0000\u0000\u0174\u0176\u0003"+
		"0\u0018\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000"+
		"\u0000\u0000\u0176\u0178\u0001\u0000\u0000\u0000\u0177\u0179\u00032\u0019"+
		"\u0000\u0178\u0177\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000"+
		"\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000"+
		"\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017d\u0005\u001f\u0000"+
		"\u0000\u017d\u017e\u0005\r\u0000\u0000\u017eM\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0005\u00d8\u0000\u0000\u0180\u0182\u0005\u001e\u0000\u0000"+
		"\u0181\u0183\u0003P(\u0000\u0182\u0181\u0001\u0000\u0000\u0000\u0182\u0183"+
		"\u0001\u0000\u0000\u0000\u0183\u0187\u0001\u0000\u0000\u0000\u0184\u0185"+
		"\u00055\u0000\u0000\u0185\u0186\u0005\u000f\u0000\u0000\u0186\u0188\u0003"+
		"6\u001b\u0000\u0187\u0184\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000"+
		"\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018a\u0005\u001f"+
		"\u0000\u0000\u018a\u018b\u0005\r\u0000\u0000\u018bO\u0001\u0000\u0000"+
		"\u0000\u018c\u018d\u0005=\u0000\u0000\u018d\u018e\u0005\u000f\u0000\u0000"+
		"\u018e\u018f\u0005\u001e\u0000\u0000\u018f\u0190\u0005\u001f\u0000\u0000"+
		"\u0190\u0192\u0005\"\u0000\u0000\u0191\u0193\u0003R)\u0000\u0192\u0191"+
		"\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0194"+
		"\u0001\u0000\u0000\u0000\u0194\u0195\u0005#\u0000\u0000\u0195\u0196\u0005"+
		"\r\u0000\u0000\u0196Q\u0001\u0000\u0000\u0000\u0197\u0198\u0005>\u0000"+
		"\u0000\u0198\u0199\u0005\u001e\u0000\u0000\u0199\u019a\u0005\u00d6\u0000"+
		"\u0000\u019a\u019b\u0005\u001f\u0000\u0000\u019b\u019c\u0005\u000e\u0000"+
		"\u0000\u019cS\u0001\u0000\u0000\u0000\u019d\u019e\u0005\u00d9\u0000\u0000"+
		"\u019e\u01a0\u0005\u001e\u0000\u0000\u019f\u01a1\u0003.\u0017\u0000\u01a0"+
		"\u019f\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a2\u01a4\u00032\u0019\u0000\u01a3\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005\u001f\u0000\u0000\u01a8\u01a9"+
		"\u0005\r\u0000\u0000\u01a9U\u0001\u0000\u0000\u0000\u01aa\u01ab\u0005"+
		"\u00da\u0000\u0000\u01ab\u01ad\u0005\u001e\u0000\u0000\u01ac\u01ae\u0003"+
		"X,\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000"+
		"\u0000\u01ae\u01b0\u0001\u0000\u0000\u0000\u01af\u01b1\u00032\u0019\u0000"+
		"\u01b0\u01af\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005\u001f\u0000\u0000"+
		"\u01b5\u01b6\u0005\r\u0000\u0000\u01b6W\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b8\u0005k\u0000\u0000\u01b8\u01b9\u0005\u00db\u0000\u0000\u01b9\u01ba"+
		"\u0005\u0010\u0000\u0000\u01ba\u01bb\u00057\u0000\u0000\u01bb\u01bc\u0005"+
		"\u001e\u0000\u0000\u01bc\u01bd\u0005\u0004\u0000\u0000\u01bd\u01be\u0005"+
		"\u001f\u0000\u0000\u01be\u01bf\u0005\r\u0000\u0000\u01bfY\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c1\u0005/\u0000\u0000\u01c1\u01c4\u0005\u001e\u0000"+
		"\u0000\u01c2\u01c5\u0003:\u001d\u0000\u01c3\u01c5\u0003 \u0010\u0000\u01c4"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c7\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c8\u00034\u001a\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c9"+
		"\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01c9\u01ca"+
		"\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01cc"+
		"\u0005\u001f\u0000\u0000\u01cc[\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005"+
		"0\u0000\u0000\u01ce\u01d0\u0005\u001e\u0000\u0000\u01cf\u01d1\u0003^/"+
		"\u0000\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d4\u0005\u001f\u0000"+
		"\u0000\u01d3\u01d5\u00036\u001b\u0000\u01d4\u01d3\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7]\u0001\u0000\u0000\u0000\u01d8"+
		"\u01d9\u00054\u0000\u0000\u01d9\u01da\u0005\u0015\u0000\u0000\u01da\u01e5"+
		"\u0005\u00dc\u0000\u0000\u01db\u01dc\u00051\u0000\u0000\u01dc\u01dd\u0005"+
		"\u0015\u0000\u0000\u01dd\u01e5\u0005\u00dc\u0000\u0000\u01de\u01df\u0005"+
		"3\u0000\u0000\u01df\u01e0\u0005\u0015\u0000\u0000\u01e0\u01e5\u0005\u00dc"+
		"\u0000\u0000\u01e1\u01e2\u00052\u0000\u0000\u01e2\u01e3\u0005\u0015\u0000"+
		"\u0000\u01e3\u01e5\u0005\u00dc\u0000\u0000\u01e4\u01d8\u0001\u0000\u0000"+
		"\u0000\u01e4\u01db\u0001\u0000\u0000\u0000\u01e4\u01de\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e1\u0001\u0000\u0000\u0000\u01e5_\u0001\u0000\u0000\u0000"+
		"\'dfrwz}\u0090\u0098\u00a7\u00ac\u00b1\u00b9\u00bf\u0108\u0112\u0114\u0122"+
		"\u0127\u012a\u012d\u0132\u0147\u0153\u015e\u0165\u0175\u017a\u0182\u0187"+
		"\u0192\u01a0\u01a5\u01ad\u01b2\u01c4\u01c9\u01d0\u01d6\u01e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}