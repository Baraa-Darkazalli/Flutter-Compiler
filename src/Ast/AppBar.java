package Ast;

import java.util.ArrayList;

public class AppBar {
    //---------------------------    Attributes     -------------------------------
    private List<AppBarArgs> appBarArgs;

    //---------------------------    Constructor     -------------------------------
    public AppBar() {
        this.appBarArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<AppBarArgs> getAppBarArgs() {
        return appBarArgs;
    }

    public void setAppBarArgs(List<AppBarArgs> appBarArgs) {
        this.appBarArgs = appBarArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "AppBar{" +
                "appBarArgs=" + appBarArgs +
                '}';
    }
}
