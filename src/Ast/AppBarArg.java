package Ast;

import Ast.Classes.HtmlElement;

public class AppBarArg extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private AppBar appBar;

    //---------------------------    Setters & Getters     -------------------------------
    public AppBar getAppBar() {
        return appBar;
    }

    public void setAppBar(AppBar appBar) {
        this.appBar = appBar;
    }

    //---------------------------    ToString Func     -------------------------------
    @Override
    public String toString() {
        return "AppBarArg{" +
                "appBar=" + appBar +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        sb.append(appBar.generateHtmlCode());

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return  "";
    }
}