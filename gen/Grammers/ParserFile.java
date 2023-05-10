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
		SCAFFOLD=1, CONTAINER=2, ROW=3, COLUMN=4, LIST_VIEW=5, INKWELL=6, SIZED_BOX=7, 
		EXPANDED=8, CARD=9, ICON_BUTTON=10, PADDING=11, ICON=12, SLIDER=13, DRAWER=14, 
		WRAP=15, TEXTFORMFIELD=16, FLEX=17, TEXT_BUTTON=18, DECORATION=19, BODY_ATTR=20, 
		DRAWER_ATTR=21, APP_BAR_ATTR=22, BOTTOM_NAVIGATION_BAR_ATTR=23, FLOATING_ACTION_BUTTON_ATTR=24, 
		BACKGROUNG_COLOR_ATTR=25, CHILD_ATTR=26, CHILDREN_ATTR=27, WIDTH_ATTR=28, 
		HEIGHT_ATTR=29, COLOR_ATTR=30, DECORATION_ATTR=31, PADDING_ATTR=32, VALUE_ATTR=33, 
		ONCHANGED_ATTR=34, MAX_ATTR=35, MIN_ATTR=36, INACTIVE_COLOR_ATTR=37, LABEL_ATTR=38, 
		ELEVATION_ATTR=39, SPACING_ATTR=40, ALIGNMENT=41, DIRECTION_ATTR=42, LABEL_TEXT_ATTR=43, 
		HINT_TEXT_ATTR=44, PREFIX_iCON_ATTR=45, SUFFIX_ICON_ATTR=46, OBSCURE_TEXT_ATTR=47, 
		ON_TAP_ATTR=48, MAX_LENGTH_ATTR=49, ENABLED_ATTR=50, OPACITY_ATTR=51, 
		ICON_ATTR=52, ON_PRESSED_ATTR=53, ICON_SIZE_ATTR=54, CROSS_AXIS_ALIGNMENT_ATTR=55, 
		MAIN_AXIS_ALIGNMENT_ATTR=56, Main_Axis_Size_ATTR=57, FLEX_ATTR=58, CURRENT_INDEX_ATTR=59, 
		ITEMS_ATTR=60, BOTTOM_NAVIGATION_BAR_ITEM=61, COLORS=62, EDGEINSETS=63, 
		INT=64, DOUBLE=65, ID=66, FLOAT=67, STRING=68, IDENTIFIER=69, ARROW=70, 
		WS=71, COMMA=72, SEMICOLON=73, COLON=74, DOT=75, OPEN_PAREN=76, CLOSE_PAREN=77, 
		OPEN_SQUARE=78, CLOSE_SQUARE=79, OPEN_BRACE=80, CLOSE_BRACE=81, PLUS=82, 
		MINUS=83, MULTIPLY=84, DIVISION=85, EQUAL=86, LARGER=87, SMALLER=88, LARGER_OR_EQUAL=89, 
		SMALLER_OR_EQUAL=90, NOT_EQUAL=91, AND=92, OR=93, NOT=94, QUOTES_SQ=95, 
		QUOTES_DQ=96, PRINT=97, RED=98, BLUE=99, YELLOW=100, BLACK=101, WHITE=102, 
		GREY=103, GREEN=104, GOLD=105, PURBLE=106, PINK=107, ITALIC=108, NORMAL=109, 
		END=110, CENTER=111, SPACE_BETWEEN=112, START=113, AXIS=114, HORIZONTAL=115, 
		VERTICAL=116, TRUE=117, FALSE=118, VALUE=119, ONCHANGED=120, MAX=121, 
		MIN=122, INACTIVE_COLOR=123, LABEL=124, LISTVIEW=125, ICONBUTTON=126, 
		SIZEDBOX=127, CURRENTINDEX=128, ITEMS=129, SQUARE_OPEN=130, SQUARE_CLOSE=131, 
		CROSSAXISALIGNMENT=132, CROSSAXISALIGNMENT_CLASS=133, MAINAXISALIGNMENT=134, 
		MAINAXISALIGNMENT_CLASS=135, CHILDREN=136, CHILD=137, ONTAP=138, Colon=139, 
		ONPRESSED=140, WIDTH=141, HEIGHT=142, COLOR=143, Comma=144, CURLY_OPEN=145, 
		CURLY_CLOSE=146, IF=147, ELSE=148, WHILE=149, ELEVATION=150, ICON_CLASS=151;
	public static final int
		RULE_widget = 0, RULE_scaffold = 1, RULE_container = 2, RULE_text = 3, 
		RULE_image = 4, RULE_listView = 5, RULE_appBar = 6, RULE_textField = 7, 
		RULE_column = 8, RULE_row = 9, RULE_card = 10, RULE_iconButton = 11, RULE_checkBox = 12, 
		RULE_radio = 13, RULE_inkWell = 14, RULE_expanded = 15, RULE_bottomNavigationBar = 16, 
		RULE_slider = 17, RULE_tabBar = 18, RULE_tabView = 19, RULE_drawer = 20, 
		RULE_floatingActionButton = 21, RULE_wrap = 22, RULE_flex = 23, RULE_textFormField = 24, 
		RULE_textButton = 25, RULE_icon = 26, RULE_sizedBox = 27, RULE_decoration = 28, 
		RULE_padding = 29, RULE_bottomNavigationBarArgs = 30, RULE_currentIndex = 31, 
		RULE_items = 32, RULE_bottomNavigationBarItem = 33, RULE_label = 34, RULE_scaffoldAttributes = 35, 
		RULE_scaffoldAttrBody = 36, RULE_scaffoldAttrDrawer = 37, RULE_scaffoldAttrAppBar = 38, 
		RULE_scaffoldAttrBottomNavigationBar = 39, RULE_scaffoldAttrFloatingActionButton = 40, 
		RULE_containerAttributes = 41, RULE_decorationAttr = 42, RULE_paddingAttr = 43, 
		RULE_sliderAttributes = 44, RULE_sharedBackGroundColorAttr = 45, RULE_sharedChildAttr = 46, 
		RULE_sharedWidthAttr = 47, RULE_sharedHeightAttr = 48, RULE_sharedColorAttr = 49, 
		RULE_sharedDecorationAttr = 50, RULE_sharedPaddingAttr = 51, RULE_crossAxisAlignmentCrossAxisAlignmentContent = 52, 
		RULE_mainAxisAlignmentMainAxisAlignmentContent = 53, RULE_children = 54, 
		RULE_child = 55, RULE_onTap = 56, RULE_onPressed = 57, RULE_width = 58, 
		RULE_height = 59, RULE_color = 60, RULE_colorValue = 61, RULE_colorClass = 62, 
		RULE_colorStatic = 63, RULE_functionExpr = 64, RULE_parameterList = 65, 
		RULE_functionBody = 66, RULE_expression = 67, RULE_block = 68, RULE_statement = 69, 
		RULE_expr_Stmt = 70, RULE_if_Stmt = 71, RULE_while_Stmt = 72, RULE_print_Stmt = 73, 
		RULE_expr = 74, RULE_listviewArgs = 75, RULE_columnArgs = 76, RULE_rowArgs = 77, 
		RULE_inkwellArgs = 78, RULE_expandedArgs = 79, RULE_expandedflex = 80, 
		RULE_cardArgs = 81, RULE_elevationArgs = 82, RULE_iconArgs = 83, RULE_iconParam = 84;
	private static String[] makeRuleNames() {
		return new String[] {
			"widget", "scaffold", "container", "text", "image", "listView", "appBar", 
			"textField", "column", "row", "card", "iconButton", "checkBox", "radio", 
			"inkWell", "expanded", "bottomNavigationBar", "slider", "tabBar", "tabView", 
			"drawer", "floatingActionButton", "wrap", "flex", "textFormField", "textButton", 
			"icon", "sizedBox", "decoration", "padding", "bottomNavigationBarArgs", 
			"currentIndex", "items", "bottomNavigationBarItem", "label", "scaffoldAttributes", 
			"scaffoldAttrBody", "scaffoldAttrDrawer", "scaffoldAttrAppBar", "scaffoldAttrBottomNavigationBar", 
			"scaffoldAttrFloatingActionButton", "containerAttributes", "decorationAttr", 
			"paddingAttr", "sliderAttributes", "sharedBackGroundColorAttr", "sharedChildAttr", 
			"sharedWidthAttr", "sharedHeightAttr", "sharedColorAttr", "sharedDecorationAttr", 
			"sharedPaddingAttr", "crossAxisAlignmentCrossAxisAlignmentContent", "mainAxisAlignmentMainAxisAlignmentContent", 
			"children", "child", "onTap", "onPressed", "width", "height", "color", 
			"colorValue", "colorClass", "colorStatic", "functionExpr", "parameterList", 
			"functionBody", "expression", "block", "statement", "expr_Stmt", "if_Stmt", 
			"while_Stmt", "print_Stmt", "expr", "listviewArgs", "columnArgs", "rowArgs", 
			"inkwellArgs", "expandedArgs", "expandedflex", "cardArgs", "elevationArgs", 
			"iconArgs", "iconParam"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Scaffold'", "'Container'", "'Row'", "'Column'", "'ListView'", 
			"'InkWell'", "'SizedBox'", "'Expanded'", "'Card'", "'IconButton'", "'Padding'", 
			"'Icon'", "'Slider'", "'Drawer'", "'Wrap'", "'TextFormField'", "'Flex'", 
			"'TextButton'", "'Decoration'", "'body'", "'drawer'", "'appBar'", "'bottonNavigationBar'", 
			"'floatinActionButton'", "'backgroundColor'", "'child'", "'children'", 
			"'width'", "'height'", "'color'", "'decoration'", "'padding'", null, 
			null, null, null, null, null, "'elevation'", "'spacing'", "'alignment'", 
			"'direction'", "'labelText'", "'hintText'", "'prefixIcon'", "'suffixIcon'", 
			"'obscureText'", "'onTap'", "'maxLength'", "'enabled'", "'opacity'", 
			"'icon'", "'onPressed'", "'iconSize'", "'crossAxisAlignment'", "'mainAxisAlignment'", 
			"'mainAxisSize'", "'flex'", "'currentIndex'", "'items'", "'BottomNavigationBarItem'", 
			"'Colors'", "'EdgeInsets'", null, null, null, null, null, null, "'=>'", 
			null, "','", null, "':'", "'.'", null, null, "'['", "']'", "'{'", "'}'", 
			"'+'", "'-'", "'*'", "'/'", "'='", "'>'", "'<'", "'>='", "'<='", "'!='", 
			"'&&'", "'||'", "'!'", "''''", "'\"\"'", "'print'", "'red'", "'blue'", 
			"'yellow'", "'black'", "'white'", "'grey'", "'green'", "'gold'", "'purble'", 
			"'pink'", "'italic'", "'normal'", "'end'", "'center'", "'spaceBetween'", 
			"'start'", "'Axis'", "'horizontal'", "'vertical'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SCAFFOLD", "CONTAINER", "ROW", "COLUMN", "LIST_VIEW", "INKWELL", 
			"SIZED_BOX", "EXPANDED", "CARD", "ICON_BUTTON", "PADDING", "ICON", "SLIDER", 
			"DRAWER", "WRAP", "TEXTFORMFIELD", "FLEX", "TEXT_BUTTON", "DECORATION", 
			"BODY_ATTR", "DRAWER_ATTR", "APP_BAR_ATTR", "BOTTOM_NAVIGATION_BAR_ATTR", 
			"FLOATING_ACTION_BUTTON_ATTR", "BACKGROUNG_COLOR_ATTR", "CHILD_ATTR", 
			"CHILDREN_ATTR", "WIDTH_ATTR", "HEIGHT_ATTR", "COLOR_ATTR", "DECORATION_ATTR", 
			"PADDING_ATTR", "VALUE_ATTR", "ONCHANGED_ATTR", "MAX_ATTR", "MIN_ATTR", 
			"INACTIVE_COLOR_ATTR", "LABEL_ATTR", "ELEVATION_ATTR", "SPACING_ATTR", 
			"ALIGNMENT", "DIRECTION_ATTR", "LABEL_TEXT_ATTR", "HINT_TEXT_ATTR", "PREFIX_iCON_ATTR", 
			"SUFFIX_ICON_ATTR", "OBSCURE_TEXT_ATTR", "ON_TAP_ATTR", "MAX_LENGTH_ATTR", 
			"ENABLED_ATTR", "OPACITY_ATTR", "ICON_ATTR", "ON_PRESSED_ATTR", "ICON_SIZE_ATTR", 
			"CROSS_AXIS_ALIGNMENT_ATTR", "MAIN_AXIS_ALIGNMENT_ATTR", "Main_Axis_Size_ATTR", 
			"FLEX_ATTR", "CURRENT_INDEX_ATTR", "ITEMS_ATTR", "BOTTOM_NAVIGATION_BAR_ITEM", 
			"COLORS", "EDGEINSETS", "INT", "DOUBLE", "ID", "FLOAT", "STRING", "IDENTIFIER", 
			"ARROW", "WS", "COMMA", "SEMICOLON", "COLON", "DOT", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_SQUARE", "CLOSE_SQUARE", "OPEN_BRACE", "CLOSE_BRACE", "PLUS", "MINUS", 
			"MULTIPLY", "DIVISION", "EQUAL", "LARGER", "SMALLER", "LARGER_OR_EQUAL", 
			"SMALLER_OR_EQUAL", "NOT_EQUAL", "AND", "OR", "NOT", "QUOTES_SQ", "QUOTES_DQ", 
			"PRINT", "RED", "BLUE", "YELLOW", "BLACK", "WHITE", "GREY", "GREEN", 
			"GOLD", "PURBLE", "PINK", "ITALIC", "NORMAL", "END", "CENTER", "SPACE_BETWEEN", 
			"START", "AXIS", "HORIZONTAL", "VERTICAL", "TRUE", "FALSE", "VALUE", 
			"ONCHANGED", "MAX", "MIN", "INACTIVE_COLOR", "LABEL", "LISTVIEW", "ICONBUTTON", 
			"SIZEDBOX", "CURRENTINDEX", "ITEMS", "SQUARE_OPEN", "SQUARE_CLOSE", "CROSSAXISALIGNMENT", 
			"CROSSAXISALIGNMENT_CLASS", "MAINAXISALIGNMENT", "MAINAXISALIGNMENT_CLASS", 
			"CHILDREN", "CHILD", "ONTAP", "Colon", "ONPRESSED", "WIDTH", "HEIGHT", 
			"COLOR", "Comma", "CURLY_OPEN", "CURLY_CLOSE", "IF", "ELSE", "WHILE", 
			"ELEVATION", "ICON_CLASS"
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
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				scaffold();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				container();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				text();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				image();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				listView();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(175);
				appBar();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(176);
				textField();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(177);
				column();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(178);
				row();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(179);
				card();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(180);
				iconButton();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(181);
				checkBox();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(182);
				radio();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(183);
				inkWell();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(184);
				expanded();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(185);
				bottomNavigationBar();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(186);
				slider();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(187);
				tabBar();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(188);
				tabView();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(189);
				drawer();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(190);
				floatingActionButton();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(191);
				wrap();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(192);
				flex();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(193);
				textFormField();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(194);
				textButton();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(195);
				icon();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(196);
				sizedBox();
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
			setState(199);
			match(SCAFFOLD);
			setState(200);
			match(OPEN_PAREN);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(201);
					scaffoldAttributes();
					setState(202);
					match(COMMA);
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BODY_ATTR) | (1L << DRAWER_ATTR) | (1L << APP_BAR_ATTR) | (1L << BOTTOM_NAVIGATION_BAR_ATTR) | (1L << FLOATING_ACTION_BUTTON_ATTR) | (1L << BACKGROUNG_COLOR_ATTR))) != 0)) {
				{
				setState(209);
				scaffoldAttributes();
				}
			}

			setState(212);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(CONTAINER);
			setState(215);
			match(OPEN_PAREN);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216);
					containerAttributes();
					setState(217);
					match(COMMA);
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHILD_ATTR) | (1L << WIDTH_ATTR) | (1L << HEIGHT_ATTR) | (1L << COLOR_ATTR) | (1L << DECORATION_ATTR) | (1L << PADDING_ATTR))) != 0)) {
				{
				setState(224);
				containerAttributes();
				}
			}

			setState(227);
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
			setState(229);
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
			setState(231);
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
		public TerminalNode LISTVIEW() { return getToken(ParserFile.LISTVIEW, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public ListviewArgsContext listviewArgs() {
			return getRuleContext(ListviewArgsContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
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
			setState(233);
			match(LISTVIEW);
			setState(234);
			match(OPEN_PAREN);
			setState(235);
			listviewArgs();
			setState(236);
			match(CLOSE_PAREN);
			setState(237);
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
			setState(239);
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
			setState(241);
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
		public TerminalNode COLUMN() { return getToken(ParserFile.COLUMN, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public ColumnArgsContext columnArgs() {
			return getRuleContext(ColumnArgsContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
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
			setState(243);
			match(COLUMN);
			setState(244);
			match(OPEN_PAREN);
			setState(245);
			columnArgs();
			setState(246);
			match(CLOSE_PAREN);
			setState(247);
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
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public RowArgsContext rowArgs() {
			return getRuleContext(RowArgsContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
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
			setState(249);
			match(ROW);
			setState(250);
			match(OPEN_PAREN);
			setState(251);
			rowArgs();
			setState(252);
			match(CLOSE_PAREN);
			setState(253);
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

	public static class CardContext extends ParserRuleContext {
		public TerminalNode CARD() { return getToken(ParserFile.CARD, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public CardArgsContext cardArgs() {
			return getRuleContext(CardArgsContext.class,0);
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
		enterRule(_localctx, 20, RULE_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(CARD);
			setState(256);
			match(OPEN_PAREN);
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(257);
				cardArgs();
				}
				break;
			}
			setState(260);
			match(CLOSE_PAREN);
			setState(261);
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

	public static class IconButtonContext extends ParserRuleContext {
		public TerminalNode ICONBUTTON() { return getToken(ParserFile.ICONBUTTON, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public IconArgsContext iconArgs() {
			return getRuleContext(IconArgsContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
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
			setState(263);
			match(ICONBUTTON);
			setState(264);
			match(OPEN_PAREN);
			setState(265);
			iconArgs();
			setState(266);
			match(CLOSE_PAREN);
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
			setState(269);
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
			setState(271);
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
		public TerminalNode INKWELL() { return getToken(ParserFile.INKWELL, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public InkwellArgsContext inkwellArgs() {
			return getRuleContext(InkwellArgsContext.class,0);
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
		enterRule(_localctx, 28, RULE_inkWell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(INKWELL);
			setState(274);
			match(OPEN_PAREN);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD || _la==ONTAP) {
				{
				setState(275);
				inkwellArgs();
				}
			}

			setState(278);
			match(CLOSE_PAREN);
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

	public static class ExpandedContext extends ParserRuleContext {
		public TerminalNode EXPANDED() { return getToken(ParserFile.EXPANDED, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public ExpandedArgsContext expandedArgs() {
			return getRuleContext(ExpandedArgsContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
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
			setState(281);
			match(EXPANDED);
			setState(282);
			match(OPEN_PAREN);
			setState(283);
			expandedArgs();
			setState(284);
			match(CLOSE_PAREN);
			setState(285);
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

	public static class BottomNavigationBarContext extends ParserRuleContext {
		public TerminalNode BOTTOM_NAVIGATION_BAR_ATTR() { return getToken(ParserFile.BOTTOM_NAVIGATION_BAR_ATTR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public BottomNavigationBarArgsContext bottomNavigationBarArgs() {
			return getRuleContext(BottomNavigationBarArgsContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
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
			setState(287);
			match(BOTTOM_NAVIGATION_BAR_ATTR);
			setState(288);
			match(OPEN_PAREN);
			setState(289);
			bottomNavigationBarArgs();
			setState(290);
			match(CLOSE_PAREN);
			setState(291);
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
			setState(293);
			match(SLIDER);
			setState(294);
			match(OPEN_PAREN);
			setState(295);
			sliderAttributes();
			setState(296);
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
			setState(298);
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
			setState(300);
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
			setState(302);
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
			setState(304);
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
			setState(306);
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
			setState(308);
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
			setState(310);
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
			setState(312);
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
			setState(314);
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

	public static class SizedBoxContext extends ParserRuleContext {
		public TerminalNode SIZEDBOX() { return getToken(ParserFile.SIZEDBOX, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public HeightContext height() {
			return getRuleContext(HeightContext.class,0);
		}
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
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
		enterRule(_localctx, 54, RULE_sizedBox);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(SIZEDBOX);
			setState(317);
			match(OPEN_PAREN);
			setState(318);
			width();
			setState(319);
			match(COMMA);
			setState(320);
			height();
			setState(321);
			match(COMMA);
			setState(322);
			child();
			setState(323);
			match(CLOSE_PAREN);
			setState(324);
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

	public static class DecorationContext extends ParserRuleContext {
		public TerminalNode DECORATION() { return getToken(ParserFile.DECORATION, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<DecorationAttrContext> decorationAttr() {
			return getRuleContexts(DecorationAttrContext.class);
		}
		public DecorationAttrContext decorationAttr(int i) {
			return getRuleContext(DecorationAttrContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public DecorationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterDecoration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitDecoration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitDecoration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecorationContext decoration() throws RecognitionException {
		DecorationContext _localctx = new DecorationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_decoration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(DECORATION);
			setState(327);
			match(OPEN_PAREN);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(328);
				decorationAttr();
				setState(329);
				match(COMMA);
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(336);
				decorationAttr();
				}
				break;
			}
			setState(339);
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

	public static class PaddingContext extends ParserRuleContext {
		public TerminalNode EDGEINSETS() { return getToken(ParserFile.EDGEINSETS, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<PaddingAttrContext> paddingAttr() {
			return getRuleContexts(PaddingAttrContext.class);
		}
		public PaddingAttrContext paddingAttr(int i) {
			return getRuleContext(PaddingAttrContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
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
		enterRule(_localctx, 58, RULE_padding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(EDGEINSETS);
			setState(342);
			match(OPEN_PAREN);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(343);
				paddingAttr();
				setState(344);
				match(COMMA);
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(351);
				paddingAttr();
				}
				break;
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

	public static class BottomNavigationBarArgsContext extends ParserRuleContext {
		public CurrentIndexContext currentIndex() {
			return getRuleContext(CurrentIndexContext.class,0);
		}
		public OnTapContext onTap() {
			return getRuleContext(OnTapContext.class,0);
		}
		public ItemsContext items() {
			return getRuleContext(ItemsContext.class,0);
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
		enterRule(_localctx, 60, RULE_bottomNavigationBarArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			currentIndex();
			setState(357);
			onTap();
			setState(358);
			items();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode CURRENTINDEX() { return getToken(ParserFile.CURRENTINDEX, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode INT() { return getToken(ParserFile.INT, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
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
		enterRule(_localctx, 62, RULE_currentIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(CURRENTINDEX);
			setState(361);
			match(COLON);
			setState(362);
			match(INT);
			setState(363);
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

	public static class ItemsContext extends ParserRuleContext {
		public TerminalNode ITEMS() { return getToken(ParserFile.ITEMS, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode SQUARE_OPEN() { return getToken(ParserFile.SQUARE_OPEN, 0); }
		public TerminalNode SQUARE_CLOSE() { return getToken(ParserFile.SQUARE_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public List<BottomNavigationBarItemContext> bottomNavigationBarItem() {
			return getRuleContexts(BottomNavigationBarItemContext.class);
		}
		public BottomNavigationBarItemContext bottomNavigationBarItem(int i) {
			return getRuleContext(BottomNavigationBarItemContext.class,i);
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
		enterRule(_localctx, 64, RULE_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(ITEMS);
			setState(366);
			match(COLON);
			setState(367);
			match(SQUARE_OPEN);
			setState(369); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(368);
				bottomNavigationBarItem();
				}
				}
				setState(371); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BOTTOM_NAVIGATION_BAR_ITEM );
			setState(373);
			match(SQUARE_CLOSE);
			setState(374);
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

	public static class BottomNavigationBarItemContext extends ParserRuleContext {
		public TerminalNode BOTTOM_NAVIGATION_BAR_ITEM() { return getToken(ParserFile.BOTTOM_NAVIGATION_BAR_ITEM, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public IconContext icon() {
			return getRuleContext(IconContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public BottomNavigationBarItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bottomNavigationBarItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBottomNavigationBarItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBottomNavigationBarItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBottomNavigationBarItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BottomNavigationBarItemContext bottomNavigationBarItem() throws RecognitionException {
		BottomNavigationBarItemContext _localctx = new BottomNavigationBarItemContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_bottomNavigationBarItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(BOTTOM_NAVIGATION_BAR_ITEM);
			setState(377);
			match(OPEN_PAREN);
			setState(378);
			icon();
			setState(379);
			label();
			setState(380);
			match(CLOSE_PAREN);
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(ParserFile.LABEL, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode STRING() { return getToken(ParserFile.STRING, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(LABEL);
			setState(384);
			match(COLON);
			setState(385);
			match(STRING);
			setState(386);
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
		public SharedBackGroundColorAttrContext sharedBackGroundColorAttr() {
			return getRuleContext(SharedBackGroundColorAttrContext.class,0);
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
		enterRule(_localctx, 70, RULE_scaffoldAttributes);
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BODY_ATTR:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				scaffoldAttrBody();
				}
				break;
			case DRAWER_ATTR:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				scaffoldAttrDrawer();
				}
				break;
			case APP_BAR_ATTR:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				scaffoldAttrAppBar();
				}
				break;
			case BOTTOM_NAVIGATION_BAR_ATTR:
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				scaffoldAttrBottomNavigationBar();
				}
				break;
			case FLOATING_ACTION_BUTTON_ATTR:
				enterOuterAlt(_localctx, 5);
				{
				setState(392);
				scaffoldAttrFloatingActionButton();
				}
				break;
			case BACKGROUNG_COLOR_ATTR:
				enterOuterAlt(_localctx, 6);
				{
				setState(393);
				sharedBackGroundColorAttr();
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
		enterRule(_localctx, 72, RULE_scaffoldAttrBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(BODY_ATTR);
			setState(397);
			match(COLON);
			setState(398);
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
		enterRule(_localctx, 74, RULE_scaffoldAttrDrawer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(DRAWER_ATTR);
			setState(401);
			match(COLON);
			setState(402);
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
		enterRule(_localctx, 76, RULE_scaffoldAttrAppBar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(APP_BAR_ATTR);
			setState(405);
			match(COLON);
			setState(406);
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
		enterRule(_localctx, 78, RULE_scaffoldAttrBottomNavigationBar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(BOTTOM_NAVIGATION_BAR_ATTR);
			setState(409);
			match(COLON);
			setState(410);
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
		enterRule(_localctx, 80, RULE_scaffoldAttrFloatingActionButton);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(FLOATING_ACTION_BUTTON_ATTR);
			setState(413);
			match(COLON);
			setState(414);
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
		public SharedChildAttrContext sharedChildAttr() {
			return getRuleContext(SharedChildAttrContext.class,0);
		}
		public SharedWidthAttrContext sharedWidthAttr() {
			return getRuleContext(SharedWidthAttrContext.class,0);
		}
		public SharedHeightAttrContext sharedHeightAttr() {
			return getRuleContext(SharedHeightAttrContext.class,0);
		}
		public SharedColorAttrContext sharedColorAttr() {
			return getRuleContext(SharedColorAttrContext.class,0);
		}
		public SharedDecorationAttrContext sharedDecorationAttr() {
			return getRuleContext(SharedDecorationAttrContext.class,0);
		}
		public SharedPaddingAttrContext sharedPaddingAttr() {
			return getRuleContext(SharedPaddingAttrContext.class,0);
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
		enterRule(_localctx, 82, RULE_containerAttributes);
		try {
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD_ATTR:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				sharedChildAttr();
				}
				break;
			case WIDTH_ATTR:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				sharedWidthAttr();
				}
				break;
			case HEIGHT_ATTR:
				enterOuterAlt(_localctx, 3);
				{
				setState(418);
				sharedHeightAttr();
				}
				break;
			case COLOR_ATTR:
				enterOuterAlt(_localctx, 4);
				{
				setState(419);
				sharedColorAttr();
				}
				break;
			case DECORATION_ATTR:
				enterOuterAlt(_localctx, 5);
				{
				setState(420);
				sharedDecorationAttr();
				}
				break;
			case PADDING_ATTR:
				enterOuterAlt(_localctx, 6);
				{
				setState(421);
				sharedPaddingAttr();
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
		enterRule(_localctx, 84, RULE_decorationAttr);
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

	public static class PaddingAttrContext extends ParserRuleContext {
		public PaddingAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paddingAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterPaddingAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitPaddingAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitPaddingAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaddingAttrContext paddingAttr() throws RecognitionException {
		PaddingAttrContext _localctx = new PaddingAttrContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_paddingAttr);
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
		enterRule(_localctx, 88, RULE_sliderAttributes);
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

	public static class SharedBackGroundColorAttrContext extends ParserRuleContext {
		public TerminalNode BACKGROUNG_COLOR_ATTR() { return getToken(ParserFile.BACKGROUNG_COLOR_ATTR, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public ColorClassContext colorClass() {
			return getRuleContext(ColorClassContext.class,0);
		}
		public SharedBackGroundColorAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sharedBackGroundColorAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSharedBackGroundColorAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSharedBackGroundColorAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSharedBackGroundColorAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SharedBackGroundColorAttrContext sharedBackGroundColorAttr() throws RecognitionException {
		SharedBackGroundColorAttrContext _localctx = new SharedBackGroundColorAttrContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_sharedBackGroundColorAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(BACKGROUNG_COLOR_ATTR);
			setState(431);
			match(COLON);
			setState(432);
			colorClass();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SharedChildAttrContext extends ParserRuleContext {
		public TerminalNode CHILD_ATTR() { return getToken(ParserFile.CHILD_ATTR, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public SharedChildAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sharedChildAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSharedChildAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSharedChildAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSharedChildAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SharedChildAttrContext sharedChildAttr() throws RecognitionException {
		SharedChildAttrContext _localctx = new SharedChildAttrContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_sharedChildAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(CHILD_ATTR);
			setState(435);
			match(COLON);
			setState(436);
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

	public static class SharedWidthAttrContext extends ParserRuleContext {
		public TerminalNode WIDTH_ATTR() { return getToken(ParserFile.WIDTH_ATTR, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode DOUBLE() { return getToken(ParserFile.DOUBLE, 0); }
		public SharedWidthAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sharedWidthAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSharedWidthAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSharedWidthAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSharedWidthAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SharedWidthAttrContext sharedWidthAttr() throws RecognitionException {
		SharedWidthAttrContext _localctx = new SharedWidthAttrContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_sharedWidthAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(WIDTH_ATTR);
			setState(439);
			match(COLON);
			setState(440);
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

	public static class SharedHeightAttrContext extends ParserRuleContext {
		public TerminalNode HEIGHT_ATTR() { return getToken(ParserFile.HEIGHT_ATTR, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode DOUBLE() { return getToken(ParserFile.DOUBLE, 0); }
		public SharedHeightAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sharedHeightAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSharedHeightAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSharedHeightAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSharedHeightAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SharedHeightAttrContext sharedHeightAttr() throws RecognitionException {
		SharedHeightAttrContext _localctx = new SharedHeightAttrContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_sharedHeightAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(HEIGHT_ATTR);
			setState(443);
			match(COLON);
			setState(444);
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

	public static class SharedColorAttrContext extends ParserRuleContext {
		public TerminalNode COLOR_ATTR() { return getToken(ParserFile.COLOR_ATTR, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public ColorClassContext colorClass() {
			return getRuleContext(ColorClassContext.class,0);
		}
		public SharedColorAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sharedColorAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSharedColorAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSharedColorAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSharedColorAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SharedColorAttrContext sharedColorAttr() throws RecognitionException {
		SharedColorAttrContext _localctx = new SharedColorAttrContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_sharedColorAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(COLOR_ATTR);
			setState(447);
			match(COLON);
			setState(448);
			colorClass();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SharedDecorationAttrContext extends ParserRuleContext {
		public TerminalNode DECORATION_ATTR() { return getToken(ParserFile.DECORATION_ATTR, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public DecorationContext decoration() {
			return getRuleContext(DecorationContext.class,0);
		}
		public SharedDecorationAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sharedDecorationAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSharedDecorationAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSharedDecorationAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSharedDecorationAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SharedDecorationAttrContext sharedDecorationAttr() throws RecognitionException {
		SharedDecorationAttrContext _localctx = new SharedDecorationAttrContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_sharedDecorationAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(DECORATION_ATTR);
			setState(451);
			match(COLON);
			setState(452);
			decoration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SharedPaddingAttrContext extends ParserRuleContext {
		public TerminalNode PADDING_ATTR() { return getToken(ParserFile.PADDING_ATTR, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public PaddingContext padding() {
			return getRuleContext(PaddingContext.class,0);
		}
		public SharedPaddingAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sharedPaddingAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSharedPaddingAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSharedPaddingAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSharedPaddingAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SharedPaddingAttrContext sharedPaddingAttr() throws RecognitionException {
		SharedPaddingAttrContext _localctx = new SharedPaddingAttrContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_sharedPaddingAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(PADDING_ATTR);
			setState(455);
			match(COLON);
			setState(456);
			padding();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 104, RULE_crossAxisAlignmentCrossAxisAlignmentContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(CROSSAXISALIGNMENT);
			setState(459);
			match(COLON);
			setState(460);
			match(CROSSAXISALIGNMENT_CLASS);
			setState(461);
			match(DOT);
			setState(462);
			match(IDENTIFIER);
			setState(463);
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
		enterRule(_localctx, 106, RULE_mainAxisAlignmentMainAxisAlignmentContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(MAINAXISALIGNMENT);
			setState(466);
			match(COLON);
			setState(467);
			match(MAINAXISALIGNMENT_CLASS);
			setState(468);
			match(DOT);
			setState(469);
			match(IDENTIFIER);
			setState(470);
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

	public static class ChildrenContext extends ParserRuleContext {
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
		enterRule(_localctx, 108, RULE_children);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(CHILDREN);
			setState(473);
			match(COLON);
			setState(474);
			match(SQUARE_OPEN);
			setState(476); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(475);
				widget();
				}
				}
				setState(478); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCAFFOLD) | (1L << CONTAINER) | (1L << ROW) | (1L << COLUMN) | (1L << INKWELL) | (1L << EXPANDED) | (1L << CARD) | (1L << SLIDER) | (1L << BOTTOM_NAVIGATION_BAR_ATTR))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (COLON - 74)) | (1L << (LISTVIEW - 74)) | (1L << (ICONBUTTON - 74)) | (1L << (SIZEDBOX - 74)))) != 0) );
			setState(480);
			match(SQUARE_CLOSE);
			setState(481);
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
		enterRule(_localctx, 110, RULE_child);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(CHILD);
			setState(484);
			match(COLON);
			setState(485);
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

	public static class OnTapContext extends ParserRuleContext {
		public TerminalNode ONTAP() { return getToken(ParserFile.ONTAP, 0); }
		public TerminalNode Colon() { return getToken(ParserFile.Colon, 0); }
		public FunctionExprContext functionExpr() {
			return getRuleContext(FunctionExprContext.class,0);
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
		enterRule(_localctx, 112, RULE_onTap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(ONTAP);
			setState(488);
			match(Colon);
			setState(489);
			functionExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnPressedContext extends ParserRuleContext {
		public TerminalNode ONPRESSED() { return getToken(ParserFile.ONPRESSED, 0); }
		public TerminalNode Colon() { return getToken(ParserFile.Colon, 0); }
		public FunctionExprContext functionExpr() {
			return getRuleContext(FunctionExprContext.class,0);
		}
		public OnPressedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onPressed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterOnPressed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitOnPressed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitOnPressed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnPressedContext onPressed() throws RecognitionException {
		OnPressedContext _localctx = new OnPressedContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_onPressed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(ONPRESSED);
			setState(492);
			match(Colon);
			setState(493);
			functionExpr();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
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
		enterRule(_localctx, 116, RULE_width);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(WIDTH);
			setState(496);
			match(COLON);
			setState(497);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(498);
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

	public static class HeightContext extends ParserRuleContext {
		public TerminalNode HEIGHT() { return getToken(ParserFile.HEIGHT, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
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
		enterRule(_localctx, 118, RULE_height);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(HEIGHT);
			setState(501);
			match(COLON);
			setState(502);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(503);
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

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(ParserFile.COLOR, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode COLORS() { return getToken(ParserFile.COLORS, 0); }
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public ColorValueContext colorValue() {
			return getRuleContext(ColorValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
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
		enterRule(_localctx, 120, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(COLOR);
			setState(506);
			match(COLON);
			setState(507);
			match(COLORS);
			setState(508);
			match(DOT);
			setState(509);
			colorValue();
			setState(510);
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

	public static class ColorValueContext extends ParserRuleContext {
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
		public ColorValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterColorValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitColorValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitColorValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorValueContext colorValue() throws RecognitionException {
		ColorValueContext _localctx = new ColorValueContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_colorValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_la = _input.LA(1);
			if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (RED - 98)) | (1L << (BLUE - 98)) | (1L << (YELLOW - 98)) | (1L << (BLACK - 98)) | (1L << (WHITE - 98)) | (1L << (GREY - 98)) | (1L << (GREEN - 98)) | (1L << (GOLD - 98)) | (1L << (PURBLE - 98)) | (1L << (PINK - 98)))) != 0)) ) {
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

	public static class ColorClassContext extends ParserRuleContext {
		public TerminalNode COLORS() { return getToken(ParserFile.COLORS, 0); }
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public ColorStaticContext colorStatic() {
			return getRuleContext(ColorStaticContext.class,0);
		}
		public ColorClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterColorClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitColorClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitColorClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorClassContext colorClass() throws RecognitionException {
		ColorClassContext _localctx = new ColorClassContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_colorClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(COLORS);
			setState(515);
			match(DOT);
			setState(516);
			colorStatic();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColorStaticContext extends ParserRuleContext {
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
		public ColorStaticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorStatic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterColorStatic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitColorStatic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitColorStatic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorStaticContext colorStatic() throws RecognitionException {
		ColorStaticContext _localctx = new ColorStaticContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_colorStatic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_la = _input.LA(1);
			if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (RED - 98)) | (1L << (BLUE - 98)) | (1L << (YELLOW - 98)) | (1L << (BLACK - 98)) | (1L << (WHITE - 98)) | (1L << (GREY - 98)) | (1L << (GREEN - 98)) | (1L << (GOLD - 98)) | (1L << (PURBLE - 98)) | (1L << (PINK - 98)))) != 0)) ) {
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

	public static class FunctionExprContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionExprContext functionExpr() throws RecognitionException {
		FunctionExprContext _localctx = new FunctionExprContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_functionExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(OPEN_PAREN);
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(521);
				parameterList();
				}
			}

			setState(524);
			match(CLOSE_PAREN);
			setState(525);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ParserFile.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ParserFile.IDENTIFIER, i);
		}
		public List<TerminalNode> Comma() { return getTokens(ParserFile.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ParserFile.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(IDENTIFIER);
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(528);
				match(Comma);
				setState(529);
				match(IDENTIFIER);
				}
				}
				setState(534);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_functionBody);
		try {
			setState(537);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				expression();
				}
				break;
			case CURLY_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				block();
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(ParserFile.ARROW, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
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
		enterRule(_localctx, 134, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(ARROW);
			setState(540);
			statement();
			setState(541);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode CURLY_OPEN() { return getToken(ParserFile.CURLY_OPEN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(ParserFile.CURLY_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(CURLY_OPEN);
			setState(544);
			statement();
			setState(545);
			match(CURLY_CLOSE);
			setState(546);
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

	public static class StatementContext extends ParserRuleContext {
		public Expr_StmtContext expr_Stmt() {
			return getRuleContext(Expr_StmtContext.class,0);
		}
		public If_StmtContext if_Stmt() {
			return getRuleContext(If_StmtContext.class,0);
		}
		public While_StmtContext while_Stmt() {
			return getRuleContext(While_StmtContext.class,0);
		}
		public Print_StmtContext print_Stmt() {
			return getRuleContext(Print_StmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_statement);
		try {
			setState(552);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
			case CURLY_CLOSE:
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				expr_Stmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				if_Stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(550);
				while_Stmt();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(551);
				print_Stmt();
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

	public static class Expr_StmtContext extends ParserRuleContext {
		public Expr_StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_Stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterExpr_Stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitExpr_Stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitExpr_Stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_StmtContext expr_Stmt() throws RecognitionException {
		Expr_StmtContext _localctx = new Expr_StmtContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_expr_Stmt);
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

	public static class If_StmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ParserFile.IF, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ParserFile.ELSE, 0); }
		public If_StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_Stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterIf_Stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitIf_Stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitIf_Stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_StmtContext if_Stmt() throws RecognitionException {
		If_StmtContext _localctx = new If_StmtContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_if_Stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(IF);
			setState(557);
			match(OPEN_PAREN);
			setState(558);
			expr();
			setState(559);
			match(CLOSE_PAREN);
			setState(560);
			statement();
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(561);
				match(ELSE);
				setState(562);
				statement();
				}
				break;
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

	public static class While_StmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ParserFile.WHILE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_Stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterWhile_Stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitWhile_Stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitWhile_Stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_StmtContext while_Stmt() throws RecognitionException {
		While_StmtContext _localctx = new While_StmtContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_while_Stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(WHILE);
			setState(566);
			match(OPEN_PAREN);
			setState(567);
			expr();
			setState(568);
			match(CLOSE_PAREN);
			setState(569);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_StmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ParserFile.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public Print_StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_Stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterPrint_Stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitPrint_Stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitPrint_Stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_StmtContext print_Stmt() throws RecognitionException {
		Print_StmtContext _localctx = new Print_StmtContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_print_Stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(PRINT);
			setState(572);
			expr();
			setState(573);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_expr);
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
		enterRule(_localctx, 150, RULE_listviewArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EDGEINSETS) {
				{
				setState(577);
				padding();
				}
			}

			setState(580);
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

	public static class ColumnArgsContext extends ParserRuleContext {
		public ChildrenContext children() {
			return getRuleContext(ChildrenContext.class,0);
		}
		public CrossAxisAlignmentCrossAxisAlignmentContentContext crossAxisAlignmentCrossAxisAlignmentContent() {
			return getRuleContext(CrossAxisAlignmentCrossAxisAlignmentContentContext.class,0);
		}
		public MainAxisAlignmentMainAxisAlignmentContentContext mainAxisAlignmentMainAxisAlignmentContent() {
			return getRuleContext(MainAxisAlignmentMainAxisAlignmentContentContext.class,0);
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
		enterRule(_localctx, 152, RULE_columnArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CROSSAXISALIGNMENT:
				{
				setState(582);
				crossAxisAlignmentCrossAxisAlignmentContent();
				}
				break;
			case MAINAXISALIGNMENT:
				{
				setState(583);
				mainAxisAlignmentMainAxisAlignmentContent();
				}
				break;
			case CHILDREN:
				break;
			default:
				break;
			}
			setState(586);
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

	public static class RowArgsContext extends ParserRuleContext {
		public ChildrenContext children() {
			return getRuleContext(ChildrenContext.class,0);
		}
		public CrossAxisAlignmentCrossAxisAlignmentContentContext crossAxisAlignmentCrossAxisAlignmentContent() {
			return getRuleContext(CrossAxisAlignmentCrossAxisAlignmentContentContext.class,0);
		}
		public MainAxisAlignmentMainAxisAlignmentContentContext mainAxisAlignmentMainAxisAlignmentContent() {
			return getRuleContext(MainAxisAlignmentMainAxisAlignmentContentContext.class,0);
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
		enterRule(_localctx, 154, RULE_rowArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CROSSAXISALIGNMENT:
				{
				setState(588);
				crossAxisAlignmentCrossAxisAlignmentContent();
				}
				break;
			case MAINAXISALIGNMENT:
				{
				setState(589);
				mainAxisAlignmentMainAxisAlignmentContent();
				}
				break;
			case CHILDREN:
				break;
			default:
				break;
			}
			setState(592);
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
		enterRule(_localctx, 156, RULE_inkwellArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONTAP) {
				{
				setState(594);
				onTap();
				}
			}

			setState(597);
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
		public ExpandedflexContext expandedflex() {
			return getRuleContext(ExpandedflexContext.class,0);
		}
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
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
		enterRule(_localctx, 158, RULE_expandedArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FLEX) {
				{
				setState(599);
				expandedflex();
				}
			}

			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD) {
				{
				setState(602);
				child();
				}
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

	public static class ExpandedflexContext extends ParserRuleContext {
		public TerminalNode FLEX() { return getToken(ParserFile.FLEX, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public TerminalNode INT() { return getToken(ParserFile.INT, 0); }
		public ExpandedflexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expandedflex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterExpandedflex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitExpandedflex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitExpandedflex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpandedflexContext expandedflex() throws RecognitionException {
		ExpandedflexContext _localctx = new ExpandedflexContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_expandedflex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(FLEX);
			setState(606);
			match(COLON);
			{
			setState(607);
			match(INT);
			}
			setState(608);
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

	public static class CardArgsContext extends ParserRuleContext {
		public ElevationArgsContext elevationArgs() {
			return getRuleContext(ElevationArgsContext.class,0);
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
		enterRule(_localctx, 162, RULE_cardArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELEVATION) {
				{
				setState(610);
				elevationArgs();
				}
			}

			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD) {
				{
				setState(613);
				child();
				}
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

	public static class ElevationArgsContext extends ParserRuleContext {
		public TerminalNode ELEVATION() { return getToken(ParserFile.ELEVATION, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public TerminalNode DOUBLE() { return getToken(ParserFile.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(ParserFile.INT, 0); }
		public ElevationArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elevationArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterElevationArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitElevationArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitElevationArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElevationArgsContext elevationArgs() throws RecognitionException {
		ElevationArgsContext _localctx = new ElevationArgsContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_elevationArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(ELEVATION);
			setState(617);
			match(COLON);
			setState(618);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(619);
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

	public static class IconArgsContext extends ParserRuleContext {
		public IconParamContext iconParam() {
			return getRuleContext(IconParamContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public OnPressedContext onPressed() {
			return getRuleContext(OnPressedContext.class,0);
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
		enterRule(_localctx, 166, RULE_iconArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			iconParam();
			setState(622);
			match(COMMA);
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONPRESSED) {
				{
				setState(623);
				onPressed();
				}
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

	public static class IconParamContext extends ParserRuleContext {
		public TerminalNode ICON() { return getToken(ParserFile.ICON, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public List<TerminalNode> ICON_CLASS() { return getTokens(ParserFile.ICON_CLASS); }
		public TerminalNode ICON_CLASS(int i) {
			return getToken(ParserFile.ICON_CLASS, i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(ParserFile.OPEN_PAREN, 0); }
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public TerminalNode STRING() { return getToken(ParserFile.STRING, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ParserFile.CLOSE_PAREN, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public IconParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iconParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterIconParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitIconParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitIconParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IconParamContext iconParam() throws RecognitionException {
		IconParamContext _localctx = new IconParamContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_iconParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(ICON);
			setState(627);
			match(COLON);
			setState(628);
			match(ICON_CLASS);
			setState(629);
			match(OPEN_PAREN);
			setState(630);
			match(ICON_CLASS);
			setState(631);
			match(DOT);
			setState(632);
			match(STRING);
			setState(633);
			match(COMMA);
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLOR) {
				{
				setState(634);
				color();
				}
			}

			setState(637);
			match(CLOSE_PAREN);
			setState(638);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0097\u0281\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u00c6\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u00cd\b\u0001"+
		"\n\u0001\f\u0001\u00d0\t\u0001\u0001\u0001\u0003\u0001\u00d3\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\u00dc\b\u0002\n\u0002\f\u0002\u00df\t\u0002\u0001\u0002"+
		"\u0003\u0002\u00e2\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u0103\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0115\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u014c\b\u001c\n\u001c\f\u001c\u014f"+
		"\t\u001c\u0001\u001c\u0003\u001c\u0152\b\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u015b\b\u001d\n\u001d\f\u001d\u015e\t\u001d\u0001\u001d\u0003\u001d\u0161"+
		"\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0004 \u0172\b \u000b \f \u0173\u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u018b"+
		"\b#\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u01a7\b)\u0001*\u0001"+
		"*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001.\u0001"+
		".\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u0001"+
		"0\u00011\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u00013\u0001"+
		"3\u00013\u00013\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00016\u00016\u00016\u0001"+
		"6\u00046\u01dd\b6\u000b6\f6\u01de\u00016\u00016\u00016\u00017\u00017\u0001"+
		"7\u00017\u00018\u00018\u00018\u00018\u00019\u00019\u00019\u00019\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001>\u0001"+
		">\u0001>\u0001>\u0001?\u0001?\u0001@\u0001@\u0003@\u020b\b@\u0001@\u0001"+
		"@\u0001@\u0001A\u0001A\u0001A\u0005A\u0213\bA\nA\fA\u0216\tA\u0001B\u0001"+
		"B\u0003B\u021a\bB\u0001C\u0001C\u0001C\u0001C\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001E\u0001E\u0001E\u0001E\u0003E\u0229\bE\u0001F\u0001F\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u0234\bG\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001J\u0001"+
		"J\u0001K\u0003K\u0243\bK\u0001K\u0001K\u0001L\u0001L\u0003L\u0249\bL\u0001"+
		"L\u0001L\u0001M\u0001M\u0003M\u024f\bM\u0001M\u0001M\u0001N\u0003N\u0254"+
		"\bN\u0001N\u0001N\u0001O\u0003O\u0259\bO\u0001O\u0003O\u025c\bO\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001Q\u0003Q\u0264\bQ\u0001Q\u0003Q\u0267"+
		"\bQ\u0001R\u0001R\u0001R\u0001R\u0001R\u0001S\u0001S\u0001S\u0003S\u0271"+
		"\bS\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0003"+
		"T\u027c\bT\u0001T\u0001T\u0001T\u0001T\u0000\u0000U\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u0000\u0002\u0001\u0000@A\u0001\u0000b"+
		"k\u026e\u0000\u00c5\u0001\u0000\u0000\u0000\u0002\u00c7\u0001\u0000\u0000"+
		"\u0000\u0004\u00d6\u0001\u0000\u0000\u0000\u0006\u00e5\u0001\u0000\u0000"+
		"\u0000\b\u00e7\u0001\u0000\u0000\u0000\n\u00e9\u0001\u0000\u0000\u0000"+
		"\f\u00ef\u0001\u0000\u0000\u0000\u000e\u00f1\u0001\u0000\u0000\u0000\u0010"+
		"\u00f3\u0001\u0000\u0000\u0000\u0012\u00f9\u0001\u0000\u0000\u0000\u0014"+
		"\u00ff\u0001\u0000\u0000\u0000\u0016\u0107\u0001\u0000\u0000\u0000\u0018"+
		"\u010d\u0001\u0000\u0000\u0000\u001a\u010f\u0001\u0000\u0000\u0000\u001c"+
		"\u0111\u0001\u0000\u0000\u0000\u001e\u0119\u0001\u0000\u0000\u0000 \u011f"+
		"\u0001\u0000\u0000\u0000\"\u0125\u0001\u0000\u0000\u0000$\u012a\u0001"+
		"\u0000\u0000\u0000&\u012c\u0001\u0000\u0000\u0000(\u012e\u0001\u0000\u0000"+
		"\u0000*\u0130\u0001\u0000\u0000\u0000,\u0132\u0001\u0000\u0000\u0000."+
		"\u0134\u0001\u0000\u0000\u00000\u0136\u0001\u0000\u0000\u00002\u0138\u0001"+
		"\u0000\u0000\u00004\u013a\u0001\u0000\u0000\u00006\u013c\u0001\u0000\u0000"+
		"\u00008\u0146\u0001\u0000\u0000\u0000:\u0155\u0001\u0000\u0000\u0000<"+
		"\u0164\u0001\u0000\u0000\u0000>\u0168\u0001\u0000\u0000\u0000@\u016d\u0001"+
		"\u0000\u0000\u0000B\u0178\u0001\u0000\u0000\u0000D\u017f\u0001\u0000\u0000"+
		"\u0000F\u018a\u0001\u0000\u0000\u0000H\u018c\u0001\u0000\u0000\u0000J"+
		"\u0190\u0001\u0000\u0000\u0000L\u0194\u0001\u0000\u0000\u0000N\u0198\u0001"+
		"\u0000\u0000\u0000P\u019c\u0001\u0000\u0000\u0000R\u01a6\u0001\u0000\u0000"+
		"\u0000T\u01a8\u0001\u0000\u0000\u0000V\u01aa\u0001\u0000\u0000\u0000X"+
		"\u01ac\u0001\u0000\u0000\u0000Z\u01ae\u0001\u0000\u0000\u0000\\\u01b2"+
		"\u0001\u0000\u0000\u0000^\u01b6\u0001\u0000\u0000\u0000`\u01ba\u0001\u0000"+
		"\u0000\u0000b\u01be\u0001\u0000\u0000\u0000d\u01c2\u0001\u0000\u0000\u0000"+
		"f\u01c6\u0001\u0000\u0000\u0000h\u01ca\u0001\u0000\u0000\u0000j\u01d1"+
		"\u0001\u0000\u0000\u0000l\u01d8\u0001\u0000\u0000\u0000n\u01e3\u0001\u0000"+
		"\u0000\u0000p\u01e7\u0001\u0000\u0000\u0000r\u01eb\u0001\u0000\u0000\u0000"+
		"t\u01ef\u0001\u0000\u0000\u0000v\u01f4\u0001\u0000\u0000\u0000x\u01f9"+
		"\u0001\u0000\u0000\u0000z\u0200\u0001\u0000\u0000\u0000|\u0202\u0001\u0000"+
		"\u0000\u0000~\u0206\u0001\u0000\u0000\u0000\u0080\u0208\u0001\u0000\u0000"+
		"\u0000\u0082\u020f\u0001\u0000\u0000\u0000\u0084\u0219\u0001\u0000\u0000"+
		"\u0000\u0086\u021b\u0001\u0000\u0000\u0000\u0088\u021f\u0001\u0000\u0000"+
		"\u0000\u008a\u0228\u0001\u0000\u0000\u0000\u008c\u022a\u0001\u0000\u0000"+
		"\u0000\u008e\u022c\u0001\u0000\u0000\u0000\u0090\u0235\u0001\u0000\u0000"+
		"\u0000\u0092\u023b\u0001\u0000\u0000\u0000\u0094\u023f\u0001\u0000\u0000"+
		"\u0000\u0096\u0242\u0001\u0000\u0000\u0000\u0098\u0248\u0001\u0000\u0000"+
		"\u0000\u009a\u024e\u0001\u0000\u0000\u0000\u009c\u0253\u0001\u0000\u0000"+
		"\u0000\u009e\u0258\u0001\u0000\u0000\u0000\u00a0\u025d\u0001\u0000\u0000"+
		"\u0000\u00a2\u0263\u0001\u0000\u0000\u0000\u00a4\u0268\u0001\u0000\u0000"+
		"\u0000\u00a6\u026d\u0001\u0000\u0000\u0000\u00a8\u0272\u0001\u0000\u0000"+
		"\u0000\u00aa\u00c6\u0003\u0002\u0001\u0000\u00ab\u00c6\u0003\u0004\u0002"+
		"\u0000\u00ac\u00c6\u0003\u0006\u0003\u0000\u00ad\u00c6\u0003\b\u0004\u0000"+
		"\u00ae\u00c6\u0003\n\u0005\u0000\u00af\u00c6\u0003\f\u0006\u0000\u00b0"+
		"\u00c6\u0003\u000e\u0007\u0000\u00b1\u00c6\u0003\u0010\b\u0000\u00b2\u00c6"+
		"\u0003\u0012\t\u0000\u00b3\u00c6\u0003\u0014\n\u0000\u00b4\u00c6\u0003"+
		"\u0016\u000b\u0000\u00b5\u00c6\u0003\u0018\f\u0000\u00b6\u00c6\u0003\u001a"+
		"\r\u0000\u00b7\u00c6\u0003\u001c\u000e\u0000\u00b8\u00c6\u0003\u001e\u000f"+
		"\u0000\u00b9\u00c6\u0003 \u0010\u0000\u00ba\u00c6\u0003\"\u0011\u0000"+
		"\u00bb\u00c6\u0003$\u0012\u0000\u00bc\u00c6\u0003&\u0013\u0000\u00bd\u00c6"+
		"\u0003(\u0014\u0000\u00be\u00c6\u0003*\u0015\u0000\u00bf\u00c6\u0003,"+
		"\u0016\u0000\u00c0\u00c6\u0003.\u0017\u0000\u00c1\u00c6\u00030\u0018\u0000"+
		"\u00c2\u00c6\u00032\u0019\u0000\u00c3\u00c6\u00034\u001a\u0000\u00c4\u00c6"+
		"\u00036\u001b\u0000\u00c5\u00aa\u0001\u0000\u0000\u0000\u00c5\u00ab\u0001"+
		"\u0000\u0000\u0000\u00c5\u00ac\u0001\u0000\u0000\u0000\u00c5\u00ad\u0001"+
		"\u0000\u0000\u0000\u00c5\u00ae\u0001\u0000\u0000\u0000\u00c5\u00af\u0001"+
		"\u0000\u0000\u0000\u00c5\u00b0\u0001\u0000\u0000\u0000\u00c5\u00b1\u0001"+
		"\u0000\u0000\u0000\u00c5\u00b2\u0001\u0000\u0000\u0000\u00c5\u00b3\u0001"+
		"\u0000\u0000\u0000\u00c5\u00b4\u0001\u0000\u0000\u0000\u00c5\u00b5\u0001"+
		"\u0000\u0000\u0000\u00c5\u00b6\u0001\u0000\u0000\u0000\u00c5\u00b7\u0001"+
		"\u0000\u0000\u0000\u00c5\u00b8\u0001\u0000\u0000\u0000\u00c5\u00b9\u0001"+
		"\u0000\u0000\u0000\u00c5\u00ba\u0001\u0000\u0000\u0000\u00c5\u00bb\u0001"+
		"\u0000\u0000\u0000\u00c5\u00bc\u0001\u0000\u0000\u0000\u00c5\u00bd\u0001"+
		"\u0000\u0000\u0000\u00c5\u00be\u0001\u0000\u0000\u0000\u00c5\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c0\u0001\u0000\u0000\u0000\u00c5\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u0001\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0005\u0001\u0000\u0000\u00c8\u00ce\u0005"+
		"L\u0000\u0000\u00c9\u00ca\u0003F#\u0000\u00ca\u00cb\u0005H\u0000\u0000"+
		"\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d3\u0003F#\u0000\u00d2\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005M\u0000\u0000\u00d5\u0003\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0005\u0002\u0000\u0000\u00d7\u00dd\u0005"+
		"L\u0000\u0000\u00d8\u00d9\u0003R)\u0000\u00d9\u00da\u0005H\u0000\u0000"+
		"\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00d8\u0001\u0000\u0000\u0000"+
		"\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000"+
		"\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e1\u0001\u0000\u0000\u0000"+
		"\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e2\u0003R)\u0000\u00e1\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005M\u0000\u0000\u00e4\u0005\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0005J\u0000\u0000\u00e6\u0007\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0005J\u0000\u0000\u00e8\t\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0005}\u0000\u0000\u00ea\u00eb\u0005L\u0000\u0000\u00eb"+
		"\u00ec\u0003\u0096K\u0000\u00ec\u00ed\u0005M\u0000\u0000\u00ed\u00ee\u0005"+
		"H\u0000\u0000\u00ee\u000b\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005J\u0000"+
		"\u0000\u00f0\r\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005J\u0000\u0000"+
		"\u00f2\u000f\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\u0004\u0000\u0000"+
		"\u00f4\u00f5\u0005L\u0000\u0000\u00f5\u00f6\u0003\u0098L\u0000\u00f6\u00f7"+
		"\u0005M\u0000\u0000\u00f7\u00f8\u0005H\u0000\u0000\u00f8\u0011\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0005\u0003\u0000\u0000\u00fa\u00fb\u0005L\u0000"+
		"\u0000\u00fb\u00fc\u0003\u009aM\u0000\u00fc\u00fd\u0005M\u0000\u0000\u00fd"+
		"\u00fe\u0005H\u0000\u0000\u00fe\u0013\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0005\t\u0000\u0000\u0100\u0102\u0005L\u0000\u0000\u0101\u0103\u0003"+
		"\u00a2Q\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0005M\u0000"+
		"\u0000\u0105\u0106\u0005H\u0000\u0000\u0106\u0015\u0001\u0000\u0000\u0000"+
		"\u0107\u0108\u0005~\u0000\u0000\u0108\u0109\u0005L\u0000\u0000\u0109\u010a"+
		"\u0003\u00a6S\u0000\u010a\u010b\u0005M\u0000\u0000\u010b\u010c\u0005H"+
		"\u0000\u0000\u010c\u0017\u0001\u0000\u0000\u0000\u010d\u010e\u0005J\u0000"+
		"\u0000\u010e\u0019\u0001\u0000\u0000\u0000\u010f\u0110\u0005J\u0000\u0000"+
		"\u0110\u001b\u0001\u0000\u0000\u0000\u0111\u0112\u0005\u0006\u0000\u0000"+
		"\u0112\u0114\u0005L\u0000\u0000\u0113\u0115\u0003\u009cN\u0000\u0114\u0113"+
		"\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u0005M\u0000\u0000\u0117\u0118\u0005"+
		"H\u0000\u0000\u0118\u001d\u0001\u0000\u0000\u0000\u0119\u011a\u0005\b"+
		"\u0000\u0000\u011a\u011b\u0005L\u0000\u0000\u011b\u011c\u0003\u009eO\u0000"+
		"\u011c\u011d\u0005M\u0000\u0000\u011d\u011e\u0005H\u0000\u0000\u011e\u001f"+
		"\u0001\u0000\u0000\u0000\u011f\u0120\u0005\u0017\u0000\u0000\u0120\u0121"+
		"\u0005L\u0000\u0000\u0121\u0122\u0003<\u001e\u0000\u0122\u0123\u0005M"+
		"\u0000\u0000\u0123\u0124\u0005H\u0000\u0000\u0124!\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0005\r\u0000\u0000\u0126\u0127\u0005L\u0000\u0000\u0127"+
		"\u0128\u0003X,\u0000\u0128\u0129\u0005M\u0000\u0000\u0129#\u0001\u0000"+
		"\u0000\u0000\u012a\u012b\u0005J\u0000\u0000\u012b%\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0005J\u0000\u0000\u012d\'\u0001\u0000\u0000\u0000\u012e"+
		"\u012f\u0005J\u0000\u0000\u012f)\u0001\u0000\u0000\u0000\u0130\u0131\u0005"+
		"J\u0000\u0000\u0131+\u0001\u0000\u0000\u0000\u0132\u0133\u0005J\u0000"+
		"\u0000\u0133-\u0001\u0000\u0000\u0000\u0134\u0135\u0005J\u0000\u0000\u0135"+
		"/\u0001\u0000\u0000\u0000\u0136\u0137\u0005J\u0000\u0000\u01371\u0001"+
		"\u0000\u0000\u0000\u0138\u0139\u0005J\u0000\u0000\u01393\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0005J\u0000\u0000\u013b5\u0001\u0000\u0000\u0000\u013c"+
		"\u013d\u0005\u007f\u0000\u0000\u013d\u013e\u0005L\u0000\u0000\u013e\u013f"+
		"\u0003t:\u0000\u013f\u0140\u0005H\u0000\u0000\u0140\u0141\u0003v;\u0000"+
		"\u0141\u0142\u0005H\u0000\u0000\u0142\u0143\u0003n7\u0000\u0143\u0144"+
		"\u0005M\u0000\u0000\u0144\u0145\u0005H\u0000\u0000\u01457\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0005\u0013\u0000\u0000\u0147\u014d\u0005L\u0000"+
		"\u0000\u0148\u0149\u0003T*\u0000\u0149\u014a\u0005H\u0000\u0000\u014a"+
		"\u014c\u0001\u0000\u0000\u0000\u014b\u0148\u0001\u0000\u0000\u0000\u014c"+
		"\u014f\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u0001\u0000\u0000\u0000\u014e\u0151\u0001\u0000\u0000\u0000\u014f"+
		"\u014d\u0001\u0000\u0000\u0000\u0150\u0152\u0003T*\u0000\u0151\u0150\u0001"+
		"\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0153\u0001"+
		"\u0000\u0000\u0000\u0153\u0154\u0005M\u0000\u0000\u01549\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0005?\u0000\u0000\u0156\u015c\u0005L\u0000\u0000\u0157"+
		"\u0158\u0003V+\u0000\u0158\u0159\u0005H\u0000\u0000\u0159\u015b\u0001"+
		"\u0000\u0000\u0000\u015a\u0157\u0001\u0000\u0000\u0000\u015b\u015e\u0001"+
		"\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015d\u0001"+
		"\u0000\u0000\u0000\u015d\u0160\u0001\u0000\u0000\u0000\u015e\u015c\u0001"+
		"\u0000\u0000\u0000\u015f\u0161\u0003V+\u0000\u0160\u015f\u0001\u0000\u0000"+
		"\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0005M\u0000\u0000\u0163;\u0001\u0000\u0000\u0000\u0164"+
		"\u0165\u0003>\u001f\u0000\u0165\u0166\u0003p8\u0000\u0166\u0167\u0003"+
		"@ \u0000\u0167=\u0001\u0000\u0000\u0000\u0168\u0169\u0005\u0080\u0000"+
		"\u0000\u0169\u016a\u0005J\u0000\u0000\u016a\u016b\u0005@\u0000\u0000\u016b"+
		"\u016c\u0005H\u0000\u0000\u016c?\u0001\u0000\u0000\u0000\u016d\u016e\u0005"+
		"\u0081\u0000\u0000\u016e\u016f\u0005J\u0000\u0000\u016f\u0171\u0005\u0082"+
		"\u0000\u0000\u0170\u0172\u0003B!\u0000\u0171\u0170\u0001\u0000\u0000\u0000"+
		"\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000"+
		"\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000"+
		"\u0175\u0176\u0005\u0083\u0000\u0000\u0176\u0177\u0005H\u0000\u0000\u0177"+
		"A\u0001\u0000\u0000\u0000\u0178\u0179\u0005=\u0000\u0000\u0179\u017a\u0005"+
		"L\u0000\u0000\u017a\u017b\u00034\u001a\u0000\u017b\u017c\u0003D\"\u0000"+
		"\u017c\u017d\u0005M\u0000\u0000\u017d\u017e\u0005H\u0000\u0000\u017eC"+
		"\u0001\u0000\u0000\u0000\u017f\u0180\u0005|\u0000\u0000\u0180\u0181\u0005"+
		"J\u0000\u0000\u0181\u0182\u0005D\u0000\u0000\u0182\u0183\u0005H\u0000"+
		"\u0000\u0183E\u0001\u0000\u0000\u0000\u0184\u018b\u0003H$\u0000\u0185"+
		"\u018b\u0003J%\u0000\u0186\u018b\u0003L&\u0000\u0187\u018b\u0003N\'\u0000"+
		"\u0188\u018b\u0003P(\u0000\u0189\u018b\u0003Z-\u0000\u018a\u0184\u0001"+
		"\u0000\u0000\u0000\u018a\u0185\u0001\u0000\u0000\u0000\u018a\u0186\u0001"+
		"\u0000\u0000\u0000\u018a\u0187\u0001\u0000\u0000\u0000\u018a\u0188\u0001"+
		"\u0000\u0000\u0000\u018a\u0189\u0001\u0000\u0000\u0000\u018bG\u0001\u0000"+
		"\u0000\u0000\u018c\u018d\u0005\u0014\u0000\u0000\u018d\u018e\u0005J\u0000"+
		"\u0000\u018e\u018f\u0003\u0000\u0000\u0000\u018fI\u0001\u0000\u0000\u0000"+
		"\u0190\u0191\u0005\u0015\u0000\u0000\u0191\u0192\u0005J\u0000\u0000\u0192"+
		"\u0193\u0003(\u0014\u0000\u0193K\u0001\u0000\u0000\u0000\u0194\u0195\u0005"+
		"\u0016\u0000\u0000\u0195\u0196\u0005J\u0000\u0000\u0196\u0197\u0003\f"+
		"\u0006\u0000\u0197M\u0001\u0000\u0000\u0000\u0198\u0199\u0005\u0017\u0000"+
		"\u0000\u0199\u019a\u0005J\u0000\u0000\u019a\u019b\u0003 \u0010\u0000\u019b"+
		"O\u0001\u0000\u0000\u0000\u019c\u019d\u0005\u0018\u0000\u0000\u019d\u019e"+
		"\u0005J\u0000\u0000\u019e\u019f\u0003*\u0015\u0000\u019fQ\u0001\u0000"+
		"\u0000\u0000\u01a0\u01a7\u0003\\.\u0000\u01a1\u01a7\u0003^/\u0000\u01a2"+
		"\u01a7\u0003`0\u0000\u01a3\u01a7\u0003b1\u0000\u01a4\u01a7\u0003d2\u0000"+
		"\u01a5\u01a7\u0003f3\u0000\u01a6\u01a0\u0001\u0000\u0000\u0000\u01a6\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a2\u0001\u0000\u0000\u0000\u01a6\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a7S\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001"+
		"\u0000\u0000\u0000\u01a9U\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000"+
		"\u0000\u0000\u01abW\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000"+
		"\u0000\u01adY\u0001\u0000\u0000\u0000\u01ae\u01af\u0005\u0019\u0000\u0000"+
		"\u01af\u01b0\u0005J\u0000\u0000\u01b0\u01b1\u0003|>\u0000\u01b1[\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b3\u0005\u001a\u0000\u0000\u01b3\u01b4\u0005"+
		"J\u0000\u0000\u01b4\u01b5\u0003\u0000\u0000\u0000\u01b5]\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b7\u0005\u001c\u0000\u0000\u01b7\u01b8\u0005J\u0000\u0000"+
		"\u01b8\u01b9\u0005A\u0000\u0000\u01b9_\u0001\u0000\u0000\u0000\u01ba\u01bb"+
		"\u0005\u001d\u0000\u0000\u01bb\u01bc\u0005J\u0000\u0000\u01bc\u01bd\u0005"+
		"A\u0000\u0000\u01bda\u0001\u0000\u0000\u0000\u01be\u01bf\u0005\u001e\u0000"+
		"\u0000\u01bf\u01c0\u0005J\u0000\u0000\u01c0\u01c1\u0003|>\u0000\u01c1"+
		"c\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005\u001f\u0000\u0000\u01c3\u01c4"+
		"\u0005J\u0000\u0000\u01c4\u01c5\u00038\u001c\u0000\u01c5e\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c7\u0005 \u0000\u0000\u01c7\u01c8\u0005J\u0000\u0000"+
		"\u01c8\u01c9\u0003:\u001d\u0000\u01c9g\u0001\u0000\u0000\u0000\u01ca\u01cb"+
		"\u0005\u0084\u0000\u0000\u01cb\u01cc\u0005J\u0000\u0000\u01cc\u01cd\u0005"+
		"\u0085\u0000\u0000\u01cd\u01ce\u0005K\u0000\u0000\u01ce\u01cf\u0005E\u0000"+
		"\u0000\u01cf\u01d0\u0005H\u0000\u0000\u01d0i\u0001\u0000\u0000\u0000\u01d1"+
		"\u01d2\u0005\u0086\u0000\u0000\u01d2\u01d3\u0005J\u0000\u0000\u01d3\u01d4"+
		"\u0005\u0087\u0000\u0000\u01d4\u01d5\u0005K\u0000\u0000\u01d5\u01d6\u0005"+
		"E\u0000\u0000\u01d6\u01d7\u0005H\u0000\u0000\u01d7k\u0001\u0000\u0000"+
		"\u0000\u01d8\u01d9\u0005\u0088\u0000\u0000\u01d9\u01da\u0005J\u0000\u0000"+
		"\u01da\u01dc\u0005\u0082\u0000\u0000\u01db\u01dd\u0003\u0000\u0000\u0000"+
		"\u01dc\u01db\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000"+
		"\u01de\u01dc\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000"+
		"\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e1\u0005\u0083\u0000\u0000"+
		"\u01e1\u01e2\u0005H\u0000\u0000\u01e2m\u0001\u0000\u0000\u0000\u01e3\u01e4"+
		"\u0005\u0089\u0000\u0000\u01e4\u01e5\u0005J\u0000\u0000\u01e5\u01e6\u0003"+
		"\u0000\u0000\u0000\u01e6o\u0001\u0000\u0000\u0000\u01e7\u01e8\u0005\u008a"+
		"\u0000\u0000\u01e8\u01e9\u0005\u008b\u0000\u0000\u01e9\u01ea\u0003\u0080"+
		"@\u0000\u01eaq\u0001\u0000\u0000\u0000\u01eb\u01ec\u0005\u008c\u0000\u0000"+
		"\u01ec\u01ed\u0005\u008b\u0000\u0000\u01ed\u01ee\u0003\u0080@\u0000\u01ee"+
		"s\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005\u008d\u0000\u0000\u01f0\u01f1"+
		"\u0005J\u0000\u0000\u01f1\u01f2\u0007\u0000\u0000\u0000\u01f2\u01f3\u0005"+
		"H\u0000\u0000\u01f3u\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005\u008e\u0000"+
		"\u0000\u01f5\u01f6\u0005J\u0000\u0000\u01f6\u01f7\u0007\u0000\u0000\u0000"+
		"\u01f7\u01f8\u0005H\u0000\u0000\u01f8w\u0001\u0000\u0000\u0000\u01f9\u01fa"+
		"\u0005\u008f\u0000\u0000\u01fa\u01fb\u0005J\u0000\u0000\u01fb\u01fc\u0005"+
		">\u0000\u0000\u01fc\u01fd\u0005K\u0000\u0000\u01fd\u01fe\u0003z=\u0000"+
		"\u01fe\u01ff\u0005H\u0000\u0000\u01ffy\u0001\u0000\u0000\u0000\u0200\u0201"+
		"\u0007\u0001\u0000\u0000\u0201{\u0001\u0000\u0000\u0000\u0202\u0203\u0005"+
		">\u0000\u0000\u0203\u0204\u0005K\u0000\u0000\u0204\u0205\u0003~?\u0000"+
		"\u0205}\u0001\u0000\u0000\u0000\u0206\u0207\u0007\u0001\u0000\u0000\u0207"+
		"\u007f\u0001\u0000\u0000\u0000\u0208\u020a\u0005L\u0000\u0000\u0209\u020b"+
		"\u0003\u0082A\u0000\u020a\u0209\u0001\u0000\u0000\u0000\u020a\u020b\u0001"+
		"\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c\u020d\u0005"+
		"M\u0000\u0000\u020d\u020e\u0003\u0084B\u0000\u020e\u0081\u0001\u0000\u0000"+
		"\u0000\u020f\u0214\u0005E\u0000\u0000\u0210\u0211\u0005\u0090\u0000\u0000"+
		"\u0211\u0213\u0005E\u0000\u0000\u0212\u0210\u0001\u0000\u0000\u0000\u0213"+
		"\u0216\u0001\u0000\u0000\u0000\u0214\u0212\u0001\u0000\u0000\u0000\u0214"+
		"\u0215\u0001\u0000\u0000\u0000\u0215\u0083\u0001\u0000\u0000\u0000\u0216"+
		"\u0214\u0001\u0000\u0000\u0000\u0217\u021a\u0003\u0086C\u0000\u0218\u021a"+
		"\u0003\u0088D\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u0219\u0218\u0001"+
		"\u0000\u0000\u0000\u021a\u0085\u0001\u0000\u0000\u0000\u021b\u021c\u0005"+
		"F\u0000\u0000\u021c\u021d\u0003\u008aE\u0000\u021d\u021e\u0005H\u0000"+
		"\u0000\u021e\u0087\u0001\u0000\u0000\u0000\u021f\u0220\u0005\u0091\u0000"+
		"\u0000\u0220\u0221\u0003\u008aE\u0000\u0221\u0222\u0005\u0092\u0000\u0000"+
		"\u0222\u0223\u0005H\u0000\u0000\u0223\u0089\u0001\u0000\u0000\u0000\u0224"+
		"\u0229\u0003\u008cF\u0000\u0225\u0229\u0003\u008eG\u0000\u0226\u0229\u0003"+
		"\u0090H\u0000\u0227\u0229\u0003\u0092I\u0000\u0228\u0224\u0001\u0000\u0000"+
		"\u0000\u0228\u0225\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000\u0000"+
		"\u0000\u0228\u0227\u0001\u0000\u0000\u0000\u0229\u008b\u0001\u0000\u0000"+
		"\u0000\u022a\u022b\u0001\u0000\u0000\u0000\u022b\u008d\u0001\u0000\u0000"+
		"\u0000\u022c\u022d\u0005\u0093\u0000\u0000\u022d\u022e\u0005L\u0000\u0000"+
		"\u022e\u022f\u0003\u0094J\u0000\u022f\u0230\u0005M\u0000\u0000\u0230\u0233"+
		"\u0003\u008aE\u0000\u0231\u0232\u0005\u0094\u0000\u0000\u0232\u0234\u0003"+
		"\u008aE\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000"+
		"\u0000\u0000\u0234\u008f\u0001\u0000\u0000\u0000\u0235\u0236\u0005\u0095"+
		"\u0000\u0000\u0236\u0237\u0005L\u0000\u0000\u0237\u0238\u0003\u0094J\u0000"+
		"\u0238\u0239\u0005M\u0000\u0000\u0239\u023a\u0003\u008aE\u0000\u023a\u0091"+
		"\u0001\u0000\u0000\u0000\u023b\u023c\u0005a\u0000\u0000\u023c\u023d\u0003"+
		"\u0094J\u0000\u023d\u023e\u0005H\u0000\u0000\u023e\u0093\u0001\u0000\u0000"+
		"\u0000\u023f\u0240\u0001\u0000\u0000\u0000\u0240\u0095\u0001\u0000\u0000"+
		"\u0000\u0241\u0243\u0003:\u001d\u0000\u0242\u0241\u0001\u0000\u0000\u0000"+
		"\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000"+
		"\u0244\u0245\u0003l6\u0000\u0245\u0097\u0001\u0000\u0000\u0000\u0246\u0249"+
		"\u0003h4\u0000\u0247\u0249\u0003j5\u0000\u0248\u0246\u0001\u0000\u0000"+
		"\u0000\u0248\u0247\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000"+
		"\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u024b\u0003l6\u0000\u024b"+
		"\u0099\u0001\u0000\u0000\u0000\u024c\u024f\u0003h4\u0000\u024d\u024f\u0003"+
		"j5\u0000\u024e\u024c\u0001\u0000\u0000\u0000\u024e\u024d\u0001\u0000\u0000"+
		"\u0000\u024e\u024f\u0001\u0000\u0000\u0000\u024f\u0250\u0001\u0000\u0000"+
		"\u0000\u0250\u0251\u0003l6\u0000\u0251\u009b\u0001\u0000\u0000\u0000\u0252"+
		"\u0254\u0003p8\u0000\u0253\u0252\u0001\u0000\u0000\u0000\u0253\u0254\u0001"+
		"\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255\u0256\u0003"+
		"n7\u0000\u0256\u009d\u0001\u0000\u0000\u0000\u0257\u0259\u0003\u00a0P"+
		"\u0000\u0258\u0257\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000"+
		"\u0000\u0259\u025b\u0001\u0000\u0000\u0000\u025a\u025c\u0003n7\u0000\u025b"+
		"\u025a\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000\u0000\u0000\u025c"+
		"\u009f\u0001\u0000\u0000\u0000\u025d\u025e\u0005\u0011\u0000\u0000\u025e"+
		"\u025f\u0005J\u0000\u0000\u025f\u0260\u0005@\u0000\u0000\u0260\u0261\u0005"+
		"H\u0000\u0000\u0261\u00a1\u0001\u0000\u0000\u0000\u0262\u0264\u0003\u00a4"+
		"R\u0000\u0263\u0262\u0001\u0000\u0000\u0000\u0263\u0264\u0001\u0000\u0000"+
		"\u0000\u0264\u0266\u0001\u0000\u0000\u0000\u0265\u0267\u0003n7\u0000\u0266"+
		"\u0265\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000\u0000\u0000\u0267"+
		"\u00a3\u0001\u0000\u0000\u0000\u0268\u0269\u0005\u0096\u0000\u0000\u0269"+
		"\u026a\u0005J\u0000\u0000\u026a\u026b\u0007\u0000\u0000\u0000\u026b\u026c"+
		"\u0005H\u0000\u0000\u026c\u00a5\u0001\u0000\u0000\u0000\u026d\u026e\u0003"+
		"\u00a8T\u0000\u026e\u0270\u0005H\u0000\u0000\u026f\u0271\u0003r9\u0000"+
		"\u0270\u026f\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000\u0000"+
		"\u0271\u00a7\u0001\u0000\u0000\u0000\u0272\u0273\u0005\f\u0000\u0000\u0273"+
		"\u0274\u0005J\u0000\u0000\u0274\u0275\u0005\u0097\u0000\u0000\u0275\u0276"+
		"\u0005L\u0000\u0000\u0276\u0277\u0005\u0097\u0000\u0000\u0277\u0278\u0005"+
		"K\u0000\u0000\u0278\u0279\u0005D\u0000\u0000\u0279\u027b\u0005H\u0000"+
		"\u0000\u027a\u027c\u0003x<\u0000\u027b\u027a\u0001\u0000\u0000\u0000\u027b"+
		"\u027c\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000\u027d"+
		"\u027e\u0005M\u0000\u0000\u027e\u027f\u0005H\u0000\u0000\u027f\u00a9\u0001"+
		"\u0000\u0000\u0000\u001e\u00c5\u00ce\u00d2\u00dd\u00e1\u0102\u0114\u014d"+
		"\u0151\u015c\u0160\u0173\u018a\u01a6\u01de\u020a\u0214\u0219\u0228\u0233"+
		"\u0242\u0248\u024e\u0253\u0258\u025b\u0263\u0266\u0270\u027b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}