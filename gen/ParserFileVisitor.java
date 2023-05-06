// Generated from C:/Users/AHMAD AL BAGHDADI/IdeaProjects/compiler_project\ParserFile.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserFile}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserFileVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserFile#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidget(ParserFile.WidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#scaffold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffold(ParserFile.ScaffoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer(ParserFile.ContainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(ParserFile.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(ParserFile.ImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#listView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListView(ParserFile.ListViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#appBar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppBar(ParserFile.AppBarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#textField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextField(ParserFile.TextFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(ParserFile.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(ParserFile.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#card}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCard(ParserFile.CardContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#iconButton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIconButton(ParserFile.IconButtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#checkBox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckBox(ParserFile.CheckBoxContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#radio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRadio(ParserFile.RadioContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#inkWell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInkWell(ParserFile.InkWellContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#expanded}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpanded(ParserFile.ExpandedContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#bottomNavigationBar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBottomNavigationBar(ParserFile.BottomNavigationBarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#slider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlider(ParserFile.SliderContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#tabBar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabBar(ParserFile.TabBarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#tabView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabView(ParserFile.TabViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#drawer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawer(ParserFile.DrawerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#floatingActionButton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingActionButton(ParserFile.FloatingActionButtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#wrap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrap(ParserFile.WrapContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#flex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlex(ParserFile.FlexContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#textFormField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFormField(ParserFile.TextFormFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#textButton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextButton(ParserFile.TextButtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#icon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIcon(ParserFile.IconContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#scaffoldAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffoldAttributes(ParserFile.ScaffoldAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#scaffoldAttrBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffoldAttrBody(ParserFile.ScaffoldAttrBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#scaffoldAttrDrawer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffoldAttrDrawer(ParserFile.ScaffoldAttrDrawerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#scaffoldAttrAppBar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffoldAttrAppBar(ParserFile.ScaffoldAttrAppBarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#scaffoldAttrBottomNavigationBar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffoldAttrBottomNavigationBar(ParserFile.ScaffoldAttrBottomNavigationBarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#scaffoldAttrFloatingActionButton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffoldAttrFloatingActionButton(ParserFile.ScaffoldAttrFloatingActionButtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#containerAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerAttributes(ParserFile.ContainerAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#sliderAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliderAttributes(ParserFile.SliderAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#backGroundColorAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackGroundColorAttr(ParserFile.BackGroundColorAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#childAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildAttr(ParserFile.ChildAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#widthAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidthAttr(ParserFile.WidthAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#heightAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeightAttr(ParserFile.HeightAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#colorAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorAttr(ParserFile.ColorAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#decorationAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorationAttr(ParserFile.DecorationAttrContext ctx);
}