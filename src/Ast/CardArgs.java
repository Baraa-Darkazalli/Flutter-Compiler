package Ast;

public class CardArgs {
    //---------------------------    Attributes     -------------------------------
    private Color color;
    private Margin margin;
    private Child child;

    //---------------------------    Setters & Getters     -------------------------------
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

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "CardArgs{" +
                "color=" + color +
                ", margin=" + margin +
                ", child=" + child +
                '}';
    }
}
