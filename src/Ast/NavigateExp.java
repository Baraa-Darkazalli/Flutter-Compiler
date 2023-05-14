package Ast;

public class NavigateExp {
    //---------------------------    Attributes     -------------------------------
    private Transtion transtion;

    //---------------------------    Setters & Getters     -------------------------------
    public Transtion getTranstion() {
        return transtion;
    }

    public void setTranstion(Transtion transtion) {
        this.transtion = transtion;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "NavigateExp{" +
                "transtion=" + transtion +
                '}';
    }
}
