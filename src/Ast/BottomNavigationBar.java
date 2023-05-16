package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class BottomNavigationBar extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<BottomNavigationBarArgs> bottomNavigationBarArgs;

    //---------------------------    Constructor     -------------------------------
    public BottomNavigationBar() {
        this.bottomNavigationBarArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<BottomNavigationBarArgs> getBottomNavigationBarArgs() {
        return bottomNavigationBarArgs;
    }

    public void setBottomNavigationBarArgs(List<BottomNavigationBarArgs> bottomNavigationBarArgs) {
        this.bottomNavigationBarArgs = bottomNavigationBarArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "BottomNavigationBar{" +
                "bottomNavigationBarArgs=" + bottomNavigationBarArgs +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        return "";
    }
}
