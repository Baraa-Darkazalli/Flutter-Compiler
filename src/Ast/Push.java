package Ast;

public class Push {
    //---------------------------    Attributes     -------------------------------
    private Constructor constructor;

    //---------------------------    Setters & Getters     -------------------------------
    public Constructor getConstructor() {
        return constructor;
    }

    public void setConstructor(Constructor constructor) {
        this.constructor = constructor;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Push{" +
                "constructor=" + constructor +
                '}';
    }
}
