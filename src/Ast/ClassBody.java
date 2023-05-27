package Ast;

import Ast.Classes.HtmlElement;

public class ClassBody extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private ClassArg classArg; //#ignore from Code Generation
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

        if (buildFunctionDeclaration != null)
        {
            sb.append(buildFunctionDeclaration.generateHtmlCode());
        }
        else if(constructorDeclaration != null)
        {
            sb.append(constructorDeclaration.generateHtmlCode());
        }

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
