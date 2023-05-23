package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class InkWell extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<InkWellArgs> inkWellArgs;

    //---------------------------    Constructor     -------------------------------
    public InkWell() {
        this.inkWellArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<InkWellArgs> getInkWellArgs() {
        return inkWellArgs;
    }

    public void setInkWellArgs(List<InkWellArgs> inkWellArgs) {
        this.inkWellArgs = inkWellArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "InkWell{" +
                "inkWellArgs=" + inkWellArgs +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if(inkWellArgs != null && !inkWellArgs.isEmpty())
        {
            sb.append("<div class=\"inkWell\" "); // no "\n"
            for (InkWellArgs inkWellArg:inkWellArgs)
            {
                sb.append(inkWellArg.generateHtmlAttribute());
            }
            sb.append(" >\n");
            for (InkWellArgs inkWellArg:inkWellArgs)
            {
                sb.append(inkWellArg.generateHtmlCode());
            }
            sb.append("</div>\n");
        }

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
