package Ast;

import Ast.Classes.HtmlElement;

public class BuildFunctionDeclaration extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private BuildBody buildBody;

    //---------------------------    Setters & Getters     -------------------------------
    public BuildBody getBuildBody() {
        return buildBody;
    }

    public void setBuildBody(BuildBody buildBody) {
        this.buildBody = buildBody;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "BuildFunctionDeclaration{" +
                "buildBody=" + buildBody +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        sb.append("");

        if (buildBody != null)
        {
            sb.append(buildBody.generateHtmlCode());
        }

        return sb.toString();
    }
}
