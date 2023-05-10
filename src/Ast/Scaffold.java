package Ast;

import java.util.ArrayList;

public class Scaffold {
    //---------------------------    Attributes     -------------------------------
    List<ScaffoldAttribute> scaffoldAttributes;

    //---------------------------    Constructor     -------------------------------
    public Scaffold() {
        this.scaffoldAttributes = new ArrayList<ScaffoldAttribute>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<ScaffoldAttribute> getScaffoldAttributes() {
        return scaffoldAttributes;
    }

    public void setScaffoldAttributes(List<ScaffoldAttribute> scaffoldAttributes) {
        this.scaffoldAttributes = scaffoldAttributes;
    }

    //---------------------------    ToString Func     -------------------------------
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Scaffold\n");
        sb.append("Attributes:\n");
        for (ScaffoldAttribute attribute : scaffoldAttributes) {
            sb.append(attribute.toString()).append("\n");
        }
        return sb.toString();
    }
}
