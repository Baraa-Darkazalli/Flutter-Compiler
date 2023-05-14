package Ast;

import java.util.ArrayList;
import java.util.List;

public class Text {
    //---------------------------    Attributes     -------------------------------
    List<TextArgs> textArgsList;

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
}
