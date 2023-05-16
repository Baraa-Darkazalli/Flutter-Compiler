package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class Column extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<ColumnArgs> columnArgs;

    //---------------------------    Constructor     -------------------------------
    public Column() {
        this.columnArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<ColumnArgs> getColumnArgs() {
        return columnArgs;
    }

    public void setColumnArgs(List<ColumnArgs> columnArgs) {
        this.columnArgs = columnArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Column{" +
                "columnArgs=" + columnArgs +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        return "";
    }
}
