package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class TabBar extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<TabBarArgs> tabBarArgs;

    //---------------------------    Constructor     -------------------------------
    public TabBar() {
        this.tabBarArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<TabBarArgs> getTabBarArgs() {
        return tabBarArgs;
    }

    public void setTabBarArgs(List<TabBarArgs> tabBarArgs) {
        this.tabBarArgs = tabBarArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "TabBar{" +
                "tabBarArgs=" + tabBarArgs +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if(tabBarArgs != null && !tabBarArgs.isEmpty())
        {
            sb.append("<div class=\"tabBar\">\n");
            for(TabBarArgs tabBarArg:tabBarArgs)
            {
                sb.append(tabBarArg.generateHtmlCode());
            }
            sb.append("</div>\n");
        }

        return sb.toString();
    }
}
