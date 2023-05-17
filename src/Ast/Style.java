package Ast;

import Ast.Classes.HtmlElement;

public class Style extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private TextStyle textStyle;

    //---------------------------    Setters & Getters     -------------------------------
    public TextStyle getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Style{" +
                "textStyle=" + textStyle +
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
        return null;
    }
}
