// Generated from C:/Users/AHMAD AL BAGHDADI/IdeaProjects/compiler_project/src/Grammers\ParserFile.g4 by ANTLR 4.10.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserFile extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

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
		WIDTH=53, HEIGHT=54, COLOR=55, VALUE=56, MAX=57, MIN=58, LABEL=59, ICON_ARG=60, 
		CROSS_AXIS_ALIGNMENT=61, MAIN_AXIS_ALIGNMENT=62, FLEX_ARG=63, CURRENT_INDEX=64, 
		ITEMS=65, MARGIN=66, PADDING=67, STYLE=68, FONT_SIZE=69, IMAGE_ARG=70, 
		TITLE=71, LEADING=72, ACTIONS=73, TABS=74, TEXT_Arg=75, ON_TAP=76, NAVIGATOR=77, 
		PUSH=78, POP=79, IDENTIFIER=80, DOUBLE=81, INT=82, ID=83, FLOAT=84, STRING=85, 
		WS=86, COMMA=87, SEMICOLON=88, COLON=89, DOT=90, OPEN_PAREN=91, CLOSE_PAREN=92, 
		OPEN_SQUARE=93, CLOSE_SQUARE=94, OPEN_BRACE=95, CLOSE_BRACE=96, PLUS=97, 
		MINUS=98, MULTIPLY=99, DIVISION=100, EQUAL=101, LARGER=102, SMALLER=103, 
		LARGER_OR_EQUAL=104, SMALLER_OR_EQUAL=105, NOT_EQUAL=106, AND=107, OR=108, 
		NOT=109, UNDER_SCORE=110, QUOTES_SQ=111, QUOTES_DQ=112, SIZE=113;
	public static final int
		RULE_root = 0, RULE_main = 1, RULE_class = 2, RULE_classBody = 3, RULE_classArg = 4, 
		RULE_constructorDeclaration = 5, RULE_buildFunctionDeclaration = 6, RULE_constructorArg = 7, 
		RULE_buildBody = 8, RULE_dataType = 9, RULE_attributeName = 10, RULE_className = 11, 
		RULE_widget = 12, RULE_scaffold = 13, RULE_container = 14, RULE_text = 15, 
		RULE_textStyle = 16, RULE_image = 17, RULE_listView = 18, RULE_appBar = 19, 
		RULE_textField = 20, RULE_column = 21, RULE_row = 22, RULE_card = 23, 
		RULE_iconButton = 24, RULE_inkWell = 25, RULE_expanded = 26, RULE_bottomNavigationBar = 27, 
		RULE_slider = 28, RULE_tabBar = 29, RULE_tabBarView = 30, RULE_drawer = 31, 
		RULE_floatingActionButton = 32, RULE_wrap = 33, RULE_flex = 34, RULE_textFormField = 35, 
		RULE_textButton = 36, RULE_icon = 37, RULE_sizedBox = 38, RULE_center = 39, 
		RULE_scaffoldArgs = 40, RULE_containerArgs = 41, RULE_textArgs = 42, RULE_imageArgs = 43, 
		RULE_listviewArgs = 44, RULE_appBarArgs = 45, RULE_textFieldArgs = 46, 
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
		RULE_imageArg = 86, RULE_leading = 87, RULE_title = 88, RULE_actions = 89, 
		RULE_iconArg = 90, RULE_flexArg = 91, RULE_min = 92, RULE_max = 93, RULE_tabs = 94, 
		RULE_size = 95, RULE_onTap = 96, RULE_expression = 97, RULE_allowExp = 98, 
		RULE_runAppExp = 99, RULE_navigateExp = 100, RULE_transtion = 101, RULE_push = 102, 
		RULE_pop = 103, RULE_constructor = 104, RULE_constructoFilled = 105;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "main", "class", "classBody", "classArg", "constructorDeclaration", 
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
			"backGroundColor", "crossAxis", "mainAxis", "style", "fontSize", "imageArg", 
			"leading", "title", "actions", "iconArg", "flexArg", "min", "max", "tabs", 
			"size", "onTap", "expression", "allowExp", "runAppExp", "navigateExp", 
			"transtion", "push", "pop", "constructor", "constructoFilled"
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
			"'width'", "'height'", "'color'", "'value'", "'max'", "'min'", "'label'", 
			"'icon'", "'crossAxisAlignment'", "'mainAxisAlignment'", "'flex'", "'currentIndex'", 
			"'items'", "'margin'", "'padding'", "'style'", "'fontSize'", "'image'", 
			"'title'", "'leading'", "'actions'", "'tabs'", "'text'", "'onTap'", "'Navigator'", 
			"'push'", "'pop'", null, null, null, null, null, null, null, "','", null, 
			"':'", "'.'", null, null, "'['", "']'", "'{'", "'}'", "'+'", "'-'", "'*'", 
			"'/'", "'='", "'>'", "'<'", "'>='", "'<='", "'!='", "'&&'", "'||'", "'!'", 
			"'_'", "''''", "'\"\"'"
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
			"VALUE", "MAX", "MIN", "LABEL", "ICON_ARG", "CROSS_AXIS_ALIGNMENT", "MAIN_AXIS_ALIGNMENT", 
			"FLEX_ARG", "CURRENT_INDEX", "ITEMS", "MARGIN", "PADDING", "STYLE", "FONT_SIZE", 
			"IMAGE_ARG", "TITLE", "LEADING", "ACTIONS", "TABS", "TEXT_Arg", "ON_TAP", 
			"NAVIGATOR", "PUSH", "POP", "IDENTIFIER", "DOUBLE", "INT", "ID", "FLOAT", 
			"STRING", "WS", "COMMA", "SEMICOLON", "COLON", "DOT", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_SQUARE", "CLOSE_SQUARE", "OPEN_BRACE", "CLOSE_BRACE", "PLUS", "MINUS", 
			"MULTIPLY", "DIVISION", "EQUAL", "LARGER", "SMALLER", "LARGER_OR_EQUAL", 
			"SMALLER_OR_EQUAL", "NOT_EQUAL", "AND", "OR", "NOT", "UNDER_SCORE", "QUOTES_SQ", 
			"QUOTES_DQ", "SIZE"
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

	public static class RootContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<ClassContext> class_() {
			return getRuleContexts(ClassContext.class);
		}
		public ClassContext class_(int i) {
			return getRuleContext(ClassContext.class,i);
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
			setState(212);
			main();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(213);
				class_();
				}
				}
				setState(218);
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
			setState(219);
			match(VOID);
			setState(220);
			match(MAIN);
			setState(221);
			match(OPEN_PAREN);
			setState(222);
			match(CLOSE_PAREN);
			setState(223);
			match(OPEN_BRACE);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RUN_APP || _la==NAVIGATOR) {
				{
				{
				setState(224);
				expression();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
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

	public static class ClassContext extends ParserRuleContext {
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
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(CLASS);
			setState(233);
			className();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(234);
				match(EXTENDS);
				setState(235);
				match(STATELESS_WIDGET);
				}
			}

			setState(238);
			match(OPEN_BRACE);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WIDGET || _la==DATA_TYPE || _la==IDENTIFIER) {
				{
				{
				setState(239);
				classBody();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
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
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATA_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				classArg();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				constructorDeclaration();
				}
				break;
			case WIDGET:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
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
			setState(252);
			dataType();
			setState(253);
			attributeName();
			setState(254);
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
			setState(256);
			className();
			setState(257);
			match(OPEN_PAREN);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DATA_TYPE) {
				{
				{
				setState(258);
				constructorArg();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			match(CLOSE_PAREN);
			setState(265);
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
			setState(267);
			match(WIDGET);
			setState(268);
			match(BUILD);
			setState(269);
			match(OPEN_PAREN);
			setState(270);
			match(CLOSE_PAREN);
			setState(271);
			match(OPEN_BRACE);
			setState(272);
			buildBody();
			setState(273);
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
			setState(275);
			dataType();
			setState(276);
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
			setState(278);
			match(RETURN);
			setState(279);
			widget();
			setState(280);
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
			setState(282);
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
			setState(284);
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
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCAFFOLD:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				scaffold();
				}
				break;
			case CONTAINER:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				container();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				text();
				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				image();
				}
				break;
			case LIST_VIEW:
				enterOuterAlt(_localctx, 5);
				{
				setState(292);
				listView();
				}
				break;
			case APP_BAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(293);
				appBar();
				}
				break;
			case TEXT_FIELD:
				enterOuterAlt(_localctx, 7);
				{
				setState(294);
				textField();
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 8);
				{
				setState(295);
				column();
				}
				break;
			case ROW:
				enterOuterAlt(_localctx, 9);
				{
				setState(296);
				row();
				}
				break;
			case CARD:
				enterOuterAlt(_localctx, 10);
				{
				setState(297);
				card();
				}
				break;
			case ICON_BUTTON:
				enterOuterAlt(_localctx, 11);
				{
				setState(298);
				iconButton();
				}
				break;
			case INK_WELL:
				enterOuterAlt(_localctx, 12);
				{
				setState(299);
				inkWell();
				}
				break;
			case EXPANDED:
				enterOuterAlt(_localctx, 13);
				{
				setState(300);
				expanded();
				}
				break;
			case BOTTOM_NAVIGATION_BAR:
				enterOuterAlt(_localctx, 14);
				{
				setState(301);
				bottomNavigationBar();
				}
				break;
			case SLIDER:
				enterOuterAlt(_localctx, 15);
				{
				setState(302);
				slider();
				}
				break;
			case TAB_BAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(303);
				tabBar();
				}
				break;
			case TAB_BAR_VIEW:
				enterOuterAlt(_localctx, 17);
				{
				setState(304);
				tabBarView();
				}
				break;
			case DRAWER:
				enterOuterAlt(_localctx, 18);
				{
				setState(305);
				drawer();
				}
				break;
			case FLOATING_ACTION_BUTTON:
				enterOuterAlt(_localctx, 19);
				{
				setState(306);
				floatingActionButton();
				}
				break;
			case WRAP:
				enterOuterAlt(_localctx, 20);
				{
				setState(307);
				wrap();
				}
				break;
			case FLEX:
				enterOuterAlt(_localctx, 21);
				{
				setState(308);
				flex();
				}
				break;
			case TEXT_FORM_FIELD:
				enterOuterAlt(_localctx, 22);
				{
				setState(309);
				textFormField();
				}
				break;
			case TEXT_BUTTON:
				enterOuterAlt(_localctx, 23);
				{
				setState(310);
				textButton();
				}
				break;
			case ICON:
				enterOuterAlt(_localctx, 24);
				{
				setState(311);
				icon();
				}
				break;
			case SIZED_BOX:
				enterOuterAlt(_localctx, 25);
				{
				setState(312);
				sizedBox();
				}
				break;
			case CENTER:
				enterOuterAlt(_localctx, 26);
				{
				setState(313);
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
			setState(316);
			match(SCAFFOLD);
			setState(317);
			match(OPEN_PAREN);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BODY) | (1L << DRAWER_ARG) | (1L << APP_BAR_ARG) | (1L << BOTTOM_NAVIGATION_BAR_ARG) | (1L << FLOATING_ACTION_BUTTON_ARG) | (1L << BACKGROUND_COLOR))) != 0)) {
				{
				{
				setState(318);
				scaffoldArgs();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
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
			setState(326);
			match(CONTAINER);
			setState(327);
			match(OPEN_PAREN);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (CHILD - 51)) | (1L << (WIDTH - 51)) | (1L << (HEIGHT - 51)) | (1L << (COLOR - 51)) | (1L << (MARGIN - 51)) | (1L << (PADDING - 51)))) != 0)) {
				{
				{
				setState(328);
				containerArgs();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
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
			setState(336);
			match(TEXT);
			setState(337);
			match(OPEN_PAREN);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STYLE || _la==STRING) {
				{
				{
				setState(338);
				textArgs();
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344);
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
			setState(346);
			match(TEXT_STYLE);
			setState(347);
			match(OPEN_PAREN);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (BACKGROUND_COLOR - 50)) | (1L << (COLOR - 50)) | (1L << (FONT_SIZE - 50)))) != 0)) {
				{
				{
				setState(348);
				textStyleArgs();
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(354);
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
			setState(356);
			match(IMAGE);
			setState(357);
			match(OPEN_PAREN);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (WIDTH - 53)) | (1L << (HEIGHT - 53)) | (1L << (COLOR - 53)) | (1L << (IMAGE_ARG - 53)))) != 0)) {
				{
				{
				setState(358);
				imageArgs();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(364);
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
			setState(366);
			match(LIST_VIEW);
			setState(367);
			match(OPEN_PAREN);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILDREN || _la==PADDING) {
				{
				{
				setState(368);
				listviewArgs();
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(374);
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
			setState(376);
			match(APP_BAR);
			setState(377);
			match(OPEN_PAREN);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (BACKGROUND_COLOR - 50)) | (1L << (TITLE - 50)) | (1L << (LEADING - 50)) | (1L << (ACTIONS - 50)))) != 0)) {
				{
				{
				setState(378);
				appBarArgs();
				}
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(384);
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
			setState(386);
			match(TEXT_FIELD);
			setState(387);
			match(OPEN_PAREN);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STYLE) {
				{
				{
				setState(388);
				textFieldArgs();
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394);
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
			setState(396);
			match(COLUMN);
			setState(397);
			match(OPEN_PAREN);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHILDREN) | (1L << CROSS_AXIS_ALIGNMENT) | (1L << MAIN_AXIS_ALIGNMENT))) != 0)) {
				{
				{
				setState(398);
				columnArgs();
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404);
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
			setState(406);
			match(ROW);
			setState(407);
			match(OPEN_PAREN);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHILDREN) | (1L << CROSS_AXIS_ALIGNMENT) | (1L << MAIN_AXIS_ALIGNMENT))) != 0)) {
				{
				{
				setState(408);
				rowArgs();
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
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
			setState(416);
			match(CARD);
			setState(417);
			match(OPEN_PAREN);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (CHILD - 51)) | (1L << (COLOR - 51)) | (1L << (MARGIN - 51)))) != 0)) {
				{
				{
				setState(418);
				cardArgs();
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(424);
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
			setState(426);
			match(ICON_BUTTON);
			setState(427);
			match(OPEN_PAREN);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (COLOR - 55)) | (1L << (ICON_ARG - 55)) | (1L << (PADDING - 55)))) != 0)) {
				{
				{
				setState(428);
				iconButtonArgs();
				}
				}
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(434);
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
			setState(436);
			match(INK_WELL);
			setState(437);
			match(OPEN_PAREN);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILD || _la==ON_TAP) {
				{
				{
				setState(438);
				inkwellArgs();
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444);
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
			setState(446);
			match(EXPANDED);
			setState(447);
			match(OPEN_PAREN);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILD || _la==FLEX_ARG) {
				{
				{
				setState(448);
				expandedArgs();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
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
			setState(456);
			match(BOTTOM_NAVIGATION_BAR);
			setState(457);
			match(OPEN_PAREN);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (BACKGROUND_COLOR - 50)) | (1L << (CURRENT_INDEX - 50)) | (1L << (ITEMS - 50)))) != 0)) {
				{
				{
				setState(458);
				bottomNavigationBarArgs();
				}
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(464);
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
			setState(466);
			match(SLIDER);
			setState(467);
			match(OPEN_PAREN);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAX || _la==MIN) {
				{
				{
				setState(468);
				sliderArgs();
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(474);
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
			setState(476);
			match(TAB_BAR);
			setState(477);
			match(OPEN_PAREN);
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PADDING || _la==TABS) {
				{
				{
				setState(478);
				tabBarArgs();
				}
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(484);
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
			setState(486);
			match(TAB_BAR_VIEW);
			setState(487);
			match(OPEN_PAREN);
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILDREN) {
				{
				{
				setState(488);
				tabBarViewArgs();
				}
				}
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(494);
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
			setState(496);
			match(DRAWER);
			setState(497);
			match(OPEN_PAREN);
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BACKGROUND_COLOR) | (1L << CHILD) | (1L << WIDTH))) != 0)) {
				{
				{
				setState(498);
				drawerArgs();
				}
				}
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(504);
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
			setState(506);
			match(FLOATING_ACTION_BUTTON);
			setState(507);
			match(OPEN_PAREN);
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BACKGROUND_COLOR || _la==CHILD) {
				{
				{
				setState(508);
				floatingActionButtonArgs();
				}
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(514);
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
			setState(516);
			match(WRAP);
			setState(517);
			match(OPEN_PAREN);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILDREN || _la==CROSS_AXIS_ALIGNMENT) {
				{
				{
				setState(518);
				wrapArgs();
				}
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(524);
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
			setState(526);
			match(FLEX);
			setState(527);
			match(OPEN_PAREN);
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILD || _la==FLEX_ARG) {
				{
				{
				setState(528);
				flexArgs();
				}
				}
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(534);
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
			setState(536);
			match(TEXT_FORM_FIELD);
			setState(537);
			match(OPEN_PAREN);
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STYLE) {
				{
				{
				setState(538);
				textFormFieldArgs();
				}
				}
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(544);
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
			setState(546);
			match(TEXT_BUTTON);
			setState(547);
			match(OPEN_PAREN);
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILD || _la==STYLE) {
				{
				{
				setState(548);
				textButtonArgs();
				}
				}
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(554);
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
			setState(556);
			match(ICON);
			setState(557);
			match(OPEN_PAREN);
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ICONS || _la==COLOR || _la==SIZE) {
				{
				{
				setState(558);
				iconArgs();
				}
				}
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(564);
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
			setState(566);
			match(SIZED_BOX);
			setState(567);
			match(OPEN_PAREN);
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHILD) | (1L << WIDTH) | (1L << HEIGHT))) != 0)) {
				{
				{
				setState(568);
				sizedBoxArgs();
				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(574);
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
			setState(576);
			match(CENTER);
			setState(577);
			match(OPEN_PAREN);
			setState(578);
			centerArgs();
			setState(579);
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
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BODY:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				body();
				}
				break;
			case DRAWER_ARG:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				drawerArg();
				}
				break;
			case APP_BAR_ARG:
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
				appBarArg();
				}
				break;
			case BOTTOM_NAVIGATION_BAR_ARG:
				enterOuterAlt(_localctx, 4);
				{
				setState(584);
				bottomNavigationBarArg();
				}
				break;
			case FLOATING_ACTION_BUTTON_ARG:
				enterOuterAlt(_localctx, 5);
				{
				setState(585);
				floatingActionButtonArg();
				}
				break;
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(586);
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
			setState(595);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				child();
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				width();
				}
				break;
			case HEIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(591);
				height();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(592);
				color();
				}
				break;
			case MARGIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(593);
				margin();
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 6);
				{
				setState(594);
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

	public static class TextArgsContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ParserFile.STRING, 0); }
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
			setState(599);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				match(STRING);
				}
				break;
			case STYLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(598);
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
			setState(605);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMAGE_ARG:
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
				imageArg();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
				color();
				}
				break;
			case HEIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(603);
				height();
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 4);
				{
				setState(604);
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
			setState(609);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				children();
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
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
			setState(615);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TITLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(611);
				title();
				}
				break;
			case LEADING:
				enterOuterAlt(_localctx, 2);
				{
				setState(612);
				leading();
				}
				break;
			case ACTIONS:
				enterOuterAlt(_localctx, 3);
				{
				setState(613);
				actions();
				}
				break;
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(614);
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
			setState(617);
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
			setState(622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				children();
				}
				break;
			case MAIN_AXIS_ALIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(620);
				mainAxis();
				}
				break;
			case CROSS_AXIS_ALIGNMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(621);
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
			setState(627);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				children();
				}
				break;
			case MAIN_AXIS_ALIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				mainAxis();
				}
				break;
			case CROSS_AXIS_ALIGNMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(626);
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
			setState(632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				color();
				}
				break;
			case MARGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				margin();
				}
				break;
			case CHILD:
				enterOuterAlt(_localctx, 3);
				{
				setState(631);
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
			setState(637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ICON_ARG:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				iconArg();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(635);
				color();
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 3);
				{
				setState(636);
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
			setState(641);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				child();
				}
				break;
			case ON_TAP:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
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
			setState(645);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				child();
				}
				break;
			case FLEX_ARG:
				enterOuterAlt(_localctx, 2);
				{
				setState(644);
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
			setState(650);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ITEMS:
				enterOuterAlt(_localctx, 1);
				{
				setState(647);
				items();
				}
				break;
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(648);
				backGroundColor();
				}
				break;
			case CURRENT_INDEX:
				enterOuterAlt(_localctx, 3);
				{
				setState(649);
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
			setState(654);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				min();
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
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
			setState(658);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TABS:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				tabs();
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
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
			setState(660);
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
			setState(665);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				backGroundColor();
				}
				break;
			case CHILD:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				child();
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 3);
				{
				setState(664);
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
			setState(669);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
				child();
				}
				break;
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(668);
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
			setState(673);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				children();
				}
				break;
			case CROSS_AXIS_ALIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
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
			setState(677);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				child();
				}
				break;
			case FLEX_ARG:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
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
			setState(679);
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
			setState(683);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				child();
				}
				break;
			case STYLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
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
			setState(688);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				size();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				color();
				}
				break;
			case ICONS:
				enterOuterAlt(_localctx, 3);
				{
				setState(687);
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
			setState(693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				child();
				}
				break;
			case HEIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(691);
				height();
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 3);
				{
				setState(692);
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
			setState(698);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				backGroundColor();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				color();
				}
				break;
			case FONT_SIZE:
				enterOuterAlt(_localctx, 3);
				{
				setState(697);
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
			setState(700);
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
			setState(702);
			match(BODY);
			setState(703);
			match(COLON);
			setState(704);
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
			setState(706);
			match(DRAWER_ARG);
			setState(707);
			match(COLON);
			setState(708);
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
			setState(710);
			match(APP_BAR_ARG);
			setState(711);
			match(COLON);
			setState(712);
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
			setState(714);
			match(BOTTOM_NAVIGATION_BAR_ARG);
			setState(715);
			match(COLON);
			setState(716);
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
			setState(718);
			match(FLOATING_ACTION_BUTTON_ARG);
			setState(719);
			match(COLON);
			setState(720);
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
			setState(722);
			match(CHILD);
			setState(723);
			match(COLON);
			setState(724);
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
			setState(726);
			match(CHILDREN);
			setState(727);
			match(COLON);
			setState(728);
			match(OPEN_SQUARE);
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCAFFOLD) | (1L << CONTAINER) | (1L << ROW) | (1L << COLUMN) | (1L << LIST_VIEW) | (1L << SIZED_BOX) | (1L << EXPANDED) | (1L << CARD) | (1L << ICON_BUTTON) | (1L << ICON) | (1L << SLIDER) | (1L << DRAWER) | (1L << WRAP) | (1L << FLEX) | (1L << TEXT_BUTTON) | (1L << TEXT) | (1L << IMAGE) | (1L << APP_BAR) | (1L << TEXT_FIELD) | (1L << INK_WELL) | (1L << BOTTOM_NAVIGATION_BAR) | (1L << TAB_BAR) | (1L << TAB_BAR_VIEW) | (1L << FLOATING_ACTION_BUTTON) | (1L << TEXT_FORM_FIELD) | (1L << CENTER))) != 0)) {
				{
				{
				setState(729);
				widget();
				}
				}
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(735);
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
			setState(737);
			match(HEIGHT);
			setState(738);
			match(COLON);
			setState(739);
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
			setState(741);
			match(WIDTH);
			setState(742);
			match(COLON);
			setState(743);
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
			setState(745);
			match(COLOR);
			setState(746);
			match(COLON);
			setState(747);
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
			setState(749);
			match(MARGIN);
			setState(750);
			match(COLON);
			setState(751);
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
			setState(753);
			match(PADDING);
			setState(754);
			match(COLON);
			setState(755);
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
			setState(757);
			match(ITEMS);
			setState(758);
			match(COLON);
			setState(759);
			match(OPEN_SQUARE);
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCAFFOLD) | (1L << CONTAINER) | (1L << ROW) | (1L << COLUMN) | (1L << LIST_VIEW) | (1L << SIZED_BOX) | (1L << EXPANDED) | (1L << CARD) | (1L << ICON_BUTTON) | (1L << ICON) | (1L << SLIDER) | (1L << DRAWER) | (1L << WRAP) | (1L << FLEX) | (1L << TEXT_BUTTON) | (1L << TEXT) | (1L << IMAGE) | (1L << APP_BAR) | (1L << TEXT_FIELD) | (1L << INK_WELL) | (1L << BOTTOM_NAVIGATION_BAR) | (1L << TAB_BAR) | (1L << TAB_BAR_VIEW) | (1L << FLOATING_ACTION_BUTTON) | (1L << TEXT_FORM_FIELD) | (1L << CENTER))) != 0)) {
				{
				{
				setState(760);
				widget();
				}
				}
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(766);
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
			setState(768);
			match(CURRENT_INDEX);
			setState(769);
			match(COLON);
			setState(770);
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
			setState(772);
			match(BACKGROUND_COLOR);
			setState(773);
			match(COLON);
			setState(774);
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
			setState(776);
			match(CROSS_AXIS_ALIGNMENT);
			setState(777);
			match(COLON);
			setState(778);
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
			setState(780);
			match(MAIN_AXIS_ALIGNMENT);
			setState(781);
			match(COLON);
			setState(782);
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
			setState(784);
			match(STYLE);
			setState(785);
			match(COLON);
			setState(786);
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
			setState(788);
			match(FONT_SIZE);
			setState(789);
			match(COLON);
			setState(790);
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

	public static class ImageArgContext extends ParserRuleContext {
		public TerminalNode IMAGE_ARG() { return getToken(ParserFile.IMAGE_ARG, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode STRING() { return getToken(ParserFile.STRING, 0); }
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
		enterRule(_localctx, 172, RULE_imageArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			match(IMAGE_ARG);
			setState(793);
			match(COLON);
			setState(794);
			match(STRING);
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
		enterRule(_localctx, 174, RULE_leading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(LEADING);
			setState(797);
			match(COLON);
			setState(798);
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
		enterRule(_localctx, 176, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(TITLE);
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
		enterRule(_localctx, 178, RULE_actions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(ACTIONS);
			setState(805);
			match(COLON);
			setState(806);
			match(OPEN_SQUARE);
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCAFFOLD) | (1L << CONTAINER) | (1L << ROW) | (1L << COLUMN) | (1L << LIST_VIEW) | (1L << SIZED_BOX) | (1L << EXPANDED) | (1L << CARD) | (1L << ICON_BUTTON) | (1L << ICON) | (1L << SLIDER) | (1L << DRAWER) | (1L << WRAP) | (1L << FLEX) | (1L << TEXT_BUTTON) | (1L << TEXT) | (1L << IMAGE) | (1L << APP_BAR) | (1L << TEXT_FIELD) | (1L << INK_WELL) | (1L << BOTTOM_NAVIGATION_BAR) | (1L << TAB_BAR) | (1L << TAB_BAR_VIEW) | (1L << FLOATING_ACTION_BUTTON) | (1L << TEXT_FORM_FIELD) | (1L << CENTER))) != 0)) {
				{
				{
				setState(807);
				widget();
				}
				}
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(813);
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
		enterRule(_localctx, 180, RULE_iconArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(ICON_ARG);
			setState(816);
			match(COLON);
			setState(817);
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
		enterRule(_localctx, 182, RULE_flexArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			match(FLEX_ARG);
			setState(820);
			match(COLON);
			setState(821);
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
		enterRule(_localctx, 184, RULE_min);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			match(MIN);
			setState(824);
			match(COLON);
			setState(825);
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
		enterRule(_localctx, 186, RULE_max);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(MAX);
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
		enterRule(_localctx, 188, RULE_tabs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(TABS);
			setState(832);
			match(COLON);
			setState(833);
			match(OPEN_SQUARE);
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCAFFOLD) | (1L << CONTAINER) | (1L << ROW) | (1L << COLUMN) | (1L << LIST_VIEW) | (1L << SIZED_BOX) | (1L << EXPANDED) | (1L << CARD) | (1L << ICON_BUTTON) | (1L << ICON) | (1L << SLIDER) | (1L << DRAWER) | (1L << WRAP) | (1L << FLEX) | (1L << TEXT_BUTTON) | (1L << TEXT) | (1L << IMAGE) | (1L << APP_BAR) | (1L << TEXT_FIELD) | (1L << INK_WELL) | (1L << BOTTOM_NAVIGATION_BAR) | (1L << TAB_BAR) | (1L << TAB_BAR_VIEW) | (1L << FLOATING_ACTION_BUTTON) | (1L << TEXT_FORM_FIELD) | (1L << CENTER))) != 0)) {
				{
				{
				setState(834);
				widget();
				}
				}
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(840);
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
		enterRule(_localctx, 190, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(SIZE);
			setState(843);
			match(COLON);
			setState(844);
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
		enterRule(_localctx, 192, RULE_onTap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(ON_TAP);
			setState(847);
			match(COLON);
			setState(848);
			match(OPEN_PAREN);
			setState(849);
			match(CLOSE_PAREN);
			setState(850);
			match(OPEN_BRACE);
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RUN_APP || _la==NAVIGATOR) {
				{
				{
				setState(851);
				expression();
				}
				}
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(857);
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
		enterRule(_localctx, 194, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			allowExp();
			setState(860);
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
		enterRule(_localctx, 196, RULE_allowExp);
		try {
			setState(864);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAVIGATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(862);
				navigateExp();
				}
				break;
			case RUN_APP:
				enterOuterAlt(_localctx, 2);
				{
				setState(863);
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
		enterRule(_localctx, 198, RULE_runAppExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			match(RUN_APP);
			setState(867);
			match(OPEN_PAREN);
			setState(868);
			constructor();
			setState(869);
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
		enterRule(_localctx, 200, RULE_navigateExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			match(NAVIGATOR);
			setState(872);
			match(DOT);
			setState(873);
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
		enterRule(_localctx, 202, RULE_transtion);
		try {
			setState(877);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUSH:
				enterOuterAlt(_localctx, 1);
				{
				setState(875);
				push();
				}
				break;
			case POP:
				enterOuterAlt(_localctx, 2);
				{
				setState(876);
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
		enterRule(_localctx, 204, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(PUSH);
			setState(880);
			match(OPEN_PAREN);
			setState(881);
			constructor();
			setState(882);
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
		enterRule(_localctx, 206, RULE_pop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(POP);
			setState(885);
			match(OPEN_PAREN);
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
		enterRule(_localctx, 208, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(IDENTIFIER);
			setState(889);
			match(OPEN_PAREN);
			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOUBLE || _la==STRING) {
				{
				{
				setState(890);
				constructoFilled();
				}
				}
				setState(895);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(896);
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
		enterRule(_localctx, 210, RULE_constructoFilled);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
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
		"\u0004\u0001q\u0385\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"i\u0007i\u0001\u0000\u0001\u0000\u0005\u0000\u00d7\b\u0000\n\u0000\f\u0000"+
		"\u00da\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u00e2\b\u0001\n\u0001\f\u0001\u00e5\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u00ed\b\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00f1\b\u0002"+
		"\n\u0002\f\u0002\u00f4\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00fb\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0104"+
		"\b\u0005\n\u0005\f\u0005\u0107\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u013b\b\f\u0001\r\u0001\r\u0001\r\u0005\r\u0140\b\r\n\r\f\r\u0143\t"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u014a"+
		"\b\u000e\n\u000e\f\u000e\u014d\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u0154\b\u000f\n\u000f\f\u000f\u0157"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u015e\b\u0010\n\u0010\f\u0010\u0161\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0168\b\u0011\n\u0011"+
		"\f\u0011\u016b\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u0172\b\u0012\n\u0012\f\u0012\u0175\t\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u017c"+
		"\b\u0013\n\u0013\f\u0013\u017f\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u0186\b\u0014\n\u0014\f\u0014\u0189"+
		"\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u0190\b\u0015\n\u0015\f\u0015\u0193\t\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u019a\b\u0016\n\u0016"+
		"\f\u0016\u019d\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u01a4\b\u0017\n\u0017\f\u0017\u01a7\t\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u01ae"+
		"\b\u0018\n\u0018\f\u0018\u01b1\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u01b8\b\u0019\n\u0019\f\u0019\u01bb"+
		"\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005"+
		"\u001a\u01c2\b\u001a\n\u001a\f\u001a\u01c5\t\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01cc\b\u001b\n\u001b"+
		"\f\u001b\u01cf\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0005\u001c\u01d6\b\u001c\n\u001c\f\u001c\u01d9\t\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01e0"+
		"\b\u001d\n\u001d\f\u001d\u01e3\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0005\u001e\u01ea\b\u001e\n\u001e\f\u001e\u01ed"+
		"\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0005"+
		"\u001f\u01f4\b\u001f\n\u001f\f\u001f\u01f7\t\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0005 \u01fe\b \n \f \u0201\t \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0005!\u0208\b!\n!\f!\u020b\t!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0005\"\u0212\b\"\n\"\f\"\u0215\t\"\u0001\"\u0001\"\u0001#"+
		"\u0001#\u0001#\u0005#\u021c\b#\n#\f#\u021f\t#\u0001#\u0001#\u0001$\u0001"+
		"$\u0001$\u0005$\u0226\b$\n$\f$\u0229\t$\u0001$\u0001$\u0001%\u0001%\u0001"+
		"%\u0005%\u0230\b%\n%\f%\u0233\t%\u0001%\u0001%\u0001&\u0001&\u0001&\u0005"+
		"&\u023a\b&\n&\f&\u023d\t&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u024c\b(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u0254\b)\u0001*\u0001*\u0003"+
		"*\u0258\b*\u0001+\u0001+\u0001+\u0001+\u0003+\u025e\b+\u0001,\u0001,\u0003"+
		",\u0262\b,\u0001-\u0001-\u0001-\u0001-\u0003-\u0268\b-\u0001.\u0001.\u0001"+
		"/\u0001/\u0001/\u0003/\u026f\b/\u00010\u00010\u00010\u00030\u0274\b0\u0001"+
		"1\u00011\u00011\u00031\u0279\b1\u00012\u00012\u00012\u00032\u027e\b2\u0001"+
		"3\u00013\u00033\u0282\b3\u00014\u00014\u00034\u0286\b4\u00015\u00015\u0001"+
		"5\u00035\u028b\b5\u00016\u00016\u00036\u028f\b6\u00017\u00017\u00037\u0293"+
		"\b7\u00018\u00018\u00019\u00019\u00019\u00039\u029a\b9\u0001:\u0001:\u0003"+
		":\u029e\b:\u0001;\u0001;\u0003;\u02a2\b;\u0001<\u0001<\u0003<\u02a6\b"+
		"<\u0001=\u0001=\u0001>\u0001>\u0003>\u02ac\b>\u0001?\u0001?\u0001?\u0003"+
		"?\u02b1\b?\u0001@\u0001@\u0001@\u0003@\u02b6\b@\u0001A\u0001A\u0001A\u0003"+
		"A\u02bb\bA\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001D\u0001D\u0001"+
		"D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001F\u0001F\u0001F\u0001F\u0001"+
		"G\u0001G\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001I\u0001I\u0001"+
		"I\u0001I\u0005I\u02db\bI\nI\fI\u02de\tI\u0001I\u0001I\u0001J\u0001J\u0001"+
		"J\u0001J\u0001K\u0001K\u0001K\u0001K\u0001L\u0001L\u0001L\u0001L\u0001"+
		"M\u0001M\u0001M\u0001M\u0001N\u0001N\u0001N\u0001N\u0001O\u0001O\u0001"+
		"O\u0001O\u0005O\u02fa\bO\nO\fO\u02fd\tO\u0001O\u0001O\u0001P\u0001P\u0001"+
		"P\u0001P\u0001Q\u0001Q\u0001Q\u0001Q\u0001R\u0001R\u0001R\u0001R\u0001"+
		"S\u0001S\u0001S\u0001S\u0001T\u0001T\u0001T\u0001T\u0001U\u0001U\u0001"+
		"U\u0001U\u0001V\u0001V\u0001V\u0001V\u0001W\u0001W\u0001W\u0001W\u0001"+
		"X\u0001X\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0001Y\u0005Y\u0329\bY\nY"+
		"\fY\u032c\tY\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0001Z\u0001[\u0001[\u0001"+
		"[\u0001[\u0001\\\u0001\\\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0001]\u0001"+
		"^\u0001^\u0001^\u0001^\u0005^\u0344\b^\n^\f^\u0347\t^\u0001^\u0001^\u0001"+
		"_\u0001_\u0001_\u0001_\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0005"+
		"`\u0355\b`\n`\f`\u0358\t`\u0001`\u0001`\u0001a\u0001a\u0001a\u0001b\u0001"+
		"b\u0003b\u0361\bb\u0001c\u0001c\u0001c\u0001c\u0001c\u0001d\u0001d\u0001"+
		"d\u0001d\u0001e\u0001e\u0003e\u036e\be\u0001f\u0001f\u0001f\u0001f\u0001"+
		"f\u0001g\u0001g\u0001g\u0001g\u0001h\u0001h\u0001h\u0005h\u037c\bh\nh"+
		"\fh\u037f\th\u0001h\u0001h\u0001i\u0001i\u0001i\u0000\u0000j\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u0000\u0001\u0002\u0000QQUU\u0388\u0000\u00d4\u0001\u0000"+
		"\u0000\u0000\u0002\u00db\u0001\u0000\u0000\u0000\u0004\u00e8\u0001\u0000"+
		"\u0000\u0000\u0006\u00fa\u0001\u0000\u0000\u0000\b\u00fc\u0001\u0000\u0000"+
		"\u0000\n\u0100\u0001\u0000\u0000\u0000\f\u010b\u0001\u0000\u0000\u0000"+
		"\u000e\u0113\u0001\u0000\u0000\u0000\u0010\u0116\u0001\u0000\u0000\u0000"+
		"\u0012\u011a\u0001\u0000\u0000\u0000\u0014\u011c\u0001\u0000\u0000\u0000"+
		"\u0016\u011e\u0001\u0000\u0000\u0000\u0018\u013a\u0001\u0000\u0000\u0000"+
		"\u001a\u013c\u0001\u0000\u0000\u0000\u001c\u0146\u0001\u0000\u0000\u0000"+
		"\u001e\u0150\u0001\u0000\u0000\u0000 \u015a\u0001\u0000\u0000\u0000\""+
		"\u0164\u0001\u0000\u0000\u0000$\u016e\u0001\u0000\u0000\u0000&\u0178\u0001"+
		"\u0000\u0000\u0000(\u0182\u0001\u0000\u0000\u0000*\u018c\u0001\u0000\u0000"+
		"\u0000,\u0196\u0001\u0000\u0000\u0000.\u01a0\u0001\u0000\u0000\u00000"+
		"\u01aa\u0001\u0000\u0000\u00002\u01b4\u0001\u0000\u0000\u00004\u01be\u0001"+
		"\u0000\u0000\u00006\u01c8\u0001\u0000\u0000\u00008\u01d2\u0001\u0000\u0000"+
		"\u0000:\u01dc\u0001\u0000\u0000\u0000<\u01e6\u0001\u0000\u0000\u0000>"+
		"\u01f0\u0001\u0000\u0000\u0000@\u01fa\u0001\u0000\u0000\u0000B\u0204\u0001"+
		"\u0000\u0000\u0000D\u020e\u0001\u0000\u0000\u0000F\u0218\u0001\u0000\u0000"+
		"\u0000H\u0222\u0001\u0000\u0000\u0000J\u022c\u0001\u0000\u0000\u0000L"+
		"\u0236\u0001\u0000\u0000\u0000N\u0240\u0001\u0000\u0000\u0000P\u024b\u0001"+
		"\u0000\u0000\u0000R\u0253\u0001\u0000\u0000\u0000T\u0257\u0001\u0000\u0000"+
		"\u0000V\u025d\u0001\u0000\u0000\u0000X\u0261\u0001\u0000\u0000\u0000Z"+
		"\u0267\u0001\u0000\u0000\u0000\\\u0269\u0001\u0000\u0000\u0000^\u026e"+
		"\u0001\u0000\u0000\u0000`\u0273\u0001\u0000\u0000\u0000b\u0278\u0001\u0000"+
		"\u0000\u0000d\u027d\u0001\u0000\u0000\u0000f\u0281\u0001\u0000\u0000\u0000"+
		"h\u0285\u0001\u0000\u0000\u0000j\u028a\u0001\u0000\u0000\u0000l\u028e"+
		"\u0001\u0000\u0000\u0000n\u0292\u0001\u0000\u0000\u0000p\u0294\u0001\u0000"+
		"\u0000\u0000r\u0299\u0001\u0000\u0000\u0000t\u029d\u0001\u0000\u0000\u0000"+
		"v\u02a1\u0001\u0000\u0000\u0000x\u02a5\u0001\u0000\u0000\u0000z\u02a7"+
		"\u0001\u0000\u0000\u0000|\u02ab\u0001\u0000\u0000\u0000~\u02b0\u0001\u0000"+
		"\u0000\u0000\u0080\u02b5\u0001\u0000\u0000\u0000\u0082\u02ba\u0001\u0000"+
		"\u0000\u0000\u0084\u02bc\u0001\u0000\u0000\u0000\u0086\u02be\u0001\u0000"+
		"\u0000\u0000\u0088\u02c2\u0001\u0000\u0000\u0000\u008a\u02c6\u0001\u0000"+
		"\u0000\u0000\u008c\u02ca\u0001\u0000\u0000\u0000\u008e\u02ce\u0001\u0000"+
		"\u0000\u0000\u0090\u02d2\u0001\u0000\u0000\u0000\u0092\u02d6\u0001\u0000"+
		"\u0000\u0000\u0094\u02e1\u0001\u0000\u0000\u0000\u0096\u02e5\u0001\u0000"+
		"\u0000\u0000\u0098\u02e9\u0001\u0000\u0000\u0000\u009a\u02ed\u0001\u0000"+
		"\u0000\u0000\u009c\u02f1\u0001\u0000\u0000\u0000\u009e\u02f5\u0001\u0000"+
		"\u0000\u0000\u00a0\u0300\u0001\u0000\u0000\u0000\u00a2\u0304\u0001\u0000"+
		"\u0000\u0000\u00a4\u0308\u0001\u0000\u0000\u0000\u00a6\u030c\u0001\u0000"+
		"\u0000\u0000\u00a8\u0310\u0001\u0000\u0000\u0000\u00aa\u0314\u0001\u0000"+
		"\u0000\u0000\u00ac\u0318\u0001\u0000\u0000\u0000\u00ae\u031c\u0001\u0000"+
		"\u0000\u0000\u00b0\u0320\u0001\u0000\u0000\u0000\u00b2\u0324\u0001\u0000"+
		"\u0000\u0000\u00b4\u032f\u0001\u0000\u0000\u0000\u00b6\u0333\u0001\u0000"+
		"\u0000\u0000\u00b8\u0337\u0001\u0000\u0000\u0000\u00ba\u033b\u0001\u0000"+
		"\u0000\u0000\u00bc\u033f\u0001\u0000\u0000\u0000\u00be\u034a\u0001\u0000"+
		"\u0000\u0000\u00c0\u034e\u0001\u0000\u0000\u0000\u00c2\u035b\u0001\u0000"+
		"\u0000\u0000\u00c4\u0360\u0001\u0000\u0000\u0000\u00c6\u0362\u0001\u0000"+
		"\u0000\u0000\u00c8\u0367\u0001\u0000\u0000\u0000\u00ca\u036d\u0001\u0000"+
		"\u0000\u0000\u00cc\u036f\u0001\u0000\u0000\u0000\u00ce\u0374\u0001\u0000"+
		"\u0000\u0000\u00d0\u0378\u0001\u0000\u0000\u0000\u00d2\u0382\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d8\u0003\u0002\u0001\u0000\u00d5\u00d7\u0003\u0004"+
		"\u0002\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00da\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000"+
		"\u0000\u0000\u00d9\u0001\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0005\u0003\u0000\u0000\u00dc\u00dd\u0005\u0004"+
		"\u0000\u0000\u00dd\u00de\u0005[\u0000\u0000\u00de\u00df\u0005\\\u0000"+
		"\u0000\u00df\u00e3\u0005_\u0000\u0000\u00e0\u00e2\u0003\u00c2a\u0000\u00e1"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0005`\u0000\u0000\u00e7\u0003\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0005\u0001\u0000\u0000\u00e9\u00ec\u0003\u0016\u000b\u0000\u00ea\u00eb"+
		"\u0005\u0002\u0000\u0000\u00eb\u00ed\u0005\u0006\u0000\u0000\u00ec\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ee\u00f2\u0005_\u0000\u0000\u00ef\u00f1\u0003"+
		"\u0006\u0003\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0005`\u0000\u0000\u00f6\u0005\u0001\u0000"+
		"\u0000\u0000\u00f7\u00fb\u0003\b\u0004\u0000\u00f8\u00fb\u0003\n\u0005"+
		"\u0000\u00f9\u00fb\u0003\f\u0006\u0000\u00fa\u00f7\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fb\u0007\u0001\u0000\u0000\u0000\u00fc\u00fd\u0003\u0012\t\u0000\u00fd"+
		"\u00fe\u0003\u0014\n\u0000\u00fe\u00ff\u0005X\u0000\u0000\u00ff\t\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0003\u0016\u000b\u0000\u0101\u0105\u0005"+
		"[\u0000\u0000\u0102\u0104\u0003\u000e\u0007\u0000\u0103\u0102\u0001\u0000"+
		"\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0108\u0001\u0000"+
		"\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u0109\u0005\\\u0000"+
		"\u0000\u0109\u010a\u0005X\u0000\u0000\u010a\u000b\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0005\u0007\u0000\u0000\u010c\u010d\u0005\b\u0000\u0000\u010d"+
		"\u010e\u0005[\u0000\u0000\u010e\u010f\u0005\\\u0000\u0000\u010f\u0110"+
		"\u0005_\u0000\u0000\u0110\u0111\u0003\u0010\b\u0000\u0111\u0112\u0005"+
		"`\u0000\u0000\u0112\r\u0001\u0000\u0000\u0000\u0113\u0114\u0003\u0012"+
		"\t\u0000\u0114\u0115\u0003\u0014\n\u0000\u0115\u000f\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0005\t\u0000\u0000\u0117\u0118\u0003\u0018\f\u0000"+
		"\u0118\u0119\u0005X\u0000\u0000\u0119\u0011\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0005\f\u0000\u0000\u011b\u0013\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u0005P\u0000\u0000\u011d\u0015\u0001\u0000\u0000\u0000\u011e\u011f\u0005"+
		"P\u0000\u0000\u011f\u0017\u0001\u0000\u0000\u0000\u0120\u013b\u0003\u001a"+
		"\r\u0000\u0121\u013b\u0003\u001c\u000e\u0000\u0122\u013b\u0003\u001e\u000f"+
		"\u0000\u0123\u013b\u0003\"\u0011\u0000\u0124\u013b\u0003$\u0012\u0000"+
		"\u0125\u013b\u0003&\u0013\u0000\u0126\u013b\u0003(\u0014\u0000\u0127\u013b"+
		"\u0003*\u0015\u0000\u0128\u013b\u0003,\u0016\u0000\u0129\u013b\u0003."+
		"\u0017\u0000\u012a\u013b\u00030\u0018\u0000\u012b\u013b\u00032\u0019\u0000"+
		"\u012c\u013b\u00034\u001a\u0000\u012d\u013b\u00036\u001b\u0000\u012e\u013b"+
		"\u00038\u001c\u0000\u012f\u013b\u0003:\u001d\u0000\u0130\u013b\u0003<"+
		"\u001e\u0000\u0131\u013b\u0003>\u001f\u0000\u0132\u013b\u0003@ \u0000"+
		"\u0133\u013b\u0003B!\u0000\u0134\u013b\u0003D\"\u0000\u0135\u013b\u0003"+
		"F#\u0000\u0136\u013b\u0003H$\u0000\u0137\u013b\u0003J%\u0000\u0138\u013b"+
		"\u0003L&\u0000\u0139\u013b\u0003N\'\u0000\u013a\u0120\u0001\u0000\u0000"+
		"\u0000\u013a\u0121\u0001\u0000\u0000\u0000\u013a\u0122\u0001\u0000\u0000"+
		"\u0000\u013a\u0123\u0001\u0000\u0000\u0000\u013a\u0124\u0001\u0000\u0000"+
		"\u0000\u013a\u0125\u0001\u0000\u0000\u0000\u013a\u0126\u0001\u0000\u0000"+
		"\u0000\u013a\u0127\u0001\u0000\u0000\u0000\u013a\u0128\u0001\u0000\u0000"+
		"\u0000\u013a\u0129\u0001\u0000\u0000\u0000\u013a\u012a\u0001\u0000\u0000"+
		"\u0000\u013a\u012b\u0001\u0000\u0000\u0000\u013a\u012c\u0001\u0000\u0000"+
		"\u0000\u013a\u012d\u0001\u0000\u0000\u0000\u013a\u012e\u0001\u0000\u0000"+
		"\u0000\u013a\u012f\u0001\u0000\u0000\u0000\u013a\u0130\u0001\u0000\u0000"+
		"\u0000\u013a\u0131\u0001\u0000\u0000\u0000\u013a\u0132\u0001\u0000\u0000"+
		"\u0000\u013a\u0133\u0001\u0000\u0000\u0000\u013a\u0134\u0001\u0000\u0000"+
		"\u0000\u013a\u0135\u0001\u0000\u0000\u0000\u013a\u0136\u0001\u0000\u0000"+
		"\u0000\u013a\u0137\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000"+
		"\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013b\u0019\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0005\r\u0000\u0000\u013d\u0141\u0005[\u0000\u0000"+
		"\u013e\u0140\u0003P(\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u0140\u0143"+
		"\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142"+
		"\u0001\u0000\u0000\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0141"+
		"\u0001\u0000\u0000\u0000\u0144\u0145\u0005\\\u0000\u0000\u0145\u001b\u0001"+
		"\u0000\u0000\u0000\u0146\u0147\u0005\u000e\u0000\u0000\u0147\u014b\u0005"+
		"[\u0000\u0000\u0148\u014a\u0003R)\u0000\u0149\u0148\u0001\u0000\u0000"+
		"\u0000\u014a\u014d\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000"+
		"\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014e\u0001\u0000\u0000"+
		"\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014e\u014f\u0005\\\u0000\u0000"+
		"\u014f\u001d\u0001\u0000\u0000\u0000\u0150\u0151\u0005\u001c\u0000\u0000"+
		"\u0151\u0155\u0005[\u0000\u0000\u0152\u0154\u0003T*\u0000\u0153\u0152"+
		"\u0001\u0000\u0000\u0000\u0154\u0157\u0001\u0000\u0000\u0000\u0155\u0153"+
		"\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0158"+
		"\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0158\u0159"+
		"\u0005\\\u0000\u0000\u0159\u001f\u0001\u0000\u0000\u0000\u015a\u015b\u0005"+
		"(\u0000\u0000\u015b\u015f\u0005[\u0000\u0000\u015c\u015e\u0003\u0082A"+
		"\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015e\u0161\u0001\u0000\u0000"+
		"\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000"+
		"\u0000\u0160\u0162\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0005\\\u0000\u0000\u0163!\u0001\u0000\u0000\u0000"+
		"\u0164\u0165\u0005\u001d\u0000\u0000\u0165\u0169\u0005[\u0000\u0000\u0166"+
		"\u0168\u0003V+\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0168\u016b\u0001"+
		"\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001"+
		"\u0000\u0000\u0000\u016a\u016c\u0001\u0000\u0000\u0000\u016b\u0169\u0001"+
		"\u0000\u0000\u0000\u016c\u016d\u0005\\\u0000\u0000\u016d#\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0005\u0011\u0000\u0000\u016f\u0173\u0005[\u0000"+
		"\u0000\u0170\u0172\u0003X,\u0000\u0171\u0170\u0001\u0000\u0000\u0000\u0172"+
		"\u0175\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173"+
		"\u0174\u0001\u0000\u0000\u0000\u0174\u0176\u0001\u0000\u0000\u0000\u0175"+
		"\u0173\u0001\u0000\u0000\u0000\u0176\u0177\u0005\\\u0000\u0000\u0177%"+
		"\u0001\u0000\u0000\u0000\u0178\u0179\u0005\u001e\u0000\u0000\u0179\u017d"+
		"\u0005[\u0000\u0000\u017a\u017c\u0003Z-\u0000\u017b\u017a\u0001\u0000"+
		"\u0000\u0000\u017c\u017f\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000"+
		"\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u0180\u0001\u0000"+
		"\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u0180\u0181\u0005\\\u0000"+
		"\u0000\u0181\'\u0001\u0000\u0000\u0000\u0182\u0183\u0005\u001f\u0000\u0000"+
		"\u0183\u0187\u0005[\u0000\u0000\u0184\u0186\u0003\\.\u0000\u0185\u0184"+
		"\u0001\u0000\u0000\u0000\u0186\u0189\u0001\u0000\u0000\u0000\u0187\u0185"+
		"\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u018a"+
		"\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u018a\u018b"+
		"\u0005\\\u0000\u0000\u018b)\u0001\u0000\u0000\u0000\u018c\u018d\u0005"+
		"\u0010\u0000\u0000\u018d\u0191\u0005[\u0000\u0000\u018e\u0190\u0003^/"+
		"\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u0190\u0193\u0001\u0000\u0000"+
		"\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000"+
		"\u0000\u0192\u0194\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000"+
		"\u0000\u0194\u0195\u0005\\\u0000\u0000\u0195+\u0001\u0000\u0000\u0000"+
		"\u0196\u0197\u0005\u000f\u0000\u0000\u0197\u019b\u0005[\u0000\u0000\u0198"+
		"\u019a\u0003`0\u0000\u0199\u0198\u0001\u0000\u0000\u0000\u019a\u019d\u0001"+
		"\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019b\u019c\u0001"+
		"\u0000\u0000\u0000\u019c\u019e\u0001\u0000\u0000\u0000\u019d\u019b\u0001"+
		"\u0000\u0000\u0000\u019e\u019f\u0005\\\u0000\u0000\u019f-\u0001\u0000"+
		"\u0000\u0000\u01a0\u01a1\u0005\u0014\u0000\u0000\u01a1\u01a5\u0005[\u0000"+
		"\u0000\u01a2\u01a4\u0003b1\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a8\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005\\\u0000\u0000\u01a9/"+
		"\u0001\u0000\u0000\u0000\u01aa\u01ab\u0005\u0015\u0000\u0000\u01ab\u01af"+
		"\u0005[\u0000\u0000\u01ac\u01ae\u0003d2\u0000\u01ad\u01ac\u0001\u0000"+
		"\u0000\u0000\u01ae\u01b1\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000"+
		"\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005\\\u0000"+
		"\u0000\u01b31\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005\"\u0000\u0000"+
		"\u01b5\u01b9\u0005[\u0000\u0000\u01b6\u01b8\u0003f3\u0000\u01b7\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b8\u01bb\u0001\u0000\u0000\u0000\u01b9\u01b7"+
		"\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bc"+
		"\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bc\u01bd"+
		"\u0005\\\u0000\u0000\u01bd3\u0001\u0000\u0000\u0000\u01be\u01bf\u0005"+
		"\u0013\u0000\u0000\u01bf\u01c3\u0005[\u0000\u0000\u01c0\u01c2\u0003h4"+
		"\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c6\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c7\u0005\\\u0000\u0000\u01c75\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c9\u0005#\u0000\u0000\u01c9\u01cd\u0005[\u0000\u0000\u01ca\u01cc"+
		"\u0003j5\u0000\u01cb\u01ca\u0001\u0000\u0000\u0000\u01cc\u01cf\u0001\u0000"+
		"\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000"+
		"\u0000\u0000\u01ce\u01d0\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000"+
		"\u0000\u0000\u01d0\u01d1\u0005\\\u0000\u0000\u01d17\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d3\u0005\u0017\u0000\u0000\u01d3\u01d7\u0005[\u0000\u0000"+
		"\u01d4\u01d6\u0003l6\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d9"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d8"+
		"\u0001\u0000\u0000\u0000\u01d8\u01da\u0001\u0000\u0000\u0000\u01d9\u01d7"+
		"\u0001\u0000\u0000\u0000\u01da\u01db\u0005\\\u0000\u0000\u01db9\u0001"+
		"\u0000\u0000\u0000\u01dc\u01dd\u0005$\u0000\u0000\u01dd\u01e1\u0005[\u0000"+
		"\u0000\u01de\u01e0\u0003n7\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e1"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e4\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005\\\u0000\u0000\u01e5;"+
		"\u0001\u0000\u0000\u0000\u01e6\u01e7\u0005%\u0000\u0000\u01e7\u01eb\u0005"+
		"[\u0000\u0000\u01e8\u01ea\u0003p8\u0000\u01e9\u01e8\u0001\u0000\u0000"+
		"\u0000\u01ea\u01ed\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000"+
		"\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ee\u0001\u0000\u0000"+
		"\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ee\u01ef\u0005\\\u0000\u0000"+
		"\u01ef=\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005\u0018\u0000\u0000\u01f1"+
		"\u01f5\u0005[\u0000\u0000\u01f2\u01f4\u0003r9\u0000\u01f3\u01f2\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f7\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001"+
		"\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f8\u0001"+
		"\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005"+
		"\\\u0000\u0000\u01f9?\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005&\u0000"+
		"\u0000\u01fb\u01ff\u0005[\u0000\u0000\u01fc\u01fe\u0003t:\u0000\u01fd"+
		"\u01fc\u0001\u0000\u0000\u0000\u01fe\u0201\u0001\u0000\u0000\u0000\u01ff"+
		"\u01fd\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200"+
		"\u0202\u0001\u0000\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0202"+
		"\u0203\u0005\\\u0000\u0000\u0203A\u0001\u0000\u0000\u0000\u0204\u0205"+
		"\u0005\u0019\u0000\u0000\u0205\u0209\u0005[\u0000\u0000\u0206\u0208\u0003"+
		"v;\u0000\u0207\u0206\u0001\u0000\u0000\u0000\u0208\u020b\u0001\u0000\u0000"+
		"\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000"+
		"\u0000\u020a\u020c\u0001\u0000\u0000\u0000\u020b\u0209\u0001\u0000\u0000"+
		"\u0000\u020c\u020d\u0005\\\u0000\u0000\u020dC\u0001\u0000\u0000\u0000"+
		"\u020e\u020f\u0005\u001a\u0000\u0000\u020f\u0213\u0005[\u0000\u0000\u0210"+
		"\u0212\u0003x<\u0000\u0211\u0210\u0001\u0000\u0000\u0000\u0212\u0215\u0001"+
		"\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0213\u0214\u0001"+
		"\u0000\u0000\u0000\u0214\u0216\u0001\u0000\u0000\u0000\u0215\u0213\u0001"+
		"\u0000\u0000\u0000\u0216\u0217\u0005\\\u0000\u0000\u0217E\u0001\u0000"+
		"\u0000\u0000\u0218\u0219\u0005\'\u0000\u0000\u0219\u021d\u0005[\u0000"+
		"\u0000\u021a\u021c\u0003z=\u0000\u021b\u021a\u0001\u0000\u0000\u0000\u021c"+
		"\u021f\u0001\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021d"+
		"\u021e\u0001\u0000\u0000\u0000\u021e\u0220\u0001\u0000\u0000\u0000\u021f"+
		"\u021d\u0001\u0000\u0000\u0000\u0220\u0221\u0005\\\u0000\u0000\u0221G"+
		"\u0001\u0000\u0000\u0000\u0222\u0223\u0005\u001b\u0000\u0000\u0223\u0227"+
		"\u0005[\u0000\u0000\u0224\u0226\u0003|>\u0000\u0225\u0224\u0001\u0000"+
		"\u0000\u0000\u0226\u0229\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000"+
		"\u0000\u0000\u0227\u0228\u0001\u0000\u0000\u0000\u0228\u022a\u0001\u0000"+
		"\u0000\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u022a\u022b\u0005\\\u0000"+
		"\u0000\u022bI\u0001\u0000\u0000\u0000\u022c\u022d\u0005\u0016\u0000\u0000"+
		"\u022d\u0231\u0005[\u0000\u0000\u022e\u0230\u0003~?\u0000\u022f\u022e"+
		"\u0001\u0000\u0000\u0000\u0230\u0233\u0001\u0000\u0000\u0000\u0231\u022f"+
		"\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232\u0234"+
		"\u0001\u0000\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0234\u0235"+
		"\u0005\\\u0000\u0000\u0235K\u0001\u0000\u0000\u0000\u0236\u0237\u0005"+
		"\u0012\u0000\u0000\u0237\u023b\u0005[\u0000\u0000\u0238\u023a\u0003\u0080"+
		"@\u0000\u0239\u0238\u0001\u0000\u0000\u0000\u023a\u023d\u0001\u0000\u0000"+
		"\u0000\u023b\u0239\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000"+
		"\u0000\u023c\u023e\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000"+
		"\u0000\u023e\u023f\u0005\\\u0000\u0000\u023fM\u0001\u0000\u0000\u0000"+
		"\u0240\u0241\u0005)\u0000\u0000\u0241\u0242\u0005[\u0000\u0000\u0242\u0243"+
		"\u0003\u0084B\u0000\u0243\u0244\u0005\\\u0000\u0000\u0244O\u0001\u0000"+
		"\u0000\u0000\u0245\u024c\u0003\u0086C\u0000\u0246\u024c\u0003\u0088D\u0000"+
		"\u0247\u024c\u0003\u008aE\u0000\u0248\u024c\u0003\u008cF\u0000\u0249\u024c"+
		"\u0003\u008eG\u0000\u024a\u024c\u0003\u00a2Q\u0000\u024b\u0245\u0001\u0000"+
		"\u0000\u0000\u024b\u0246\u0001\u0000\u0000\u0000\u024b\u0247\u0001\u0000"+
		"\u0000\u0000\u024b\u0248\u0001\u0000\u0000\u0000\u024b\u0249\u0001\u0000"+
		"\u0000\u0000\u024b\u024a\u0001\u0000\u0000\u0000\u024cQ\u0001\u0000\u0000"+
		"\u0000\u024d\u0254\u0003\u0090H\u0000\u024e\u0254\u0003\u0096K\u0000\u024f"+
		"\u0254\u0003\u0094J\u0000\u0250\u0254\u0003\u0098L\u0000\u0251\u0254\u0003"+
		"\u009aM\u0000\u0252\u0254\u0003\u009cN\u0000\u0253\u024d\u0001\u0000\u0000"+
		"\u0000\u0253\u024e\u0001\u0000\u0000\u0000\u0253\u024f\u0001\u0000\u0000"+
		"\u0000\u0253\u0250\u0001\u0000\u0000\u0000\u0253\u0251\u0001\u0000\u0000"+
		"\u0000\u0253\u0252\u0001\u0000\u0000\u0000\u0254S\u0001\u0000\u0000\u0000"+
		"\u0255\u0258\u0005U\u0000\u0000\u0256\u0258\u0003\u00a8T\u0000\u0257\u0255"+
		"\u0001\u0000\u0000\u0000\u0257\u0256\u0001\u0000\u0000\u0000\u0258U\u0001"+
		"\u0000\u0000\u0000\u0259\u025e\u0003\u00acV\u0000\u025a\u025e\u0003\u0098"+
		"L\u0000\u025b\u025e\u0003\u0094J\u0000\u025c\u025e\u0003\u0096K\u0000"+
		"\u025d\u0259\u0001\u0000\u0000\u0000\u025d\u025a\u0001\u0000\u0000\u0000"+
		"\u025d\u025b\u0001\u0000\u0000\u0000\u025d\u025c\u0001\u0000\u0000\u0000"+
		"\u025eW\u0001\u0000\u0000\u0000\u025f\u0262\u0003\u0092I\u0000\u0260\u0262"+
		"\u0003\u009cN\u0000\u0261\u025f\u0001\u0000\u0000\u0000\u0261\u0260\u0001"+
		"\u0000\u0000\u0000\u0262Y\u0001\u0000\u0000\u0000\u0263\u0268\u0003\u00b0"+
		"X\u0000\u0264\u0268\u0003\u00aeW\u0000\u0265\u0268\u0003\u00b2Y\u0000"+
		"\u0266\u0268\u0003\u00a2Q\u0000\u0267\u0263\u0001\u0000\u0000\u0000\u0267"+
		"\u0264\u0001\u0000\u0000\u0000\u0267\u0265\u0001\u0000\u0000\u0000\u0267"+
		"\u0266\u0001\u0000\u0000\u0000\u0268[\u0001\u0000\u0000\u0000\u0269\u026a"+
		"\u0003\u00a8T\u0000\u026a]\u0001\u0000\u0000\u0000\u026b\u026f\u0003\u0092"+
		"I\u0000\u026c\u026f\u0003\u00a6S\u0000\u026d\u026f\u0003\u00a4R\u0000"+
		"\u026e\u026b\u0001\u0000\u0000\u0000\u026e\u026c\u0001\u0000\u0000\u0000"+
		"\u026e\u026d\u0001\u0000\u0000\u0000\u026f_\u0001\u0000\u0000\u0000\u0270"+
		"\u0274\u0003\u0092I\u0000\u0271\u0274\u0003\u00a6S\u0000\u0272\u0274\u0003"+
		"\u00a4R\u0000\u0273\u0270\u0001\u0000\u0000\u0000\u0273\u0271\u0001\u0000"+
		"\u0000\u0000\u0273\u0272\u0001\u0000\u0000\u0000\u0274a\u0001\u0000\u0000"+
		"\u0000\u0275\u0279\u0003\u0098L\u0000\u0276\u0279\u0003\u009aM\u0000\u0277"+
		"\u0279\u0003\u0090H\u0000\u0278\u0275\u0001\u0000\u0000\u0000\u0278\u0276"+
		"\u0001\u0000\u0000\u0000\u0278\u0277\u0001\u0000\u0000\u0000\u0279c\u0001"+
		"\u0000\u0000\u0000\u027a\u027e\u0003\u00b4Z\u0000\u027b\u027e\u0003\u0098"+
		"L\u0000\u027c\u027e\u0003\u009cN\u0000\u027d\u027a\u0001\u0000\u0000\u0000"+
		"\u027d\u027b\u0001\u0000\u0000\u0000\u027d\u027c\u0001\u0000\u0000\u0000"+
		"\u027ee\u0001\u0000\u0000\u0000\u027f\u0282\u0003\u0090H\u0000\u0280\u0282"+
		"\u0003\u00c0`\u0000\u0281\u027f\u0001\u0000\u0000\u0000\u0281\u0280\u0001"+
		"\u0000\u0000\u0000\u0282g\u0001\u0000\u0000\u0000\u0283\u0286\u0003\u0090"+
		"H\u0000\u0284\u0286\u0003\u00b6[\u0000\u0285\u0283\u0001\u0000\u0000\u0000"+
		"\u0285\u0284\u0001\u0000\u0000\u0000\u0286i\u0001\u0000\u0000\u0000\u0287"+
		"\u028b\u0003\u009eO\u0000\u0288\u028b\u0003\u00a2Q\u0000\u0289\u028b\u0003"+
		"\u00a0P\u0000\u028a\u0287\u0001\u0000\u0000\u0000\u028a\u0288\u0001\u0000"+
		"\u0000\u0000\u028a\u0289\u0001\u0000\u0000\u0000\u028bk\u0001\u0000\u0000"+
		"\u0000\u028c\u028f\u0003\u00b8\\\u0000\u028d\u028f\u0003\u00ba]\u0000"+
		"\u028e\u028c\u0001\u0000\u0000\u0000\u028e\u028d\u0001\u0000\u0000\u0000"+
		"\u028fm\u0001\u0000\u0000\u0000\u0290\u0293\u0003\u00bc^\u0000\u0291\u0293"+
		"\u0003\u009cN\u0000\u0292\u0290\u0001\u0000\u0000\u0000\u0292\u0291\u0001"+
		"\u0000\u0000\u0000\u0293o\u0001\u0000\u0000\u0000\u0294\u0295\u0003\u0092"+
		"I\u0000\u0295q\u0001\u0000\u0000\u0000\u0296\u029a\u0003\u00a2Q\u0000"+
		"\u0297\u029a\u0003\u0090H\u0000\u0298\u029a\u0003\u0096K\u0000\u0299\u0296"+
		"\u0001\u0000\u0000\u0000\u0299\u0297\u0001\u0000\u0000\u0000\u0299\u0298"+
		"\u0001\u0000\u0000\u0000\u029as\u0001\u0000\u0000\u0000\u029b\u029e\u0003"+
		"\u0090H\u0000\u029c\u029e\u0003\u00a2Q\u0000\u029d\u029b\u0001\u0000\u0000"+
		"\u0000\u029d\u029c\u0001\u0000\u0000\u0000\u029eu\u0001\u0000\u0000\u0000"+
		"\u029f\u02a2\u0003\u0092I\u0000\u02a0\u02a2\u0003\u00a4R\u0000\u02a1\u029f"+
		"\u0001\u0000\u0000\u0000\u02a1\u02a0\u0001\u0000\u0000\u0000\u02a2w\u0001"+
		"\u0000\u0000\u0000\u02a3\u02a6\u0003\u0090H\u0000\u02a4\u02a6\u0003\u00b6"+
		"[\u0000\u02a5\u02a3\u0001\u0000\u0000\u0000\u02a5\u02a4\u0001\u0000\u0000"+
		"\u0000\u02a6y\u0001\u0000\u0000\u0000\u02a7\u02a8\u0003\u00a8T\u0000\u02a8"+
		"{\u0001\u0000\u0000\u0000\u02a9\u02ac\u0003\u0090H\u0000\u02aa\u02ac\u0003"+
		"\u00a8T\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ab\u02aa\u0001\u0000"+
		"\u0000\u0000\u02ac}\u0001\u0000\u0000\u0000\u02ad\u02b1\u0003\u00be_\u0000"+
		"\u02ae\u02b1\u0003\u0098L\u0000\u02af\u02b1\u0005+\u0000\u0000\u02b0\u02ad"+
		"\u0001\u0000\u0000\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b0\u02af"+
		"\u0001\u0000\u0000\u0000\u02b1\u007f\u0001\u0000\u0000\u0000\u02b2\u02b6"+
		"\u0003\u0090H\u0000\u02b3\u02b6\u0003\u0094J\u0000\u02b4\u02b6\u0003\u0096"+
		"K\u0000\u02b5\u02b2\u0001\u0000\u0000\u0000\u02b5\u02b3\u0001\u0000\u0000"+
		"\u0000\u02b5\u02b4\u0001\u0000\u0000\u0000\u02b6\u0081\u0001\u0000\u0000"+
		"\u0000\u02b7\u02bb\u0003\u00a2Q\u0000\u02b8\u02bb\u0003\u0098L\u0000\u02b9"+
		"\u02bb\u0003\u00aaU\u0000\u02ba\u02b7\u0001\u0000\u0000\u0000\u02ba\u02b8"+
		"\u0001\u0000\u0000\u0000\u02ba\u02b9\u0001\u0000\u0000\u0000\u02bb\u0083"+
		"\u0001\u0000\u0000\u0000\u02bc\u02bd\u0003\u0090H\u0000\u02bd\u0085\u0001"+
		"\u0000\u0000\u0000\u02be\u02bf\u0005-\u0000\u0000\u02bf\u02c0\u0005Y\u0000"+
		"\u0000\u02c0\u02c1\u0003\u0018\f\u0000\u02c1\u0087\u0001\u0000\u0000\u0000"+
		"\u02c2\u02c3\u0005.\u0000\u0000\u02c3\u02c4\u0005Y\u0000\u0000\u02c4\u02c5"+
		"\u0003>\u001f\u0000\u02c5\u0089\u0001\u0000\u0000\u0000\u02c6\u02c7\u0005"+
		"/\u0000\u0000\u02c7\u02c8\u0005Y\u0000\u0000\u02c8\u02c9\u0003&\u0013"+
		"\u0000\u02c9\u008b\u0001\u0000\u0000\u0000\u02ca\u02cb\u00050\u0000\u0000"+
		"\u02cb\u02cc\u0005Y\u0000\u0000\u02cc\u02cd\u00036\u001b\u0000\u02cd\u008d"+
		"\u0001\u0000\u0000\u0000\u02ce\u02cf\u00051\u0000\u0000\u02cf\u02d0\u0005"+
		"Y\u0000\u0000\u02d0\u02d1\u0003@ \u0000\u02d1\u008f\u0001\u0000\u0000"+
		"\u0000\u02d2\u02d3\u00053\u0000\u0000\u02d3\u02d4\u0005Y\u0000\u0000\u02d4"+
		"\u02d5\u0003\u0018\f\u0000\u02d5\u0091\u0001\u0000\u0000\u0000\u02d6\u02d7"+
		"\u00054\u0000\u0000\u02d7\u02d8\u0005Y\u0000\u0000\u02d8\u02dc\u0005]"+
		"\u0000\u0000\u02d9\u02db\u0003\u0018\f\u0000\u02da\u02d9\u0001\u0000\u0000"+
		"\u0000\u02db\u02de\u0001\u0000\u0000\u0000\u02dc\u02da\u0001\u0000\u0000"+
		"\u0000\u02dc\u02dd\u0001\u0000\u0000\u0000\u02dd\u02df\u0001\u0000\u0000"+
		"\u0000\u02de\u02dc\u0001\u0000\u0000\u0000\u02df\u02e0\u0005^\u0000\u0000"+
		"\u02e0\u0093\u0001\u0000\u0000\u0000\u02e1\u02e2\u00056\u0000\u0000\u02e2"+
		"\u02e3\u0005Y\u0000\u0000\u02e3\u02e4\u0005Q\u0000\u0000\u02e4\u0095\u0001"+
		"\u0000\u0000\u0000\u02e5\u02e6\u00055\u0000\u0000\u02e6\u02e7\u0005Y\u0000"+
		"\u0000\u02e7\u02e8\u0005Q\u0000\u0000\u02e8\u0097\u0001\u0000\u0000\u0000"+
		"\u02e9\u02ea\u00057\u0000\u0000\u02ea\u02eb\u0005Y\u0000\u0000\u02eb\u02ec"+
		"\u0005*\u0000\u0000\u02ec\u0099\u0001\u0000\u0000\u0000\u02ed\u02ee\u0005"+
		"B\u0000\u0000\u02ee\u02ef\u0005Y\u0000\u0000\u02ef\u02f0\u0005Q\u0000"+
		"\u0000\u02f0\u009b\u0001\u0000\u0000\u0000\u02f1\u02f2\u0005C\u0000\u0000"+
		"\u02f2\u02f3\u0005Y\u0000\u0000\u02f3\u02f4\u0005Q\u0000\u0000\u02f4\u009d"+
		"\u0001\u0000\u0000\u0000\u02f5\u02f6\u0005A\u0000\u0000\u02f6\u02f7\u0005"+
		"Y\u0000\u0000\u02f7\u02fb\u0005]\u0000\u0000\u02f8\u02fa\u0003\u0018\f"+
		"\u0000\u02f9\u02f8\u0001\u0000\u0000\u0000\u02fa\u02fd\u0001\u0000\u0000"+
		"\u0000\u02fb\u02f9\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000"+
		"\u0000\u02fc\u02fe\u0001\u0000\u0000\u0000\u02fd\u02fb\u0001\u0000\u0000"+
		"\u0000\u02fe\u02ff\u0005^\u0000\u0000\u02ff\u009f\u0001\u0000\u0000\u0000"+
		"\u0300\u0301\u0005@\u0000\u0000\u0301\u0302\u0005Y\u0000\u0000\u0302\u0303"+
		"\u0005R\u0000\u0000\u0303\u00a1\u0001\u0000\u0000\u0000\u0304\u0305\u0005"+
		"2\u0000\u0000\u0305\u0306\u0005Y\u0000\u0000\u0306\u0307\u0005*\u0000"+
		"\u0000\u0307\u00a3\u0001\u0000\u0000\u0000\u0308\u0309\u0005=\u0000\u0000"+
		"\u0309\u030a\u0005Y\u0000\u0000\u030a\u030b\u0005,\u0000\u0000\u030b\u00a5"+
		"\u0001\u0000\u0000\u0000\u030c\u030d\u0005>\u0000\u0000\u030d\u030e\u0005"+
		"Y\u0000\u0000\u030e\u030f\u0005,\u0000\u0000\u030f\u00a7\u0001\u0000\u0000"+
		"\u0000\u0310\u0311\u0005D\u0000\u0000\u0311\u0312\u0005Y\u0000\u0000\u0312"+
		"\u0313\u0003 \u0010\u0000\u0313\u00a9\u0001\u0000\u0000\u0000\u0314\u0315"+
		"\u0005E\u0000\u0000\u0315\u0316\u0005Y\u0000\u0000\u0316\u0317\u0005Q"+
		"\u0000\u0000\u0317\u00ab\u0001\u0000\u0000\u0000\u0318\u0319\u0005F\u0000"+
		"\u0000\u0319\u031a\u0005Y\u0000\u0000\u031a\u031b\u0005U\u0000\u0000\u031b"+
		"\u00ad\u0001\u0000\u0000\u0000\u031c\u031d\u0005H\u0000\u0000\u031d\u031e"+
		"\u0005Y\u0000\u0000\u031e\u031f\u0003\u0018\f\u0000\u031f\u00af\u0001"+
		"\u0000\u0000\u0000\u0320\u0321\u0005G\u0000\u0000\u0321\u0322\u0005Y\u0000"+
		"\u0000\u0322\u0323\u0003\u0018\f\u0000\u0323\u00b1\u0001\u0000\u0000\u0000"+
		"\u0324\u0325\u0005I\u0000\u0000\u0325\u0326\u0005Y\u0000\u0000\u0326\u032a"+
		"\u0005]\u0000\u0000\u0327\u0329\u0003\u0018\f\u0000\u0328\u0327\u0001"+
		"\u0000\u0000\u0000\u0329\u032c\u0001\u0000\u0000\u0000\u032a\u0328\u0001"+
		"\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b\u032d\u0001"+
		"\u0000\u0000\u0000\u032c\u032a\u0001\u0000\u0000\u0000\u032d\u032e\u0005"+
		"^\u0000\u0000\u032e\u00b3\u0001\u0000\u0000\u0000\u032f\u0330\u0005<\u0000"+
		"\u0000\u0330\u0331\u0005Y\u0000\u0000\u0331\u0332\u0003\u0018\f\u0000"+
		"\u0332\u00b5\u0001\u0000\u0000\u0000\u0333\u0334\u0005?\u0000\u0000\u0334"+
		"\u0335\u0005Y\u0000\u0000\u0335\u0336\u0005R\u0000\u0000\u0336\u00b7\u0001"+
		"\u0000\u0000\u0000\u0337\u0338\u0005:\u0000\u0000\u0338\u0339\u0005Y\u0000"+
		"\u0000\u0339\u033a\u0005Q\u0000\u0000\u033a\u00b9\u0001\u0000\u0000\u0000"+
		"\u033b\u033c\u00059\u0000\u0000\u033c\u033d\u0005Y\u0000\u0000\u033d\u033e"+
		"\u0005Q\u0000\u0000\u033e\u00bb\u0001\u0000\u0000\u0000\u033f\u0340\u0005"+
		"J\u0000\u0000\u0340\u0341\u0005Y\u0000\u0000\u0341\u0345\u0005]\u0000"+
		"\u0000\u0342\u0344\u0003\u0018\f\u0000\u0343\u0342\u0001\u0000\u0000\u0000"+
		"\u0344\u0347\u0001\u0000\u0000\u0000\u0345\u0343\u0001\u0000\u0000\u0000"+
		"\u0345\u0346\u0001\u0000\u0000\u0000\u0346\u0348\u0001\u0000\u0000\u0000"+
		"\u0347\u0345\u0001\u0000\u0000\u0000\u0348\u0349\u0005^\u0000\u0000\u0349"+
		"\u00bd\u0001\u0000\u0000\u0000\u034a\u034b\u0005q\u0000\u0000\u034b\u034c"+
		"\u0005Y\u0000\u0000\u034c\u034d\u0005Q\u0000\u0000\u034d\u00bf\u0001\u0000"+
		"\u0000\u0000\u034e\u034f\u0005L\u0000\u0000\u034f\u0350\u0005Y\u0000\u0000"+
		"\u0350\u0351\u0005[\u0000\u0000\u0351\u0352\u0005\\\u0000\u0000\u0352"+
		"\u0356\u0005_\u0000\u0000\u0353\u0355\u0003\u00c2a\u0000\u0354\u0353\u0001"+
		"\u0000\u0000\u0000\u0355\u0358\u0001\u0000\u0000\u0000\u0356\u0354\u0001"+
		"\u0000\u0000\u0000\u0356\u0357\u0001\u0000\u0000\u0000\u0357\u0359\u0001"+
		"\u0000\u0000\u0000\u0358\u0356\u0001\u0000\u0000\u0000\u0359\u035a\u0005"+
		"`\u0000\u0000\u035a\u00c1\u0001\u0000\u0000\u0000\u035b\u035c\u0003\u00c4"+
		"b\u0000\u035c\u035d\u0005X\u0000\u0000\u035d\u00c3\u0001\u0000\u0000\u0000"+
		"\u035e\u0361\u0003\u00c8d\u0000\u035f\u0361\u0003\u00c6c\u0000\u0360\u035e"+
		"\u0001\u0000\u0000\u0000\u0360\u035f\u0001\u0000\u0000\u0000\u0361\u00c5"+
		"\u0001\u0000\u0000\u0000\u0362\u0363\u0005\u0005\u0000\u0000\u0363\u0364"+
		"\u0005[\u0000\u0000\u0364\u0365\u0003\u00d0h\u0000\u0365\u0366\u0005\\"+
		"\u0000\u0000\u0366\u00c7\u0001\u0000\u0000\u0000\u0367\u0368\u0005M\u0000"+
		"\u0000\u0368\u0369\u0005Z\u0000\u0000\u0369\u036a\u0003\u00cae\u0000\u036a"+
		"\u00c9\u0001\u0000\u0000\u0000\u036b\u036e\u0003\u00ccf\u0000\u036c\u036e"+
		"\u0003\u00ceg\u0000\u036d\u036b\u0001\u0000\u0000\u0000\u036d\u036c\u0001"+
		"\u0000\u0000\u0000\u036e\u00cb\u0001\u0000\u0000\u0000\u036f\u0370\u0005"+
		"N\u0000\u0000\u0370\u0371\u0005[\u0000\u0000\u0371\u0372\u0003\u00d0h"+
		"\u0000\u0372\u0373\u0005\\\u0000\u0000\u0373\u00cd\u0001\u0000\u0000\u0000"+
		"\u0374\u0375\u0005O\u0000\u0000\u0375\u0376\u0005[\u0000\u0000\u0376\u0377"+
		"\u0005\\\u0000\u0000\u0377\u00cf\u0001\u0000\u0000\u0000\u0378\u0379\u0005"+
		"P\u0000\u0000\u0379\u037d\u0005[\u0000\u0000\u037a\u037c\u0003\u00d2i"+
		"\u0000\u037b\u037a\u0001\u0000\u0000\u0000\u037c\u037f\u0001\u0000\u0000"+
		"\u0000\u037d\u037b\u0001\u0000\u0000\u0000\u037d\u037e\u0001\u0000\u0000"+
		"\u0000\u037e\u0380\u0001\u0000\u0000\u0000\u037f\u037d\u0001\u0000\u0000"+
		"\u0000\u0380\u0381\u0005\\\u0000\u0000\u0381\u00d1\u0001\u0000\u0000\u0000"+
		"\u0382\u0383\u0007\u0000\u0000\u0000\u0383\u00d3\u0001\u0000\u0000\u0000"+
		"@\u00d8\u00e3\u00ec\u00f2\u00fa\u0105\u013a\u0141\u014b\u0155\u015f\u0169"+
		"\u0173\u017d\u0187\u0191\u019b\u01a5\u01af\u01b9\u01c3\u01cd\u01d7\u01e1"+
		"\u01eb\u01f5\u01ff\u0209\u0213\u021d\u0227\u0231\u023b\u024b\u0253\u0257"+
		"\u025d\u0261\u0267\u026e\u0273\u0278\u027d\u0281\u0285\u028a\u028e\u0292"+
		"\u0299\u029d\u02a1\u02a5\u02ab\u02b0\u02b5\u02ba\u02dc\u02fb\u032a\u0345"+
		"\u0356\u0360\u036d\u037d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}