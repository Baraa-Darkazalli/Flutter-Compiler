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
        StringBuilder sb = new StringBuilder();

        if(columnArgs != null && !columnArgs.isEmpty())
        {
            sb.append("<div class=\"column\" style=\" ");// no "\n"
            for(ColumnArgs columnArg:columnArgs)
            {
                sb.append(columnArg.generateStyleCode());
            }
            sb.append(" \" >\n");

            for(ColumnArgs columnArg:columnArgs)
            {
                sb.append(columnArg.generateHtmlCode());
            }
            sb.append("</div>\n");
        }

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
