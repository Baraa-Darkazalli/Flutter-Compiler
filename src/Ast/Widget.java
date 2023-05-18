package Ast;

import Ast.Classes.HtmlElement;

public class Widget extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Scaffold scaffold;
    private Container container;
    private Text text;
    private Image image;
    private ListView listView;
    private AppBar appBar;
    private TextField textField;
    private Column column;
    private Row row;
    private Card card;
    private IconButton iconButton;
    private InkWell inkWell;                        // TODO
    private Expanded expanded;
    private BottomNavigationBar bottomNavigationBar;
    private Slider slider;
    private TabBar tabBar;
    private TabView tabView;
    private Drawer drawer;
    private FloatingActionButton floatingActionButton;
    private Wrap wrap;
    private Flex flex;
    private TextFormField textFormField;
    private TextButton textButton;
    private Icon icon;
    private SizedBox sizedBox;

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

    public SizedBox getSizedBox() {
        return sizedBox;
    }

    public void setSizedBox(SizedBox sizedBox) {
        this.sizedBox = sizedBox;
    }

    //---------------------------    ToString Func     -------------------------------
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Widget\n");
        sb.append("Scaffold: ").append(scaffold != null ? scaffold.toString() : "null").append("\n");
        sb.append("Container: ").append(container != null ? container.toString() : "null").append("\n");
        sb.append("Text: ").append(text != null ? text.toString() : "null").append("\n");
        sb.append("Image: ").append(image != null ? image.toString() : "null").append("\n");
        sb.append("ListView: ").append(listView != null ? listView.toString() : "null").append("\n");
        sb.append("AppBar: ").append(appBar != null ? appBar.toString() : "null").append("\n");
        sb.append("TextField: ").append(textField != null ? textField.toString() : "null").append("\n");
        sb.append("Column: ").append(column != null ? column.toString() : "null").append("\n");
        sb.append("Row: ").append(row != null ? row.toString() : "null").append("\n");
        sb.append("Card: ").append(card != null ? card.toString() : "null").append("\n");
        sb.append("IconButton: ").append(iconButton != null ? iconButton.toString() : "null").append("\n");
        sb.append("InkWell: ").append(inkWell != null ? inkWell.toString() : "null").append("\n");
        sb.append("Expanded: ").append(expanded != null ? expanded.toString() : "null").append("\n");
        sb.append("BottomNavigationBar: ").append(bottomNavigationBar != null ? bottomNavigationBar.toString() : "null").append("\n");
        sb.append("Slider: ").append(slider != null ? slider.toString() : "null").append("\n");
        sb.append("TabBar: ").append(tabBar != null ? tabBar.toString() : "null").append("\n");
        sb.append("TabView: ").append(tabView != null ? tabView.toString() : "null").append("\n");
        sb.append("Drawer: ").append(drawer != null ? drawer.toString() : "null").append("\n");
        sb.append("FloatingActionButton: ").append(floatingActionButton != null ? floatingActionButton.toString() : "null").append("\n");
        sb.append("Wrap: ").append(wrap != null ? wrap.toString() : "null").append("\n");
        sb.append("Flex: ").append(flex != null ? flex.toString() : "null").append("\n");
        sb.append("TextFormField: ").append(textFormField != null ? textFormField.toString() : "null").append("\n");
        sb.append("TextButton: ").append(textButton != null ? textButton.toString() : "null").append("\n");
        sb.append("Icon: ").append(icon != null ? icon.toString() : "null").append("\n");
        sb.append("SizedBox: ").append(icon != null ? sizedBox.toString() : "null").append("\n");

        return sb.toString();
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if (scaffold != null) {
            sb.append(scaffold.generateHtmlCode());
        } else if (container != null) {
            sb.append(container.generateHtmlCode());
        } else if (text != null) {
            sb.append(text.generateHtmlCode());
        } else if (image != null) {
            sb.append(image.generateHtmlCode());
        } else if (listView != null) {
            sb.append(listView.generateHtmlCode());
        } else if (appBar != null) {
            sb.append(appBar.generateHtmlCode());
        } else if (textField != null) {
            sb.append(textField.generateHtmlCode());
        } else if (column != null) {
            sb.append(column.generateHtmlCode());
        } else if (row != null) {
            sb.append(row.generateHtmlCode());
        } else if (card != null) {
            sb.append(card.generateHtmlCode());
        } else if (iconButton != null) {
            sb.append(iconButton.generateHtmlCode());
        } else if (inkWell != null) {
            sb.append(inkWell.generateHtmlCode());
        } else if (expanded != null) {
            sb.append(expanded.generateHtmlCode());
        } else if (bottomNavigationBar != null) {
            sb.append(bottomNavigationBar.generateHtmlCode());
        } else if (slider != null) {
            sb.append(slider.generateHtmlCode());
        } else if (tabBar != null) {
            sb.append(tabBar.generateHtmlCode());
        } else if (tabView != null) {
            sb.append(tabView.generateHtmlCode());
        } else if (drawer != null) {
            sb.append(drawer.generateHtmlCode());
        } else if (floatingActionButton != null) {
            sb.append(floatingActionButton.generateHtmlCode());
        } else if (wrap != null) {
            sb.append(wrap.generateHtmlCode());
        } else if (flex != null) {
            sb.append(flex.generateHtmlCode());
        } else if (textFormField != null) {
            sb.append(textFormField.generateHtmlCode());
        } else if (textButton != null) {
            sb.append(textButton.generateHtmlCode());
        } else if (icon != null) {
            sb.append(icon.generateHtmlCode());
        } else if (sizedBox != null) {
            sb.append(sizedBox.generateHtmlCode());
        }

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return  "";
    }
}