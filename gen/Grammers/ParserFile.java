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
		SCAFFOLD=1, CONTAINER=2, ROW=3, COLUMN=4, LIST_VIEW=5, SIZED_BOX=6, EXPANDED=7, 
		CARD=8, ICON_BUTTON=9, ICON=10, SLIDER=11, DRAWER=12, WRAP=13, FLEX=14, 
		TEXT_BUTTON=15, TEXT=16, IMAGE=17, APP_BAR=18, TEXT_FIELD=19, CHECK_BOX=20, 
		RADIO=21, INK_WELL=22, BOTTOM_NAVIGATION_BAR=23, TAB_BAR=24, TAB_BAR_VIEW=25, 
		FLOATING_ACTION_BUTTON=26, TEXT_FORM_FIELD=27, TEXT_STYLE=28, RED=29, 
		BLUE=30, YELLOW=31, BLACK=32, WHITE=33, GREY=34, GREEN=35, GOLD=36, PURBLE=37, 
		PINK=38, START=39, END=40, CENTER=41, BODY=42, DRAWER_ARG=43, APP_BAR_ARG=44, 
		BOTTOM_NAVIGATION_BAR_ARG=45, FLOATING_ACTION_BUTTON_ARG=46, BACKGROUND_COLOR=47, 
		CHILD=48, CHILDREN=49, WIDTH=50, HEIGHT=51, COLOR=52, VALUE=53, MAX=54, 
		MIN=55, LABEL=56, ICON_ARG=57, CROSS_AXIS_ALIGNMENT=58, MAIN_AXIS_ALIGNMENT=59, 
		FLEX_ARG=60, CURRENT_INDEX=61, ITEMS=62, MARGIN=63, PADDING=64, STYLE=65, 
		FONT_SIZE=66, IMAGE_ARG=67, TITLE=68, LEADING=69, ACTIONS=70, TABS=71, 
		INT=72, DOUBLE=73, ID=74, FLOAT=75, STRING=76, IDENTIFIER=77, ARROW=78, 
		WS=79, COMMA=80, SEMICOLON=81, COLON=82, DOT=83, OPEN_PAREN=84, CLOSE_PAREN=85, 
		OPEN_SQUARE=86, CLOSE_SQUARE=87, OPEN_BRACE=88, CLOSE_BRACE=89, PLUS=90, 
		MINUS=91, MULTIPLY=92, DIVISION=93, EQUAL=94, LARGER=95, SMALLER=96, LARGER_OR_EQUAL=97, 
		SMALLER_OR_EQUAL=98, NOT_EQUAL=99, AND=100, OR=101, NOT=102, QUOTES_SQ=103, 
		QUOTES_DQ=104, PRINT=105, SIZE=106;
	public static final int
		RULE_widget = 0, RULE_scaffold = 1, RULE_container = 2, RULE_text = 3, 
		RULE_textStyle = 4, RULE_image = 5, RULE_listView = 6, RULE_appBar = 7, 
		RULE_textField = 8, RULE_column = 9, RULE_row = 10, RULE_card = 11, RULE_iconButton = 12, 
		RULE_inkWell = 13, RULE_expanded = 14, RULE_bottomNavigationBar = 15, 
		RULE_slider = 16, RULE_tabBar = 17, RULE_tabBarView = 18, RULE_drawer = 19, 
		RULE_floatingActionButton = 20, RULE_wrap = 21, RULE_flex = 22, RULE_textFormField = 23, 
		RULE_textButton = 24, RULE_icon = 25, RULE_sizedBox = 26, RULE_scaffoldArgs = 27, 
		RULE_containerArgs = 28, RULE_textArgs = 29, RULE_imageArgs = 30, RULE_listviewArgs = 31, 
		RULE_appBarArgs = 32, RULE_textFieldArgs = 33, RULE_columnArgs = 34, RULE_rowArgs = 35, 
		RULE_cardArgs = 36, RULE_iconButtonArgs = 37, RULE_inkwellArgs = 38, RULE_expandedArgs = 39, 
		RULE_bottomNavigationBarArgs = 40, RULE_sliderArgs = 41, RULE_tabBarArgs = 42, 
		RULE_tabBarViewArgs = 43, RULE_drawerArgs = 44, RULE_floatingActionButtonArgs = 45, 
		RULE_wrapArgs = 46, RULE_flexArgs = 47, RULE_textFormFieldArgs = 48, RULE_textButtonArgs = 49, 
		RULE_iconArgs = 50, RULE_sizedBoxArgs = 51, RULE_textStyleArgs = 52, RULE_body = 53, 
		RULE_drawerArg = 54, RULE_appBarArg = 55, RULE_bottomNavigationBarArg = 56, 
		RULE_floatingActionButtonArg = 57, RULE_child = 58, RULE_children = 59, 
		RULE_height = 60, RULE_width = 61, RULE_color = 62, RULE_margin = 63, 
		RULE_padding = 64, RULE_items = 65, RULE_currentIndex = 66, RULE_backGroundColor = 67, 
		RULE_crossAxis = 68, RULE_mainAxis = 69, RULE_style = 70, RULE_fontSize = 71, 
		RULE_imageArg = 72, RULE_leading = 73, RULE_title = 74, RULE_actions = 75, 
		RULE_iconArg = 76, RULE_flexArg = 77, RULE_min = 78, RULE_max = 79, RULE_tabs = 80, 
		RULE_size = 81, RULE_colors = 82, RULE_axisValues = 83;
	private static String[] makeRuleNames() {
		return new String[] {
			"widget", "scaffold", "container", "text", "textStyle", "image", "listView", 
			"appBar", "textField", "column", "row", "card", "iconButton", "inkWell", 
			"expanded", "bottomNavigationBar", "slider", "tabBar", "tabBarView", 
			"drawer", "floatingActionButton", "wrap", "flex", "textFormField", "textButton", 
			"icon", "sizedBox", "scaffoldArgs", "containerArgs", "textArgs", "imageArgs", 
			"listviewArgs", "appBarArgs", "textFieldArgs", "columnArgs", "rowArgs", 
			"cardArgs", "iconButtonArgs", "inkwellArgs", "expandedArgs", "bottomNavigationBarArgs", 
			"sliderArgs", "tabBarArgs", "tabBarViewArgs", "drawerArgs", "floatingActionButtonArgs", 
			"wrapArgs", "flexArgs", "textFormFieldArgs", "textButtonArgs", "iconArgs", 
			"sizedBoxArgs", "textStyleArgs", "body", "drawerArg", "appBarArg", "bottomNavigationBarArg", 
			"floatingActionButtonArg", "child", "children", "height", "width", "color", 
			"margin", "padding", "items", "currentIndex", "backGroundColor", "crossAxis", 
			"mainAxis", "style", "fontSize", "imageArg", "leading", "title", "actions", 
			"iconArg", "flexArg", "min", "max", "tabs", "size", "colors", "axisValues"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Scaffold'", "'Container'", "'Row'", "'Column'", "'ListView'", 
			"'SizedBox'", "'Expanded'", "'Card'", "'IconButton'", "'Icon'", "'Slider'", 
			"'Drawer'", "'Wrap'", "'Flex'", "'TextButton'", "'Text'", "'Image'", 
			"'AppBar'", "'TextField'", "'CheckBox'", "'Radio'", "'InkWell'", "'BottomNavigationBar'", 
			"'TabBar'", "'TabBarView'", "'FloatingActionButton'", "'TextFormField'", 
			"'TextStyle'", "'red'", "'blue'", "'yellow'", "'black'", "'white'", "'grey'", 
			"'green'", "'gold'", "'purble'", "'pink'", "'start'", "'end'", "'center'", 
			"'body'", "'drawer'", "'appBar'", "'bottomNavigationBar'", "'floatingActionButton'", 
			"'backgroundColor'", "'child'", "'children'", "'width'", "'height'", 
			"'color'", "'value'", "'max'", "'min'", "'label'", "'icon'", "'crossAxisAlignment'", 
			"'mainAxisAlignment'", "'flex'", "'currentIndex'", "'items'", "'margin'", 
			"'padding'", "'style'", "'fontSize'", "'image'", "'title'", "'leading'", 
			"'actions'", "'tabs'", null, null, null, null, null, null, "'=>'", null, 
			"','", null, "':'", "'.'", null, null, "'['", "']'", "'{'", "'}'", "'+'", 
			"'-'", "'*'", "'/'", "'='", "'>'", "'<'", "'>='", "'<='", "'!='", "'&&'", 
			"'||'", "'!'", "''''", "'\"\"'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SCAFFOLD", "CONTAINER", "ROW", "COLUMN", "LIST_VIEW", "SIZED_BOX", 
			"EXPANDED", "CARD", "ICON_BUTTON", "ICON", "SLIDER", "DRAWER", "WRAP", 
			"FLEX", "TEXT_BUTTON", "TEXT", "IMAGE", "APP_BAR", "TEXT_FIELD", "CHECK_BOX", 
			"RADIO", "INK_WELL", "BOTTOM_NAVIGATION_BAR", "TAB_BAR", "TAB_BAR_VIEW", 
			"FLOATING_ACTION_BUTTON", "TEXT_FORM_FIELD", "TEXT_STYLE", "RED", "BLUE", 
			"YELLOW", "BLACK", "WHITE", "GREY", "GREEN", "GOLD", "PURBLE", "PINK", 
			"START", "END", "CENTER", "BODY", "DRAWER_ARG", "APP_BAR_ARG", "BOTTOM_NAVIGATION_BAR_ARG", 
			"FLOATING_ACTION_BUTTON_ARG", "BACKGROUND_COLOR", "CHILD", "CHILDREN", 
			"WIDTH", "HEIGHT", "COLOR", "VALUE", "MAX", "MIN", "LABEL", "ICON_ARG", 
			"CROSS_AXIS_ALIGNMENT", "MAIN_AXIS_ALIGNMENT", "FLEX_ARG", "CURRENT_INDEX", 
			"ITEMS", "MARGIN", "PADDING", "STYLE", "FONT_SIZE", "IMAGE_ARG", "TITLE", 
			"LEADING", "ACTIONS", "TABS", "INT", "DOUBLE", "ID", "FLOAT", "STRING", 
			"IDENTIFIER", "ARROW", "WS", "COMMA", "SEMICOLON", "COLON", "DOT", "OPEN_PAREN", 
			"CLOSE_PAREN", "OPEN_SQUARE", "CLOSE_SQUARE", "OPEN_BRACE", "CLOSE_BRACE", 
			"PLUS", "MINUS", "MULTIPLY", "DIVISION", "EQUAL", "LARGER", "SMALLER", 
			"LARGER_OR_EQUAL", "SMALLER_OR_EQUAL", "NOT_EQUAL", "AND", "OR", "NOT", 
			"QUOTES_SQ", "QUOTES_DQ", "PRINT", "SIZE"
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
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCAFFOLD:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				scaffold();
				}
				break;
			case CONTAINER:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				container();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				text();
				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				image();
				}
				break;
			case LIST_VIEW:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				listView();
				}
				break;
			case APP_BAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				appBar();
				}
				break;
			case TEXT_FIELD:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				textField();
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 8);
				{
				setState(175);
				column();
				}
				break;
			case ROW:
				enterOuterAlt(_localctx, 9);
				{
				setState(176);
				row();
				}
				break;
			case CARD:
				enterOuterAlt(_localctx, 10);
				{
				setState(177);
				card();
				}
				break;
			case ICON_BUTTON:
				enterOuterAlt(_localctx, 11);
				{
				setState(178);
				iconButton();
				}
				break;
			case INK_WELL:
				enterOuterAlt(_localctx, 12);
				{
				setState(179);
				inkWell();
				}
				break;
			case EXPANDED:
				enterOuterAlt(_localctx, 13);
				{
				setState(180);
				expanded();
				}
				break;
			case BOTTOM_NAVIGATION_BAR:
				enterOuterAlt(_localctx, 14);
				{
				setState(181);
				bottomNavigationBar();
				}
				break;
			case SLIDER:
				enterOuterAlt(_localctx, 15);
				{
				setState(182);
				slider();
				}
				break;
			case TAB_BAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(183);
				tabBar();
				}
				break;
			case TAB_BAR_VIEW:
				enterOuterAlt(_localctx, 17);
				{
				setState(184);
				tabBarView();
				}
				break;
			case DRAWER:
				enterOuterAlt(_localctx, 18);
				{
				setState(185);
				drawer();
				}
				break;
			case FLOATING_ACTION_BUTTON:
				enterOuterAlt(_localctx, 19);
				{
				setState(186);
				floatingActionButton();
				}
				break;
			case WRAP:
				enterOuterAlt(_localctx, 20);
				{
				setState(187);
				wrap();
				}
				break;
			case FLEX:
				enterOuterAlt(_localctx, 21);
				{
				setState(188);
				flex();
				}
				break;
			case TEXT_FORM_FIELD:
				enterOuterAlt(_localctx, 22);
				{
				setState(189);
				textFormField();
				}
				break;
			case TEXT_BUTTON:
				enterOuterAlt(_localctx, 23);
				{
				setState(190);
				textButton();
				}
				break;
			case ICON:
				enterOuterAlt(_localctx, 24);
				{
				setState(191);
				icon();
				}
				break;
			case SIZED_BOX:
				enterOuterAlt(_localctx, 25);
				{
				setState(192);
				sizedBox();
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
		enterRule(_localctx, 2, RULE_scaffold);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(SCAFFOLD);
			setState(196);
			match(OPEN_PAREN);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BODY) | (1L << DRAWER_ARG) | (1L << APP_BAR_ARG) | (1L << BOTTOM_NAVIGATION_BAR_ARG) | (1L << FLOATING_ACTION_BUTTON_ARG) | (1L << BACKGROUND_COLOR))) != 0)) {
				{
				{
				setState(197);
				scaffoldArgs();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
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
		enterRule(_localctx, 4, RULE_container);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(CONTAINER);
			setState(206);
			match(OPEN_PAREN);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & ((1L << (CHILD - 48)) | (1L << (WIDTH - 48)) | (1L << (HEIGHT - 48)) | (1L << (COLOR - 48)) | (1L << (MARGIN - 48)) | (1L << (PADDING - 48)))) != 0)) {
				{
				{
				setState(207);
				containerArgs();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
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
		enterRule(_localctx, 6, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(TEXT);
			setState(216);
			match(OPEN_PAREN);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(217);
				textArgs();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
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
		enterRule(_localctx, 8, RULE_textStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(TEXT_STYLE);
			setState(226);
			match(OPEN_PAREN);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (BACKGROUND_COLOR - 47)) | (1L << (COLOR - 47)) | (1L << (FONT_SIZE - 47)))) != 0)) {
				{
				{
				setState(227);
				textStyleArgs();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
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
		enterRule(_localctx, 10, RULE_image);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(IMAGE);
			setState(236);
			match(OPEN_PAREN);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (WIDTH - 50)) | (1L << (HEIGHT - 50)) | (1L << (COLOR - 50)) | (1L << (IMAGE_ARG - 50)))) != 0)) {
				{
				{
				setState(237);
				imageArgs();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
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
		enterRule(_localctx, 12, RULE_listView);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(LIST_VIEW);
			setState(246);
			match(OPEN_PAREN);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILDREN || _la==PADDING) {
				{
				{
				setState(247);
				listviewArgs();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
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
		enterRule(_localctx, 14, RULE_appBar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(APP_BAR);
			setState(256);
			match(OPEN_PAREN);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (BACKGROUND_COLOR - 47)) | (1L << (TITLE - 47)) | (1L << (LEADING - 47)) | (1L << (ACTIONS - 47)))) != 0)) {
				{
				{
				setState(257);
				appBarArgs();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
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
		enterRule(_localctx, 16, RULE_textField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(TEXT_FIELD);
			setState(266);
			match(OPEN_PAREN);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STYLE) {
				{
				{
				setState(267);
				textFieldArgs();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
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
		enterRule(_localctx, 18, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(COLUMN);
			setState(276);
			match(OPEN_PAREN);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHILDREN) | (1L << CROSS_AXIS_ALIGNMENT) | (1L << MAIN_AXIS_ALIGNMENT))) != 0)) {
				{
				{
				setState(277);
				columnArgs();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
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
		enterRule(_localctx, 20, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(ROW);
			setState(286);
			match(OPEN_PAREN);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHILDREN) | (1L << CROSS_AXIS_ALIGNMENT) | (1L << MAIN_AXIS_ALIGNMENT))) != 0)) {
				{
				{
				setState(287);
				rowArgs();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
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
		enterRule(_localctx, 22, RULE_card);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(CARD);
			setState(296);
			match(OPEN_PAREN);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHILD) | (1L << COLOR) | (1L << MARGIN))) != 0)) {
				{
				{
				setState(297);
				cardArgs();
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
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
		enterRule(_localctx, 24, RULE_iconButton);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(ICON_BUTTON);
			setState(306);
			match(OPEN_PAREN);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (COLOR - 52)) | (1L << (ICON_ARG - 52)) | (1L << (PADDING - 52)))) != 0)) {
				{
				{
				setState(307);
				iconButtonArgs();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
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
		enterRule(_localctx, 26, RULE_inkWell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(INK_WELL);
			setState(316);
			match(OPEN_PAREN);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILD) {
				{
				{
				setState(317);
				inkwellArgs();
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
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
		enterRule(_localctx, 28, RULE_expanded);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(EXPANDED);
			setState(326);
			match(OPEN_PAREN);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILD || _la==FLEX_ARG) {
				{
				{
				setState(327);
				expandedArgs();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(333);
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
		enterRule(_localctx, 30, RULE_bottomNavigationBar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(BOTTOM_NAVIGATION_BAR);
			setState(336);
			match(OPEN_PAREN);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BACKGROUND_COLOR) | (1L << CURRENT_INDEX) | (1L << ITEMS))) != 0)) {
				{
				{
				setState(337);
				bottomNavigationBarArgs();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
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
		enterRule(_localctx, 32, RULE_slider);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(SLIDER);
			setState(346);
			match(OPEN_PAREN);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAX || _la==MIN) {
				{
				{
				setState(347);
				sliderArgs();
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353);
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
		enterRule(_localctx, 34, RULE_tabBar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(TAB_BAR);
			setState(356);
			match(OPEN_PAREN);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PADDING || _la==TABS) {
				{
				{
				setState(357);
				tabBarArgs();
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
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
		enterRule(_localctx, 36, RULE_tabBarView);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(TAB_BAR_VIEW);
			setState(366);
			match(OPEN_PAREN);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILDREN) {
				{
				{
				setState(367);
				tabBarViewArgs();
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
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
		enterRule(_localctx, 38, RULE_drawer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(DRAWER);
			setState(376);
			match(OPEN_PAREN);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BACKGROUND_COLOR) | (1L << CHILD) | (1L << WIDTH))) != 0)) {
				{
				{
				setState(377);
				drawerArgs();
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383);
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
		enterRule(_localctx, 40, RULE_floatingActionButton);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(FLOATING_ACTION_BUTTON);
			setState(386);
			match(OPEN_PAREN);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BACKGROUND_COLOR || _la==CHILD) {
				{
				{
				setState(387);
				floatingActionButtonArgs();
				}
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(393);
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
		enterRule(_localctx, 42, RULE_wrap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(WRAP);
			setState(396);
			match(OPEN_PAREN);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILDREN || _la==CROSS_AXIS_ALIGNMENT) {
				{
				{
				setState(397);
				wrapArgs();
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(403);
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
		enterRule(_localctx, 44, RULE_flex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(FLEX);
			setState(406);
			match(OPEN_PAREN);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FLEX || _la==CHILD) {
				{
				{
				setState(407);
				flexArgs();
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(413);
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
		enterRule(_localctx, 46, RULE_textFormField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(TEXT_FORM_FIELD);
			setState(416);
			match(OPEN_PAREN);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STYLE) {
				{
				{
				setState(417);
				textFormFieldArgs();
				}
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(423);
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
		enterRule(_localctx, 48, RULE_textButton);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(TEXT_BUTTON);
			setState(426);
			match(OPEN_PAREN);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHILD || _la==STYLE) {
				{
				{
				setState(427);
				textButtonArgs();
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(433);
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
		enterRule(_localctx, 50, RULE_icon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(ICON);
			setState(436);
			match(OPEN_PAREN);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLOR || _la==SIZE) {
				{
				{
				setState(437);
				iconArgs();
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(443);
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
		enterRule(_localctx, 52, RULE_sizedBox);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(SIZED_BOX);
			setState(446);
			match(OPEN_PAREN);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHILD) | (1L << WIDTH) | (1L << HEIGHT))) != 0)) {
				{
				{
				setState(447);
				sizedBoxArgs();
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(453);
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
		enterRule(_localctx, 54, RULE_scaffoldArgs);
		try {
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BODY:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				body();
				}
				break;
			case DRAWER_ARG:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				drawerArg();
				}
				break;
			case APP_BAR_ARG:
				enterOuterAlt(_localctx, 3);
				{
				setState(457);
				appBarArg();
				}
				break;
			case BOTTOM_NAVIGATION_BAR_ARG:
				enterOuterAlt(_localctx, 4);
				{
				setState(458);
				bottomNavigationBarArg();
				}
				break;
			case FLOATING_ACTION_BUTTON_ARG:
				enterOuterAlt(_localctx, 5);
				{
				setState(459);
				floatingActionButtonArg();
				}
				break;
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(460);
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
		enterRule(_localctx, 56, RULE_containerArgs);
		try {
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				child();
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				width();
				}
				break;
			case HEIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				height();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(466);
				color();
				}
				break;
			case MARGIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(467);
				margin();
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 6);
				{
				setState(468);
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
		enterRule(_localctx, 58, RULE_textArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(STRING);
			setState(472);
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
		enterRule(_localctx, 60, RULE_imageArgs);
		try {
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMAGE_ARG:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				imageArg();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				color();
				}
				break;
			case HEIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(476);
				height();
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 4);
				{
				setState(477);
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
		enterRule(_localctx, 62, RULE_listviewArgs);
		try {
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				children();
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
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
		enterRule(_localctx, 64, RULE_appBarArgs);
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TITLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				title();
				}
				break;
			case LEADING:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				leading();
				}
				break;
			case ACTIONS:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				actions();
				}
				break;
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(487);
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
		enterRule(_localctx, 66, RULE_textFieldArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
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
		enterRule(_localctx, 68, RULE_columnArgs);
		try {
			setState(495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				children();
				}
				break;
			case MAIN_AXIS_ALIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				mainAxis();
				}
				break;
			case CROSS_AXIS_ALIGNMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(494);
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
		enterRule(_localctx, 70, RULE_rowArgs);
		try {
			setState(500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				children();
				}
				break;
			case MAIN_AXIS_ALIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				mainAxis();
				}
				break;
			case CROSS_AXIS_ALIGNMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(499);
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
		enterRule(_localctx, 72, RULE_cardArgs);
		try {
			setState(505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				color();
				}
				break;
			case MARGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				margin();
				}
				break;
			case CHILD:
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
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
		enterRule(_localctx, 74, RULE_iconButtonArgs);
		try {
			setState(510);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ICON_ARG:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				iconArg();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				color();
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
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
		enterRule(_localctx, 76, RULE_inkwellArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
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
		enterRule(_localctx, 78, RULE_expandedArgs);
		try {
			setState(516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				child();
				}
				break;
			case FLEX_ARG:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
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
		enterRule(_localctx, 80, RULE_bottomNavigationBarArgs);
		try {
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ITEMS:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				items();
				}
				break;
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				backGroundColor();
				}
				break;
			case CURRENT_INDEX:
				enterOuterAlt(_localctx, 3);
				{
				setState(520);
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
		enterRule(_localctx, 82, RULE_sliderArgs);
		try {
			setState(525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				min();
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
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
		enterRule(_localctx, 84, RULE_tabBarArgs);
		try {
			setState(529);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TABS:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				tabs();
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
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
		enterRule(_localctx, 86, RULE_tabBarViewArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
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
		enterRule(_localctx, 88, RULE_drawerArgs);
		try {
			setState(536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				backGroundColor();
				}
				break;
			case CHILD:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				child();
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 3);
				{
				setState(535);
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
		enterRule(_localctx, 90, RULE_floatingActionButtonArgs);
		try {
			setState(540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				child();
				}
				break;
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
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
		enterRule(_localctx, 92, RULE_wrapArgs);
		try {
			setState(544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				children();
				}
				break;
			case CROSS_AXIS_ALIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
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
		public FlexContext flex() {
			return getRuleContext(FlexContext.class,0);
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
		enterRule(_localctx, 94, RULE_flexArgs);
		try {
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				child();
				}
				break;
			case FLEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				flex();
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
		enterRule(_localctx, 96, RULE_textFormFieldArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
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
		enterRule(_localctx, 98, RULE_textButtonArgs);
		try {
			setState(554);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				child();
				}
				break;
			case STYLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
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
		enterRule(_localctx, 100, RULE_iconArgs);
		try {
			setState(558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				size();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
				color();
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
		enterRule(_localctx, 102, RULE_sizedBoxArgs);
		try {
			setState(563);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				child();
				}
				break;
			case HEIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				height();
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 3);
				{
				setState(562);
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
		enterRule(_localctx, 104, RULE_textStyleArgs);
		try {
			setState(568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				backGroundColor();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				color();
				}
				break;
			case FONT_SIZE:
				enterOuterAlt(_localctx, 3);
				{
				setState(567);
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
		enterRule(_localctx, 106, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(BODY);
			setState(571);
			match(COLON);
			setState(572);
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
		enterRule(_localctx, 108, RULE_drawerArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(DRAWER_ARG);
			setState(575);
			match(COLON);
			setState(576);
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
		enterRule(_localctx, 110, RULE_appBarArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(APP_BAR_ARG);
			setState(579);
			match(COLON);
			setState(580);
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
		enterRule(_localctx, 112, RULE_bottomNavigationBarArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(BOTTOM_NAVIGATION_BAR_ARG);
			setState(583);
			match(COLON);
			setState(584);
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
		enterRule(_localctx, 114, RULE_floatingActionButtonArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(FLOATING_ACTION_BUTTON_ARG);
			setState(587);
			match(COLON);
			setState(588);
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
		enterRule(_localctx, 116, RULE_child);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(CHILD);
			setState(591);
			match(COLON);
			setState(592);
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
		enterRule(_localctx, 118, RULE_children);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(CHILDREN);
			setState(595);
			match(COLON);
			setState(596);
			match(OPEN_SQUARE);
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCAFFOLD) | (1L << CONTAINER) | (1L << ROW) | (1L << COLUMN) | (1L << LIST_VIEW) | (1L << SIZED_BOX) | (1L << EXPANDED) | (1L << CARD) | (1L << ICON_BUTTON) | (1L << ICON) | (1L << SLIDER) | (1L << DRAWER) | (1L << WRAP) | (1L << FLEX) | (1L << TEXT_BUTTON) | (1L << TEXT) | (1L << IMAGE) | (1L << APP_BAR) | (1L << TEXT_FIELD) | (1L << INK_WELL) | (1L << BOTTOM_NAVIGATION_BAR) | (1L << TAB_BAR) | (1L << TAB_BAR_VIEW) | (1L << FLOATING_ACTION_BUTTON) | (1L << TEXT_FORM_FIELD))) != 0)) {
				{
				{
				setState(597);
				widget();
				}
				}
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(603);
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
		public TerminalNode INT() { return getToken(ParserFile.INT, 0); }
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
		enterRule(_localctx, 120, RULE_height);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(HEIGHT);
			setState(606);
			match(COLON);
			setState(607);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
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

	public static class WidthContext extends ParserRuleContext {
		public TerminalNode WIDTH() { return getToken(ParserFile.WIDTH, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode DOUBLE() { return getToken(ParserFile.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(ParserFile.INT, 0); }
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
		enterRule(_localctx, 122, RULE_width);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(WIDTH);
			setState(610);
			match(COLON);
			setState(611);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
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
		public TerminalNode COLOR() { return getToken(ParserFile.COLOR, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public ColorsContext colors() {
			return getRuleContext(ColorsContext.class,0);
		}
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
		enterRule(_localctx, 124, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(COLOR);
			setState(614);
			match(COLON);
			setState(615);
			colors();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode INT() { return getToken(ParserFile.INT, 0); }
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
		enterRule(_localctx, 126, RULE_margin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(MARGIN);
			setState(618);
			match(COLON);
			setState(619);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
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

	public static class PaddingContext extends ParserRuleContext {
		public TerminalNode PADDING() { return getToken(ParserFile.PADDING, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode DOUBLE() { return getToken(ParserFile.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(ParserFile.INT, 0); }
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
		enterRule(_localctx, 128, RULE_padding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(PADDING);
			setState(622);
			match(COLON);
			setState(623);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
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
		enterRule(_localctx, 130, RULE_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(ITEMS);
			setState(626);
			match(COLON);
			setState(627);
			match(OPEN_SQUARE);
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCAFFOLD) | (1L << CONTAINER) | (1L << ROW) | (1L << COLUMN) | (1L << LIST_VIEW) | (1L << SIZED_BOX) | (1L << EXPANDED) | (1L << CARD) | (1L << ICON_BUTTON) | (1L << ICON) | (1L << SLIDER) | (1L << DRAWER) | (1L << WRAP) | (1L << FLEX) | (1L << TEXT_BUTTON) | (1L << TEXT) | (1L << IMAGE) | (1L << APP_BAR) | (1L << TEXT_FIELD) | (1L << INK_WELL) | (1L << BOTTOM_NAVIGATION_BAR) | (1L << TAB_BAR) | (1L << TAB_BAR_VIEW) | (1L << FLOATING_ACTION_BUTTON) | (1L << TEXT_FORM_FIELD))) != 0)) {
				{
				{
				setState(628);
				widget();
				}
				}
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(634);
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
		enterRule(_localctx, 132, RULE_currentIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(CURRENT_INDEX);
			setState(637);
			match(COLON);
			setState(638);
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
		public ColorsContext colors() {
			return getRuleContext(ColorsContext.class,0);
		}
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
		enterRule(_localctx, 134, RULE_backGroundColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(BACKGROUND_COLOR);
			setState(641);
			match(COLON);
			setState(642);
			colors();
			}
		}
		catch (RecognitionException re) {
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
		public AxisValuesContext axisValues() {
			return getRuleContext(AxisValuesContext.class,0);
		}
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
		enterRule(_localctx, 136, RULE_crossAxis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(CROSS_AXIS_ALIGNMENT);
			setState(645);
			match(COLON);
			setState(646);
			axisValues();
			}
		}
		catch (RecognitionException re) {
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
		public AxisValuesContext axisValues() {
			return getRuleContext(AxisValuesContext.class,0);
		}
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
		enterRule(_localctx, 138, RULE_mainAxis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(MAIN_AXIS_ALIGNMENT);
			setState(649);
			match(COLON);
			setState(650);
			axisValues();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 140, RULE_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(STYLE);
			setState(653);
			match(COLON);
			setState(654);
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
		public TerminalNode INT() { return getToken(ParserFile.INT, 0); }
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
		enterRule(_localctx, 142, RULE_fontSize);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(FONT_SIZE);
			setState(657);
			match(COLON);
			setState(658);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
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

	public static class ImageArgContext extends ParserRuleContext {
		public TerminalNode IMAGE_ARG() { return getToken(ParserFile.IMAGE_ARG, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
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
		enterRule(_localctx, 144, RULE_imageArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(IMAGE_ARG);
			setState(661);
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
		enterRule(_localctx, 146, RULE_leading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(LEADING);
			setState(664);
			match(COLON);
			setState(665);
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
		enterRule(_localctx, 148, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(TITLE);
			setState(668);
			match(COLON);
			setState(669);
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
		enterRule(_localctx, 150, RULE_actions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(ACTIONS);
			setState(672);
			match(COLON);
			setState(673);
			match(OPEN_SQUARE);
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCAFFOLD) | (1L << CONTAINER) | (1L << ROW) | (1L << COLUMN) | (1L << LIST_VIEW) | (1L << SIZED_BOX) | (1L << EXPANDED) | (1L << CARD) | (1L << ICON_BUTTON) | (1L << ICON) | (1L << SLIDER) | (1L << DRAWER) | (1L << WRAP) | (1L << FLEX) | (1L << TEXT_BUTTON) | (1L << TEXT) | (1L << IMAGE) | (1L << APP_BAR) | (1L << TEXT_FIELD) | (1L << INK_WELL) | (1L << BOTTOM_NAVIGATION_BAR) | (1L << TAB_BAR) | (1L << TAB_BAR_VIEW) | (1L << FLOATING_ACTION_BUTTON) | (1L << TEXT_FORM_FIELD))) != 0)) {
				{
				{
				setState(674);
				widget();
				}
				}
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(680);
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
		enterRule(_localctx, 152, RULE_iconArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(ICON_ARG);
			setState(683);
			match(COLON);
			setState(684);
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
		enterRule(_localctx, 154, RULE_flexArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(FLEX_ARG);
			setState(687);
			match(COLON);
			setState(688);
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
		public TerminalNode INT() { return getToken(ParserFile.INT, 0); }
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
		enterRule(_localctx, 156, RULE_min);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(MIN);
			setState(691);
			match(COLON);
			setState(692);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
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

	public static class MaxContext extends ParserRuleContext {
		public TerminalNode MAX() { return getToken(ParserFile.MAX, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode DOUBLE() { return getToken(ParserFile.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(ParserFile.INT, 0); }
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
		enterRule(_localctx, 158, RULE_max);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			match(MAX);
			setState(695);
			match(COLON);
			setState(696);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
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
		enterRule(_localctx, 160, RULE_tabs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(TABS);
			setState(699);
			match(COLON);
			setState(700);
			match(OPEN_SQUARE);
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCAFFOLD) | (1L << CONTAINER) | (1L << ROW) | (1L << COLUMN) | (1L << LIST_VIEW) | (1L << SIZED_BOX) | (1L << EXPANDED) | (1L << CARD) | (1L << ICON_BUTTON) | (1L << ICON) | (1L << SLIDER) | (1L << DRAWER) | (1L << WRAP) | (1L << FLEX) | (1L << TEXT_BUTTON) | (1L << TEXT) | (1L << IMAGE) | (1L << APP_BAR) | (1L << TEXT_FIELD) | (1L << INK_WELL) | (1L << BOTTOM_NAVIGATION_BAR) | (1L << TAB_BAR) | (1L << TAB_BAR_VIEW) | (1L << FLOATING_ACTION_BUTTON) | (1L << TEXT_FORM_FIELD))) != 0)) {
				{
				{
				setState(701);
				widget();
				}
				}
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(707);
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
		public TerminalNode INT() { return getToken(ParserFile.INT, 0); }
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
		enterRule(_localctx, 162, RULE_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(SIZE);
			setState(710);
			match(COLON);
			setState(711);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
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

	public static class ColorsContext extends ParserRuleContext {
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
		public ColorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterColors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitColors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitColors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorsContext colors() throws RecognitionException {
		ColorsContext _localctx = new ColorsContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_colors);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RED) | (1L << BLUE) | (1L << YELLOW) | (1L << BLACK) | (1L << WHITE) | (1L << GREY) | (1L << GREEN) | (1L << GOLD) | (1L << PURBLE) | (1L << PINK))) != 0)) ) {
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

	public static class AxisValuesContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(ParserFile.START, 0); }
		public TerminalNode CENTER() { return getToken(ParserFile.CENTER, 0); }
		public TerminalNode END() { return getToken(ParserFile.END, 0); }
		public AxisValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axisValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAxisValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAxisValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAxisValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AxisValuesContext axisValues() throws RecognitionException {
		AxisValuesContext _localctx = new AxisValuesContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_axisValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << START) | (1L << END) | (1L << CENTER))) != 0)) ) {
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
		"\u0004\u0001j\u02ce\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"\u00c2\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u00c7\b"+
		"\u0001\n\u0001\f\u0001\u00ca\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002\u00d1\b\u0002\n\u0002\f\u0002\u00d4"+
		"\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u00db\b\u0003\n\u0003\f\u0003\u00de\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00e5\b\u0004\n\u0004"+
		"\f\u0004\u00e8\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u00ef\b\u0005\n\u0005\f\u0005\u00f2\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00f9"+
		"\b\u0006\n\u0006\f\u0006\u00fc\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u0103\b\u0007\n\u0007\f\u0007\u0106"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u010d"+
		"\b\b\n\b\f\b\u0110\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t"+
		"\u0117\b\t\n\t\f\t\u011a\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u0121\b\n\n\n\f\n\u0124\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u012b\b\u000b\n\u000b\f\u000b\u012e\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u0135\b\f\n\f\f\f\u0138"+
		"\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u013f\b\r\n\r\f\r"+
		"\u0142\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0149\b\u000e\n\u000e\f\u000e\u014c\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0153\b\u000f\n\u000f\f\u000f"+
		"\u0156\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u015d\b\u0010\n\u0010\f\u0010\u0160\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0167\b\u0011\n"+
		"\u0011\f\u0011\u016a\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u0171\b\u0012\n\u0012\f\u0012\u0174\t\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u017b\b\u0013\n\u0013\f\u0013\u017e\t\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0185\b\u0014\n\u0014\f\u0014"+
		"\u0188\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u018f\b\u0015\n\u0015\f\u0015\u0192\t\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0199\b\u0016\n"+
		"\u0016\f\u0016\u019c\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u01a3\b\u0017\n\u0017\f\u0017\u01a6\t\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u01ad\b\u0018\n\u0018\f\u0018\u01b0\t\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01b7\b\u0019\n\u0019\f\u0019"+
		"\u01ba\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u01c1\b\u001a\n\u001a\f\u001a\u01c4\t\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u01ce\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01d6\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u01df\b\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u01e3\b\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0003 \u01e9\b \u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u01f0\b\"\u0001#\u0001#\u0001#\u0003#\u01f5\b#\u0001"+
		"$\u0001$\u0001$\u0003$\u01fa\b$\u0001%\u0001%\u0001%\u0003%\u01ff\b%\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0003\'\u0205\b\'\u0001(\u0001(\u0001(\u0003"+
		"(\u020a\b(\u0001)\u0001)\u0003)\u020e\b)\u0001*\u0001*\u0003*\u0212\b"+
		"*\u0001+\u0001+\u0001,\u0001,\u0001,\u0003,\u0219\b,\u0001-\u0001-\u0003"+
		"-\u021d\b-\u0001.\u0001.\u0003.\u0221\b.\u0001/\u0001/\u0003/\u0225\b"+
		"/\u00010\u00010\u00011\u00011\u00031\u022b\b1\u00012\u00012\u00032\u022f"+
		"\b2\u00013\u00013\u00013\u00033\u0234\b3\u00014\u00014\u00014\u00034\u0239"+
		"\b4\u00015\u00015\u00015\u00015\u00016\u00016\u00016\u00016\u00017\u0001"+
		"7\u00017\u00017\u00018\u00018\u00018\u00018\u00019\u00019\u00019\u0001"+
		"9\u0001:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0005;\u0257"+
		"\b;\n;\f;\u025a\t;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001=\u0001"+
		"=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001"+
		"?\u0001@\u0001@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0005A\u0276"+
		"\bA\nA\fA\u0279\tA\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001C\u0001"+
		"C\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001E\u0001E\u0001E\u0001"+
		"E\u0001F\u0001F\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001H\u0001"+
		"H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001J\u0001J\u0001J\u0001J\u0001"+
		"K\u0001K\u0001K\u0001K\u0005K\u02a4\bK\nK\fK\u02a7\tK\u0001K\u0001K\u0001"+
		"L\u0001L\u0001L\u0001L\u0001M\u0001M\u0001M\u0001M\u0001N\u0001N\u0001"+
		"N\u0001N\u0001O\u0001O\u0001O\u0001O\u0001P\u0001P\u0001P\u0001P\u0005"+
		"P\u02bf\bP\nP\fP\u02c2\tP\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"R\u0001R\u0001S\u0001S\u0001S\u0000\u0000T\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u0000\u0003\u0001\u0000HI\u0001\u0000\u001d&\u0001\u0000"+
		"\')\u02d8\u0000\u00c1\u0001\u0000\u0000\u0000\u0002\u00c3\u0001\u0000"+
		"\u0000\u0000\u0004\u00cd\u0001\u0000\u0000\u0000\u0006\u00d7\u0001\u0000"+
		"\u0000\u0000\b\u00e1\u0001\u0000\u0000\u0000\n\u00eb\u0001\u0000\u0000"+
		"\u0000\f\u00f5\u0001\u0000\u0000\u0000\u000e\u00ff\u0001\u0000\u0000\u0000"+
		"\u0010\u0109\u0001\u0000\u0000\u0000\u0012\u0113\u0001\u0000\u0000\u0000"+
		"\u0014\u011d\u0001\u0000\u0000\u0000\u0016\u0127\u0001\u0000\u0000\u0000"+
		"\u0018\u0131\u0001\u0000\u0000\u0000\u001a\u013b\u0001\u0000\u0000\u0000"+
		"\u001c\u0145\u0001\u0000\u0000\u0000\u001e\u014f\u0001\u0000\u0000\u0000"+
		" \u0159\u0001\u0000\u0000\u0000\"\u0163\u0001\u0000\u0000\u0000$\u016d"+
		"\u0001\u0000\u0000\u0000&\u0177\u0001\u0000\u0000\u0000(\u0181\u0001\u0000"+
		"\u0000\u0000*\u018b\u0001\u0000\u0000\u0000,\u0195\u0001\u0000\u0000\u0000"+
		".\u019f\u0001\u0000\u0000\u00000\u01a9\u0001\u0000\u0000\u00002\u01b3"+
		"\u0001\u0000\u0000\u00004\u01bd\u0001\u0000\u0000\u00006\u01cd\u0001\u0000"+
		"\u0000\u00008\u01d5\u0001\u0000\u0000\u0000:\u01d7\u0001\u0000\u0000\u0000"+
		"<\u01de\u0001\u0000\u0000\u0000>\u01e2\u0001\u0000\u0000\u0000@\u01e8"+
		"\u0001\u0000\u0000\u0000B\u01ea\u0001\u0000\u0000\u0000D\u01ef\u0001\u0000"+
		"\u0000\u0000F\u01f4\u0001\u0000\u0000\u0000H\u01f9\u0001\u0000\u0000\u0000"+
		"J\u01fe\u0001\u0000\u0000\u0000L\u0200\u0001\u0000\u0000\u0000N\u0204"+
		"\u0001\u0000\u0000\u0000P\u0209\u0001\u0000\u0000\u0000R\u020d\u0001\u0000"+
		"\u0000\u0000T\u0211\u0001\u0000\u0000\u0000V\u0213\u0001\u0000\u0000\u0000"+
		"X\u0218\u0001\u0000\u0000\u0000Z\u021c\u0001\u0000\u0000\u0000\\\u0220"+
		"\u0001\u0000\u0000\u0000^\u0224\u0001\u0000\u0000\u0000`\u0226\u0001\u0000"+
		"\u0000\u0000b\u022a\u0001\u0000\u0000\u0000d\u022e\u0001\u0000\u0000\u0000"+
		"f\u0233\u0001\u0000\u0000\u0000h\u0238\u0001\u0000\u0000\u0000j\u023a"+
		"\u0001\u0000\u0000\u0000l\u023e\u0001\u0000\u0000\u0000n\u0242\u0001\u0000"+
		"\u0000\u0000p\u0246\u0001\u0000\u0000\u0000r\u024a\u0001\u0000\u0000\u0000"+
		"t\u024e\u0001\u0000\u0000\u0000v\u0252\u0001\u0000\u0000\u0000x\u025d"+
		"\u0001\u0000\u0000\u0000z\u0261\u0001\u0000\u0000\u0000|\u0265\u0001\u0000"+
		"\u0000\u0000~\u0269\u0001\u0000\u0000\u0000\u0080\u026d\u0001\u0000\u0000"+
		"\u0000\u0082\u0271\u0001\u0000\u0000\u0000\u0084\u027c\u0001\u0000\u0000"+
		"\u0000\u0086\u0280\u0001\u0000\u0000\u0000\u0088\u0284\u0001\u0000\u0000"+
		"\u0000\u008a\u0288\u0001\u0000\u0000\u0000\u008c\u028c\u0001\u0000\u0000"+
		"\u0000\u008e\u0290\u0001\u0000\u0000\u0000\u0090\u0294\u0001\u0000\u0000"+
		"\u0000\u0092\u0297\u0001\u0000\u0000\u0000\u0094\u029b\u0001\u0000\u0000"+
		"\u0000\u0096\u029f\u0001\u0000\u0000\u0000\u0098\u02aa\u0001\u0000\u0000"+
		"\u0000\u009a\u02ae\u0001\u0000\u0000\u0000\u009c\u02b2\u0001\u0000\u0000"+
		"\u0000\u009e\u02b6\u0001\u0000\u0000\u0000\u00a0\u02ba\u0001\u0000\u0000"+
		"\u0000\u00a2\u02c5\u0001\u0000\u0000\u0000\u00a4\u02c9\u0001\u0000\u0000"+
		"\u0000\u00a6\u02cb\u0001\u0000\u0000\u0000\u00a8\u00c2\u0003\u0002\u0001"+
		"\u0000\u00a9\u00c2\u0003\u0004\u0002\u0000\u00aa\u00c2\u0003\u0006\u0003"+
		"\u0000\u00ab\u00c2\u0003\n\u0005\u0000\u00ac\u00c2\u0003\f\u0006\u0000"+
		"\u00ad\u00c2\u0003\u000e\u0007\u0000\u00ae\u00c2\u0003\u0010\b\u0000\u00af"+
		"\u00c2\u0003\u0012\t\u0000\u00b0\u00c2\u0003\u0014\n\u0000\u00b1\u00c2"+
		"\u0003\u0016\u000b\u0000\u00b2\u00c2\u0003\u0018\f\u0000\u00b3\u00c2\u0003"+
		"\u001a\r\u0000\u00b4\u00c2\u0003\u001c\u000e\u0000\u00b5\u00c2\u0003\u001e"+
		"\u000f\u0000\u00b6\u00c2\u0003 \u0010\u0000\u00b7\u00c2\u0003\"\u0011"+
		"\u0000\u00b8\u00c2\u0003$\u0012\u0000\u00b9\u00c2\u0003&\u0013\u0000\u00ba"+
		"\u00c2\u0003(\u0014\u0000\u00bb\u00c2\u0003*\u0015\u0000\u00bc\u00c2\u0003"+
		",\u0016\u0000\u00bd\u00c2\u0003.\u0017\u0000\u00be\u00c2\u00030\u0018"+
		"\u0000\u00bf\u00c2\u00032\u0019\u0000\u00c0\u00c2\u00034\u001a\u0000\u00c1"+
		"\u00a8\u0001\u0000\u0000\u0000\u00c1\u00a9\u0001\u0000\u0000\u0000\u00c1"+
		"\u00aa\u0001\u0000\u0000\u0000\u00c1\u00ab\u0001\u0000\u0000\u0000\u00c1"+
		"\u00ac\u0001\u0000\u0000\u0000\u00c1\u00ad\u0001\u0000\u0000\u0000\u00c1"+
		"\u00ae\u0001\u0000\u0000\u0000\u00c1\u00af\u0001\u0000\u0000\u0000\u00c1"+
		"\u00b0\u0001\u0000\u0000\u0000\u00c1\u00b1\u0001\u0000\u0000\u0000\u00c1"+
		"\u00b2\u0001\u0000\u0000\u0000\u00c1\u00b3\u0001\u0000\u0000\u0000\u00c1"+
		"\u00b4\u0001\u0000\u0000\u0000\u00c1\u00b5\u0001\u0000\u0000\u0000\u00c1"+
		"\u00b6\u0001\u0000\u0000\u0000\u00c1\u00b7\u0001\u0000\u0000\u0000\u00c1"+
		"\u00b8\u0001\u0000\u0000\u0000\u00c1\u00b9\u0001\u0000\u0000\u0000\u00c1"+
		"\u00ba\u0001\u0000\u0000\u0000\u00c1\u00bb\u0001\u0000\u0000\u0000\u00c1"+
		"\u00bc\u0001\u0000\u0000\u0000\u00c1\u00bd\u0001\u0000\u0000\u0000\u00c1"+
		"\u00be\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c2\u0001\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0005\u0001\u0000\u0000\u00c4\u00c8\u0005T\u0000\u0000\u00c5\u00c7"+
		"\u00036\u001b\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0005U\u0000\u0000\u00cc\u0003\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0005\u0002\u0000\u0000\u00ce\u00d2\u0005T\u0000"+
		"\u0000\u00cf\u00d1\u00038\u001c\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005U\u0000\u0000\u00d6"+
		"\u0005\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u0010\u0000\u0000\u00d8"+
		"\u00dc\u0005T\u0000\u0000\u00d9\u00db\u0003:\u001d\u0000\u00da\u00d9\u0001"+
		"\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00df\u0001"+
		"\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e0\u0005"+
		"U\u0000\u0000\u00e0\u0007\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u001c"+
		"\u0000\u0000\u00e2\u00e6\u0005T\u0000\u0000\u00e3\u00e5\u0003h4\u0000"+
		"\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0005U\u0000\u0000\u00ea\t\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0005\u0011\u0000\u0000\u00ec\u00f0\u0005T\u0000\u0000\u00ed\u00ef"+
		"\u0003<\u001e\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0005U\u0000\u0000\u00f4\u000b\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0005\u0005\u0000\u0000\u00f6\u00fa\u0005T\u0000"+
		"\u0000\u00f7\u00f9\u0003>\u001f\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005U\u0000\u0000\u00fe"+
		"\r\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u0012\u0000\u0000\u0100\u0104"+
		"\u0005T\u0000\u0000\u0101\u0103\u0003@ \u0000\u0102\u0101\u0001\u0000"+
		"\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0107\u0001\u0000"+
		"\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u0108\u0005U\u0000"+
		"\u0000\u0108\u000f\u0001\u0000\u0000\u0000\u0109\u010a\u0005\u0013\u0000"+
		"\u0000\u010a\u010e\u0005T\u0000\u0000\u010b\u010d\u0003B!\u0000\u010c"+
		"\u010b\u0001\u0000\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e"+
		"\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f"+
		"\u0111\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0005U\u0000\u0000\u0112\u0011\u0001\u0000\u0000\u0000\u0113\u0114"+
		"\u0005\u0004\u0000\u0000\u0114\u0118\u0005T\u0000\u0000\u0115\u0117\u0003"+
		"D\"\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000"+
		"\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000"+
		"\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000"+
		"\u0000\u0000\u011b\u011c\u0005U\u0000\u0000\u011c\u0013\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0005\u0003\u0000\u0000\u011e\u0122\u0005T\u0000\u0000"+
		"\u011f\u0121\u0003F#\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121\u0124"+
		"\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123"+
		"\u0001\u0000\u0000\u0000\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u0122"+
		"\u0001\u0000\u0000\u0000\u0125\u0126\u0005U\u0000\u0000\u0126\u0015\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\u0005\b\u0000\u0000\u0128\u012c\u0005T"+
		"\u0000\u0000\u0129\u012b\u0003H$\u0000\u012a\u0129\u0001\u0000\u0000\u0000"+
		"\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012f\u0001\u0000\u0000\u0000"+
		"\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0130\u0005U\u0000\u0000\u0130"+
		"\u0017\u0001\u0000\u0000\u0000\u0131\u0132\u0005\t\u0000\u0000\u0132\u0136"+
		"\u0005T\u0000\u0000\u0133\u0135\u0003J%\u0000\u0134\u0133\u0001\u0000"+
		"\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0139\u0001\u0000"+
		"\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013a\u0005U\u0000"+
		"\u0000\u013a\u0019\u0001\u0000\u0000\u0000\u013b\u013c\u0005\u0016\u0000"+
		"\u0000\u013c\u0140\u0005T\u0000\u0000\u013d\u013f\u0003L&\u0000\u013e"+
		"\u013d\u0001\u0000\u0000\u0000\u013f\u0142\u0001\u0000\u0000\u0000\u0140"+
		"\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141"+
		"\u0143\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0143"+
		"\u0144\u0005U\u0000\u0000\u0144\u001b\u0001\u0000\u0000\u0000\u0145\u0146"+
		"\u0005\u0007\u0000\u0000\u0146\u014a\u0005T\u0000\u0000\u0147\u0149\u0003"+
		"N\'\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0149\u014c\u0001\u0000"+
		"\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000"+
		"\u0000\u0000\u014b\u014d\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0005U\u0000\u0000\u014e\u001d\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0005\u0017\u0000\u0000\u0150\u0154\u0005T\u0000\u0000"+
		"\u0151\u0153\u0003P(\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0153\u0156"+
		"\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0001\u0000\u0000\u0000\u0155\u0157\u0001\u0000\u0000\u0000\u0156\u0154"+
		"\u0001\u0000\u0000\u0000\u0157\u0158\u0005U\u0000\u0000\u0158\u001f\u0001"+
		"\u0000\u0000\u0000\u0159\u015a\u0005\u000b\u0000\u0000\u015a\u015e\u0005"+
		"T\u0000\u0000\u015b\u015d\u0003R)\u0000\u015c\u015b\u0001\u0000\u0000"+
		"\u0000\u015d\u0160\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000"+
		"\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0161\u0001\u0000\u0000"+
		"\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0161\u0162\u0005U\u0000\u0000"+
		"\u0162!\u0001\u0000\u0000\u0000\u0163\u0164\u0005\u0018\u0000\u0000\u0164"+
		"\u0168\u0005T\u0000\u0000\u0165\u0167\u0003T*\u0000\u0166\u0165\u0001"+
		"\u0000\u0000\u0000\u0167\u016a\u0001\u0000\u0000\u0000\u0168\u0166\u0001"+
		"\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016b\u0001"+
		"\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016b\u016c\u0005"+
		"U\u0000\u0000\u016c#\u0001\u0000\u0000\u0000\u016d\u016e\u0005\u0019\u0000"+
		"\u0000\u016e\u0172\u0005T\u0000\u0000\u016f\u0171\u0003V+\u0000\u0170"+
		"\u016f\u0001\u0000\u0000\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172"+
		"\u0170\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173"+
		"\u0175\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0175"+
		"\u0176\u0005U\u0000\u0000\u0176%\u0001\u0000\u0000\u0000\u0177\u0178\u0005"+
		"\f\u0000\u0000\u0178\u017c\u0005T\u0000\u0000\u0179\u017b\u0003X,\u0000"+
		"\u017a\u0179\u0001\u0000\u0000\u0000\u017b\u017e\u0001\u0000\u0000\u0000"+
		"\u017c\u017a\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000"+
		"\u017d\u017f\u0001\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0005U\u0000\u0000\u0180\'\u0001\u0000\u0000\u0000\u0181"+
		"\u0182\u0005\u001a\u0000\u0000\u0182\u0186\u0005T\u0000\u0000\u0183\u0185"+
		"\u0003Z-\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0185\u0188\u0001\u0000"+
		"\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000"+
		"\u0000\u0000\u0187\u0189\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000"+
		"\u0000\u0000\u0189\u018a\u0005U\u0000\u0000\u018a)\u0001\u0000\u0000\u0000"+
		"\u018b\u018c\u0005\r\u0000\u0000\u018c\u0190\u0005T\u0000\u0000\u018d"+
		"\u018f\u0003\\.\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018f\u0192"+
		"\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u0191"+
		"\u0001\u0000\u0000\u0000\u0191\u0193\u0001\u0000\u0000\u0000\u0192\u0190"+
		"\u0001\u0000\u0000\u0000\u0193\u0194\u0005U\u0000\u0000\u0194+\u0001\u0000"+
		"\u0000\u0000\u0195\u0196\u0005\u000e\u0000\u0000\u0196\u019a\u0005T\u0000"+
		"\u0000\u0197\u0199\u0003^/\u0000\u0198\u0197\u0001\u0000\u0000\u0000\u0199"+
		"\u019c\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019a"+
		"\u019b\u0001\u0000\u0000\u0000\u019b\u019d\u0001\u0000\u0000\u0000\u019c"+
		"\u019a\u0001\u0000\u0000\u0000\u019d\u019e\u0005U\u0000\u0000\u019e-\u0001"+
		"\u0000\u0000\u0000\u019f\u01a0\u0005\u001b\u0000\u0000\u01a0\u01a4\u0005"+
		"T\u0000\u0000\u01a1\u01a3\u0003`0\u0000\u01a2\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a6\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005U\u0000\u0000"+
		"\u01a8/\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005\u000f\u0000\u0000\u01aa"+
		"\u01ae\u0005T\u0000\u0000\u01ab\u01ad\u0003b1\u0000\u01ac\u01ab\u0001"+
		"\u0000\u0000\u0000\u01ad\u01b0\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001"+
		"\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b1\u01b2\u0005"+
		"U\u0000\u0000\u01b21\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005\n\u0000"+
		"\u0000\u01b4\u01b8\u0005T\u0000\u0000\u01b5\u01b7\u0003d2\u0000\u01b6"+
		"\u01b5\u0001\u0000\u0000\u0000\u01b7\u01ba\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9"+
		"\u01bb\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01bb"+
		"\u01bc\u0005U\u0000\u0000\u01bc3\u0001\u0000\u0000\u0000\u01bd\u01be\u0005"+
		"\u0006\u0000\u0000\u01be\u01c2\u0005T\u0000\u0000\u01bf\u01c1\u0003f3"+
		"\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c5\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c6\u0005U\u0000\u0000\u01c65\u0001\u0000\u0000\u0000\u01c7"+
		"\u01ce\u0003j5\u0000\u01c8\u01ce\u0003l6\u0000\u01c9\u01ce\u0003n7\u0000"+
		"\u01ca\u01ce\u0003p8\u0000\u01cb\u01ce\u0003r9\u0000\u01cc\u01ce\u0003"+
		"\u0086C\u0000\u01cd\u01c7\u0001\u0000\u0000\u0000\u01cd\u01c8\u0001\u0000"+
		"\u0000\u0000\u01cd\u01c9\u0001\u0000\u0000\u0000\u01cd\u01ca\u0001\u0000"+
		"\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd\u01cc\u0001\u0000"+
		"\u0000\u0000\u01ce7\u0001\u0000\u0000\u0000\u01cf\u01d6\u0003t:\u0000"+
		"\u01d0\u01d6\u0003z=\u0000\u01d1\u01d6\u0003x<\u0000\u01d2\u01d6\u0003"+
		"|>\u0000\u01d3\u01d6\u0003~?\u0000\u01d4\u01d6\u0003\u0080@\u0000\u01d5"+
		"\u01cf\u0001\u0000\u0000\u0000\u01d5\u01d0\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d5\u01d2\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d6"+
		"9\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005L\u0000\u0000\u01d8\u01d9\u0003"+
		"\u008cF\u0000\u01d9;\u0001\u0000\u0000\u0000\u01da\u01df\u0003\u0090H"+
		"\u0000\u01db\u01df\u0003|>\u0000\u01dc\u01df\u0003x<\u0000\u01dd\u01df"+
		"\u0003z=\u0000\u01de\u01da\u0001\u0000\u0000\u0000\u01de\u01db\u0001\u0000"+
		"\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01de\u01dd\u0001\u0000"+
		"\u0000\u0000\u01df=\u0001\u0000\u0000\u0000\u01e0\u01e3\u0003v;\u0000"+
		"\u01e1\u01e3\u0003\u0080@\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e3?\u0001\u0000\u0000\u0000\u01e4\u01e9"+
		"\u0003\u0094J\u0000\u01e5\u01e9\u0003\u0092I\u0000\u01e6\u01e9\u0003\u0096"+
		"K\u0000\u01e7\u01e9\u0003\u0086C\u0000\u01e8\u01e4\u0001\u0000\u0000\u0000"+
		"\u01e8\u01e5\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000"+
		"\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e9A\u0001\u0000\u0000\u0000\u01ea"+
		"\u01eb\u0003\u008cF\u0000\u01ebC\u0001\u0000\u0000\u0000\u01ec\u01f0\u0003"+
		"v;\u0000\u01ed\u01f0\u0003\u008aE\u0000\u01ee\u01f0\u0003\u0088D\u0000"+
		"\u01ef\u01ec\u0001\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000"+
		"\u01ef\u01ee\u0001\u0000\u0000\u0000\u01f0E\u0001\u0000\u0000\u0000\u01f1"+
		"\u01f5\u0003v;\u0000\u01f2\u01f5\u0003\u008aE\u0000\u01f3\u01f5\u0003"+
		"\u0088D\u0000\u01f4\u01f1\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f5G\u0001\u0000\u0000"+
		"\u0000\u01f6\u01fa\u0003|>\u0000\u01f7\u01fa\u0003~?\u0000\u01f8\u01fa"+
		"\u0003t:\u0000\u01f9\u01f6\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001\u0000"+
		"\u0000\u0000\u01f9\u01f8\u0001\u0000\u0000\u0000\u01faI\u0001\u0000\u0000"+
		"\u0000\u01fb\u01ff\u0003\u0098L\u0000\u01fc\u01ff\u0003|>\u0000\u01fd"+
		"\u01ff\u0003\u0080@\u0000\u01fe\u01fb\u0001\u0000\u0000\u0000\u01fe\u01fc"+
		"\u0001\u0000\u0000\u0000\u01fe\u01fd\u0001\u0000\u0000\u0000\u01ffK\u0001"+
		"\u0000\u0000\u0000\u0200\u0201\u0003t:\u0000\u0201M\u0001\u0000\u0000"+
		"\u0000\u0202\u0205\u0003t:\u0000\u0203\u0205\u0003\u009aM\u0000\u0204"+
		"\u0202\u0001\u0000\u0000\u0000\u0204\u0203\u0001\u0000\u0000\u0000\u0205"+
		"O\u0001\u0000\u0000\u0000\u0206\u020a\u0003\u0082A\u0000\u0207\u020a\u0003"+
		"\u0086C\u0000\u0208\u020a\u0003\u0084B\u0000\u0209\u0206\u0001\u0000\u0000"+
		"\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u0208\u0001\u0000\u0000"+
		"\u0000\u020aQ\u0001\u0000\u0000\u0000\u020b\u020e\u0003\u009cN\u0000\u020c"+
		"\u020e\u0003\u009eO\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020d\u020c"+
		"\u0001\u0000\u0000\u0000\u020eS\u0001\u0000\u0000\u0000\u020f\u0212\u0003"+
		"\u00a0P\u0000\u0210\u0212\u0003\u0080@\u0000\u0211\u020f\u0001\u0000\u0000"+
		"\u0000\u0211\u0210\u0001\u0000\u0000\u0000\u0212U\u0001\u0000\u0000\u0000"+
		"\u0213\u0214\u0003v;\u0000\u0214W\u0001\u0000\u0000\u0000\u0215\u0219"+
		"\u0003\u0086C\u0000\u0216\u0219\u0003t:\u0000\u0217\u0219\u0003z=\u0000"+
		"\u0218\u0215\u0001\u0000\u0000\u0000\u0218\u0216\u0001\u0000\u0000\u0000"+
		"\u0218\u0217\u0001\u0000\u0000\u0000\u0219Y\u0001\u0000\u0000\u0000\u021a"+
		"\u021d\u0003t:\u0000\u021b\u021d\u0003\u0086C\u0000\u021c\u021a\u0001"+
		"\u0000\u0000\u0000\u021c\u021b\u0001\u0000\u0000\u0000\u021d[\u0001\u0000"+
		"\u0000\u0000\u021e\u0221\u0003v;\u0000\u021f\u0221\u0003\u0088D\u0000"+
		"\u0220\u021e\u0001\u0000\u0000\u0000\u0220\u021f\u0001\u0000\u0000\u0000"+
		"\u0221]\u0001\u0000\u0000\u0000\u0222\u0225\u0003t:\u0000\u0223\u0225"+
		"\u0003,\u0016\u0000\u0224\u0222\u0001\u0000\u0000\u0000\u0224\u0223\u0001"+
		"\u0000\u0000\u0000\u0225_\u0001\u0000\u0000\u0000\u0226\u0227\u0003\u008c"+
		"F\u0000\u0227a\u0001\u0000\u0000\u0000\u0228\u022b\u0003t:\u0000\u0229"+
		"\u022b\u0003\u008cF\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022a\u0229"+
		"\u0001\u0000\u0000\u0000\u022bc\u0001\u0000\u0000\u0000\u022c\u022f\u0003"+
		"\u00a2Q\u0000\u022d\u022f\u0003|>\u0000\u022e\u022c\u0001\u0000\u0000"+
		"\u0000\u022e\u022d\u0001\u0000\u0000\u0000\u022fe\u0001\u0000\u0000\u0000"+
		"\u0230\u0234\u0003t:\u0000\u0231\u0234\u0003x<\u0000\u0232\u0234\u0003"+
		"z=\u0000\u0233\u0230\u0001\u0000\u0000\u0000\u0233\u0231\u0001\u0000\u0000"+
		"\u0000\u0233\u0232\u0001\u0000\u0000\u0000\u0234g\u0001\u0000\u0000\u0000"+
		"\u0235\u0239\u0003\u0086C\u0000\u0236\u0239\u0003|>\u0000\u0237\u0239"+
		"\u0003\u008eG\u0000\u0238\u0235\u0001\u0000\u0000\u0000\u0238\u0236\u0001"+
		"\u0000\u0000\u0000\u0238\u0237\u0001\u0000\u0000\u0000\u0239i\u0001\u0000"+
		"\u0000\u0000\u023a\u023b\u0005*\u0000\u0000\u023b\u023c\u0005R\u0000\u0000"+
		"\u023c\u023d\u0003\u0000\u0000\u0000\u023dk\u0001\u0000\u0000\u0000\u023e"+
		"\u023f\u0005+\u0000\u0000\u023f\u0240\u0005R\u0000\u0000\u0240\u0241\u0003"+
		"&\u0013\u0000\u0241m\u0001\u0000\u0000\u0000\u0242\u0243\u0005,\u0000"+
		"\u0000\u0243\u0244\u0005R\u0000\u0000\u0244\u0245\u0003\u000e\u0007\u0000"+
		"\u0245o\u0001\u0000\u0000\u0000\u0246\u0247\u0005-\u0000\u0000\u0247\u0248"+
		"\u0005R\u0000\u0000\u0248\u0249\u0003\u001e\u000f\u0000\u0249q\u0001\u0000"+
		"\u0000\u0000\u024a\u024b\u0005.\u0000\u0000\u024b\u024c\u0005R\u0000\u0000"+
		"\u024c\u024d\u0003(\u0014\u0000\u024ds\u0001\u0000\u0000\u0000\u024e\u024f"+
		"\u00050\u0000\u0000\u024f\u0250\u0005R\u0000\u0000\u0250\u0251\u0003\u0000"+
		"\u0000\u0000\u0251u\u0001\u0000\u0000\u0000\u0252\u0253\u00051\u0000\u0000"+
		"\u0253\u0254\u0005R\u0000\u0000\u0254\u0258\u0005V\u0000\u0000\u0255\u0257"+
		"\u0003\u0000\u0000\u0000\u0256\u0255\u0001\u0000\u0000\u0000\u0257\u025a"+
		"\u0001\u0000\u0000\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0258\u0259"+
		"\u0001\u0000\u0000\u0000\u0259\u025b\u0001\u0000\u0000\u0000\u025a\u0258"+
		"\u0001\u0000\u0000\u0000\u025b\u025c\u0005W\u0000\u0000\u025cw\u0001\u0000"+
		"\u0000\u0000\u025d\u025e\u00053\u0000\u0000\u025e\u025f\u0005R\u0000\u0000"+
		"\u025f\u0260\u0007\u0000\u0000\u0000\u0260y\u0001\u0000\u0000\u0000\u0261"+
		"\u0262\u00052\u0000\u0000\u0262\u0263\u0005R\u0000\u0000\u0263\u0264\u0007"+
		"\u0000\u0000\u0000\u0264{\u0001\u0000\u0000\u0000\u0265\u0266\u00054\u0000"+
		"\u0000\u0266\u0267\u0005R\u0000\u0000\u0267\u0268\u0003\u00a4R\u0000\u0268"+
		"}\u0001\u0000\u0000\u0000\u0269\u026a\u0005?\u0000\u0000\u026a\u026b\u0005"+
		"R\u0000\u0000\u026b\u026c\u0007\u0000\u0000\u0000\u026c\u007f\u0001\u0000"+
		"\u0000\u0000\u026d\u026e\u0005@\u0000\u0000\u026e\u026f\u0005R\u0000\u0000"+
		"\u026f\u0270\u0007\u0000\u0000\u0000\u0270\u0081\u0001\u0000\u0000\u0000"+
		"\u0271\u0272\u0005>\u0000\u0000\u0272\u0273\u0005R\u0000\u0000\u0273\u0277"+
		"\u0005V\u0000\u0000\u0274\u0276\u0003\u0000\u0000\u0000\u0275\u0274\u0001"+
		"\u0000\u0000\u0000\u0276\u0279\u0001\u0000\u0000\u0000\u0277\u0275\u0001"+
		"\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u027a\u0001"+
		"\u0000\u0000\u0000\u0279\u0277\u0001\u0000\u0000\u0000\u027a\u027b\u0005"+
		"W\u0000\u0000\u027b\u0083\u0001\u0000\u0000\u0000\u027c\u027d\u0005=\u0000"+
		"\u0000\u027d\u027e\u0005R\u0000\u0000\u027e\u027f\u0005H\u0000\u0000\u027f"+
		"\u0085\u0001\u0000\u0000\u0000\u0280\u0281\u0005/\u0000\u0000\u0281\u0282"+
		"\u0005R\u0000\u0000\u0282\u0283\u0003\u00a4R\u0000\u0283\u0087\u0001\u0000"+
		"\u0000\u0000\u0284\u0285\u0005:\u0000\u0000\u0285\u0286\u0005R\u0000\u0000"+
		"\u0286\u0287\u0003\u00a6S\u0000\u0287\u0089\u0001\u0000\u0000\u0000\u0288"+
		"\u0289\u0005;\u0000\u0000\u0289\u028a\u0005R\u0000\u0000\u028a\u028b\u0003"+
		"\u00a6S\u0000\u028b\u008b\u0001\u0000\u0000\u0000\u028c\u028d\u0005A\u0000"+
		"\u0000\u028d\u028e\u0005R\u0000\u0000\u028e\u028f\u0003\b\u0004\u0000"+
		"\u028f\u008d\u0001\u0000\u0000\u0000\u0290\u0291\u0005B\u0000\u0000\u0291"+
		"\u0292\u0005R\u0000\u0000\u0292\u0293\u0007\u0000\u0000\u0000\u0293\u008f"+
		"\u0001\u0000\u0000\u0000\u0294\u0295\u0005C\u0000\u0000\u0295\u0296\u0005"+
		"R\u0000\u0000\u0296\u0091\u0001\u0000\u0000\u0000\u0297\u0298\u0005E\u0000"+
		"\u0000\u0298\u0299\u0005R\u0000\u0000\u0299\u029a\u0003\u0000\u0000\u0000"+
		"\u029a\u0093\u0001\u0000\u0000\u0000\u029b\u029c\u0005D\u0000\u0000\u029c"+
		"\u029d\u0005R\u0000\u0000\u029d\u029e\u0003\u0000\u0000\u0000\u029e\u0095"+
		"\u0001\u0000\u0000\u0000\u029f\u02a0\u0005F\u0000\u0000\u02a0\u02a1\u0005"+
		"R\u0000\u0000\u02a1\u02a5\u0005V\u0000\u0000\u02a2\u02a4\u0003\u0000\u0000"+
		"\u0000\u02a3\u02a2\u0001\u0000\u0000\u0000\u02a4\u02a7\u0001\u0000\u0000"+
		"\u0000\u02a5\u02a3\u0001\u0000\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000"+
		"\u0000\u02a6\u02a8\u0001\u0000\u0000\u0000\u02a7\u02a5\u0001\u0000\u0000"+
		"\u0000\u02a8\u02a9\u0005W\u0000\u0000\u02a9\u0097\u0001\u0000\u0000\u0000"+
		"\u02aa\u02ab\u00059\u0000\u0000\u02ab\u02ac\u0005R\u0000\u0000\u02ac\u02ad"+
		"\u0003\u0000\u0000\u0000\u02ad\u0099\u0001\u0000\u0000\u0000\u02ae\u02af"+
		"\u0005<\u0000\u0000\u02af\u02b0\u0005R\u0000\u0000\u02b0\u02b1\u0005H"+
		"\u0000\u0000\u02b1\u009b\u0001\u0000\u0000\u0000\u02b2\u02b3\u00057\u0000"+
		"\u0000\u02b3\u02b4\u0005R\u0000\u0000\u02b4\u02b5\u0007\u0000\u0000\u0000"+
		"\u02b5\u009d\u0001\u0000\u0000\u0000\u02b6\u02b7\u00056\u0000\u0000\u02b7"+
		"\u02b8\u0005R\u0000\u0000\u02b8\u02b9\u0007\u0000\u0000\u0000\u02b9\u009f"+
		"\u0001\u0000\u0000\u0000\u02ba\u02bb\u0005G\u0000\u0000\u02bb\u02bc\u0005"+
		"R\u0000\u0000\u02bc\u02c0\u0005V\u0000\u0000\u02bd\u02bf\u0003\u0000\u0000"+
		"\u0000\u02be\u02bd\u0001\u0000\u0000\u0000\u02bf\u02c2\u0001\u0000\u0000"+
		"\u0000\u02c0\u02be\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000\u0000"+
		"\u0000\u02c1\u02c3\u0001\u0000\u0000\u0000\u02c2\u02c0\u0001\u0000\u0000"+
		"\u0000\u02c3\u02c4\u0005W\u0000\u0000\u02c4\u00a1\u0001\u0000\u0000\u0000"+
		"\u02c5\u02c6\u0005j\u0000\u0000\u02c6\u02c7\u0005R\u0000\u0000\u02c7\u02c8"+
		"\u0007\u0000\u0000\u0000\u02c8\u00a3\u0001\u0000\u0000\u0000\u02c9\u02ca"+
		"\u0007\u0001\u0000\u0000\u02ca\u00a5\u0001\u0000\u0000\u0000\u02cb\u02cc"+
		"\u0007\u0002\u0000\u0000\u02cc\u00a7\u0001\u0000\u0000\u00004\u00c1\u00c8"+
		"\u00d2\u00dc\u00e6\u00f0\u00fa\u0104\u010e\u0118\u0122\u012c\u0136\u0140"+
		"\u014a\u0154\u015e\u0168\u0172\u017c\u0186\u0190\u019a\u01a4\u01ae\u01b8"+
		"\u01c2\u01cd\u01d5\u01de\u01e2\u01e8\u01ef\u01f4\u01f9\u01fe\u0204\u0209"+
		"\u020d\u0211\u0218\u021c\u0220\u0224\u022a\u022e\u0233\u0238\u0258\u0277"+
		"\u02a5\u02c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}