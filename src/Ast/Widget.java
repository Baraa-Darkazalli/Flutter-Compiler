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
    private InkWell inkWell;
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
        sb.append("CheckBox: ").append(checkBox != null ? checkBox.toString() : "null").append("\n");
        sb.append("Radio: ").append(radio != null ? radio.toString() : "null").append("\n");
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
        StringBuilder sb = new StringBuilder();

        if (scaffold != null) {
            sb.append(scaffold.generateHtmlAttribute());
        }
        if (container != null) {
            sb.append(container.generateHtmlAttribute());
        }
        if (text != null) {
            sb.append(text.generateHtmlAttribute());
        }
        if (image != null) {
            sb.append(image.generateHtmlAttribute());
        }
        if (listView != null) {
            sb.append(listView.generateHtmlAttribute());
        }
        if (appBar != null) {
            sb.append(appBar.generateHtmlAttribute());
        }
        if (textField != null) {
            sb.append(textField.generateHtmlAttribute());
        }
        if (column != null) {
            sb.append(column.generateHtmlAttribute());
        }
        if (row != null) {
            sb.append(row.generateHtmlAttribute());
        }
        if (card != null) {
            sb.append(card.generateHtmlAttribute());
        }
        if (iconButton != null) {
            sb.append(iconButton.generateHtmlAttribute());
        }
        if (inkWell != null) {
            sb.append(inkWell.generateHtmlAttribute());
        }
        if (expanded != null) {
            sb.append(expanded.generateHtmlAttribute());
        }
        if (bottomNavigationBar != null) {
            sb.append(bottomNavigationBar.generateHtmlAttribute());
        }
        if (slider != null) {
            sb.append(slider.generateHtmlAttribute());
        }
        if (tabBar != null) {
            sb.append(tabBar.generateHtmlAttribute());
        }
        if (tabView != null) {
            sb.append(tabView.generateHtmlAttribute());
        }
        if (drawer != null) {
            sb.append(drawer.generateHtmlAttribute());
        }
        if (floatingActionButton != null) {
            sb.append(floatingActionButton.generateHtmlAttribute());
        }
        if (wrap != null) {
            sb.append(wrap.generateHtmlAttribute());
        }
        if (flex != null) {
            sb.append(flex.generateHtmlAttribute());
        }
        if (textFormField != null) {
            sb.append(textFormField.generateHtmlAttribute());
        }
        if (textButton != null) {
            sb.append(textButton.generateHtmlAttribute());
        }
        if (icon != null) {
            sb.append(icon.generateHtmlAttribute());
        }
        if (sizedBox != null) {
            sb.append(sizedBox.generateHtmlAttribute());
        }

        return sb.toString();
    }


    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if (scaffold != null) {
            sb.append(scaffold.generateHtmlCode());
        }
        if (container != null) {
            sb.append(container.generateHtmlCode());
        }
        if (text != null) {
            sb.append(text.generateHtmlCode());
        }
        if (image != null) {
            sb.append(image.generateHtmlCode());
        }
        if (listView != null) {
            sb.append(listView.generateHtmlCode());
        }
        if (appBar != null) {
            sb.append(appBar.generateHtmlCode());
        }
        if (textField != null) {
            sb.append(textField.generateHtmlCode());
        }
        if (column != null) {
            sb.append(column.generateHtmlCode());
        }
        if (row != null) {
            sb.append(row.generateHtmlCode());
        }
        if (card != null) {
            sb.append(card.generateHtmlCode());
        }
        if (iconButton != null) {
            sb.append(iconButton.generateHtmlCode());
        }
        if (inkWell != null) {
            sb.append(inkWell.generateHtmlCode());
        }
        if (expanded != null) {
            sb.append(expanded.generateHtmlCode());
        }
        if (bottomNavigationBar != null) {
            sb.append(bottomNavigationBar.generateHtmlCode());
        }
        if (slider != null) {
            sb.append(slider.generateHtmlCode());
        }
        if (tabBar != null) {
            sb.append(tabBar.generateHtmlCode());
        }
        if (tabView != null) {
            sb.append(tabView.generateHtmlCode());
        }
        if (drawer != null) {
            sb.append(drawer.generateHtmlCode());
        }
        if (floatingActionButton != null) {
            sb.append(floatingActionButton.generateHtmlCode());
        }
        if (wrap != null) {
            sb.append(wrap.generateHtmlCode());
        }
        if (flex != null) {
            sb.append(flex.generateHtmlCode());
        }
        if (textFormField != null) {
            sb.append(textFormField.generateHtmlCode());
        }
        if (textButton != null) {
            sb.append(textButton.generateHtmlCode());
        }
        if (icon != null) {
            sb.append(icon.generateHtmlCode());
        }
        if (sizedBox != null) {
            sb.append(sizedBox.generateHtmlCode());
        }

        return sb.toString();
    }

}