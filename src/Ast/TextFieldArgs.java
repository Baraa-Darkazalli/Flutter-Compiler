package Ast;

import Ast.Classes.HtmlElement;

public class TextFieldArgs extends HtmlElement {
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
        return "TextFieldArgs{" +
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

    @Override
    public String generateStyleCode() {
        return "";
    }
}
