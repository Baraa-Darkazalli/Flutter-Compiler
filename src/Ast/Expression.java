package Ast;

import Ast.Classes.HtmlElement;

public class Expression extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private AllowExp allowExp;

    //---------------------------    Setters & Getters     -------------------------------
    public AllowExp getAllowExp() {
        return allowExp;
    }

    public void setAllowExp(AllowExp allowExp) {
        this.allowExp = allowExp;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Expression{" +
                "allowExp=" + allowExp +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        return "";
    }
}
