package Ast;

import Ast.Classes.HtmlElement;

public class Max extends HtmlElement {
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
        return "Max{" +
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
}
