package Ast;

import Ast.Classes.HtmlElement;

public class Push extends HtmlElement {
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
        return "Push{" +
                "constructor=" + constructor +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        StringBuilder sb = new StringBuilder();

        sb.append(constructor.generateHtmlAttribute());

        return sb.toString();
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
