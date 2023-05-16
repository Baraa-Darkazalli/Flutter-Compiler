package Ast;

import Ast.Classes.HtmlElement;

import java.util.List;

public class DartClass extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private String className;

    private List<ClassBody> classBody;

    //---------------------------    Setters & Getters     -------------------------------
    public List<ClassBody> getClassBody() {
        return classBody;
    }

    public void setClassBody(List<ClassBody> classBody) {
        this.classBody = classBody;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "DartClass{" +
                "className='" + className + '\'' +
                ", classBody=" + classBody +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        StringBuilder sb = new StringBuilder();

        sb.append(" id=\"").append(className).append("\" ");

        return sb.toString();
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if (classBody != null && !classBody.isEmpty())
        {
            for (ClassBody classBody : classBody)
            {
                sb.append(classBody.generateHtmlCode());
            }
        }

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
