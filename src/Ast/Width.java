package Ast;

public class Width {
    //---------------------------    Attributes     -------------------------------
    private double value;

    //---------------------------    Setters & Getters     -------------------------------
    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Width{" +
                "value=" + value +
                '}';
    }
}
