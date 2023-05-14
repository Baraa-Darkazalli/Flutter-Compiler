package Ast;

import java.util.List;

public class Constructor {
    //---------------------------    Attributes     -------------------------------
    private List<ConstructorArg> constructorArgs;

    //---------------------------    Setters & Getters     -------------------------------
    public List<ConstructorArg> getConstructorArgs() {
        return constructorArgs;
    }

    public void setConstructorArgs(List<ConstructorArg> constructorArgs) {
        this.constructorArgs = constructorArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Constructor{" +
                "constructorArgs=" + constructorArgs +
                '}';
    }
}
