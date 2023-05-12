package Ast;

public class FloatingActionButtonArgs {
    //---------------------------    Attributes     -------------------------------
    private Child child;
    private BackGroundColor backGroundColor;

    //---------------------------    Setters & Getters     -------------------------------
    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public BackGroundColor getBackGroundColor() {
        return backGroundColor;
    }

    public void setBackGroundColor(BackGroundColor backGroundColor) {
        this.backGroundColor = backGroundColor;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "FloatingActionButtonArgs{" +
                "child=" + child +
                ", backGroundColor=" + backGroundColor +
                '}';
    }
}
