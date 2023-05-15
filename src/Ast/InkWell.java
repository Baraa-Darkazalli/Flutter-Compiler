package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class InkWell extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<InkWellArgs> inkWellArgs;

    //---------------------------    Constructor     -------------------------------
    public InkWell() {
        this.inkWellArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<InkWellArgs> getInkWellArgs() {
        return inkWellArgs;
    }

    public void setInkWellArgs(List<InkWellArgs> inkWellArgs) {
        this.inkWellArgs = inkWellArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "InkWell{" +
                "inkWellArgs=" + inkWellArgs +
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
