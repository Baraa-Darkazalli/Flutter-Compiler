package Ast;

import Ast.Classes.HtmlElement;

public class CrossAxis extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private String axis;

    //---------------------------    Setters & Getters     -------------------------------

    public String getAxis() {
        return axis;
    }

    public void setAxis(String axis) {
        this.axis = axis;
    }


    //---------------------------    Override Func     -------------------------------


    @Override
    public String toString() {
        return "CrossAxis{" +
                "axis='" + axis + '\'' +
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
        return "";
    }
}
