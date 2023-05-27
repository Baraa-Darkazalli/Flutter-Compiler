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
        StringBuilder sb = new StringBuilder();

        if(onTap != null)
        {
            sb.append(" onclick=\"").append(onTap.generateHtmlAttribute()).append("\""); // no "\n"
        }

        return sb.toString();
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if(child != null)
        {
            sb.append(child.generateHtmlCode());
        }

        return sb.toString();
    }
}
