package Ast;

import Ast.Classes.HtmlElement;

public class ImageArg extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private String value;
    private String variableName;

    //---------------------------    Setters & Getters     -------------------------------
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public String toString() {
        return "ImageArg{" +
                "value='" + value + '\'' +
                ", variableName='" + variableName + '\'' +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        StringBuilder sb = new StringBuilder();

        if(value != null)
        {
            sb.append(" src=").append(value); // not "\n"
        }
        else if(variableName != null)
        {
            int index = this.getIndexForParam(variableName);
            if(index != -1)
            {
                sb.append(" id=\"param").append(index+1).append("\""); // not "\n"
            }
        }

        return sb.toString();
    }

    @Override
    public String generateScriptCode() {
        StringBuilder sb = new StringBuilder();

        if(variableName != null)
        {
            sb.append("<script>\n");
            int index = this.getIndexForParam(variableName);
            if(index != -1)
            {
                sb.append("document.getElementById(\"param").append(index+1).append("\"").append(").src = values[").append(index+1).append("];\n");
            }
            sb.append("</script>\n");
        }

        return sb.toString();
    }
}
