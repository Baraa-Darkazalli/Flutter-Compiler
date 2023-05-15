package Ast;

import Ast.Classes.HtmlElement;

import java.util.List;

public class DartMain extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<Expression> expressions;

    //---------------------------    Setters & Getters     -------------------------------
    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "DartMain{" +
                "expressions=" + expressions +
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
