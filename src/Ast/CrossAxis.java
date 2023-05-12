package Ast;

public class CrossAxis {
    //---------------------------    Attributes     -------------------------------
    private Axisvalues axisvalues;

    //---------------------------    Setters & Getters     -------------------------------
    public Axisvalues getAxisvalues() {
        return axisvalues;
    }

    public void setAxisvalues(Axisvalues axisvalues) {
        this.axisvalues = axisvalues;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "CrossAxis{" +
                "axisvalues=" + axisvalues +
                '}';
    }
}
