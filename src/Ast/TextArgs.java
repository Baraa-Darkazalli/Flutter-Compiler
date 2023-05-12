package Ast;

public class TextArgs {
    //---------------------------    Attributes     -------------------------------
    private Style style;

    //---------------------------    Setters & Getters     -------------------------------
    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "TextArgs{" +
                "style=" + style +
                '}';
    }
}
