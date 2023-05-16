package Ast;

import Ast.Classes.HtmlElement;

public class FloatingActionButtonArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Child child;
    private BackGroundColor backGroundColor;

    //---------------------------    Setters & Getters     -------------------------------
    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
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
        return "FloatingActionButtonArgs{" +
                "child=" + child +
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

        if(child != null)
        {
            sb.append(child.generateHtmlCode());
        }
        else if(backGroundColor != null)
        {
            sb.append("<style>\n");
            sb.append("  .floating-action-button {\n");
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
