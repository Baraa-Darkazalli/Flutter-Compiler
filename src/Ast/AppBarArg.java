package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class AppBarArg extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<AppBarArgs> appBarArgs;

    //---------------------------    Constructor     -------------------------------
    public AppBarArg() {
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
        return "AppBarArg{" +
                "appBarArgs=" + appBarArgs +
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
