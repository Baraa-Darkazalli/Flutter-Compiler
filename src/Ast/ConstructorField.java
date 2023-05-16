package Ast;

import Ast.Classes.HtmlElement;

public class ConstructorField extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private String string;
    private double value;

    //---------------------------    Setters & Getters     -------------------------------
    public String getDataType() {
        return string;
    }

    public void setDataType(String string) {
        this.string = string;
    }

    public double getAttributeName() {
        return value;
    }

    public void setAttributeName(double value) {
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
}
