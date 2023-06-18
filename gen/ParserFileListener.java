// Generated from D:/Compiler2/compiler/src/Grammers\ParserFile.g4 by ANTLR 4.10.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserFile}.
 */
public interface ParserFileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserFile#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(ParserFile.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(ParserFile.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(ParserFile.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(ParserFile.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#dartClass}.
	 * @param ctx the parse tree
	 */
	void enterDartClass(ParserFile.DartClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#dartClass}.
	 * @param ctx the parse tree
	 */
	void exitDartClass(ParserFile.DartClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(ParserFile.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(ParserFile.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#classArg}.
	 * @param ctx the parse tree
	 */
	void enterClassArg(ParserFile.ClassArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#classArg}.
	 * @param ctx the parse tree
	 */
	void exitClassArg(ParserFile.ClassArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(ParserFile.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(ParserFile.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#buildFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBuildFunctionDeclaration(ParserFile.BuildFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#buildFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBuildFunctionDeclaration(ParserFile.BuildFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#constructorArg}.
	 * @param ctx the parse tree
	 */
	void enterConstructorArg(ParserFile.ConstructorArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#constructorArg}.
	 * @param ctx the parse tree
	 */
	void exitConstructorArg(ParserFile.ConstructorArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#buildBody}.
	 * @param ctx the parse tree
	 */
	void enterBuildBody(ParserFile.BuildBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#buildBody}.
	 * @param ctx the parse tree
	 */
	void exitBuildBody(ParserFile.BuildBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(ParserFile.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(ParserFile.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(ParserFile.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(ParserFile.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(ParserFile.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(ParserFile.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#widget}.
	 * @param ctx the parse tree
	 */
	void enterWidget(ParserFile.WidgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#widget}.
	 * @param ctx the parse tree
	 */
	void exitWidget(ParserFile.WidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#scaffold}.
	 * @param ctx the parse tree
	 */
	void enterScaffold(ParserFile.ScaffoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#scaffold}.
	 * @param ctx the parse tree
	 */
	void exitScaffold(ParserFile.ScaffoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#container}.
	 * @param ctx the parse tree
	 */
	void enterContainer(ParserFile.ContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#container}.
	 * @param ctx the parse tree
	 */
	void exitContainer(ParserFile.ContainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#text}.
	 * @param ctx the parse tree
	 */
	void enterText(ParserFile.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#text}.
	 * @param ctx the parse tree
	 */
	void exitText(ParserFile.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#textStyle}.
	 * @param ctx the parse tree
	 */
	void enterTextStyle(ParserFile.TextStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#textStyle}.
	 * @param ctx the parse tree
	 */
	void exitTextStyle(ParserFile.TextStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(ParserFile.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(ParserFile.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#listView}.
	 * @param ctx the parse tree
	 */
	void enterListView(ParserFile.ListViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#listView}.
	 * @param ctx the parse tree
	 */
	void exitListView(ParserFile.ListViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#appBar}.
	 * @param ctx the parse tree
	 */
	void enterAppBar(ParserFile.AppBarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#appBar}.
	 * @param ctx the parse tree
	 */
	void exitAppBar(ParserFile.AppBarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#textField}.
	 * @param ctx the parse tree
	 */
	void enterTextField(ParserFile.TextFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#textField}.
	 * @param ctx the parse tree
	 */
	void exitTextField(ParserFile.TextFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(ParserFile.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(ParserFile.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(ParserFile.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(ParserFile.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#card}.
	 * @param ctx the parse tree
	 */
	void enterCard(ParserFile.CardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#card}.
	 * @param ctx the parse tree
	 */
	void exitCard(ParserFile.CardContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#iconButton}.
	 * @param ctx the parse tree
	 */
	void enterIconButton(ParserFile.IconButtonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#iconButton}.
	 * @param ctx the parse tree
	 */
	void exitIconButton(ParserFile.IconButtonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#inkWell}.
	 * @param ctx the parse tree
	 */
	void enterInkWell(ParserFile.InkWellContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#inkWell}.
	 * @param ctx the parse tree
	 */
	void exitInkWell(ParserFile.InkWellContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#expanded}.
	 * @param ctx the parse tree
	 */
	void enterExpanded(ParserFile.ExpandedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#expanded}.
	 * @param ctx the parse tree
	 */
	void exitExpanded(ParserFile.ExpandedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#bottomNavigationBar}.
	 * @param ctx the parse tree
	 */
	void enterBottomNavigationBar(ParserFile.BottomNavigationBarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#bottomNavigationBar}.
	 * @param ctx the parse tree
	 */
	void exitBottomNavigationBar(ParserFile.BottomNavigationBarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#slider}.
	 * @param ctx the parse tree
	 */
	void enterSlider(ParserFile.SliderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#slider}.
	 * @param ctx the parse tree
	 */
	void exitSlider(ParserFile.SliderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#tabBar}.
	 * @param ctx the parse tree
	 */
	void enterTabBar(ParserFile.TabBarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#tabBar}.
	 * @param ctx the parse tree
	 */
	void exitTabBar(ParserFile.TabBarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#tabBarView}.
	 * @param ctx the parse tree
	 */
	void enterTabBarView(ParserFile.TabBarViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#tabBarView}.
	 * @param ctx the parse tree
	 */
	void exitTabBarView(ParserFile.TabBarViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#drawer}.
	 * @param ctx the parse tree
	 */
	void enterDrawer(ParserFile.DrawerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#drawer}.
	 * @param ctx the parse tree
	 */
	void exitDrawer(ParserFile.DrawerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#floatingActionButton}.
	 * @param ctx the parse tree
	 */
	void enterFloatingActionButton(ParserFile.FloatingActionButtonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#floatingActionButton}.
	 * @param ctx the parse tree
	 */
	void exitFloatingActionButton(ParserFile.FloatingActionButtonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#wrap}.
	 * @param ctx the parse tree
	 */
	void enterWrap(ParserFile.WrapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#wrap}.
	 * @param ctx the parse tree
	 */
	void exitWrap(ParserFile.WrapContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#flex}.
	 * @param ctx the parse tree
	 */
	void enterFlex(ParserFile.FlexContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#flex}.
	 * @param ctx the parse tree
	 */
	void exitFlex(ParserFile.FlexContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#textFormField}.
	 * @param ctx the parse tree
	 */
	void enterTextFormField(ParserFile.TextFormFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#textFormField}.
	 * @param ctx the parse tree
	 */
	void exitTextFormField(ParserFile.TextFormFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#textButton}.
	 * @param ctx the parse tree
	 */
	void enterTextButton(ParserFile.TextButtonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#textButton}.
	 * @param ctx the parse tree
	 */
	void exitTextButton(ParserFile.TextButtonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#icon}.
	 * @param ctx the parse tree
	 */
	void enterIcon(ParserFile.IconContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#icon}.
	 * @param ctx the parse tree
	 */
	void exitIcon(ParserFile.IconContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#sizedBox}.
	 * @param ctx the parse tree
	 */
	void enterSizedBox(ParserFile.SizedBoxContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#sizedBox}.
	 * @param ctx the parse tree
	 */
	void exitSizedBox(ParserFile.SizedBoxContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#center}.
	 * @param ctx the parse tree
	 */
	void enterCenter(ParserFile.CenterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#center}.
	 * @param ctx the parse tree
	 */
	void exitCenter(ParserFile.CenterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#scaffoldArgs}.
	 * @param ctx the parse tree
	 */
	void enterScaffoldArgs(ParserFile.ScaffoldArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#scaffoldArgs}.
	 * @param ctx the parse tree
	 */
	void exitScaffoldArgs(ParserFile.ScaffoldArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#containerArgs}.
	 * @param ctx the parse tree
	 */
	void enterContainerArgs(ParserFile.ContainerArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#containerArgs}.
	 * @param ctx the parse tree
	 */
	void exitContainerArgs(ParserFile.ContainerArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#textArgs}.
	 * @param ctx the parse tree
	 */
	void enterTextArgs(ParserFile.TextArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#textArgs}.
	 * @param ctx the parse tree
	 */
	void exitTextArgs(ParserFile.TextArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#imageArgs}.
	 * @param ctx the parse tree
	 */
	void enterImageArgs(ParserFile.ImageArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#imageArgs}.
	 * @param ctx the parse tree
	 */
	void exitImageArgs(ParserFile.ImageArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#listviewArgs}.
	 * @param ctx the parse tree
	 */
	void enterListviewArgs(ParserFile.ListviewArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#listviewArgs}.
	 * @param ctx the parse tree
	 */
	void exitListviewArgs(ParserFile.ListviewArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#appBarArgs}.
	 * @param ctx the parse tree
	 */
	void enterAppBarArgs(ParserFile.AppBarArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#appBarArgs}.
	 * @param ctx the parse tree
	 */
	void exitAppBarArgs(ParserFile.AppBarArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#textFieldArgs}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldArgs(ParserFile.TextFieldArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#textFieldArgs}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldArgs(ParserFile.TextFieldArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#columnArgs}.
	 * @param ctx the parse tree
	 */
	void enterColumnArgs(ParserFile.ColumnArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#columnArgs}.
	 * @param ctx the parse tree
	 */
	void exitColumnArgs(ParserFile.ColumnArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#rowArgs}.
	 * @param ctx the parse tree
	 */
	void enterRowArgs(ParserFile.RowArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#rowArgs}.
	 * @param ctx the parse tree
	 */
	void exitRowArgs(ParserFile.RowArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#cardArgs}.
	 * @param ctx the parse tree
	 */
	void enterCardArgs(ParserFile.CardArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#cardArgs}.
	 * @param ctx the parse tree
	 */
	void exitCardArgs(ParserFile.CardArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#iconButtonArgs}.
	 * @param ctx the parse tree
	 */
	void enterIconButtonArgs(ParserFile.IconButtonArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#iconButtonArgs}.
	 * @param ctx the parse tree
	 */
	void exitIconButtonArgs(ParserFile.IconButtonArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#inkwellArgs}.
	 * @param ctx the parse tree
	 */
	void enterInkwellArgs(ParserFile.InkwellArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#inkwellArgs}.
	 * @param ctx the parse tree
	 */
	void exitInkwellArgs(ParserFile.InkwellArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#expandedArgs}.
	 * @param ctx the parse tree
	 */
	void enterExpandedArgs(ParserFile.ExpandedArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#expandedArgs}.
	 * @param ctx the parse tree
	 */
	void exitExpandedArgs(ParserFile.ExpandedArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#bottomNavigationBarArgs}.
	 * @param ctx the parse tree
	 */
	void enterBottomNavigationBarArgs(ParserFile.BottomNavigationBarArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#bottomNavigationBarArgs}.
	 * @param ctx the parse tree
	 */
	void exitBottomNavigationBarArgs(ParserFile.BottomNavigationBarArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#sliderArgs}.
	 * @param ctx the parse tree
	 */
	void enterSliderArgs(ParserFile.SliderArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#sliderArgs}.
	 * @param ctx the parse tree
	 */
	void exitSliderArgs(ParserFile.SliderArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#tabBarArgs}.
	 * @param ctx the parse tree
	 */
	void enterTabBarArgs(ParserFile.TabBarArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#tabBarArgs}.
	 * @param ctx the parse tree
	 */
	void exitTabBarArgs(ParserFile.TabBarArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#tabBarViewArgs}.
	 * @param ctx the parse tree
	 */
	void enterTabBarViewArgs(ParserFile.TabBarViewArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#tabBarViewArgs}.
	 * @param ctx the parse tree
	 */
	void exitTabBarViewArgs(ParserFile.TabBarViewArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#drawerArgs}.
	 * @param ctx the parse tree
	 */
	void enterDrawerArgs(ParserFile.DrawerArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#drawerArgs}.
	 * @param ctx the parse tree
	 */
	void exitDrawerArgs(ParserFile.DrawerArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#floatingActionButtonArgs}.
	 * @param ctx the parse tree
	 */
	void enterFloatingActionButtonArgs(ParserFile.FloatingActionButtonArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#floatingActionButtonArgs}.
	 * @param ctx the parse tree
	 */
	void exitFloatingActionButtonArgs(ParserFile.FloatingActionButtonArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#wrapArgs}.
	 * @param ctx the parse tree
	 */
	void enterWrapArgs(ParserFile.WrapArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#wrapArgs}.
	 * @param ctx the parse tree
	 */
	void exitWrapArgs(ParserFile.WrapArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#flexArgs}.
	 * @param ctx the parse tree
	 */
	void enterFlexArgs(ParserFile.FlexArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#flexArgs}.
	 * @param ctx the parse tree
	 */
	void exitFlexArgs(ParserFile.FlexArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#textFormFieldArgs}.
	 * @param ctx the parse tree
	 */
	void enterTextFormFieldArgs(ParserFile.TextFormFieldArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#textFormFieldArgs}.
	 * @param ctx the parse tree
	 */
	void exitTextFormFieldArgs(ParserFile.TextFormFieldArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#textButtonArgs}.
	 * @param ctx the parse tree
	 */
	void enterTextButtonArgs(ParserFile.TextButtonArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#textButtonArgs}.
	 * @param ctx the parse tree
	 */
	void exitTextButtonArgs(ParserFile.TextButtonArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#iconArgs}.
	 * @param ctx the parse tree
	 */
	void enterIconArgs(ParserFile.IconArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#iconArgs}.
	 * @param ctx the parse tree
	 */
	void exitIconArgs(ParserFile.IconArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#sizedBoxArgs}.
	 * @param ctx the parse tree
	 */
	void enterSizedBoxArgs(ParserFile.SizedBoxArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#sizedBoxArgs}.
	 * @param ctx the parse tree
	 */
	void exitSizedBoxArgs(ParserFile.SizedBoxArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#textStyleArgs}.
	 * @param ctx the parse tree
	 */
	void enterTextStyleArgs(ParserFile.TextStyleArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#textStyleArgs}.
	 * @param ctx the parse tree
	 */
	void exitTextStyleArgs(ParserFile.TextStyleArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#centerArgs}.
	 * @param ctx the parse tree
	 */
	void enterCenterArgs(ParserFile.CenterArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#centerArgs}.
	 * @param ctx the parse tree
	 */
	void exitCenterArgs(ParserFile.CenterArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(ParserFile.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(ParserFile.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#drawerArg}.
	 * @param ctx the parse tree
	 */
	void enterDrawerArg(ParserFile.DrawerArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#drawerArg}.
	 * @param ctx the parse tree
	 */
	void exitDrawerArg(ParserFile.DrawerArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#appBarArg}.
	 * @param ctx the parse tree
	 */
	void enterAppBarArg(ParserFile.AppBarArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#appBarArg}.
	 * @param ctx the parse tree
	 */
	void exitAppBarArg(ParserFile.AppBarArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#bottomNavigationBarArg}.
	 * @param ctx the parse tree
	 */
	void enterBottomNavigationBarArg(ParserFile.BottomNavigationBarArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#bottomNavigationBarArg}.
	 * @param ctx the parse tree
	 */
	void exitBottomNavigationBarArg(ParserFile.BottomNavigationBarArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#floatingActionButtonArg}.
	 * @param ctx the parse tree
	 */
	void enterFloatingActionButtonArg(ParserFile.FloatingActionButtonArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#floatingActionButtonArg}.
	 * @param ctx the parse tree
	 */
	void exitFloatingActionButtonArg(ParserFile.FloatingActionButtonArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#child}.
	 * @param ctx the parse tree
	 */
	void enterChild(ParserFile.ChildContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#child}.
	 * @param ctx the parse tree
	 */
	void exitChild(ParserFile.ChildContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#children}.
	 * @param ctx the parse tree
	 */
	void enterChildren(ParserFile.ChildrenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#children}.
	 * @param ctx the parse tree
	 */
	void exitChildren(ParserFile.ChildrenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#height}.
	 * @param ctx the parse tree
	 */
	void enterHeight(ParserFile.HeightContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#height}.
	 * @param ctx the parse tree
	 */
	void exitHeight(ParserFile.HeightContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#width}.
	 * @param ctx the parse tree
	 */
	void enterWidth(ParserFile.WidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#width}.
	 * @param ctx the parse tree
	 */
	void exitWidth(ParserFile.WidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(ParserFile.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(ParserFile.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#margin}.
	 * @param ctx the parse tree
	 */
	void enterMargin(ParserFile.MarginContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#margin}.
	 * @param ctx the parse tree
	 */
	void exitMargin(ParserFile.MarginContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#padding}.
	 * @param ctx the parse tree
	 */
	void enterPadding(ParserFile.PaddingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#padding}.
	 * @param ctx the parse tree
	 */
	void exitPadding(ParserFile.PaddingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#items}.
	 * @param ctx the parse tree
	 */
	void enterItems(ParserFile.ItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#items}.
	 * @param ctx the parse tree
	 */
	void exitItems(ParserFile.ItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#currentIndex}.
	 * @param ctx the parse tree
	 */
	void enterCurrentIndex(ParserFile.CurrentIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#currentIndex}.
	 * @param ctx the parse tree
	 */
	void exitCurrentIndex(ParserFile.CurrentIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#backGroundColor}.
	 * @param ctx the parse tree
	 */
	void enterBackGroundColor(ParserFile.BackGroundColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#backGroundColor}.
	 * @param ctx the parse tree
	 */
	void exitBackGroundColor(ParserFile.BackGroundColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#crossAxis}.
	 * @param ctx the parse tree
	 */
	void enterCrossAxis(ParserFile.CrossAxisContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#crossAxis}.
	 * @param ctx the parse tree
	 */
	void exitCrossAxis(ParserFile.CrossAxisContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#mainAxis}.
	 * @param ctx the parse tree
	 */
	void enterMainAxis(ParserFile.MainAxisContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#mainAxis}.
	 * @param ctx the parse tree
	 */
	void exitMainAxis(ParserFile.MainAxisContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(ParserFile.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(ParserFile.StyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#fontSize}.
	 * @param ctx the parse tree
	 */
	void enterFontSize(ParserFile.FontSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#fontSize}.
	 * @param ctx the parse tree
	 */
	void exitFontSize(ParserFile.FontSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#textArg}.
	 * @param ctx the parse tree
	 */
	void enterTextArg(ParserFile.TextArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#textArg}.
	 * @param ctx the parse tree
	 */
	void exitTextArg(ParserFile.TextArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#imageArg}.
	 * @param ctx the parse tree
	 */
	void enterImageArg(ParserFile.ImageArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#imageArg}.
	 * @param ctx the parse tree
	 */
	void exitImageArg(ParserFile.ImageArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#leading}.
	 * @param ctx the parse tree
	 */
	void enterLeading(ParserFile.LeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#leading}.
	 * @param ctx the parse tree
	 */
	void exitLeading(ParserFile.LeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(ParserFile.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(ParserFile.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#actions}.
	 * @param ctx the parse tree
	 */
	void enterActions(ParserFile.ActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#actions}.
	 * @param ctx the parse tree
	 */
	void exitActions(ParserFile.ActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#iconArg}.
	 * @param ctx the parse tree
	 */
	void enterIconArg(ParserFile.IconArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#iconArg}.
	 * @param ctx the parse tree
	 */
	void exitIconArg(ParserFile.IconArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#flexArg}.
	 * @param ctx the parse tree
	 */
	void enterFlexArg(ParserFile.FlexArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#flexArg}.
	 * @param ctx the parse tree
	 */
	void exitFlexArg(ParserFile.FlexArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#min}.
	 * @param ctx the parse tree
	 */
	void enterMin(ParserFile.MinContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#min}.
	 * @param ctx the parse tree
	 */
	void exitMin(ParserFile.MinContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#max}.
	 * @param ctx the parse tree
	 */
	void enterMax(ParserFile.MaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#max}.
	 * @param ctx the parse tree
	 */
	void exitMax(ParserFile.MaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#tabs}.
	 * @param ctx the parse tree
	 */
	void enterTabs(ParserFile.TabsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#tabs}.
	 * @param ctx the parse tree
	 */
	void exitTabs(ParserFile.TabsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(ParserFile.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(ParserFile.SizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#onTap}.
	 * @param ctx the parse tree
	 */
	void enterOnTap(ParserFile.OnTapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#onTap}.
	 * @param ctx the parse tree
	 */
	void exitOnTap(ParserFile.OnTapContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ParserFile.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ParserFile.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#allowExp}.
	 * @param ctx the parse tree
	 */
	void enterAllowExp(ParserFile.AllowExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#allowExp}.
	 * @param ctx the parse tree
	 */
	void exitAllowExp(ParserFile.AllowExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#runAppExp}.
	 * @param ctx the parse tree
	 */
	void enterRunAppExp(ParserFile.RunAppExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#runAppExp}.
	 * @param ctx the parse tree
	 */
	void exitRunAppExp(ParserFile.RunAppExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#navigateExp}.
	 * @param ctx the parse tree
	 */
	void enterNavigateExp(ParserFile.NavigateExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#navigateExp}.
	 * @param ctx the parse tree
	 */
	void exitNavigateExp(ParserFile.NavigateExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#transtion}.
	 * @param ctx the parse tree
	 */
	void enterTranstion(ParserFile.TranstionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#transtion}.
	 * @param ctx the parse tree
	 */
	void exitTranstion(ParserFile.TranstionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(ParserFile.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(ParserFile.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#pop}.
	 * @param ctx the parse tree
	 */
	void enterPop(ParserFile.PopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#pop}.
	 * @param ctx the parse tree
	 */
	void exitPop(ParserFile.PopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(ParserFile.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(ParserFile.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#constructoFilled}.
	 * @param ctx the parse tree
	 */
	void enterConstructoFilled(ParserFile.ConstructoFilledContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#constructoFilled}.
	 * @param ctx the parse tree
	 */
	void exitConstructoFilled(ParserFile.ConstructoFilledContext ctx);
}