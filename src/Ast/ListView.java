package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class ListView extends HtmlElement {
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

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if(listviewArgs != null && !listviewArgs.isEmpty())
        {
            for(ListviewArgs listViewArg:listviewArgs)
            {
                sb.append(listViewArg.generateHtmlCode());
            }
        }

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
