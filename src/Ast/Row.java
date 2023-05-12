package Ast;

import java.util.ArrayList;
import java.util.List;

public class Row {
    //---------------------------    Attributes     -------------------------------
    private List<RowArgs> rowArgs;

    //---------------------------    Constructor     -------------------------------
    public Row() {
        this.rowArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<RowArgs> getRowArgs() {
        return rowArgs;
    }

    public void setRowArgs(List<RowArgs> rowArgs) {
        this.rowArgs = rowArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Row{" +
                "rowArgs=" + rowArgs +
                '}';
    }
}
