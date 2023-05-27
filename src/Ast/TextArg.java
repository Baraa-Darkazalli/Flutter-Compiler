package Ast;

import Ast.Classes.HtmlElement;

public class TextArg extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private String string;

    private String variableName;

    //---------------------------    Setters & Getters     -------------------------------
    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    //---------------------------    Override Func     -------------------------------

    @Override
    public String toString() {
        return "TextArg{" +
                "string='" + string + '\'' +
                ", variableName='" + variableName + '\'' +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        StringBuilder sb = new StringBuilder();

        if(variableName != null)
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
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if(string != null)
        {
            sb.append(string.replaceAll("\'|\"",""));
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
                sb.append("document.getElementById(\"param").append(index+1).append("\"").append(").textContent = values[").append(index+1).append("];\n");
            }
            sb.append("</script>\n");
        }

        return sb.toString();
    }
}
