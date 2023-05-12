package Ast;

public class WrapArgs {
    //---------------------------    Attributes     -------------------------------
    private Children children;
    private CrossAxis crossAxis;

    //---------------------------    Setters & Getters     -------------------------------
    public Children getChildren() {
        return children;
    }

    public void setChildren(Children children) {
        this.children = children;
    }

    public CrossAxis getCrossAxis() {
        return crossAxis;
    }

    public void setCrossAxis(CrossAxis crossAxis) {
        this.crossAxis = crossAxis;
    }

    //---------------------------    Override Func     -------------------------------

    @Override
    public String toString() {
        return "WrapArgs{" +
                "children=" + children +
                ", crossAxis=" + crossAxis +
                '}';
    }
}
