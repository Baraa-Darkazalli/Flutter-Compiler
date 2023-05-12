package Ast;

public class Color {
    //---------------------------    Attributes     -------------------------------
    private String color;

    //---------------------------    Setters & Getters     -------------------------------
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Color{" +
                "color='" + color + '\'' +
                '}';
    }
}