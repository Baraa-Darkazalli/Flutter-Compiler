package Ast;

public class IconButtonArgs {
    //---------------------------    Attributes     -------------------------------
    private IconArg iconArg;
    private Color color;
    private Padding padding;

    //---------------------------    Setters & Getters     ------------------------------
    public IconArg getIconArg() {
        return iconArg;
    }

    public void setIconArg(IconArg iconArg) {
        this.iconArg = iconArg;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Padding getPadding() {
        return padding;
    }

    public void setPadding(Padding padding) {
        this.padding = padding;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "IconButtonArgs{" +
                "iconArg=" + iconArg +
                ", color=" + color +
                ", padding=" + padding +
                '}';
    }
}
