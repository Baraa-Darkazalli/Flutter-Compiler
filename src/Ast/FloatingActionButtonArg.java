package Ast;

import Ast.Classes.HtmlElement;

public class FloatingActionButtonArg extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private FloatingActionButton floatingActionButton;

    //---------------------------    Setters & Getters     -------------------------------
    public FloatingActionButton getFloatingActionButton() {
        return floatingActionButton;
    }

    public void setFloatingActionButton(FloatingActionButton floatingActionButton) {
        this.floatingActionButton = floatingActionButton;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "FloatingActionButtonArg{" +
                "floatingActionButton=" + floatingActionButton +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        sb.append(floatingActionButton.generateHtmlCode());

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
