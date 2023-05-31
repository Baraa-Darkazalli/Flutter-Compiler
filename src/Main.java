
import Ast.Root;
import Symbol_Table.SymbolTable;
import Visitor.BaseVisitor;
import gen.LexerFile;
import gen.ParserFile;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import static org.antlr.v4.runtime.CharStreams.fromFileName;
//just to know ahmad is the best
public class Main {
    public static void main(String[] args) throws IOException {

        //first screen
        String screen1 = "D:\\Compiler2\\compiler\\screens\\page1.txt";
        Root root1 = visitTreeFromFile(screen1);

        //second screen
        String screen2="D:\\Compiler2\\compiler\\screens\\page2.txt";
        Root root2 = visitTreeFromFile(screen2);

        //Code Generation to Html
        createHtmlFile("D:\\Compiler2\\compiler\\pages\\page1.html",root1);
        createHtmlFile("D:\\Compiler2\\compiler\\pages\\page2.html",root2);


    }


    //---------------------------    Static Functions     -------------------------------
    public static Root visitTreeFromFile(String file) throws IOException {

        CharStream cs = fromFileName(file);
        LexerFile lexer = new LexerFile(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        ParserFile parser = new ParserFile(token);
        ParseTree tree = parser.root();
        Root doc = (Root) new BaseVisitor().visit(tree);
        return doc;
    }
    public static void createHtmlFile(String fileName,Root root)  {
        PrintWriter writer;
        try
        {
            writer = new PrintWriter(fileName);
        }
        catch(Exception e)
        {
            throw new RuntimeException(e);
        }

        writer.println(root.generateHtmlCode());
        writer.close();
    }
}
