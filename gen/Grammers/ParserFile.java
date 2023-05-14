// Generated from C:/Users/AHMAD AL BAGHDADI/IdeaProjects/compiler_project/src/Grammers\ParserFile.g4 by ANTLR 4.10.1
package Grammers;
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
		VOID=1, MAIN=2, RUN_APP=3, CLASS=4, EXTENDS=5, STATELESS_WIDGET=6, OVERRIDE=7, 
		WIDGET=8, BUILD=9, BUILD_CONTEXT=10, RETURN=11, REQUIRED=12, THIS=13, 
		SCAFFOLD=14, CONTAINER=15, ROW=16, COLUMN=17, LIST_VIEW=18, SIZED_BOX=19, 
		EXPANDED=20, CARD=21, ICON_BUTTON=22, ICON=23, SLIDER=24, DRAWER=25, WRAP=26, 
		FLEX=27, TEXT_BUTTON=28, TEXT=29, IMAGE=30, APP_BAR=31, TEXT_FIELD=32, 
		CHECK_BOX=33, RADIO=34, INK_WELL=35, BOTTOM_NAVIGATION_BAR=36, TAB_BAR=37, 
		TAB_BAR_VIEW=38, FLOATING_ACTION_BUTTON=39, TEXT_FORM_FIELD=40, TEXT_STYLE=41, 
		CENTER=42, COLORS=43, ICONS=44, AXIS=45, BODY=46, DRAWER_ARG=47, APP_BAR_ARG=48, 
		BOTTOM_NAVIGATION_BAR_ARG=49, FLOATING_ACTION_BUTTON_ARG=50, BACKGROUND_COLOR=51, 
		CHILD=52, CHILDREN=53, WIDTH=54, HEIGHT=55, COLOR=56, VALUE=57, MAX=58, 
		MIN=59, LABEL=60, ICON_ARG=61, CROSS_AXIS_ALIGNMENT=62, MAIN_AXIS_ALIGNMENT=63, 
		FLEX_ARG=64, CURRENT_INDEX=65, ITEMS=66, MARGIN=67, PADDING=68, STYLE=69, 
		FONT_SIZE=70, IMAGE_ARG=71, TITLE=72, LEADING=73, ACTIONS=74, TABS=75, 
		TEXT_Arg=76, ON_TAP=77, NAVIGATOR=78, PUSH=79, POP=80, DOUBLE=81, INT=82, 
		ID=83, FLOAT=84, STRING=85, IDENTIFIER=86, WS=87, COMMA=88, SEMICOLON=89, 
		COLON=90, DOT=91, OPEN_PAREN=92, CLOSE_PAREN=93, OPEN_SQUARE=94, CLOSE_SQUARE=95, 
		OPEN_BRACE=96, CLOSE_BRACE=97, PLUS=98, MINUS=99, MULTIPLY=100, DIVISION=101, 
		EQUAL=102, LARGER=103, SMALLER=104, LARGER_OR_EQUAL=105, SMALLER_OR_EQUAL=106, 
		NOT_EQUAL=107, AND=108, OR=109, NOT=110, UNDER_SCORE=111, QUOTES_SQ=112, 
		QUOTES_DQ=113, DATA_TYPE=114, SIZE=115;
	public static final int
		RULE_root = 0, RULE_main = 1, RULE_class = 2, RULE_classArgs = 3, RULE_buildConst = 4, 
		RULE_implementVariables = 5, RULE_requiredArg = 6, RULE_build = 7, RULE_widget = 8, 
		RULE_scaffold = 9, RULE_container = 10, RULE_text = 11, RULE_textStyle = 12, 
		RULE_image = 13, RULE_listView = 14, RULE_appBar = 15, RULE_textField = 16, 
		RULE_column = 17, RULE_row = 18, RULE_card = 19, RULE_iconButton = 20, 
		RULE_inkWell = 21, RULE_expanded = 22, RULE_bottomNavigationBar = 23, 
		RULE_slider = 24, RULE_tabBar = 25, RULE_tabBarView = 26, RULE_drawer = 27, 
		RULE_floatingActionButton = 28, RULE_wrap = 29, RULE_flex = 30, RULE_textFormField = 31, 
		RULE_textButton = 32, RULE_icon = 33, RULE_sizedBox = 34, RULE_center = 35, 
		RULE_scaffoldArgs = 36, RULE_containerArgs = 37, RULE_textArgs = 38, RULE_imageArgs = 39, 
		RULE_listviewArgs = 40, RULE_appBarArgs = 41, RULE_textFieldArgs = 42, 
		RULE_columnArgs = 43, RULE_rowArgs = 44, RULE_cardArgs = 45, RULE_iconButtonArgs = 46, 
		RULE_inkwellArgs = 47, RULE_expandedArgs = 48, RULE_bottomNavigationBarArgs = 49, 
		RULE_sliderArgs = 50, RULE_tabBarArgs = 51, RULE_tabBarViewArgs = 52, 
		RULE_drawerArgs = 53, RULE_floatingActionButtonArgs = 54, RULE_wrapArgs = 55, 
		RULE_flexArgs = 56, RULE_textFormFieldArgs = 57, RULE_textButtonArgs = 58, 
		RULE_iconArgs = 59, RULE_sizedBoxArgs = 60, RULE_textStyleArgs = 61, RULE_centerArgs = 62, 
		RULE_body = 63, RULE_drawerArg = 64, RULE_appBarArg = 65, RULE_bottomNavigationBarArg = 66, 
		RULE_floatingActionButtonArg = 67, RULE_child = 68, RULE_children = 69, 
		RULE_height = 70, RULE_width = 71, RULE_color = 72, RULE_margin = 73, 
		RULE_padding = 74, RULE_items = 75, RULE_currentIndex = 76, RULE_backGroundColor = 77, 
		RULE_crossAxis = 78, RULE_mainAxis = 79, RULE_style = 80, RULE_fontSize = 81, 
		RULE_imageArg = 82, RULE_leading = 83, RULE_title = 84, RULE_actions = 85, 
		RULE_iconArg = 86, RULE_flexArg = 87, RULE_min = 88, RULE_max = 89, RULE_tabs = 90, 
		RULE_size = 91, RULE_onTap = 92, RULE_expression = 93, RULE_allowExp = 94, 
		RULE_runAppExp = 95, RULE_navigateExp = 96, RULE_transtion = 97, RULE_push = 98, 
		RULE_pop = 99, RULE_constructor = 100, RULE_constructorArg = 101;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "main", "class", "classArgs", "buildConst", "implementVariables", 
			"requiredArg", "build", "widget", "scaffold", "container", "text", "textStyle", 
			"image", "listView", "appBar", "textField", "column", "row", "card", 
			"iconButton", "inkWell", "expanded", "bottomNavigationBar", "slider", 
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
			"transtion", "push", "pop", "constructor", "constructorArg"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'main'", "'runApp'", "'class'", "'extends'", "'StatelessWidget'", 
			"'@override'", "'widget'", "'build'", "'BuildContext'", "'return'", "'required'", 
			"'this'", "'Scaffold'", "'Container'", "'Row'", "'Column'", "'ListView'", 
			"'SizedBox'", "'Expanded'", "'Card'", "'IconButton'", "'Icon'", "'Slider'", 
			"'Drawer'", "'Wrap'", "'Flex'", "'TextButton'", "'Text'", "'Image'", 
			"'AppBar'", "'TextField'", "'CheckBox'", "'Radio'", "'InkWell'", "'BottomNavigationBar'", 
			"'TabBar'", "'TabBarView'", "'FloatingActionButton'", "'TextFormField'", 
			"'TextStyle'", "'Center'", null, "'back'", null, "'body'", "'drawer'", 
			"'appBar'", "'bottomNavigationBar'", "'floatingActionButton'", "'backgroundColor'", 
			"'child'", "'children'", "'width'", "'height'", "'color'", "'value'", 
			"'max'", "'min'", "'label'", "'icon'", "'crossAxisAlignment'", "'mainAxisAlignment'", 
			"'flex'", "'currentIndex'", "'items'", "'margin'", "'padding'", "'style'", 
			"'fontSize'", "'image'", "'title'", "'leading'", "'actions'", "'tabs'", 
			"'text'", "'onTap'", "'Navigator'", "'push'", "'pop'", null, null, null, 
			null, null, null, null, "','", null, "':'", "'.'", null, null, "'['", 
			"']'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'='", "'>'", "'<'", 
			"'>='", "'<='", "'!='", "'&&'", "'||'", "'!'", "'_'", "''''", "'\"\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VOID", "MAIN", "RUN_APP", "CLASS", "EXTENDS", "STATELESS_WIDGET", 
			"OVERRIDE", "WIDGET", "BUILD", "BUILD_CONTEXT", "RETURN", "REQUIRED", 
			"THIS", "SCAFFOLD", "CONTAINER", "ROW", "COLUMN", "LIST_VIEW", "SIZED_BOX", 
			"EXPANDED", "CARD", "ICON_BUTTON", "ICON", "SLIDER", "DRAWER", "WRAP", 
			"FLEX", "TEXT_BUTTON", "TEXT", "IMAGE", "APP_BAR", "TEXT_FIELD", "CHECK_BOX", 
			"RADIO", "INK_WELL", "BOTTOM_NAVIGATION_BAR", "TAB_BAR", "TAB_BAR_VIEW", 
			"FLOATING_ACTION_BUTTON", "TEXT_FORM_FIELD", "TEXT_STYLE", "CENTER", 
			"COLORS", "ICONS", "AXIS", "BODY", "DRAWER_ARG", "APP_BAR_ARG", "BOTTOM_NAVIGATION_BAR_ARG", 
			"FLOATING_ACTION_BUTTON_ARG", "BACKGROUND_COLOR", "CHILD", "CHILDREN", 
			"WIDTH", "HEIGHT", "COLOR", "VALUE", "MAX", "MIN", "LABEL", "ICON_ARG", 
			"CROSS_AXIS_ALIGNMENT", "MAIN_AXIS_ALIGNMENT", "FLEX_ARG", "CURRENT_INDEX", 
			"ITEMS", "MARGIN", "PADDING", "STYLE", "FONT_SIZE", "IMAGE_ARG", "TITLE", 
			"LEADING", "ACTIONS", "TABS", "TEXT_Arg", "ON_TAP", "NAVIGATOR", "PUSH", 
			"POP", "DOUBLE", "INT", "ID", "FLOAT", "STRING", "IDENTIFIER", "WS", 
			"COMMA", "SEMICOLON", "COLON", "DOT", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_SQUARE", 
			"CLOSE_SQUARE", "OPEN_BRACE", "CLOSE_BRACE", "PLUS", "MINUS", "MULTIPLY", 
			"DIVISION", "EQUAL", "LARGER", "SMALLER", "LARGER_OR_EQUAL", "SMALLER_OR_EQUAL", 
			"NOT_EQUAL", "AND", "OR", "NOT", "UNDER_SCORE", "QUOTES_SQ", "QUOTES_DQ", 
			"DATA_TYPE", "SIZE"
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
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
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
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				main();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				class_();
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
			setState(208);
			match(VOID);
			setState(209);
			match(MAIN);
			setState(210);
			match(OPEN_PAREN);
			setState(211);
			match(CLOSE_PAREN);
			setState(212);
			match(OPEN_BRACE);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RUN_APP || _la==NAVIGATOR) {
				{
				{
				setState(213);
				expression();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
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
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode EXTENDS() { return getToken(ParserFile.EXTENDS, 0); }
		public TerminalNode STATELESS_WIDGET() { return getToken(ParserFile.STATELESS_WIDGET, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(ParserFile.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(ParserFile.CLOSE_BRACE, 0); }
		public List<ClassArgsContext> classArgs() {
			return getRuleContexts(ClassArgsContext.class);
		}
		public ClassArgsContext classArgs(int i) {
			return getRuleContext(ClassArgsContext.class,i);
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
			setState(221);
			match(CLASS);
			setState(222);
			match(ID);
			setState(223);
			match(EXTENDS);
			setState(224);
			match(STATELESS_WIDGET);
			setState(225);
			match(OPEN_BRACE);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OVERRIDE || _la==ID || _la==DATA_TYPE) {
				{
				{
				setState(226);
				classArgs();
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

	public static class ClassArgsContext extends ParserRuleContext {
		public BuildContext build() {
			return getRuleContext(BuildContext.class,0);
		}
		public ImplementVariablesContext implementVariables() {
			return getRuleContext(ImplementVariablesContext.class,0);
		}
		public BuildConstContext buildConst() {
			return getRuleContext(BuildConstContext.class,0);
		}
		public ClassArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterClassArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitClassArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitClassArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassArgsContext classArgs() throws RecognitionException {
		ClassArgsContext _localctx = new ClassArgsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classArgs);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OVERRIDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				build();
				}
				break;
			case DATA_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				implementVariables();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				buildConst();
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

	public static class BuildConstContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserFile.SEMICOLON, 0); }
		public List<TerminalNode> OPEN_BRACE() { return getTokens(ParserFile.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(ParserFile.OPEN_BRACE, i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(ParserFile.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(ParserFile.CLOSE_BRACE, i);
		}
		public List<RequiredArgContext> requiredArg() {
			return getRuleContexts(RequiredArgContext.class);
		}
		public RequiredArgContext requiredArg(int i) {
			return getRuleContext(RequiredArgContext.class,i);
		}
		public BuildConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBuildConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBuildConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBuildConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildConstContext buildConst() throws RecognitionException {
		BuildConstContext _localctx = new BuildConstContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_buildConst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(ID);
			setState(240);
			match(OPEN_PAREN);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_BRACE) {
				{
				{
				setState(241);
				match(OPEN_BRACE);
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==REQUIRED) {
					{
					{
					setState(242);
					requiredArg();
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(248);
				match(CLOSE_BRACE);
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(CLOSE_PAREN);
			setState(255);
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

	public static class ImplementVariablesContext extends ParserRuleContext {
		public TerminalNode DATA_TYPE() { return getToken(ParserFile.DATA_TYPE, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserFile.SEMICOLON, 0); }
		public ImplementVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterImplementVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitImplementVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitImplementVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementVariablesContext implementVariables() throws RecognitionException {
		ImplementVariablesContext _localctx = new ImplementVariablesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_implementVariables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(DATA_TYPE);
			setState(258);
			match(ID);
			setState(259);
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

	public static class RequiredArgContext extends ParserRuleContext {
		public TerminalNode REQUIRED() { return getToken(ParserFile.REQUIRED, 0); }
		public TerminalNode THIS() { return getToken(ParserFile.THIS, 0); }
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ParserFile.IDENTIFIER, 0); }
		public RequiredArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requiredArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterRequiredArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitRequiredArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitRequiredArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequiredArgContext requiredArg() throws RecognitionException {
		RequiredArgContext _localctx = new RequiredArgContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_requiredArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(REQUIRED);
			setState(262);
			match(THIS);
			setState(263);
			match(DOT);
			setState(264);
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

	public static class BuildContext extends ParserRuleContext {
		public TerminalNode OVERRIDE() { return getToken(ParserFile.OVERRIDE, 0); }
		public TerminalNode WIDGET() { return getToken(ParserFile.WIDGET, 0); }
		public TerminalNode BUILD() { return getToken(ParserFile.BUILD, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode BUILD_CONTEXT() { return getToken(ParserFile.BUILD_CONTEXT, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(ParserFile.OPEN_BRACE, 0); }
		public TerminalNode RETURN() { return getToken(ParserFile.RETURN, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ParserFile.SEMICOLON, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(ParserFile.CLOSE_BRACE, 0); }
		public BuildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBuild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBuild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBuild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildContext build() throws RecognitionException {
		BuildContext _localctx = new BuildContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_build);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(OVERRIDE);
			setState(267);
			match(WIDGET);
			setState(268);
			match(BUILD);
			setState(269);
			match(OPEN_PAREN);
			setState(270);
			match(BUILD_CONTEXT);
			setState(271);
			match(ID);
			setState(272);
			match(CLOSE_PAREN);
			setState(273);
			match(OPEN_BRACE);
			setState(274);
			match(RETURN);
			setState(275);
			widget();
			setState(276);
			match(SEMICOLON);
			setState(277);
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
		enterRule(_localctx, 16, RULE_widget);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCAFFOLD:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				scaffold();
				}
				break;
			case CONTAINER:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				container();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				text();
				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
				image();
				}
				break;
			case LIST_VIEW:
				enterOuterAlt(_localctx, 5);
				{
				setState(283);
				listView();
				}
				break;
			case APP_BAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(284);
				appBar();
				}
				break;
			case TEXT_FIELD:
				enterOuterAlt(_localctx, 7);
				{
				setState(285);
				textField();
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 8);
				{
				setState(286);
				column();
				}
				break;
			case ROW:
				enterOuterAlt(_localctx, 9);
				{
				setState(287);
				row();
				}
				break;
			case CARD:
				enterOuterAlt(_localctx, 10);
				{
				setState(288);
				card();
				}
				break;
			case ICON_BUTTON:
				enterOuterAlt(_localctx, 11);
				{
				setState(289);
				iconButton();
				}
				break;
			case INK_WELL:
				enterOuterAlt(_localctx, 12);
				{
				setState(290);
				inkWell();
				}
				break;
			case EXPANDED:
				enterOuterAlt(_localctx, 13);
				{
				setState(291);
				expanded();
				}
				break;
			case BOTTOM_NAVIGATION_BAR:
				enterOuterAlt(_localctx, 14);
				{
				setState(292);
				bottomNavigationBar();
				}
				break;
			case SLIDER:
				enterOuterAlt(_localctx, 15);
				{
				setState(293);
				slider();
				}
				break;
			case TAB_BAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(294);
				tabBar();
				}
				break;
			case TAB_BAR_VIEW:
				enterOuterAlt(_localctx, 17);
				{
				setState(295);
				tabBarView();
				}
				break;
			case DRAWER:
				enterOuterAlt(_localctx, 18);
				{
				setState(296);
				drawer();
				}
				break;
			case FLOATING_ACTION_BUTTON:
				enterOuterAlt(_localctx, 19);
				{
				setState(297);
				floatingActionButton();
				}
				break;
			case WRAP:
				enterOuterAlt(_localctx, 20);
				{
				setState(298);
				wrap();
				}
				break;
			case FLEX:
				enterOuterAlt(_localctx, 21);
				{
				setState(299);
				flex();
				}
				break;
			case TEXT_FORM_FIELD:
				enterOuterAlt(_localctx, 22);
				{
				setState(300);
				textFormField();
				}
				break;
			case TEXT_BUTTON:
				enterOuterAlt(_localctx, 23);
				{
				setState(301);
				textButton();
				}
				break;
			case ICON:
				enterOuterAlt(_localctx, 24);
				{
				setState(302);
				icon();
				}
				break;
			case SIZED_BOX:
				enterOuterAlt(_localctx, 25);
				{
				setState(303);
				sizedBox();
				}
				break;
			case CENTER:
				enterOuterAlt(_localctx, 26);
				{
				setState(304);
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
		enterRule(_localctx, 18, RULE_scaffold);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(SCAFFOLD);
			setState(308);
			match(OPEN_PAREN);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BODY) | (1L << DRAWER_ARG) | (1L << APP_BAR_ARG) | (1L << BOTTOM_NAVIGATION_BAR_ARG) | (1L << FLOATING_ACTION_BUTTON_ARG) | (1L << BACKGROUND_COLOR))) != 0)) {
				{
				{
				setState(309);
				scaffoldArgs();
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
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
		enterRule(_localctx, 20, RULE_container);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(CONTAINER);
			setState(318);
			match(OPEN_PAREN);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (CHILD - 52)) | (1L << (WIDTH - 52)) | (1L << (HEIGHT - 52)) | (1L << (COLOR - 52)) | (1L << (MARGIN - 52)) | (1L << (PADDING - 52)))) != 0)) {
				{
				{
				setState(319);
				containerArgs();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
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
		enterRule(_localctx, 22, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(TEXT);
			setState(328);
			match(OPEN_PAREN);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STYLE || _la==STRING) {
				{
				{
				setState(329);
				textArgs();
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
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
		enterRule(_localctx, 24, RULE_textStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(TEXT_STYLE);
			setState(338);
			match(OPEN_PAREN);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (BACKGROUND_COLOR - 51)) | (1L << (COLOR - 51)) | (1L << (FONT_SIZE - 51)))) != 0)) {
				{
				{
				setState(339);
				textStyleArgs();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345);
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
		enterRule(_localctx, 26, RULE_image);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(IMAGE);
			setState(348);
			match(OPEN_PAREN);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (WIDTH - 54)) | (1L << (HEIGHT - 54)) | (1L << (COLOR - 54)) | (1L << (IMAGE_ARG - 54)))) != 0)) {
				{
				{
				setState(349);
				imageArgs();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355);
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
		enterRule(_localctx, 28, RULE_listView);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(LIST_VIEW);
			setState(358);
			match(OPEN_PAREN);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILDREN || _la==PADDING) {
				{
				{
				setState(359);
				listviewArgs();
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
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
		enterRule(_localctx, 30, RULE_appBar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(APP_BAR);
			setState(368);
			match(OPEN_PAREN);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (BACKGROUND_COLOR - 51)) | (1L << (TITLE - 51)) | (1L << (LEADING - 51)) | (1L << (ACTIONS - 51)))) != 0)) {
				{
				{
				setState(369);
				appBarArgs();
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375);
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
		enterRule(_localctx, 32, RULE_textField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(TEXT_FIELD);
			setState(378);
			match(OPEN_PAREN);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STYLE) {
				{
				{
				setState(379);
				textFieldArgs();
				}
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(385);
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
		enterRule(_localctx, 34, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(COLUMN);
			setState(388);
			match(OPEN_PAREN);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHILDREN) | (1L << CROSS_AXIS_ALIGNMENT) | (1L << MAIN_AXIS_ALIGNMENT))) != 0)) {
				{
				{
				setState(389);
				columnArgs();
				}
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(395);
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
		enterRule(_localctx, 36, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(ROW);
			setState(398);
			match(OPEN_PAREN);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHILDREN) | (1L << CROSS_AXIS_ALIGNMENT) | (1L << MAIN_AXIS_ALIGNMENT))) != 0)) {
				{
				{
				setState(399);
				rowArgs();
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405);
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
		enterRule(_localctx, 38, RULE_card);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(CARD);
			setState(408);
			match(OPEN_PAREN);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (CHILD - 52)) | (1L << (COLOR - 52)) | (1L << (MARGIN - 52)))) != 0)) {
				{
				{
				setState(409);
				cardArgs();
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(415);
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
		enterRule(_localctx, 40, RULE_iconButton);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(ICON_BUTTON);
			setState(418);
			match(OPEN_PAREN);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (COLOR - 56)) | (1L << (ICON_ARG - 56)) | (1L << (PADDING - 56)))) != 0)) {
				{
				{
				setState(419);
				iconButtonArgs();
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(425);
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
		enterRule(_localctx, 42, RULE_inkWell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(INK_WELL);
			setState(428);
			match(OPEN_PAREN);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILD || _la==ON_TAP) {
				{
				{
				setState(429);
				inkwellArgs();
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435);
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
		enterRule(_localctx, 44, RULE_expanded);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(EXPANDED);
			setState(438);
			match(OPEN_PAREN);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILD || _la==FLEX_ARG) {
				{
				{
				setState(439);
				expandedArgs();
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(445);
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
		enterRule(_localctx, 46, RULE_bottomNavigationBar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(BOTTOM_NAVIGATION_BAR);
			setState(448);
			match(OPEN_PAREN);
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (BACKGROUND_COLOR - 51)) | (1L << (CURRENT_INDEX - 51)) | (1L << (ITEMS - 51)))) != 0)) {
				{
				{
				setState(449);
				bottomNavigationBarArgs();
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455);
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
		enterRule(_localctx, 48, RULE_slider);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(SLIDER);
			setState(458);
			match(OPEN_PAREN);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAX || _la==MIN) {
				{
				{
				setState(459);
				sliderArgs();
				}
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(465);
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
		enterRule(_localctx, 50, RULE_tabBar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(TAB_BAR);
			setState(468);
			match(OPEN_PAREN);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PADDING || _la==TABS) {
				{
				{
				setState(469);
				tabBarArgs();
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(475);
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
		enterRule(_localctx, 52, RULE_tabBarView);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(TAB_BAR_VIEW);
			setState(478);
			match(OPEN_PAREN);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILDREN) {
				{
				{
				setState(479);
				tabBarViewArgs();
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(485);
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
		enterRule(_localctx, 54, RULE_drawer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(DRAWER);
			setState(488);
			match(OPEN_PAREN);
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BACKGROUND_COLOR) | (1L << CHILD) | (1L << WIDTH))) != 0)) {
				{
				{
				setState(489);
				drawerArgs();
				}
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(495);
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
		enterRule(_localctx, 56, RULE_floatingActionButton);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(FLOATING_ACTION_BUTTON);
			setState(498);
			match(OPEN_PAREN);
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BACKGROUND_COLOR || _la==CHILD) {
				{
				{
				setState(499);
				floatingActionButtonArgs();
				}
				}
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(505);
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
		enterRule(_localctx, 58, RULE_wrap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(WRAP);
			setState(508);
			match(OPEN_PAREN);
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILDREN || _la==CROSS_AXIS_ALIGNMENT) {
				{
				{
				setState(509);
				wrapArgs();
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(515);
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
		enterRule(_localctx, 60, RULE_flex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(FLEX);
			setState(518);
			match(OPEN_PAREN);
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILD || _la==FLEX_ARG) {
				{
				{
				setState(519);
				flexArgs();
				}
				}
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(525);
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
		enterRule(_localctx, 62, RULE_textFormField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(TEXT_FORM_FIELD);
			setState(528);
			match(OPEN_PAREN);
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STYLE) {
				{
				{
				setState(529);
				textFormFieldArgs();
				}
				}
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(535);
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
		enterRule(_localctx, 64, RULE_textButton);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(TEXT_BUTTON);
			setState(538);
			match(OPEN_PAREN);
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILD || _la==STYLE) {
				{
				{
				setState(539);
				textButtonArgs();
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(545);
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
		enterRule(_localctx, 66, RULE_icon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(ICON);
			setState(548);
			match(OPEN_PAREN);
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ICONS || _la==COLOR || _la==SIZE) {
				{
				{
				setState(549);
				iconArgs();
				}
				}
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(555);
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
		enterRule(_localctx, 68, RULE_sizedBox);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(SIZED_BOX);
			setState(558);
			match(OPEN_PAREN);
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHILD) | (1L << WIDTH) | (1L << HEIGHT))) != 0)) {
				{
				{
				setState(559);
				sizedBoxArgs();
				}
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(565);
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
		enterRule(_localctx, 70, RULE_center);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(CENTER);
			setState(568);
			match(OPEN_PAREN);
			setState(569);
			centerArgs();
			setState(570);
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
		enterRule(_localctx, 72, RULE_scaffoldArgs);
		try {
			setState(578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BODY:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				body();
				}
				break;
			case DRAWER_ARG:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				drawerArg();
				}
				break;
			case APP_BAR_ARG:
				enterOuterAlt(_localctx, 3);
				{
				setState(574);
				appBarArg();
				}
				break;
			case BOTTOM_NAVIGATION_BAR_ARG:
				enterOuterAlt(_localctx, 4);
				{
				setState(575);
				bottomNavigationBarArg();
				}
				break;
			case FLOATING_ACTION_BUTTON_ARG:
				enterOuterAlt(_localctx, 5);
				{
				setState(576);
				floatingActionButtonArg();
				}
				break;
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(577);
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
		enterRule(_localctx, 74, RULE_containerArgs);
		try {
			setState(586);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				child();
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				width();
				}
				break;
			case HEIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(582);
				height();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(583);
				color();
				}
				break;
			case MARGIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(584);
				margin();
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 6);
				{
				setState(585);
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
		enterRule(_localctx, 76, RULE_textArgs);
		try {
			setState(590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				match(STRING);
				}
				break;
			case STYLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
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
		enterRule(_localctx, 78, RULE_imageArgs);
		try {
			setState(596);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMAGE_ARG:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				imageArg();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
				color();
				}
				break;
			case HEIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(594);
				height();
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 4);
				{
				setState(595);
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
		enterRule(_localctx, 80, RULE_listviewArgs);
		try {
			setState(600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				children();
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
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
		enterRule(_localctx, 82, RULE_appBarArgs);
		try {
			setState(606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TITLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				title();
				}
				break;
			case LEADING:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				leading();
				}
				break;
			case ACTIONS:
				enterOuterAlt(_localctx, 3);
				{
				setState(604);
				actions();
				}
				break;
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(605);
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
		enterRule(_localctx, 84, RULE_textFieldArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
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
		enterRule(_localctx, 86, RULE_columnArgs);
		try {
			setState(613);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				children();
				}
				break;
			case MAIN_AXIS_ALIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				mainAxis();
				}
				break;
			case CROSS_AXIS_ALIGNMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(612);
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
		enterRule(_localctx, 88, RULE_rowArgs);
		try {
			setState(618);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				children();
				}
				break;
			case MAIN_AXIS_ALIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
				mainAxis();
				}
				break;
			case CROSS_AXIS_ALIGNMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(617);
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
		enterRule(_localctx, 90, RULE_cardArgs);
		try {
			setState(623);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				color();
				}
				break;
			case MARGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				margin();
				}
				break;
			case CHILD:
				enterOuterAlt(_localctx, 3);
				{
				setState(622);
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
		enterRule(_localctx, 92, RULE_iconButtonArgs);
		try {
			setState(628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ICON_ARG:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				iconArg();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				color();
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 3);
				{
				setState(627);
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
		enterRule(_localctx, 94, RULE_inkwellArgs);
		try {
			setState(632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				child();
				}
				break;
			case ON_TAP:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
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
		enterRule(_localctx, 96, RULE_expandedArgs);
		try {
			setState(636);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				child();
				}
				break;
			case FLEX_ARG:
				enterOuterAlt(_localctx, 2);
				{
				setState(635);
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
		enterRule(_localctx, 98, RULE_bottomNavigationBarArgs);
		try {
			setState(641);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ITEMS:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				items();
				}
				break;
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
				backGroundColor();
				}
				break;
			case CURRENT_INDEX:
				enterOuterAlt(_localctx, 3);
				{
				setState(640);
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
		enterRule(_localctx, 100, RULE_sliderArgs);
		try {
			setState(645);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				min();
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 2);
				{
				setState(644);
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
		enterRule(_localctx, 102, RULE_tabBarArgs);
		try {
			setState(649);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TABS:
				enterOuterAlt(_localctx, 1);
				{
				setState(647);
				tabs();
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 2);
				{
				setState(648);
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
		enterRule(_localctx, 104, RULE_tabBarViewArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
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
		enterRule(_localctx, 106, RULE_drawerArgs);
		try {
			setState(656);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				backGroundColor();
				}
				break;
			case CHILD:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				child();
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 3);
				{
				setState(655);
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
		enterRule(_localctx, 108, RULE_floatingActionButtonArgs);
		try {
			setState(660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				child();
				}
				break;
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
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
		enterRule(_localctx, 110, RULE_wrapArgs);
		try {
			setState(664);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				children();
				}
				break;
			case CROSS_AXIS_ALIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
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
		enterRule(_localctx, 112, RULE_flexArgs);
		try {
			setState(668);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(666);
				child();
				}
				break;
			case FLEX_ARG:
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
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
		enterRule(_localctx, 114, RULE_textFormFieldArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
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
		enterRule(_localctx, 116, RULE_textButtonArgs);
		try {
			setState(674);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(672);
				child();
				}
				break;
			case STYLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
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
		enterRule(_localctx, 118, RULE_iconArgs);
		try {
			setState(679);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				size();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				color();
				}
				break;
			case ICONS:
				enterOuterAlt(_localctx, 3);
				{
				setState(678);
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
		enterRule(_localctx, 120, RULE_sizedBoxArgs);
		try {
			setState(684);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				child();
				}
				break;
			case HEIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
				height();
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 3);
				{
				setState(683);
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
		enterRule(_localctx, 122, RULE_textStyleArgs);
		try {
			setState(689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				backGroundColor();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				color();
				}
				break;
			case FONT_SIZE:
				enterOuterAlt(_localctx, 3);
				{
				setState(688);
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
		enterRule(_localctx, 124, RULE_centerArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
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
		enterRule(_localctx, 126, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(BODY);
			setState(694);
			match(COLON);
			setState(695);
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
		enterRule(_localctx, 128, RULE_drawerArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(DRAWER_ARG);
			setState(698);
			match(COLON);
			setState(699);
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
		enterRule(_localctx, 130, RULE_appBarArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(APP_BAR_ARG);
			setState(702);
			match(COLON);
			setState(703);
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
		enterRule(_localctx, 132, RULE_bottomNavigationBarArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			match(BOTTOM_NAVIGATION_BAR_ARG);
			setState(706);
			match(COLON);
			setState(707);
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
		enterRule(_localctx, 134, RULE_floatingActionButtonArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(FLOATING_ACTION_BUTTON_ARG);
			setState(710);
			match(COLON);
			setState(711);
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
		enterRule(_localctx, 136, RULE_child);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(CHILD);
			setState(714);
			match(COLON);
			setState(715);
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
		enterRule(_localctx, 138, RULE_children);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(CHILDREN);
			setState(718);
			match(COLON);
			setState(719);
			match(OPEN_SQUARE);
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCAFFOLD) | (1L << CONTAINER) | (1L << ROW) | (1L << COLUMN) | (1L << LIST_VIEW) | (1L << SIZED_BOX) | (1L << EXPANDED) | (1L << CARD) | (1L << ICON_BUTTON) | (1L << ICON) | (1L << SLIDER) | (1L << DRAWER) | (1L << WRAP) | (1L << FLEX) | (1L << TEXT_BUTTON) | (1L << TEXT) | (1L << IMAGE) | (1L << APP_BAR) | (1L << TEXT_FIELD) | (1L << INK_WELL) | (1L << BOTTOM_NAVIGATION_BAR) | (1L << TAB_BAR) | (1L << TAB_BAR_VIEW) | (1L << FLOATING_ACTION_BUTTON) | (1L << TEXT_FORM_FIELD) | (1L << CENTER))) != 0)) {
				{
				{
				setState(720);
				widget();
				}
				}
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(726);
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
		enterRule(_localctx, 140, RULE_height);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			match(HEIGHT);
			setState(729);
			match(COLON);
			setState(730);
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
		enterRule(_localctx, 142, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(WIDTH);
			setState(733);
			match(COLON);
			setState(734);
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
		enterRule(_localctx, 144, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			match(COLOR);
			setState(737);
			match(COLON);
			setState(738);
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
		enterRule(_localctx, 146, RULE_margin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(MARGIN);
			setState(741);
			match(COLON);
			setState(742);
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
		enterRule(_localctx, 148, RULE_padding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(PADDING);
			setState(745);
			match(COLON);
			setState(746);
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
		enterRule(_localctx, 150, RULE_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(ITEMS);
			setState(749);
			match(COLON);
			setState(750);
			match(OPEN_SQUARE);
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCAFFOLD) | (1L << CONTAINER) | (1L << ROW) | (1L << COLUMN) | (1L << LIST_VIEW) | (1L << SIZED_BOX) | (1L << EXPANDED) | (1L << CARD) | (1L << ICON_BUTTON) | (1L << ICON) | (1L << SLIDER) | (1L << DRAWER) | (1L << WRAP) | (1L << FLEX) | (1L << TEXT_BUTTON) | (1L << TEXT) | (1L << IMAGE) | (1L << APP_BAR) | (1L << TEXT_FIELD) | (1L << INK_WELL) | (1L << BOTTOM_NAVIGATION_BAR) | (1L << TAB_BAR) | (1L << TAB_BAR_VIEW) | (1L << FLOATING_ACTION_BUTTON) | (1L << TEXT_FORM_FIELD) | (1L << CENTER))) != 0)) {
				{
				{
				setState(751);
				widget();
				}
				}
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(757);
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
		enterRule(_localctx, 152, RULE_currentIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(CURRENT_INDEX);
			setState(760);
			match(COLON);
			setState(761);
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
		enterRule(_localctx, 154, RULE_backGroundColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(BACKGROUND_COLOR);
			setState(764);
			match(COLON);
			setState(765);
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
		enterRule(_localctx, 156, RULE_crossAxis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(CROSS_AXIS_ALIGNMENT);
			setState(768);
			match(COLON);
			setState(769);
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
		enterRule(_localctx, 158, RULE_mainAxis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(MAIN_AXIS_ALIGNMENT);
			setState(772);
			match(COLON);
			setState(773);
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
		enterRule(_localctx, 160, RULE_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			match(STYLE);
			setState(776);
			match(COLON);
			setState(777);
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
		enterRule(_localctx, 162, RULE_fontSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			match(FONT_SIZE);
			setState(780);
			match(COLON);
			setState(781);
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
		enterRule(_localctx, 164, RULE_imageArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(IMAGE_ARG);
			setState(784);
			match(COLON);
			setState(785);
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
		enterRule(_localctx, 166, RULE_leading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(LEADING);
			setState(788);
			match(COLON);
			setState(789);
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
		enterRule(_localctx, 168, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(TITLE);
			setState(792);
			match(COLON);
			setState(793);
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
		enterRule(_localctx, 170, RULE_actions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(ACTIONS);
			setState(796);
			match(COLON);
			setState(797);
			match(OPEN_SQUARE);
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCAFFOLD) | (1L << CONTAINER) | (1L << ROW) | (1L << COLUMN) | (1L << LIST_VIEW) | (1L << SIZED_BOX) | (1L << EXPANDED) | (1L << CARD) | (1L << ICON_BUTTON) | (1L << ICON) | (1L << SLIDER) | (1L << DRAWER) | (1L << WRAP) | (1L << FLEX) | (1L << TEXT_BUTTON) | (1L << TEXT) | (1L << IMAGE) | (1L << APP_BAR) | (1L << TEXT_FIELD) | (1L << INK_WELL) | (1L << BOTTOM_NAVIGATION_BAR) | (1L << TAB_BAR) | (1L << TAB_BAR_VIEW) | (1L << FLOATING_ACTION_BUTTON) | (1L << TEXT_FORM_FIELD) | (1L << CENTER))) != 0)) {
				{
				{
				setState(798);
				widget();
				}
				}
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(804);
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
		enterRule(_localctx, 172, RULE_iconArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(ICON_ARG);
			setState(807);
			match(COLON);
			setState(808);
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
		enterRule(_localctx, 174, RULE_flexArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(FLEX_ARG);
			setState(811);
			match(COLON);
			setState(812);
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
		enterRule(_localctx, 176, RULE_min);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(MIN);
			setState(815);
			match(COLON);
			setState(816);
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
		enterRule(_localctx, 178, RULE_max);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			match(MAX);
			setState(819);
			match(COLON);
			setState(820);
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
		enterRule(_localctx, 180, RULE_tabs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			match(TABS);
			setState(823);
			match(COLON);
			setState(824);
			match(OPEN_SQUARE);
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCAFFOLD) | (1L << CONTAINER) | (1L << ROW) | (1L << COLUMN) | (1L << LIST_VIEW) | (1L << SIZED_BOX) | (1L << EXPANDED) | (1L << CARD) | (1L << ICON_BUTTON) | (1L << ICON) | (1L << SLIDER) | (1L << DRAWER) | (1L << WRAP) | (1L << FLEX) | (1L << TEXT_BUTTON) | (1L << TEXT) | (1L << IMAGE) | (1L << APP_BAR) | (1L << TEXT_FIELD) | (1L << INK_WELL) | (1L << BOTTOM_NAVIGATION_BAR) | (1L << TAB_BAR) | (1L << TAB_BAR_VIEW) | (1L << FLOATING_ACTION_BUTTON) | (1L << TEXT_FORM_FIELD) | (1L << CENTER))) != 0)) {
				{
				{
				setState(825);
				widget();
				}
				}
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(831);
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
		enterRule(_localctx, 182, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			match(SIZE);
			setState(834);
			match(COLON);
			setState(835);
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
		enterRule(_localctx, 184, RULE_onTap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			match(ON_TAP);
			setState(838);
			match(COLON);
			setState(839);
			match(OPEN_PAREN);
			setState(840);
			match(CLOSE_PAREN);
			setState(841);
			match(OPEN_BRACE);
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RUN_APP || _la==NAVIGATOR) {
				{
				{
				setState(842);
				expression();
				}
				}
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(848);
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
		enterRule(_localctx, 186, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			allowExp();
			setState(851);
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
		enterRule(_localctx, 188, RULE_allowExp);
		try {
			setState(855);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAVIGATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
				navigateExp();
				}
				break;
			case RUN_APP:
				enterOuterAlt(_localctx, 2);
				{
				setState(854);
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
		enterRule(_localctx, 190, RULE_runAppExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(RUN_APP);
			setState(858);
			match(OPEN_PAREN);
			setState(859);
			constructor();
			setState(860);
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
		enterRule(_localctx, 192, RULE_navigateExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			match(NAVIGATOR);
			setState(863);
			match(DOT);
			setState(864);
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
		enterRule(_localctx, 194, RULE_transtion);
		try {
			setState(868);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUSH:
				enterOuterAlt(_localctx, 1);
				{
				setState(866);
				push();
				}
				break;
			case POP:
				enterOuterAlt(_localctx, 2);
				{
				setState(867);
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
		enterRule(_localctx, 196, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			match(PUSH);
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
		enterRule(_localctx, 198, RULE_pop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			match(POP);
			setState(876);
			match(OPEN_PAREN);
			setState(877);
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
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<ConstructorArgContext> constructorArg() {
			return getRuleContexts(ConstructorArgContext.class);
		}
		public ConstructorArgContext constructorArg(int i) {
			return getRuleContext(ConstructorArgContext.class,i);
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
		enterRule(_localctx, 200, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(ID);
			setState(880);
			match(OPEN_PAREN);
			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMAGE_ARG || _la==TEXT_Arg) {
				{
				{
				setState(881);
				constructorArg();
				}
				}
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(887);
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

	public static class ConstructorArgContext extends ParserRuleContext {
		public ImageArgContext imageArg() {
			return getRuleContext(ImageArgContext.class,0);
		}
		public TerminalNode TEXT_Arg() { return getToken(ParserFile.TEXT_Arg, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode STRING() { return getToken(ParserFile.STRING, 0); }
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
		enterRule(_localctx, 202, RULE_constructorArg);
		try {
			setState(893);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMAGE_ARG:
				enterOuterAlt(_localctx, 1);
				{
				setState(889);
				imageArg();
				}
				break;
			case TEXT_Arg:
				enterOuterAlt(_localctx, 2);
				{
				setState(890);
				match(TEXT_Arg);
				setState(891);
				match(COLON);
				setState(892);
				match(STRING);
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
		"\u0004\u0001s\u0380\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"d\u0007d\u0002e\u0007e\u0001\u0000\u0001\u0000\u0003\u0000\u00cf\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u00d7\b\u0001\n\u0001\f\u0001\u00da\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\u00e4\b\u0002\n\u0002\f\u0002\u00e7\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00ee\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00f4\b\u0004"+
		"\n\u0004\f\u0004\u00f7\t\u0004\u0001\u0004\u0005\u0004\u00fa\b\u0004\n"+
		"\u0004\f\u0004\u00fd\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0132\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u0137\b\t\n\t\f\t\u013a\t\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0005\n\u0141\b\n\n\n\f\n\u0144\t\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u014b\b\u000b\n\u000b\f\u000b\u014e"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u0155"+
		"\b\f\n\f\f\f\u0158\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r"+
		"\u015f\b\r\n\r\f\r\u0162\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u0169\b\u000e\n\u000e\f\u000e\u016c\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0173\b\u000f"+
		"\n\u000f\f\u000f\u0176\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u017d\b\u0010\n\u0010\f\u0010\u0180\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u0187\b\u0011\n\u0011\f\u0011\u018a\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0191\b\u0012\n\u0012\f\u0012"+
		"\u0194\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u019b\b\u0013\n\u0013\f\u0013\u019e\t\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01a5\b\u0014\n"+
		"\u0014\f\u0014\u01a8\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u01af\b\u0015\n\u0015\f\u0015\u01b2\t\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u01b9\b\u0016\n\u0016\f\u0016\u01bc\t\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u01c3\b\u0017\n\u0017\f\u0017"+
		"\u01c6\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u01cd\b\u0018\n\u0018\f\u0018\u01d0\t\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01d7\b\u0019\n"+
		"\u0019\f\u0019\u01da\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u01e1\b\u001a\n\u001a\f\u001a\u01e4\t\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b"+
		"\u01eb\b\u001b\n\u001b\f\u001b\u01ee\t\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01f5\b\u001c\n\u001c\f\u001c"+
		"\u01f8\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u01ff\b\u001d\n\u001d\f\u001d\u0202\t\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0209\b\u001e\n"+
		"\u001e\f\u001e\u020c\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u0213\b\u001f\n\u001f\f\u001f\u0216\t\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0005 \u021d\b \n \f \u0220"+
		"\t \u0001 \u0001 \u0001!\u0001!\u0001!\u0005!\u0227\b!\n!\f!\u022a\t!"+
		"\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0005\"\u0231\b\"\n\"\f\"\u0234"+
		"\t\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$"+
		"\u0001$\u0001$\u0001$\u0001$\u0003$\u0243\b$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0003%\u024b\b%\u0001&\u0001&\u0003&\u024f\b&\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0003\'\u0255\b\'\u0001(\u0001(\u0003(\u0259"+
		"\b(\u0001)\u0001)\u0001)\u0001)\u0003)\u025f\b)\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0003+\u0266\b+\u0001,\u0001,\u0001,\u0003,\u026b\b,\u0001-\u0001"+
		"-\u0001-\u0003-\u0270\b-\u0001.\u0001.\u0001.\u0003.\u0275\b.\u0001/\u0001"+
		"/\u0003/\u0279\b/\u00010\u00010\u00030\u027d\b0\u00011\u00011\u00011\u0003"+
		"1\u0282\b1\u00012\u00012\u00032\u0286\b2\u00013\u00013\u00033\u028a\b"+
		"3\u00014\u00014\u00015\u00015\u00015\u00035\u0291\b5\u00016\u00016\u0003"+
		"6\u0295\b6\u00017\u00017\u00037\u0299\b7\u00018\u00018\u00038\u029d\b"+
		"8\u00019\u00019\u0001:\u0001:\u0003:\u02a3\b:\u0001;\u0001;\u0001;\u0003"+
		";\u02a8\b;\u0001<\u0001<\u0001<\u0003<\u02ad\b<\u0001=\u0001=\u0001=\u0003"+
		"=\u02b2\b=\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001"+
		"@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001"+
		"C\u0001C\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001E\u0001E\u0001"+
		"E\u0001E\u0005E\u02d2\bE\nE\fE\u02d5\tE\u0001E\u0001E\u0001F\u0001F\u0001"+
		"F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001"+
		"I\u0001I\u0001I\u0001I\u0001J\u0001J\u0001J\u0001J\u0001K\u0001K\u0001"+
		"K\u0001K\u0005K\u02f1\bK\nK\fK\u02f4\tK\u0001K\u0001K\u0001L\u0001L\u0001"+
		"L\u0001L\u0001M\u0001M\u0001M\u0001M\u0001N\u0001N\u0001N\u0001N\u0001"+
		"O\u0001O\u0001O\u0001O\u0001P\u0001P\u0001P\u0001P\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001R\u0001R\u0001R\u0001R\u0001S\u0001S\u0001S\u0001S\u0001"+
		"T\u0001T\u0001T\u0001T\u0001U\u0001U\u0001U\u0001U\u0005U\u0320\bU\nU"+
		"\fU\u0323\tU\u0001U\u0001U\u0001V\u0001V\u0001V\u0001V\u0001W\u0001W\u0001"+
		"W\u0001W\u0001X\u0001X\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0001Y\u0001"+
		"Z\u0001Z\u0001Z\u0001Z\u0005Z\u033b\bZ\nZ\fZ\u033e\tZ\u0001Z\u0001Z\u0001"+
		"[\u0001[\u0001[\u0001[\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\"+
		"\u0005\\\u034c\b\\\n\\\f\\\u034f\t\\\u0001\\\u0001\\\u0001]\u0001]\u0001"+
		"]\u0001^\u0001^\u0003^\u0358\b^\u0001_\u0001_\u0001_\u0001_\u0001_\u0001"+
		"`\u0001`\u0001`\u0001`\u0001a\u0001a\u0003a\u0365\ba\u0001b\u0001b\u0001"+
		"b\u0001b\u0001b\u0001c\u0001c\u0001c\u0001c\u0001d\u0001d\u0001d\u0005"+
		"d\u0373\bd\nd\fd\u0376\td\u0001d\u0001d\u0001e\u0001e\u0001e\u0001e\u0003"+
		"e\u037e\be\u0001e\u0000\u0000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u0000\u0000\u0388\u0000\u00ce\u0001"+
		"\u0000\u0000\u0000\u0002\u00d0\u0001\u0000\u0000\u0000\u0004\u00dd\u0001"+
		"\u0000\u0000\u0000\u0006\u00ed\u0001\u0000\u0000\u0000\b\u00ef\u0001\u0000"+
		"\u0000\u0000\n\u0101\u0001\u0000\u0000\u0000\f\u0105\u0001\u0000\u0000"+
		"\u0000\u000e\u010a\u0001\u0000\u0000\u0000\u0010\u0131\u0001\u0000\u0000"+
		"\u0000\u0012\u0133\u0001\u0000\u0000\u0000\u0014\u013d\u0001\u0000\u0000"+
		"\u0000\u0016\u0147\u0001\u0000\u0000\u0000\u0018\u0151\u0001\u0000\u0000"+
		"\u0000\u001a\u015b\u0001\u0000\u0000\u0000\u001c\u0165\u0001\u0000\u0000"+
		"\u0000\u001e\u016f\u0001\u0000\u0000\u0000 \u0179\u0001\u0000\u0000\u0000"+
		"\"\u0183\u0001\u0000\u0000\u0000$\u018d\u0001\u0000\u0000\u0000&\u0197"+
		"\u0001\u0000\u0000\u0000(\u01a1\u0001\u0000\u0000\u0000*\u01ab\u0001\u0000"+
		"\u0000\u0000,\u01b5\u0001\u0000\u0000\u0000.\u01bf\u0001\u0000\u0000\u0000"+
		"0\u01c9\u0001\u0000\u0000\u00002\u01d3\u0001\u0000\u0000\u00004\u01dd"+
		"\u0001\u0000\u0000\u00006\u01e7\u0001\u0000\u0000\u00008\u01f1\u0001\u0000"+
		"\u0000\u0000:\u01fb\u0001\u0000\u0000\u0000<\u0205\u0001\u0000\u0000\u0000"+
		">\u020f\u0001\u0000\u0000\u0000@\u0219\u0001\u0000\u0000\u0000B\u0223"+
		"\u0001\u0000\u0000\u0000D\u022d\u0001\u0000\u0000\u0000F\u0237\u0001\u0000"+
		"\u0000\u0000H\u0242\u0001\u0000\u0000\u0000J\u024a\u0001\u0000\u0000\u0000"+
		"L\u024e\u0001\u0000\u0000\u0000N\u0254\u0001\u0000\u0000\u0000P\u0258"+
		"\u0001\u0000\u0000\u0000R\u025e\u0001\u0000\u0000\u0000T\u0260\u0001\u0000"+
		"\u0000\u0000V\u0265\u0001\u0000\u0000\u0000X\u026a\u0001\u0000\u0000\u0000"+
		"Z\u026f\u0001\u0000\u0000\u0000\\\u0274\u0001\u0000\u0000\u0000^\u0278"+
		"\u0001\u0000\u0000\u0000`\u027c\u0001\u0000\u0000\u0000b\u0281\u0001\u0000"+
		"\u0000\u0000d\u0285\u0001\u0000\u0000\u0000f\u0289\u0001\u0000\u0000\u0000"+
		"h\u028b\u0001\u0000\u0000\u0000j\u0290\u0001\u0000\u0000\u0000l\u0294"+
		"\u0001\u0000\u0000\u0000n\u0298\u0001\u0000\u0000\u0000p\u029c\u0001\u0000"+
		"\u0000\u0000r\u029e\u0001\u0000\u0000\u0000t\u02a2\u0001\u0000\u0000\u0000"+
		"v\u02a7\u0001\u0000\u0000\u0000x\u02ac\u0001\u0000\u0000\u0000z\u02b1"+
		"\u0001\u0000\u0000\u0000|\u02b3\u0001\u0000\u0000\u0000~\u02b5\u0001\u0000"+
		"\u0000\u0000\u0080\u02b9\u0001\u0000\u0000\u0000\u0082\u02bd\u0001\u0000"+
		"\u0000\u0000\u0084\u02c1\u0001\u0000\u0000\u0000\u0086\u02c5\u0001\u0000"+
		"\u0000\u0000\u0088\u02c9\u0001\u0000\u0000\u0000\u008a\u02cd\u0001\u0000"+
		"\u0000\u0000\u008c\u02d8\u0001\u0000\u0000\u0000\u008e\u02dc\u0001\u0000"+
		"\u0000\u0000\u0090\u02e0\u0001\u0000\u0000\u0000\u0092\u02e4\u0001\u0000"+
		"\u0000\u0000\u0094\u02e8\u0001\u0000\u0000\u0000\u0096\u02ec\u0001\u0000"+
		"\u0000\u0000\u0098\u02f7\u0001\u0000\u0000\u0000\u009a\u02fb\u0001\u0000"+
		"\u0000\u0000\u009c\u02ff\u0001\u0000\u0000\u0000\u009e\u0303\u0001\u0000"+
		"\u0000\u0000\u00a0\u0307\u0001\u0000\u0000\u0000\u00a2\u030b\u0001\u0000"+
		"\u0000\u0000\u00a4\u030f\u0001\u0000\u0000\u0000\u00a6\u0313\u0001\u0000"+
		"\u0000\u0000\u00a8\u0317\u0001\u0000\u0000\u0000\u00aa\u031b\u0001\u0000"+
		"\u0000\u0000\u00ac\u0326\u0001\u0000\u0000\u0000\u00ae\u032a\u0001\u0000"+
		"\u0000\u0000\u00b0\u032e\u0001\u0000\u0000\u0000\u00b2\u0332\u0001\u0000"+
		"\u0000\u0000\u00b4\u0336\u0001\u0000\u0000\u0000\u00b6\u0341\u0001\u0000"+
		"\u0000\u0000\u00b8\u0345\u0001\u0000\u0000\u0000\u00ba\u0352\u0001\u0000"+
		"\u0000\u0000\u00bc\u0357\u0001\u0000\u0000\u0000\u00be\u0359\u0001\u0000"+
		"\u0000\u0000\u00c0\u035e\u0001\u0000\u0000\u0000\u00c2\u0364\u0001\u0000"+
		"\u0000\u0000\u00c4\u0366\u0001\u0000\u0000\u0000\u00c6\u036b\u0001\u0000"+
		"\u0000\u0000\u00c8\u036f\u0001\u0000\u0000\u0000\u00ca\u037d\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cf\u0003\u0002\u0001\u0000\u00cd\u00cf\u0003\u0004"+
		"\u0002\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cf\u0001\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u0001"+
		"\u0000\u0000\u00d1\u00d2\u0005\u0002\u0000\u0000\u00d2\u00d3\u0005\\\u0000"+
		"\u0000\u00d3\u00d4\u0005]\u0000\u0000\u00d4\u00d8\u0005`\u0000\u0000\u00d5"+
		"\u00d7\u0003\u00ba]\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00da"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d9\u00db\u0001\u0000\u0000\u0000\u00da\u00d8"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0005a\u0000\u0000\u00dc\u0003\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0005\u0004\u0000\u0000\u00de\u00df\u0005"+
		"S\u0000\u0000\u00df\u00e0\u0005\u0005\u0000\u0000\u00e0\u00e1\u0005\u0006"+
		"\u0000\u0000\u00e1\u00e5\u0005`\u0000\u0000\u00e2\u00e4\u0003\u0006\u0003"+
		"\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0005a\u0000\u0000\u00e9\u0005\u0001\u0000\u0000\u0000"+
		"\u00ea\u00ee\u0003\u000e\u0007\u0000\u00eb\u00ee\u0003\n\u0005\u0000\u00ec"+
		"\u00ee\u0003\b\u0004\u0000\u00ed\u00ea\u0001\u0000\u0000\u0000\u00ed\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u0007"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005S\u0000\u0000\u00f0\u00fb\u0005"+
		"\\\u0000\u0000\u00f1\u00f5\u0005`\u0000\u0000\u00f2\u00f4\u0003\f\u0006"+
		"\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fa\u0005a\u0000\u0000\u00f9\u00f1\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005]\u0000\u0000\u00ff"+
		"\u0100\u0005Y\u0000\u0000\u0100\t\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0005r\u0000\u0000\u0102\u0103\u0005S\u0000\u0000\u0103\u0104\u0005Y"+
		"\u0000\u0000\u0104\u000b\u0001\u0000\u0000\u0000\u0105\u0106\u0005\f\u0000"+
		"\u0000\u0106\u0107\u0005\r\u0000\u0000\u0107\u0108\u0005[\u0000\u0000"+
		"\u0108\u0109\u0005V\u0000\u0000\u0109\r\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0005\u0007\u0000\u0000\u010b\u010c\u0005\b\u0000\u0000\u010c\u010d"+
		"\u0005\t\u0000\u0000\u010d\u010e\u0005\\\u0000\u0000\u010e\u010f\u0005"+
		"\n\u0000\u0000\u010f\u0110\u0005S\u0000\u0000\u0110\u0111\u0005]\u0000"+
		"\u0000\u0111\u0112\u0005`\u0000\u0000\u0112\u0113\u0005\u000b\u0000\u0000"+
		"\u0113\u0114\u0003\u0010\b\u0000\u0114\u0115\u0005Y\u0000\u0000\u0115"+
		"\u0116\u0005a\u0000\u0000\u0116\u000f\u0001\u0000\u0000\u0000\u0117\u0132"+
		"\u0003\u0012\t\u0000\u0118\u0132\u0003\u0014\n\u0000\u0119\u0132\u0003"+
		"\u0016\u000b\u0000\u011a\u0132\u0003\u001a\r\u0000\u011b\u0132\u0003\u001c"+
		"\u000e\u0000\u011c\u0132\u0003\u001e\u000f\u0000\u011d\u0132\u0003 \u0010"+
		"\u0000\u011e\u0132\u0003\"\u0011\u0000\u011f\u0132\u0003$\u0012\u0000"+
		"\u0120\u0132\u0003&\u0013\u0000\u0121\u0132\u0003(\u0014\u0000\u0122\u0132"+
		"\u0003*\u0015\u0000\u0123\u0132\u0003,\u0016\u0000\u0124\u0132\u0003."+
		"\u0017\u0000\u0125\u0132\u00030\u0018\u0000\u0126\u0132\u00032\u0019\u0000"+
		"\u0127\u0132\u00034\u001a\u0000\u0128\u0132\u00036\u001b\u0000\u0129\u0132"+
		"\u00038\u001c\u0000\u012a\u0132\u0003:\u001d\u0000\u012b\u0132\u0003<"+
		"\u001e\u0000\u012c\u0132\u0003>\u001f\u0000\u012d\u0132\u0003@ \u0000"+
		"\u012e\u0132\u0003B!\u0000\u012f\u0132\u0003D\"\u0000\u0130\u0132\u0003"+
		"F#\u0000\u0131\u0117\u0001\u0000\u0000\u0000\u0131\u0118\u0001\u0000\u0000"+
		"\u0000\u0131\u0119\u0001\u0000\u0000\u0000\u0131\u011a\u0001\u0000\u0000"+
		"\u0000\u0131\u011b\u0001\u0000\u0000\u0000\u0131\u011c\u0001\u0000\u0000"+
		"\u0000\u0131\u011d\u0001\u0000\u0000\u0000\u0131\u011e\u0001\u0000\u0000"+
		"\u0000\u0131\u011f\u0001\u0000\u0000\u0000\u0131\u0120\u0001\u0000\u0000"+
		"\u0000\u0131\u0121\u0001\u0000\u0000\u0000\u0131\u0122\u0001\u0000\u0000"+
		"\u0000\u0131\u0123\u0001\u0000\u0000\u0000\u0131\u0124\u0001\u0000\u0000"+
		"\u0000\u0131\u0125\u0001\u0000\u0000\u0000\u0131\u0126\u0001\u0000\u0000"+
		"\u0000\u0131\u0127\u0001\u0000\u0000\u0000\u0131\u0128\u0001\u0000\u0000"+
		"\u0000\u0131\u0129\u0001\u0000\u0000\u0000\u0131\u012a\u0001\u0000\u0000"+
		"\u0000\u0131\u012b\u0001\u0000\u0000\u0000\u0131\u012c\u0001\u0000\u0000"+
		"\u0000\u0131\u012d\u0001\u0000\u0000\u0000\u0131\u012e\u0001\u0000\u0000"+
		"\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0130\u0001\u0000\u0000"+
		"\u0000\u0132\u0011\u0001\u0000\u0000\u0000\u0133\u0134\u0005\u000e\u0000"+
		"\u0000\u0134\u0138\u0005\\\u0000\u0000\u0135\u0137\u0003H$\u0000\u0136"+
		"\u0135\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138"+
		"\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139"+
		"\u013b\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0005]\u0000\u0000\u013c\u0013\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0005\u000f\u0000\u0000\u013e\u0142\u0005\\\u0000\u0000\u013f\u0141\u0003"+
		"J%\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000"+
		"\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000"+
		"\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0005]\u0000\u0000\u0146\u0015\u0001\u0000\u0000\u0000"+
		"\u0147\u0148\u0005\u001d\u0000\u0000\u0148\u014c\u0005\\\u0000\u0000\u0149"+
		"\u014b\u0003L&\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014b\u014e\u0001"+
		"\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001"+
		"\u0000\u0000\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e\u014c\u0001"+
		"\u0000\u0000\u0000\u014f\u0150\u0005]\u0000\u0000\u0150\u0017\u0001\u0000"+
		"\u0000\u0000\u0151\u0152\u0005)\u0000\u0000\u0152\u0156\u0005\\\u0000"+
		"\u0000\u0153\u0155\u0003z=\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0155"+
		"\u0158\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156"+
		"\u0157\u0001\u0000\u0000\u0000\u0157\u0159\u0001\u0000\u0000\u0000\u0158"+
		"\u0156\u0001\u0000\u0000\u0000\u0159\u015a\u0005]\u0000\u0000\u015a\u0019"+
		"\u0001\u0000\u0000\u0000\u015b\u015c\u0005\u001e\u0000\u0000\u015c\u0160"+
		"\u0005\\\u0000\u0000\u015d\u015f\u0003N\'\u0000\u015e\u015d\u0001\u0000"+
		"\u0000\u0000\u015f\u0162\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000"+
		"\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0163\u0001\u0000"+
		"\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0163\u0164\u0005]\u0000"+
		"\u0000\u0164\u001b\u0001\u0000\u0000\u0000\u0165\u0166\u0005\u0012\u0000"+
		"\u0000\u0166\u016a\u0005\\\u0000\u0000\u0167\u0169\u0003P(\u0000\u0168"+
		"\u0167\u0001\u0000\u0000\u0000\u0169\u016c\u0001\u0000\u0000\u0000\u016a"+
		"\u0168\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b"+
		"\u016d\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016d"+
		"\u016e\u0005]\u0000\u0000\u016e\u001d\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\u0005\u001f\u0000\u0000\u0170\u0174\u0005\\\u0000\u0000\u0171\u0173\u0003"+
		"R)\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0173\u0176\u0001\u0000\u0000"+
		"\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000"+
		"\u0000\u0175\u0177\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000"+
		"\u0000\u0177\u0178\u0005]\u0000\u0000\u0178\u001f\u0001\u0000\u0000\u0000"+
		"\u0179\u017a\u0005 \u0000\u0000\u017a\u017e\u0005\\\u0000\u0000\u017b"+
		"\u017d\u0003T*\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017d\u0180\u0001"+
		"\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001"+
		"\u0000\u0000\u0000\u017f\u0181\u0001\u0000\u0000\u0000\u0180\u017e\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0005]\u0000\u0000\u0182!\u0001\u0000\u0000"+
		"\u0000\u0183\u0184\u0005\u0011\u0000\u0000\u0184\u0188\u0005\\\u0000\u0000"+
		"\u0185\u0187\u0003V+\u0000\u0186\u0185\u0001\u0000\u0000\u0000\u0187\u018a"+
		"\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0188\u0189"+
		"\u0001\u0000\u0000\u0000\u0189\u018b\u0001\u0000\u0000\u0000\u018a\u0188"+
		"\u0001\u0000\u0000\u0000\u018b\u018c\u0005]\u0000\u0000\u018c#\u0001\u0000"+
		"\u0000\u0000\u018d\u018e\u0005\u0010\u0000\u0000\u018e\u0192\u0005\\\u0000"+
		"\u0000\u018f\u0191\u0003X,\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0191"+
		"\u0194\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192"+
		"\u0193\u0001\u0000\u0000\u0000\u0193\u0195\u0001\u0000\u0000\u0000\u0194"+
		"\u0192\u0001\u0000\u0000\u0000\u0195\u0196\u0005]\u0000\u0000\u0196%\u0001"+
		"\u0000\u0000\u0000\u0197\u0198\u0005\u0015\u0000\u0000\u0198\u019c\u0005"+
		"\\\u0000\u0000\u0199\u019b\u0003Z-\u0000\u019a\u0199\u0001\u0000\u0000"+
		"\u0000\u019b\u019e\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000"+
		"\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u019f\u0001\u0000\u0000"+
		"\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019f\u01a0\u0005]\u0000\u0000"+
		"\u01a0\'\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005\u0016\u0000\u0000\u01a2"+
		"\u01a6\u0005\\\u0000\u0000\u01a3\u01a5\u0003\\.\u0000\u01a4\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a8\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a9\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005"+
		"]\u0000\u0000\u01aa)\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005#\u0000"+
		"\u0000\u01ac\u01b0\u0005\\\u0000\u0000\u01ad\u01af\u0003^/\u0000\u01ae"+
		"\u01ad\u0001\u0000\u0000\u0000\u01af\u01b2\u0001\u0000\u0000\u0000\u01b0"+
		"\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b4\u0005]\u0000\u0000\u01b4+\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005"+
		"\u0014\u0000\u0000\u01b6\u01ba\u0005\\\u0000\u0000\u01b7\u01b9\u0003`"+
		"0\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b9\u01bc\u0001\u0000\u0000"+
		"\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000"+
		"\u0000\u01bb\u01bd\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000"+
		"\u0000\u01bd\u01be\u0005]\u0000\u0000\u01be-\u0001\u0000\u0000\u0000\u01bf"+
		"\u01c0\u0005$\u0000\u0000\u01c0\u01c4\u0005\\\u0000\u0000\u01c1\u01c3"+
		"\u0003b1\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c7\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c8\u0005]\u0000\u0000\u01c8/\u0001\u0000\u0000\u0000"+
		"\u01c9\u01ca\u0005\u0018\u0000\u0000\u01ca\u01ce\u0005\\\u0000\u0000\u01cb"+
		"\u01cd\u0003d2\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cd\u01d0\u0001"+
		"\u0000\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001"+
		"\u0000\u0000\u0000\u01cf\u01d1\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001"+
		"\u0000\u0000\u0000\u01d1\u01d2\u0005]\u0000\u0000\u01d21\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d4\u0005%\u0000\u0000\u01d4\u01d8\u0005\\\u0000\u0000"+
		"\u01d5\u01d7\u0003f3\u0000\u01d6\u01d5\u0001\u0000\u0000\u0000\u01d7\u01da"+
		"\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9"+
		"\u0001\u0000\u0000\u0000\u01d9\u01db\u0001\u0000\u0000\u0000\u01da\u01d8"+
		"\u0001\u0000\u0000\u0000\u01db\u01dc\u0005]\u0000\u0000\u01dc3\u0001\u0000"+
		"\u0000\u0000\u01dd\u01de\u0005&\u0000\u0000\u01de\u01e2\u0005\\\u0000"+
		"\u0000\u01df\u01e1\u0003h4\u0000\u01e0\u01df\u0001\u0000\u0000\u0000\u01e1"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e5\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e5\u01e6\u0005]\u0000\u0000\u01e65\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e8\u0005\u0019\u0000\u0000\u01e8\u01ec\u0005"+
		"\\\u0000\u0000\u01e9\u01eb\u0003j5\u0000\u01ea\u01e9\u0001\u0000\u0000"+
		"\u0000\u01eb\u01ee\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01ef\u0001\u0000\u0000"+
		"\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005]\u0000\u0000"+
		"\u01f07\u0001\u0000\u0000\u0000\u01f1\u01f2\u0005\'\u0000\u0000\u01f2"+
		"\u01f6\u0005\\\u0000\u0000\u01f3\u01f5\u0003l6\u0000\u01f4\u01f3\u0001"+
		"\u0000\u0000\u0000\u01f5\u01f8\u0001\u0000\u0000\u0000\u01f6\u01f4\u0001"+
		"\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7\u01f9\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f9\u01fa\u0005"+
		"]\u0000\u0000\u01fa9\u0001\u0000\u0000\u0000\u01fb\u01fc\u0005\u001a\u0000"+
		"\u0000\u01fc\u0200\u0005\\\u0000\u0000\u01fd\u01ff\u0003n7\u0000\u01fe"+
		"\u01fd\u0001\u0000\u0000\u0000\u01ff\u0202\u0001\u0000\u0000\u0000\u0200"+
		"\u01fe\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201"+
		"\u0203\u0001\u0000\u0000\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0203"+
		"\u0204\u0005]\u0000\u0000\u0204;\u0001\u0000\u0000\u0000\u0205\u0206\u0005"+
		"\u001b\u0000\u0000\u0206\u020a\u0005\\\u0000\u0000\u0207\u0209\u0003p"+
		"8\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0209\u020c\u0001\u0000\u0000"+
		"\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000"+
		"\u0000\u020b\u020d\u0001\u0000\u0000\u0000\u020c\u020a\u0001\u0000\u0000"+
		"\u0000\u020d\u020e\u0005]\u0000\u0000\u020e=\u0001\u0000\u0000\u0000\u020f"+
		"\u0210\u0005(\u0000\u0000\u0210\u0214\u0005\\\u0000\u0000\u0211\u0213"+
		"\u0003r9\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0213\u0216\u0001\u0000"+
		"\u0000\u0000\u0214\u0212\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000"+
		"\u0000\u0000\u0215\u0217\u0001\u0000\u0000\u0000\u0216\u0214\u0001\u0000"+
		"\u0000\u0000\u0217\u0218\u0005]\u0000\u0000\u0218?\u0001\u0000\u0000\u0000"+
		"\u0219\u021a\u0005\u001c\u0000\u0000\u021a\u021e\u0005\\\u0000\u0000\u021b"+
		"\u021d\u0003t:\u0000\u021c\u021b\u0001\u0000\u0000\u0000\u021d\u0220\u0001"+
		"\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021e\u021f\u0001"+
		"\u0000\u0000\u0000\u021f\u0221\u0001\u0000\u0000\u0000\u0220\u021e\u0001"+
		"\u0000\u0000\u0000\u0221\u0222\u0005]\u0000\u0000\u0222A\u0001\u0000\u0000"+
		"\u0000\u0223\u0224\u0005\u0017\u0000\u0000\u0224\u0228\u0005\\\u0000\u0000"+
		"\u0225\u0227\u0003v;\u0000\u0226\u0225\u0001\u0000\u0000\u0000\u0227\u022a"+
		"\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0228\u0229"+
		"\u0001\u0000\u0000\u0000\u0229\u022b\u0001\u0000\u0000\u0000\u022a\u0228"+
		"\u0001\u0000\u0000\u0000\u022b\u022c\u0005]\u0000\u0000\u022cC\u0001\u0000"+
		"\u0000\u0000\u022d\u022e\u0005\u0013\u0000\u0000\u022e\u0232\u0005\\\u0000"+
		"\u0000\u022f\u0231\u0003x<\u0000\u0230\u022f\u0001\u0000\u0000\u0000\u0231"+
		"\u0234\u0001\u0000\u0000\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0232"+
		"\u0233\u0001\u0000\u0000\u0000\u0233\u0235\u0001\u0000\u0000\u0000\u0234"+
		"\u0232\u0001\u0000\u0000\u0000\u0235\u0236\u0005]\u0000\u0000\u0236E\u0001"+
		"\u0000\u0000\u0000\u0237\u0238\u0005*\u0000\u0000\u0238\u0239\u0005\\"+
		"\u0000\u0000\u0239\u023a\u0003|>\u0000\u023a\u023b\u0005]\u0000\u0000"+
		"\u023bG\u0001\u0000\u0000\u0000\u023c\u0243\u0003~?\u0000\u023d\u0243"+
		"\u0003\u0080@\u0000\u023e\u0243\u0003\u0082A\u0000\u023f\u0243\u0003\u0084"+
		"B\u0000\u0240\u0243\u0003\u0086C\u0000\u0241\u0243\u0003\u009aM\u0000"+
		"\u0242\u023c\u0001\u0000\u0000\u0000\u0242\u023d\u0001\u0000\u0000\u0000"+
		"\u0242\u023e\u0001\u0000\u0000\u0000\u0242\u023f\u0001\u0000\u0000\u0000"+
		"\u0242\u0240\u0001\u0000\u0000\u0000\u0242\u0241\u0001\u0000\u0000\u0000"+
		"\u0243I\u0001\u0000\u0000\u0000\u0244\u024b\u0003\u0088D\u0000\u0245\u024b"+
		"\u0003\u008eG\u0000\u0246\u024b\u0003\u008cF\u0000\u0247\u024b\u0003\u0090"+
		"H\u0000\u0248\u024b\u0003\u0092I\u0000\u0249\u024b\u0003\u0094J\u0000"+
		"\u024a\u0244\u0001\u0000\u0000\u0000\u024a\u0245\u0001\u0000\u0000\u0000"+
		"\u024a\u0246\u0001\u0000\u0000\u0000\u024a\u0247\u0001\u0000\u0000\u0000"+
		"\u024a\u0248\u0001\u0000\u0000\u0000\u024a\u0249\u0001\u0000\u0000\u0000"+
		"\u024bK\u0001\u0000\u0000\u0000\u024c\u024f\u0005U\u0000\u0000\u024d\u024f"+
		"\u0003\u00a0P\u0000\u024e\u024c\u0001\u0000\u0000\u0000\u024e\u024d\u0001"+
		"\u0000\u0000\u0000\u024fM\u0001\u0000\u0000\u0000\u0250\u0255\u0003\u00a4"+
		"R\u0000\u0251\u0255\u0003\u0090H\u0000\u0252\u0255\u0003\u008cF\u0000"+
		"\u0253\u0255\u0003\u008eG\u0000\u0254\u0250\u0001\u0000\u0000\u0000\u0254"+
		"\u0251\u0001\u0000\u0000\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0254"+
		"\u0253\u0001\u0000\u0000\u0000\u0255O\u0001\u0000\u0000\u0000\u0256\u0259"+
		"\u0003\u008aE\u0000\u0257\u0259\u0003\u0094J\u0000\u0258\u0256\u0001\u0000"+
		"\u0000\u0000\u0258\u0257\u0001\u0000\u0000\u0000\u0259Q\u0001\u0000\u0000"+
		"\u0000\u025a\u025f\u0003\u00a8T\u0000\u025b\u025f\u0003\u00a6S\u0000\u025c"+
		"\u025f\u0003\u00aaU\u0000\u025d\u025f\u0003\u009aM\u0000\u025e\u025a\u0001"+
		"\u0000\u0000\u0000\u025e\u025b\u0001\u0000\u0000\u0000\u025e\u025c\u0001"+
		"\u0000\u0000\u0000\u025e\u025d\u0001\u0000\u0000\u0000\u025fS\u0001\u0000"+
		"\u0000\u0000\u0260\u0261\u0003\u00a0P\u0000\u0261U\u0001\u0000\u0000\u0000"+
		"\u0262\u0266\u0003\u008aE\u0000\u0263\u0266\u0003\u009eO\u0000\u0264\u0266"+
		"\u0003\u009cN\u0000\u0265\u0262\u0001\u0000\u0000\u0000\u0265\u0263\u0001"+
		"\u0000\u0000\u0000\u0265\u0264\u0001\u0000\u0000\u0000\u0266W\u0001\u0000"+
		"\u0000\u0000\u0267\u026b\u0003\u008aE\u0000\u0268\u026b\u0003\u009eO\u0000"+
		"\u0269\u026b\u0003\u009cN\u0000\u026a\u0267\u0001\u0000\u0000\u0000\u026a"+
		"\u0268\u0001\u0000\u0000\u0000\u026a\u0269\u0001\u0000\u0000\u0000\u026b"+
		"Y\u0001\u0000\u0000\u0000\u026c\u0270\u0003\u0090H\u0000\u026d\u0270\u0003"+
		"\u0092I\u0000\u026e\u0270\u0003\u0088D\u0000\u026f\u026c\u0001\u0000\u0000"+
		"\u0000\u026f\u026d\u0001\u0000\u0000\u0000\u026f\u026e\u0001\u0000\u0000"+
		"\u0000\u0270[\u0001\u0000\u0000\u0000\u0271\u0275\u0003\u00acV\u0000\u0272"+
		"\u0275\u0003\u0090H\u0000\u0273\u0275\u0003\u0094J\u0000\u0274\u0271\u0001"+
		"\u0000\u0000\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0274\u0273\u0001"+
		"\u0000\u0000\u0000\u0275]\u0001\u0000\u0000\u0000\u0276\u0279\u0003\u0088"+
		"D\u0000\u0277\u0279\u0003\u00b8\\\u0000\u0278\u0276\u0001\u0000\u0000"+
		"\u0000\u0278\u0277\u0001\u0000\u0000\u0000\u0279_\u0001\u0000\u0000\u0000"+
		"\u027a\u027d\u0003\u0088D\u0000\u027b\u027d\u0003\u00aeW\u0000\u027c\u027a"+
		"\u0001\u0000\u0000\u0000\u027c\u027b\u0001\u0000\u0000\u0000\u027da\u0001"+
		"\u0000\u0000\u0000\u027e\u0282\u0003\u0096K\u0000\u027f\u0282\u0003\u009a"+
		"M\u0000\u0280\u0282\u0003\u0098L\u0000\u0281\u027e\u0001\u0000\u0000\u0000"+
		"\u0281\u027f\u0001\u0000\u0000\u0000\u0281\u0280\u0001\u0000\u0000\u0000"+
		"\u0282c\u0001\u0000\u0000\u0000\u0283\u0286\u0003\u00b0X\u0000\u0284\u0286"+
		"\u0003\u00b2Y\u0000\u0285\u0283\u0001\u0000\u0000\u0000\u0285\u0284\u0001"+
		"\u0000\u0000\u0000\u0286e\u0001\u0000\u0000\u0000\u0287\u028a\u0003\u00b4"+
		"Z\u0000\u0288\u028a\u0003\u0094J\u0000\u0289\u0287\u0001\u0000\u0000\u0000"+
		"\u0289\u0288\u0001\u0000\u0000\u0000\u028ag\u0001\u0000\u0000\u0000\u028b"+
		"\u028c\u0003\u008aE\u0000\u028ci\u0001\u0000\u0000\u0000\u028d\u0291\u0003"+
		"\u009aM\u0000\u028e\u0291\u0003\u0088D\u0000\u028f\u0291\u0003\u008eG"+
		"\u0000\u0290\u028d\u0001\u0000\u0000\u0000\u0290\u028e\u0001\u0000\u0000"+
		"\u0000\u0290\u028f\u0001\u0000\u0000\u0000\u0291k\u0001\u0000\u0000\u0000"+
		"\u0292\u0295\u0003\u0088D\u0000\u0293\u0295\u0003\u009aM\u0000\u0294\u0292"+
		"\u0001\u0000\u0000\u0000\u0294\u0293\u0001\u0000\u0000\u0000\u0295m\u0001"+
		"\u0000\u0000\u0000\u0296\u0299\u0003\u008aE\u0000\u0297\u0299\u0003\u009c"+
		"N\u0000\u0298\u0296\u0001\u0000\u0000\u0000\u0298\u0297\u0001\u0000\u0000"+
		"\u0000\u0299o\u0001\u0000\u0000\u0000\u029a\u029d\u0003\u0088D\u0000\u029b"+
		"\u029d\u0003\u00aeW\u0000\u029c\u029a\u0001\u0000\u0000\u0000\u029c\u029b"+
		"\u0001\u0000\u0000\u0000\u029dq\u0001\u0000\u0000\u0000\u029e\u029f\u0003"+
		"\u00a0P\u0000\u029fs\u0001\u0000\u0000\u0000\u02a0\u02a3\u0003\u0088D"+
		"\u0000\u02a1\u02a3\u0003\u00a0P\u0000\u02a2\u02a0\u0001\u0000\u0000\u0000"+
		"\u02a2\u02a1\u0001\u0000\u0000\u0000\u02a3u\u0001\u0000\u0000\u0000\u02a4"+
		"\u02a8\u0003\u00b6[\u0000\u02a5\u02a8\u0003\u0090H\u0000\u02a6\u02a8\u0005"+
		",\u0000\u0000\u02a7\u02a4\u0001\u0000\u0000\u0000\u02a7\u02a5\u0001\u0000"+
		"\u0000\u0000\u02a7\u02a6\u0001\u0000\u0000\u0000\u02a8w\u0001\u0000\u0000"+
		"\u0000\u02a9\u02ad\u0003\u0088D\u0000\u02aa\u02ad\u0003\u008cF\u0000\u02ab"+
		"\u02ad\u0003\u008eG\u0000\u02ac\u02a9\u0001\u0000\u0000\u0000\u02ac\u02aa"+
		"\u0001\u0000\u0000\u0000\u02ac\u02ab\u0001\u0000\u0000\u0000\u02ady\u0001"+
		"\u0000\u0000\u0000\u02ae\u02b2\u0003\u009aM\u0000\u02af\u02b2\u0003\u0090"+
		"H\u0000\u02b0\u02b2\u0003\u00a2Q\u0000\u02b1\u02ae\u0001\u0000\u0000\u0000"+
		"\u02b1\u02af\u0001\u0000\u0000\u0000\u02b1\u02b0\u0001\u0000\u0000\u0000"+
		"\u02b2{\u0001\u0000\u0000\u0000\u02b3\u02b4\u0003\u0088D\u0000\u02b4}"+
		"\u0001\u0000\u0000\u0000\u02b5\u02b6\u0005.\u0000\u0000\u02b6\u02b7\u0005"+
		"Z\u0000\u0000\u02b7\u02b8\u0003\u0010\b\u0000\u02b8\u007f\u0001\u0000"+
		"\u0000\u0000\u02b9\u02ba\u0005/\u0000\u0000\u02ba\u02bb\u0005Z\u0000\u0000"+
		"\u02bb\u02bc\u00036\u001b\u0000\u02bc\u0081\u0001\u0000\u0000\u0000\u02bd"+
		"\u02be\u00050\u0000\u0000\u02be\u02bf\u0005Z\u0000\u0000\u02bf\u02c0\u0003"+
		"\u001e\u000f\u0000\u02c0\u0083\u0001\u0000\u0000\u0000\u02c1\u02c2\u0005"+
		"1\u0000\u0000\u02c2\u02c3\u0005Z\u0000\u0000\u02c3\u02c4\u0003.\u0017"+
		"\u0000\u02c4\u0085\u0001\u0000\u0000\u0000\u02c5\u02c6\u00052\u0000\u0000"+
		"\u02c6\u02c7\u0005Z\u0000\u0000\u02c7\u02c8\u00038\u001c\u0000\u02c8\u0087"+
		"\u0001\u0000\u0000\u0000\u02c9\u02ca\u00054\u0000\u0000\u02ca\u02cb\u0005"+
		"Z\u0000\u0000\u02cb\u02cc\u0003\u0010\b\u0000\u02cc\u0089\u0001\u0000"+
		"\u0000\u0000\u02cd\u02ce\u00055\u0000\u0000\u02ce\u02cf\u0005Z\u0000\u0000"+
		"\u02cf\u02d3\u0005^\u0000\u0000\u02d0\u02d2\u0003\u0010\b\u0000\u02d1"+
		"\u02d0\u0001\u0000\u0000\u0000\u02d2\u02d5\u0001\u0000\u0000\u0000\u02d3"+
		"\u02d1\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000\u0000\u0000\u02d4"+
		"\u02d6\u0001\u0000\u0000\u0000\u02d5\u02d3\u0001\u0000\u0000\u0000\u02d6"+
		"\u02d7\u0005_\u0000\u0000\u02d7\u008b\u0001\u0000\u0000\u0000\u02d8\u02d9"+
		"\u00057\u0000\u0000\u02d9\u02da\u0005Z\u0000\u0000\u02da\u02db\u0005Q"+
		"\u0000\u0000\u02db\u008d\u0001\u0000\u0000\u0000\u02dc\u02dd\u00056\u0000"+
		"\u0000\u02dd\u02de\u0005Z\u0000\u0000\u02de\u02df\u0005Q\u0000\u0000\u02df"+
		"\u008f\u0001\u0000\u0000\u0000\u02e0\u02e1\u00058\u0000\u0000\u02e1\u02e2"+
		"\u0005Z\u0000\u0000\u02e2\u02e3\u0005+\u0000\u0000\u02e3\u0091\u0001\u0000"+
		"\u0000\u0000\u02e4\u02e5\u0005C\u0000\u0000\u02e5\u02e6\u0005Z\u0000\u0000"+
		"\u02e6\u02e7\u0005Q\u0000\u0000\u02e7\u0093\u0001\u0000\u0000\u0000\u02e8"+
		"\u02e9\u0005D\u0000\u0000\u02e9\u02ea\u0005Z\u0000\u0000\u02ea\u02eb\u0005"+
		"Q\u0000\u0000\u02eb\u0095\u0001\u0000\u0000\u0000\u02ec\u02ed\u0005B\u0000"+
		"\u0000\u02ed\u02ee\u0005Z\u0000\u0000\u02ee\u02f2\u0005^\u0000\u0000\u02ef"+
		"\u02f1\u0003\u0010\b\u0000\u02f0\u02ef\u0001\u0000\u0000\u0000\u02f1\u02f4"+
		"\u0001\u0000\u0000\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000\u02f2\u02f3"+
		"\u0001\u0000\u0000\u0000\u02f3\u02f5\u0001\u0000\u0000\u0000\u02f4\u02f2"+
		"\u0001\u0000\u0000\u0000\u02f5\u02f6\u0005_\u0000\u0000\u02f6\u0097\u0001"+
		"\u0000\u0000\u0000\u02f7\u02f8\u0005A\u0000\u0000\u02f8\u02f9\u0005Z\u0000"+
		"\u0000\u02f9\u02fa\u0005R\u0000\u0000\u02fa\u0099\u0001\u0000\u0000\u0000"+
		"\u02fb\u02fc\u00053\u0000\u0000\u02fc\u02fd\u0005Z\u0000\u0000\u02fd\u02fe"+
		"\u0005+\u0000\u0000\u02fe\u009b\u0001\u0000\u0000\u0000\u02ff\u0300\u0005"+
		">\u0000\u0000\u0300\u0301\u0005Z\u0000\u0000\u0301\u0302\u0005-\u0000"+
		"\u0000\u0302\u009d\u0001\u0000\u0000\u0000\u0303\u0304\u0005?\u0000\u0000"+
		"\u0304\u0305\u0005Z\u0000\u0000\u0305\u0306\u0005-\u0000\u0000\u0306\u009f"+
		"\u0001\u0000\u0000\u0000\u0307\u0308\u0005E\u0000\u0000\u0308\u0309\u0005"+
		"Z\u0000\u0000\u0309\u030a\u0003\u0018\f\u0000\u030a\u00a1\u0001\u0000"+
		"\u0000\u0000\u030b\u030c\u0005F\u0000\u0000\u030c\u030d\u0005Z\u0000\u0000"+
		"\u030d\u030e\u0005Q\u0000\u0000\u030e\u00a3\u0001\u0000\u0000\u0000\u030f"+
		"\u0310\u0005G\u0000\u0000\u0310\u0311\u0005Z\u0000\u0000\u0311\u0312\u0005"+
		"U\u0000\u0000\u0312\u00a5\u0001\u0000\u0000\u0000\u0313\u0314\u0005I\u0000"+
		"\u0000\u0314\u0315\u0005Z\u0000\u0000\u0315\u0316\u0003\u0010\b\u0000"+
		"\u0316\u00a7\u0001\u0000\u0000\u0000\u0317\u0318\u0005H\u0000\u0000\u0318"+
		"\u0319\u0005Z\u0000\u0000\u0319\u031a\u0003\u0010\b\u0000\u031a\u00a9"+
		"\u0001\u0000\u0000\u0000\u031b\u031c\u0005J\u0000\u0000\u031c\u031d\u0005"+
		"Z\u0000\u0000\u031d\u0321\u0005^\u0000\u0000\u031e\u0320\u0003\u0010\b"+
		"\u0000\u031f\u031e\u0001\u0000\u0000\u0000\u0320\u0323\u0001\u0000\u0000"+
		"\u0000\u0321\u031f\u0001\u0000\u0000\u0000\u0321\u0322\u0001\u0000\u0000"+
		"\u0000\u0322\u0324\u0001\u0000\u0000\u0000\u0323\u0321\u0001\u0000\u0000"+
		"\u0000\u0324\u0325\u0005_\u0000\u0000\u0325\u00ab\u0001\u0000\u0000\u0000"+
		"\u0326\u0327\u0005=\u0000\u0000\u0327\u0328\u0005Z\u0000\u0000\u0328\u0329"+
		"\u0003\u0010\b\u0000\u0329\u00ad\u0001\u0000\u0000\u0000\u032a\u032b\u0005"+
		"@\u0000\u0000\u032b\u032c\u0005Z\u0000\u0000\u032c\u032d\u0005R\u0000"+
		"\u0000\u032d\u00af\u0001\u0000\u0000\u0000\u032e\u032f\u0005;\u0000\u0000"+
		"\u032f\u0330\u0005Z\u0000\u0000\u0330\u0331\u0005Q\u0000\u0000\u0331\u00b1"+
		"\u0001\u0000\u0000\u0000\u0332\u0333\u0005:\u0000\u0000\u0333\u0334\u0005"+
		"Z\u0000\u0000\u0334\u0335\u0005Q\u0000\u0000\u0335\u00b3\u0001\u0000\u0000"+
		"\u0000\u0336\u0337\u0005K\u0000\u0000\u0337\u0338\u0005Z\u0000\u0000\u0338"+
		"\u033c\u0005^\u0000\u0000\u0339\u033b\u0003\u0010\b\u0000\u033a\u0339"+
		"\u0001\u0000\u0000\u0000\u033b\u033e\u0001\u0000\u0000\u0000\u033c\u033a"+
		"\u0001\u0000\u0000\u0000\u033c\u033d\u0001\u0000\u0000\u0000\u033d\u033f"+
		"\u0001\u0000\u0000\u0000\u033e\u033c\u0001\u0000\u0000\u0000\u033f\u0340"+
		"\u0005_\u0000\u0000\u0340\u00b5\u0001\u0000\u0000\u0000\u0341\u0342\u0005"+
		"s\u0000\u0000\u0342\u0343\u0005Z\u0000\u0000\u0343\u0344\u0005Q\u0000"+
		"\u0000\u0344\u00b7\u0001\u0000\u0000\u0000\u0345\u0346\u0005M\u0000\u0000"+
		"\u0346\u0347\u0005Z\u0000\u0000\u0347\u0348\u0005\\\u0000\u0000\u0348"+
		"\u0349\u0005]\u0000\u0000\u0349\u034d\u0005`\u0000\u0000\u034a\u034c\u0003"+
		"\u00ba]\u0000\u034b\u034a\u0001\u0000\u0000\u0000\u034c\u034f\u0001\u0000"+
		"\u0000\u0000\u034d\u034b\u0001\u0000\u0000\u0000\u034d\u034e\u0001\u0000"+
		"\u0000\u0000\u034e\u0350\u0001\u0000\u0000\u0000\u034f\u034d\u0001\u0000"+
		"\u0000\u0000\u0350\u0351\u0005a\u0000\u0000\u0351\u00b9\u0001\u0000\u0000"+
		"\u0000\u0352\u0353\u0003\u00bc^\u0000\u0353\u0354\u0005Y\u0000\u0000\u0354"+
		"\u00bb\u0001\u0000\u0000\u0000\u0355\u0358\u0003\u00c0`\u0000\u0356\u0358"+
		"\u0003\u00be_\u0000\u0357\u0355\u0001\u0000\u0000\u0000\u0357\u0356\u0001"+
		"\u0000\u0000\u0000\u0358\u00bd\u0001\u0000\u0000\u0000\u0359\u035a\u0005"+
		"\u0003\u0000\u0000\u035a\u035b\u0005\\\u0000\u0000\u035b\u035c\u0003\u00c8"+
		"d\u0000\u035c\u035d\u0005]\u0000\u0000\u035d\u00bf\u0001\u0000\u0000\u0000"+
		"\u035e\u035f\u0005N\u0000\u0000\u035f\u0360\u0005[\u0000\u0000\u0360\u0361"+
		"\u0003\u00c2a\u0000\u0361\u00c1\u0001\u0000\u0000\u0000\u0362\u0365\u0003"+
		"\u00c4b\u0000\u0363\u0365\u0003\u00c6c\u0000\u0364\u0362\u0001\u0000\u0000"+
		"\u0000\u0364\u0363\u0001\u0000\u0000\u0000\u0365\u00c3\u0001\u0000\u0000"+
		"\u0000\u0366\u0367\u0005O\u0000\u0000\u0367\u0368\u0005\\\u0000\u0000"+
		"\u0368\u0369\u0003\u00c8d\u0000\u0369\u036a\u0005]\u0000\u0000\u036a\u00c5"+
		"\u0001\u0000\u0000\u0000\u036b\u036c\u0005P\u0000\u0000\u036c\u036d\u0005"+
		"\\\u0000\u0000\u036d\u036e\u0005]\u0000\u0000\u036e\u00c7\u0001\u0000"+
		"\u0000\u0000\u036f\u0370\u0005S\u0000\u0000\u0370\u0374\u0005\\\u0000"+
		"\u0000\u0371\u0373\u0003\u00cae\u0000\u0372\u0371\u0001\u0000\u0000\u0000"+
		"\u0373\u0376\u0001\u0000\u0000\u0000\u0374\u0372\u0001\u0000\u0000\u0000"+
		"\u0374\u0375\u0001\u0000\u0000\u0000\u0375\u0377\u0001\u0000\u0000\u0000"+
		"\u0376\u0374\u0001\u0000\u0000\u0000\u0377\u0378\u0005]\u0000\u0000\u0378"+
		"\u00c9\u0001\u0000\u0000\u0000\u0379\u037e\u0003\u00a4R\u0000\u037a\u037b"+
		"\u0005L\u0000\u0000\u037b\u037c\u0005Z\u0000\u0000\u037c\u037e\u0005U"+
		"\u0000\u0000\u037d\u0379\u0001\u0000\u0000\u0000\u037d\u037a\u0001\u0000"+
		"\u0000\u0000\u037e\u00cb\u0001\u0000\u0000\u0000A\u00ce\u00d8\u00e5\u00ed"+
		"\u00f5\u00fb\u0131\u0138\u0142\u014c\u0156\u0160\u016a\u0174\u017e\u0188"+
		"\u0192\u019c\u01a6\u01b0\u01ba\u01c4\u01ce\u01d8\u01e2\u01ec\u01f6\u0200"+
		"\u020a\u0214\u021e\u0228\u0232\u0242\u024a\u024e\u0254\u0258\u025e\u0265"+
		"\u026a\u026f\u0274\u0278\u027c\u0281\u0285\u0289\u0290\u0294\u0298\u029c"+
		"\u02a2\u02a7\u02ac\u02b1\u02d3\u02f2\u0321\u033c\u034d\u0357\u0364\u0374"+
		"\u037d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}