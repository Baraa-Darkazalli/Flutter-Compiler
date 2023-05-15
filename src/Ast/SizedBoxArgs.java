package Ast;

import Ast.Classes.HtmlElement;

public class SizedBoxArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Child child;
    private Height height;
    private Width width;

    //---------------------------    Setters & Getters     -------------------------------
    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
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
        return "SizedBoxArgs{" +
                "child=" + child +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return null;
    }

    @Override
    public String generateHtmlCode() {
        return null;
    }
}
