package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class Tabs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<Widget> widgets;

    //---------------------------    Constructor     -------------------------------
    public Tabs() {
        this.widgets = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<Widget> getWidget() {
        return widgets;
    }

    public void setWidget(List<Widget> widgets) {
        this.widgets = widgets;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Tabs{" +
                "widgets=" + widgets +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        StringBuilder sb = new StringBuilder();

        if(widgets != null && !widgets.isEmpty())
        {
            for(Widget widget:widgets)
            {
                sb.append(widget.generateHtmlCode());
            }
        }

        return sb.toString();
    }

    @Override
    public String generateHtmlCode() {
        return "";
    }
}
