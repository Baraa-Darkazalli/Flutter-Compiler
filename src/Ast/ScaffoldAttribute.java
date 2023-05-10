package Ast;

public class ScaffoldAttribute {
    //---------------------------    Attributes     -------------------------------
    private ScaffoldAttrBody scaffoldAttrBody;
    private ScaffoldAttrDrawer scaffoldAttrDrawer;
    private ScaffoldAttrAppBar scaffoldAttrAppBar;
    private ScaffoldAttrBottomNavigationBar scaffoldAttrBottomNavigationBar;
    private ScaffoldAttrFloatingActionButton scaffoldAttrFloatingActionButton;
    private SharedBackGroundColorAttr sharedBackGroundColorAttr;

    //---------------------------    Setters & Getters     -------------------------------

    public ScaffoldAttrBody getScaffoldAttrBody() {
        return scaffoldAttrBody;
    }

    public void setScaffoldAttrBody(ScaffoldAttrBody scaffoldAttrBody) {
        this.scaffoldAttrBody = scaffoldAttrBody;
    }

    public ScaffoldAttrDrawer getScaffoldAttrDrawer() {
        return scaffoldAttrDrawer;
    }

    public void setScaffoldAttrDrawer(ScaffoldAttrDrawer scaffoldAttrDrawer) {
        this.scaffoldAttrDrawer = scaffoldAttrDrawer;
    }

    public ScaffoldAttrAppBar getScaffoldAttrAppBar() {
        return scaffoldAttrAppBar;
    }

    public void setScaffoldAttrAppBar(ScaffoldAttrAppBar scaffoldAttrAppBar) {
        this.scaffoldAttrAppBar = scaffoldAttrAppBar;
    }

    public ScaffoldAttrBottomNavigationBar getScaffoldAttrBottomNavigationBar() {
        return scaffoldAttrBottomNavigationBar;
    }

    public void setScaffoldAttrBottomNavigationBar(ScaffoldAttrBottomNavigationBar scaffoldAttrBottomNavigationBar) {
        this.scaffoldAttrBottomNavigationBar = scaffoldAttrBottomNavigationBar;
    }

    public ScaffoldAttrFloatingActionButton getScaffoldAttrFloatingActionButton() {
        return scaffoldAttrFloatingActionButton;
    }

    public void setScaffoldAttrFloatingActionButton(ScaffoldAttrFloatingActionButton scaffoldAttrFloatingActionButton) {
        this.scaffoldAttrFloatingActionButton = scaffoldAttrFloatingActionButton;
    }

    public SharedBackGroundColorAttr getSharedBackGroundColorAttr() {
        return sharedBackGroundColorAttr;
    }

    public void setSharedBackGroundColorAttr(SharedBackGroundColorAttr sharedBackGroundColorAttr) {
        this.sharedBackGroundColorAttr = sharedBackGroundColorAttr;
    }

    //---------------------------    ToString Func     -------------------------------
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScaffoldAttributes\n");
        sb.append("ScaffoldAttrBody: ").append(scaffoldAttrBody != null ? scaffoldAttrBody.toString() : "null").append("\n");
        sb.append("ScaffoldAttrDrawer: ").append(scaffoldAttrDrawer != null ? scaffoldAttrDrawer.toString() : "null").append("\n");
        sb.append("ScaffoldAttrAppBar: ").append(scaffoldAttrAppBar != null ? scaffoldAttrAppBar.toString() : "null").append("\n");
        sb.append("ScaffoldAttrBottomNavigationBar: ").append(scaffoldAttrBottomNavigationBar != null ? scaffoldAttrBottomNavigationBar.toString() : "null").append("\n");
        sb.append("ScaffoldAttrFloatingActionButton: ").append(scaffoldAttrFloatingActionButton != null ? scaffoldAttrFloatingActionButton.toString() : "null").append("\n");
        sb.append("SharedBackGroundColorAttr: ").append(sharedBackGroundColorAttr != null ? sharedBackGroundColorAttr.toString() : "null").append("\n");

        return sb.toString();
    }
}
