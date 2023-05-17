package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class CenterArgs extends HtmlElement {
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
        return "CenterArgs{" +
                "child=" + child +
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
