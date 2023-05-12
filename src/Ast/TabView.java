package Ast;

import java.util.ArrayList;
import java.util.List;

public class TabView {
    //---------------------------    Attributes     -------------------------------
    private List<TabBarViewArgs> tabBarViewArgs;

    //---------------------------    Constructor     -------------------------------
    public TabView() {
        this.tabBarViewArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<TabBarViewArgs> getTabBarViewArgs() {
        return tabBarViewArgs;
    }

    public void setTabBarViewArgs(List<TabBarViewArgs> tabBarViewArgs) {
        this.tabBarViewArgs = tabBarViewArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "TabView{" +
                "tabBarViewArgs=" + tabBarViewArgs +
                '}';
    }
}
