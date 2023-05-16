package Ast;

import Ast.Classes.HtmlElement;

public class BackGroundColor extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Colors colors;

    //---------------------------    Setters & Getters     -------------------------------
    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "BackGroundColor{" +
                "colors=" + colors +
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
