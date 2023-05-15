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
        return null;
    }

    @Override
    public String generateHtmlCode() {
        return null;
    }
}
