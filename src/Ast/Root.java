package Ast;

import Ast.Classes.HtmlElement;

import java.util.List;

public class Root extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<DartClass> dartClasses;

    //---------------------------    Setters & Getters     -------------------------------

    public List<DartClass> getDartClass() {
        return dartClasses;
    }

    public void setDartClass(List<DartClass> dartClasses) {
        this.dartClasses = dartClasses;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Root{" +
                "dartClasses=" + dartClasses +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        sb.append("<!DOCTYPE html>\n");
        sb.append("<html>\n");
        sb.append("<head>\n");
        sb.append("<meta charset=\"UTF-8\">\n");
        sb.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1و shrink-to-fit=no\">\n");
        sb.append("<title>").append("Convert To HTML").append("</title>\n");
        sb.append("<!-- Bootstrap CSS -->\n");
        sb.append("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
        sb.append("</head>\n");
        sb.append("<body>\n");

        if (dartClasses != null && !dartClasses.isEmpty())
        {
            for (DartClass dartClass : dartClasses)
            {
                sb.append("<div ").append(dartClass.generateHtmlAttribute()).append(" >\n");
                sb.append(dartClass.generateHtmlCode());
                sb.append("</div>\n");
            }
        }
        sb.append("<!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
        sb.append("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
        sb.append("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
        sb.append("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
        sb.append("</body>\n");
        sb.append("</html>");

        return sb.toString();
    }

    @Override
    public String generateStyleCode() {
        return "";
    }
}
