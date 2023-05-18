package Ast;

import Ast.Classes.HtmlElement;

public class IconArg extends HtmlElement {
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
        return "IconArg{" +
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
