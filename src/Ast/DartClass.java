package Ast;

import Ast.Classes.HtmlElement;

import java.util.List;

public class DartClass extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<ClassArgs> classArgs;

    //---------------------------    Setters & Getters     -------------------------------
    public List<ClassArgs> getClassArgs() {
        return classArgs;
    }

    public void setClassArgs(List<ClassArgs> classArgs) {
        this.classArgs = classArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "DartClass{" +
                "classArgs=" + classArgs +
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
