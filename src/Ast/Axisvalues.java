package Ast;

public class Axisvalues {
    //---------------------------    Attributes     -------------------------------
    private String value;

    //---------------------------    Setters & Getters     -------------------------------
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Axisvalues{" +
                "value='" + value + '\'' +
                '}';
    }
}
