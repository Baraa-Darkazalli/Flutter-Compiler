package Ast;

import Ast.Classes.HtmlElement;

public class Leading extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Widget widget;

    //---------------------------    Setters & Getters     -------------------------------
    public Widget getWidget() {
        return widget;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Leading{" +
                "widget=" + widget +
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
