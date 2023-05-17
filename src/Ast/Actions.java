package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class Actions extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<Widget> widget;

    //---------------------------    Setters & Getters     -------------------------------

    public List<Widget> getWidget() {
        return widget;
    }

    public void setWidget(List<Widget> widget) {
        this.widget = widget;
    }


    //---------------------------    Override Func     -------------------------------


    public Actions() {
        this.widget = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Actions{" +
                "widget=" + widget +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        sb.append(widget.generateHtmlCode());

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
