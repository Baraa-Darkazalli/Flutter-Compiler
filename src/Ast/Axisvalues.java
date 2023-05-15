package Ast;

import Ast.Classes.HtmlElement;

public class Axisvalues extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private String value;

    //---------------------------    Setters & Getters     -------------------------------
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Axisvalues{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return null;
    }

    @Override
    public String generateHtmlCode() {
        return null;
    }
}
