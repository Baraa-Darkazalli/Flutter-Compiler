package Ast;

public class FloatingActionButtonArg {
    //---------------------------    Attributes     -------------------------------
    private FloatingActionButton floatingActionButton;

    //---------------------------    Setters & Getters     -------------------------------
    public FloatingActionButton getFloatingActionButton() {
        return floatingActionButton;
    }

    public void setFloatingActionButton(FloatingActionButton floatingActionButton) {
        this.floatingActionButton = floatingActionButton;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "FloatingActionButtonArg{" +
                "floatingActionButton=" + floatingActionButton +
                '}';
    }
}
