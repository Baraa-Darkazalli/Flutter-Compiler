package Ast;

import java.util.ArrayList;
import java.util.List;

public class TabBar {
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
}
