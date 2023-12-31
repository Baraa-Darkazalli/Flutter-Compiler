package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class Container extends HtmlElement{
    //---------------------------    Attributes     -------------------------------
    private List<ContainerArg> containerArgsList;

    //---------------------------    Constructor     -------------------------------
    public Container() {
        this.containerArgsList = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<ContainerArg> getContainerArgs() {
        return containerArgsList;
    }

    public void setContainerArgs(List<ContainerArg> containerArgsList) {
        this.containerArgsList = containerArgsList;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Container\n");
        for (ContainerArg attribute : containerArgsList) {
            sb.append(attribute.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if(containerArgsList!=null && !containerArgsList.isEmpty())
        {
            for(ContainerArg containerArg:containerArgsList)
            {
                sb.append(containerArg.generateHtmlCode());
            }
        }

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
