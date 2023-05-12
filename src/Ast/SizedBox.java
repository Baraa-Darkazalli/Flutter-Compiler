package Ast;

import java.util.ArrayList;
import java.util.List;

public class SizedBox {
    //---------------------------    Attributes     -------------------------------
    private List<SizedBoxArgs> sizedBoxArgs;

    //---------------------------    Constructor     -------------------------------
    public SizedBox() {
        this.sizedBoxArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<SizedBoxArgs> getSizedBoxArgs() {
        return sizedBoxArgs;
    }

    public void setSizedBoxArgs(List<SizedBoxArgs> sizedBoxArgs) {
        this.sizedBoxArgs = sizedBoxArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "SizedBox{" +
                "sizedBoxArgs=" + sizedBoxArgs +
                '}';
    }
}
