package Ast;

import Ast.Classes.HtmlElement;

public class RunAppExp extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Constructor constructor;

    //---------------------------    Setters & Getters     -------------------------------
    public Constructor getConstructor() {
        return constructor;
    }

    public void setConstructor(Constructor constructor) {
        this.constructor = constructor;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "RunAppExp{" +
                "constructor=" + constructor +
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
