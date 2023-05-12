package Ast;

import java.util.ArrayList;
import java.util.List;

public class FlexArgs {
    //---------------------------    Attributes     -------------------------------
    private Child child;

    //Should Add Flex

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
        return "FlexArgs{" +
                "child=" + child +
                '}';
    }
}
