package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class Root extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<DartClass> dartClasses;

    //---------------------------    Constructor     -------------------------------
    public Root () {
        dartClasses = new ArrayList<>();
    }

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
    public String generateHtmlCode() {
        StringBuilder sb = new StringBuilder();

        sb.append("<!DOCTYPE html>\n");
        sb.append("<html>\n");
        sb.append("<head>\n");
        sb.append("<meta charset=\"UTF-8\">\n");
        sb.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1و shrink-to-fit=no\">\n");
        sb.append("<title>").append("Code Generation To HTML").append("</title>\n");
        sb.append("<!-- Bootstrap CSS -->\n");
        sb.append("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
        sb.append(this.getDefaultStyleCode());
        sb.append(this.getDefaultScriptCode());
        sb.append("</head>\n");
        sb.append("<body>\n");

        if (dartClasses != null && !dartClasses.isEmpty())
        {
            for (DartClass dartClass : dartClasses)
            {
//                sb.append("<div ").append(dartClass.generateHtmlAttribute()).append(" >\n");
                sb.append(dartClass.generateHtmlCode());
//                sb.append("</div>\n");
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

    //---------------------------    Functions     -------------------------------
    public String getDefaultStyleCode() {
        StringBuilder sb = new StringBuilder();

        sb.append("<style>\n");
        sb.append("  *{\n");
        sb.append("    margin: 0; padding: 0; box-sizing: border-box; \n");
        sb.append("  }\n");
        sb.append("  body{\n");
        sb.append("    display: grid;\n");
        sb.append("    grid-template-columns: auto 1fr;\n");
        sb.append("    grid-template-areas:\"header header\"\n \"nav nav\"\n \"aside main\"\n \"footer footer\";\n");
        sb.append("  }\n");
        sb.append("  main{\n");
        sb.append("    grid-area: main;\n");
        sb.append("    padding: 20px;\n");
        sb.append("  }\n");
        sb.append("  header{\n");
        sb.append("    grid-area: header;\n");
        sb.append("    padding: 10px;\n");
        sb.append("    background-color: blue;\n");
        sb.append("    align-items: center;\n");
        sb.append("    display: flex;\n");
        sb.append("    justify-content: space-around;\n");
        sb.append("  }\n");
        sb.append("  nav{\n");
        sb.append("    grid-area: nav;\n");
        sb.append("    background-color: #f1f1f1;\n");
        sb.append("    padding: 10px;\n");
        sb.append("    display: flex;\n");
        sb.append("    flex-direction: row;\n");
        sb.append("    justify-content: space-around;\n");
        sb.append("  }\n");
        sb.append("  aside {\n");
        sb.append("    grid-area: aside;\n");
        sb.append("    margin: 0;\n");
        sb.append("    padding: 0;\n");
        sb.append("    width: 200px;\n"); //default
        sb.append("    background-color: #E2E2E2;\n"); //default
        sb.append("    height: 100vh;\n");
        sb.append("    overflow: auto;\n");
        sb.append("  }\n");
        sb.append("  aside .column * {\n");
        sb.append("    width: 100%;\n"); //default
        sb.append("  }\n");
//        sb.append("  /* Sidebar Args */\n");
//        sb.append("  aside div {\n");
//        sb.append("    display: block;\n");
//        sb.append("    color: black;\n");
//        sb.append("    padding: 16px;\n");
//        sb.append("    text-decoration: none;\n");
//        sb.append("  }\n");
//        sb.append("  /* Active/current Arg */\n");
//        sb.append("  aside div.active {\n");
//        sb.append("    background-color: #04AA6D;\n");
//        sb.append("    color: white;\n");
//        sb.append("  }\n");
//        sb.append("  /* Arg on mouse-over */\n");
//        sb.append("  aside div:hover:not(.active) {\n");
//        sb.append("    background-color: #555;\n");
//        sb.append("    color: white;\n");
//        sb.append("  }\n");
        sb.append("  .inkWell{\n");
        sb.append("    display: flex;\n");
        sb.append("    flex-direction: column;\n");
        sb.append("    align-items: center;\n");
        sb.append("    cursor: pointer;\n");
        sb.append("    padding: 10px;\n");
        sb.append("  }\n");
        sb.append("  .inkWell:hover{\n");
        sb.append("    background-color: lightgray;\n");
        sb.append("  }\n");
        sb.append("  .floating-action-button {\n");
        sb.append("    position: fixed;\n");
        sb.append("    bottom: 20px;\n");
        sb.append("    right: 20px;\n");
        sb.append("    background-color: blue;\n");
        sb.append("    color: #FFFFFF;\n");
        sb.append("    border-radius: 50%;\n");
        sb.append("    width: 56px;\n");
        sb.append("    height: 56px;\n");
        sb.append("    text-align: center;\n");
        sb.append("    line-height: 56px;\n");
        sb.append("    font-size: 24px;\n");
        sb.append("  }\n");
        sb.append("  .floating-action-button:hover{\n");
        sb.append("    background-color: lightgray;\n");
        sb.append("  }\n");
        sb.append("  .row{\n");
        sb.append("    display: flex; flex-direction: row; justify-content: center; align-items: center;\n");
        sb.append("  }\n");
        sb.append("  .column{\n");
        sb.append("    display: flex; flex-direction: column; justify-content: space-around; align-items: center;\n");
        sb.append("  }\n");
        sb.append("  img{\n");
        sb.append("    height: 100px;\n");
        sb.append("    width: 100px;\n");
        sb.append("  }\n");
        sb.append("  .card-child{\n");
        sb.append("    height: 300px;\n");
        sb.append("    width: 300px;\n");
        sb.append("  }\n");
        sb.append("  .btn{\n");
        sb.append("    width: 100%;\n");
        sb.append("    margin-top: 10px;\n");
        sb.append("  }\n");
        sb.append("  .btn p{\n");
        sb.append("    margin: 0;\n");
        sb.append("  }\n");
        sb.append("  .btn .inkWell{\n");
        sb.append("    display: block;\n");
        sb.append("    cursor: pointer;\n");
        sb.append("    padding: 0px;\n");
        sb.append("  }\n");
        sb.append("  .btn .inkWell:hover{\n");
        sb.append("    background-color: transparent;\n");
        sb.append("  }\n");
        sb.append("</style>\n");

        return sb.toString();
    }

    public String getDefaultScriptCode() {
        StringBuilder sb = new StringBuilder();

        // Navigate data
        sb.append("<script>\n");
        sb.append("function navigate(params) {\n");
        sb.append("  var url = params[0] + \"?\";\n");
        sb.append("  params.forEach(function(value, index) {\n");
        sb.append("    if (index !== 0) {\n");
        sb.append("      url += \"&\";\n");
        sb.append("    }\n");
        sb.append("    url += \"param\" + index + \"=\" + value;\n");
        sb.append("  });\n");
        sb.append("  window.location.href = url;\n");
        sb.append("}\n");
        sb.append("</script>");

        // Receive data
        sb.append("<script>\n");
        sb.append("  var queryString = window.location.search;\n");
        sb.append("  var cleanedQueryString = decodeURIComponent(queryString.replace(/\\+/g, ' '));\n");
        sb.append("  var params = new URLSearchParams(cleanedQueryString);\n");
        sb.append("  var values = [];\n");
        sb.append("  params.forEach(function(value) {\n");
        sb.append("    values.push(value);\n");
        sb.append("  });\n");
        sb.append("</script>\n");

        // Go Back
        sb.append("<script>\n");
        sb.append("function goBack() {\n");
        sb.append("  window.history.back();\n");
        sb.append("}\n");
        sb.append("</script>\n");

        return sb.toString();
    }
}
