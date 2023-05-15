package Ast;

import Ast.Classes.HtmlElement;

public class ColumnArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Children children;
    private MainAxis mainAxis;
    private CrossAxis crossAxis;

    //---------------------------    Setters & Getters     -------------------------------
    public Children getChildren() {
        return children;
    }

    public void setChildren(Children children) {
        this.children = children;
    }

    public MainAxis getMainAxis() {
        return mainAxis;
    }

    public void setMainAxis(MainAxis mainAxis) {
        this.mainAxis = mainAxis;
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
        return "ColumnArgs{" +
                "children=" + children +
                ", mainAxis=" + mainAxis +
                ", crossAxis=" + crossAxis +
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
