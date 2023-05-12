package Ast;

public class Actions {
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
        return "Actions{" +
                "widget=" + widget +
                '}';
    }
}
