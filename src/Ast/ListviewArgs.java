package Ast;

import Ast.Classes.HtmlElement;

public class ListviewArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Children children;
    private Padding padding;

    //---------------------------    Setters & Getters     -------------------------------
    public Children getChildren() {
        return children;
    }

    public void setChildren(Children children) {
        this.children = children;
    }

    public Padding getPadding() {
        return padding;
    }

    public void setPadding(Padding padding) {
        this.padding = padding;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "ListviewArgs{" +
                "children=" + children +
                ", padding=" + padding +
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
            sb.append("<div class=\"listView-children\">\n");
            sb.append(children.generateHtmlCode());
            sb.append("</div>");
        }
        else if(padding != null)
        {
            sb.append("<style>\n");
            sb.append("  .listView-children > *{\n");
            sb.append(padding.generateStyleCode());
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
