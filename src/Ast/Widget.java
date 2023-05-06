package Ast;

public class Widget {
    //---------------------------    Attributes     -------------------------------
    Scaffold scaffold;
    Container container ;
    Text text;
    Image image;
    ListView listView;
    AppBar appBar;
    TextField textField;
    Column column;
    Row row;
    Card card;
    IconButton iconButton;
    CheckBox checkBox;
    Radio radio;
    InkWell inkWell;
    Expanded expanded;
    BottomNavigationBar bottomNavigationBar;
    Slider slider;
    TabBar tabBar;
    TabView tabView;
    Drawer drawer;
    FloatingActionButton floatingActionButton;
    Wrap wrap;
    Flex flex;
    TextFormField textFormField;
    TextButton textButton;
    Icon icon;

    //---------------------------    Setters & Getters     -------------------------------

    public Scaffold getScaffold() {
        return scaffold;
    }

    public void setScaffold(Scaffold scaffold) {
        this.scaffold = scaffold;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public ListView getListView() {
        return listView;
    }

    public void setListView(ListView listView) {
        this.listView = listView;
    }

    public AppBar getAppBar() {
        return appBar;
    }

    public void setAppBar(AppBar appBar) {
        this.appBar = appBar;
    }

    public TextField getTextField() {
        return textField;
    }

    public void setTextField(TextField textField) {
        this.textField = textField;
    }

    public Column getColumn() {
        return column;
    }

    public void setColumn(Column column) {
        this.column = column;
    }

    public Row getRow() {
        return row;
    }

    public void setRow(Row row) {
        this.row = row;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public IconButton getIconButton() {
        return iconButton;
    }

    public void setIconButton(IconButton iconButton) {
        this.iconButton = iconButton;
    }

    public CheckBox getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(CheckBox checkBox) {
        this.checkBox = checkBox;
    }

    public Radio getRadio() {
        return radio;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public InkWell getInkWell() {
        return inkWell;
    }

    public void setInkWell(InkWell inkWell) {
        this.inkWell = inkWell;
    }

    public Expanded getExpanded() {
        return expanded;
    }

    public void setExpanded(Expanded expanded) {
        this.expanded = expanded;
    }

    public BottomNavigationBar getBottomNavigationBar() {
        return bottomNavigationBar;
    }

    public void setBottomNavigationBar(BottomNavigationBar bottomNavigationBar) {
        this.bottomNavigationBar = bottomNavigationBar;
    }

    public Slider getSlider() {
        return slider;
    }

    public void setSlider(Slider slider) {
        this.slider = slider;
    }

    public TabBar getTabBar() {
        return tabBar;
    }

    public void setTabBar(TabBar tabBar) {
        this.tabBar = tabBar;
    }

    public TabView getTabView() {
        return tabView;
    }

    public void setTabView(TabView tabView) {
        this.tabView = tabView;
    }

    public Drawer getDrawer() {
        return drawer;
    }

    public void setDrawer(Drawer drawer) {
        this.drawer = drawer;
    }

    public FloatingActionButton getFloatingActionButton() {
        return floatingActionButton;
    }

    public void setFloatingActionButton(FloatingActionButton floatingActionButton) {
        this.floatingActionButton = floatingActionButton;
    }

    public Wrap getWrap() {
        return wrap;
    }

    public void setWrap(Wrap wrap) {
        this.wrap = wrap;
    }

    public Flex getFlex() {
        return flex;
    }

    public void setFlex(Flex flex) {
        this.flex = flex;
    }

    public TextFormField getTextFormField() {
        return textFormField;
    }

    public void setTextFormField(TextFormField textFormField) {
        this.textFormField = textFormField;
    }

    public TextButton getTextButton() {
        return textButton;
    }

    public void setTextButton(TextButton textButton) {
        this.textButton = textButton;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }


    //---------------------------    ToString Func     -------------------------------

    @Override
    public String toString() {
        if (scaffold != null)
        {
            return "\n Widget{" +
                    "\n\t " + scaffold +
                    "\n }";
        }
        else if (container != null)
        {
            return "\n Widget{" +
                    "\n\t " + container +
                    "\n }";
        }
        else if (text != null)
        {
            return "\n Widget{" +
                    "\n\t " + text +
                    "\n }";
        }
        else if (image != null)
        {
            return "\n Widget{" +
                    "\n\t " + image +
                    "\n }";
        }
        else if (listView != null)
        {
            return "\n Widget{" +
                    "\n\t " + listView +
                    "\n }";
        }
        else if (appBar != null)
        {
            return "\n Widget{" +
                    "\n\t " + appBar +
                    "\n }";
        }
        else if (textField != null)
        {
            return "\n Widget{" +
                    "\n\t " + textField +
                    "\n }";
        }
        else if (column != null)
        {
            return "\n Widget{" +
                    "\n\t " + column +
                    "\n }";
        }
        else if (row != null)
        {
            return "\n Widget{" +
                    "\n\t " + row +
                    "\n }";
        }
        else if (card != null)
        {
            return "\n Widget{" +
                    "\n\t " + card +
                    "\n }";
        }
        else if (iconButton != null)
        {
            return "\n Widget{" +
                    "\n\t " + iconButton +
                    "\n }";
        }
        else if (checkBox != null)
        {
            return "\n Widget{" +
                    "\n\t " + checkBox +
                    "\n }";
        }
        else if (radio != null)
        {
            return "\n Widget{" +
                    "\n\t " + radio +
                    "\n }";
        }
        else if (inkWell != null)
        {
            return "\n Widget{" +
                    "\n\t " + inkWell +
                    "\n }";
        }
        else if (expanded != null)
        {
            return "\n Widget{" +
                    "\n\t " + expanded +
                    "\n }";
        }
        else if (bottomNavigationBar != null)
        {
            return "\n Widget{" +
                    "\n\t " + bottomNavigationBar +
                    "\n }";
        }
        else if (slider != null)
        {
            return "\n Widget{" +
                    "\n\t " + slider +
                    "\n }";
        }
        else if (tabBar != null)
        {
            return "\n Widget{" +
                    "\n\t " + tabBar +
                    "\n }";
        }
        else if (tabView != null)
        {
            return "\n Widget{" +
                    "\n\t " + tabView +
                    "\n }";
        }
        else if (drawer != null)
        {
            return "\n Widget{" +
                    "\n\t " + drawer +
                    "\n }";
        }
        else if (floatingActionButton != null)
        {
            return "\n Widget{" +
                    "\n\t " + floatingActionButton +
                    "\n }";
        }
        else if (wrap != null)
        {
            return "\n Widget{" +
                    "\n\t " + wrap +
                    "\n }";
        }
        else if (flex != null)
        {
            return "\n Widget{" +
                    "\n\t " + flex +
                    "\n }";
        }
        else if (textFormField != null)
        {
            return "\n Widget{" +
                    "\n\t " + textFormField +
                    "\n }";
        }
        else if (textButton != null)
        {
            return "\n Widget{" +
                    "\n\t " + textButton +
                    "\n }";
        }
        else if (icon != null)
        {
            return "\n Widget{" +
                    "\n\t " + icon +
                    "\n }";
        }
    }
}