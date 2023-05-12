package Ast;

public class Style {
    //---------------------------    Attributes     -------------------------------
    private TextStyle textStyle;

    //---------------------------    Setters & Getters     -------------------------------
    public TextStyle getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Style{" +
                "textStyle=" + textStyle +
                '}';
    }
}
