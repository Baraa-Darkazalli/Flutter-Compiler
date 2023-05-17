package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class TextField extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<TextFieldArgs> textFieldArgs;

    //---------------------------    Constructor     -------------------------------
    public TextField() {
        this.textFieldArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<TextFieldArgs> getTextFieldArgs() {
        return textFieldArgs;
    }

    public void setTextFieldArgs(List<TextFieldArgs> textFieldArgs) {
        this.textFieldArgs = textFieldArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "TextField{" +
                "textFieldArgs=" + textFieldArgs +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if(textFieldArgs != null && !textFieldArgs.isEmpty())
        {
            sb.append("<div class=\"form-group\">\n");
            sb.append("<input type=\"text\">\n");
            sb.append("</div>\n");
                for(TextFieldArgs textFieldArg:textFieldArgs)
                {
                    sb.append("<style>\n");
                    sb.append("  input{\n");
                    sb.append(textFieldArg.generateStyleCode());
                    sb.append("  }\n");
                    sb.append("</style>\n");
                }
        }

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return null;
    }
}
