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
        return null;
    }

    @Override
    public String generateHtmlCode() {
        return null;
    }
}
