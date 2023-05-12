package Ast;

public class Padding {
    //---------------------------    Attributes     -------------------------------
    private double value;

    //---------------------------    Setters & Getters     -------------------------------
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Padding{" +
                "value=" + value +
                '}';
    }
}
