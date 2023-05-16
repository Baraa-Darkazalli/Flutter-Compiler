package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class Drawer extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<DrawerArgs> drawerArgsList;

    //---------------------------    Constructor     -------------------------------
    public Drawer() {
        this.drawerArgsList = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<DrawerArgs> getDrawerArgs() {
        return drawerArgsList;
    }

    public void setDrawerArgs(List<DrawerArgs> drawerArgsList) {
        this.drawerArgsList = drawerArgsList;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Drawer{" +
                "drawerArgsList=" + drawerArgsList +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        //Sidebar Style
        sb.append("<style>\n");
        sb.append("  .sidebar {\n");
        sb.append("    margin: 0;\n");
        sb.append("    padding: 0;\n");
        sb.append("    width: 200px;\n"); //default
        sb.append("    background-color: #f1f1f1;\n"); //default
        if(drawerArgsList!=null && !drawerArgsList.isEmpty())
        {
            for(DrawerArgs drawerArg:drawerArgsList)
            {
                sb.append(drawerArg.generateStyleCode());
            }
        }
        sb.append("    position: fixed;\n");
        sb.append("    height: 100%;\n");
        sb.append("    overflow: auto;\n");
        sb.append("  }\n");
        sb.append("\n");
        sb.append("  /* Sidebar Args */\n");
        sb.append("  .sidebar div {\n");
        sb.append("    display: block;\n");
        sb.append("    color: black;\n");
        sb.append("    padding: 16px;\n");
        sb.append("    text-decoration: none;\n");
        sb.append("  }\n");
        sb.append("\n");
        sb.append("  /* Active/current Arg */\n");
        sb.append("  .sidebar div.active {\n");
        sb.append("    background-color: #04AA6D;\n");
        sb.append("    color: white;\n");
        sb.append("  }\n");
        sb.append("\n");
        sb.append("  /* Arg on mouse-over */\n");
        sb.append("  .sidebar div:hover:not(.active) {\n");
        sb.append("    background-color: #555;\n");
        sb.append("    color: white;\n");
        sb.append("  }\n");
        sb.append("</style>\n");

        sb.append("<div class=\"sidebar\" >\n");
        if(drawerArgsList!=null && !drawerArgsList.isEmpty())
        {
            for (DrawerArgs drawerArg : drawerArgsList)
            {
                sb.append("<div>\n");
                sb.append(drawerArg.generateHtmlCode());
                sb.append("</div>\n");
            }
        }
        sb.append("</div>\n");

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
