package Ast;

import Ast.Classes.HtmlElement;

public class ConstructorField extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private String string;
    private double value;

    //---------------------------    Setters & Getters     -------------------------------


    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "ConstructorField{" +
                "string=" + string +
                ", value=" + value +
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
        return null;
    }
}
