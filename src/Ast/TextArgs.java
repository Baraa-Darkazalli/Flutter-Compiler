package Ast;

import Ast.Classes.HtmlElement;

public class TextArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Style style;

    private String string;

    //---------------------------    Setters & Getters     -------------------------------
    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }


    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "TextArgs{" +
                "style=" + style +
                ", string='" + string + '\'' +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if(string != null)
        {
            sb.append(string);
        }

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        StringBuilder sb = new StringBuilder();

        if(style != null)
        {
            sb.append(style.generateStyleCode());
        }

        return sb.toString();
    }
}
