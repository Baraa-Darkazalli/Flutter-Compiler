package Ast;

import Ast.Classes.HtmlElement;

public class DrawerArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private BackGroundColor backGroundColor;
    private Child child;
    private Width width;

    //---------------------------    Setters & Getters     -------------------------------
    public BackGroundColor getBackGroundColor() {
        return backGroundColor;
    }

    public void setBackGroundColor(BackGroundColor backGroundColor) {
        this.backGroundColor = backGroundColor;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public Width getWidth() {
        return width;
    }

    public void setWidth(Width width) {
        this.width = width;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "DrawerArgs{" +
                "backGroundColor=" + backGroundColor +
                ", child=" + child +
                ", width=" + width +
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

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        StringBuilder sb = new StringBuilder();

        if(backGroundColor != null)
        {
            sb.append("    background-color: ").append(backGroundColor.generateStyleCode()).append(" ;\n");
        }
        else if(width != null)
        {
            sb.append("    width: ").append(width.generateStyleCode()).append("px;\n");
        }

        return sb.toString();
    }
}
