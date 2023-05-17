package Ast;

import Ast.Classes.HtmlElement;

public class TabBarViewArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Children children;

    //---------------------------    Setters & Getters     -------------------------------
    public Children getChildren() {
        return children;
    }

    public void setChildren(Children children) {
        this.children = children;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "TabBarViewArgs{" +
                "children=" + children +
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
