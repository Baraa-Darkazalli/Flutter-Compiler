package Ast;

public class ListviewArgs {
    //---------------------------    Attributes     -------------------------------
    private Children children;
    private Padding padding;

    //---------------------------    Setters & Getters     -------------------------------
    public Children getChildren() {
        return children;
    }

    public void setChildren(Children children) {
        this.children = children;
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
        return "ListviewArgs{" +
                "children=" + children +
                ", padding=" + padding +
                '}';
    }
}
