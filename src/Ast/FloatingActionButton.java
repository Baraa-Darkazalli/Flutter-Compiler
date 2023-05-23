package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class FloatingActionButton extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<FloatingActionButtonArgs> floatingActionButtonArgs;

    //---------------------------    Constructor     -------------------------------
    public FloatingActionButton() {
        this.floatingActionButtonArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<FloatingActionButtonArgs> getFloatingActionButtonArgs() {
        return floatingActionButtonArgs;
    }

    public void setFloatingActionButtonArgs(List<FloatingActionButtonArgs> floatingActionButtonArgs) {
        this.floatingActionButtonArgs = floatingActionButtonArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "FloatingActionButton{" +
                "floatingActionButtonArgs=" + floatingActionButtonArgs +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        sb.append("<div class=\"floating-action-button\">\n");
        if(floatingActionButtonArgs != null && !floatingActionButtonArgs.isEmpty())
        {
            for(FloatingActionButtonArgs floatingActionButtonArg:floatingActionButtonArgs)
            {
                sb.append(floatingActionButtonArg.generateHtmlCode());
            }
        }
        else
        {
            sb.append("+");
        }
        sb.append("</div>\n");

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
