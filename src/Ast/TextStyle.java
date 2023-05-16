package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class TextStyle extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<TextStyleArgs> textStyleArgs;

    //---------------------------    Constructor     -------------------------------
    public TextStyle() {
        this.textStyleArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<TextStyleArgs> getTextStyleArgs() {
        return textStyleArgs;
    }

    public void setTextStyleArgs(List<TextStyleArgs> textStyleArgs) {
        this.textStyleArgs = textStyleArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "TextStyle{" +
                "textStyleArgs=" + textStyleArgs +
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

    @Override
    public String generateStyleCode() {
        StringBuilder sb = new StringBuilder();

        if(textStyleArgs != null && !textStyleArgs.isEmpty())
        {
            for(TextStyleArgs textStyleArg:textStyleArgs)
            {
                sb.append(textStyleArg.generateStyleCode());
            }
        }

        return sb.toString();
    }
}
