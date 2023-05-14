package Ast;

public class Transtion {
    //---------------------------    Attributes     -------------------------------
    private Push push;
    private Pop pop;

    //---------------------------    Setters & Getters     -------------------------------
    public Push getPush() {
        return push;
    }

    public void setPush(Push push) {
        this.push = push;
    }

    public Pop getPop() {
        return pop;
    }

    public void setPop(Pop pop) {
        this.pop = pop;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Transtion{" +
                "push=" + push +
                ", pop=" + pop +
                '}';
    }
}
