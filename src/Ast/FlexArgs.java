package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class FlexArgs extends HtmlElement {
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

    @Override
    public String toString() {
        return "FlexArgs{" +
                "child=" + child +
                ", flexArg=" + flexArg +
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
