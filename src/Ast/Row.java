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
            sb.append("<style>\n");
            sb.append("  .row{\n");
            sb.append("    display: flex; flex-direction: row; justify-content: space-between; align-items: center;\"\n");
            sb.append("  }\n");
            sb.append("</style>\n");
            sb.append("<div class=\"column\" >\n");
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
