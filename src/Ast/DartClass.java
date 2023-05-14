package Ast;

import java.util.List;

public class DartClass {
    //---------------------------    Attributes     -------------------------------
    private List<ClassArgs> classArgs;

    //---------------------------    Setters & Getters     -------------------------------
    public List<ClassArgs> getClassArgs() {
        return classArgs;
    }

    public void setClassArgs(List<ClassArgs> classArgs) {
        this.classArgs = classArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "DartClass{" +
                "classArgs=" + classArgs +
                '}';
    }
}
