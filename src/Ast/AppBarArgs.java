package Ast;

import Ast.Classes.HtmlElement;

public class AppBarArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Title title;
    private Leading leading;
    private Actions actions;
    private BackGroundColor backGroundColor;

    //---------------------------    Setters & Getters     -------------------------------
    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Leading getLeading() {
        return leading;
    }

    public void setLeading(Leading leading) {
        this.leading = leading;
    }

    public Actions getActions() {
        return actions;
    }

    public void setActions(Actions actions) {
        this.actions = actions;
    }

    public BackGroundColor getBackGroundColor() {
        return backGroundColor;
    }

    public void setBackGroundColor(BackGroundColor backGroundColor) {
        this.backGroundColor = backGroundColor;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "AppBarArgs{" +
                "title=" + title +
                ", leading=" + leading +
                ", actions=" + actions +
                ", backGroundColor=" + backGroundColor +
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
