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
            sb.append("<p>\n");
            sb.append(string.replaceAll("\'|\"",""));
            sb.append("</p>\n");
        }
        else if(style != null)
        {
            sb.append("<style>\n");
            sb.append("  .p{\n");
            sb.append(style.generateStyleCode());
            sb.append("  }\n");
            sb.append("</style>\n");
        }

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
