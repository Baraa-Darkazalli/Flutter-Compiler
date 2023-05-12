package Ast;

public class TabBarViewArgs {
    //---------------------------    Attributes     -------------------------------
    private Children children;

    //---------------------------    Setters & Getters     -------------------------------
    public Children getChildren() {
        return children;
    }

    public void setChildren(Children children) {
        this.children = children;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "TabBarViewArgs{" +
                "children=" + children +
                '}';
    }
}
