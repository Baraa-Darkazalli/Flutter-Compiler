package Ast;

import java.util.ArrayList;
import java.util.List;

public class Drawer {
    //---------------------------    Attributes     -------------------------------
    private List<DrawerArgs> drawerArgs;

    //---------------------------    Constructor     -------------------------------
    public Drawer() {
        this.drawerArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<DrawerArgs> getDrawerArgs() {
        return drawerArgs;
    }

    public void setDrawerArgs(List<DrawerArgs> drawerArgs) {
        this.drawerArgs = drawerArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Drawer{" +
                "drawerArgs=" + drawerArgs +
                '}';
    }
}
