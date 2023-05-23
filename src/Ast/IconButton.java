package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class IconButton extends HtmlElement {
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

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if(iconButtonArgs != null && !iconButtonArgs.isEmpty())
        {
            for(IconButtonArgs iconButtonArg:iconButtonArgs)
            {
                sb.append(iconButtonArg.generateHtmlCode());
            }
        }

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
