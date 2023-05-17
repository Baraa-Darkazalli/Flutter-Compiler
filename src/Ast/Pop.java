package Ast;

import Ast.Classes.HtmlElement;

public class Pop extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private String pop;

    //---------------------------    Setters & Getters     -------------------------------
    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Pop{" +
                "pop='" + pop + '\'' +
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
