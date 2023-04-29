// Generated from C:/Users/AHMAD AL BAGHDADI/IdeaProjects/compiler_project\ParserFile.g4 by ANTLR 4.10.1
package gen;
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
	 * Visit a parse tree produced by {@link ParserFile#flutterApp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlutterApp(ParserFile.FlutterAppContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#appContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppContent(ParserFile.AppContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#scaffold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffold(ParserFile.ScaffoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#appBarAppBarContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppBarAppBarContent(ParserFile.AppBarAppBarContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#drawerDrawerContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawerDrawerContent(ParserFile.DrawerDrawerContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#bodyBodyContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyBodyContent(ParserFile.BodyBodyContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#appBar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppBar(ParserFile.AppBarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#appBarBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppBarBody(ParserFile.AppBarBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#appBarAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppBarAttributes(ParserFile.AppBarAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#drawer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawer(ParserFile.DrawerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#drawerBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawerBody(ParserFile.DrawerBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#drawerAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawerAttributes(ParserFile.DrawerAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#childGrammar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildGrammar(ParserFile.ChildGrammarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#colorGrammar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorGrammar(ParserFile.ColorGrammarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#backgroundColorGrammar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackgroundColorGrammar(ParserFile.BackgroundColorGrammarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#widthGrammar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidthGrammar(ParserFile.WidthGrammarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#heightGrammar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeightGrammar(ParserFile.HeightGrammarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#fontFamilyGrammar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontFamilyGrammar(ParserFile.FontFamilyGrammarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#fontSizeGrammar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontSizeGrammar(ParserFile.FontSizeGrammarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#fontStyleGrammar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontStyleGrammar(ParserFile.FontStyleGrammarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(ParserFile.StyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(ParserFile.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(ParserFile.BodyContext ctx);
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
	 * Visit a parse tree produced by {@link ParserFile#childrenChildrenContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildrenChildrenContent(ParserFile.ChildrenChildrenContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#childrenChildrenContentStack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildrenChildrenContentStack(ParserFile.ChildrenChildrenContentStackContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidget(ParserFile.WidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer(ParserFile.ContainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#widthWidthContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidthWidthContent(ParserFile.WidthWidthContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(ParserFile.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#textBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextBody(ParserFile.TextBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#textAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextAttributes(ParserFile.TextAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#textStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextStyle(ParserFile.TextStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#textStyleAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextStyleAttributes(ParserFile.TextStyleAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(ParserFile.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#sizedBox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizedBox(ParserFile.SizedBoxContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(ParserFile.ImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(ParserFile.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#materialButton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialButton(ParserFile.MaterialButtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#onPressedOnPressedContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnPressedOnPressedContent(ParserFile.OnPressedOnPressedContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#printPrintContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintPrintContent(ParserFile.PrintPrintContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(ParserFile.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#listview}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListview(ParserFile.ListviewContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#padding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding(ParserFile.PaddingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#stack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack(ParserFile.StackContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#widgetPositioned}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidgetPositioned(ParserFile.WidgetPositionedContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#positionedParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionedParams(ParserFile.PositionedParamsContext ctx);
}