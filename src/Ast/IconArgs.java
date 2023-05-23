package Ast;

import Ast.Classes.HtmlElement;

public class IconArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Size size;
    private Color color;
    private String icon;

    //---------------------------    Setters & Getters     -------------------------------

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }


    //---------------------------    Override Func     -------------------------------


    @Override
    public String toString() {
        return "IconArgs{" +
                "size=" + size +
                ", color=" + color +
                ", icon='" + icon + '\'' +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        return "";
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
