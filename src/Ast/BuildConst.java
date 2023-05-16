package Ast;

import Ast.Classes.HtmlElement;
import com.sun.org.apache.xpath.internal.Arg;

import java.util.List;

public class BuildConst extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<Arg> args;

    //---------------------------    Setters & Getters     -------------------------------
    public List<Arg> getArgs() {
        return args;
    }

    public void setArgs(List<Arg> args) {
        this.args = args;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "BuildConst{" +
                "args=" + args +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        return "";
    }
}
