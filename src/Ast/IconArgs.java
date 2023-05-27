package Ast;

import Ast.Classes.HtmlElement;

public class IconArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Size size;
    private Color color;
    private String icon;

    //---------------------------    Setters & Getters     -------------------------------

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }


    //---------------------------    Override Func     -------------------------------


    @Override
    public String toString() {
        return "IconArgs{" +
                "size=" + size +
                ", color=" + color +
                ", icon='" + icon + '\'' +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        StringBuilder sb = new StringBuilder();

        if(size != null)
        {
            sb.append("width=\"").append(size.generateHtmlAttribute()).append("\" height=\"").append(size.generateHtmlAttribute()).append("\"");
        }
        else if(color != null)
        {
            sb.append("fill=\"").append(color.generateHtmlAttribute()).append("\"");
        }

        return sb.toString();
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if(icon != null && icon.equals("back"))
        {
            sb.append("  <path fill-rule=\"evenodd\" d=\"M15 8a.5.5 0 0 0-.5-.5H2.707l3.147-3.146a.5.5 0 1 0-.708-.708l-4 4a.5.5 0 0 0 0 .708l4 4a.5.5 0 0 0 .708-.708L2.707 8.5H14.5A.5.5 0 0 0 15 8z\"/>\n");
        }

        return sb.toString();
    }
}
