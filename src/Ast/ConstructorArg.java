package Ast;

import Ast.Classes.HtmlElement;

public class ConstructorArg extends HtmlElement {
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
        return "ConstructorArg{" +
                "DataType='" + DataType + '\'' +
                ", AttributeName='" + AttributeName + '\'' +
                '}';
    }

    @Override
    public String generateHtmlCode() {
        if(AttributeName != null)
        {
            this.queryStringArgs.add(AttributeName);
        }
        return super.generateHtmlCode();
    }

}
