package Ast;

import java.util.ArrayList;
import java.util.List;

public class TextFormField {
    //---------------------------    Attributes     -------------------------------
    private List<TextFormFieldArgs> textFormFieldArgs;

    //---------------------------    Constructor     -------------------------------
    public TextFormField() {
        this.textFormFieldArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<TextFormFieldArgs> getTextFormFieldArgs() {
        return textFormFieldArgs;
    }

    public void setTextFormFieldArgs(List<TextFormFieldArgs> textFormFieldArgs) {
        this.textFormFieldArgs = textFormFieldArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "TextFormField{" +
                "textFormFieldArgs=" + textFormFieldArgs +
                '}';
    }
}
