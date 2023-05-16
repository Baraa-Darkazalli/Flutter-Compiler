package Ast;

import Ast.Classes.HtmlElement;

public class CrossAxis extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Axisvalues axisvalues;

    //---------------------------    Setters & Getters     -------------------------------
    public Axisvalues getAxisvalues() {
        return axisvalues;
    }

    public void setAxisvalues(Axisvalues axisvalues) {
        this.axisvalues = axisvalues;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "CrossAxis{" +
                "axisvalues=" + axisvalues +
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
