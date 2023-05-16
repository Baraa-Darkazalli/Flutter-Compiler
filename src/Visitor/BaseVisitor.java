package Visitor;

import Ast.*;
import gen.ParserFile;
import gen.ParserFileBaseVisitor;

import java.util.List;

public class BaseVisitor extends ParserFileBaseVisitor {
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
        return root;
    }

    @Override
    public Object visitMain(ParserFile.MainContext ctx) {
        return super.visitMain(ctx);
    }

    @Override
    public DartClass visitDartClass(ParserFile.DartClassContext ctx) {
        DartClass dartClass = new DartClass();
        dartClass.setClassName((String) visitClassName(ctx.className()));
        if (!ctx.classBody().isEmpty()) {
            for (int i = 0; i < ctx.classBody().size(); i++) {
                if (ctx.classBody(i) != null) {
                    dartClass.getClassBody().add((ClassBody) visitClassBody(ctx.classBody(i)));
                }
            }
        }
        return dartClass;
    }

    @Override
    public ClassBody visitClassBody(ParserFile.ClassBodyContext ctx) {
        ClassBody classBody = new ClassBody();
        if (ctx.classArg()!=null) {
            classBody.setClassArg((ClassArg) visitClassArg(ctx.classArg()));
        } else if (ctx.constructorDeclaration()!=null) {
            classBody.setConstructorDeclaration((ConstructorDeclaration) visitConstructorDeclaration(ctx.constructorDeclaration()));
        } else if (ctx.buildFunctionDeclaration()!=null) {
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
        if (ctx.scaffold()!=null) {
            widget.setScaffold((Scaffold) visitScaffold(ctx.scaffold()));
        } else if (ctx.container()!=null) {
            widget.setContainer((Container) visitContainer(ctx.container()));
        } else if (ctx.text()!=null) {
            widget.setText((Text) visitText(ctx.text()));
        } else if (ctx.image()!=null) {
            widget.setImage((Image) visitImage(ctx.image()));
        } else if (ctx.listView()!=null) {
            widget.setListView((ListView) visitListView(ctx.listView()));
        } else if (ctx.appBar()!=null) {
            widget.setAppBar((AppBar) visitAppBar(ctx.appBar()));
        } else if (ctx.textField()!=null) {
            widget.setTextField((TextField) visitTextField(ctx.textField()));
        } else if (ctx.column()!=null) {
            widget.setColumn((Column) visitColumn(ctx.column()));
        } else if (ctx.row()!=null) {
            widget.setRow((Row) visitRow(ctx.row()));
        } else if (ctx.card()!=null) {
            widget.setCard((Card) visitCard(ctx.card()));
        } else if (ctx.iconButton()!=null) {
            widget.setIconButton((IconButton) visitIconButton(ctx.iconButton()));
        } else if (ctx.inkWell()!=null) {
            widget.setInkWell((InkWell) visitInkWell(ctx.inkWell()));
        } else if (ctx.expanded()!=null) {
            widget.setExpanded((Expanded) visitExpanded(ctx.expanded()));
        } else if (ctx.bottomNavigationBar()!=null) {
            widget.setBottomNavigationBar((BottomNavigationBar) visitBottomNavigationBar(ctx.bottomNavigationBar()));
        } else if (ctx.slider()!=null) {
            widget.setSlider((Slider) visitSlider(ctx.slider()));
        } else if (ctx.tabBar()!=null) {
            widget.setTabBar((TabBar) visitTabBar(ctx.tabBar()));
        } else if (ctx.tabBarView()!=null) {
            widget.setTabView((TabView) visitTabBarView(ctx.tabBarView()));
        } else if (ctx.drawer()!=null) {
            widget.setDrawer((Drawer) visitDrawer(ctx.drawer()));
        } else if (ctx.floatingActionButton()!=null) {
            widget.setFloatingActionButton((FloatingActionButton) visitFloatingActionButton(ctx.floatingActionButton()));
        } else if (ctx.wrap()!=null) {
            widget.setWrap((Wrap) visitWrap(ctx.wrap()));
        } else if (ctx.flex()!=null) {
            widget.setFlex((Flex) visitFlex(ctx.flex()));
        } else if (ctx.textFormField()!=null) {
            widget.setTextFormField((TextFormField) visitTextFormField(ctx.textFormField()));
        } else if (ctx.textButton()!=null) {
            widget.setTextButton((TextButton) visitTextButton(ctx.textButton()));
        } else if (ctx.icon()!=null) {
            widget.setIcon((Icon) visitIcon(ctx.icon()));
        } else if (ctx.sizedBox()!=null) {
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
        if (ctx.body()!=null) {
            scaffoldArgs.setBody((Body) visitBody(ctx.body()));
        } else if (ctx.drawerArg()!=null) {
            scaffoldArgs.setDrawerArg((DrawerArg) visitDrawerArg(ctx.drawerArg()));
        } else if (ctx.appBarArg()!=null) {
            scaffoldArgs.setAppBarArg((AppBarArg) visitAppBarArg(ctx.appBarArg()));
        } else if (ctx.bottomNavigationBarArg()!=null) {
            scaffoldArgs.setBottomNavigationBarArg((BottomNavigationBarArg) visitBottomNavigationBarArg(ctx.bottomNavigationBarArg()));
        } else if (ctx.floatingActionButtonArg()!=null) {
            scaffoldArgs.setFloatingActionButtonArg((FloatingActionButtonArg) visitFloatingActionButtonArg(ctx.floatingActionButtonArg()));
        } else if(ctx.backGroundColor()!=null){
            scaffoldArgs.setBackGroundColor((BackGroundColor) visitBackGroundColor(ctx.backGroundColor()));
        }
        return scaffoldArgs;
    }

    @Override
    public ContainerArg visitContainerArgs(ParserFile.ContainerArgsContext ctx) {
        ContainerArg containerArg=new ContainerArg();
        if(ctx.child()!=null){
            containerArg.setChild((Child) visitChild(ctx.child()));
        }else if(ctx.width()!=null){
            containerArg.setWidth((Width) visitWidth(ctx.width()));
        }else if(ctx.height()!=null){
            containerArg.setHeight((Height) visitHeight(ctx.height()));
        }else if(ctx.color()!=null){
            containerArg.setColor((Color) visitColor(ctx.color()));
        }else if(ctx.margin()!=null){
            containerArg.setMargin((Margin) visitMargin(ctx.margin()));
        }else if(ctx.padding()!=null){
            containerArg.setPadding((Padding) visitPadding(ctx.padding()));
        }
        return containerArg;
    }

    @Override
    public TextArgs visitTextArgs(ParserFile.TextArgsContext ctx) {
        TextArgs textArgs=new TextArgs();
        if(ctx.STRING()!=null){
            textArgs.setString(ctx.STRING().getText());
        }else if(ctx.style()!=null){
            textArgs.setStyle((Style) visitStyle(ctx.style()));
        }
        return textArgs;
    }

    @Override
    public Object visitImageArgs(ParserFile.ImageArgsContext ctx) {
        return super.visitImageArgs(ctx);
    }

    @Override
    public Object visitListviewArgs(ParserFile.ListviewArgsContext ctx) {
        return super.visitListviewArgs(ctx);
    }

    @Override
    public Object visitAppBarArgs(ParserFile.AppBarArgsContext ctx) {
        return super.visitAppBarArgs(ctx);
    }

    @Override
    public Object visitTextFieldArgs(ParserFile.TextFieldArgsContext ctx) {
        return super.visitTextFieldArgs(ctx);
    }

    @Override
    public Object visitColumnArgs(ParserFile.ColumnArgsContext ctx) {
        return super.visitColumnArgs(ctx);
    }

    @Override
    public Object visitRowArgs(ParserFile.RowArgsContext ctx) {
        return super.visitRowArgs(ctx);
    }

    @Override
    public Object visitCardArgs(ParserFile.CardArgsContext ctx) {
        return super.visitCardArgs(ctx);
    }

    @Override
    public Object visitIconButtonArgs(ParserFile.IconButtonArgsContext ctx) {
        return super.visitIconButtonArgs(ctx);
    }

    @Override
    public Object visitInkwellArgs(ParserFile.InkwellArgsContext ctx) {
        return super.visitInkwellArgs(ctx);
    }

    @Override
    public Object visitExpandedArgs(ParserFile.ExpandedArgsContext ctx) {
        return super.visitExpandedArgs(ctx);
    }

    @Override
    public Object visitBottomNavigationBarArgs(ParserFile.BottomNavigationBarArgsContext ctx) {
        return super.visitBottomNavigationBarArgs(ctx);
    }

    @Override
    public Object visitSliderArgs(ParserFile.SliderArgsContext ctx) {
        return super.visitSliderArgs(ctx);
    }

    @Override
    public Object visitTabBarArgs(ParserFile.TabBarArgsContext ctx) {
        return super.visitTabBarArgs(ctx);
    }

    @Override
    public Object visitTabBarViewArgs(ParserFile.TabBarViewArgsContext ctx) {
        return super.visitTabBarViewArgs(ctx);
    }

    @Override
    public Object visitDrawerArgs(ParserFile.DrawerArgsContext ctx) {
        return super.visitDrawerArgs(ctx);
    }

    @Override
    public Object visitFloatingActionButtonArgs(ParserFile.FloatingActionButtonArgsContext ctx) {
        return super.visitFloatingActionButtonArgs(ctx);
    }

    @Override
    public Object visitWrapArgs(ParserFile.WrapArgsContext ctx) {
        return super.visitWrapArgs(ctx);
    }

    @Override
    public Object visitFlexArgs(ParserFile.FlexArgsContext ctx) {
        return super.visitFlexArgs(ctx);
    }

    @Override
    public Object visitTextFormFieldArgs(ParserFile.TextFormFieldArgsContext ctx) {
        return super.visitTextFormFieldArgs(ctx);
    }

    @Override
    public Object visitTextButtonArgs(ParserFile.TextButtonArgsContext ctx) {
        return super.visitTextButtonArgs(ctx);
    }

    @Override
    public Object visitIconArgs(ParserFile.IconArgsContext ctx) {
        return super.visitIconArgs(ctx);
    }

    @Override
    public Object visitSizedBoxArgs(ParserFile.SizedBoxArgsContext ctx) {
        return super.visitSizedBoxArgs(ctx);
    }

    @Override
    public Object visitTextStyleArgs(ParserFile.TextStyleArgsContext ctx) {
        return super.visitTextStyleArgs(ctx);
    }

    @Override
    public Object visitCenterArgs(ParserFile.CenterArgsContext ctx) {
        return super.visitCenterArgs(ctx);
    }

    @Override
    public Object visitBody(ParserFile.BodyContext ctx) {
        return super.visitBody(ctx);
    }

    @Override
    public Object visitDrawerArg(ParserFile.DrawerArgContext ctx) {
        return super.visitDrawerArg(ctx);
    }

    @Override
    public Object visitAppBarArg(ParserFile.AppBarArgContext ctx) {
        return super.visitAppBarArg(ctx);
    }

    @Override
    public Object visitBottomNavigationBarArg(ParserFile.BottomNavigationBarArgContext ctx) {
        return super.visitBottomNavigationBarArg(ctx);
    }

    @Override
    public Object visitFloatingActionButtonArg(ParserFile.FloatingActionButtonArgContext ctx) {
        return super.visitFloatingActionButtonArg(ctx);
    }

    @Override
    public Object visitChild(ParserFile.ChildContext ctx) {
        return super.visitChild(ctx);
    }

    @Override
    public Object visitChildren(ParserFile.ChildrenContext ctx) {
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitHeight(ParserFile.HeightContext ctx) {
        return super.visitHeight(ctx);
    }

    @Override
    public Object visitWidth(ParserFile.WidthContext ctx) {
        return super.visitWidth(ctx);
    }

    @Override
    public Object visitColor(ParserFile.ColorContext ctx) {
        return super.visitColor(ctx);
    }

    @Override
    public Object visitMargin(ParserFile.MarginContext ctx) {
        return super.visitMargin(ctx);
    }

    @Override
    public Object visitPadding(ParserFile.PaddingContext ctx) {
        return super.visitPadding(ctx);
    }

    @Override
    public Object visitItems(ParserFile.ItemsContext ctx) {
        return super.visitItems(ctx);
    }

    @Override
    public Object visitCurrentIndex(ParserFile.CurrentIndexContext ctx) {
        return super.visitCurrentIndex(ctx);
    }

    @Override
    public Object visitBackGroundColor(ParserFile.BackGroundColorContext ctx) {
        return super.visitBackGroundColor(ctx);
    }

    @Override
    public Object visitCrossAxis(ParserFile.CrossAxisContext ctx) {
        return super.visitCrossAxis(ctx);
    }

    @Override
    public Object visitMainAxis(ParserFile.MainAxisContext ctx) {
        return super.visitMainAxis(ctx);
    }

    @Override
    public Object visitStyle(ParserFile.StyleContext ctx) {
        return super.visitStyle(ctx);
    }

    @Override
    public Object visitFontSize(ParserFile.FontSizeContext ctx) {
        return super.visitFontSize(ctx);
    }

    @Override
    public Object visitImageArg(ParserFile.ImageArgContext ctx) {
        return super.visitImageArg(ctx);
    }

    @Override
    public Object visitLeading(ParserFile.LeadingContext ctx) {
        return super.visitLeading(ctx);
    }

    @Override
    public Object visitTitle(ParserFile.TitleContext ctx) {
        return super.visitTitle(ctx);
    }

    @Override
    public Object visitActions(ParserFile.ActionsContext ctx) {
        return super.visitActions(ctx);
    }

    @Override
    public Object visitIconArg(ParserFile.IconArgContext ctx) {
        return super.visitIconArg(ctx);
    }

    @Override
    public Object visitFlexArg(ParserFile.FlexArgContext ctx) {
        return super.visitFlexArg(ctx);
    }

    @Override
    public Object visitMin(ParserFile.MinContext ctx) {
        return super.visitMin(ctx);
    }

    @Override
    public Object visitMax(ParserFile.MaxContext ctx) {
        return super.visitMax(ctx);
    }

    @Override
    public Object visitTabs(ParserFile.TabsContext ctx) {
        return super.visitTabs(ctx);
    }

    @Override
    public Object visitSize(ParserFile.SizeContext ctx) {
        return super.visitSize(ctx);
    }

    @Override
    public Object visitOnTap(ParserFile.OnTapContext ctx) {
        return super.visitOnTap(ctx);
    }

    @Override
    public Object visitExpression(ParserFile.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    public Object visitAllowExp(ParserFile.AllowExpContext ctx) {
        return super.visitAllowExp(ctx);
    }

    @Override
    public Object visitRunAppExp(ParserFile.RunAppExpContext ctx) {
        return super.visitRunAppExp(ctx);
    }

    @Override
    public Object visitNavigateExp(ParserFile.NavigateExpContext ctx) {
        return super.visitNavigateExp(ctx);
    }

    @Override
    public Object visitTranstion(ParserFile.TranstionContext ctx) {
        return super.visitTranstion(ctx);
    }

    @Override
    public Object visitPush(ParserFile.PushContext ctx) {
        return super.visitPush(ctx);
    }

    @Override
    public Object visitPop(ParserFile.PopContext ctx) {
        return super.visitPop(ctx);
    }

    @Override
    public Object visitConstructor(ParserFile.ConstructorContext ctx) {
        return super.visitConstructor(ctx);
    }

    @Override
    public Object visitConstructoFilled(ParserFile.ConstructoFilledContext ctx) {
        return super.visitConstructoFilled(ctx);
    }
}