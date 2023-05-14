package Ast;

public class ClassArgs {
    //---------------------------    Attributes     -------------------------------
    private Build build;
    private ImplementVariables implementVariables;
    private BuildConst buildConst;

    //---------------------------    Setters & Getters     -------------------------------
    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }

    public ImplementVariables getImplementVariables() {
        return implementVariables;
    }

    public void setImplementVariables(ImplementVariables implementVariables) {
        this.implementVariables = implementVariables;
    }

    public BuildConst getBuildConst() {
        return buildConst;
    }

    public void setBuildConst(BuildConst buildConst) {
        this.buildConst = buildConst;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "ClassArgs{" +
                "build=" + build +
                ", implementVariables=" + implementVariables +
                ", buildConst=" + buildConst +
                '}';
    }
}
