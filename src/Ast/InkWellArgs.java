package Ast;

public class InkWellArgs {
    //---------------------------    Attributes     -------------------------------
    private Child child;

    //---------------------------    Setters & Getters     -------------------------------
    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }


    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "InkWellArgs{" +
                "child=" + child +
                '}';
    }
}
