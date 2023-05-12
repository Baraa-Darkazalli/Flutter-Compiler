package Ast;

public class TextButtonArgs {
    //---------------------------    Attributes     -------------------------------
    private Child child;
    private Style style;

    //---------------------------    Setters & Getters     -------------------------------
    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    //---------------------------    Override Func     -------------------------------

    @Override
    public String toString() {
        return "TextButtonArgs{" +
                "child=" + child +
                ", style=" + style +
                '}';
    }
}
