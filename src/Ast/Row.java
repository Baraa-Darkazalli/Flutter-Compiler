package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class Row extends HtmlElement {
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

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if(rowArgs != null && !rowArgs.isEmpty())
        {
            sb.append("<div class=\"row\" >\n");
            for(RowArgs rowArg:rowArgs)
            {
                sb.append(rowArg.generateHtmlCode());
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
