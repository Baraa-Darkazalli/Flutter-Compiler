package Ast;

import Ast.Classes.HtmlElement;

import java.util.List;

public class FloatingActionButton extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<FloatingActionButtonArgs> floatingActionButtonArgs;

    //---------------------------    Setters & Getters     -------------------------------
    public List<FloatingActionButtonArgs> getFloatingActionButtonArgs() {
        return floatingActionButtonArgs;
    }

    public void setFloatingActionButtonArgs(List<FloatingActionButtonArgs> floatingActionButtonArgs) {
        this.floatingActionButtonArgs = floatingActionButtonArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "FloatingActionButton{" +
                "floatingActionButtonArgs=" + floatingActionButtonArgs +
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
