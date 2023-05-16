package Ast;

import Ast.Classes.HtmlElement;

import java.util.List;

public class FloatingActionButton extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<FloatingActionButtonArgs> floatingActionButtonArgs;

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

        sb.append("<style>\n");
        sb.append("  .floating-action-button {\n");
        sb.append("    position: fixed;\n");
        sb.append("    bottom: 20px;\n");
        sb.append("    right: 20px;\n");
        sb.append("    background-color: blue;\n");
        sb.append("    color: #FFFFFF;\n");
        sb.append("    border-radius: 50%;\n");
        sb.append("    width: 56px;\n");
        sb.append("    height: 56px;\n");
        sb.append("    text-align: center;\n");
        sb.append("    line-height: 56px;\n");
        sb.append("    font-size: 24px;\n");
        sb.append("  }\n");
        sb.append("</style>\n");

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
