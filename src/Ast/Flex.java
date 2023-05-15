package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class Flex extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<FlexArgs> flexArgs;

    //---------------------------    Constructor     -------------------------------
    public Flex() {
        this.flexArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<FlexArgs> getFlexArgs() {
        return flexArgs;
    }

    public void setFlexArgs(List<FlexArgs> flexArgs) {
        this.flexArgs = flexArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Flex{" +
                "flexArgs=" + flexArgs +
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
