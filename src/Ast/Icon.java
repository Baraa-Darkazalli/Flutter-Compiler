package Ast;

import java.util.ArrayList;
import java.util.List;

public class Icon {
    //---------------------------    Attributes     -------------------------------
    private List<IconArgs> iconArgs;

    //---------------------------    Constructor     -------------------------------
    public Icon() {
        this.iconArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<IconArgs> getIconArgs() {
        return iconArgs;
    }

    public void setIconArgs(List<IconArgs> iconArgs) {
        this.iconArgs = iconArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Icon{" +
                "iconArgs=" + iconArgs +
                '}';
    }
}
