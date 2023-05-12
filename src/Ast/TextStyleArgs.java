package Ast;

public class TextStyleArgs {
    //---------------------------    Attributes     -------------------------------
    private BackGroundColor backGroundColor;
    private Color color;
    private FontSize fontSize;

    //---------------------------    Setters & Getters     -------------------------------
    public BackGroundColor getBackGroundColor() {
        return backGroundColor;
    }

    public void setBackGroundColor(BackGroundColor backGroundColor) {
        this.backGroundColor = backGroundColor;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public FontSize getFontSize() {
        return fontSize;
    }

    public void setFontSize(FontSize fontSize) {
        this.fontSize = fontSize;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "TextStyleArgs{" +
                "backGroundColor=" + backGroundColor +
                ", color=" + color +
                ", fontSize=" + fontSize +
                '}';
    }
}
