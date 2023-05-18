package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class Center extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private CenterArgs centerArgs;


    //---------------------------    Setters & Getters     -------------------------------
    public CenterArgs getCenterArgs() {
        return centerArgs;
    }

    public void setCenterArgs(CenterArgs centerArgs) {
        this.centerArgs = centerArgs;
    }

    //---------------------------    Override Func     -------------------------------


    @Override
    public String toString() {
        return "Center{" +
                "centerArgs=" + centerArgs +
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
