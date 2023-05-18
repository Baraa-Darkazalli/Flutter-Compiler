package Ast;

import Ast.Classes.HtmlElement;

public class ScaffoldArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Body body;
    private DrawerArg drawerArg;
    private AppBarArg appBarArg;
    private BottomNavigationBarArg bottomNavigationBarArg;
    private FloatingActionButtonArg floatingActionButtonArg;
    private BackGroundColor backGroundColor;

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

    public BackGroundColor getBackGroundColor() {
        return backGroundColor;
    }

    public void setBackGroundColor(BackGroundColor backGroundColor) {
        this.backGroundColor = backGroundColor;
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
        sb.append("BackGroundColor: ").append(backGroundColor != null ? backGroundColor.toString() : "null").append("\n");

        return sb.toString();
    }

    @Override
    public String generateHtmlAttribute() {
       return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if (body != null) {
            sb.append("<main>\n");
            sb.append(body.generateHtmlCode());
            sb.append("</main>\n");
        }
        else if (drawerArg != null) {
            sb.append(drawerArg.generateHtmlCode());
        }
        else if (appBarArg != null) {
            sb.append("<header>\n");
            sb.append(appBarArg.generateHtmlCode());
            sb.append("</header>\n");
        }
        else if (bottomNavigationBarArg != null) {
            sb.append("<nav>\n");
            sb.append(bottomNavigationBarArg.generateHtmlCode());
            sb.append("</nav>\n");
        }
        else if (floatingActionButtonArg != null) {
            sb.append(floatingActionButtonArg.generateHtmlCode());
        }
        else if (backGroundColor != null) {
            sb.append("<style>\n");
            sb.append("  html {\n");
            sb.append("    background-color: ").append(backGroundColor.generateStyleCode()).append(";\n");
            sb.append("  }\n");
            sb.append("</style>\n");
        }

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
