package Ast;

import java.util.ArrayList;
import java.util.List;

public class Children {
    //---------------------------    Attributes     -------------------------------
    private List<Widget> widgets;

    //---------------------------    Constructor     -------------------------------
    public Children() {
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
        return "Children{" +
                "widgets=" + widgets +
                '}';
    }
}
