package Ast;

import Ast.Classes.HtmlElement;

public class InkWellArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Child child;
    private OnTap onTap;

    //---------------------------    Setters & Getters     -------------------------------

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public OnTap getOnTap() {
        return onTap;
    }

    public void setOnTap(OnTap onTap) {
        this.onTap = onTap;
    }


    @Override
    public String toString() {
        return "InkWellArgs{" + "child=" + child + ", onTap=" + onTap + '}';
    }

    //---------------------------    Override Func     -------------------------------


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
