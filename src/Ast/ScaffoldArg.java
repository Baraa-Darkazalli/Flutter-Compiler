package Ast;

public class ScaffoldArg {
    //---------------------------    Attributes     -------------------------------
    private Body body;
    private DrawerArg drawerArg;
    private AppBarArg appBarArg;
    private BottomNavigationBarArg bottomNavigationBarArg;
    private FloatingActionButtonArg floatingActionButtonArg;
    private BackGroundColorArg backGroundColorArg;

    //---------------------------    Setters & Getters     -------------------------------

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public DrawerArg getDrawerArg() {
        return drawerArg;
    }

    public void setDrawerArg(DrawerArg drawerArg) {
        this.drawerArg = drawerArg;
    }

    public AppBarArg getAppBarArg() {
        return appBarArg;
    }

    public void setAppBarArg(AppBarArg appBarArg) {
        this.appBarArg = appBarArg;
    }

    public BottomNavigationBarArg getBottomNavigationBarArg() {
        return bottomNavigationBarArg;
    }

    public void setBottomNavigationBarArg(BottomNavigationBarArg bottomNavigationBarArg) {
        this.bottomNavigationBarArg = bottomNavigationBarArg;
    }

    public FloatingActionButtonArg getFloatingActionButtonArg() {
        return floatingActionButtonArg;
    }

    public void setFloatingActionButtonArg(FloatingActionButtonArg floatingActionButtonArg) {
        this.floatingActionButtonArg = floatingActionButtonArg;
    }

    public BackGroundColorArg getBackGroundColorArg() {
        return backGroundColorArg;
    }

    public void setBackGroundColorArg(BackGroundColorArg backGroundColorArg) {
        this.backGroundColorArg = backGroundColorArg;
    }

    //---------------------------    ToString Func     -------------------------------
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScaffoldArgs\n");
        sb.append("Body: ").append(body != null ? body.toString() : "null").append("\n");
        sb.append("DrawerArg: ").append(drawerArg != null ? drawerArg.toString() : "null").append("\n");
        sb.append("AppBarArg: ").append(appBarArg != null ? appBarArg.toString() : "null").append("\n");
        sb.append("BottomNavigationBarArg: ").append(bottomNavigationBarArg != null ? bottomNavigationBarArg.toString() : "null").append("\n");
        sb.append("FloatingActionButtonArg: ").append(floatingActionButtonArg != null ? floatingActionButtonArg.toString() : "null").append("\n");
        sb.append("BackGroundColorArg: ").append(backGroundColorArg != null ? backGroundColorArg.toString() : "null").append("\n");

        return sb.toString();
    }
}
