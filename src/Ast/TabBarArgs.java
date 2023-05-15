package Ast;

import Ast.Classes.HtmlElement;

public class TabBarArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Tabs tabs;
    private Padding padding;

    //---------------------------    Setters & Getters     -------------------------------
    public Tabs getTabs() {
        return tabs;
    }

    public void setTabs(Tabs tabs) {
        this.tabs = tabs;
    }

    public Padding getPadding() {
        return padding;
    }

    public void setPadding(Padding padding) {
        this.padding = padding;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "TabBarArgs{" +
                "tabs=" + tabs +
                ", padding=" + padding +
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
