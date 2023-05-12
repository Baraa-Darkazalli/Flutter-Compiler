package Ast;

import java.util.ArrayList;
import java.util.List;

public class Tabs {
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
}
