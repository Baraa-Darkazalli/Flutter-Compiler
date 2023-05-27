package Ast.Classes;

import Ast.ConstructorArg;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement {
    //---------------------------    Attributes     -------------------------------
    public static List<String> queryStringArgs = new ArrayList<>();

    //---------------------------    Html Functions     -------------------------------
    public String generateHtmlAttribute()
    {
        return "";
    }

    public String generateHtmlCode(){
        return "";
    }

    public String generateStyleCode(){
        return "";
    }
    public String generateScriptCode(){
        return "";
    }

    //---------------------------    Services Functions     -------------------------------
    public int getIndexForParam(String variableName)
    {
        if(queryStringArgs != null && ! queryStringArgs.isEmpty())
            return queryStringArgs.indexOf(variableName);
        else return -1;
    }






}