package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class Image extends HtmlElement {
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

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        if(imageArgs != null && !imageArgs.isEmpty())
        {
            for(ImageArgs imageArg:imageArgs)
            {
                sb.append("<img src=\"").append(imageArg.generateHtmlCode()).append("\" alt=\"image\">\n");
                sb.append(imageArg.generateHtmlCode());
                sb.append("<style>\n");
                sb.append("  img{\n");
                sb.append(imageArg.generateStyleCode());
                sb.append("  }\n");
                sb.append("</style>\n");
            }
        }

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
