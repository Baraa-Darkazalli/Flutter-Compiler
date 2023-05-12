package Ast;

public class BackGroundColor {
    //---------------------------    Attributes     -------------------------------
    private Colors colors;

    //---------------------------    Setters & Getters     -------------------------------
    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "BackGroundColor{" +
                "colors=" + colors +
                '}';
    }
}
