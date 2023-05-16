package Ast;

import Ast.Classes.HtmlElement;

public class IconArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Size size;
    private Color child;

    //---------------------------    Setters & Getters     -------------------------------
    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getChild() {
        return child;
    }

    public void setChild(Color child) {
        this.child = child;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "IconArgs{" +
                "size=" + size +
                ", child=" + child +
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
}
