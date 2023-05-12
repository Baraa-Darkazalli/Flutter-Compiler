package Ast;

import java.util.ArrayList;
import java.util.List;

public class Image {
    //---------------------------    Attributes     -------------------------------
    private List<ImageArgs> imageArgs;

    //---------------------------    Constructor     -------------------------------
    public Image() {
        this.imageArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<ImageArgs> getImageArgs() {
        return imageArgs;
    }

    public void setImageArgs(List<ImageArgs> imageArgs) {
        this.imageArgs = imageArgs;
    }

    //---------------------------    Override Func     ------------------------------
    @Override
    public String toString() {
        return "Image{" +
                "imageArgs=" + imageArgs +
                '}';
    }
}
