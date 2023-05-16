package Ast;

import Ast.Classes.HtmlElement;

public class Width extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private double value;

    //---------------------------    Setters & Getters     -------------------------------
    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Width{" +
                "value=" + value +
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
        sb.append(value);
        return sb.toString();
    }
}
