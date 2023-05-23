package Ast;

import Ast.Classes.HtmlElement;

public class MainAxis extends HtmlElement {
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
        return "MainAxis{" +
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
        switch (axis)
        {
            case "start":
                return "flex-start";
            case "center":
                return "center";
            case "end":
                return "flex-end";
        }
        return "";
    }
}
