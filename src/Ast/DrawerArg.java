package Ast;

import Ast.Classes.HtmlElement;

public class DrawerArg extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Drawer drawer;

    //---------------------------    Setters & Getters     -------------------------------
    public Drawer getDrawer() {
        return drawer;
    }

    public void setDrawer(Drawer drawer) {
        this.drawer = drawer;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "DrawerArg{" +
                "drawer=" + drawer +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        sb.append(drawer.generateHtmlCode());

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
