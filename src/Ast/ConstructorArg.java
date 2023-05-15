package Ast;

import Ast.Classes.HtmlElement;

public class ConstructorArg extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private String dataType;
    private String  attributeName;

    //---------------------------    Setters & Getters     -------------------------------
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "ConstructorArg{" +
                "dataType=" + dataType +
                ", attributeName=" + attributeName +
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
