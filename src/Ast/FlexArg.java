package Ast;

import java.util.ArrayList;
import java.util.List;

public class FlexArg {
    //---------------------------    Attributes     -------------------------------
    private int value;

    //---------------------------    Setters & Getters     -------------------------------
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    //---------------------------    Override Func     -------------------------------

    @Override
    public String toString() {
        return "FlexArg{" +
                "value=" + value +
                '}';
    }
}
