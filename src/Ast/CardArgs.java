package Ast;

import Ast.Classes.HtmlElement;

public class CardArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Color color;
    private Margin margin;
    private Child child;

    //---------------------------    Setters & Getters     -------------------------------
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Margin getMargin() {
        return margin;
    }

    public void setMargin(Margin margin) {
        this.margin = margin;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "CardArgs{" +
                "color=" + color +
                ", margin=" + margin +
                ", child=" + child +
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
            sb.append("<div class=\"card-child card shadow p-3 mb-5 bg-white rounded\">\n");
            sb.append(child.generateHtmlCode());
            sb.append("</div>");
        }
        else if(margin != null)
        {
            sb.append("<style>\n");
            sb.append("  .card-child > *{\n");
            sb.append("    margin: ").append(margin.generateStyleCode()).append("px\n");
            sb.append("  }\n");
            sb.append("</style>\n");
        }
        else if(color != null)
        {
            sb.append("<style>\n");
            sb.append("  .card-child > *{\n");
            sb.append("    background-color: ").append(color.generateStyleCode()).append("\n");
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
