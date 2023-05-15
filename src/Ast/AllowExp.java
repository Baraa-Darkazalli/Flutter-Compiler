package Ast;

import Ast.Classes.HtmlElement;

public class AllowExp extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private NavigateExp navigateExp;
    private RunAppExp runAppExp;

    //---------------------------    Setters & Getters     -------------------------------
    public NavigateExp getNavigateExp() {
        return navigateExp;
    }

    public void setNavigateExp(NavigateExp navigateExp) {
        this.navigateExp = navigateExp;
    }

    public RunAppExp getRunAppExp() {
        return runAppExp;
    }

    public void setRunAppExp(RunAppExp runAppExp) {
        this.runAppExp = runAppExp;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "AllowExp{" +
                "navigateExp=" + navigateExp +
                ", runAppExp=" + runAppExp +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return null;
    }

    @Override
    public String generateHtmlCode() {
        return null;
    }
}
