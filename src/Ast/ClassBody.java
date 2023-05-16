package Ast;

import Ast.Classes.HtmlElement;

public class ClassBody extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private ClassArg classArg;
    private ConstructorDeclaration constructorDeclaration;
    private BuildFunctionDeclaration buildFunctionDeclaration;

    //---------------------------    Setters & Getters     -------------------------------
    public ClassArg getClassArg() {
        return classArg;
    }

    public void setClassArg(ClassArg classArg) {
        this.classArg = classArg;
    }

    public ConstructorDeclaration getConstructorDeclaration() {
        return constructorDeclaration;
    }

    public void setConstructorDeclaration(ConstructorDeclaration constructorDeclaration) {
        this.constructorDeclaration = constructorDeclaration;
    }

    public BuildFunctionDeclaration getBuildFunctionDeclaration() {
        return buildFunctionDeclaration;
    }

    public void setBuildFunctionDeclaration(BuildFunctionDeclaration buildFunctionDeclaration) {
        this.buildFunctionDeclaration = buildFunctionDeclaration;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "ClassBody{" +
                "classArg=" + classArg +
                ", constructorDeclaration=" + constructorDeclaration +
                ", buildFunctionDeclaration=" + buildFunctionDeclaration +
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

        if (buildFunctionDeclaration != null)
        {
            sb.append(buildFunctionDeclaration.generateHtmlCode());
        }

        return sb.toString();
    }
}
