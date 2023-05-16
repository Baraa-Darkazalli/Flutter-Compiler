package Ast;

import Ast.Classes.HtmlElement;

public class BottomNavigationBarArg extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private BottomNavigationBar bottomNavigationBar;

    //---------------------------    Setters & Getters     -------------------------------
    public BottomNavigationBar getBottomNavigationBar() {
        return bottomNavigationBar;
    }

    public void setBottomNavigationBar(BottomNavigationBar bottomNavigationBar) {
        this.bottomNavigationBar = bottomNavigationBar;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "BottomNavigationBarArg{" +
                "bottomNavigationBar=" + bottomNavigationBar +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        sb.append(bottomNavigationBar.generateHtmlCode());

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
