package Ast;

import Ast.Classes.HtmlElement;

public class ExpandedArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Child child;
    private FlexArg flexArg;

    //---------------------------    Setters & Getters     -------------------------------
    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public FlexArg getFlexArg() {
        return flexArg;
    }

    public void setFlexArg(FlexArg flexArg) {
        this.flexArg = flexArg;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "ExpandedArgs{" +
                "child=" + child +
                ", flexArg=" + flexArg +
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
