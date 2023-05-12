package Ast;

import java.util.ArrayList;
import java.util.List;

public class IconButton {
    //---------------------------    Attributes     -------------------------------
    private List<IconButtonArgs> iconButtonArgs;

    //---------------------------    Constructor     -------------------------------
    public IconButton() {
        this.iconButtonArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<IconButtonArgs> getIconButtonArgs() {
        return iconButtonArgs;
    }

    public void setIconButtonArgs(List<IconButtonArgs> iconButtonArgs) {
        this.iconButtonArgs = iconButtonArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "IconButton{" +
                "iconButtonArgs=" + iconButtonArgs +
                '}';
    }
}
