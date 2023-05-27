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

        sb.append("<style>\n");
        sb.append("  aside {\n");
        if(drawerArgsList!=null && !drawerArgsList.isEmpty())
        {
            for(DrawerArgs drawerArg:drawerArgsList)
            {
                sb.append(drawerArg.generateStyleCode());
            }
        }
        sb.append("  }\n");
        sb.append("</style>\n");

        sb.append("<aside>\n");
        if(drawerArgsList!=null && !drawerArgsList.isEmpty())
        {
            for (DrawerArgs drawerArg : drawerArgsList)
            {
                sb.append("<div>\n");
                sb.append(drawerArg.generateHtmlCode());
                sb.append("</div>\n");
            }
        }
        sb.append("</aside>\n");

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
