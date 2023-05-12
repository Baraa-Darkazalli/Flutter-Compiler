package Ast;

import java.util.ArrayList;
import java.util.List;

public class Text {
    //---------------------------    Attributes     -------------------------------
    List<TextArgs> textArgs;

    //---------------------------    Constructor     -------------------------------
    public Text() {
        this.textArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<TextArgs> getTextArgs() {
        return textArgs;
    }

    public void setTextArgs(List<TextArgs> textArgs) {
        this.textArgs = textArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Text{" +
                "textArgs=" + textArgs +
                '}';
    }
}
