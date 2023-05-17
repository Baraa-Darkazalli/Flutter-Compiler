package Ast;

import Ast.Classes.HtmlElement;

import java.util.List;

public class OnTap extends HtmlElement {
    private List<Expression> expressions;

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        return "OnTap{" +
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

    @Override
    public String generateStyleCode() {
        return null;
    }
}
