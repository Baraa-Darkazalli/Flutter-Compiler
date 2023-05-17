package Ast;

import Ast.Classes.HtmlElement;

public class TextStyleArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private BackGroundColor backGroundColor;
    private Color color;
    private FontSize fontSize;

    //---------------------------    Setters & Getters     -------------------------------
    public BackGroundColor getBackGroundColor() {
        return backGroundColor;
    }

    public void setBackGroundColor(BackGroundColor backGroundColor) {
        this.backGroundColor = backGroundColor;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public FontSize getFontSize() {
        return fontSize;
    }

    public void setFontSize(FontSize fontSize) {
        this.fontSize = fontSize;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "TextStyleArgs{" +
                "backGroundColor=" + backGroundColor +
                ", color=" + color +
                ", fontSize=" + fontSize +
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

    @Override
    public String generateStyleCode() {
        StringBuilder sb = new StringBuilder();

        if(backGroundColor != null)
        {
            sb.append("    background-color: ").append(backGroundColor.generateStyleCode()).append(";\n");
        }
        else if(color != null)
        {
            sb.append("    color: ").append(color.generateStyleCode()).append(";\n");
        }
        else if(fontSize != null)
        {
            sb.append("    font-size: ").append(fontSize.generateStyleCode()).append("px;\n");
        }

        return sb.toString();
    }
}
