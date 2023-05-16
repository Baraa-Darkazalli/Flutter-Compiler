package Ast;

import Ast.Classes.HtmlElement;

public class AppBarArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Title title;
    private Leading leading;
    private Actions actions;
    private BackGroundColor backGroundColor;

    //---------------------------    Setters & Getters     -------------------------------
    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Leading getLeading() {
        return leading;
    }

    public void setLeading(Leading leading) {
        this.leading = leading;
    }

    public Actions getActions() {
        return actions;
    }

    public void setActions(Actions actions) {
        this.actions = actions;
    }

    public BackGroundColor getBackGroundColor() {
        return backGroundColor;
    }

    public void setBackGroundColor(BackGroundColor backGroundColor) {
        this.backGroundColor = backGroundColor;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "AppBarArgs{" +
                "title=" + title +
                ", leading=" + leading +
                ", actions=" + actions +
                ", backGroundColor=" + backGroundColor +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if(title != null)
        {
            sb.append("<h1>\n");
            sb.append(title.generateHtmlCode());
            sb.append("</h1>\n");
        }
        else if(leading != null)
        {
            sb.append("<span>\n");
            sb.append(leading.generateHtmlCode());
            sb.append("</span>\n");
        }
        else if(actions != null)
        {
            sb.append(actions.generateHtmlCode());
        }
        else if(backGroundColor != null)
        {
            sb.append("<style>\n");
            sb.append("  header {\n");
            sb.append("    background-color: ").append(backGroundColor.generateStyleCode()).append(";\n");
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
