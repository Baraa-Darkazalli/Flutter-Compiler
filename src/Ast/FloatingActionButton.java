package Ast;

import java.util.List;

public class FloatingActionButton {
    //---------------------------    Attributes     -------------------------------
    private List<FloatingActionButtonArgs> floatingActionButtonArgs;

    //---------------------------    Setters & Getters     -------------------------------
    public List<FloatingActionButtonArgs> getFloatingActionButtonArgs() {
        return floatingActionButtonArgs;
    }

    public void setFloatingActionButtonArgs(List<FloatingActionButtonArgs> floatingActionButtonArgs) {
        this.floatingActionButtonArgs = floatingActionButtonArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "FloatingActionButton{" +
                "floatingActionButtonArgs=" + floatingActionButtonArgs +
                '}';
    }
}
