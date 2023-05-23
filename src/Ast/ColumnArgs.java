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
        else
        {
            sb.append("<style>\n");
            sb.append("  .column{\n");
            if(mainAxis != null)
            {
                sb.append(mainAxis.generateStyleCode());
            }
            else if(crossAxis != null)
            {
                sb.append(crossAxis.generateStyleCode());
            }
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
