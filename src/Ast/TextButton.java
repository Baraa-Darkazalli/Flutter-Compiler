package Ast;

import java.util.ArrayList;
import java.util.List;

public class TextButton {
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
}
