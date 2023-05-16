package Ast;

import Ast.Classes.HtmlElement;

public class ClassArg extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private String DataType;
    private String AttributeName;

    //---------------------------    Setters & Getters     -------------------------------
    public String getDataType() {
        return DataType;
    }

    public void setDataType(String dataType) {
        DataType = dataType;
    }

    public String getAttributeName() {
        return AttributeName;
    }

    public void setAttributeName(String attributeName) {
        AttributeName = attributeName;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "ClassArg{" +
                "DataType='" + DataType + '\'' +
                ", AttributeName='" + AttributeName + '\'' +
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
