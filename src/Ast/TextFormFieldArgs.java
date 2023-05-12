package Ast;

public class TextFormFieldArgs {
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
        return "TextFormFieldArgs{" +
                "style=" + style +
                '}';
    }
}
