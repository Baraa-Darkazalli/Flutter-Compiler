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
        StringBuilder sb = new StringBuilder();

        sb.append(" id=\"").append(ClassName).append("\" ");

        return sb.toString();
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        sb.append("");

        if (classBody != null && !classBody.isEmpty())
        {
            for (ClassBody classBody : classBody)
            {
                sb.append(classBody.generateHtmlCode());
            }
        }

        return sb.toString();
    }
}