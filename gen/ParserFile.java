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
		PARENTHESES_OPEN=1, PARENTHESES_CLOSE=2, SCAFFOLD=3;
	public static final int
		RULE_widget = 0, RULE_scaffold = 1, RULE_container = 2, RULE_text = 3, 
		RULE_image = 4, RULE_listView = 5, RULE_appBar = 6, RULE_textField = 7, 
		RULE_column = 8, RULE_row = 9, RULE_card = 10, RULE_iconButton = 11, RULE_checkBox = 12, 
		RULE_radio = 13, RULE_inkWell = 14, RULE_expanded = 15, RULE_bottomNavigationBar = 16, 
		RULE_slider = 17, RULE_tabBar = 18, RULE_tabView = 19, RULE_drawer = 20, 
		RULE_floatingActionButton = 21, RULE_wrap = 22, RULE_flex = 23, RULE_textFormField = 24, 
		RULE_textButton = 25, RULE_icon = 26, RULE_scaffoldAttributes = 27, RULE_bodyAttr = 28, 
		RULE_drawerAttr = 29, RULE_appBarAttr = 30, RULE_bottomNavigationBarAttr = 31, 
		RULE_floatingActionButtonAttr = 32, RULE_backGroundColorAttr = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"widget", "scaffold", "container", "text", "image", "listView", "appBar", 
			"textField", "column", "row", "card", "iconButton", "checkBox", "radio", 
			"inkWell", "expanded", "bottomNavigationBar", "slider", "tabBar", "tabView", 
			"drawer", "floatingActionButton", "wrap", "flex", "textFormField", "textButton", 
			"icon", "scaffoldAttributes", "bodyAttr", "drawerAttr", "appBarAttr", 
			"bottomNavigationBarAttr", "floatingActionButtonAttr", "backGroundColorAttr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'Scaffold'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PARENTHESES_OPEN", "PARENTHESES_CLOSE", "SCAFFOLD"
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
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				scaffold();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				container();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				text();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				image();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				listView();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				appBar();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(74);
				textField();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(75);
				column();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(76);
				row();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(77);
				card();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(78);
				iconButton();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(79);
				checkBox();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(80);
				radio();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(81);
				inkWell();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(82);
				expanded();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(83);
				bottomNavigationBar();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(84);
				slider();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(85);
				tabBar();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(86);
				tabView();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(87);
				drawer();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(88);
				floatingActionButton();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(89);
				wrap();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(90);
				flex();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(91);
				textFormField();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(92);
				textButton();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(93);
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
		public TerminalNode PARENTHESES_OPEN() { return getToken(ParserFile.PARENTHESES_OPEN, 0); }
		public ScaffoldAttributesContext scaffoldAttributes() {
			return getRuleContext(ScaffoldAttributesContext.class,0);
		}
		public TerminalNode PARENTHESES_CLOSE() { return getToken(ParserFile.PARENTHESES_CLOSE, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(SCAFFOLD);
			setState(97);
			match(PARENTHESES_OPEN);
			setState(98);
			scaffoldAttributes();
			setState(99);
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

	public static class ContainerContext extends ParserRuleContext {
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

	public static class TextContext extends ParserRuleContext {
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
			}
		}
		catch (RecognitionException re) {
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
			}
		}
		catch (RecognitionException re) {
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
			}
		}
		catch (RecognitionException re) {
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
			}
		}
		catch (RecognitionException re) {
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
			}
		}
		catch (RecognitionException re) {
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
			}
		}
		catch (RecognitionException re) {
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
			}
		}
		catch (RecognitionException re) {
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
			}
		}
		catch (RecognitionException re) {
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
			}
		}
		catch (RecognitionException re) {
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
			}
		}
		catch (RecognitionException re) {
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
			}
		}
		catch (RecognitionException re) {
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
			}
		}
		catch (RecognitionException re) {
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
			}
		}
		catch (RecognitionException re) {
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
			}
		}
		catch (RecognitionException re) {
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
			}
		}
		catch (RecognitionException re) {
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
			}
		}
		catch (RecognitionException re) {
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
			}
		}
		catch (RecognitionException re) {
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
			}
		}
		catch (RecognitionException re) {
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
			}
		}
		catch (RecognitionException re) {
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
			}
		}
		catch (RecognitionException re) {
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
			}
		}
		catch (RecognitionException re) {
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
			}
		}
		catch (RecognitionException re) {
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
			}
		}
		catch (RecognitionException re) {
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
			}
		}
		catch (RecognitionException re) {
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
		public BodyAttrContext bodyAttr() {
			return getRuleContext(BodyAttrContext.class,0);
		}
		public DrawerAttrContext drawerAttr() {
			return getRuleContext(DrawerAttrContext.class,0);
		}
		public AppBarAttrContext appBarAttr() {
			return getRuleContext(AppBarAttrContext.class,0);
		}
		public BottomNavigationBarAttrContext bottomNavigationBarAttr() {
			return getRuleContext(BottomNavigationBarAttrContext.class,0);
		}
		public FloatingActionButtonAttrContext floatingActionButtonAttr() {
			return getRuleContext(FloatingActionButtonAttrContext.class,0);
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
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				bodyAttr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				drawerAttr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				appBarAttr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				bottomNavigationBarAttr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				floatingActionButtonAttr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
				backGroundColorAttr();
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

	public static class BodyAttrContext extends ParserRuleContext {
		public BodyAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBodyAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBodyAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBodyAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyAttrContext bodyAttr() throws RecognitionException {
		BodyAttrContext _localctx = new BodyAttrContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_bodyAttr);
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

	public static class DrawerAttrContext extends ParserRuleContext {
		public DrawerAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawerAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterDrawerAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitDrawerAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitDrawerAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawerAttrContext drawerAttr() throws RecognitionException {
		DrawerAttrContext _localctx = new DrawerAttrContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_drawerAttr);
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

	public static class AppBarAttrContext extends ParserRuleContext {
		public AppBarAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appBarAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAppBarAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAppBarAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAppBarAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppBarAttrContext appBarAttr() throws RecognitionException {
		AppBarAttrContext _localctx = new AppBarAttrContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_appBarAttr);
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

	public static class BottomNavigationBarAttrContext extends ParserRuleContext {
		public BottomNavigationBarAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bottomNavigationBarAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBottomNavigationBarAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBottomNavigationBarAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBottomNavigationBarAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BottomNavigationBarAttrContext bottomNavigationBarAttr() throws RecognitionException {
		BottomNavigationBarAttrContext _localctx = new BottomNavigationBarAttrContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bottomNavigationBarAttr);
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

	public static class FloatingActionButtonAttrContext extends ParserRuleContext {
		public FloatingActionButtonAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingActionButtonAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFloatingActionButtonAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFloatingActionButtonAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFloatingActionButtonAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingActionButtonAttrContext floatingActionButtonAttr() throws RecognitionException {
		FloatingActionButtonAttrContext _localctx = new FloatingActionButtonAttrContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_floatingActionButtonAttr);
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
		enterRule(_localctx, 66, RULE_backGroundColorAttr);
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
		"\u0004\u0001\u0003\u00ac\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000_\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u009e\b\u001b\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0000\u0000\"\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@B\u0000"+
		"\u0000\u00a7\u0000^\u0001\u0000\u0000\u0000\u0002`\u0001\u0000\u0000\u0000"+
		"\u0004e\u0001\u0000\u0000\u0000\u0006g\u0001\u0000\u0000\u0000\bi\u0001"+
		"\u0000\u0000\u0000\nk\u0001\u0000\u0000\u0000\fm\u0001\u0000\u0000\u0000"+
		"\u000eo\u0001\u0000\u0000\u0000\u0010q\u0001\u0000\u0000\u0000\u0012s"+
		"\u0001\u0000\u0000\u0000\u0014u\u0001\u0000\u0000\u0000\u0016w\u0001\u0000"+
		"\u0000\u0000\u0018y\u0001\u0000\u0000\u0000\u001a{\u0001\u0000\u0000\u0000"+
		"\u001c}\u0001\u0000\u0000\u0000\u001e\u007f\u0001\u0000\u0000\u0000 \u0081"+
		"\u0001\u0000\u0000\u0000\"\u0083\u0001\u0000\u0000\u0000$\u0085\u0001"+
		"\u0000\u0000\u0000&\u0087\u0001\u0000\u0000\u0000(\u0089\u0001\u0000\u0000"+
		"\u0000*\u008b\u0001\u0000\u0000\u0000,\u008d\u0001\u0000\u0000\u0000."+
		"\u008f\u0001\u0000\u0000\u00000\u0091\u0001\u0000\u0000\u00002\u0093\u0001"+
		"\u0000\u0000\u00004\u0095\u0001\u0000\u0000\u00006\u009d\u0001\u0000\u0000"+
		"\u00008\u009f\u0001\u0000\u0000\u0000:\u00a1\u0001\u0000\u0000\u0000<"+
		"\u00a3\u0001\u0000\u0000\u0000>\u00a5\u0001\u0000\u0000\u0000@\u00a7\u0001"+
		"\u0000\u0000\u0000B\u00a9\u0001\u0000\u0000\u0000D_\u0003\u0002\u0001"+
		"\u0000E_\u0003\u0004\u0002\u0000F_\u0003\u0006\u0003\u0000G_\u0003\b\u0004"+
		"\u0000H_\u0003\n\u0005\u0000I_\u0003\f\u0006\u0000J_\u0003\u000e\u0007"+
		"\u0000K_\u0003\u0010\b\u0000L_\u0003\u0012\t\u0000M_\u0003\u0014\n\u0000"+
		"N_\u0003\u0016\u000b\u0000O_\u0003\u0018\f\u0000P_\u0003\u001a\r\u0000"+
		"Q_\u0003\u001c\u000e\u0000R_\u0003\u001e\u000f\u0000S_\u0003 \u0010\u0000"+
		"T_\u0003\"\u0011\u0000U_\u0003$\u0012\u0000V_\u0003&\u0013\u0000W_\u0003"+
		"(\u0014\u0000X_\u0003*\u0015\u0000Y_\u0003,\u0016\u0000Z_\u0003.\u0017"+
		"\u0000[_\u00030\u0018\u0000\\_\u00032\u0019\u0000]_\u00034\u001a\u0000"+
		"^D\u0001\u0000\u0000\u0000^E\u0001\u0000\u0000\u0000^F\u0001\u0000\u0000"+
		"\u0000^G\u0001\u0000\u0000\u0000^H\u0001\u0000\u0000\u0000^I\u0001\u0000"+
		"\u0000\u0000^J\u0001\u0000\u0000\u0000^K\u0001\u0000\u0000\u0000^L\u0001"+
		"\u0000\u0000\u0000^M\u0001\u0000\u0000\u0000^N\u0001\u0000\u0000\u0000"+
		"^O\u0001\u0000\u0000\u0000^P\u0001\u0000\u0000\u0000^Q\u0001\u0000\u0000"+
		"\u0000^R\u0001\u0000\u0000\u0000^S\u0001\u0000\u0000\u0000^T\u0001\u0000"+
		"\u0000\u0000^U\u0001\u0000\u0000\u0000^V\u0001\u0000\u0000\u0000^W\u0001"+
		"\u0000\u0000\u0000^X\u0001\u0000\u0000\u0000^Y\u0001\u0000\u0000\u0000"+
		"^Z\u0001\u0000\u0000\u0000^[\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000"+
		"\u0000^]\u0001\u0000\u0000\u0000_\u0001\u0001\u0000\u0000\u0000`a\u0005"+
		"\u0003\u0000\u0000ab\u0005\u0001\u0000\u0000bc\u00036\u001b\u0000cd\u0005"+
		"\u0002\u0000\u0000d\u0003\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000f\u0005\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h\u0007"+
		"\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\t\u0001\u0000\u0000"+
		"\u0000kl\u0001\u0000\u0000\u0000l\u000b\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000n\r\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"p\u000f\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u0011\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t\u0013\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000v\u0015\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000x\u0017\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z\u0019\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u001b"+
		"\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u001d\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u001f\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082!\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084#\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u0086%\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\'\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a)\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c+\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e-\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090/\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000"+
		"\u00921\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094"+
		"3\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u00965\u0001"+
		"\u0000\u0000\u0000\u0097\u009e\u00038\u001c\u0000\u0098\u009e\u0003:\u001d"+
		"\u0000\u0099\u009e\u0003<\u001e\u0000\u009a\u009e\u0003>\u001f\u0000\u009b"+
		"\u009e\u0003@ \u0000\u009c\u009e\u0003B!\u0000\u009d\u0097\u0001\u0000"+
		"\u0000\u0000\u009d\u0098\u0001\u0000\u0000\u0000\u009d\u0099\u0001\u0000"+
		"\u0000\u0000\u009d\u009a\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e7\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a09\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2;\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4=\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a6?\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a8A\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aaC\u0001\u0000\u0000\u0000\u0002^\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}