package Ast;

import Ast.Classes.HtmlElement;

public class Color extends HtmlElement {
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
        return "Color{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return color;
    }

    @Override
    public String generateStyleCode() {

        return color;
    }
}