// Generated from D:/Compiler2/compiler/src/Grammers\ParserFile.g4 by ANTLR 4.12.0
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
	 * Visit a parse tree produced by {@link ParserFile#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(ParserFile.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(ParserFile.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#dartClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDartClass(ParserFile.DartClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(ParserFile.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#classArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassArg(ParserFile.ClassArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(ParserFile.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#buildFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildFunctionDeclaration(ParserFile.BuildFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#constructorArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorArg(ParserFile.ConstructorArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#buildBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildBody(ParserFile.BuildBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(ParserFile.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#attributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeName(ParserFile.AttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(ParserFile.ClassNameContext ctx);
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
	 * Visit a parse tree produced by {@link ParserFile#textStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextStyle(ParserFile.TextStyleContext ctx);
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
	 * Visit a parse tree produced by {@link ParserFile#tabBarView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabBarView(ParserFile.TabBarViewContext ctx);
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
	 * Visit a parse tree produced by {@link ParserFile#center}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenter(ParserFile.CenterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#scaffoldArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffoldArgs(ParserFile.ScaffoldArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#containerArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerArgs(ParserFile.ContainerArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#textArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextArgs(ParserFile.TextArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#imageArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageArgs(ParserFile.ImageArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#listviewArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListviewArgs(ParserFile.ListviewArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#appBarArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppBarArgs(ParserFile.AppBarArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#textFieldArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldArgs(ParserFile.TextFieldArgsContext ctx);
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
	 * Visit a parse tree produced by {@link ParserFile#cardArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCardArgs(ParserFile.CardArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#iconButtonArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIconButtonArgs(ParserFile.IconButtonArgsContext ctx);
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
	 * Visit a parse tree produced by {@link ParserFile#bottomNavigationBarArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBottomNavigationBarArgs(ParserFile.BottomNavigationBarArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#sliderArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliderArgs(ParserFile.SliderArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#tabBarArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabBarArgs(ParserFile.TabBarArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#tabBarViewArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabBarViewArgs(ParserFile.TabBarViewArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#drawerArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawerArgs(ParserFile.DrawerArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#floatingActionButtonArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingActionButtonArgs(ParserFile.FloatingActionButtonArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#wrapArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrapArgs(ParserFile.WrapArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#flexArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlexArgs(ParserFile.FlexArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#textFormFieldArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFormFieldArgs(ParserFile.TextFormFieldArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#textButtonArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextButtonArgs(ParserFile.TextButtonArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#iconArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIconArgs(ParserFile.IconArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#sizedBoxArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizedBoxArgs(ParserFile.SizedBoxArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#textStyleArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextStyleArgs(ParserFile.TextStyleArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#centerArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenterArgs(ParserFile.CenterArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(ParserFile.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#drawerArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawerArg(ParserFile.DrawerArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#appBarArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppBarArg(ParserFile.AppBarArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#bottomNavigationBarArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBottomNavigationBarArg(ParserFile.BottomNavigationBarArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#floatingActionButtonArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingActionButtonArg(ParserFile.FloatingActionButtonArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#child}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChild(ParserFile.ChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#children}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildren(ParserFile.ChildrenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#height}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeight(ParserFile.HeightContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#width}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth(ParserFile.WidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(ParserFile.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#margin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMargin(ParserFile.MarginContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#padding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding(ParserFile.PaddingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItems(ParserFile.ItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#currentIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentIndex(ParserFile.CurrentIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#backGroundColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackGroundColor(ParserFile.BackGroundColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#crossAxis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossAxis(ParserFile.CrossAxisContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#mainAxis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainAxis(ParserFile.MainAxisContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(ParserFile.StyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#fontSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontSize(ParserFile.FontSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#textArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextArg(ParserFile.TextArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#imageArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageArg(ParserFile.ImageArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#leading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeading(ParserFile.LeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(ParserFile.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#actions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActions(ParserFile.ActionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#iconArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIconArg(ParserFile.IconArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#flexArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlexArg(ParserFile.FlexArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#min}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMin(ParserFile.MinContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#max}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMax(ParserFile.MaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#tabs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabs(ParserFile.TabsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize(ParserFile.SizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#onTap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnTap(ParserFile.OnTapContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ParserFile.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#allowExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllowExp(ParserFile.AllowExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#runAppExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRunAppExp(ParserFile.RunAppExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#navigateExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigateExp(ParserFile.NavigateExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#transtion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranstion(ParserFile.TranstionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(ParserFile.PushContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#pop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPop(ParserFile.PopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(ParserFile.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#constructoFilled}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructoFilled(ParserFile.ConstructoFilledContext ctx);
}