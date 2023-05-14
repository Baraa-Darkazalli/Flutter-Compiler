package Ast;

public class Expression {
    //---------------------------    Attributes     -------------------------------
    private AllowExp allowExp;

    //---------------------------    Setters & Getters     -------------------------------
    public AllowExp getAllowExp() {
        return allowExp;
    }

    public void setAllowExp(AllowExp allowExp) {
        this.allowExp = allowExp;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Expression{" +
                "allowExp=" + allowExp +
                '}';
    }
}
