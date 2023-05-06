// Generated from C:/Users/AHMAD AL BAGHDADI/IdeaProjects/compiler_project\ParserFile.g4 by ANTLR 4.10.1
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
		SCAFFOLD=1, CONTAINER=2, INT=3, DOUBLE=4, LETTER=5, IDENTIFIER=6, ARROW=7, 
		WS=8, COMMA=9, SEMICOLON=10, COLON=11, DOT=12, OPEN_PAREN=13, CLOSE_PAREN=14, 
		OPEN_SQUARE=15, CLOSE_SQUARE=16, OPEN_BRACE=17, CLOSE_BRACE=18, PLUS=19, 
		MINUS=20, MULTIPLY=21, DIVISION=22, EQUAL=23, LARGER=24, SMALLER=25, LARGER_OR_EQUAL=26, 
		SMALLER_OR_EQUAL=27, NOT_EQUAL=28, AND=29, OR=30, NOT=31, QUOTES_SQ=32, 
		QUOTES_DQ=33, RED=34, BLUE=35, YELLOW=36, BLACK=37, WHITE=38, GREY=39, 
		GREEN=40, GOLD=41, PURBLE=42, PINK=43, ITALIC=44, NORMAL=45, SLIDER=46, 
		BODY_ATTR=47, DRAWER_ATTR=48, APP_BAR_ATTR=49, BOTTOM_NAVIGATION_BAR_ATTR=50, 
		FLOATING_ACTION_BUTTON_ATTR=51, BACKGROUNG_COLOR_ATTR=52, VALUE=53, ONCHANGED=54, 
		MAX=55, MIN=56, INACTIVE_COLOR=57, LABEL=58;
	public static final int
		RULE_widget = 0, RULE_scaffold = 1, RULE_container = 2, RULE_text = 3, 
		RULE_image = 4, RULE_listView = 5, RULE_appBar = 6, RULE_textField = 7, 
		RULE_column = 8, RULE_row = 9, RULE_card = 10, RULE_iconButton = 11, RULE_checkBox = 12, 
		RULE_radio = 13, RULE_inkWell = 14, RULE_expanded = 15, RULE_bottomNavigationBar = 16, 
		RULE_slider = 17, RULE_tabBar = 18, RULE_tabView = 19, RULE_drawer = 20, 
		RULE_floatingActionButton = 21, RULE_wrap = 22, RULE_flex = 23, RULE_textFormField = 24, 
		RULE_textButton = 25, RULE_icon = 26, RULE_scaffoldAttributes = 27, RULE_scaffoldAttrBody = 28, 
		RULE_scaffoldAttrDrawer = 29, RULE_scaffoldAttrAppBar = 30, RULE_scaffoldAttrBottomNavigationBar = 31, 
		RULE_scaffoldAttrFloatingActionButton = 32, RULE_containerAttributes = 33, 
		RULE_sliderAttributes = 34, RULE_backGroundColorAttr = 35, RULE_childAttr = 36, 
		RULE_widthAttr = 37, RULE_heightAttr = 38, RULE_colorAttr = 39, RULE_decorationAttr = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"widget", "scaffold", "container", "text", "image", "listView", "appBar", 
			"textField", "column", "row", "card", "iconButton", "checkBox", "radio", 
			"inkWell", "expanded", "bottomNavigationBar", "slider", "tabBar", "tabView", 
			"drawer", "floatingActionButton", "wrap", "flex", "textFormField", "textButton", 
			"icon", "scaffoldAttributes", "scaffoldAttrBody", "scaffoldAttrDrawer", 
			"scaffoldAttrAppBar", "scaffoldAttrBottomNavigationBar", "scaffoldAttrFloatingActionButton", 
			"containerAttributes", "sliderAttributes", "backGroundColorAttr", "childAttr", 
			"widthAttr", "heightAttr", "colorAttr", "decorationAttr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Scaffold'", "'Container'", null, null, null, null, "'=>'", null, 
			"','", null, "':'", "'.'", null, null, "'['", "']'", "'{'", "'}'", "'+'", 
			"'-'", "'*'", "'/'", "'='", "'>'", "'<'", "'>='", "'<='", "'!='", "'&&'", 
			"'||'", "'!'", "''''", "'\"\"'", "'red'", "'blue'", "'yellow'", "'black'", 
			"'white'", "'grey'", "'green'", "'gold'", "'purble'", "'pink'", "'italic'", 
			"'normal'", "'Slider'", "'body'", "'drawer'", "'appBar'", "'bottonNavigationBar'", 
			"'floatinActionButton'", "'backgroundColor'", "'value'", "'onChanged'", 
			"'max'", "'min'", "'inactiveColor'", "'label'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SCAFFOLD", "CONTAINER", "INT", "DOUBLE", "LETTER", "IDENTIFIER", 
			"ARROW", "WS", "COMMA", "SEMICOLON", "COLON", "DOT", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_SQUARE", "CLOSE_SQUARE", "OPEN_BRACE", "CLOSE_BRACE", "PLUS", "MINUS", 
			"MULTIPLY", "DIVISION", "EQUAL", "LARGER", "SMALLER", "LARGER_OR_EQUAL", 
			"SMALLER_OR_EQUAL", "NOT_EQUAL", "AND", "OR", "NOT", "QUOTES_SQ", "QUOTES_DQ", 
			"RED", "BLUE", "YELLOW", "BLACK", "WHITE", "GREY", "GREEN", "GOLD", "PURBLE", 
			"PINK", "ITALIC", "NORMAL", "SLIDER", "BODY_ATTR", "DRAWER_ATTR", "APP_BAR_ATTR", 
			"BOTTOM_NAVIGATION_BAR_ATTR", "FLOATING_ACTION_BUTTON_ATTR", "BACKGROUNG_COLOR_ATTR", 
			"VALUE", "ONCHANGED", "MAX", "MIN", "INACTIVE_COLOR", "LABEL"
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
		public CheckBoxContext checkBox() {
			return getRuleContext(CheckBoxContext.class,0);
		}
		public RadioContext radio() {
			return getRuleContext(RadioContext.class,0);
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
		public TabViewContext tabView() {
			return getRuleContext(TabViewContext.class,0);
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
		enterRule(_localctx, 0, RULE_widget);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				scaffold();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				container();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				text();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				image();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				listView();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				appBar();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				textField();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(89);
				column();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(90);
				row();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(91);
				card();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(92);
				iconButton();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(93);
				checkBox();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(94);
				radio();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(95);
				inkWell();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(96);
				expanded();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(97);
				bottomNavigationBar();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(98);
				slider();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(99);
				tabBar();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(100);
				tabView();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(101);
				drawer();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(102);
				floatingActionButton();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(103);
				wrap();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(104);
				flex();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(105);
				textFormField();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(106);
				textButton();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(107);
				icon();
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
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<ScaffoldAttributesContext> scaffoldAttributes() {
			return getRuleContexts(ScaffoldAttributesContext.class);
		}
		public ScaffoldAttributesContext scaffoldAttributes(int i) {
			return getRuleContext(ScaffoldAttributesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
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
		enterRule(_localctx, 2, RULE_scaffold);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(SCAFFOLD);
			setState(111);
			match(OPEN_PAREN);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(112);
					scaffoldAttributes();
					setState(113);
					match(COMMA);
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BODY_ATTR) | (1L << DRAWER_ATTR) | (1L << APP_BAR_ATTR) | (1L << BOTTOM_NAVIGATION_BAR_ATTR) | (1L << FLOATING_ACTION_BUTTON_ATTR) | (1L << BACKGROUNG_COLOR_ATTR))) != 0)) {
				{
				setState(120);
				scaffoldAttributes();
				}
			}

			setState(123);
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
		public List<ContainerAttributesContext> containerAttributes() {
			return getRuleContexts(ContainerAttributesContext.class);
		}
		public ContainerAttributesContext containerAttributes(int i) {
			return getRuleContext(ContainerAttributesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
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
		enterRule(_localctx, 4, RULE_container);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(CONTAINER);
			setState(126);
			match(OPEN_PAREN);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(127);
				containerAttributes();
				setState(128);
				match(COMMA);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(135);
				containerAttributes();
				}
				break;
			}
			setState(138);
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
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
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
		enterRule(_localctx, 6, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
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
		enterRule(_localctx, 8, RULE_image);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
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
		enterRule(_localctx, 10, RULE_listView);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
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
			setState(146);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
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
		enterRule(_localctx, 14, RULE_textField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
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
		enterRule(_localctx, 16, RULE_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
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
		enterRule(_localctx, 18, RULE_row);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
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
		enterRule(_localctx, 20, RULE_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
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
		enterRule(_localctx, 22, RULE_iconButton);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckBoxContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public CheckBoxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkBox; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCheckBox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCheckBox(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCheckBox(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckBoxContext checkBox() throws RecognitionException {
		CheckBoxContext _localctx = new CheckBoxContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_checkBox);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RadioContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public RadioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_radio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterRadio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitRadio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitRadio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RadioContext radio() throws RecognitionException {
		RadioContext _localctx = new RadioContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_radio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
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
		enterRule(_localctx, 28, RULE_inkWell);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
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
		enterRule(_localctx, 30, RULE_expanded);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
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
		enterRule(_localctx, 32, RULE_bottomNavigationBar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
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
		public SliderAttributesContext sliderAttributes() {
			return getRuleContext(SliderAttributesContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
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
		enterRule(_localctx, 34, RULE_slider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(SLIDER);
			setState(169);
			match(OPEN_PAREN);
			setState(170);
			sliderAttributes();
			setState(171);
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
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
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
		enterRule(_localctx, 36, RULE_tabBar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TabViewContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TabViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTabView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTabView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTabView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabViewContext tabView() throws RecognitionException {
		TabViewContext _localctx = new TabViewContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tabView);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
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
		enterRule(_localctx, 40, RULE_drawer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
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
		enterRule(_localctx, 42, RULE_floatingActionButton);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
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
		enterRule(_localctx, 44, RULE_wrap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
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
		enterRule(_localctx, 46, RULE_flex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
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
		enterRule(_localctx, 48, RULE_textFormField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
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
		enterRule(_localctx, 50, RULE_textButton);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
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
		enterRule(_localctx, 52, RULE_icon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScaffoldAttributesContext extends ParserRuleContext {
		public ScaffoldAttrBodyContext scaffoldAttrBody() {
			return getRuleContext(ScaffoldAttrBodyContext.class,0);
		}
		public ScaffoldAttrDrawerContext scaffoldAttrDrawer() {
			return getRuleContext(ScaffoldAttrDrawerContext.class,0);
		}
		public ScaffoldAttrAppBarContext scaffoldAttrAppBar() {
			return getRuleContext(ScaffoldAttrAppBarContext.class,0);
		}
		public ScaffoldAttrBottomNavigationBarContext scaffoldAttrBottomNavigationBar() {
			return getRuleContext(ScaffoldAttrBottomNavigationBarContext.class,0);
		}
		public ScaffoldAttrFloatingActionButtonContext scaffoldAttrFloatingActionButton() {
			return getRuleContext(ScaffoldAttrFloatingActionButtonContext.class,0);
		}
		public BackGroundColorAttrContext backGroundColorAttr() {
			return getRuleContext(BackGroundColorAttrContext.class,0);
		}
		public ScaffoldAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffoldAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterScaffoldAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitScaffoldAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitScaffoldAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaffoldAttributesContext scaffoldAttributes() throws RecognitionException {
		ScaffoldAttributesContext _localctx = new ScaffoldAttributesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_scaffoldAttributes);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BODY_ATTR:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				scaffoldAttrBody();
				}
				break;
			case DRAWER_ATTR:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				scaffoldAttrDrawer();
				}
				break;
			case APP_BAR_ATTR:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				scaffoldAttrAppBar();
				}
				break;
			case BOTTOM_NAVIGATION_BAR_ATTR:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				scaffoldAttrBottomNavigationBar();
				}
				break;
			case FLOATING_ACTION_BUTTON_ATTR:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				scaffoldAttrFloatingActionButton();
				}
				break;
			case BACKGROUNG_COLOR_ATTR:
				enterOuterAlt(_localctx, 6);
				{
				setState(196);
				backGroundColorAttr();
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

	public static class ScaffoldAttrBodyContext extends ParserRuleContext {
		public TerminalNode BODY_ATTR() { return getToken(ParserFile.BODY_ATTR, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public ScaffoldAttrBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffoldAttrBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterScaffoldAttrBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitScaffoldAttrBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitScaffoldAttrBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaffoldAttrBodyContext scaffoldAttrBody() throws RecognitionException {
		ScaffoldAttrBodyContext _localctx = new ScaffoldAttrBodyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_scaffoldAttrBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(BODY_ATTR);
			setState(200);
			match(COLON);
			setState(201);
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

	public static class ScaffoldAttrDrawerContext extends ParserRuleContext {
		public TerminalNode DRAWER_ATTR() { return getToken(ParserFile.DRAWER_ATTR, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public DrawerContext drawer() {
			return getRuleContext(DrawerContext.class,0);
		}
		public ScaffoldAttrDrawerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffoldAttrDrawer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterScaffoldAttrDrawer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitScaffoldAttrDrawer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitScaffoldAttrDrawer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaffoldAttrDrawerContext scaffoldAttrDrawer() throws RecognitionException {
		ScaffoldAttrDrawerContext _localctx = new ScaffoldAttrDrawerContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_scaffoldAttrDrawer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(DRAWER_ATTR);
			setState(204);
			match(COLON);
			setState(205);
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

	public static class ScaffoldAttrAppBarContext extends ParserRuleContext {
		public TerminalNode APP_BAR_ATTR() { return getToken(ParserFile.APP_BAR_ATTR, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public AppBarContext appBar() {
			return getRuleContext(AppBarContext.class,0);
		}
		public ScaffoldAttrAppBarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffoldAttrAppBar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterScaffoldAttrAppBar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitScaffoldAttrAppBar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitScaffoldAttrAppBar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaffoldAttrAppBarContext scaffoldAttrAppBar() throws RecognitionException {
		ScaffoldAttrAppBarContext _localctx = new ScaffoldAttrAppBarContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_scaffoldAttrAppBar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(APP_BAR_ATTR);
			setState(208);
			match(COLON);
			setState(209);
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

	public static class ScaffoldAttrBottomNavigationBarContext extends ParserRuleContext {
		public TerminalNode BOTTOM_NAVIGATION_BAR_ATTR() { return getToken(ParserFile.BOTTOM_NAVIGATION_BAR_ATTR, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public BottomNavigationBarContext bottomNavigationBar() {
			return getRuleContext(BottomNavigationBarContext.class,0);
		}
		public ScaffoldAttrBottomNavigationBarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffoldAttrBottomNavigationBar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterScaffoldAttrBottomNavigationBar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitScaffoldAttrBottomNavigationBar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitScaffoldAttrBottomNavigationBar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaffoldAttrBottomNavigationBarContext scaffoldAttrBottomNavigationBar() throws RecognitionException {
		ScaffoldAttrBottomNavigationBarContext _localctx = new ScaffoldAttrBottomNavigationBarContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_scaffoldAttrBottomNavigationBar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(BOTTOM_NAVIGATION_BAR_ATTR);
			setState(212);
			match(COLON);
			setState(213);
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

	public static class ScaffoldAttrFloatingActionButtonContext extends ParserRuleContext {
		public TerminalNode FLOATING_ACTION_BUTTON_ATTR() { return getToken(ParserFile.FLOATING_ACTION_BUTTON_ATTR, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public FloatingActionButtonContext floatingActionButton() {
			return getRuleContext(FloatingActionButtonContext.class,0);
		}
		public ScaffoldAttrFloatingActionButtonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffoldAttrFloatingActionButton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterScaffoldAttrFloatingActionButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitScaffoldAttrFloatingActionButton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitScaffoldAttrFloatingActionButton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaffoldAttrFloatingActionButtonContext scaffoldAttrFloatingActionButton() throws RecognitionException {
		ScaffoldAttrFloatingActionButtonContext _localctx = new ScaffoldAttrFloatingActionButtonContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_scaffoldAttrFloatingActionButton);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(FLOATING_ACTION_BUTTON_ATTR);
			setState(216);
			match(COLON);
			setState(217);
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

	public static class ContainerAttributesContext extends ParserRuleContext {
		public ChildAttrContext childAttr() {
			return getRuleContext(ChildAttrContext.class,0);
		}
		public WidthAttrContext widthAttr() {
			return getRuleContext(WidthAttrContext.class,0);
		}
		public HeightAttrContext heightAttr() {
			return getRuleContext(HeightAttrContext.class,0);
		}
		public ColorAttrContext colorAttr() {
			return getRuleContext(ColorAttrContext.class,0);
		}
		public DecorationAttrContext decorationAttr() {
			return getRuleContext(DecorationAttrContext.class,0);
		}
		public ContainerAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterContainerAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitContainerAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitContainerAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerAttributesContext containerAttributes() throws RecognitionException {
		ContainerAttributesContext _localctx = new ContainerAttributesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_containerAttributes);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				childAttr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				widthAttr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				heightAttr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				colorAttr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				decorationAttr();
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

	public static class SliderAttributesContext extends ParserRuleContext {
		public SliderAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliderAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSliderAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSliderAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSliderAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliderAttributesContext sliderAttributes() throws RecognitionException {
		SliderAttributesContext _localctx = new SliderAttributesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_sliderAttributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BackGroundColorAttrContext extends ParserRuleContext {
		public TerminalNode BACKGROUNG_COLOR_ATTR() { return getToken(ParserFile.BACKGROUNG_COLOR_ATTR, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public BackGroundColorAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backGroundColorAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBackGroundColorAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBackGroundColorAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBackGroundColorAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackGroundColorAttrContext backGroundColorAttr() throws RecognitionException {
		BackGroundColorAttrContext _localctx = new BackGroundColorAttrContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_backGroundColorAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(BACKGROUNG_COLOR_ATTR);
			setState(229);
			match(COLON);
			setState(230);
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

	public static class ChildAttrContext extends ParserRuleContext {
		public ChildAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterChildAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitChildAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitChildAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildAttrContext childAttr() throws RecognitionException {
		ChildAttrContext _localctx = new ChildAttrContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_childAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidthAttrContext extends ParserRuleContext {
		public WidthAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widthAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterWidthAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitWidthAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitWidthAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthAttrContext widthAttr() throws RecognitionException {
		WidthAttrContext _localctx = new WidthAttrContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_widthAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeightAttrContext extends ParserRuleContext {
		public HeightAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heightAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHeightAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHeightAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHeightAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeightAttrContext heightAttr() throws RecognitionException {
		HeightAttrContext _localctx = new HeightAttrContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_heightAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColorAttrContext extends ParserRuleContext {
		public ColorAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterColorAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitColorAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitColorAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorAttrContext colorAttr() throws RecognitionException {
		ColorAttrContext _localctx = new ColorAttrContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_colorAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecorationAttrContext extends ParserRuleContext {
		public DecorationAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorationAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterDecorationAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitDecorationAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitDecorationAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecorationAttrContext decorationAttr() throws RecognitionException {
		DecorationAttrContext _localctx = new DecorationAttrContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_decorationAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
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
		"\u0004\u0001:\u00f3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000m\b\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001t\b\u0001\n\u0001"+
		"\f\u0001w\t\u0001\u0001\u0001\u0003\u0001z\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"\u0083\b\u0002\n\u0002\f\u0002\u0086\t\u0002\u0001\u0002\u0003\u0002\u0089"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u00c6\b\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0003!\u00e1\b!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001(\u0000\u0000)\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNP\u0000\u0000"+
		"\u00ef\u0000l\u0001\u0000\u0000\u0000\u0002n\u0001\u0000\u0000\u0000\u0004"+
		"}\u0001\u0000\u0000\u0000\u0006\u008c\u0001\u0000\u0000\u0000\b\u008e"+
		"\u0001\u0000\u0000\u0000\n\u0090\u0001\u0000\u0000\u0000\f\u0092\u0001"+
		"\u0000\u0000\u0000\u000e\u0094\u0001\u0000\u0000\u0000\u0010\u0096\u0001"+
		"\u0000\u0000\u0000\u0012\u0098\u0001\u0000\u0000\u0000\u0014\u009a\u0001"+
		"\u0000\u0000\u0000\u0016\u009c\u0001\u0000\u0000\u0000\u0018\u009e\u0001"+
		"\u0000\u0000\u0000\u001a\u00a0\u0001\u0000\u0000\u0000\u001c\u00a2\u0001"+
		"\u0000\u0000\u0000\u001e\u00a4\u0001\u0000\u0000\u0000 \u00a6\u0001\u0000"+
		"\u0000\u0000\"\u00a8\u0001\u0000\u0000\u0000$\u00ad\u0001\u0000\u0000"+
		"\u0000&\u00af\u0001\u0000\u0000\u0000(\u00b1\u0001\u0000\u0000\u0000*"+
		"\u00b3\u0001\u0000\u0000\u0000,\u00b5\u0001\u0000\u0000\u0000.\u00b7\u0001"+
		"\u0000\u0000\u00000\u00b9\u0001\u0000\u0000\u00002\u00bb\u0001\u0000\u0000"+
		"\u00004\u00bd\u0001\u0000\u0000\u00006\u00c5\u0001\u0000\u0000\u00008"+
		"\u00c7\u0001\u0000\u0000\u0000:\u00cb\u0001\u0000\u0000\u0000<\u00cf\u0001"+
		"\u0000\u0000\u0000>\u00d3\u0001\u0000\u0000\u0000@\u00d7\u0001\u0000\u0000"+
		"\u0000B\u00e0\u0001\u0000\u0000\u0000D\u00e2\u0001\u0000\u0000\u0000F"+
		"\u00e4\u0001\u0000\u0000\u0000H\u00e8\u0001\u0000\u0000\u0000J\u00ea\u0001"+
		"\u0000\u0000\u0000L\u00ec\u0001\u0000\u0000\u0000N\u00ee\u0001\u0000\u0000"+
		"\u0000P\u00f0\u0001\u0000\u0000\u0000Rm\u0003\u0002\u0001\u0000Sm\u0003"+
		"\u0004\u0002\u0000Tm\u0003\u0006\u0003\u0000Um\u0003\b\u0004\u0000Vm\u0003"+
		"\n\u0005\u0000Wm\u0003\f\u0006\u0000Xm\u0003\u000e\u0007\u0000Ym\u0003"+
		"\u0010\b\u0000Zm\u0003\u0012\t\u0000[m\u0003\u0014\n\u0000\\m\u0003\u0016"+
		"\u000b\u0000]m\u0003\u0018\f\u0000^m\u0003\u001a\r\u0000_m\u0003\u001c"+
		"\u000e\u0000`m\u0003\u001e\u000f\u0000am\u0003 \u0010\u0000bm\u0003\""+
		"\u0011\u0000cm\u0003$\u0012\u0000dm\u0003&\u0013\u0000em\u0003(\u0014"+
		"\u0000fm\u0003*\u0015\u0000gm\u0003,\u0016\u0000hm\u0003.\u0017\u0000"+
		"im\u00030\u0018\u0000jm\u00032\u0019\u0000km\u00034\u001a\u0000lR\u0001"+
		"\u0000\u0000\u0000lS\u0001\u0000\u0000\u0000lT\u0001\u0000\u0000\u0000"+
		"lU\u0001\u0000\u0000\u0000lV\u0001\u0000\u0000\u0000lW\u0001\u0000\u0000"+
		"\u0000lX\u0001\u0000\u0000\u0000lY\u0001\u0000\u0000\u0000lZ\u0001\u0000"+
		"\u0000\u0000l[\u0001\u0000\u0000\u0000l\\\u0001\u0000\u0000\u0000l]\u0001"+
		"\u0000\u0000\u0000l^\u0001\u0000\u0000\u0000l_\u0001\u0000\u0000\u0000"+
		"l`\u0001\u0000\u0000\u0000la\u0001\u0000\u0000\u0000lb\u0001\u0000\u0000"+
		"\u0000lc\u0001\u0000\u0000\u0000ld\u0001\u0000\u0000\u0000le\u0001\u0000"+
		"\u0000\u0000lf\u0001\u0000\u0000\u0000lg\u0001\u0000\u0000\u0000lh\u0001"+
		"\u0000\u0000\u0000li\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000"+
		"lk\u0001\u0000\u0000\u0000m\u0001\u0001\u0000\u0000\u0000no\u0005\u0001"+
		"\u0000\u0000ou\u0005\r\u0000\u0000pq\u00036\u001b\u0000qr\u0005\t\u0000"+
		"\u0000rt\u0001\u0000\u0000\u0000sp\u0001\u0000\u0000\u0000tw\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vy\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xz\u00036\u001b\u0000yx\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{|\u0005\u000e\u0000\u0000|\u0003\u0001\u0000\u0000\u0000}~\u0005\u0002"+
		"\u0000\u0000~\u0084\u0005\r\u0000\u0000\u007f\u0080\u0003B!\u0000\u0080"+
		"\u0081\u0005\t\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082\u007f"+
		"\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0088"+
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0089"+
		"\u0003B!\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u000e"+
		"\u0000\u0000\u008b\u0005\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u000b"+
		"\u0000\u0000\u008d\u0007\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u000b"+
		"\u0000\u0000\u008f\t\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u000b\u0000"+
		"\u0000\u0091\u000b\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u000b\u0000"+
		"\u0000\u0093\r\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u000b\u0000\u0000"+
		"\u0095\u000f\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u000b\u0000\u0000"+
		"\u0097\u0011\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u000b\u0000\u0000"+
		"\u0099\u0013\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u000b\u0000\u0000"+
		"\u009b\u0015\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u000b\u0000\u0000"+
		"\u009d\u0017\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u000b\u0000\u0000"+
		"\u009f\u0019\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u000b\u0000\u0000"+
		"\u00a1\u001b\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u000b\u0000\u0000"+
		"\u00a3\u001d\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u000b\u0000\u0000"+
		"\u00a5\u001f\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u000b\u0000\u0000"+
		"\u00a7!\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005.\u0000\u0000\u00a9\u00aa"+
		"\u0005\r\u0000\u0000\u00aa\u00ab\u0003D\"\u0000\u00ab\u00ac\u0005\u000e"+
		"\u0000\u0000\u00ac#\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u000b\u0000"+
		"\u0000\u00ae%\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u000b\u0000\u0000"+
		"\u00b0\'\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u000b\u0000\u0000\u00b2"+
		")\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u000b\u0000\u0000\u00b4+\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0005\u000b\u0000\u0000\u00b6-\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0005\u000b\u0000\u0000\u00b8/\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0005\u000b\u0000\u0000\u00ba1\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0005\u000b\u0000\u0000\u00bc3\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0005\u000b\u0000\u0000\u00be5\u0001\u0000\u0000\u0000\u00bf\u00c6"+
		"\u00038\u001c\u0000\u00c0\u00c6\u0003:\u001d\u0000\u00c1\u00c6\u0003<"+
		"\u001e\u0000\u00c2\u00c6\u0003>\u001f\u0000\u00c3\u00c6\u0003@ \u0000"+
		"\u00c4\u00c6\u0003F#\u0000\u00c5\u00bf\u0001\u0000\u0000\u0000\u00c5\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c1\u0001\u0000\u0000\u0000\u00c5\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c67\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005"+
		"/\u0000\u0000\u00c8\u00c9\u0005\u000b\u0000\u0000\u00c9\u00ca\u0003\u0000"+
		"\u0000\u0000\u00ca9\u0001\u0000\u0000\u0000\u00cb\u00cc\u00050\u0000\u0000"+
		"\u00cc\u00cd\u0005\u000b\u0000\u0000\u00cd\u00ce\u0003(\u0014\u0000\u00ce"+
		";\u0001\u0000\u0000\u0000\u00cf\u00d0\u00051\u0000\u0000\u00d0\u00d1\u0005"+
		"\u000b\u0000\u0000\u00d1\u00d2\u0003\f\u0006\u0000\u00d2=\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u00052\u0000\u0000\u00d4\u00d5\u0005\u000b\u0000"+
		"\u0000\u00d5\u00d6\u0003 \u0010\u0000\u00d6?\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u00053\u0000\u0000\u00d8\u00d9\u0005\u000b\u0000\u0000\u00d9\u00da"+
		"\u0003*\u0015\u0000\u00daA\u0001\u0000\u0000\u0000\u00db\u00e1\u0003H"+
		"$\u0000\u00dc\u00e1\u0003J%\u0000\u00dd\u00e1\u0003L&\u0000\u00de\u00e1"+
		"\u0003N\'\u0000\u00df\u00e1\u0003P(\u0000\u00e0\u00db\u0001\u0000\u0000"+
		"\u0000\u00e0\u00dc\u0001\u0000\u0000\u0000\u00e0\u00dd\u0001\u0000\u0000"+
		"\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00df\u0001\u0000\u0000"+
		"\u0000\u00e1C\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e3E\u0001\u0000\u0000\u0000\u00e4\u00e5\u00054\u0000\u0000\u00e5\u00e6"+
		"\u0005\u000b\u0000\u0000\u00e6\u00e7\u0003\u0000\u0000\u0000\u00e7G\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9I\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00ebK\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00edM\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0001\u0000\u0000\u0000\u00efO\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f1Q\u0001\u0000\u0000\u0000\u0007lu"+
		"y\u0084\u0088\u00c5\u00e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}