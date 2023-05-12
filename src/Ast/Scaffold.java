package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class Scaffold {
    //---------------------------    Attributes     -------------------------------
    private List<ScaffoldArgs> scaffoldArgs;

    //---------------------------    Constructor     -------------------------------
    public Scaffold() {
        this.scaffoldArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<ScaffoldArgs> getScaffoldArgs() {
        return scaffoldArgs;
    }

    public void setScaffoldArgs(List<ScaffoldArgs> scaffoldArgs) {
        this.scaffoldArgs = scaffoldArgs;
    }
    //---------------------------    Functions     -------------------------------
    public boolean isScaffoldArgsEmpty() {
        return scaffoldArgs.isEmpty();
    }

    //---------------------------    Override Functions     -------------------------------
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Scaffold(\n");
        if (scaffoldArgs == null || scaffoldArgs.isEmpty()) {
            sb.append("  No scaffold arguments.\n");
        } else {
            for (ScaffoldArgs arg : scaffoldArgs) {
                sb.append("  ").append(arg.toString()).append("\n");
            }
        }
        sb.append(")\n");
        return sb.toString();
    }
}
