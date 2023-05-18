package Ast;

import Ast.Classes.HtmlElement;

public class Transtion extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private Push push;
    private boolean pop; //#ignore from Code Genration

    //---------------------------    Setters & Getters     -------------------------------
    public Push getPush() {
        return push;
    }

    public void setPush(Push push) {
        this.push = push;
    }

    public boolean getPop() {
        return pop;
    }

    public void setPop(boolean pop) {
        this.pop = pop;
    }


    //---------------------------    Override Func     -------------------------------


    @Override
    public String toString() {
        return "Transtion{" +
                "push=" + push +
                ", pop=" + pop +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        StringBuilder sb = new StringBuilder();

        if(push != null)
        {
            sb.append(push.generateHtmlAttribute());
        }

        return sb.toString();
    }

    @Override
    public String generateHtmlCode() {
        return "";
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
