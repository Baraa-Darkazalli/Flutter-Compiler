package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class Icon extends HtmlElement {
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

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if(iconArgs != null && !iconArgs.isEmpty())
        {
            sb.append("<svg xmlns=\"http://www.w3.org/2000/svg\"" ); // no "\n"
            for (IconArgs iconArg:iconArgs)
            {
                sb.append(iconArg.generateHtmlAttribute());
            }
            sb.append(" class=\"bi bi-arrow-left\" viewBox=\"0 0 16 16\">\n");
            for (IconArgs iconArg:iconArgs)
            {
                sb.append(iconArg.generateHtmlCode());
            }
            sb.append("</svg>"); // no "\n"
        }

        return  sb.toString();
    }
}
