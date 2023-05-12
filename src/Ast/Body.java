package Ast;

public class Body {
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
        return "Body{" +
                "widget=" + widget +
                '}';
    }
}
