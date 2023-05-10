package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class Container extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<ContainerAttribute> containerAttributes;

    //---------------------------    Constructor     -------------------------------
    public Container() {
        this.containerAttributes = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<ContainerAttribute> getContainerAttributes() {
        return containerAttributes;
    }

    public void setContainerAttributes(List<ContainerAttribute> containerAttributes) {
        this.containerAttributes = containerAttributes;
    }

    //---------------------------    ToString Func     -------------------------------
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Container\n");
        for (ContainerAttribute attribute : containerAttributes) {
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
        if (containerAttributes != null && !containerAttributes.isEmpty())
        {
            for (ContainerAttribute attribute : containerAttributes)
            {
                sb.append(" ").append(attribute.generateHtmlAttribute());
            }
        }
        sb.append(">\n");

        // add Tag Body
        if (containerAttributes != null && !containerAttributes.isEmpty())
        {
            for (ContainerAttribute attribute : containerAttributes)
            {
                sb.append(attribute.generateHtmlCode());
            }
        }

        sb.append("</div>");

        return sb.toString();
    }
}
