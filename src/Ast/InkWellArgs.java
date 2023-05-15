package Ast;

import Ast.Classes.HtmlElement;

public class InkWellArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Child child;

    //---------------------------    Setters & Getters     -------------------------------
    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }


    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "InkWellArgs{" +
                "child=" + child +
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
