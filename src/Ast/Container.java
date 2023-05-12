package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class Container {
    //---------------------------    Attributes     -------------------------------
    private List<ContainerArg> containerArgs;

    //---------------------------    Constructor     -------------------------------
    public Container() {
        this.containerArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<ContainerArg> getContainerArgs() {
        return containerArgs;
    }

    public void setContainerArgs(List<ContainerArg> containerArgs) {
        this.containerArgs = containerArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Container\n");
        for (ContainerArg attribute : containerArgs) {
            sb.append(attribute.toString()).append("\n");
        }
        return sb.toString();
    }
}
