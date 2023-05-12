package Ast;

import java.util.ArrayList;
import java.util.List;

public class Wrap {
    //---------------------------    Attributes     -------------------------------
    private List<WrapArgs> wrapArgs;

    //---------------------------    Constructor     -------------------------------
    public Wrap() {
        this.wrapArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<WrapArgs> getWrapArgs() {
        return wrapArgs;
    }

    public void setWrapArgs(List<WrapArgs> wrapArgs) {
        this.wrapArgs = wrapArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Wrap{" +
                "wrapArgs=" + wrapArgs +
                '}';
    }
}
