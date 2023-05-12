package Ast;

public class SliderArgs {
    //---------------------------    Attributes     -------------------------------
    private Min min;
    private Max max;

    //---------------------------    Setters & Getters     -------------------------------
    public Min getMin() {
        return min;
    }

    public void setMin(Min min) {
        this.min = min;
    }

    public Max getMax() {
        return max;
    }

    public void setMax(Max max) {
        this.max = max;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "SliderArgs{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }
}
