package Ast;

import Ast.Classes.HtmlElement;

public class BottomNavigationBarArgs extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Items items;
    private BackGroundColor backGroundColor;
    private CurrentIndex currentIndex;

    //---------------------------    Setters & Getters     -------------------------------
    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public BackGroundColor getBackGroundColor() {
        return backGroundColor;
    }

    public void setBackGroundColor(BackGroundColor backGroundColor) {
        this.backGroundColor = backGroundColor;
    }

    public CurrentIndex getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(CurrentIndex currentIndex) {
        this.currentIndex = currentIndex;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "BottomNavigationBarArgs{" +
                "items=" + items +
                ", backGroundColor=" + backGroundColor +
                ", currentIndex=" + currentIndex +
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
