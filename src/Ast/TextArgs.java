package Ast;

import Ast.Classes.HtmlElement;

public class TextArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Style style;

    private TextArg textArg;

    //---------------------------    Setters & Getters     -------------------------------
    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public TextArg getTextArg() {
        return textArg;
    }

    public void setTextArg(TextArg textArg) {
        this.textArg = textArg;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "TextArgs{" +
                "style=" + style +
                ", textArg=" + textArg +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if(textArg != null)
        {
            sb.append("<p");// no "\n"
            sb.append(textArg.generateHtmlAttribute());
            sb.append(">\n");
            sb.append(textArg.generateHtmlCode());
            sb.append("</p>\n");
            sb.append(textArg.generateScriptCode());
        }
        else if(style != null)
        {
            sb.append("<style>\n");
            sb.append("  p{\n");
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
