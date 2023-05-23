package Ast;

import Ast.Classes.HtmlElement;

public class IconButtonArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private IconArg iconArg;
    private Color color;
    private Padding padding;

    //---------------------------    Setters & Getters     ------------------------------
    public IconArg getIconArg() {
        return iconArg;
    }

    public void setIconArg(IconArg iconArg) {
        this.iconArg = iconArg;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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
        return "IconButtonArgs{" +
                "iconArg=" + iconArg +
                ", color=" + color +
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

        if(iconArg != null)
        {
            sb.append("<button type=\"button\" class=\"btn btn-primary\">");
            sb.append(iconArg.generateHtmlCode());
            sb.append("</button>");
        }
        else
        {
            sb.append("<style>\n");
            sb.append("  .btn{\n");
            if(padding != null)
            {
                sb.append("    padding: ").append(padding.generateStyleCode()).append("px\n");
            }
            else if(color != null)
            {
                sb.append("    background-color: ").append(color.generateStyleCode()).append("\n");
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
