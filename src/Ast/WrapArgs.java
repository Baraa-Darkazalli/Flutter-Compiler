package Ast;

import Ast.Classes.HtmlElement;

public class WrapArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Children children;
    private CrossAxis crossAxis;

    //---------------------------    Setters & Getters     -------------------------------
    public Children getChildren() {
        return children;
    }

    public void setChildren(Children children) {
        this.children = children;
    }

    public CrossAxis getCrossAxis() {
        return crossAxis;
    }

    public void setCrossAxis(CrossAxis crossAxis) {
        this.crossAxis = crossAxis;
    }

    //---------------------------    Override Func     -------------------------------

    @Override
    public String toString() {
        return "WrapArgs{" +
                "children=" + children +
                ", crossAxis=" + crossAxis +
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
}
