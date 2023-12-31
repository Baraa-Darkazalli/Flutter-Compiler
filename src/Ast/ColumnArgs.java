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
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if(children != null)
        {
            sb.append(children.generateHtmlCode());
        }

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        StringBuilder sb = new StringBuilder();

        if(mainAxis != null)
        {
            sb.append(" justify-content: ").append(mainAxis.generateStyleCode()).append(";"); //no "\n"
            sb.append("  height: 100vh;"); //no "\n"
        }
        else if(crossAxis != null)
        {
            sb.append(" align-items: ").append(crossAxis.generateStyleCode()).append(";"); //no "\n"
        }

        return sb.toString();
    }
}
