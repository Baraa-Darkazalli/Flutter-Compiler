package Ast;

import Ast.Classes.HtmlElement;

import java.util.List;

public class Constructor extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private
    private List<ConstructorArg> constructorArgs;

    //---------------------------    Setters & Getters     -------------------------------
    public List<ConstructorArg> getConstructorArgs() {
        return constructorArgs;
    }

    public void setConstructorArgs(List<ConstructorArg> constructorArgs) {
        this.constructorArgs = constructorArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Constructor{" +
                "constructorArgs=" + constructorArgs +
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
