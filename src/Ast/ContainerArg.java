package Ast;

public class ContainerArg {
    //---------------------------    Attributes     -------------------------------
    private Child child;
    private Width width;
    private Height height;
    private Color color;
    private Margin margin;
    private Padding padding;

    //---------------------------    Setters & Getters     -------------------------------
    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public Width getWidth() {
        return width;
    }

    public void setWidth(Width width) {
        this.width = width;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Margin getMargin() {
        return margin;
    }

    public void setMargin(Margin margin) {
        this.margin = margin;
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
        return "ContainerArg{" +
                "child=" + child +
                ", width=" + width +
                ", height=" + height +
                ", color=" + color +
                ", margin=" + margin +
                ", padding=" + padding +
                '}';
    }
}
