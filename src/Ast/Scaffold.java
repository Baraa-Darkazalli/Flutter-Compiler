package Ast;

import Ast.Classes.HtmlElement;

import java.util.HashSet;
import java.util.Set;

public class Scaffold extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Set<ScaffoldArg> scaffoldArgs;

    //---------------------------    Constructor     -------------------------------
    public Scaffold() {
        this.scaffoldArgs = new HashSet<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public Set<ScaffoldArg> getScaffoldArgs() {
        return scaffoldArgs;
    }

    public void setScaffoldArgs(Set<ScaffoldArg> scaffoldArgs) {
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
            for (ScaffoldArg arg : scaffoldArgs) {
                sb.append("  ").append(arg.toString()).append("\n");
            }
        }

        sb.append(")\n");
        return sb.toString();
    }
}
