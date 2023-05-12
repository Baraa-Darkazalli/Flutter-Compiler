package Ast;

public class Colors {
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
        return "Colors{" +
                "color='" + color + '\'' +
                '}';
    }
}