package Ast;

import Ast.Classes.HtmlElement;

public class Root extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private DartMain dartMain;
    private DartClass dartClass;

    //---------------------------    Setters & Getters     -------------------------------
    public DartMain getDartMain() {
        return dartMain;
    }

    public void setDartMain(DartMain dartMain) {
        this.dartMain = dartMain;
    }

    public DartClass getDartClass() {
        return dartClass;
    }

    public void setDartClass(DartClass dartClass) {
        this.dartClass = dartClass;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Root{" +
                "dartMain=" + dartMain +
                ", dartClass=" + dartClass +
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
