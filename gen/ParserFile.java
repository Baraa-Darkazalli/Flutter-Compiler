// Generated from D:/Compiler2/compiler/src/Grammers\ParserFile.g4 by ANTLR 4.12.0
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ParserFile extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, EXTENDS=2, VOID=3, MAIN=4, RUN_APP=5, STATELESS_WIDGET=6, WIDGET=7, 
		BUILD=8, RETURN=9, REQUIRED=10, THIS=11, DATA_TYPE=12, SCAFFOLD=13, CONTAINER=14, 
		ROW=15, COLUMN=16, LIST_VIEW=17, SIZED_BOX=18, EXPANDED=19, CARD=20, ICON_BUTTON=21, 
		ICON=22, SLIDER=23, DRAWER=24, WRAP=25, FLEX=26, TEXT_BUTTON=27, TEXT=28, 
		IMAGE=29, APP_BAR=30, TEXT_FIELD=31, CHECK_BOX=32, RADIO=33, INK_WELL=34, 
		BOTTOM_NAVIGATION_BAR=35, TAB_BAR=36, TAB_BAR_VIEW=37, FLOATING_ACTION_BUTTON=38, 
		TEXT_FORM_FIELD=39, TEXT_STYLE=40, CENTER=41, COLORS=42, ICONS=43, AXIS=44, 
		BODY=45, DRAWER_ARG=46, APP_BAR_ARG=47, BOTTOM_NAVIGATION_BAR_ARG=48, 
		FLOATING_ACTION_BUTTON_ARG=49, BACKGROUND_COLOR=50, CHILD=51, CHILDREN=52, 
		WIDTH=53, HEIGHT=54, COLOR=55, SIZE=56, VALUE=57, MAX=58, MIN=59, LABEL=60, 
		ICON_ARG=61, CROSS_AXIS_ALIGNMENT=62, MAIN_AXIS_ALIGNMENT=63, FLEX_ARG=64, 
		CURRENT_INDEX=65, ITEMS=66, MARGIN=67, PADDING=68, STYLE=69, FONT_SIZE=70, 
		IMAGE_ARG=71, TITLE=72, LEADING=73, ACTIONS=74, TABS=75, TEXT_Arg=76, 
		ON_TAP=77, NAVIGATOR=78, PUSH=79, POP=80, IDENTIFIER=81, SLASH=82, BACKSLASH=83, 
		DOUBLE=84, INT=85, ID=86, FLOAT=87, STRING=88, WS=89, COMMA=90, SEMICOLON=91, 
		COLON=92, DOT=93, OPEN_PAREN=94, CLOSE_PAREN=95, OPEN_SQUARE=96, CLOSE_SQUARE=97, 
		OPEN_BRACE=98, CLOSE_BRACE=99, PLUS=100, MINUS=101, MULTIPLY=102, DIVISION=103, 
		EQUAL=104, LARGER=105, SMALLER=106, LARGER_OR_EQUAL=107, SMALLER_OR_EQUAL=108, 
		NOT_EQUAL=109, AND=110, OR=111, NOT=112, UNDER_SCORE=113, QUOTES_SQ=114, 
		QUOTES_DQ=115;
	public static final int
		RULE_root = 0, RULE_main = 1, RULE_dartClass = 2, RULE_classBody = 3, 
		RULE_classArg = 4, RULE_constructorDeclaration = 5, RULE_buildFunctionDeclaration = 6, 
		RULE_constructorArg = 7, RULE_buildBody = 8, RULE_dataType = 9, RULE_attributeName = 10, 
		RULE_className = 11, RULE_widget = 12, RULE_scaffold = 13, RULE_container = 14, 
		RULE_text = 15, RULE_textStyle = 16, RULE_image = 17, RULE_listView = 18, 
		RULE_appBar = 19, RULE_textField = 20, RULE_column = 21, RULE_row = 22, 
		RULE_card = 23, RULE_iconButton = 24, RULE_inkWell = 25, RULE_expanded = 26, 
		RULE_bottomNavigationBar = 27, RULE_slider = 28, RULE_tabBar = 29, RULE_tabBarView = 30, 
		RULE_drawer = 31, RULE_floatingActionButton = 32, RULE_wrap = 33, RULE_flex = 34, 
		RULE_textFormField = 35, RULE_textButton = 36, RULE_icon = 37, RULE_sizedBox = 38, 
		RULE_center = 39, RULE_scaffoldArgs = 40, RULE_containerArgs = 41, RULE_textArgs = 42, 
		RULE_imageArgs = 43, RULE_listviewArgs = 44, RULE_appBarArgs = 45, RULE_textFieldArgs = 46, 
		RULE_columnArgs = 47, RULE_rowArgs = 48, RULE_cardArgs = 49, RULE_iconButtonArgs = 50, 
		RULE_inkwellArgs = 51, RULE_expandedArgs = 52, RULE_bottomNavigationBarArgs = 53, 
		RULE_sliderArgs = 54, RULE_tabBarArgs = 55, RULE_tabBarViewArgs = 56, 
		RULE_drawerArgs = 57, RULE_floatingActionButtonArgs = 58, RULE_wrapArgs = 59, 
		RULE_flexArgs = 60, RULE_textFormFieldArgs = 61, RULE_textButtonArgs = 62, 
		RULE_iconArgs = 63, RULE_sizedBoxArgs = 64, RULE_textStyleArgs = 65, RULE_centerArgs = 66, 
		RULE_body = 67, RULE_drawerArg = 68, RULE_appBarArg = 69, RULE_bottomNavigationBarArg = 70, 
		RULE_floatingActionButtonArg = 71, RULE_child = 72, RULE_children = 73, 
		RULE_height = 74, RULE_width = 75, RULE_color = 76, RULE_margin = 77, 
		RULE_padding = 78, RULE_items = 79, RULE_currentIndex = 80, RULE_backGroundColor = 81, 
		RULE_crossAxis = 82, RULE_mainAxis = 83, RULE_style = 84, RULE_fontSize = 85, 
		RULE_textArg = 86, RULE_imageArg = 87, RULE_leading = 88, RULE_title = 89, 
		RULE_actions = 90, RULE_iconArg = 91, RULE_flexArg = 92, RULE_min = 93, 
		RULE_max = 94, RULE_tabs = 95, RULE_size = 96, RULE_onTap = 97, RULE_expression = 98, 
		RULE_allowExp = 99, RULE_runAppExp = 100, RULE_navigateExp = 101, RULE_transtion = 102, 
		RULE_push = 103, RULE_pop = 104, RULE_constructor = 105, RULE_constructoFilled = 106;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "main", "dartClass", "classBody", "classArg", "constructorDeclaration", 
			"buildFunctionDeclaration", "constructorArg", "buildBody", "dataType", 
			"attributeName", "className", "widget", "scaffold", "container", "text", 
			"textStyle", "image", "listView", "appBar", "textField", "column", "row", 
			"card", "iconButton", "inkWell", "expanded", "bottomNavigationBar", "slider", 
			"tabBar", "tabBarView", "drawer", "floatingActionButton", "wrap", "flex", 
			"textFormField", "textButton", "icon", "sizedBox", "center", "scaffoldArgs", 
			"containerArgs", "textArgs", "imageArgs", "listviewArgs", "appBarArgs", 
			"textFieldArgs", "columnArgs", "rowArgs", "cardArgs", "iconButtonArgs", 
			"inkwellArgs", "expandedArgs", "bottomNavigationBarArgs", "sliderArgs", 
			"tabBarArgs", "tabBarViewArgs", "drawerArgs", "floatingActionButtonArgs", 
			"wrapArgs", "flexArgs", "textFormFieldArgs", "textButtonArgs", "iconArgs", 
			"sizedBoxArgs", "textStyleArgs", "centerArgs", "body", "drawerArg", "appBarArg", 
			"bottomNavigationBarArg", "floatingActionButtonArg", "child", "children", 
			"height", "width", "color", "margin", "padding", "items", "currentIndex", 
			"backGroundColor", "crossAxis", "mainAxis", "style", "fontSize", "textArg", 
			"imageArg", "leading", "title", "actions", "iconArg", "flexArg", "min", 
			"max", "tabs", "size", "onTap", "expression", "allowExp", "runAppExp", 
			"navigateExp", "transtion", "push", "pop", "constructor", "constructoFilled"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'extends'", "'void'", "'main'", "'runApp'", "'StatelessWidget'", 
			"'widget'", "'build'", "'return'", "'required'", "'this'", null, "'Scaffold'", 
			"'Container'", "'Row'", "'Column'", "'ListView'", "'SizedBox'", "'Expanded'", 
			"'Card'", "'IconButton'", "'Icon'", "'Slider'", "'Drawer'", "'Wrap'", 
			"'Flex'", "'TextButton'", "'Text'", "'Image'", "'AppBar'", "'TextField'", 
			"'CheckBox'", "'Radio'", "'InkWell'", "'BottomNavigationBar'", "'TabBar'", 
			"'TabBarView'", "'FloatingActionButton'", "'TextFormField'", "'TextStyle'", 
			"'Center'", null, "'back'", null, "'body'", "'drawer'", "'appBar'", "'bottomNavigationBar'", 
			"'floatingActionButton'", "'backgroundColor'", "'child'", "'children'", 
			"'width'", "'height'", "'color'", "'size'", "'value'", "'max'", "'min'", 
			"'label'", "'icon'", "'crossAxisAlignment'", "'mainAxisAlignment'", "'flex'", 
			"'currentIndex'", "'items'", "'margin'", "'padding'", "'style'", "'fontSize'", 
			"'image'", "'title'", "'leading'", "'actions'", "'tabs'", "'text'", "'onTap'", 
			"'Navigator'", "'push'", "'pop'", null, null, "'\\'", null, null, null, 
			null, null, null, "','", null, "':'", "'.'", null, null, "'['", "']'", 
			"'{'", "'}'", "'+'", "'-'", "'*'", null, "'='", "'>'", "'<'", "'>='", 
			"'<='", "'!='", "'&&'", "'||'", "'!'", "'_'", "''''", "'\"\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "EXTENDS", "VOID", "MAIN", "RUN_APP", "STATELESS_WIDGET", 
			"WIDGET", "BUILD", "RETURN", "REQUIRED", "THIS", "DATA_TYPE", "SCAFFOLD", 
			"CONTAINER", "ROW", "COLUMN", "LIST_VIEW", "SIZED_BOX", "EXPANDED", "CARD", 
			"ICON_BUTTON", "ICON", "SLIDER", "DRAWER", "WRAP", "FLEX", "TEXT_BUTTON", 
			"TEXT", "IMAGE", "APP_BAR", "TEXT_FIELD", "CHECK_BOX", "RADIO", "INK_WELL", 
			"BOTTOM_NAVIGATION_BAR", "TAB_BAR", "TAB_BAR_VIEW", "FLOATING_ACTION_BUTTON", 
			"TEXT_FORM_FIELD", "TEXT_STYLE", "CENTER", "COLORS", "ICONS", "AXIS", 
			"BODY", "DRAWER_ARG", "APP_BAR_ARG", "BOTTOM_NAVIGATION_BAR_ARG", "FLOATING_ACTION_BUTTON_ARG", 
			"BACKGROUND_COLOR", "CHILD", "CHILDREN", "WIDTH", "HEIGHT", "COLOR", 
			"SIZE", "VALUE", "MAX", "MIN", "LABEL", "ICON_ARG", "CROSS_AXIS_ALIGNMENT", 
			"MAIN_AXIS_ALIGNMENT", "FLEX_ARG", "CURRENT_INDEX", "ITEMS", "MARGIN", 
			"PADDING", "STYLE", "FONT_SIZE", "IMAGE_ARG", "TITLE", "LEADING", "ACTIONS", 
			"TABS", "TEXT_Arg", "ON_TAP", "NAVIGATOR", "PUSH", "POP", "IDENTIFIER", 
			"SLASH", "BACKSLASH", "DOUBLE", "INT", "ID", "FLOAT", "STRING", "WS", 
			"COMMA", "SEMICOLON", "COLON", "DOT", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_SQUARE", 
			"CLOSE_SQUARE", "OPEN_BRACE", "CLOSE_BRACE", "PLUS", "MINUS", "MULTIPLY", 
			"DIVISION", "EQUAL", "LARGER", "SMALLER", "LARGER_OR_EQUAL", "SMALLER_OR_EQUAL", 
			"NOT_EQUAL", "AND", "OR", "NOT", "UNDER_SCORE", "QUOTES_SQ", "QUOTES_DQ"
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

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<DartClassContext> dartClass() {
			return getRuleContexts(DartClassContext.class);
		}
		public DartClassContext dartClass(int i) {
			return getRuleContext(DartClassContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			main();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(215);
				dartClass();
				}
				}
				setState(220);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(ParserFile.VOID, 0); }
		public TerminalNode MAIN() { return getToken(ParserFile.MAIN, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(ParserFile.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(ParserFile.CLOSE_BRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(VOID);
			setState(222);
			match(MAIN);
			setState(223);
			match(OPEN_PAREN);
			setState(224);
			match(CLOSE_PAREN);
			setState(225);
			match(OPEN_BRACE);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RUN_APP || _la==NAVIGATOR) {
				{
				{
				setState(226);
				expression();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DartClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(ParserFile.CLASS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(ParserFile.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(ParserFile.CLOSE_BRACE, 0); }
		public TerminalNode EXTENDS() { return getToken(ParserFile.EXTENDS, 0); }
		public TerminalNode STATELESS_WIDGET() { return getToken(ParserFile.STATELESS_WIDGET, 0); }
		public List<ClassBodyContext> classBody() {
			return getRuleContexts(ClassBodyContext.class);
		}
		public ClassBodyContext classBody(int i) {
			return getRuleContext(ClassBodyContext.class,i);
		}
		public DartClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dartClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterDartClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitDartClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitDartClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DartClassContext dartClass() throws RecognitionException {
		DartClassContext _localctx = new DartClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dartClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(CLASS);
			setState(235);
			className();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(236);
				match(EXTENDS);
				setState(237);
				match(STATELESS_WIDGET);
				}
			}

			setState(240);
			match(OPEN_BRACE);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WIDGET || _la==DATA_TYPE || _la==IDENTIFIER) {
				{
				{
				setState(241);
				classBody();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public ClassArgContext classArg() {
			return getRuleContext(ClassArgContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public BuildFunctionDeclarationContext buildFunctionDeclaration() {
			return getRuleContext(BuildFunctionDeclarationContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classBody);
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATA_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				classArg();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				constructorDeclaration();
				}
				break;
			case WIDGET:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				buildFunctionDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassArgContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ParserFile.SEMICOLON, 0); }
		public ClassArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterClassArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitClassArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitClassArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassArgContext classArg() throws RecognitionException {
		ClassArgContext _localctx = new ClassArgContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			dataType();
			setState(255);
			attributeName();
			setState(256);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserFile.SEMICOLON, 0); }
		public List<ConstructorArgContext> constructorArg() {
			return getRuleContexts(ConstructorArgContext.class);
		}
		public ConstructorArgContext constructorArg(int i) {
			return getRuleContext(ConstructorArgContext.class,i);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			className();
			setState(259);
			match(OPEN_PAREN);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DATA_TYPE) {
				{
				{
				setState(260);
				constructorArg();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			match(CLOSE_PAREN);
			setState(267);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BuildFunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode WIDGET() { return getToken(ParserFile.WIDGET, 0); }
		public TerminalNode BUILD() { return getToken(ParserFile.BUILD, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(ParserFile.OPEN_BRACE, 0); }
		public BuildBodyContext buildBody() {
			return getRuleContext(BuildBodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(ParserFile.CLOSE_BRACE, 0); }
		public BuildFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBuildFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBuildFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBuildFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildFunctionDeclarationContext buildFunctionDeclaration() throws RecognitionException {
		BuildFunctionDeclarationContext _localctx = new BuildFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_buildFunctionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(WIDGET);
			setState(270);
			match(BUILD);
			setState(271);
			match(OPEN_PAREN);
			setState(272);
			match(CLOSE_PAREN);
			setState(273);
			match(OPEN_BRACE);
			setState(274);
			buildBody();
			setState(275);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorArgContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public ConstructorArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterConstructorArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitConstructorArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitConstructorArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorArgContext constructorArg() throws RecognitionException {
		ConstructorArgContext _localctx = new ConstructorArgContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constructorArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			dataType();
			setState(278);
			attributeName();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BuildBodyContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ParserFile.RETURN, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ParserFile.SEMICOLON, 0); }
		public BuildBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBuildBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBuildBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBuildBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildBodyContext buildBody() throws RecognitionException {
		BuildBodyContext _localctx = new BuildBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_buildBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(RETURN);
			setState(281);
			widget();
			setState(282);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode DATA_TYPE() { return getToken(ParserFile.DATA_TYPE, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(DATA_TYPE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserFile.IDENTIFIER, 0); }
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserFile.IDENTIFIER, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WidgetContext extends ParserRuleContext {
		public ScaffoldContext scaffold() {
			return getRuleContext(ScaffoldContext.class,0);
		}
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public ListViewContext listView() {
			return getRuleContext(ListViewContext.class,0);
		}
		public AppBarContext appBar() {
			return getRuleContext(AppBarContext.class,0);
		}
		public TextFieldContext textField() {
			return getRuleContext(TextFieldContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public CardContext card() {
			return getRuleContext(CardContext.class,0);
		}
		public IconButtonContext iconButton() {
			return getRuleContext(IconButtonContext.class,0);
		}
		public InkWellContext inkWell() {
			return getRuleContext(InkWellContext.class,0);
		}
		public ExpandedContext expanded() {
			return getRuleContext(ExpandedContext.class,0);
		}
		public BottomNavigationBarContext bottomNavigationBar() {
			return getRuleContext(BottomNavigationBarContext.class,0);
		}
		public SliderContext slider() {
			return getRuleContext(SliderContext.class,0);
		}
		public TabBarContext tabBar() {
			return getRuleContext(TabBarContext.class,0);
		}
		public TabBarViewContext tabBarView() {
			return getRuleContext(TabBarViewContext.class,0);
		}
		public DrawerContext drawer() {
			return getRuleContext(DrawerContext.class,0);
		}
		public FloatingActionButtonContext floatingActionButton() {
			return getRuleContext(FloatingActionButtonContext.class,0);
		}
		public WrapContext wrap() {
			return getRuleContext(WrapContext.class,0);
		}
		public FlexContext flex() {
			return getRuleContext(FlexContext.class,0);
		}
		public TextFormFieldContext textFormField() {
			return getRuleContext(TextFormFieldContext.class,0);
		}
		public TextButtonContext textButton() {
			return getRuleContext(TextButtonContext.class,0);
		}
		public IconContext icon() {
			return getRuleContext(IconContext.class,0);
		}
		public SizedBoxContext sizedBox() {
			return getRuleContext(SizedBoxContext.class,0);
		}
		public CenterContext center() {
			return getRuleContext(CenterContext.class,0);
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
		enterRule(_localctx, 24, RULE_widget);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCAFFOLD:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				scaffold();
				}
				break;
			case CONTAINER:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				container();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				text();
				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 4);
				{
				setState(293);
				image();
				}
				break;
			case LIST_VIEW:
				enterOuterAlt(_localctx, 5);
				{
				setState(294);
				listView();
				}
				break;
			case APP_BAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(295);
				appBar();
				}
				break;
			case TEXT_FIELD:
				enterOuterAlt(_localctx, 7);
				{
				setState(296);
				textField();
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 8);
				{
				setState(297);
				column();
				}
				break;
			case ROW:
				enterOuterAlt(_localctx, 9);
				{
				setState(298);
				row();
				}
				break;
			case CARD:
				enterOuterAlt(_localctx, 10);
				{
				setState(299);
				card();
				}
				break;
			case ICON_BUTTON:
				enterOuterAlt(_localctx, 11);
				{
				setState(300);
				iconButton();
				}
				break;
			case INK_WELL:
				enterOuterAlt(_localctx, 12);
				{
				setState(301);
				inkWell();
				}
				break;
			case EXPANDED:
				enterOuterAlt(_localctx, 13);
				{
				setState(302);
				expanded();
				}
				break;
			case BOTTOM_NAVIGATION_BAR:
				enterOuterAlt(_localctx, 14);
				{
				setState(303);
				bottomNavigationBar();
				}
				break;
			case SLIDER:
				enterOuterAlt(_localctx, 15);
				{
				setState(304);
				slider();
				}
				break;
			case TAB_BAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(305);
				tabBar();
				}
				break;
			case TAB_BAR_VIEW:
				enterOuterAlt(_localctx, 17);
				{
				setState(306);
				tabBarView();
				}
				break;
			case DRAWER:
				enterOuterAlt(_localctx, 18);
				{
				setState(307);
				drawer();
				}
				break;
			case FLOATING_ACTION_BUTTON:
				enterOuterAlt(_localctx, 19);
				{
				setState(308);
				floatingActionButton();
				}
				break;
			case WRAP:
				enterOuterAlt(_localctx, 20);
				{
				setState(309);
				wrap();
				}
				break;
			case FLEX:
				enterOuterAlt(_localctx, 21);
				{
				setState(310);
				flex();
				}
				break;
			case TEXT_FORM_FIELD:
				enterOuterAlt(_localctx, 22);
				{
				setState(311);
				textFormField();
				}
				break;
			case TEXT_BUTTON:
				enterOuterAlt(_localctx, 23);
				{
				setState(312);
				textButton();
				}
				break;
			case ICON:
				enterOuterAlt(_localctx, 24);
				{
				setState(313);
				icon();
				}
				break;
			case SIZED_BOX:
				enterOuterAlt(_localctx, 25);
				{
				setState(314);
				sizedBox();
				}
				break;
			case CENTER:
				enterOuterAlt(_localctx, 26);
				{
				setState(315);
				center();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScaffoldContext extends ParserRuleContext {
		public TerminalNode SCAFFOLD() { return getToken(ParserFile.SCAFFOLD, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<ScaffoldArgsContext> scaffoldArgs() {
			return getRuleContexts(ScaffoldArgsContext.class);
		}
		public ScaffoldArgsContext scaffoldArgs(int i) {
			return getRuleContext(ScaffoldArgsContext.class,i);
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
		enterRule(_localctx, 26, RULE_scaffold);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(SCAFFOLD);
			setState(319);
			match(OPEN_PAREN);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2216615441596416L) != 0)) {
				{
				{
				setState(320);
				scaffoldArgs();
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(326);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContainerContext extends ParserRuleContext {
		public TerminalNode CONTAINER() { return getToken(ParserFile.CONTAINER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<ContainerArgsContext> containerArgs() {
			return getRuleContexts(ContainerArgsContext.class);
		}
		public ContainerArgsContext containerArgs(int i) {
			return getRuleContext(ContainerArgsContext.class,i);
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
		enterRule(_localctx, 28, RULE_container);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(CONTAINER);
			setState(329);
			match(OPEN_PAREN);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 196637L) != 0)) {
				{
				{
				setState(330);
				containerArgs();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(ParserFile.TEXT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<TextArgsContext> textArgs() {
			return getRuleContexts(TextArgsContext.class);
		}
		public TextArgsContext textArgs(int i) {
			return getRuleContext(TextArgsContext.class,i);
		}
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
		enterRule(_localctx, 30, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(TEXT);
			setState(339);
			match(OPEN_PAREN);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 528385L) != 0)) {
				{
				{
				setState(340);
				textArgs();
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(346);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextStyleContext extends ParserRuleContext {
		public TerminalNode TEXT_STYLE() { return getToken(ParserFile.TEXT_STYLE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<TextStyleArgsContext> textStyleArgs() {
			return getRuleContexts(TextStyleArgsContext.class);
		}
		public TextStyleArgsContext textStyleArgs(int i) {
			return getRuleContext(TextStyleArgsContext.class,i);
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
		enterRule(_localctx, 32, RULE_textStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(TEXT_STYLE);
			setState(349);
			match(OPEN_PAREN);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & 1048609L) != 0)) {
				{
				{
				setState(350);
				textStyleArgs();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImageContext extends ParserRuleContext {
		public TerminalNode IMAGE() { return getToken(ParserFile.IMAGE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<ImageArgsContext> imageArgs() {
			return getRuleContexts(ImageArgsContext.class);
		}
		public ImageArgsContext imageArgs(int i) {
			return getRuleContext(ImageArgsContext.class,i);
		}
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
		enterRule(_localctx, 34, RULE_image);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(IMAGE);
			setState(359);
			match(OPEN_PAREN);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & 262151L) != 0)) {
				{
				{
				setState(360);
				imageArgs();
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(366);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListViewContext extends ParserRuleContext {
		public TerminalNode LIST_VIEW() { return getToken(ParserFile.LIST_VIEW, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<ListviewArgsContext> listviewArgs() {
			return getRuleContexts(ListviewArgsContext.class);
		}
		public ListviewArgsContext listviewArgs(int i) {
			return getRuleContext(ListviewArgsContext.class,i);
		}
		public ListViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterListView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitListView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitListView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListViewContext listView() throws RecognitionException {
		ListViewContext _localctx = new ListViewContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_listView);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(LIST_VIEW);
			setState(369);
			match(OPEN_PAREN);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILDREN || _la==PADDING) {
				{
				{
				setState(370);
				listviewArgs();
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(376);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AppBarContext extends ParserRuleContext {
		public TerminalNode APP_BAR() { return getToken(ParserFile.APP_BAR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<AppBarArgsContext> appBarArgs() {
			return getRuleContexts(AppBarArgsContext.class);
		}
		public AppBarArgsContext appBarArgs(int i) {
			return getRuleContext(AppBarArgsContext.class,i);
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
		enterRule(_localctx, 38, RULE_appBar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(APP_BAR);
			setState(379);
			match(OPEN_PAREN);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & 29360129L) != 0)) {
				{
				{
				setState(380);
				appBarArgs();
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextFieldContext extends ParserRuleContext {
		public TerminalNode TEXT_FIELD() { return getToken(ParserFile.TEXT_FIELD, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<TextFieldArgsContext> textFieldArgs() {
			return getRuleContexts(TextFieldArgsContext.class);
		}
		public TextFieldArgsContext textFieldArgs(int i) {
			return getRuleContext(TextFieldArgsContext.class,i);
		}
		public TextFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTextField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTextField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTextField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextFieldContext textField() throws RecognitionException {
		TextFieldContext _localctx = new TextFieldContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_textField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(TEXT_FIELD);
			setState(389);
			match(OPEN_PAREN);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STYLE) {
				{
				{
				setState(390);
				textFieldArgs();
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(ParserFile.COLUMN, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<ColumnArgsContext> columnArgs() {
			return getRuleContexts(ColumnArgsContext.class);
		}
		public ColumnArgsContext columnArgs(int i) {
			return getRuleContext(ColumnArgsContext.class,i);
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
		enterRule(_localctx, 42, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(COLUMN);
			setState(399);
			match(OPEN_PAREN);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4607182418800017408L) != 0)) {
				{
				{
				setState(400);
				columnArgs();
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(406);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RowContext extends ParserRuleContext {
		public TerminalNode ROW() { return getToken(ParserFile.ROW, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<RowArgsContext> rowArgs() {
			return getRuleContexts(RowArgsContext.class);
		}
		public RowArgsContext rowArgs(int i) {
			return getRuleContext(RowArgsContext.class,i);
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
		enterRule(_localctx, 44, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(ROW);
			setState(409);
			match(OPEN_PAREN);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4607182418800017408L) != 0)) {
				{
				{
				setState(410);
				rowArgs();
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(416);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CardContext extends ParserRuleContext {
		public TerminalNode CARD() { return getToken(ParserFile.CARD, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<CardArgsContext> cardArgs() {
			return getRuleContexts(CardArgsContext.class);
		}
		public CardArgsContext cardArgs(int i) {
			return getRuleContext(CardArgsContext.class,i);
		}
		public CardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_card; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CardContext card() throws RecognitionException {
		CardContext _localctx = new CardContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_card);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(CARD);
			setState(419);
			match(OPEN_PAREN);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 65553L) != 0)) {
				{
				{
				setState(420);
				cardArgs();
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(426);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IconButtonContext extends ParserRuleContext {
		public TerminalNode ICON_BUTTON() { return getToken(ParserFile.ICON_BUTTON, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<IconButtonArgsContext> iconButtonArgs() {
			return getRuleContexts(IconButtonArgsContext.class);
		}
		public IconButtonArgsContext iconButtonArgs(int i) {
			return getRuleContext(IconButtonArgsContext.class,i);
		}
		public IconButtonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iconButton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterIconButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitIconButton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitIconButton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IconButtonContext iconButton() throws RecognitionException {
		IconButtonContext _localctx = new IconButtonContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_iconButton);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(ICON_BUTTON);
			setState(429);
			match(OPEN_PAREN);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 8257L) != 0)) {
				{
				{
				setState(430);
				iconButtonArgs();
				}
				}
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(436);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InkWellContext extends ParserRuleContext {
		public TerminalNode INK_WELL() { return getToken(ParserFile.INK_WELL, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<InkwellArgsContext> inkwellArgs() {
			return getRuleContexts(InkwellArgsContext.class);
		}
		public InkwellArgsContext inkwellArgs(int i) {
			return getRuleContext(InkwellArgsContext.class,i);
		}
		public InkWellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inkWell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterInkWell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitInkWell(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitInkWell(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InkWellContext inkWell() throws RecognitionException {
		InkWellContext _localctx = new InkWellContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_inkWell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(INK_WELL);
			setState(439);
			match(OPEN_PAREN);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILD || _la==ON_TAP) {
				{
				{
				setState(440);
				inkwellArgs();
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(446);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpandedContext extends ParserRuleContext {
		public TerminalNode EXPANDED() { return getToken(ParserFile.EXPANDED, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<ExpandedArgsContext> expandedArgs() {
			return getRuleContexts(ExpandedArgsContext.class);
		}
		public ExpandedArgsContext expandedArgs(int i) {
			return getRuleContext(ExpandedArgsContext.class,i);
		}
		public ExpandedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expanded; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterExpanded(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitExpanded(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitExpanded(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpandedContext expanded() throws RecognitionException {
		ExpandedContext _localctx = new ExpandedContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expanded);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(EXPANDED);
			setState(449);
			match(OPEN_PAREN);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILD || _la==FLEX_ARG) {
				{
				{
				setState(450);
				expandedArgs();
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(456);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BottomNavigationBarContext extends ParserRuleContext {
		public TerminalNode BOTTOM_NAVIGATION_BAR() { return getToken(ParserFile.BOTTOM_NAVIGATION_BAR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<BottomNavigationBarArgsContext> bottomNavigationBarArgs() {
			return getRuleContexts(BottomNavigationBarArgsContext.class);
		}
		public BottomNavigationBarArgsContext bottomNavigationBarArgs(int i) {
			return getRuleContext(BottomNavigationBarArgsContext.class,i);
		}
		public BottomNavigationBarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bottomNavigationBar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBottomNavigationBar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBottomNavigationBar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBottomNavigationBar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BottomNavigationBarContext bottomNavigationBar() throws RecognitionException {
		BottomNavigationBarContext _localctx = new BottomNavigationBarContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bottomNavigationBar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(BOTTOM_NAVIGATION_BAR);
			setState(459);
			match(OPEN_PAREN);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & 98305L) != 0)) {
				{
				{
				setState(460);
				bottomNavigationBarArgs();
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(466);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SliderContext extends ParserRuleContext {
		public TerminalNode SLIDER() { return getToken(ParserFile.SLIDER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<SliderArgsContext> sliderArgs() {
			return getRuleContexts(SliderArgsContext.class);
		}
		public SliderArgsContext sliderArgs(int i) {
			return getRuleContext(SliderArgsContext.class,i);
		}
		public SliderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSlider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSlider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSlider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliderContext slider() throws RecognitionException {
		SliderContext _localctx = new SliderContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_slider);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(SLIDER);
			setState(469);
			match(OPEN_PAREN);
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAX || _la==MIN) {
				{
				{
				setState(470);
				sliderArgs();
				}
				}
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(476);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TabBarContext extends ParserRuleContext {
		public TerminalNode TAB_BAR() { return getToken(ParserFile.TAB_BAR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<TabBarArgsContext> tabBarArgs() {
			return getRuleContexts(TabBarArgsContext.class);
		}
		public TabBarArgsContext tabBarArgs(int i) {
			return getRuleContext(TabBarArgsContext.class,i);
		}
		public TabBarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabBar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTabBar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTabBar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTabBar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabBarContext tabBar() throws RecognitionException {
		TabBarContext _localctx = new TabBarContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tabBar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(TAB_BAR);
			setState(479);
			match(OPEN_PAREN);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PADDING || _la==TABS) {
				{
				{
				setState(480);
				tabBarArgs();
				}
				}
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(486);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TabBarViewContext extends ParserRuleContext {
		public TerminalNode TAB_BAR_VIEW() { return getToken(ParserFile.TAB_BAR_VIEW, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<TabBarViewArgsContext> tabBarViewArgs() {
			return getRuleContexts(TabBarViewArgsContext.class);
		}
		public TabBarViewArgsContext tabBarViewArgs(int i) {
			return getRuleContext(TabBarViewArgsContext.class,i);
		}
		public TabBarViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabBarView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTabBarView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTabBarView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTabBarView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabBarViewContext tabBarView() throws RecognitionException {
		TabBarViewContext _localctx = new TabBarViewContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tabBarView);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(TAB_BAR_VIEW);
			setState(489);
			match(OPEN_PAREN);
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILDREN) {
				{
				{
				setState(490);
				tabBarViewArgs();
				}
				}
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(496);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DrawerContext extends ParserRuleContext {
		public TerminalNode DRAWER() { return getToken(ParserFile.DRAWER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<DrawerArgsContext> drawerArgs() {
			return getRuleContexts(DrawerArgsContext.class);
		}
		public DrawerArgsContext drawerArgs(int i) {
			return getRuleContext(DrawerArgsContext.class,i);
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
		enterRule(_localctx, 62, RULE_drawer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(DRAWER);
			setState(499);
			match(OPEN_PAREN);
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12384898975268864L) != 0)) {
				{
				{
				setState(500);
				drawerArgs();
				}
				}
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(506);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FloatingActionButtonContext extends ParserRuleContext {
		public TerminalNode FLOATING_ACTION_BUTTON() { return getToken(ParserFile.FLOATING_ACTION_BUTTON, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<FloatingActionButtonArgsContext> floatingActionButtonArgs() {
			return getRuleContexts(FloatingActionButtonArgsContext.class);
		}
		public FloatingActionButtonArgsContext floatingActionButtonArgs(int i) {
			return getRuleContext(FloatingActionButtonArgsContext.class,i);
		}
		public FloatingActionButtonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingActionButton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFloatingActionButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFloatingActionButton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFloatingActionButton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingActionButtonContext floatingActionButton() throws RecognitionException {
		FloatingActionButtonContext _localctx = new FloatingActionButtonContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_floatingActionButton);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(FLOATING_ACTION_BUTTON);
			setState(509);
			match(OPEN_PAREN);
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BACKGROUND_COLOR || _la==CHILD) {
				{
				{
				setState(510);
				floatingActionButtonArgs();
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(516);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WrapContext extends ParserRuleContext {
		public TerminalNode WRAP() { return getToken(ParserFile.WRAP, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<WrapArgsContext> wrapArgs() {
			return getRuleContexts(WrapArgsContext.class);
		}
		public WrapArgsContext wrapArgs(int i) {
			return getRuleContext(WrapArgsContext.class,i);
		}
		public WrapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wrap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterWrap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitWrap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitWrap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WrapContext wrap() throws RecognitionException {
		WrapContext _localctx = new WrapContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_wrap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(WRAP);
			setState(519);
			match(OPEN_PAREN);
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILDREN || _la==CROSS_AXIS_ALIGNMENT) {
				{
				{
				setState(520);
				wrapArgs();
				}
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(526);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FlexContext extends ParserRuleContext {
		public TerminalNode FLEX() { return getToken(ParserFile.FLEX, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<FlexArgsContext> flexArgs() {
			return getRuleContexts(FlexArgsContext.class);
		}
		public FlexArgsContext flexArgs(int i) {
			return getRuleContext(FlexArgsContext.class,i);
		}
		public FlexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFlex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFlex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFlex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlexContext flex() throws RecognitionException {
		FlexContext _localctx = new FlexContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_flex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(FLEX);
			setState(529);
			match(OPEN_PAREN);
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILD || _la==FLEX_ARG) {
				{
				{
				setState(530);
				flexArgs();
				}
				}
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(536);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextFormFieldContext extends ParserRuleContext {
		public TerminalNode TEXT_FORM_FIELD() { return getToken(ParserFile.TEXT_FORM_FIELD, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<TextFormFieldArgsContext> textFormFieldArgs() {
			return getRuleContexts(TextFormFieldArgsContext.class);
		}
		public TextFormFieldArgsContext textFormFieldArgs(int i) {
			return getRuleContext(TextFormFieldArgsContext.class,i);
		}
		public TextFormFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textFormField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTextFormField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTextFormField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTextFormField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextFormFieldContext textFormField() throws RecognitionException {
		TextFormFieldContext _localctx = new TextFormFieldContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_textFormField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(TEXT_FORM_FIELD);
			setState(539);
			match(OPEN_PAREN);
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STYLE) {
				{
				{
				setState(540);
				textFormFieldArgs();
				}
				}
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(546);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextButtonContext extends ParserRuleContext {
		public TerminalNode TEXT_BUTTON() { return getToken(ParserFile.TEXT_BUTTON, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<TextButtonArgsContext> textButtonArgs() {
			return getRuleContexts(TextButtonArgsContext.class);
		}
		public TextButtonArgsContext textButtonArgs(int i) {
			return getRuleContext(TextButtonArgsContext.class,i);
		}
		public TextButtonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textButton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTextButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTextButton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTextButton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextButtonContext textButton() throws RecognitionException {
		TextButtonContext _localctx = new TextButtonContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_textButton);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(TEXT_BUTTON);
			setState(549);
			match(OPEN_PAREN);
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILD || _la==STYLE) {
				{
				{
				setState(550);
				textButtonArgs();
				}
				}
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(556);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IconContext extends ParserRuleContext {
		public TerminalNode ICON() { return getToken(ParserFile.ICON, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<IconArgsContext> iconArgs() {
			return getRuleContexts(IconArgsContext.class);
		}
		public IconArgsContext iconArgs(int i) {
			return getRuleContext(IconArgsContext.class,i);
		}
		public IconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_icon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterIcon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitIcon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitIcon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IconContext icon() throws RecognitionException {
		IconContext _localctx = new IconContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_icon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(ICON);
			setState(559);
			match(OPEN_PAREN);
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 108095187149914112L) != 0)) {
				{
				{
				setState(560);
				iconArgs();
				}
				}
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(566);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SizedBoxContext extends ParserRuleContext {
		public TerminalNode SIZED_BOX() { return getToken(ParserFile.SIZED_BOX, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<SizedBoxArgsContext> sizedBoxArgs() {
			return getRuleContexts(SizedBoxArgsContext.class);
		}
		public SizedBoxArgsContext sizedBoxArgs(int i) {
			return getRuleContext(SizedBoxArgsContext.class,i);
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
		enterRule(_localctx, 76, RULE_sizedBox);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(SIZED_BOX);
			setState(569);
			match(OPEN_PAREN);
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 29273397577908224L) != 0)) {
				{
				{
				setState(570);
				sizedBoxArgs();
				}
				}
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(576);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CenterContext extends ParserRuleContext {
		public TerminalNode CENTER() { return getToken(ParserFile.CENTER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public CenterArgsContext centerArgs() {
			return getRuleContext(CenterArgsContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public CenterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_center; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCenter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCenter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCenter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CenterContext center() throws RecognitionException {
		CenterContext _localctx = new CenterContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_center);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(CENTER);
			setState(579);
			match(OPEN_PAREN);
			setState(580);
			centerArgs();
			setState(581);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScaffoldArgsContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public DrawerArgContext drawerArg() {
			return getRuleContext(DrawerArgContext.class,0);
		}
		public AppBarArgContext appBarArg() {
			return getRuleContext(AppBarArgContext.class,0);
		}
		public BottomNavigationBarArgContext bottomNavigationBarArg() {
			return getRuleContext(BottomNavigationBarArgContext.class,0);
		}
		public FloatingActionButtonArgContext floatingActionButtonArg() {
			return getRuleContext(FloatingActionButtonArgContext.class,0);
		}
		public BackGroundColorContext backGroundColor() {
			return getRuleContext(BackGroundColorContext.class,0);
		}
		public ScaffoldArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffoldArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterScaffoldArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitScaffoldArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitScaffoldArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaffoldArgsContext scaffoldArgs() throws RecognitionException {
		ScaffoldArgsContext _localctx = new ScaffoldArgsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_scaffoldArgs);
		try {
			setState(589);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BODY:
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				body();
				}
				break;
			case DRAWER_ARG:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				drawerArg();
				}
				break;
			case APP_BAR_ARG:
				enterOuterAlt(_localctx, 3);
				{
				setState(585);
				appBarArg();
				}
				break;
			case BOTTOM_NAVIGATION_BAR_ARG:
				enterOuterAlt(_localctx, 4);
				{
				setState(586);
				bottomNavigationBarArg();
				}
				break;
			case FLOATING_ACTION_BUTTON_ARG:
				enterOuterAlt(_localctx, 5);
				{
				setState(587);
				floatingActionButtonArg();
				}
				break;
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(588);
				backGroundColor();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContainerArgsContext extends ParserRuleContext {
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public HeightContext height() {
			return getRuleContext(HeightContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public MarginContext margin() {
			return getRuleContext(MarginContext.class,0);
		}
		public PaddingContext padding() {
			return getRuleContext(PaddingContext.class,0);
		}
		public ContainerArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterContainerArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitContainerArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitContainerArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerArgsContext containerArgs() throws RecognitionException {
		ContainerArgsContext _localctx = new ContainerArgsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_containerArgs);
		try {
			setState(597);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				child();
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				width();
				}
				break;
			case HEIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(593);
				height();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(594);
				color();
				}
				break;
			case MARGIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(595);
				margin();
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 6);
				{
				setState(596);
				padding();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextArgsContext extends ParserRuleContext {
		public TextArgContext textArg() {
			return getRuleContext(TextArgContext.class,0);
		}
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public TextArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTextArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTextArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTextArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextArgsContext textArgs() throws RecognitionException {
		TextArgsContext _localctx = new TextArgsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_textArgs);
		try {
			setState(601);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				textArg();
				}
				break;
			case STYLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				style();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImageArgsContext extends ParserRuleContext {
		public ImageArgContext imageArg() {
			return getRuleContext(ImageArgContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public HeightContext height() {
			return getRuleContext(HeightContext.class,0);
		}
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public ImageArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterImageArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitImageArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitImageArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageArgsContext imageArgs() throws RecognitionException {
		ImageArgsContext _localctx = new ImageArgsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_imageArgs);
		try {
			setState(607);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMAGE_ARG:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				imageArg();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				color();
				}
				break;
			case HEIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(605);
				height();
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 4);
				{
				setState(606);
				width();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListviewArgsContext extends ParserRuleContext {
		public ChildrenContext children() {
			return getRuleContext(ChildrenContext.class,0);
		}
		public PaddingContext padding() {
			return getRuleContext(PaddingContext.class,0);
		}
		public ListviewArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listviewArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterListviewArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitListviewArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitListviewArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListviewArgsContext listviewArgs() throws RecognitionException {
		ListviewArgsContext _localctx = new ListviewArgsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_listviewArgs);
		try {
			setState(611);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				children();
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				padding();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AppBarArgsContext extends ParserRuleContext {
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public LeadingContext leading() {
			return getRuleContext(LeadingContext.class,0);
		}
		public ActionsContext actions() {
			return getRuleContext(ActionsContext.class,0);
		}
		public BackGroundColorContext backGroundColor() {
			return getRuleContext(BackGroundColorContext.class,0);
		}
		public AppBarArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appBarArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAppBarArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAppBarArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAppBarArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppBarArgsContext appBarArgs() throws RecognitionException {
		AppBarArgsContext _localctx = new AppBarArgsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_appBarArgs);
		try {
			setState(617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TITLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				title();
				}
				break;
			case LEADING:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				leading();
				}
				break;
			case ACTIONS:
				enterOuterAlt(_localctx, 3);
				{
				setState(615);
				actions();
				}
				break;
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(616);
				backGroundColor();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextFieldArgsContext extends ParserRuleContext {
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public TextFieldArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textFieldArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTextFieldArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTextFieldArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTextFieldArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextFieldArgsContext textFieldArgs() throws RecognitionException {
		TextFieldArgsContext _localctx = new TextFieldArgsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_textFieldArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			style();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnArgsContext extends ParserRuleContext {
		public ChildrenContext children() {
			return getRuleContext(ChildrenContext.class,0);
		}
		public MainAxisContext mainAxis() {
			return getRuleContext(MainAxisContext.class,0);
		}
		public CrossAxisContext crossAxis() {
			return getRuleContext(CrossAxisContext.class,0);
		}
		public ColumnArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterColumnArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitColumnArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitColumnArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnArgsContext columnArgs() throws RecognitionException {
		ColumnArgsContext _localctx = new ColumnArgsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_columnArgs);
		try {
			setState(624);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				children();
				}
				break;
			case MAIN_AXIS_ALIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
				mainAxis();
				}
				break;
			case CROSS_AXIS_ALIGNMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(623);
				crossAxis();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RowArgsContext extends ParserRuleContext {
		public ChildrenContext children() {
			return getRuleContext(ChildrenContext.class,0);
		}
		public MainAxisContext mainAxis() {
			return getRuleContext(MainAxisContext.class,0);
		}
		public CrossAxisContext crossAxis() {
			return getRuleContext(CrossAxisContext.class,0);
		}
		public RowArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterRowArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitRowArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitRowArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowArgsContext rowArgs() throws RecognitionException {
		RowArgsContext _localctx = new RowArgsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_rowArgs);
		try {
			setState(629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				children();
				}
				break;
			case MAIN_AXIS_ALIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				mainAxis();
				}
				break;
			case CROSS_AXIS_ALIGNMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(628);
				crossAxis();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CardArgsContext extends ParserRuleContext {
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public MarginContext margin() {
			return getRuleContext(MarginContext.class,0);
		}
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public CardArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cardArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCardArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCardArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCardArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CardArgsContext cardArgs() throws RecognitionException {
		CardArgsContext _localctx = new CardArgsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_cardArgs);
		try {
			setState(634);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				color();
				}
				break;
			case MARGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				margin();
				}
				break;
			case CHILD:
				enterOuterAlt(_localctx, 3);
				{
				setState(633);
				child();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IconButtonArgsContext extends ParserRuleContext {
		public IconArgContext iconArg() {
			return getRuleContext(IconArgContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public PaddingContext padding() {
			return getRuleContext(PaddingContext.class,0);
		}
		public IconButtonArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iconButtonArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterIconButtonArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitIconButtonArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitIconButtonArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IconButtonArgsContext iconButtonArgs() throws RecognitionException {
		IconButtonArgsContext _localctx = new IconButtonArgsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_iconButtonArgs);
		try {
			setState(639);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ICON_ARG:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				iconArg();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
				color();
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 3);
				{
				setState(638);
				padding();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InkwellArgsContext extends ParserRuleContext {
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public OnTapContext onTap() {
			return getRuleContext(OnTapContext.class,0);
		}
		public InkwellArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inkwellArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterInkwellArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitInkwellArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitInkwellArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InkwellArgsContext inkwellArgs() throws RecognitionException {
		InkwellArgsContext _localctx = new InkwellArgsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_inkwellArgs);
		try {
			setState(643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(641);
				child();
				}
				break;
			case ON_TAP:
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				onTap();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpandedArgsContext extends ParserRuleContext {
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public FlexArgContext flexArg() {
			return getRuleContext(FlexArgContext.class,0);
		}
		public ExpandedArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expandedArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterExpandedArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitExpandedArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitExpandedArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpandedArgsContext expandedArgs() throws RecognitionException {
		ExpandedArgsContext _localctx = new ExpandedArgsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_expandedArgs);
		try {
			setState(647);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				child();
				}
				break;
			case FLEX_ARG:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				flexArg();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BottomNavigationBarArgsContext extends ParserRuleContext {
		public ItemsContext items() {
			return getRuleContext(ItemsContext.class,0);
		}
		public BackGroundColorContext backGroundColor() {
			return getRuleContext(BackGroundColorContext.class,0);
		}
		public CurrentIndexContext currentIndex() {
			return getRuleContext(CurrentIndexContext.class,0);
		}
		public BottomNavigationBarArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bottomNavigationBarArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBottomNavigationBarArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBottomNavigationBarArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBottomNavigationBarArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BottomNavigationBarArgsContext bottomNavigationBarArgs() throws RecognitionException {
		BottomNavigationBarArgsContext _localctx = new BottomNavigationBarArgsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_bottomNavigationBarArgs);
		try {
			setState(652);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ITEMS:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				items();
				}
				break;
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				backGroundColor();
				}
				break;
			case CURRENT_INDEX:
				enterOuterAlt(_localctx, 3);
				{
				setState(651);
				currentIndex();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SliderArgsContext extends ParserRuleContext {
		public MinContext min() {
			return getRuleContext(MinContext.class,0);
		}
		public MaxContext max() {
			return getRuleContext(MaxContext.class,0);
		}
		public SliderArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliderArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSliderArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSliderArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSliderArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliderArgsContext sliderArgs() throws RecognitionException {
		SliderArgsContext _localctx = new SliderArgsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_sliderArgs);
		try {
			setState(656);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(654);
				min();
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 2);
				{
				setState(655);
				max();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TabBarArgsContext extends ParserRuleContext {
		public TabsContext tabs() {
			return getRuleContext(TabsContext.class,0);
		}
		public PaddingContext padding() {
			return getRuleContext(PaddingContext.class,0);
		}
		public TabBarArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabBarArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTabBarArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTabBarArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTabBarArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabBarArgsContext tabBarArgs() throws RecognitionException {
		TabBarArgsContext _localctx = new TabBarArgsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_tabBarArgs);
		try {
			setState(660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TABS:
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				tabs();
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				padding();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TabBarViewArgsContext extends ParserRuleContext {
		public ChildrenContext children() {
			return getRuleContext(ChildrenContext.class,0);
		}
		public TabBarViewArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabBarViewArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTabBarViewArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTabBarViewArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTabBarViewArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabBarViewArgsContext tabBarViewArgs() throws RecognitionException {
		TabBarViewArgsContext _localctx = new TabBarViewArgsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_tabBarViewArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			children();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DrawerArgsContext extends ParserRuleContext {
		public BackGroundColorContext backGroundColor() {
			return getRuleContext(BackGroundColorContext.class,0);
		}
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public DrawerArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawerArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterDrawerArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitDrawerArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitDrawerArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawerArgsContext drawerArgs() throws RecognitionException {
		DrawerArgsContext _localctx = new DrawerArgsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_drawerArgs);
		try {
			setState(667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				backGroundColor();
				}
				break;
			case CHILD:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				child();
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 3);
				{
				setState(666);
				width();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FloatingActionButtonArgsContext extends ParserRuleContext {
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public BackGroundColorContext backGroundColor() {
			return getRuleContext(BackGroundColorContext.class,0);
		}
		public FloatingActionButtonArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingActionButtonArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFloatingActionButtonArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFloatingActionButtonArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFloatingActionButtonArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingActionButtonArgsContext floatingActionButtonArgs() throws RecognitionException {
		FloatingActionButtonArgsContext _localctx = new FloatingActionButtonArgsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_floatingActionButtonArgs);
		try {
			setState(671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				child();
				}
				break;
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
				backGroundColor();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WrapArgsContext extends ParserRuleContext {
		public ChildrenContext children() {
			return getRuleContext(ChildrenContext.class,0);
		}
		public CrossAxisContext crossAxis() {
			return getRuleContext(CrossAxisContext.class,0);
		}
		public WrapArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wrapArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterWrapArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitWrapArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitWrapArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WrapArgsContext wrapArgs() throws RecognitionException {
		WrapArgsContext _localctx = new WrapArgsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_wrapArgs);
		try {
			setState(675);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				children();
				}
				break;
			case CROSS_AXIS_ALIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				crossAxis();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FlexArgsContext extends ParserRuleContext {
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public FlexArgContext flexArg() {
			return getRuleContext(FlexArgContext.class,0);
		}
		public FlexArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flexArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFlexArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFlexArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFlexArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlexArgsContext flexArgs() throws RecognitionException {
		FlexArgsContext _localctx = new FlexArgsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_flexArgs);
		try {
			setState(679);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				child();
				}
				break;
			case FLEX_ARG:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				flexArg();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextFormFieldArgsContext extends ParserRuleContext {
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public TextFormFieldArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textFormFieldArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTextFormFieldArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTextFormFieldArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTextFormFieldArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextFormFieldArgsContext textFormFieldArgs() throws RecognitionException {
		TextFormFieldArgsContext _localctx = new TextFormFieldArgsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_textFormFieldArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			style();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextButtonArgsContext extends ParserRuleContext {
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public TextButtonArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textButtonArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTextButtonArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTextButtonArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTextButtonArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextButtonArgsContext textButtonArgs() throws RecognitionException {
		TextButtonArgsContext _localctx = new TextButtonArgsContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_textButtonArgs);
		try {
			setState(685);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				child();
				}
				break;
			case STYLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				style();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IconArgsContext extends ParserRuleContext {
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public TerminalNode ICONS() { return getToken(ParserFile.ICONS, 0); }
		public IconArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iconArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterIconArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitIconArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitIconArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IconArgsContext iconArgs() throws RecognitionException {
		IconArgsContext _localctx = new IconArgsContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_iconArgs);
		try {
			setState(690);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(687);
				size();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(688);
				color();
				}
				break;
			case ICONS:
				enterOuterAlt(_localctx, 3);
				{
				setState(689);
				match(ICONS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SizedBoxArgsContext extends ParserRuleContext {
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public HeightContext height() {
			return getRuleContext(HeightContext.class,0);
		}
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public SizedBoxArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizedBoxArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSizedBoxArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSizedBoxArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSizedBoxArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizedBoxArgsContext sizedBoxArgs() throws RecognitionException {
		SizedBoxArgsContext _localctx = new SizedBoxArgsContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_sizedBoxArgs);
		try {
			setState(695);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(692);
				child();
				}
				break;
			case HEIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(693);
				height();
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 3);
				{
				setState(694);
				width();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextStyleArgsContext extends ParserRuleContext {
		public BackGroundColorContext backGroundColor() {
			return getRuleContext(BackGroundColorContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public FontSizeContext fontSize() {
			return getRuleContext(FontSizeContext.class,0);
		}
		public TextStyleArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textStyleArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTextStyleArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTextStyleArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTextStyleArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextStyleArgsContext textStyleArgs() throws RecognitionException {
		TextStyleArgsContext _localctx = new TextStyleArgsContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_textStyleArgs);
		try {
			setState(700);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				backGroundColor();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(698);
				color();
				}
				break;
			case FONT_SIZE:
				enterOuterAlt(_localctx, 3);
				{
				setState(699);
				fontSize();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CenterArgsContext extends ParserRuleContext {
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public CenterArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_centerArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCenterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCenterArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCenterArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CenterArgsContext centerArgs() throws RecognitionException {
		CenterArgsContext _localctx = new CenterArgsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_centerArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			child();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public TerminalNode BODY() { return getToken(ParserFile.BODY, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
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
		enterRule(_localctx, 134, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(BODY);
			setState(705);
			match(COLON);
			setState(706);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DrawerArgContext extends ParserRuleContext {
		public TerminalNode DRAWER_ARG() { return getToken(ParserFile.DRAWER_ARG, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public DrawerContext drawer() {
			return getRuleContext(DrawerContext.class,0);
		}
		public DrawerArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawerArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterDrawerArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitDrawerArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitDrawerArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawerArgContext drawerArg() throws RecognitionException {
		DrawerArgContext _localctx = new DrawerArgContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_drawerArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(DRAWER_ARG);
			setState(709);
			match(COLON);
			setState(710);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AppBarArgContext extends ParserRuleContext {
		public TerminalNode APP_BAR_ARG() { return getToken(ParserFile.APP_BAR_ARG, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public AppBarContext appBar() {
			return getRuleContext(AppBarContext.class,0);
		}
		public AppBarArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appBarArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAppBarArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAppBarArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAppBarArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppBarArgContext appBarArg() throws RecognitionException {
		AppBarArgContext _localctx = new AppBarArgContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_appBarArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(APP_BAR_ARG);
			setState(713);
			match(COLON);
			setState(714);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BottomNavigationBarArgContext extends ParserRuleContext {
		public TerminalNode BOTTOM_NAVIGATION_BAR_ARG() { return getToken(ParserFile.BOTTOM_NAVIGATION_BAR_ARG, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public BottomNavigationBarContext bottomNavigationBar() {
			return getRuleContext(BottomNavigationBarContext.class,0);
		}
		public BottomNavigationBarArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bottomNavigationBarArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBottomNavigationBarArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBottomNavigationBarArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBottomNavigationBarArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BottomNavigationBarArgContext bottomNavigationBarArg() throws RecognitionException {
		BottomNavigationBarArgContext _localctx = new BottomNavigationBarArgContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_bottomNavigationBarArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(BOTTOM_NAVIGATION_BAR_ARG);
			setState(717);
			match(COLON);
			setState(718);
			bottomNavigationBar();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FloatingActionButtonArgContext extends ParserRuleContext {
		public TerminalNode FLOATING_ACTION_BUTTON_ARG() { return getToken(ParserFile.FLOATING_ACTION_BUTTON_ARG, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public FloatingActionButtonContext floatingActionButton() {
			return getRuleContext(FloatingActionButtonContext.class,0);
		}
		public FloatingActionButtonArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingActionButtonArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFloatingActionButtonArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFloatingActionButtonArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFloatingActionButtonArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingActionButtonArgContext floatingActionButtonArg() throws RecognitionException {
		FloatingActionButtonArgContext _localctx = new FloatingActionButtonArgContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_floatingActionButtonArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(FLOATING_ACTION_BUTTON_ARG);
			setState(721);
			match(COLON);
			setState(722);
			floatingActionButton();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChildContext extends ParserRuleContext {
		public TerminalNode CHILD() { return getToken(ParserFile.CHILD, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public ChildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_child; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildContext child() throws RecognitionException {
		ChildContext _localctx = new ChildContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_child);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(CHILD);
			setState(725);
			match(COLON);
			setState(726);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChildrenContext extends ParserRuleContext {
		public TerminalNode CHILDREN() { return getToken(ParserFile.CHILDREN, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode OPEN_SQUARE() { return getToken(ParserFile.OPEN_SQUARE, 0); }
		public TerminalNode CLOSE_SQUARE() { return getToken(ParserFile.CLOSE_SQUARE, 0); }
		public List<WidgetContext> widget() {
			return getRuleContexts(WidgetContext.class);
		}
		public WidgetContext widget(int i) {
			return getRuleContext(WidgetContext.class,i);
		}
		public ChildrenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_children; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitChildren(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildrenContext children() throws RecognitionException {
		ChildrenContext _localctx = new ChildrenContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_children);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			match(CHILDREN);
			setState(729);
			match(COLON);
			setState(730);
			match(OPEN_SQUARE);
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3285649973248L) != 0)) {
				{
				{
				setState(731);
				widget();
				}
				}
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(737);
			match(CLOSE_SQUARE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HeightContext extends ParserRuleContext {
		public TerminalNode HEIGHT() { return getToken(ParserFile.HEIGHT, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode DOUBLE() { return getToken(ParserFile.DOUBLE, 0); }
		public HeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_height; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHeight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHeight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeightContext height() throws RecognitionException {
		HeightContext _localctx = new HeightContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_height);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			match(HEIGHT);
			setState(740);
			match(COLON);
			setState(741);
			match(DOUBLE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WidthContext extends ParserRuleContext {
		public TerminalNode WIDTH() { return getToken(ParserFile.WIDTH, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode DOUBLE() { return getToken(ParserFile.DOUBLE, 0); }
		public WidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_width; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitWidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitWidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(WIDTH);
			setState(744);
			match(COLON);
			setState(745);
			match(DOUBLE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColorContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(ParserFile.COLOR, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode COLORS() { return getToken(ParserFile.COLORS, 0); }
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
		enterRule(_localctx, 152, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(COLOR);
			setState(748);
			match(COLON);
			setState(749);
			match(COLORS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MarginContext extends ParserRuleContext {
		public TerminalNode MARGIN() { return getToken(ParserFile.MARGIN, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode DOUBLE() { return getToken(ParserFile.DOUBLE, 0); }
		public MarginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_margin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterMargin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitMargin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitMargin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarginContext margin() throws RecognitionException {
		MarginContext _localctx = new MarginContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_margin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(MARGIN);
			setState(752);
			match(COLON);
			setState(753);
			match(DOUBLE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PaddingContext extends ParserRuleContext {
		public TerminalNode PADDING() { return getToken(ParserFile.PADDING, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode DOUBLE() { return getToken(ParserFile.DOUBLE, 0); }
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
		enterRule(_localctx, 156, RULE_padding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(PADDING);
			setState(756);
			match(COLON);
			setState(757);
			match(DOUBLE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ItemsContext extends ParserRuleContext {
		public TerminalNode ITEMS() { return getToken(ParserFile.ITEMS, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode OPEN_SQUARE() { return getToken(ParserFile.OPEN_SQUARE, 0); }
		public TerminalNode CLOSE_SQUARE() { return getToken(ParserFile.CLOSE_SQUARE, 0); }
		public List<WidgetContext> widget() {
			return getRuleContexts(WidgetContext.class);
		}
		public WidgetContext widget(int i) {
			return getRuleContext(WidgetContext.class,i);
		}
		public ItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemsContext items() throws RecognitionException {
		ItemsContext _localctx = new ItemsContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(ITEMS);
			setState(760);
			match(COLON);
			setState(761);
			match(OPEN_SQUARE);
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3285649973248L) != 0)) {
				{
				{
				setState(762);
				widget();
				}
				}
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(768);
			match(CLOSE_SQUARE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CurrentIndexContext extends ParserRuleContext {
		public TerminalNode CURRENT_INDEX() { return getToken(ParserFile.CURRENT_INDEX, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode INT() { return getToken(ParserFile.INT, 0); }
		public CurrentIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_currentIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCurrentIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCurrentIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCurrentIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CurrentIndexContext currentIndex() throws RecognitionException {
		CurrentIndexContext _localctx = new CurrentIndexContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_currentIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			match(CURRENT_INDEX);
			setState(771);
			match(COLON);
			setState(772);
			match(INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BackGroundColorContext extends ParserRuleContext {
		public TerminalNode BACKGROUND_COLOR() { return getToken(ParserFile.BACKGROUND_COLOR, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode COLORS() { return getToken(ParserFile.COLORS, 0); }
		public BackGroundColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backGroundColor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBackGroundColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBackGroundColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBackGroundColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackGroundColorContext backGroundColor() throws RecognitionException {
		BackGroundColorContext _localctx = new BackGroundColorContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_backGroundColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(BACKGROUND_COLOR);
			setState(775);
			match(COLON);
			setState(776);
			match(COLORS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CrossAxisContext extends ParserRuleContext {
		public TerminalNode CROSS_AXIS_ALIGNMENT() { return getToken(ParserFile.CROSS_AXIS_ALIGNMENT, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode AXIS() { return getToken(ParserFile.AXIS, 0); }
		public CrossAxisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossAxis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCrossAxis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCrossAxis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCrossAxis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrossAxisContext crossAxis() throws RecognitionException {
		CrossAxisContext _localctx = new CrossAxisContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_crossAxis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			match(CROSS_AXIS_ALIGNMENT);
			setState(779);
			match(COLON);
			setState(780);
			match(AXIS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainAxisContext extends ParserRuleContext {
		public TerminalNode MAIN_AXIS_ALIGNMENT() { return getToken(ParserFile.MAIN_AXIS_ALIGNMENT, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode AXIS() { return getToken(ParserFile.AXIS, 0); }
		public MainAxisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainAxis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterMainAxis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitMainAxis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitMainAxis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainAxisContext mainAxis() throws RecognitionException {
		MainAxisContext _localctx = new MainAxisContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_mainAxis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			match(MAIN_AXIS_ALIGNMENT);
			setState(783);
			match(COLON);
			setState(784);
			match(AXIS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StyleContext extends ParserRuleContext {
		public TerminalNode STYLE() { return getToken(ParserFile.STYLE, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TextStyleContext textStyle() {
			return getRuleContext(TextStyleContext.class,0);
		}
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
		enterRule(_localctx, 168, RULE_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(STYLE);
			setState(787);
			match(COLON);
			setState(788);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FontSizeContext extends ParserRuleContext {
		public TerminalNode FONT_SIZE() { return getToken(ParserFile.FONT_SIZE, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode DOUBLE() { return getToken(ParserFile.DOUBLE, 0); }
		public FontSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFontSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFontSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFontSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontSizeContext fontSize() throws RecognitionException {
		FontSizeContext _localctx = new FontSizeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_fontSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			match(FONT_SIZE);
			setState(791);
			match(COLON);
			setState(792);
			match(DOUBLE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextArgContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ParserFile.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ParserFile.IDENTIFIER, 0); }
		public TextArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTextArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTextArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTextArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextArgContext textArg() throws RecognitionException {
		TextArgContext _localctx = new TextArgContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_textArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImageArgContext extends ParserRuleContext {
		public TerminalNode IMAGE_ARG() { return getToken(ParserFile.IMAGE_ARG, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode STRING() { return getToken(ParserFile.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ParserFile.IDENTIFIER, 0); }
		public ImageArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterImageArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitImageArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitImageArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageArgContext imageArg() throws RecognitionException {
		ImageArgContext _localctx = new ImageArgContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_imageArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(IMAGE_ARG);
			setState(797);
			match(COLON);
			setState(798);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class LeadingContext extends ParserRuleContext {
		public TerminalNode LEADING() { return getToken(ParserFile.LEADING, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public LeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterLeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitLeading(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitLeading(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeadingContext leading() throws RecognitionException {
		LeadingContext _localctx = new LeadingContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_leading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(LEADING);
			setState(801);
			match(COLON);
			setState(802);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TitleContext extends ParserRuleContext {
		public TerminalNode TITLE() { return getToken(ParserFile.TITLE, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(TITLE);
			setState(805);
			match(COLON);
			setState(806);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ActionsContext extends ParserRuleContext {
		public TerminalNode ACTIONS() { return getToken(ParserFile.ACTIONS, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode OPEN_SQUARE() { return getToken(ParserFile.OPEN_SQUARE, 0); }
		public TerminalNode CLOSE_SQUARE() { return getToken(ParserFile.CLOSE_SQUARE, 0); }
		public List<WidgetContext> widget() {
			return getRuleContexts(WidgetContext.class);
		}
		public WidgetContext widget(int i) {
			return getRuleContext(WidgetContext.class,i);
		}
		public ActionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterActions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitActions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitActions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionsContext actions() throws RecognitionException {
		ActionsContext _localctx = new ActionsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_actions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			match(ACTIONS);
			setState(809);
			match(COLON);
			setState(810);
			match(OPEN_SQUARE);
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3285649973248L) != 0)) {
				{
				{
				setState(811);
				widget();
				}
				}
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(817);
			match(CLOSE_SQUARE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IconArgContext extends ParserRuleContext {
		public TerminalNode ICON_ARG() { return getToken(ParserFile.ICON_ARG, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public IconArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iconArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterIconArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitIconArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitIconArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IconArgContext iconArg() throws RecognitionException {
		IconArgContext _localctx = new IconArgContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_iconArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			match(ICON_ARG);
			setState(820);
			match(COLON);
			setState(821);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FlexArgContext extends ParserRuleContext {
		public TerminalNode FLEX_ARG() { return getToken(ParserFile.FLEX_ARG, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode INT() { return getToken(ParserFile.INT, 0); }
		public FlexArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flexArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFlexArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFlexArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFlexArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlexArgContext flexArg() throws RecognitionException {
		FlexArgContext _localctx = new FlexArgContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_flexArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			match(FLEX_ARG);
			setState(824);
			match(COLON);
			setState(825);
			match(INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MinContext extends ParserRuleContext {
		public TerminalNode MIN() { return getToken(ParserFile.MIN, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode DOUBLE() { return getToken(ParserFile.DOUBLE, 0); }
		public MinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_min; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitMin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitMin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinContext min() throws RecognitionException {
		MinContext _localctx = new MinContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_min);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(MIN);
			setState(828);
			match(COLON);
			setState(829);
			match(DOUBLE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MaxContext extends ParserRuleContext {
		public TerminalNode MAX() { return getToken(ParserFile.MAX, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode DOUBLE() { return getToken(ParserFile.DOUBLE, 0); }
		public MaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterMax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitMax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitMax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaxContext max() throws RecognitionException {
		MaxContext _localctx = new MaxContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_max);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(MAX);
			setState(832);
			match(COLON);
			setState(833);
			match(DOUBLE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TabsContext extends ParserRuleContext {
		public TerminalNode TABS() { return getToken(ParserFile.TABS, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode OPEN_SQUARE() { return getToken(ParserFile.OPEN_SQUARE, 0); }
		public TerminalNode CLOSE_SQUARE() { return getToken(ParserFile.CLOSE_SQUARE, 0); }
		public List<WidgetContext> widget() {
			return getRuleContexts(WidgetContext.class);
		}
		public WidgetContext widget(int i) {
			return getRuleContext(WidgetContext.class,i);
		}
		public TabsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTabs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTabs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTabs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabsContext tabs() throws RecognitionException {
		TabsContext _localctx = new TabsContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_tabs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(TABS);
			setState(836);
			match(COLON);
			setState(837);
			match(OPEN_SQUARE);
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3285649973248L) != 0)) {
				{
				{
				setState(838);
				widget();
				}
				}
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(844);
			match(CLOSE_SQUARE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SizeContext extends ParserRuleContext {
		public TerminalNode SIZE() { return getToken(ParserFile.SIZE, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode DOUBLE() { return getToken(ParserFile.DOUBLE, 0); }
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(SIZE);
			setState(847);
			match(COLON);
			setState(848);
			match(DOUBLE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OnTapContext extends ParserRuleContext {
		public TerminalNode ON_TAP() { return getToken(ParserFile.ON_TAP, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(ParserFile.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(ParserFile.CLOSE_BRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OnTapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onTap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterOnTap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitOnTap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitOnTap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnTapContext onTap() throws RecognitionException {
		OnTapContext _localctx = new OnTapContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_onTap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			match(ON_TAP);
			setState(851);
			match(COLON);
			setState(852);
			match(OPEN_PAREN);
			setState(853);
			match(CLOSE_PAREN);
			setState(854);
			match(OPEN_BRACE);
			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RUN_APP || _la==NAVIGATOR) {
				{
				{
				setState(855);
				expression();
				}
				}
				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(861);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public AllowExpContext allowExp() {
			return getRuleContext(AllowExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ParserFile.SEMICOLON, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			allowExp();
			setState(864);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AllowExpContext extends ParserRuleContext {
		public NavigateExpContext navigateExp() {
			return getRuleContext(NavigateExpContext.class,0);
		}
		public RunAppExpContext runAppExp() {
			return getRuleContext(RunAppExpContext.class,0);
		}
		public AllowExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allowExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAllowExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAllowExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAllowExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllowExpContext allowExp() throws RecognitionException {
		AllowExpContext _localctx = new AllowExpContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_allowExp);
		try {
			setState(868);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAVIGATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(866);
				navigateExp();
				}
				break;
			case RUN_APP:
				enterOuterAlt(_localctx, 2);
				{
				setState(867);
				runAppExp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RunAppExpContext extends ParserRuleContext {
		public TerminalNode RUN_APP() { return getToken(ParserFile.RUN_APP, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public RunAppExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runAppExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterRunAppExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitRunAppExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitRunAppExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RunAppExpContext runAppExp() throws RecognitionException {
		RunAppExpContext _localctx = new RunAppExpContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_runAppExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			match(RUN_APP);
			setState(871);
			match(OPEN_PAREN);
			setState(872);
			constructor();
			setState(873);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NavigateExpContext extends ParserRuleContext {
		public TerminalNode NAVIGATOR() { return getToken(ParserFile.NAVIGATOR, 0); }
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public TranstionContext transtion() {
			return getRuleContext(TranstionContext.class,0);
		}
		public NavigateExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigateExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterNavigateExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitNavigateExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitNavigateExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavigateExpContext navigateExp() throws RecognitionException {
		NavigateExpContext _localctx = new NavigateExpContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_navigateExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			match(NAVIGATOR);
			setState(876);
			match(DOT);
			setState(877);
			transtion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TranstionContext extends ParserRuleContext {
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public PopContext pop() {
			return getRuleContext(PopContext.class,0);
		}
		public TranstionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transtion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTranstion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTranstion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTranstion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranstionContext transtion() throws RecognitionException {
		TranstionContext _localctx = new TranstionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_transtion);
		try {
			setState(881);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUSH:
				enterOuterAlt(_localctx, 1);
				{
				setState(879);
				push();
				}
				break;
			case POP:
				enterOuterAlt(_localctx, 2);
				{
				setState(880);
				pop();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PushContext extends ParserRuleContext {
		public TerminalNode PUSH() { return getToken(ParserFile.PUSH, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitPush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitPush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			match(PUSH);
			setState(884);
			match(OPEN_PAREN);
			setState(885);
			constructor();
			setState(886);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PopContext extends ParserRuleContext {
		public TerminalNode POP() { return getToken(ParserFile.POP, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public PopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterPop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitPop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitPop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PopContext pop() throws RecognitionException {
		PopContext _localctx = new PopContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_pop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(POP);
			setState(889);
			match(OPEN_PAREN);
			setState(890);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserFile.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<ConstructoFilledContext> constructoFilled() {
			return getRuleContexts(ConstructoFilledContext.class);
		}
		public ConstructoFilledContext constructoFilled(int i) {
			return getRuleContext(ConstructoFilledContext.class,i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			match(IDENTIFIER);
			setState(893);
			match(OPEN_PAREN);
			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOUBLE || _la==STRING) {
				{
				{
				setState(894);
				constructoFilled();
				}
				}
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(900);
			match(CLOSE_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructoFilledContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ParserFile.STRING, 0); }
		public TerminalNode DOUBLE() { return getToken(ParserFile.DOUBLE, 0); }
		public ConstructoFilledContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructoFilled; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterConstructoFilled(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitConstructoFilled(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitConstructoFilled(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructoFilledContext constructoFilled() throws RecognitionException {
		ConstructoFilledContext _localctx = new ConstructoFilledContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_constructoFilled);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==STRING) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001s\u0389\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007h\u0002"+
		"i\u0007i\u0002j\u0007j\u0001\u0000\u0001\u0000\u0005\u0000\u00d9\b\u0000"+
		"\n\u0000\f\u0000\u00dc\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u00e4\b\u0001\n\u0001\f\u0001"+
		"\u00e7\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u00ef\b\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"\u00f3\b\u0002\n\u0002\f\u0002\u00f6\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00fd\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u0106\b\u0005\n\u0005\f\u0005\u0109\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u013d\b\f\u0001\r\u0001\r\u0001\r\u0005\r\u0142\b\r"+
		"\n\r\f\r\u0145\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u014c\b\u000e\n\u000e\f\u000e\u014f\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0156\b\u000f\n"+
		"\u000f\f\u000f\u0159\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u0160\b\u0010\n\u0010\f\u0010\u0163\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u016a\b\u0011\n\u0011\f\u0011\u016d\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0174\b\u0012\n\u0012\f\u0012"+
		"\u0177\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u017e\b\u0013\n\u0013\f\u0013\u0181\t\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0188\b\u0014\n"+
		"\u0014\f\u0014\u018b\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u0192\b\u0015\n\u0015\f\u0015\u0195\t\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u019c\b\u0016\n\u0016\f\u0016\u019f\t\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u01a6\b\u0017\n\u0017\f\u0017"+
		"\u01a9\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u01b0\b\u0018\n\u0018\f\u0018\u01b3\t\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01ba\b\u0019\n"+
		"\u0019\f\u0019\u01bd\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u01c4\b\u001a\n\u001a\f\u001a\u01c7\t\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b"+
		"\u01ce\b\u001b\n\u001b\f\u001b\u01d1\t\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01d8\b\u001c\n\u001c\f\u001c"+
		"\u01db\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u01e2\b\u001d\n\u001d\f\u001d\u01e5\t\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u01ec\b\u001e\n"+
		"\u001e\f\u001e\u01ef\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u01f6\b\u001f\n\u001f\f\u001f\u01f9\t\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0005 \u0200\b \n \f \u0203"+
		"\t \u0001 \u0001 \u0001!\u0001!\u0001!\u0005!\u020a\b!\n!\f!\u020d\t!"+
		"\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0005\"\u0214\b\"\n\"\f\"\u0217"+
		"\t\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0005#\u021e\b#\n#\f#\u0221"+
		"\t#\u0001#\u0001#\u0001$\u0001$\u0001$\u0005$\u0228\b$\n$\f$\u022b\t$"+
		"\u0001$\u0001$\u0001%\u0001%\u0001%\u0005%\u0232\b%\n%\f%\u0235\t%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0005&\u023c\b&\n&\f&\u023f\t&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001("+
		"\u0001(\u0001(\u0003(\u024e\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0003)\u0256\b)\u0001*\u0001*\u0003*\u025a\b*\u0001+\u0001+\u0001+\u0001"+
		"+\u0003+\u0260\b+\u0001,\u0001,\u0003,\u0264\b,\u0001-\u0001-\u0001-\u0001"+
		"-\u0003-\u026a\b-\u0001.\u0001.\u0001/\u0001/\u0001/\u0003/\u0271\b/\u0001"+
		"0\u00010\u00010\u00030\u0276\b0\u00011\u00011\u00011\u00031\u027b\b1\u0001"+
		"2\u00012\u00012\u00032\u0280\b2\u00013\u00013\u00033\u0284\b3\u00014\u0001"+
		"4\u00034\u0288\b4\u00015\u00015\u00015\u00035\u028d\b5\u00016\u00016\u0003"+
		"6\u0291\b6\u00017\u00017\u00037\u0295\b7\u00018\u00018\u00019\u00019\u0001"+
		"9\u00039\u029c\b9\u0001:\u0001:\u0003:\u02a0\b:\u0001;\u0001;\u0003;\u02a4"+
		"\b;\u0001<\u0001<\u0003<\u02a8\b<\u0001=\u0001=\u0001>\u0001>\u0003>\u02ae"+
		"\b>\u0001?\u0001?\u0001?\u0003?\u02b3\b?\u0001@\u0001@\u0001@\u0003@\u02b8"+
		"\b@\u0001A\u0001A\u0001A\u0003A\u02bd\bA\u0001B\u0001B\u0001C\u0001C\u0001"+
		"C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001"+
		"F\u0001F\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001H\u0001H\u0001"+
		"H\u0001H\u0001I\u0001I\u0001I\u0001I\u0005I\u02dd\bI\nI\fI\u02e0\tI\u0001"+
		"I\u0001I\u0001J\u0001J\u0001J\u0001J\u0001K\u0001K\u0001K\u0001K\u0001"+
		"L\u0001L\u0001L\u0001L\u0001M\u0001M\u0001M\u0001M\u0001N\u0001N\u0001"+
		"N\u0001N\u0001O\u0001O\u0001O\u0001O\u0005O\u02fc\bO\nO\fO\u02ff\tO\u0001"+
		"O\u0001O\u0001P\u0001P\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"R\u0001R\u0001R\u0001R\u0001S\u0001S\u0001S\u0001S\u0001T\u0001T\u0001"+
		"T\u0001T\u0001U\u0001U\u0001U\u0001U\u0001V\u0001V\u0001W\u0001W\u0001"+
		"W\u0001W\u0001X\u0001X\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0001Y\u0001"+
		"Z\u0001Z\u0001Z\u0001Z\u0005Z\u032d\bZ\nZ\fZ\u0330\tZ\u0001Z\u0001Z\u0001"+
		"[\u0001[\u0001[\u0001[\u0001\\\u0001\\\u0001\\\u0001\\\u0001]\u0001]\u0001"+
		"]\u0001]\u0001^\u0001^\u0001^\u0001^\u0001_\u0001_\u0001_\u0001_\u0005"+
		"_\u0348\b_\n_\f_\u034b\t_\u0001_\u0001_\u0001`\u0001`\u0001`\u0001`\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0001a\u0005a\u0359\ba\na\fa\u035c\ta\u0001"+
		"a\u0001a\u0001b\u0001b\u0001b\u0001c\u0001c\u0003c\u0365\bc\u0001d\u0001"+
		"d\u0001d\u0001d\u0001d\u0001e\u0001e\u0001e\u0001e\u0001f\u0001f\u0003"+
		"f\u0372\bf\u0001g\u0001g\u0001g\u0001g\u0001g\u0001h\u0001h\u0001h\u0001"+
		"h\u0001i\u0001i\u0001i\u0005i\u0380\bi\ni\fi\u0383\ti\u0001i\u0001i\u0001"+
		"j\u0001j\u0001j\u0000\u0000k\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u0000"+
		"\u0002\u0002\u0000QQXX\u0002\u0000TTXX\u038b\u0000\u00d6\u0001\u0000\u0000"+
		"\u0000\u0002\u00dd\u0001\u0000\u0000\u0000\u0004\u00ea\u0001\u0000\u0000"+
		"\u0000\u0006\u00fc\u0001\u0000\u0000\u0000\b\u00fe\u0001\u0000\u0000\u0000"+
		"\n\u0102\u0001\u0000\u0000\u0000\f\u010d\u0001\u0000\u0000\u0000\u000e"+
		"\u0115\u0001\u0000\u0000\u0000\u0010\u0118\u0001\u0000\u0000\u0000\u0012"+
		"\u011c\u0001\u0000\u0000\u0000\u0014\u011e\u0001\u0000\u0000\u0000\u0016"+
		"\u0120\u0001\u0000\u0000\u0000\u0018\u013c\u0001\u0000\u0000\u0000\u001a"+
		"\u013e\u0001\u0000\u0000\u0000\u001c\u0148\u0001\u0000\u0000\u0000\u001e"+
		"\u0152\u0001\u0000\u0000\u0000 \u015c\u0001\u0000\u0000\u0000\"\u0166"+
		"\u0001\u0000\u0000\u0000$\u0170\u0001\u0000\u0000\u0000&\u017a\u0001\u0000"+
		"\u0000\u0000(\u0184\u0001\u0000\u0000\u0000*\u018e\u0001\u0000\u0000\u0000"+
		",\u0198\u0001\u0000\u0000\u0000.\u01a2\u0001\u0000\u0000\u00000\u01ac"+
		"\u0001\u0000\u0000\u00002\u01b6\u0001\u0000\u0000\u00004\u01c0\u0001\u0000"+
		"\u0000\u00006\u01ca\u0001\u0000\u0000\u00008\u01d4\u0001\u0000\u0000\u0000"+
		":\u01de\u0001\u0000\u0000\u0000<\u01e8\u0001\u0000\u0000\u0000>\u01f2"+
		"\u0001\u0000\u0000\u0000@\u01fc\u0001\u0000\u0000\u0000B\u0206\u0001\u0000"+
		"\u0000\u0000D\u0210\u0001\u0000\u0000\u0000F\u021a\u0001\u0000\u0000\u0000"+
		"H\u0224\u0001\u0000\u0000\u0000J\u022e\u0001\u0000\u0000\u0000L\u0238"+
		"\u0001\u0000\u0000\u0000N\u0242\u0001\u0000\u0000\u0000P\u024d\u0001\u0000"+
		"\u0000\u0000R\u0255\u0001\u0000\u0000\u0000T\u0259\u0001\u0000\u0000\u0000"+
		"V\u025f\u0001\u0000\u0000\u0000X\u0263\u0001\u0000\u0000\u0000Z\u0269"+
		"\u0001\u0000\u0000\u0000\\\u026b\u0001\u0000\u0000\u0000^\u0270\u0001"+
		"\u0000\u0000\u0000`\u0275\u0001\u0000\u0000\u0000b\u027a\u0001\u0000\u0000"+
		"\u0000d\u027f\u0001\u0000\u0000\u0000f\u0283\u0001\u0000\u0000\u0000h"+
		"\u0287\u0001\u0000\u0000\u0000j\u028c\u0001\u0000\u0000\u0000l\u0290\u0001"+
		"\u0000\u0000\u0000n\u0294\u0001\u0000\u0000\u0000p\u0296\u0001\u0000\u0000"+
		"\u0000r\u029b\u0001\u0000\u0000\u0000t\u029f\u0001\u0000\u0000\u0000v"+
		"\u02a3\u0001\u0000\u0000\u0000x\u02a7\u0001\u0000\u0000\u0000z\u02a9\u0001"+
		"\u0000\u0000\u0000|\u02ad\u0001\u0000\u0000\u0000~\u02b2\u0001\u0000\u0000"+
		"\u0000\u0080\u02b7\u0001\u0000\u0000\u0000\u0082\u02bc\u0001\u0000\u0000"+
		"\u0000\u0084\u02be\u0001\u0000\u0000\u0000\u0086\u02c0\u0001\u0000\u0000"+
		"\u0000\u0088\u02c4\u0001\u0000\u0000\u0000\u008a\u02c8\u0001\u0000\u0000"+
		"\u0000\u008c\u02cc\u0001\u0000\u0000\u0000\u008e\u02d0\u0001\u0000\u0000"+
		"\u0000\u0090\u02d4\u0001\u0000\u0000\u0000\u0092\u02d8\u0001\u0000\u0000"+
		"\u0000\u0094\u02e3\u0001\u0000\u0000\u0000\u0096\u02e7\u0001\u0000\u0000"+
		"\u0000\u0098\u02eb\u0001\u0000\u0000\u0000\u009a\u02ef\u0001\u0000\u0000"+
		"\u0000\u009c\u02f3\u0001\u0000\u0000\u0000\u009e\u02f7\u0001\u0000\u0000"+
		"\u0000\u00a0\u0302\u0001\u0000\u0000\u0000\u00a2\u0306\u0001\u0000\u0000"+
		"\u0000\u00a4\u030a\u0001\u0000\u0000\u0000\u00a6\u030e\u0001\u0000\u0000"+
		"\u0000\u00a8\u0312\u0001\u0000\u0000\u0000\u00aa\u0316\u0001\u0000\u0000"+
		"\u0000\u00ac\u031a\u0001\u0000\u0000\u0000\u00ae\u031c\u0001\u0000\u0000"+
		"\u0000\u00b0\u0320\u0001\u0000\u0000\u0000\u00b2\u0324\u0001\u0000\u0000"+
		"\u0000\u00b4\u0328\u0001\u0000\u0000\u0000\u00b6\u0333\u0001\u0000\u0000"+
		"\u0000\u00b8\u0337\u0001\u0000\u0000\u0000\u00ba\u033b\u0001\u0000\u0000"+
		"\u0000\u00bc\u033f\u0001\u0000\u0000\u0000\u00be\u0343\u0001\u0000\u0000"+
		"\u0000\u00c0\u034e\u0001\u0000\u0000\u0000\u00c2\u0352\u0001\u0000\u0000"+
		"\u0000\u00c4\u035f\u0001\u0000\u0000\u0000\u00c6\u0364\u0001\u0000\u0000"+
		"\u0000\u00c8\u0366\u0001\u0000\u0000\u0000\u00ca\u036b\u0001\u0000\u0000"+
		"\u0000\u00cc\u0371\u0001\u0000\u0000\u0000\u00ce\u0373\u0001\u0000\u0000"+
		"\u0000\u00d0\u0378\u0001\u0000\u0000\u0000\u00d2\u037c\u0001\u0000\u0000"+
		"\u0000\u00d4\u0386\u0001\u0000\u0000\u0000\u00d6\u00da\u0003\u0002\u0001"+
		"\u0000\u00d7\u00d9\u0003\u0004\u0002\u0000\u00d8\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u0001\u0001\u0000\u0000"+
		"\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u0003\u0000"+
		"\u0000\u00de\u00df\u0005\u0004\u0000\u0000\u00df\u00e0\u0005^\u0000\u0000"+
		"\u00e0\u00e1\u0005_\u0000\u0000\u00e1\u00e5\u0005b\u0000\u0000\u00e2\u00e4"+
		"\u0003\u00c4b\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0005c\u0000\u0000\u00e9\u0003\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0005\u0001\u0000\u0000\u00eb\u00ee\u0003\u0016"+
		"\u000b\u0000\u00ec\u00ed\u0005\u0002\u0000\u0000\u00ed\u00ef\u0005\u0006"+
		"\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f4\u0005b\u0000"+
		"\u0000\u00f1\u00f3\u0003\u0006\u0003\u0000\u00f2\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005c\u0000\u0000"+
		"\u00f8\u0005\u0001\u0000\u0000\u0000\u00f9\u00fd\u0003\b\u0004\u0000\u00fa"+
		"\u00fd\u0003\n\u0005\u0000\u00fb\u00fd\u0003\f\u0006\u0000\u00fc\u00f9"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fd\u0007\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0003\u0012\t\u0000\u00ff\u0100\u0003\u0014\n\u0000\u0100\u0101\u0005"+
		"[\u0000\u0000\u0101\t\u0001\u0000\u0000\u0000\u0102\u0103\u0003\u0016"+
		"\u000b\u0000\u0103\u0107\u0005^\u0000\u0000\u0104\u0106\u0003\u000e\u0007"+
		"\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106\u0109\u0001\u0000\u0000"+
		"\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000"+
		"\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0005_\u0000\u0000\u010b\u010c\u0005[\u0000\u0000\u010c"+
		"\u000b\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u0007\u0000\u0000\u010e"+
		"\u010f\u0005\b\u0000\u0000\u010f\u0110\u0005^\u0000\u0000\u0110\u0111"+
		"\u0005_\u0000\u0000\u0111\u0112\u0005b\u0000\u0000\u0112\u0113\u0003\u0010"+
		"\b\u0000\u0113\u0114\u0005c\u0000\u0000\u0114\r\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0003\u0012\t\u0000\u0116\u0117\u0003\u0014\n\u0000\u0117"+
		"\u000f\u0001\u0000\u0000\u0000\u0118\u0119\u0005\t\u0000\u0000\u0119\u011a"+
		"\u0003\u0018\f\u0000\u011a\u011b\u0005[\u0000\u0000\u011b\u0011\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0005\f\u0000\u0000\u011d\u0013\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0005Q\u0000\u0000\u011f\u0015\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0005Q\u0000\u0000\u0121\u0017\u0001\u0000\u0000\u0000"+
		"\u0122\u013d\u0003\u001a\r\u0000\u0123\u013d\u0003\u001c\u000e\u0000\u0124"+
		"\u013d\u0003\u001e\u000f\u0000\u0125\u013d\u0003\"\u0011\u0000\u0126\u013d"+
		"\u0003$\u0012\u0000\u0127\u013d\u0003&\u0013\u0000\u0128\u013d\u0003("+
		"\u0014\u0000\u0129\u013d\u0003*\u0015\u0000\u012a\u013d\u0003,\u0016\u0000"+
		"\u012b\u013d\u0003.\u0017\u0000\u012c\u013d\u00030\u0018\u0000\u012d\u013d"+
		"\u00032\u0019\u0000\u012e\u013d\u00034\u001a\u0000\u012f\u013d\u00036"+
		"\u001b\u0000\u0130\u013d\u00038\u001c\u0000\u0131\u013d\u0003:\u001d\u0000"+
		"\u0132\u013d\u0003<\u001e\u0000\u0133\u013d\u0003>\u001f\u0000\u0134\u013d"+
		"\u0003@ \u0000\u0135\u013d\u0003B!\u0000\u0136\u013d\u0003D\"\u0000\u0137"+
		"\u013d\u0003F#\u0000\u0138\u013d\u0003H$\u0000\u0139\u013d\u0003J%\u0000"+
		"\u013a\u013d\u0003L&\u0000\u013b\u013d\u0003N\'\u0000\u013c\u0122\u0001"+
		"\u0000\u0000\u0000\u013c\u0123\u0001\u0000\u0000\u0000\u013c\u0124\u0001"+
		"\u0000\u0000\u0000\u013c\u0125\u0001\u0000\u0000\u0000\u013c\u0126\u0001"+
		"\u0000\u0000\u0000\u013c\u0127\u0001\u0000\u0000\u0000\u013c\u0128\u0001"+
		"\u0000\u0000\u0000\u013c\u0129\u0001\u0000\u0000\u0000\u013c\u012a\u0001"+
		"\u0000\u0000\u0000\u013c\u012b\u0001\u0000\u0000\u0000\u013c\u012c\u0001"+
		"\u0000\u0000\u0000\u013c\u012d\u0001\u0000\u0000\u0000\u013c\u012e\u0001"+
		"\u0000\u0000\u0000\u013c\u012f\u0001\u0000\u0000\u0000\u013c\u0130\u0001"+
		"\u0000\u0000\u0000\u013c\u0131\u0001\u0000\u0000\u0000\u013c\u0132\u0001"+
		"\u0000\u0000\u0000\u013c\u0133\u0001\u0000\u0000\u0000\u013c\u0134\u0001"+
		"\u0000\u0000\u0000\u013c\u0135\u0001\u0000\u0000\u0000\u013c\u0136\u0001"+
		"\u0000\u0000\u0000\u013c\u0137\u0001\u0000\u0000\u0000\u013c\u0138\u0001"+
		"\u0000\u0000\u0000\u013c\u0139\u0001\u0000\u0000\u0000\u013c\u013a\u0001"+
		"\u0000\u0000\u0000\u013c\u013b\u0001\u0000\u0000\u0000\u013d\u0019\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u0005\r\u0000\u0000\u013f\u0143\u0005^"+
		"\u0000\u0000\u0140\u0142\u0003P(\u0000\u0141\u0140\u0001\u0000\u0000\u0000"+
		"\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000"+
		"\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0146\u0001\u0000\u0000\u0000"+
		"\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u0147\u0005_\u0000\u0000\u0147"+
		"\u001b\u0001\u0000\u0000\u0000\u0148\u0149\u0005\u000e\u0000\u0000\u0149"+
		"\u014d\u0005^\u0000\u0000\u014a\u014c\u0003R)\u0000\u014b\u014a\u0001"+
		"\u0000\u0000\u0000\u014c\u014f\u0001\u0000\u0000\u0000\u014d\u014b\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0150\u0001"+
		"\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u0150\u0151\u0005"+
		"_\u0000\u0000\u0151\u001d\u0001\u0000\u0000\u0000\u0152\u0153\u0005\u001c"+
		"\u0000\u0000\u0153\u0157\u0005^\u0000\u0000\u0154\u0156\u0003T*\u0000"+
		"\u0155\u0154\u0001\u0000\u0000\u0000\u0156\u0159\u0001\u0000\u0000\u0000"+
		"\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000"+
		"\u0158\u015a\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000"+
		"\u015a\u015b\u0005_\u0000\u0000\u015b\u001f\u0001\u0000\u0000\u0000\u015c"+
		"\u015d\u0005(\u0000\u0000\u015d\u0161\u0005^\u0000\u0000\u015e\u0160\u0003"+
		"\u0082A\u0000\u015f\u015e\u0001\u0000\u0000\u0000\u0160\u0163\u0001\u0000"+
		"\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000"+
		"\u0000\u0000\u0162\u0164\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000"+
		"\u0000\u0000\u0164\u0165\u0005_\u0000\u0000\u0165!\u0001\u0000\u0000\u0000"+
		"\u0166\u0167\u0005\u001d\u0000\u0000\u0167\u016b\u0005^\u0000\u0000\u0168"+
		"\u016a\u0003V+\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u016a\u016d\u0001"+
		"\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b\u016c\u0001"+
		"\u0000\u0000\u0000\u016c\u016e\u0001\u0000\u0000\u0000\u016d\u016b\u0001"+
		"\u0000\u0000\u0000\u016e\u016f\u0005_\u0000\u0000\u016f#\u0001\u0000\u0000"+
		"\u0000\u0170\u0171\u0005\u0011\u0000\u0000\u0171\u0175\u0005^\u0000\u0000"+
		"\u0172\u0174\u0003X,\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0174\u0177"+
		"\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176"+
		"\u0001\u0000\u0000\u0000\u0176\u0178\u0001\u0000\u0000\u0000\u0177\u0175"+
		"\u0001\u0000\u0000\u0000\u0178\u0179\u0005_\u0000\u0000\u0179%\u0001\u0000"+
		"\u0000\u0000\u017a\u017b\u0005\u001e\u0000\u0000\u017b\u017f\u0005^\u0000"+
		"\u0000\u017c\u017e\u0003Z-\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017e"+
		"\u0181\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f"+
		"\u0180\u0001\u0000\u0000\u0000\u0180\u0182\u0001\u0000\u0000\u0000\u0181"+
		"\u017f\u0001\u0000\u0000\u0000\u0182\u0183\u0005_\u0000\u0000\u0183\'"+
		"\u0001\u0000\u0000\u0000\u0184\u0185\u0005\u001f\u0000\u0000\u0185\u0189"+
		"\u0005^\u0000\u0000\u0186\u0188\u0003\\.\u0000\u0187\u0186\u0001\u0000"+
		"\u0000\u0000\u0188\u018b\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000"+
		"\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018c\u0001\u0000"+
		"\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018c\u018d\u0005_\u0000"+
		"\u0000\u018d)\u0001\u0000\u0000\u0000\u018e\u018f\u0005\u0010\u0000\u0000"+
		"\u018f\u0193\u0005^\u0000\u0000\u0190\u0192\u0003^/\u0000\u0191\u0190"+
		"\u0001\u0000\u0000\u0000\u0192\u0195\u0001\u0000\u0000\u0000\u0193\u0191"+
		"\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0196"+
		"\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0196\u0197"+
		"\u0005_\u0000\u0000\u0197+\u0001\u0000\u0000\u0000\u0198\u0199\u0005\u000f"+
		"\u0000\u0000\u0199\u019d\u0005^\u0000\u0000\u019a\u019c\u0003`0\u0000"+
		"\u019b\u019a\u0001\u0000\u0000\u0000\u019c\u019f\u0001\u0000\u0000\u0000"+
		"\u019d\u019b\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000"+
		"\u019e\u01a0\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a1\u0005_\u0000\u0000\u01a1-\u0001\u0000\u0000\u0000\u01a2\u01a3"+
		"\u0005\u0014\u0000\u0000\u01a3\u01a7\u0005^\u0000\u0000\u01a4\u01a6\u0003"+
		"b1\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000"+
		"\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ab\u0005_\u0000\u0000\u01ab/\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ad\u0005\u0015\u0000\u0000\u01ad\u01b1\u0005^\u0000\u0000\u01ae\u01b0"+
		"\u0003d2\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b4\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b5\u0005_\u0000\u0000\u01b51\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b7\u0005\"\u0000\u0000\u01b7\u01bb\u0005^\u0000\u0000\u01b8"+
		"\u01ba\u0003f3\u0000\u01b9\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bd\u0001"+
		"\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001"+
		"\u0000\u0000\u0000\u01bc\u01be\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001"+
		"\u0000\u0000\u0000\u01be\u01bf\u0005_\u0000\u0000\u01bf3\u0001\u0000\u0000"+
		"\u0000\u01c0\u01c1\u0005\u0013\u0000\u0000\u01c1\u01c5\u0005^\u0000\u0000"+
		"\u01c2\u01c4\u0003h4\u0000\u01c3\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c7"+
		"\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c8\u0001\u0000\u0000\u0000\u01c7\u01c5"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005_\u0000\u0000\u01c95\u0001\u0000"+
		"\u0000\u0000\u01ca\u01cb\u0005#\u0000\u0000\u01cb\u01cf\u0005^\u0000\u0000"+
		"\u01cc\u01ce\u0003j5\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01ce\u01d1"+
		"\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d2\u0001\u0000\u0000\u0000\u01d1\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005_\u0000\u0000\u01d37\u0001\u0000"+
		"\u0000\u0000\u01d4\u01d5\u0005\u0017\u0000\u0000\u01d5\u01d9\u0005^\u0000"+
		"\u0000\u01d6\u01d8\u0003l6\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d8"+
		"\u01db\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01d9"+
		"\u01da\u0001\u0000\u0000\u0000\u01da\u01dc\u0001\u0000\u0000\u0000\u01db"+
		"\u01d9\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005_\u0000\u0000\u01dd9\u0001"+
		"\u0000\u0000\u0000\u01de\u01df\u0005$\u0000\u0000\u01df\u01e3\u0005^\u0000"+
		"\u0000\u01e0\u01e2\u0003n7\u0000\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e6\u0001\u0000\u0000\u0000\u01e5"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e6\u01e7\u0005_\u0000\u0000\u01e7;\u0001"+
		"\u0000\u0000\u0000\u01e8\u01e9\u0005%\u0000\u0000\u01e9\u01ed\u0005^\u0000"+
		"\u0000\u01ea\u01ec\u0003p8\u0000\u01eb\u01ea\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ef\u0001\u0000\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ed"+
		"\u01ee\u0001\u0000\u0000\u0000\u01ee\u01f0\u0001\u0000\u0000\u0000\u01ef"+
		"\u01ed\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005_\u0000\u0000\u01f1=\u0001"+
		"\u0000\u0000\u0000\u01f2\u01f3\u0005\u0018\u0000\u0000\u01f3\u01f7\u0005"+
		"^\u0000\u0000\u01f4\u01f6\u0003r9\u0000\u01f5\u01f4\u0001\u0000\u0000"+
		"\u0000\u01f6\u01f9\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01fa\u0001\u0000\u0000"+
		"\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005_\u0000\u0000"+
		"\u01fb?\u0001\u0000\u0000\u0000\u01fc\u01fd\u0005&\u0000\u0000\u01fd\u0201"+
		"\u0005^\u0000\u0000\u01fe\u0200\u0003t:\u0000\u01ff\u01fe\u0001\u0000"+
		"\u0000\u0000\u0200\u0203\u0001\u0000\u0000\u0000\u0201\u01ff\u0001\u0000"+
		"\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u0204\u0001\u0000"+
		"\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0204\u0205\u0005_\u0000"+
		"\u0000\u0205A\u0001\u0000\u0000\u0000\u0206\u0207\u0005\u0019\u0000\u0000"+
		"\u0207\u020b\u0005^\u0000\u0000\u0208\u020a\u0003v;\u0000\u0209\u0208"+
		"\u0001\u0000\u0000\u0000\u020a\u020d\u0001\u0000\u0000\u0000\u020b\u0209"+
		"\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c\u020e"+
		"\u0001\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020e\u020f"+
		"\u0005_\u0000\u0000\u020fC\u0001\u0000\u0000\u0000\u0210\u0211\u0005\u001a"+
		"\u0000\u0000\u0211\u0215\u0005^\u0000\u0000\u0212\u0214\u0003x<\u0000"+
		"\u0213\u0212\u0001\u0000\u0000\u0000\u0214\u0217\u0001\u0000\u0000\u0000"+
		"\u0215\u0213\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000"+
		"\u0216\u0218\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000"+
		"\u0218\u0219\u0005_\u0000\u0000\u0219E\u0001\u0000\u0000\u0000\u021a\u021b"+
		"\u0005\'\u0000\u0000\u021b\u021f\u0005^\u0000\u0000\u021c\u021e\u0003"+
		"z=\u0000\u021d\u021c\u0001\u0000\u0000\u0000\u021e\u0221\u0001\u0000\u0000"+
		"\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000"+
		"\u0000\u0220\u0222\u0001\u0000\u0000\u0000\u0221\u021f\u0001\u0000\u0000"+
		"\u0000\u0222\u0223\u0005_\u0000\u0000\u0223G\u0001\u0000\u0000\u0000\u0224"+
		"\u0225\u0005\u001b\u0000\u0000\u0225\u0229\u0005^\u0000\u0000\u0226\u0228"+
		"\u0003|>\u0000\u0227\u0226\u0001\u0000\u0000\u0000\u0228\u022b\u0001\u0000"+
		"\u0000\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000"+
		"\u0000\u0000\u022a\u022c\u0001\u0000\u0000\u0000\u022b\u0229\u0001\u0000"+
		"\u0000\u0000\u022c\u022d\u0005_\u0000\u0000\u022dI\u0001\u0000\u0000\u0000"+
		"\u022e\u022f\u0005\u0016\u0000\u0000\u022f\u0233\u0005^\u0000\u0000\u0230"+
		"\u0232\u0003~?\u0000\u0231\u0230\u0001\u0000\u0000\u0000\u0232\u0235\u0001"+
		"\u0000\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0233\u0234\u0001"+
		"\u0000\u0000\u0000\u0234\u0236\u0001\u0000\u0000\u0000\u0235\u0233\u0001"+
		"\u0000\u0000\u0000\u0236\u0237\u0005_\u0000\u0000\u0237K\u0001\u0000\u0000"+
		"\u0000\u0238\u0239\u0005\u0012\u0000\u0000\u0239\u023d\u0005^\u0000\u0000"+
		"\u023a\u023c\u0003\u0080@\u0000\u023b\u023a\u0001\u0000\u0000\u0000\u023c"+
		"\u023f\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023d"+
		"\u023e\u0001\u0000\u0000\u0000\u023e\u0240\u0001\u0000\u0000\u0000\u023f"+
		"\u023d\u0001\u0000\u0000\u0000\u0240\u0241\u0005_\u0000\u0000\u0241M\u0001"+
		"\u0000\u0000\u0000\u0242\u0243\u0005)\u0000\u0000\u0243\u0244\u0005^\u0000"+
		"\u0000\u0244\u0245\u0003\u0084B\u0000\u0245\u0246\u0005_\u0000\u0000\u0246"+
		"O\u0001\u0000\u0000\u0000\u0247\u024e\u0003\u0086C\u0000\u0248\u024e\u0003"+
		"\u0088D\u0000\u0249\u024e\u0003\u008aE\u0000\u024a\u024e\u0003\u008cF"+
		"\u0000\u024b\u024e\u0003\u008eG\u0000\u024c\u024e\u0003\u00a2Q\u0000\u024d"+
		"\u0247\u0001\u0000\u0000\u0000\u024d\u0248\u0001\u0000\u0000\u0000\u024d"+
		"\u0249\u0001\u0000\u0000\u0000\u024d\u024a\u0001\u0000\u0000\u0000\u024d"+
		"\u024b\u0001\u0000\u0000\u0000\u024d\u024c\u0001\u0000\u0000\u0000\u024e"+
		"Q\u0001\u0000\u0000\u0000\u024f\u0256\u0003\u0090H\u0000\u0250\u0256\u0003"+
		"\u0096K\u0000\u0251\u0256\u0003\u0094J\u0000\u0252\u0256\u0003\u0098L"+
		"\u0000\u0253\u0256\u0003\u009aM\u0000\u0254\u0256\u0003\u009cN\u0000\u0255"+
		"\u024f\u0001\u0000\u0000\u0000\u0255\u0250\u0001\u0000\u0000\u0000\u0255"+
		"\u0251\u0001\u0000\u0000\u0000\u0255\u0252\u0001\u0000\u0000\u0000\u0255"+
		"\u0253\u0001\u0000\u0000\u0000\u0255\u0254\u0001\u0000\u0000\u0000\u0256"+
		"S\u0001\u0000\u0000\u0000\u0257\u025a\u0003\u00acV\u0000\u0258\u025a\u0003"+
		"\u00a8T\u0000\u0259\u0257\u0001\u0000\u0000\u0000\u0259\u0258\u0001\u0000"+
		"\u0000\u0000\u025aU\u0001\u0000\u0000\u0000\u025b\u0260\u0003\u00aeW\u0000"+
		"\u025c\u0260\u0003\u0098L\u0000\u025d\u0260\u0003\u0094J\u0000\u025e\u0260"+
		"\u0003\u0096K\u0000\u025f\u025b\u0001\u0000\u0000\u0000\u025f\u025c\u0001"+
		"\u0000\u0000\u0000\u025f\u025d\u0001\u0000\u0000\u0000\u025f\u025e\u0001"+
		"\u0000\u0000\u0000\u0260W\u0001\u0000\u0000\u0000\u0261\u0264\u0003\u0092"+
		"I\u0000\u0262\u0264\u0003\u009cN\u0000\u0263\u0261\u0001\u0000\u0000\u0000"+
		"\u0263\u0262\u0001\u0000\u0000\u0000\u0264Y\u0001\u0000\u0000\u0000\u0265"+
		"\u026a\u0003\u00b2Y\u0000\u0266\u026a\u0003\u00b0X\u0000\u0267\u026a\u0003"+
		"\u00b4Z\u0000\u0268\u026a\u0003\u00a2Q\u0000\u0269\u0265\u0001\u0000\u0000"+
		"\u0000\u0269\u0266\u0001\u0000\u0000\u0000\u0269\u0267\u0001\u0000\u0000"+
		"\u0000\u0269\u0268\u0001\u0000\u0000\u0000\u026a[\u0001\u0000\u0000\u0000"+
		"\u026b\u026c\u0003\u00a8T\u0000\u026c]\u0001\u0000\u0000\u0000\u026d\u0271"+
		"\u0003\u0092I\u0000\u026e\u0271\u0003\u00a6S\u0000\u026f\u0271\u0003\u00a4"+
		"R\u0000\u0270\u026d\u0001\u0000\u0000\u0000\u0270\u026e\u0001\u0000\u0000"+
		"\u0000\u0270\u026f\u0001\u0000\u0000\u0000\u0271_\u0001\u0000\u0000\u0000"+
		"\u0272\u0276\u0003\u0092I\u0000\u0273\u0276\u0003\u00a6S\u0000\u0274\u0276"+
		"\u0003\u00a4R\u0000\u0275\u0272\u0001\u0000\u0000\u0000\u0275\u0273\u0001"+
		"\u0000\u0000\u0000\u0275\u0274\u0001\u0000\u0000\u0000\u0276a\u0001\u0000"+
		"\u0000\u0000\u0277\u027b\u0003\u0098L\u0000\u0278\u027b\u0003\u009aM\u0000"+
		"\u0279\u027b\u0003\u0090H\u0000\u027a\u0277\u0001\u0000\u0000\u0000\u027a"+
		"\u0278\u0001\u0000\u0000\u0000\u027a\u0279\u0001\u0000\u0000\u0000\u027b"+
		"c\u0001\u0000\u0000\u0000\u027c\u0280\u0003\u00b6[\u0000\u027d\u0280\u0003"+
		"\u0098L\u0000\u027e\u0280\u0003\u009cN\u0000\u027f\u027c\u0001\u0000\u0000"+
		"\u0000\u027f\u027d\u0001\u0000\u0000\u0000\u027f\u027e\u0001\u0000\u0000"+
		"\u0000\u0280e\u0001\u0000\u0000\u0000\u0281\u0284\u0003\u0090H\u0000\u0282"+
		"\u0284\u0003\u00c2a\u0000\u0283\u0281\u0001\u0000\u0000\u0000\u0283\u0282"+
		"\u0001\u0000\u0000\u0000\u0284g\u0001\u0000\u0000\u0000\u0285\u0288\u0003"+
		"\u0090H\u0000\u0286\u0288\u0003\u00b8\\\u0000\u0287\u0285\u0001\u0000"+
		"\u0000\u0000\u0287\u0286\u0001\u0000\u0000\u0000\u0288i\u0001\u0000\u0000"+
		"\u0000\u0289\u028d\u0003\u009eO\u0000\u028a\u028d\u0003\u00a2Q\u0000\u028b"+
		"\u028d\u0003\u00a0P\u0000\u028c\u0289\u0001\u0000\u0000\u0000\u028c\u028a"+
		"\u0001\u0000\u0000\u0000\u028c\u028b\u0001\u0000\u0000\u0000\u028dk\u0001"+
		"\u0000\u0000\u0000\u028e\u0291\u0003\u00ba]\u0000\u028f\u0291\u0003\u00bc"+
		"^\u0000\u0290\u028e\u0001\u0000\u0000\u0000\u0290\u028f\u0001\u0000\u0000"+
		"\u0000\u0291m\u0001\u0000\u0000\u0000\u0292\u0295\u0003\u00be_\u0000\u0293"+
		"\u0295\u0003\u009cN\u0000\u0294\u0292\u0001\u0000\u0000\u0000\u0294\u0293"+
		"\u0001\u0000\u0000\u0000\u0295o\u0001\u0000\u0000\u0000\u0296\u0297\u0003"+
		"\u0092I\u0000\u0297q\u0001\u0000\u0000\u0000\u0298\u029c\u0003\u00a2Q"+
		"\u0000\u0299\u029c\u0003\u0090H\u0000\u029a\u029c\u0003\u0096K\u0000\u029b"+
		"\u0298\u0001\u0000\u0000\u0000\u029b\u0299\u0001\u0000\u0000\u0000\u029b"+
		"\u029a\u0001\u0000\u0000\u0000\u029cs\u0001\u0000\u0000\u0000\u029d\u02a0"+
		"\u0003\u0090H\u0000\u029e\u02a0\u0003\u00a2Q\u0000\u029f\u029d\u0001\u0000"+
		"\u0000\u0000\u029f\u029e\u0001\u0000\u0000\u0000\u02a0u\u0001\u0000\u0000"+
		"\u0000\u02a1\u02a4\u0003\u0092I\u0000\u02a2\u02a4\u0003\u00a4R\u0000\u02a3"+
		"\u02a1\u0001\u0000\u0000\u0000\u02a3\u02a2\u0001\u0000\u0000\u0000\u02a4"+
		"w\u0001\u0000\u0000\u0000\u02a5\u02a8\u0003\u0090H\u0000\u02a6\u02a8\u0003"+
		"\u00b8\\\u0000\u02a7\u02a5\u0001\u0000\u0000\u0000\u02a7\u02a6\u0001\u0000"+
		"\u0000\u0000\u02a8y\u0001\u0000\u0000\u0000\u02a9\u02aa\u0003\u00a8T\u0000"+
		"\u02aa{\u0001\u0000\u0000\u0000\u02ab\u02ae\u0003\u0090H\u0000\u02ac\u02ae"+
		"\u0003\u00a8T\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000\u02ad\u02ac\u0001"+
		"\u0000\u0000\u0000\u02ae}\u0001\u0000\u0000\u0000\u02af\u02b3\u0003\u00c0"+
		"`\u0000\u02b0\u02b3\u0003\u0098L\u0000\u02b1\u02b3\u0005+\u0000\u0000"+
		"\u02b2\u02af\u0001\u0000\u0000\u0000\u02b2\u02b0\u0001\u0000\u0000\u0000"+
		"\u02b2\u02b1\u0001\u0000\u0000\u0000\u02b3\u007f\u0001\u0000\u0000\u0000"+
		"\u02b4\u02b8\u0003\u0090H\u0000\u02b5\u02b8\u0003\u0094J\u0000\u02b6\u02b8"+
		"\u0003\u0096K\u0000\u02b7\u02b4\u0001\u0000\u0000\u0000\u02b7\u02b5\u0001"+
		"\u0000\u0000\u0000\u02b7\u02b6\u0001\u0000\u0000\u0000\u02b8\u0081\u0001"+
		"\u0000\u0000\u0000\u02b9\u02bd\u0003\u00a2Q\u0000\u02ba\u02bd\u0003\u0098"+
		"L\u0000\u02bb\u02bd\u0003\u00aaU\u0000\u02bc\u02b9\u0001\u0000\u0000\u0000"+
		"\u02bc\u02ba\u0001\u0000\u0000\u0000\u02bc\u02bb\u0001\u0000\u0000\u0000"+
		"\u02bd\u0083\u0001\u0000\u0000\u0000\u02be\u02bf\u0003\u0090H\u0000\u02bf"+
		"\u0085\u0001\u0000\u0000\u0000\u02c0\u02c1\u0005-\u0000\u0000\u02c1\u02c2"+
		"\u0005\\\u0000\u0000\u02c2\u02c3\u0003\u0018\f\u0000\u02c3\u0087\u0001"+
		"\u0000\u0000\u0000\u02c4\u02c5\u0005.\u0000\u0000\u02c5\u02c6\u0005\\"+
		"\u0000\u0000\u02c6\u02c7\u0003>\u001f\u0000\u02c7\u0089\u0001\u0000\u0000"+
		"\u0000\u02c8\u02c9\u0005/\u0000\u0000\u02c9\u02ca\u0005\\\u0000\u0000"+
		"\u02ca\u02cb\u0003&\u0013\u0000\u02cb\u008b\u0001\u0000\u0000\u0000\u02cc"+
		"\u02cd\u00050\u0000\u0000\u02cd\u02ce\u0005\\\u0000\u0000\u02ce\u02cf"+
		"\u00036\u001b\u0000\u02cf\u008d\u0001\u0000\u0000\u0000\u02d0\u02d1\u0005"+
		"1\u0000\u0000\u02d1\u02d2\u0005\\\u0000\u0000\u02d2\u02d3\u0003@ \u0000"+
		"\u02d3\u008f\u0001\u0000\u0000\u0000\u02d4\u02d5\u00053\u0000\u0000\u02d5"+
		"\u02d6\u0005\\\u0000\u0000\u02d6\u02d7\u0003\u0018\f\u0000\u02d7\u0091"+
		"\u0001\u0000\u0000\u0000\u02d8\u02d9\u00054\u0000\u0000\u02d9\u02da\u0005"+
		"\\\u0000\u0000\u02da\u02de\u0005`\u0000\u0000\u02db\u02dd\u0003\u0018"+
		"\f\u0000\u02dc\u02db\u0001\u0000\u0000\u0000\u02dd\u02e0\u0001\u0000\u0000"+
		"\u0000\u02de\u02dc\u0001\u0000\u0000\u0000\u02de\u02df\u0001\u0000\u0000"+
		"\u0000\u02df\u02e1\u0001\u0000\u0000\u0000\u02e0\u02de\u0001\u0000\u0000"+
		"\u0000\u02e1\u02e2\u0005a\u0000\u0000\u02e2\u0093\u0001\u0000\u0000\u0000"+
		"\u02e3\u02e4\u00056\u0000\u0000\u02e4\u02e5\u0005\\\u0000\u0000\u02e5"+
		"\u02e6\u0005T\u0000\u0000\u02e6\u0095\u0001\u0000\u0000\u0000\u02e7\u02e8"+
		"\u00055\u0000\u0000\u02e8\u02e9\u0005\\\u0000\u0000\u02e9\u02ea\u0005"+
		"T\u0000\u0000\u02ea\u0097\u0001\u0000\u0000\u0000\u02eb\u02ec\u00057\u0000"+
		"\u0000\u02ec\u02ed\u0005\\\u0000\u0000\u02ed\u02ee\u0005*\u0000\u0000"+
		"\u02ee\u0099\u0001\u0000\u0000\u0000\u02ef\u02f0\u0005C\u0000\u0000\u02f0"+
		"\u02f1\u0005\\\u0000\u0000\u02f1\u02f2\u0005T\u0000\u0000\u02f2\u009b"+
		"\u0001\u0000\u0000\u0000\u02f3\u02f4\u0005D\u0000\u0000\u02f4\u02f5\u0005"+
		"\\\u0000\u0000\u02f5\u02f6\u0005T\u0000\u0000\u02f6\u009d\u0001\u0000"+
		"\u0000\u0000\u02f7\u02f8\u0005B\u0000\u0000\u02f8\u02f9\u0005\\\u0000"+
		"\u0000\u02f9\u02fd\u0005`\u0000\u0000\u02fa\u02fc\u0003\u0018\f\u0000"+
		"\u02fb\u02fa\u0001\u0000\u0000\u0000\u02fc\u02ff\u0001\u0000\u0000\u0000"+
		"\u02fd\u02fb\u0001\u0000\u0000\u0000\u02fd\u02fe\u0001\u0000\u0000\u0000"+
		"\u02fe\u0300\u0001\u0000\u0000\u0000\u02ff\u02fd\u0001\u0000\u0000\u0000"+
		"\u0300\u0301\u0005a\u0000\u0000\u0301\u009f\u0001\u0000\u0000\u0000\u0302"+
		"\u0303\u0005A\u0000\u0000\u0303\u0304\u0005\\\u0000\u0000\u0304\u0305"+
		"\u0005U\u0000\u0000\u0305\u00a1\u0001\u0000\u0000\u0000\u0306\u0307\u0005"+
		"2\u0000\u0000\u0307\u0308\u0005\\\u0000\u0000\u0308\u0309\u0005*\u0000"+
		"\u0000\u0309\u00a3\u0001\u0000\u0000\u0000\u030a\u030b\u0005>\u0000\u0000"+
		"\u030b\u030c\u0005\\\u0000\u0000\u030c\u030d\u0005,\u0000\u0000\u030d"+
		"\u00a5\u0001\u0000\u0000\u0000\u030e\u030f\u0005?\u0000\u0000\u030f\u0310"+
		"\u0005\\\u0000\u0000\u0310\u0311\u0005,\u0000\u0000\u0311\u00a7\u0001"+
		"\u0000\u0000\u0000\u0312\u0313\u0005E\u0000\u0000\u0313\u0314\u0005\\"+
		"\u0000\u0000\u0314\u0315\u0003 \u0010\u0000\u0315\u00a9\u0001\u0000\u0000"+
		"\u0000\u0316\u0317\u0005F\u0000\u0000\u0317\u0318\u0005\\\u0000\u0000"+
		"\u0318\u0319\u0005T\u0000\u0000\u0319\u00ab\u0001\u0000\u0000\u0000\u031a"+
		"\u031b\u0007\u0000\u0000\u0000\u031b\u00ad\u0001\u0000\u0000\u0000\u031c"+
		"\u031d\u0005G\u0000\u0000\u031d\u031e\u0005\\\u0000\u0000\u031e\u031f"+
		"\u0007\u0000\u0000\u0000\u031f\u00af\u0001\u0000\u0000\u0000\u0320\u0321"+
		"\u0005I\u0000\u0000\u0321\u0322\u0005\\\u0000\u0000\u0322\u0323\u0003"+
		"\u0018\f\u0000\u0323\u00b1\u0001\u0000\u0000\u0000\u0324\u0325\u0005H"+
		"\u0000\u0000\u0325\u0326\u0005\\\u0000\u0000\u0326\u0327\u0003\u0018\f"+
		"\u0000\u0327\u00b3\u0001\u0000\u0000\u0000\u0328\u0329\u0005J\u0000\u0000"+
		"\u0329\u032a\u0005\\\u0000\u0000\u032a\u032e\u0005`\u0000\u0000\u032b"+
		"\u032d\u0003\u0018\f\u0000\u032c\u032b\u0001\u0000\u0000\u0000\u032d\u0330"+
		"\u0001\u0000\u0000\u0000\u032e\u032c\u0001\u0000\u0000\u0000\u032e\u032f"+
		"\u0001\u0000\u0000\u0000\u032f\u0331\u0001\u0000\u0000\u0000\u0330\u032e"+
		"\u0001\u0000\u0000\u0000\u0331\u0332\u0005a\u0000\u0000\u0332\u00b5\u0001"+
		"\u0000\u0000\u0000\u0333\u0334\u0005=\u0000\u0000\u0334\u0335\u0005\\"+
		"\u0000\u0000\u0335\u0336\u0003\u0018\f\u0000\u0336\u00b7\u0001\u0000\u0000"+
		"\u0000\u0337\u0338\u0005@\u0000\u0000\u0338\u0339\u0005\\\u0000\u0000"+
		"\u0339\u033a\u0005U\u0000\u0000\u033a\u00b9\u0001\u0000\u0000\u0000\u033b"+
		"\u033c\u0005;\u0000\u0000\u033c\u033d\u0005\\\u0000\u0000\u033d\u033e"+
		"\u0005T\u0000\u0000\u033e\u00bb\u0001\u0000\u0000\u0000\u033f\u0340\u0005"+
		":\u0000\u0000\u0340\u0341\u0005\\\u0000\u0000\u0341\u0342\u0005T\u0000"+
		"\u0000\u0342\u00bd\u0001\u0000\u0000\u0000\u0343\u0344\u0005K\u0000\u0000"+
		"\u0344\u0345\u0005\\\u0000\u0000\u0345\u0349\u0005`\u0000\u0000\u0346"+
		"\u0348\u0003\u0018\f\u0000\u0347\u0346\u0001\u0000\u0000\u0000\u0348\u034b"+
		"\u0001\u0000\u0000\u0000\u0349\u0347\u0001\u0000\u0000\u0000\u0349\u034a"+
		"\u0001\u0000\u0000\u0000\u034a\u034c\u0001\u0000\u0000\u0000\u034b\u0349"+
		"\u0001\u0000\u0000\u0000\u034c\u034d\u0005a\u0000\u0000\u034d\u00bf\u0001"+
		"\u0000\u0000\u0000\u034e\u034f\u00058\u0000\u0000\u034f\u0350\u0005\\"+
		"\u0000\u0000\u0350\u0351\u0005T\u0000\u0000\u0351\u00c1\u0001\u0000\u0000"+
		"\u0000\u0352\u0353\u0005M\u0000\u0000\u0353\u0354\u0005\\\u0000\u0000"+
		"\u0354\u0355\u0005^\u0000\u0000\u0355\u0356\u0005_\u0000\u0000\u0356\u035a"+
		"\u0005b\u0000\u0000\u0357\u0359\u0003\u00c4b\u0000\u0358\u0357\u0001\u0000"+
		"\u0000\u0000\u0359\u035c\u0001\u0000\u0000\u0000\u035a\u0358\u0001\u0000"+
		"\u0000\u0000\u035a\u035b\u0001\u0000\u0000\u0000\u035b\u035d\u0001\u0000"+
		"\u0000\u0000\u035c\u035a\u0001\u0000\u0000\u0000\u035d\u035e\u0005c\u0000"+
		"\u0000\u035e\u00c3\u0001\u0000\u0000\u0000\u035f\u0360\u0003\u00c6c\u0000"+
		"\u0360\u0361\u0005[\u0000\u0000\u0361\u00c5\u0001\u0000\u0000\u0000\u0362"+
		"\u0365\u0003\u00cae\u0000\u0363\u0365\u0003\u00c8d\u0000\u0364\u0362\u0001"+
		"\u0000\u0000\u0000\u0364\u0363\u0001\u0000\u0000\u0000\u0365\u00c7\u0001"+
		"\u0000\u0000\u0000\u0366\u0367\u0005\u0005\u0000\u0000\u0367\u0368\u0005"+
		"^\u0000\u0000\u0368\u0369\u0003\u00d2i\u0000\u0369\u036a\u0005_\u0000"+
		"\u0000\u036a\u00c9\u0001\u0000\u0000\u0000\u036b\u036c\u0005N\u0000\u0000"+
		"\u036c\u036d\u0005]\u0000\u0000\u036d\u036e\u0003\u00ccf\u0000\u036e\u00cb"+
		"\u0001\u0000\u0000\u0000\u036f\u0372\u0003\u00ceg\u0000\u0370\u0372\u0003"+
		"\u00d0h\u0000\u0371\u036f\u0001\u0000\u0000\u0000\u0371\u0370\u0001\u0000"+
		"\u0000\u0000\u0372\u00cd\u0001\u0000\u0000\u0000\u0373\u0374\u0005O\u0000"+
		"\u0000\u0374\u0375\u0005^\u0000\u0000\u0375\u0376\u0003\u00d2i\u0000\u0376"+
		"\u0377\u0005_\u0000\u0000\u0377\u00cf\u0001\u0000\u0000\u0000\u0378\u0379"+
		"\u0005P\u0000\u0000\u0379\u037a\u0005^\u0000\u0000\u037a\u037b\u0005_"+
		"\u0000\u0000\u037b\u00d1\u0001\u0000\u0000\u0000\u037c\u037d\u0005Q\u0000"+
		"\u0000\u037d\u0381\u0005^\u0000\u0000\u037e\u0380\u0003\u00d4j\u0000\u037f"+
		"\u037e\u0001\u0000\u0000\u0000\u0380\u0383\u0001\u0000\u0000\u0000\u0381"+
		"\u037f\u0001\u0000\u0000\u0000\u0381\u0382\u0001\u0000\u0000\u0000\u0382"+
		"\u0384\u0001\u0000\u0000\u0000\u0383\u0381\u0001\u0000\u0000\u0000\u0384"+
		"\u0385\u0005_\u0000\u0000\u0385\u00d3\u0001\u0000\u0000\u0000\u0386\u0387"+
		"\u0007\u0001\u0000\u0000\u0387\u00d5\u0001\u0000\u0000\u0000@\u00da\u00e5"+
		"\u00ee\u00f4\u00fc\u0107\u013c\u0143\u014d\u0157\u0161\u016b\u0175\u017f"+
		"\u0189\u0193\u019d\u01a7\u01b1\u01bb\u01c5\u01cf\u01d9\u01e3\u01ed\u01f7"+
		"\u0201\u020b\u0215\u021f\u0229\u0233\u023d\u024d\u0255\u0259\u025f\u0263"+
		"\u0269\u0270\u0275\u027a\u027f\u0283\u0287\u028c\u0290\u0294\u029b\u029f"+
		"\u02a3\u02a7\u02ad\u02b2\u02b7\u02bc\u02de\u02fd\u032e\u0349\u035a\u0364"+
		"\u0371\u0381";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}