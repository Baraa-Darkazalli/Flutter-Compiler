package Ast;

import Ast.Classes.HtmlElement;

public class ContainerArg extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Child child;
    private Width width;
    private Height height;
    private Color color;
    private Margin margin;
    private Padding padding;

    //---------------------------    Setters & Getters     -------------------------------
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

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

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

    public Padding getPadding() {
        return padding;
    }

    public void setPadding(Padding padding) {
        this.padding = padding;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "ContainerArg{" +
                "child=" + child +
                ", width=" + width +
                ", height=" + height +
                ", color=" + color +
                ", margin=" + margin +
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

        if(child != null)
        {
            sb.append("<div class=\"container-child\">");
            sb.append(child.generateHtmlCode());
            sb.append("</div>");
        }
        else
        {
            sb.append("<style>\n");
            sb.append(".container-child{\n");

            if(width != null)
            {
                sb.append("   width: ").append(width).append("px;\n");
            }
            else if(height != null)
            {
                sb.append("   height: ").append(height).append("px;\n");
            }
            else if(color != null)
            {
                sb.append("   background-color: ").append(color).append(";\n");
            }
            else if(padding != null)
            {
                sb.append("   padding: ").append(padding).append("px;\n");
            }
            else if(margin != null)
            {
                sb.append("   margin: ").append(margin).append("px;\n");
            }

            sb.append("}\n");
            sb.append("</style>\n");
        }

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
