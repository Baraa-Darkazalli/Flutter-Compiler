package Ast;

public class DrawerArg {
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
}
