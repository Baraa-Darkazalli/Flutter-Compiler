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
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if(tabs != null)
        {
            sb.append(tabs.generateHtmlCode());
        }
        else if (padding != null)
        {
            sb.append("<style>\n");
            sb.append(".tabBar {\n");
            sb.append("  padding: ").append(padding.generateStyleCode()).append("px;\n");
            sb.append("}\n");
            sb.append("</style>\n");
        }

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
