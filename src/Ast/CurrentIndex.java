package Ast;

public class CurrentIndex {
    //---------------------------    Attributes     -------------------------------
    private int value;

    //---------------------------    Setters & Getters     -------------------------------
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "CurrentIndex{" +
                "value=" + value +
                '}';
    }
}
