package Visitor;

import Ast.*;
import Error_Handling.SemanticCheck;
import Symbol_Table.RowTable;
import Symbol_Table.Scope;
import Symbol_Table.SymbolTable;
import gen.ParserFile;
import gen.ParserFileBaseVisitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BaseVisitor extends ParserFileBaseVisitor {

    SymbolTable symbolTable = new SymbolTable();


    @Override
    public Root visitRoot(ParserFile.RootContext ctx) {
        Root root = new Root();
        if (!ctx.dartClass().isEmpty()) {
            for (int i = 0; i < ctx.dartClass().size(); i++) {
                if (ctx.dartClass(i) != null) {
                    root.getDartClass().add((DartClass) visitDartClass(ctx.dartClass(i)));
                }
            }
        }
//        symbolTable.print();
        SemanticCheck semanticCheck=new SemanticCheck();
        semanticCheck.setSymbolTable(symbolTable);
        semanticCheck.check();
        return root;
    }

    @Override
    public Object visitMain(ParserFile.MainContext ctx) {
        return super.visitMain(ctx);
    }

    @Override
    public DartClass visitDartClass(ParserFile.DartClassContext ctx) {
        DartClass dartClass = new DartClass();

        //--------------- FOR SYMBOL TABLE --------------
        RowTable rowTable;
        String className, constName;
        Scope constScope = new Scope();
        Scope classScope = new Scope();
        ArrayList<RowTable> classRows = new ArrayList<RowTable>();
        ArrayList<RowTable> constRows = new ArrayList<RowTable>();
        //-----------------------------------------------------

        dartClass.setClassName((String) visitClassName(ctx.className()));
        classScope.setTokenLine(ctx.CLASS().getSymbol().getLine());
        className = dartClass.getClassName();

        if (!ctx.classBody().isEmpty()) {
            for (int i = 0; i < ctx.classBody().size(); i++) {
                if (ctx.classBody(i) != null) {
                    dartClass.getClassBody().add((ClassBody) visitClassBody(ctx.classBody(i)));

                    //------------  FOR SYMBOL TABLE -------------
                    ClassArg classArg = visitClassBody(ctx.classBody(i)).getClassArg();
                    if (classArg != null) {
                        rowTable = new RowTable();
                        rowTable.setDataType(classArg.getDataType());
                        rowTable.setName(classArg.getAttributeName());
                        classRows.add(rowTable);
                        classArg = null;
                    }

                    ConstructorDeclaration constructorDeclaration = visitClassBody(ctx.classBody(i)).getConstructorDeclaration();
                    if (constructorDeclaration != null) {
                        constName = constructorDeclaration.getClassName();
                        List<ConstructorArg> constructorArgs = constructorDeclaration.getConstructorArgs();
                        ConstructorArg constructorArg;
                        for (int j = 0; j < constructorArgs.size(); j++) {
                            rowTable = new RowTable();
                            constructorArg = constructorArgs.get(j);
                            rowTable.setDataType(constructorArg.getDataType());
                            rowTable.setName(constructorArg.getAttributeName());
                            constRows.add(rowTable);
                        }
                        constScope.setName(constName);
                        constScope.setRowTableList(constRows);
                        classScope.setScopeList(constScope);
                        constructorDeclaration = null;
                    }

                    BuildFunctionDeclaration buildFunctionDeclaration = visitClassBody(ctx.classBody(i)).getBuildFunctionDeclaration();
                    if (buildFunctionDeclaration != null) {
                        rowTable = new RowTable();
                        rowTable.setDataType("Widget");
                        rowTable.setName("build");
                        classRows.add(rowTable);
                        buildFunctionDeclaration = null;
                    }

                }
            }
        }
        classScope.setName(className);
        classScope.setRowTableList(classRows);
        symbolTable.setScopeList(classScope);
        return dartClass;
    }

    @Override
    public ClassBody visitClassBody(ParserFile.ClassBodyContext ctx) {
        ClassBody classBody = new ClassBody();
        if (ctx.classArg() != null) {
            classBody.setClassArg((ClassArg) visitClassArg(ctx.classArg()));

        } else if (ctx.constructorDeclaration() != null) {
            classBody.setConstructorDeclaration((ConstructorDeclaration) visitConstructorDeclaration(ctx.constructorDeclaration()));
        } else if (ctx.buildFunctionDeclaration() != null) {
            classBody.setBuildFunctionDeclaration((BuildFunctionDeclaration) visitBuildFunctionDeclaration(ctx.buildFunctionDeclaration()));
        }
        return classBody;
    }

    @Override
    public ClassArg visitClassArg(ParserFile.ClassArgContext ctx) {
        ClassArg classArg = new ClassArg();
        classArg.setDataType((String) visitDataType(ctx.dataType()));
        classArg.setAttributeName((String) visitAttributeName(ctx.attributeName()));
        return classArg;
    }

    @Override
    public ConstructorDeclaration visitConstructorDeclaration(ParserFile.ConstructorDeclarationContext ctx) {
        ConstructorDeclaration constructorDeclaration = new ConstructorDeclaration();

        constructorDeclaration.setClassName((String) visitClassName(ctx.className()));
        if (!ctx.constructorArg().isEmpty()) {
            for (int i = 0; i < ctx.constructorArg().size(); i++) {
                if (ctx.constructorArg(i) != null) {
                    constructorDeclaration.getConstructorArgs().add((ConstructorArg) visitConstructorArg(ctx.constructorArg(i)));
                }
            }
        }
        return constructorDeclaration;
    }

    @Override
    public BuildFunctionDeclaration visitBuildFunctionDeclaration(ParserFile.BuildFunctionDeclarationContext ctx) {
        BuildFunctionDeclaration buildFunctionDeclaration = new BuildFunctionDeclaration();

        buildFunctionDeclaration.setBuildBody((BuildBody) visitBuildBody(ctx.buildBody()));
        return buildFunctionDeclaration;
    }

    @Override
    public ConstructorArg visitConstructorArg(ParserFile.ConstructorArgContext ctx) {
        ConstructorArg constructorArg = new ConstructorArg();
        constructorArg.setDataType((String) visitDataType(ctx.dataType()));
        constructorArg.setAttributeName((String) visitAttributeName(ctx.attributeName()));
        return constructorArg;
    }

    @Override
    public BuildBody visitBuildBody(ParserFile.BuildBodyContext ctx) {
        BuildBody buildBody = new BuildBody();
        buildBody.setWidget((Widget) visitWidget(ctx.widget()));
        return buildBody;
    }

    @Override
    public String visitDataType(ParserFile.DataTypeContext ctx) {
        return ctx.DATA_TYPE().getText();
    }

    @Override
    public String visitAttributeName(ParserFile.AttributeNameContext ctx) {
        return ctx.IDENTIFIER().getText();
    }

    @Override
    public String visitClassName(ParserFile.ClassNameContext ctx) {
        return ctx.IDENTIFIER().getText();
    }

    @Override
    public Widget visitWidget(ParserFile.WidgetContext ctx) {
        Widget widget = new Widget();
        if (ctx.scaffold() != null) {
            widget.setScaffold((Scaffold) visitScaffold(ctx.scaffold()));
        } else if (ctx.container() != null) {
            widget.setContainer((Container) visitContainer(ctx.container()));
        } else if (ctx.text() != null) {
            widget.setText((Text) visitText(ctx.text()));
        } else if (ctx.image() != null) {
            widget.setImage((Image) visitImage(ctx.image()));
        } else if (ctx.listView() != null) {
            widget.setListView((ListView) visitListView(ctx.listView()));
        } else if (ctx.appBar() != null) {
            widget.setAppBar((AppBar) visitAppBar(ctx.appBar()));
        } else if (ctx.textField() != null) {
            widget.setTextField((TextField) visitTextField(ctx.textField()));
        } else if (ctx.column() != null) {
            widget.setColumn((Column) visitColumn(ctx.column()));
        } else if (ctx.row() != null) {
            widget.setRow((Row) visitRow(ctx.row()));
        } else if (ctx.card() != null) {
            widget.setCard((Card) visitCard(ctx.card()));
        } else if (ctx.iconButton() != null) {
            widget.setIconButton((IconButton) visitIconButton(ctx.iconButton()));
        } else if (ctx.inkWell() != null) {
            widget.setInkWell((InkWell) visitInkWell(ctx.inkWell()));
        } else if (ctx.expanded() != null) {
            widget.setExpanded((Expanded) visitExpanded(ctx.expanded()));
        } else if (ctx.bottomNavigationBar() != null) {
            widget.setBottomNavigationBar((BottomNavigationBar) visitBottomNavigationBar(ctx.bottomNavigationBar()));
        } else if (ctx.slider() != null) {
            widget.setSlider((Slider) visitSlider(ctx.slider()));
        } else if (ctx.tabBar() != null) {
            widget.setTabBar((TabBar) visitTabBar(ctx.tabBar()));
        } else if (ctx.tabBarView() != null) {
            widget.setTabView((TabView) visitTabBarView(ctx.tabBarView()));
        } else if (ctx.drawer() != null) {
            widget.setDrawer((Drawer) visitDrawer(ctx.drawer()));
        } else if (ctx.floatingActionButton() != null) {
            widget.setFloatingActionButton((FloatingActionButton) visitFloatingActionButton(ctx.floatingActionButton()));
        } else if (ctx.wrap() != null) {
            widget.setWrap((Wrap) visitWrap(ctx.wrap()));
        } else if (ctx.flex() != null) {
            widget.setFlex((Flex) visitFlex(ctx.flex()));
        } else if (ctx.textFormField() != null) {
            widget.setTextFormField((TextFormField) visitTextFormField(ctx.textFormField()));
        } else if (ctx.textButton() != null) {
            widget.setTextButton((TextButton) visitTextButton(ctx.textButton()));
        } else if (ctx.icon() != null) {
            widget.setIcon((Icon) visitIcon(ctx.icon()));
        } else if (ctx.sizedBox() != null) {
            widget.setSizedBox((SizedBox) visitSizedBox(ctx.sizedBox()));
        }
        return widget;
    }

    @Override
    public Scaffold visitScaffold(ParserFile.ScaffoldContext ctx) {
        Scaffold scaffold = new Scaffold();

        if (!ctx.scaffoldArgs().isEmpty()) {
            for (int i = 0; i < ctx.scaffoldArgs().size(); i++) {
                if (ctx.scaffoldArgs(i) != null) {
                    scaffold.getScaffoldArgs().add((ScaffoldArgs) visitScaffoldArgs(ctx.scaffoldArgs(i)));

                }
            }
        }
        return scaffold;
    }

    @Override
    public Container visitContainer(ParserFile.ContainerContext ctx) {
        Container container = new Container();
        if (!ctx.containerArgs().isEmpty()) {
            for (int i = 0; i < ctx.containerArgs().size(); i++) {
                if (ctx.containerArgs(i) != null) {
                    container.getContainerArgs().add((ContainerArg) visitContainerArgs(ctx.containerArgs(i)));

                }
            }
        }

        return container;
    }

    @Override
    public Text visitText(ParserFile.TextContext ctx) {
        Text text = new Text();
        if (!ctx.textArgs().isEmpty()) {
            for (int i = 0; i < ctx.textArgs().size(); i++) {
                if (ctx.textArgs(i) != null) {
                    text.getTextArgs().add((TextArgs) visitTextArgs(ctx.textArgs(i)));

                }
            }
        }
        return text;
    }

    @Override
    public TextStyle visitTextStyle(ParserFile.TextStyleContext ctx) {
        TextStyle textStyle = new TextStyle();
        if (!ctx.textStyleArgs().isEmpty()) {
            for (int i = 0; i < ctx.textStyleArgs().size(); i++) {
                if (ctx.textStyleArgs(i) != null) {
                    textStyle.getTextStyleArgs().add((TextStyleArgs) visitTextStyleArgs(ctx.textStyleArgs(i)));

                }
            }
        }
        return textStyle;
    }

    @Override
    public Image visitImage(ParserFile.ImageContext ctx) {
        Image image = new Image();
        if (!ctx.imageArgs().isEmpty()) {
            for (int i = 0; i < ctx.imageArgs().size(); i++) {
                if (ctx.imageArgs(i) != null) {
                    image.getImageArgs().add((ImageArgs) visitImageArgs(ctx.imageArgs(i)));

                }
            }
        }
        return image;
    }

    @Override
    public ListView visitListView(ParserFile.ListViewContext ctx) {
        ListView listView = new ListView();
        if (!ctx.listviewArgs().isEmpty()) {
            for (int i = 0; i < ctx.listviewArgs().size(); i++) {
                if (ctx.listviewArgs(i) != null) {
                    listView.getListviewArgs().add((ListviewArgs) visitListviewArgs(ctx.listviewArgs(i)));

                }
            }
        }
        return listView;
    }

    @Override
    public AppBar visitAppBar(ParserFile.AppBarContext ctx) {
        AppBar appBar = new AppBar();
        if (!ctx.appBarArgs().isEmpty()) {
            for (int i = 0; i < ctx.appBarArgs().size(); i++) {
                if (ctx.appBarArgs(i) != null) {
                    appBar.getAppBarArgs().add((AppBarArgs) visitAppBarArgs(ctx.appBarArgs(i)));

                }
            }
        }
        return appBar;
    }

    @Override
    public TextField visitTextField(ParserFile.TextFieldContext ctx) {
        TextField textField = new TextField();
        if (!ctx.textFieldArgs().isEmpty()) {
            for (int i = 0; i < ctx.textFieldArgs().size(); i++) {
                if (ctx.textFieldArgs(i) != null) {
                    textField.getTextFieldArgs().add((TextFieldArgs) visitTextFieldArgs(ctx.textFieldArgs(i)));

                }
            }
        }
        return textField;
    }

    @Override
    public Column visitColumn(ParserFile.ColumnContext ctx) {
        Column column = new Column();
        if (!ctx.columnArgs().isEmpty()) {
            for (int i = 0; i < ctx.columnArgs().size(); i++) {
                if (ctx.columnArgs(i) != null) {
                    column.getColumnArgs().add((ColumnArgs) visitColumnArgs(ctx.columnArgs(i)));

                }
            }
        }
        return column;
    }

    @Override
    public Row visitRow(ParserFile.RowContext ctx) {
        Row row = new Row();
        if (!ctx.rowArgs().isEmpty()) {
            for (int i = 0; i < ctx.rowArgs().size(); i++) {
                if (ctx.rowArgs(i) != null) {
                    row.getRowArgs().add((RowArgs) visitRowArgs(ctx.rowArgs(i)));

                }
            }
        }
        return row;
    }

    @Override
    public Card visitCard(ParserFile.CardContext ctx) {
        Card card = new Card();
        if (!ctx.cardArgs().isEmpty()) {
            for (int i = 0; i < ctx.cardArgs().size(); i++) {
                if (ctx.cardArgs(i) != null) {
                    card.getCardArgs().add((CardArgs) visitCardArgs(ctx.cardArgs(i)));

                }
            }
        }
        return card;
    }

    @Override
    public IconButton visitIconButton(ParserFile.IconButtonContext ctx) {
        IconButton iconButton = new IconButton();
        if (!ctx.iconButtonArgs().isEmpty()) {
            for (int i = 0; i < ctx.iconButtonArgs().size(); i++) {
                if (ctx.iconButtonArgs(i) != null) {
                    iconButton.getIconButtonArgs().add((IconButtonArgs) visitIconButtonArgs(ctx.iconButtonArgs(i)));

                }
            }
        }
        return iconButton;
    }

    @Override
    public InkWell visitInkWell(ParserFile.InkWellContext ctx) {
        InkWell inkWell = new InkWell();
        if (!ctx.inkwellArgs().isEmpty()) {
            for (int i = 0; i < ctx.inkwellArgs().size(); i++) {
                if (ctx.inkwellArgs(i) != null) {
                    inkWell.getInkWellArgs().add((InkWellArgs) visitInkwellArgs(ctx.inkwellArgs(i)));

                }
            }
        }
        return inkWell;
    }

    @Override
    public Expanded visitExpanded(ParserFile.ExpandedContext ctx) {
        Expanded expanded = new Expanded();
        if (!ctx.expandedArgs().isEmpty()) {
            for (int i = 0; i < ctx.expandedArgs().size(); i++) {
                if (ctx.expandedArgs(i) != null) {
                    expanded.getExpandedArgs().add((ExpandedArgs) visitExpandedArgs(ctx.expandedArgs(i)));

                }
            }
        }
        return expanded;
    }

    @Override
    public BottomNavigationBar visitBottomNavigationBar(ParserFile.BottomNavigationBarContext ctx) {
        BottomNavigationBar bottomNavigationBar = new BottomNavigationBar();
        if (!ctx.bottomNavigationBarArgs().isEmpty()) {
            for (int i = 0; i < ctx.bottomNavigationBarArgs().size(); i++) {
                if (ctx.bottomNavigationBarArgs(i) != null) {
                    bottomNavigationBar.getBottomNavigationBarArgs().add((BottomNavigationBarArgs) visitBottomNavigationBarArgs(ctx.bottomNavigationBarArgs(i)));

                }
            }
        }
        return bottomNavigationBar;
    }

    @Override
    public Slider visitSlider(ParserFile.SliderContext ctx) {
        Slider slider = new Slider();
        if (!ctx.sliderArgs().isEmpty()) {
            for (int i = 0; i < ctx.sliderArgs().size(); i++) {
                if (ctx.sliderArgs(i) != null) {
                    slider.getSliderArgs().add((SliderArgs) visitSliderArgs(ctx.sliderArgs(i)));

                }
            }
        }
        return slider;
    }

    @Override
    public TabBar visitTabBar(ParserFile.TabBarContext ctx) {
        TabBar tabBar = new TabBar();
        if (!ctx.tabBarArgs().isEmpty()) {
            for (int i = 0; i < ctx.tabBarArgs().size(); i++) {
                if (ctx.tabBarArgs(i) != null) {
                    tabBar.getTabBarArgs().add((TabBarArgs) visitTabBarArgs(ctx.tabBarArgs(i)));

                }
            }
        }
        return tabBar;
    }

    @Override
    public TabView visitTabBarView(ParserFile.TabBarViewContext ctx) {
        TabView tabView = new TabView();
        if (!ctx.tabBarViewArgs().isEmpty()) {
            for (int i = 0; i < ctx.tabBarViewArgs().size(); i++) {
                if (ctx.tabBarViewArgs(i) != null) {
                    tabView.getTabBarViewArgs().add((TabBarViewArgs) visitTabBarViewArgs(ctx.tabBarViewArgs(i)));

                }
            }
        }
        return tabView;
    }

    @Override
    public Drawer visitDrawer(ParserFile.DrawerContext ctx) {
        Drawer drawer = new Drawer();
        if (!ctx.drawerArgs().isEmpty()) {
            for (int i = 0; i < ctx.drawerArgs().size(); i++) {
                if (ctx.drawerArgs(i) != null) {
                    drawer.getDrawerArgs().add((DrawerArgs) visitDrawerArgs(ctx.drawerArgs(i)));

                }
            }
        }
        return drawer;
    }

    @Override
    public FloatingActionButton visitFloatingActionButton(ParserFile.FloatingActionButtonContext ctx) {
        FloatingActionButton floatingActionButton = new FloatingActionButton();
        if (!ctx.floatingActionButtonArgs().isEmpty()) {
            for (int i = 0; i < ctx.floatingActionButtonArgs().size(); i++) {
                if (ctx.floatingActionButtonArgs(i) != null) {
                    floatingActionButton.getFloatingActionButtonArgs().add((FloatingActionButtonArgs) visitFloatingActionButtonArgs(ctx.floatingActionButtonArgs(i)));

                }
            }
        }
        return floatingActionButton;
    }

    @Override
    public Wrap visitWrap(ParserFile.WrapContext ctx) {
        Wrap wrap = new Wrap();
        if (!ctx.wrapArgs().isEmpty()) {
            for (int i = 0; i < ctx.wrapArgs().size(); i++) {
                if (ctx.wrapArgs(i) != null) {
                    wrap.getWrapArgs().add((WrapArgs) visitWrapArgs(ctx.wrapArgs(i)));

                }
            }
        }
        return wrap;
    }

    @Override
    public Flex visitFlex(ParserFile.FlexContext ctx) {
        Flex flex = new Flex();
        if (!ctx.flexArgs().isEmpty()) {
            for (int i = 0; i < ctx.flexArgs().size(); i++) {
                if (ctx.flexArgs(i) != null) {
                    flex.getFlexArgs().add((FlexArgs) visitFlexArgs(ctx.flexArgs(i)));

                }
            }
        }
        return flex;
    }

    @Override
    public TextFormField visitTextFormField(ParserFile.TextFormFieldContext ctx) {
        TextFormField textFormField = new TextFormField();
        if (!ctx.textFormFieldArgs().isEmpty()) {
            for (int i = 0; i < ctx.textFormFieldArgs().size(); i++) {
                if (ctx.textFormFieldArgs(i) != null) {
                    textFormField.getTextFormFieldArgs().add((TextFormFieldArgs) visitTextFormFieldArgs(ctx.textFormFieldArgs(i)));

                }
            }
        }
        return textFormField;
    }

    @Override
    public TextButton visitTextButton(ParserFile.TextButtonContext ctx) {
        TextButton textButton = new TextButton();
        if (!ctx.textButtonArgs().isEmpty()) {
            for (int i = 0; i < ctx.textButtonArgs().size(); i++) {
                if (ctx.textButtonArgs(i) != null) {
                    textButton.getTextButtonArgs().add((TextButtonArgs) visitTextButtonArgs(ctx.textButtonArgs(i)));

                }
            }
        }
        return textButton;
    }

    @Override
    public Icon visitIcon(ParserFile.IconContext ctx) {
        Icon icon = new Icon();
        if (!ctx.iconArgs().isEmpty()) {
            for (int i = 0; i < ctx.iconArgs().size(); i++) {
                if (ctx.iconArgs(i) != null) {
                    icon.getIconArgs().add((IconArgs) visitIconArgs(ctx.iconArgs(i)));

                }
            }
        }
        return icon;
    }

    @Override
    public SizedBox visitSizedBox(ParserFile.SizedBoxContext ctx) {
        SizedBox sizedBox = new SizedBox();
        if (!ctx.sizedBoxArgs().isEmpty()) {
            for (int i = 0; i < ctx.sizedBoxArgs().size(); i++) {
                if (ctx.sizedBoxArgs(i) != null) {
                    sizedBox.getSizedBoxArgs().add((SizedBoxArgs) visitSizedBoxArgs(ctx.sizedBoxArgs(i)));

                }
            }
        }
        return sizedBox;
    }

    @Override
    public Center visitCenter(ParserFile.CenterContext ctx) {
        Center center = new Center();
        center.setCenterArgs((CenterArgs) visitCenterArgs(ctx.centerArgs()));
        return center;
    }

    @Override
    public ScaffoldArgs visitScaffoldArgs(ParserFile.ScaffoldArgsContext ctx) {
        ScaffoldArgs scaffoldArgs = new ScaffoldArgs();
        if (ctx.body() != null) {
            scaffoldArgs.setBody((Body) visitBody(ctx.body()));
        } else if (ctx.drawerArg() != null) {
            scaffoldArgs.setDrawerArg((DrawerArg) visitDrawerArg(ctx.drawerArg()));
        } else if (ctx.appBarArg() != null) {
            scaffoldArgs.setAppBarArg((AppBarArg) visitAppBarArg(ctx.appBarArg()));
        } else if (ctx.bottomNavigationBarArg() != null) {
            scaffoldArgs.setBottomNavigationBarArg((BottomNavigationBarArg) visitBottomNavigationBarArg(ctx.bottomNavigationBarArg()));
        } else if (ctx.floatingActionButtonArg() != null) {
            scaffoldArgs.setFloatingActionButtonArg((FloatingActionButtonArg) visitFloatingActionButtonArg(ctx.floatingActionButtonArg()));
        } else if (ctx.backGroundColor() != null) {
            scaffoldArgs.setBackGroundColor((BackGroundColor) visitBackGroundColor(ctx.backGroundColor()));
        }
        return scaffoldArgs;
    }

    @Override
    public ContainerArg visitContainerArgs(ParserFile.ContainerArgsContext ctx) {
        ContainerArg containerArg = new ContainerArg();
        if (ctx.child() != null) {
            containerArg.setChild((Child) visitChild(ctx.child()));
        } else if (ctx.width() != null) {
            containerArg.setWidth((Width) visitWidth(ctx.width()));
        } else if (ctx.height() != null) {
            containerArg.setHeight((Height) visitHeight(ctx.height()));
        } else if (ctx.color() != null) {
            containerArg.setColor((Color) visitColor(ctx.color()));
        } else if (ctx.margin() != null) {
            containerArg.setMargin((Margin) visitMargin(ctx.margin()));
        } else if (ctx.padding() != null) {
            containerArg.setPadding((Padding) visitPadding(ctx.padding()));
        }
        return containerArg;
    }

    @Override
    public TextArgs visitTextArgs(ParserFile.TextArgsContext ctx) {
        TextArgs textArgs = new TextArgs();
        if (ctx.textArg() != null) {
            textArgs.setTextArg((TextArg) visitTextArg(ctx.textArg()));
        } else if (ctx.style() != null) {
            textArgs.setStyle((Style) visitStyle(ctx.style()));
        }
        return textArgs;
    }

    @Override
    public TextArg visitTextArg(ParserFile.TextArgContext ctx) {
        TextArg textArg=new TextArg();
        if(ctx.STRING()!=null){
            textArg.setString(ctx.STRING().getText());
        }else if(ctx.IDENTIFIER()!=null){
            textArg.setVariableName(ctx.IDENTIFIER().getText());
        }
        return textArg;
    }

    @Override
    public ImageArgs visitImageArgs(ParserFile.ImageArgsContext ctx) {
        ImageArgs imageArgs = new ImageArgs();
        if (ctx.imageArg() != null) {
            imageArgs.setImageArg((ImageArg) visitImageArg(ctx.imageArg()));
        } else if (ctx.color() != null) {
            imageArgs.setColor((Color) visitColor(ctx.color()));
        } else if (ctx.height() != null) {
            imageArgs.setHeight((Height) visitHeight(ctx.height()));
        } else if (ctx.width() != null) {
            imageArgs.setWidth((Width) visitWidth(ctx.width()));
        }
        return imageArgs;
    }

    @Override
    public ListviewArgs visitListviewArgs(ParserFile.ListviewArgsContext ctx) {
        ListviewArgs listviewArgs = new ListviewArgs();
        if (ctx.children != null) {
            listviewArgs.setChildren((Children) visitChildren(ctx.children()));
        } else if (ctx.padding() != null) {
            listviewArgs.setPadding((Padding) visitPadding(ctx.padding()));
        }
        return listviewArgs;
    }

    @Override
    public AppBarArgs visitAppBarArgs(ParserFile.AppBarArgsContext ctx) {
        AppBarArgs appBarArgs = new AppBarArgs();
        if (ctx.title() != null) {
            appBarArgs.setTitle((Title) visitTitle(ctx.title()));
        } else if (ctx.leading() != null) {
            appBarArgs.setLeading((Leading) visitLeading(ctx.leading()));
        } else if (ctx.actions() != null) {
            appBarArgs.setActions((Actions) visitActions(ctx.actions()));
        } else if (ctx.backGroundColor() != null) {
            appBarArgs.setBackGroundColor((BackGroundColor) visitBackGroundColor(ctx.backGroundColor()));
        }

        return appBarArgs;
    }

    @Override
    public TextFieldArgs visitTextFieldArgs(ParserFile.TextFieldArgsContext ctx) {
        TextFieldArgs textFieldArgs = new TextFieldArgs();
        if (ctx.style() != null) {
            textFieldArgs.setStyle((Style) visitStyle(ctx.style()));
        }
        return textFieldArgs;
    }

    @Override
    public ColumnArgs visitColumnArgs(ParserFile.ColumnArgsContext ctx) {
        ColumnArgs columnArgs = new ColumnArgs();

        if (ctx.children() != null) {
            columnArgs.setChildren((Children) visitChildren(ctx.children()));
        }
         else if (ctx.mainAxis() != null) {
            columnArgs.setMainAxis((MainAxis) visitMainAxis(ctx.mainAxis()));
        }
         else if (ctx.crossAxis() != null) {
            columnArgs.setCrossAxis((CrossAxis) visitCrossAxis(ctx.crossAxis()));
        }
        return columnArgs;
    }

    @Override
    public RowArgs visitRowArgs(ParserFile.RowArgsContext ctx) {
        RowArgs rowArgs = new RowArgs();
        if (ctx.children != null) {
            rowArgs.setChildren((Children) visitChildren(ctx.children()));
        }
        else if (ctx.mainAxis() != null) {
            System.out.println("main row");
            rowArgs.setMainAxis((MainAxis) visitMainAxis(ctx.mainAxis()));
        }
        else if (ctx.crossAxis() != null) {
            System.out.println("cross row");
            rowArgs.setCrossAxis((CrossAxis) visitCrossAxis(ctx.crossAxis()));
        }
        return rowArgs;
    }

    @Override
    public CardArgs visitCardArgs(ParserFile.CardArgsContext ctx) {
        CardArgs cardArgs = new CardArgs();

        if (ctx.color() != null) {
            cardArgs.setColor((Color) visitColor(ctx.color()));
        } else if (ctx.margin() != null) {
            cardArgs.setMargin((Margin) visitMargin(ctx.margin()));
        } else if (ctx.child() != null) {
            cardArgs.setChild((Child) visitChild(ctx.child()));
        }
        return cardArgs;
    }

    @Override
    public IconButtonArgs visitIconButtonArgs(ParserFile.IconButtonArgsContext ctx) {
        IconButtonArgs iconButtonArgs = new IconButtonArgs();
        if (ctx.iconArg() != null) {
            iconButtonArgs.setIconArg((IconArg) visitIconArg(ctx.iconArg()));
        } else if (ctx.color() != null) {
            iconButtonArgs.setColor((Color) visitColor(ctx.color()));
        } else if (ctx.padding() != null) {
            iconButtonArgs.setPadding((Padding) visitPadding(ctx.padding()));
        }

        return iconButtonArgs;
    }

    @Override
    public InkWellArgs visitInkwellArgs(ParserFile.InkwellArgsContext ctx) {
        InkWellArgs inkWellArgs = new InkWellArgs();

        if (ctx.child() != null) {
            inkWellArgs.setChild((Child) visitChild(ctx.child()));
        } else if (ctx.onTap() != null) {
            inkWellArgs.setOnTap((OnTap) visitOnTap(ctx.onTap()));
        }
        return inkWellArgs;
    }

    @Override
    public ExpandedArgs visitExpandedArgs(ParserFile.ExpandedArgsContext ctx) {
        ExpandedArgs expandedArgs = new ExpandedArgs();

        if (ctx.child() != null) {
            expandedArgs.setChild((Child) visitChild(ctx.child()));
        } else if (ctx.flexArg() != null) {
            expandedArgs.setFlexArg((FlexArg) visitFlexArg(ctx.flexArg()));
        }

        return expandedArgs;
    }

    @Override
    public BottomNavigationBarArgs visitBottomNavigationBarArgs(ParserFile.BottomNavigationBarArgsContext ctx) {
        BottomNavigationBarArgs bottomNavigationBarArgs = new BottomNavigationBarArgs();

        if (ctx.items() != null) {
            bottomNavigationBarArgs.setItems((Items) visitItems(ctx.items()));
        } else if (ctx.backGroundColor() != null) {
            bottomNavigationBarArgs.setBackGroundColor((BackGroundColor) visitBackGroundColor(ctx.backGroundColor()));
        } else if (ctx.currentIndex() != null) {
            bottomNavigationBarArgs.setCurrentIndex((CurrentIndex) visitCurrentIndex(ctx.currentIndex()));
        }
        return bottomNavigationBarArgs;
    }

    @Override
    public SliderArgs visitSliderArgs(ParserFile.SliderArgsContext ctx) {
        SliderArgs sliderArgs = new SliderArgs();

        if (ctx.min() != null) {
            sliderArgs.setMin((Min) visitMin(ctx.min()));
        } else if (ctx.max() != null) {
            sliderArgs.setMax((Max) visitMax(ctx.max()));
        }

        return sliderArgs;
    }

    @Override
    public TabBarArgs visitTabBarArgs(ParserFile.TabBarArgsContext ctx) {
        TabBarArgs tabBarArgs = new TabBarArgs();

        if (ctx.tabs() != null) {
            tabBarArgs.setTabs((Tabs) visitTabs(ctx.tabs()));
        } else if (ctx.padding() != null) {
            tabBarArgs.setPadding((Padding) visitPadding(ctx.padding()));
        }

        return tabBarArgs;
    }

    @Override
    public TabBarViewArgs visitTabBarViewArgs(ParserFile.TabBarViewArgsContext ctx) {
        TabBarViewArgs tabBarViewArgs = new TabBarViewArgs();
        if (ctx.children() != null) {
            tabBarViewArgs.setChildren((Children) visitChildren(ctx.children()));
        }
        return tabBarViewArgs;
    }

    @Override
    public DrawerArgs visitDrawerArgs(ParserFile.DrawerArgsContext ctx) {
        DrawerArgs drawerArgs = new DrawerArgs();
        if (ctx.backGroundColor() != null) {
            drawerArgs.setBackGroundColor((BackGroundColor) visitBackGroundColor(ctx.backGroundColor()));
        } else if (ctx.child() != null) {
            drawerArgs.setChild((Child) visitChild(ctx.child()));
        } else if (ctx.width() != null) {
            drawerArgs.setWidth((Width) visitWidth(ctx.width()));
        }
        return drawerArgs;
    }

    @Override
    public FloatingActionButtonArgs visitFloatingActionButtonArgs(ParserFile.FloatingActionButtonArgsContext ctx) {
        FloatingActionButtonArgs floatingActionButtonArgs = new FloatingActionButtonArgs();
        if (ctx.child() != null) {
            floatingActionButtonArgs.setChild((Child) visitChild(ctx.child()));
        } else if (ctx.backGroundColor() != null) {
            floatingActionButtonArgs.setBackGroundColor((BackGroundColor) visitBackGroundColor(ctx.backGroundColor()));
        }

        return floatingActionButtonArgs;
    }

    @Override
    public WrapArgs visitWrapArgs(ParserFile.WrapArgsContext ctx) {
        WrapArgs wrapArgs = new WrapArgs();

        if (ctx.children() != null) {
            wrapArgs.setChildren((Children) visitChildren(ctx.children()));
        } else if (ctx.crossAxis() != null) {
            wrapArgs.setCrossAxis((CrossAxis) visitCrossAxis(ctx.crossAxis()));
        }
        return wrapArgs;
    }

    @Override
    public FlexArgs visitFlexArgs(ParserFile.FlexArgsContext ctx) {
        FlexArgs flexArgs = new FlexArgs();

        if (ctx.child() != null) {
            flexArgs.setChild((Child) visitChild(ctx.child()));
        } else if (ctx.flexArg() != null) {
            flexArgs.setFlexArg((FlexArg) visitFlexArg(ctx.flexArg()));
        }
        return flexArgs;
    }

    @Override
    public TextFormFieldArgs visitTextFormFieldArgs(ParserFile.TextFormFieldArgsContext ctx) {
        TextFormFieldArgs textFormFieldArgs = new TextFormFieldArgs();

        if (ctx.style() != null) {
            textFormFieldArgs.setStyle((Style) visitStyle(ctx.style()));
        }
        return textFormFieldArgs;
    }

    @Override
    public TextButtonArgs visitTextButtonArgs(ParserFile.TextButtonArgsContext ctx) {
        TextButtonArgs textButtonArgs = new TextButtonArgs();
        if (ctx.child() != null) {
            textButtonArgs.setChild((Child) visitChild(ctx.child()));
        } else if (ctx.style() != null) {
            textButtonArgs.setStyle((Style) visitStyle(ctx.style()));
        }
        return textButtonArgs;
    }

    @Override
    public IconArgs visitIconArgs(ParserFile.IconArgsContext ctx) {
        IconArgs iconArgs = new IconArgs();

        if (ctx.size() != null) {
            iconArgs.setSize((Size) visitSize(ctx.size()));
        } else if (ctx.color() != null) {
            iconArgs.setColor((Color) visitColor(ctx.color()));
        } else if (ctx.ICONS() != null) {
            iconArgs.setIcon(ctx.ICONS().getText());
        }
        return iconArgs;
    }

    @Override
    public SizedBoxArgs visitSizedBoxArgs(ParserFile.SizedBoxArgsContext ctx) {
        SizedBoxArgs sizedBoxArgs = new SizedBoxArgs();

        if (ctx.child() != null) {
            sizedBoxArgs.setChild((Child) visitChild(ctx.child()));
        } else if (ctx.height() != null) {
            sizedBoxArgs.setHeight((Height) visitHeight(ctx.height()));
        } else if (ctx.width() != null) {
            sizedBoxArgs.setWidth((Width) visitWidth(ctx.width()));
        }
        return sizedBoxArgs;
    }

    @Override
    public TextStyleArgs visitTextStyleArgs(ParserFile.TextStyleArgsContext ctx) {
        TextStyleArgs textStyleArgs = new TextStyleArgs();

        if (ctx.backGroundColor() != null) {
            textStyleArgs.setBackGroundColor((BackGroundColor) visitBackGroundColor(ctx.backGroundColor()));
        } else if (ctx.color() != null) {
            textStyleArgs.setColor((Color) visitColor(ctx.color()));
        } else if (ctx.fontSize() != null) {
            textStyleArgs.setFontSize((FontSize) visitFontSize(ctx.fontSize()));
        }

        return textStyleArgs;
    }

    @Override
    public CenterArgs visitCenterArgs(ParserFile.CenterArgsContext ctx) {
        CenterArgs centerArgs = new CenterArgs();
        if (ctx.child() != null) {
            centerArgs.setChild((Child) visitChild(ctx.child()));
        }
        return centerArgs;
    }

    @Override
    public Body visitBody(ParserFile.BodyContext ctx) {
        Body body = new Body();
        if (ctx.widget() != null) {
            body.setWidget((Widget) visitWidget(ctx.widget()));
        }
        return body;
    }

    @Override
    public DrawerArg visitDrawerArg(ParserFile.DrawerArgContext ctx) {
        DrawerArg drawerArg = new DrawerArg();
        if (ctx.drawer() != null) {
            drawerArg.setDrawer((Drawer) visitDrawer(ctx.drawer()));
        }
        return drawerArg;
    }

    @Override
    public AppBarArg visitAppBarArg(ParserFile.AppBarArgContext ctx) {
        AppBarArg appBarArg = new AppBarArg();
        if (ctx.appBar() != null) {
            appBarArg.setAppBar((AppBar) visitAppBar(ctx.appBar()));
        }
        return appBarArg;
    }

    @Override
    public BottomNavigationBarArg visitBottomNavigationBarArg(ParserFile.BottomNavigationBarArgContext ctx) {
        BottomNavigationBarArg bottomNavigationBarArg = new BottomNavigationBarArg();
        if (ctx.bottomNavigationBar() != null) {
            bottomNavigationBarArg.setBottomNavigationBar((BottomNavigationBar) visitBottomNavigationBar(ctx.bottomNavigationBar()));
        }
        return bottomNavigationBarArg;
    }

    @Override
    public FloatingActionButtonArg visitFloatingActionButtonArg(ParserFile.FloatingActionButtonArgContext ctx) {
        FloatingActionButtonArg floatingActionButtonArg = new FloatingActionButtonArg();
        if (ctx.floatingActionButton() != null) {
            floatingActionButtonArg.setFloatingActionButton((FloatingActionButton) visitFloatingActionButton(ctx.floatingActionButton()));
        }
        return floatingActionButtonArg;
    }

    @Override
    public Child visitChild(ParserFile.ChildContext ctx) {
        Child child = new Child();
        if (ctx.widget() != null) {
            child.setWidget((Widget) visitWidget(ctx.widget()));
        }
        return child;
    }

    @Override
    public Children visitChildren(ParserFile.ChildrenContext ctx) {
        Children children = new Children();
        if(ctx!=null){
            if (!ctx.widget().isEmpty()) {
                for (int i = 0; i < ctx.widget().size(); i++) {
                    if (ctx.widget(i) != null) {
                        children.getWidgets().add((Widget) visitWidget(ctx.widget(i)));
                    }
                }
            }
        }
        return children;
    }

    @Override
    public Height visitHeight(ParserFile.HeightContext ctx) {
        Height height = new Height();
        if (ctx.DOUBLE() != null) {
            height.setValue(Double.valueOf(ctx.DOUBLE().getText()));
        }
        return height;
    }

    @Override
    public Width visitWidth(ParserFile.WidthContext ctx) {
        Width width = new Width();
        if (ctx.DOUBLE() != null) {
            width.setValue(Double.valueOf(ctx.DOUBLE().getText()));
        }
        return width;
    }

    @Override
    public Color visitColor(ParserFile.ColorContext ctx) {
        Color color = new Color();
        if (ctx.COLORS() != null) {
            color.setColor(ctx.COLORS().getText());
        }
        return color;
    }

    @Override
    public Margin visitMargin(ParserFile.MarginContext ctx) {
        Margin margin = new Margin();
        if (ctx.DOUBLE() != null) {
            margin.setValue(Double.valueOf(ctx.DOUBLE().getText()));
        }
        return margin;
    }

    @Override
    public Padding visitPadding(ParserFile.PaddingContext ctx) {
        Padding padding = new Padding();
        if (ctx.DOUBLE() != null) {
            padding.setValue(Double.valueOf(ctx.DOUBLE().getText()));
        }
        return padding;
    }

    @Override
    public Items visitItems(ParserFile.ItemsContext ctx) {
        Items items = new Items();
        if (!ctx.widget().isEmpty()) {
            for (int i = 0; i < ctx.widget().size(); i++) {
                if (ctx.widget(i) != null) {
                    items.getWidgets().add((Widget) visitWidget(ctx.widget(i)));
                }
            }
        }
        return items;
    }

    @Override
    public CurrentIndex visitCurrentIndex(ParserFile.CurrentIndexContext ctx) {
        CurrentIndex currentIndex = new CurrentIndex();
        if (ctx.INT() != null) {
            currentIndex.setValue(Integer.valueOf(ctx.INT().getText()));
        }
        return currentIndex;
    }

    @Override
    public BackGroundColor visitBackGroundColor(ParserFile.BackGroundColorContext ctx) {
        BackGroundColor backGroundColor = new BackGroundColor();
        if (ctx.COLORS() != null) {
            backGroundColor.setColor(ctx.COLORS().getText());
        }
        return backGroundColor;
    }

    @Override
    public CrossAxis visitCrossAxis(ParserFile.CrossAxisContext ctx) {
        CrossAxis crossAxis = new CrossAxis();
        if (ctx.AXIS() != null) {
            crossAxis.setAxis(ctx.AXIS().getText());
        }
        return crossAxis;
    }

    @Override
    public MainAxis visitMainAxis(ParserFile.MainAxisContext ctx) {
        MainAxis mainAxis = new MainAxis();
        if (ctx.AXIS() != null) {
            mainAxis.setAxis(ctx.AXIS().getText());
        }
        return mainAxis;
    }

    @Override
    public Style visitStyle(ParserFile.StyleContext ctx) {
        Style style = new Style();
        if (ctx.textStyle() != null) {
            style.setTextStyle((TextStyle) visitTextStyle(ctx.textStyle()));
        }
        return style;
    }

    @Override
    public FontSize visitFontSize(ParserFile.FontSizeContext ctx) {
        FontSize fontSize = new FontSize();
        if (ctx.DOUBLE() != null) {
            fontSize.setValue(Double.valueOf(ctx.DOUBLE().getText()));
        }
        return fontSize;
    }

    @Override
    public ImageArg visitImageArg(ParserFile.ImageArgContext ctx) {
        ImageArg imageArg = new ImageArg();
        if (ctx.STRING() != null) {
            imageArg.setValue(ctx.STRING().getText());
        }
        else if(ctx.IDENTIFIER() != null){
            imageArg.setVariableName(ctx.IDENTIFIER().getText());
        }
        return imageArg;
    }

    @Override
    public Leading visitLeading(ParserFile.LeadingContext ctx) {
        Leading leading = new Leading();
        if (ctx.widget() != null) {
            leading.setWidget((Widget) visitWidget(ctx.widget()));
        }
        return leading;
    }

    @Override
    public Title visitTitle(ParserFile.TitleContext ctx) {
        Title title = new Title();
        if (ctx.widget() != null) {
            title.setWidget((Widget) visitWidget(ctx.widget()));
        }
        return title;
    }

    @Override
    public Actions visitActions(ParserFile.ActionsContext ctx) {
        Actions actions = new Actions();
        if (!ctx.widget().isEmpty()) {
            for (int i = 0; i < ctx.widget().size(); i++) {
                if (ctx.widget(i) != null) {
                    actions.getWidgets().add((Widget) visitWidget(ctx.widget(i)));
                }
            }
        }
        return actions;
    }

    @Override
    public IconArg visitIconArg(ParserFile.IconArgContext ctx) {
        IconArg iconArg = new IconArg();
        if (ctx.widget() != null) {
            iconArg.setWidget((Widget) visitWidget(ctx.widget()));
        }
        return iconArg;
    }

    @Override
    public FlexArg visitFlexArg(ParserFile.FlexArgContext ctx) {
        FlexArg flexArg = new FlexArg();
        if (ctx.INT() != null) {
            flexArg.setValue(Integer.valueOf(ctx.INT().getText()));
        }
        return flexArg;
    }

    @Override
    public Min visitMin(ParserFile.MinContext ctx) {
        Min min = new Min();
        if (ctx.DOUBLE() != null) {
            min.setValue(Double.valueOf(ctx.DOUBLE().getText()));
        }
        return min;
    }

    @Override
    public Max visitMax(ParserFile.MaxContext ctx) {
        Max max = new Max();
        if (ctx.DOUBLE() != null) {
            max.setValue(Double.valueOf(ctx.DOUBLE().getText()));
        }
        return max;
    }

    @Override
    public Tabs visitTabs(ParserFile.TabsContext ctx) {
        Tabs tabs = new Tabs();
        if (!ctx.widget().isEmpty()) {
            for (int i = 0; i < ctx.widget().size(); i++) {
                if (ctx.widget(i) != null) {
                    tabs.getWidget().add((Widget) visitWidget(ctx.widget(i)));
                }
            }
        }
        return tabs;
    }

    @Override
    public Size visitSize(ParserFile.SizeContext ctx) {
        Size size = new Size();
        if (ctx.DOUBLE() != null) {
            size.setValue(Double.valueOf(ctx.DOUBLE().getText()));
        }
        return size;
    }

    @Override
    public OnTap visitOnTap(ParserFile.OnTapContext ctx) {
        OnTap onTap = new OnTap();
        if (!ctx.expression().isEmpty()) {
            for (int i = 0; i < ctx.expression().size(); i++) {
                if (ctx.expression() != null) {
                    onTap.getExpressions().add((Expression) visitExpression(ctx.expression(i)));
                }
            }
        }
        return onTap;
    }

    @Override
    public Expression visitExpression(ParserFile.ExpressionContext ctx) {
        Expression expression = new Expression();
        if (ctx.allowExp() != null) {
            expression.setAllowExp((AllowExp) visitAllowExp(ctx.allowExp()));
        }
        return expression;
    }

    @Override
    public AllowExp visitAllowExp(ParserFile.AllowExpContext ctx) {
        AllowExp allowExp = new AllowExp();
        if (ctx.navigateExp() != null) {
            allowExp.setNavigateExp((NavigateExp) visitNavigateExp(ctx.navigateExp()));
        } else if (ctx.runAppExp() != null) {
            allowExp.setRunAppExp((RunAppExp) visitRunAppExp(ctx.runAppExp()));
        }
        return allowExp;
    }

    @Override
    public RunAppExp visitRunAppExp(ParserFile.RunAppExpContext ctx) {
        RunAppExp runAppExp = new RunAppExp();
        if (ctx.constructor() != null) {
            runAppExp.setConstructor((Constructor) visitConstructor(ctx.constructor()));
        }
        return runAppExp;
    }

    @Override
    public NavigateExp visitNavigateExp(ParserFile.NavigateExpContext ctx) {
        NavigateExp navigateExp = new NavigateExp();
        if (ctx.transtion() != null) {
            navigateExp.setTranstion((Transtion) visitTranstion(ctx.transtion()));
        }
        return navigateExp;
    }

    @Override
    public Transtion visitTranstion(ParserFile.TranstionContext ctx) {
        Transtion transtion = new Transtion();
        if (ctx.push() != null) {
            transtion.setPush((Push) visitPush(ctx.push()));
        } else if (ctx.pop() != null) {
            transtion.setPop(true);
        }
        return transtion;
    }

    @Override
    public Push visitPush(ParserFile.PushContext ctx) {
        Push push = new Push();
        if (ctx.constructor() != null) {
            push.setConstructor((Constructor) visitConstructor(ctx.constructor()));
        }
        return push;
    }

    @Override
    public Object visitPop(ParserFile.PopContext ctx) {
        return super.visitPop(ctx);
    }

    @Override
    public Constructor visitConstructor(ParserFile.ConstructorContext ctx) {
        Constructor constructor = new Constructor();
        constructor.setIdentifier(ctx.IDENTIFIER().getText());
        if (!ctx.constructoFilled().isEmpty()) {
            for (int i = 0; i < ctx.constructoFilled().size(); i++) {
                if (ctx.constructoFilled(i) != null) {
                    constructor.getConstructorFields().add((ConstructorField) visitConstructoFilled(ctx.constructoFilled(i)));
                }
            }
        }
        return constructor;
    }

    @Override
    public ConstructorField visitConstructoFilled(ParserFile.ConstructoFilledContext ctx) {
        ConstructorField constructorField = new ConstructorField();
        if (ctx.STRING() != null) {
            constructorField.setString(ctx.STRING().getText());
        } else if (ctx.DOUBLE() != null) {
            constructorField.setValue(Double.valueOf(ctx.DOUBLE().getText()));
        }
        return constructorField;
    }
}