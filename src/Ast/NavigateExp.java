package Ast;

import Ast.Classes.HtmlElement;

public class NavigateExp extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Transtion transtion;

    //---------------------------    Setters & Getters     -------------------------------
    public Transtion getTranstion() {
        return transtion;
    }

    public void setTranstion(Transtion transtion) {
        this.transtion = transtion;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "NavigateExp{" +
                "transtion=" + transtion +
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
