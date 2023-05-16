package Ast;

import Ast.Classes.HtmlElement;

public class TextArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Style style;

    //---------------------------    Setters & Getters     -------------------------------
    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "TextArgs{" +
                "style=" + style +
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
