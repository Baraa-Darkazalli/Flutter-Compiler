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
        StringBuilder sb = new StringBuilder();

        if(expressions != null && !expressions.isEmpty())
        {
            for (Expression expression:expressions)
            {
                sb.append(expression.generateHtmlAttribute());
            }
        }
        
        return sb.toString();
    }

    @Override
    public String generateHtmlCode() {
        return "";
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
