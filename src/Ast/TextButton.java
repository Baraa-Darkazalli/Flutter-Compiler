package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class TextButton extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<TextButtonArgs> textButtonArgs;

    //---------------------------    Constructor     -------------------------------
    public TextButton() {
        this.textButtonArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<TextButtonArgs> getTextButtonArgs() {
        return textButtonArgs;
    }

    public void setTextButtonArgs(List<TextButtonArgs> textButtonArgs) {
        this.textButtonArgs = textButtonArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "TextButton{" +
                "textButtonArgs=" + textButtonArgs +
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
