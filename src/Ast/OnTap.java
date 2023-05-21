package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class OnTap extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<Expression> expressions;

    //---------------------------    Constructor     -------------------------------
    public OnTap() {
        expressions = new ArrayList<>();
    }

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
                sb.append(expression.generateHtmlAttribute()).append("; ");
            }
        }
        
        return sb.toString();
    }

}
