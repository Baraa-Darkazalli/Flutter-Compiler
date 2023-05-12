package Ast;

public class ExpandedArgs {
    //---------------------------    Attributes     -------------------------------
    private Child child;
    private FlexArg flexArg;

    //---------------------------    Setters & Getters     -------------------------------
    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public FlexArg getFlexArg() {
        return flexArg;
    }

    public void setFlexArg(FlexArg flexArg) {
        this.flexArg = flexArg;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "ExpandedArgs{" +
                "child=" + child +
                ", flexArg=" + flexArg +
                '}';
    }
}
