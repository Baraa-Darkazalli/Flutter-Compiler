package Ast;

import java.util.ArrayList;
import java.util.List;

public class Drawer {
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
}
