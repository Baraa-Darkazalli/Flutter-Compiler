package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class Expanded extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<ExpandedArgs> expandedArgs;

    //---------------------------    Constructor     -------------------------------
    public Expanded() {
        this.expandedArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<ExpandedArgs> getExpandedArgs() {
        return expandedArgs;
    }

    public void setExpandedArgs(List<ExpandedArgs> expandedArgs) {
        this.expandedArgs = expandedArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Expanded{" +
                "expandedArgs=" + expandedArgs +
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
}
