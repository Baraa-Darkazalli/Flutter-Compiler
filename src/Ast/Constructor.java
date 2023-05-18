package Ast;

import Ast.Classes.HtmlElement;

import java.util.List;

public class Constructor extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private String identifier;
    private List<ConstructorField> constructorFields;

    //---------------------------    Setters & Getters     -------------------------------

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public List<ConstructorField> getConstructorFields() {
        return constructorFields;
    }

    public void setConstructorFields(List<ConstructorField> constructorFields) {
        this.constructorFields = constructorFields;
    }

    @Override
    public String toString() {
        return "Constructor{" +
                "identifier=" + identifier +
                ", constructorFields=" + constructorFields +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        StringBuilder sb = new StringBuilder();

        sb.append("\'").append(identifier).append("\' "); // no "\n"
        if(constructorFields != null && !constructorFields.isEmpty())
        {
            for (ConstructorField constructorField:constructorFields)
            {
                sb.append(constructorField.generateHtmlAttribute());
            }
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
