package Ast;

import Ast.Classes.HtmlElement;

public class ImageArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private ImageArg imageArg;
    private Color color;
    private Height height;
    private Width width;

    //---------------------------    Setters & Getters     -------------------------------
    public ImageArg getImageArg() {
        return imageArg;
    }

    public void setImageArg(ImageArg imageArg) {
        this.imageArg = imageArg;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public Width getWidth() {
        return width;
    }

    public void setWidth(Width width) {
        this.width = width;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "ImageArgs{" +
                "imageArg=" + imageArg +
                ", color=" + color +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if(imageArg != null)
        {
            sb.append("<img ").append(imageArg.generateHtmlAttribute()).append(" alt=\"image\">\n");
            sb.append(imageArg.generateScriptCode());
        }
        else
        {
            sb.append("<style>\n");
            sb.append("  img{\n");
            if(color != null)
            {
                sb.append("    background-color= ").append(color.generateStyleCode()).append(";\n");
            }
            else if(height != null)
            {
                sb.append("    height: ").append(height.generateStyleCode()).append("px\n");
            }
            else if(width != null)
            {
                sb.append("    width: ").append(width.generateStyleCode()).append("px\n");
            }
            sb.append("  }\n");
            sb.append("</style>\n");
        }

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        StringBuilder sb = new StringBuilder();



        return sb.toString();
    }
}
