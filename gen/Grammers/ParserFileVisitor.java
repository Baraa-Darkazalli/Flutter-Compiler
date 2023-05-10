// Generated from C:/Users/AHMAD AL BAGHDADI/IdeaProjects/compiler_project/src/Grammers\ParserFile.g4 by ANTLR 4.10.1
package Grammers;
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
	 * Visit a parse tree produced by {@link ParserFile#sizedBox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizedBox(ParserFile.SizedBoxContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#decoration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoration(ParserFile.DecorationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#padding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding(ParserFile.PaddingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#bottomNavigationBarArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBottomNavigationBarArgs(ParserFile.BottomNavigationBarArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#currentIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentIndex(ParserFile.CurrentIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItems(ParserFile.ItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#bottomNavigationBarItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBottomNavigationBarItem(ParserFile.BottomNavigationBarItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(ParserFile.LabelContext ctx);
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
	 * Visit a parse tree produced by {@link ParserFile#decorationAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorationAttr(ParserFile.DecorationAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#paddingAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaddingAttr(ParserFile.PaddingAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#sliderAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliderAttributes(ParserFile.SliderAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#sharedBackGroundColorAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSharedBackGroundColorAttr(ParserFile.SharedBackGroundColorAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#sharedChildAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSharedChildAttr(ParserFile.SharedChildAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#sharedWidthAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSharedWidthAttr(ParserFile.SharedWidthAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#sharedHeightAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSharedHeightAttr(ParserFile.SharedHeightAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#sharedColorAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSharedColorAttr(ParserFile.SharedColorAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#sharedDecorationAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSharedDecorationAttr(ParserFile.SharedDecorationAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#sharedPaddingAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSharedPaddingAttr(ParserFile.SharedPaddingAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#crossAxisAlignmentCrossAxisAlignmentContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossAxisAlignmentCrossAxisAlignmentContent(ParserFile.CrossAxisAlignmentCrossAxisAlignmentContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#mainAxisAlignmentMainAxisAlignmentContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainAxisAlignmentMainAxisAlignmentContent(ParserFile.MainAxisAlignmentMainAxisAlignmentContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#children}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildren(ParserFile.ChildrenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#child}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChild(ParserFile.ChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#onTap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnTap(ParserFile.OnTapContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#onPressed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnPressed(ParserFile.OnPressedContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#width}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth(ParserFile.WidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#height}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeight(ParserFile.HeightContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(ParserFile.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#colorValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorValue(ParserFile.ColorValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#colorClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorClass(ParserFile.ColorClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#colorStatic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorStatic(ParserFile.ColorStaticContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#functionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpr(ParserFile.FunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(ParserFile.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(ParserFile.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ParserFile.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ParserFile.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ParserFile.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#expr_Stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_Stmt(ParserFile.Expr_StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#if_Stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_Stmt(ParserFile.If_StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#while_Stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_Stmt(ParserFile.While_StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#print_Stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_Stmt(ParserFile.Print_StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ParserFile.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#listviewArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListviewArgs(ParserFile.ListviewArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#columnArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnArgs(ParserFile.ColumnArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#rowArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowArgs(ParserFile.RowArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#inkwellArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInkwellArgs(ParserFile.InkwellArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#expandedArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpandedArgs(ParserFile.ExpandedArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#expandedflex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpandedflex(ParserFile.ExpandedflexContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#cardArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCardArgs(ParserFile.CardArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#elevationArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElevationArgs(ParserFile.ElevationArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#iconArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIconArgs(ParserFile.IconArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#iconParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIconParam(ParserFile.IconParamContext ctx);
}