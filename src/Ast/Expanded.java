package Ast;

import java.util.ArrayList;
import java.util.List;

public class Expanded {
    //---------------------------    Attributes     -------------------------------
    private List<ExpandedArgs> expandedArgs;

    //---------------------------    Constructor     -------------------------------
    public Expanded() {
        this.expandedArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<ExpandedArgs> getExpandedArgs() {
        return expandedArgs;
    }

    public void setExpandedArgs(List<ExpandedArgs> expandedArgs) {
        this.expandedArgs = expandedArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Expanded{" +
                "expandedArgs=" + expandedArgs +
                '}';
    }
}
