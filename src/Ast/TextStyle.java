package Ast;

import java.util.ArrayList;
import java.util.List;

public class TextStyle {
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
}
