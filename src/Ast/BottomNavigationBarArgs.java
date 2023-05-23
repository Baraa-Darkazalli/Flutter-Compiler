package Ast;

import Ast.Classes.HtmlElement;

public class BottomNavigationBarArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Items items;
    private BackGroundColor backGroundColor;
    private CurrentIndex currentIndex;              // ignore for code generation

    //---------------------------    Setters & Getters     -------------------------------
    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public BackGroundColor getBackGroundColor() {
        return backGroundColor;
    }

    public void setBackGroundColor(BackGroundColor backGroundColor) {
        this.backGroundColor = backGroundColor;
    }

    public CurrentIndex getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(CurrentIndex currentIndex) {
        this.currentIndex = currentIndex;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "BottomNavigationBarArgs{" +
                "items=" + items +
                ", backGroundColor=" + backGroundColor +
                ", currentIndex=" + currentIndex +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if(items != null)
        {
            sb.append(items.generateHtmlCode());
        }
        else if (backGroundColor != null)
        {
            sb.append("<style>\n");
            sb.append("nav {\n");
            sb.append("  background-color: ").append(backGroundColor.generateStyleCode()).append(" ;\n");
            sb.append("}\n");
            sb.append("</style>\n");
        }

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
