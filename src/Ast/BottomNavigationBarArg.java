package Ast;

public class BottomNavigationBarArg {
    //---------------------------    Attributes     -------------------------------
    private BottomNavigationBar bottomNavigationBar;

    //---------------------------    Setters & Getters     -------------------------------
    public BottomNavigationBar getBottomNavigationBar() {
        return bottomNavigationBar;
    }

    public void setBottomNavigationBar(BottomNavigationBar bottomNavigationBar) {
        this.bottomNavigationBar = bottomNavigationBar;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "BottomNavigationBarArg{" +
                "bottomNavigationBar=" + bottomNavigationBar +
                '}';
    }
}
