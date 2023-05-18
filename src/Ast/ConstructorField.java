package Ast;

import Ast.Classes.HtmlElement;

public class ConstructorField extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private String string;
    private double value;

    //---------------------------    Setters & Getters     -------------------------------


    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "ConstructorField{" +
                "string=" + string +
                ", value=" + value +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        StringBuilder sb = new StringBuilder();

        if(string != null)
        {
            sb.append(", \'").append(string).append("\'"); // no "\n"
        }
        else
        {
            sb.append(", ").append(value); // no "\n"
        }
        return sb.toString();
    }

    @Override
    public String generateHtmlCode() {
        return "";
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
