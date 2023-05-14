package Ast;

import java.util.List;

public class BuildConst {
    //---------------------------    Attributes     -------------------------------
    private List<Arg> args;

    //---------------------------    Setters & Getters     -------------------------------
    public List<Arg> getArgs() {
        return args;
    }

    public void setArgs(List<Arg> args) {
        this.args = args;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "BuildConst{" +
                "args=" + args +
                '}';
    }
}
