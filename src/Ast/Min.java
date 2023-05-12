package Ast;

public class Min {
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
        return "Min{" +
                "value=" + value +
                '}';
    }
}
