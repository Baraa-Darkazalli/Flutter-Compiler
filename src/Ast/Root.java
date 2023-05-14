package Ast;

public class Root {
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
}
