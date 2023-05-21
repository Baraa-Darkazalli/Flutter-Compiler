package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class AppBar extends HtmlElement {
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

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if(appBarArgs != null && !appBarArgs.isEmpty())
        {
            for (AppBarArgs appBarArg:appBarArgs)
            {
                sb.append(appBarArg.generateHtmlCode());
            }
        }

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
