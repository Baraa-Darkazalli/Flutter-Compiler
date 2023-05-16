package Ast;

import Ast.Classes.HtmlElement;

public class BackGroundColor extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private String color;

    //---------------------------    Setters & Getters     -------------------------------
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Colors{" +
                "color='" + color + '\'' +
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
        return color;
    }
}