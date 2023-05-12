package Ast;

import java.util.ArrayList;
import java.util.List;

public class ListView {
    //---------------------------    Attributes     -------------------------------
    private List<ListviewArgs> listviewArgs;

    //---------------------------    Constructor     -------------------------------
    public ListView() {
        this.listviewArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<ListviewArgs> getListviewArgs() {
        return listviewArgs;
    }

    public void setListviewArgs(List<ListviewArgs> listviewArgs) {
        this.listviewArgs = listviewArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "ListView{" +
                "listviewArgs=" + listviewArgs +
                '}';
    }
}
