package Ast;

import Ast.Classes.HtmlElement;

import java.util.List;

public class DartClass extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private String ClassName;

    private List<ClassBody> classBody;

    //---------------------------    Setters & Getters     -------------------------------
    public List<ClassBody> getClassBody() {
        return classBody;
    }

    public void setClassBody(List<ClassBody> classBody) {
        this.classBody = classBody;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "DartClass{" +
                "classBody=" + classBody +
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
