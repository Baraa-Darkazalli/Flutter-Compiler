package Ast;

import Ast.Classes.HtmlElement;

public class ImageArg extends HtmlElement {
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
        return "ImageArg{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return value;
    }

    @Override
    public String generateHtmlCode() {
        return "";
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
