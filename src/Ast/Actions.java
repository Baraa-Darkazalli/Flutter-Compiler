package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class Actions extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<Widget> widgets;

    //---------------------------    Constructor     -------------------------------
    public Actions() {
        this.widgets = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------

    public List<Widget> getWidgets() {
        return widgets;
    }

    public void setWidgets(List<Widget> widgets) {
        this.widgets = widgets;
    }


    //---------------------------    Override Func     -------------------------------

    @Override
    public String toString() {
        return "Actions{" +
                "widgets=" + widgets +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if(widgets != null && !widgets.isEmpty())
        {
            for(Widget widget : widgets)
            {
                sb.append(widget.generateHtmlCode());
            }
        }

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
