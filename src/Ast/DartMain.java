package Ast;

import java.util.List;

public class DartMain {
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
}
