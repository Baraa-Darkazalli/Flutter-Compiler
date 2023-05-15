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
        return null;
    }

    @Override
    public String generateHtmlCode() {
        return null;
    }
}
