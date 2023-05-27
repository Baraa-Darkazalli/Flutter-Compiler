package Ast;

import Ast.Classes.HtmlElement;

public class Size extends HtmlElement {
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
        return "Size{" +
                "value=" + value +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        StringBuilder sb = new StringBuilder();

        sb.append(value);

        return sb.toString();
    }
}
