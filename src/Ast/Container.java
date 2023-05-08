package Ast;

import java.util.ArrayList;
import java.util.List;

public class Container {
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
}
