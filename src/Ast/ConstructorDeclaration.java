package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class ConstructorDeclaration extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private String ClassName;
    private List<ConstructorArg> constructorArgs;

    //---------------------------    Constructor     -------------------------------
    public ConstructorDeclaration()
    {
        this.constructorArgs=new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String dataType) {
        ClassName = dataType;
    }

    public List<ConstructorArg> getConstructorArgs() {
        return constructorArgs;
    }

    public void setConstructorArgs(List<ConstructorArg> constructorArgs) {
        this.constructorArgs = constructorArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "ConstructorDeclaration{" +
                "ClassName='" + ClassName + '\'' +
                ", constructorArgs=" + constructorArgs +
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
