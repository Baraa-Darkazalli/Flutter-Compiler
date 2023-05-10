package Ast;

import Ast.Classes.HtmlElement;

import java.util.HashSet;
import java.util.Set;

public class Container extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Set<ContainerArg> containerArgs;

    //---------------------------    Constructor     -------------------------------
    public Container() {
        this.containerArgs = new HashSet<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public Set<ContainerArg> getContainerArgs() {
        return containerArgs;
    }

    public void setContainerArgs(Set<ContainerArg> containerArgs) {
        this.containerArgs = containerArgs;
    }

    //---------------------------    ToString Func     -------------------------------
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Container\n");
        for (ContainerArg attribute : containerArgs) {
            sb.append(attribute.toString()).append("\n");
        }
        return sb.toString();
    }
    //---------------------------    HtmlElement Functions     -------------------------------
    @Override
    public String getBootstrapClass() {
        return "";
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();
        sb.append("<div class=\"container\"");

        // add Html attributes if exists
        if (containerArgs != null && !containerArgs.isEmpty())
        {
            for (ContainerArg attribute : containerArgs)
            {
                sb.append(" ").append(attribute.generateHtmlAttribute());
            }
        }
        sb.append(">\n");

        // add Tag Body
        if (containerArgs != null && !containerArgs.isEmpty())
        {
            for (ContainerArg attribute : containerArgs)
            {
                sb.append(attribute.generateHtmlCode());
            }
        }

        sb.append("</div>");

        return sb.toString();
    }
}
