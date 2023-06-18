package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class Text extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<TextArgs> textArgsList;

    //---------------------------    Constructor     -------------------------------
    public Text() {
        this.textArgsList = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<TextArgs> getTextArgs() {
        return textArgsList;
    }

    public void setTextArgs(List<TextArgs> textArgsList) {
        this.textArgsList = textArgsList;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Text{" +
                "textArgsList=" + textArgsList +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();


        if(textArgsList != null && !textArgsList.isEmpty())
        {
            sb.append("<p");// no "\n"
            for(TextArgs textArg:textArgsList)
            {
                sb.append(textArg.generateHtmlAttribute());
            }
            sb.append(">\n");
            for(TextArgs textArg:textArgsList)
            {
                sb.append(textArg.generateHtmlCode());
            }
            sb.append("</p>\n");
            for(TextArgs textArg:textArgsList)
            {
                sb.append(textArg.generateScriptCode());
            }
        }

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
