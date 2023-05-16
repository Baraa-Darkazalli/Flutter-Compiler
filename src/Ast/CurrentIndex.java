package Ast;

import Ast.Classes.HtmlElement;

public class CurrentIndex extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private int value;

    //---------------------------    Setters & Getters     -------------------------------
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "CurrentIndex{" +
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
