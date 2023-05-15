package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class Scaffold extends HtmlElement{
    //---------------------------    Attributes     -------------------------------
    private List<ScaffoldArgs> scaffoldArgsList;

    //---------------------------    Constructor     -------------------------------
    public Scaffold() {
        this.scaffoldArgsList = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<ScaffoldArgs> getScaffoldArgs() {
        return scaffoldArgsList;
    }

    public void setScaffoldArgs(List<ScaffoldArgs> scaffoldArgsList) {
        this.scaffoldArgsList = scaffoldArgsList;
    }
    //---------------------------    Functions     -------------------------------
    public boolean isScaffoldArgsEmpty() {
        return scaffoldArgsList.isEmpty();
    }

    //---------------------------    Override Functions     -------------------------------
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Scaffold(\n");
        if (scaffoldArgsList == null || scaffoldArgsList.isEmpty()) {
            sb.append("No scaffold arguments.\n");
        } else {
            for (ScaffoldArgs arg : scaffoldArgsList) {
                sb.append("  ").append(arg.toString()).append("\n");
            }
        }
        sb.append(")\n");
        return sb.toString();
    }

    @Override
    public String generateHtmlAttribute() {
        return null;
    }

    @Override
    public String generateHtmlCode() {
        return null;
    }
}
