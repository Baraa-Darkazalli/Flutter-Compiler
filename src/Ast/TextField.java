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


        sb.append("<input type=\"text\" class=\"form-control\" ");//no "\n"

        if(textFieldArgs != null && !textFieldArgs.isEmpty())
        {
                for(TextFieldArgs textFieldArg:textFieldArgs)
                {
                    sb.append(textFieldArg.generateStyleCode());
                }
        }

        sb.append(" >\n");

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
