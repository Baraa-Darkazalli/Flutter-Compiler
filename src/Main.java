
import Ast.Root;
import Visitor.BaseVisitor;
import gen.LexerFile;
import gen.ParserFile;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.PrintWriter;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

//just to know ahmad is the best
public class Main {
    public static void main(String[] args) throws IOException {
        //login.txt screen
        String loginScreen = "D:\\Compiler2\\compiler\\screens\\login.txt";
        Root loginRoot = visitTreeFromFile(loginScreen);
        createHtmlFile("D:\\Compiler2\\compiler\\pages\\login.html",loginRoot);

        String p1 = "D:\\Compiler2\\compiler\\screens\\page1.txt";
        Root r1 = visitTreeFromFile(p1);
        createHtmlFile("D:\\Compiler2\\compiler\\pages\\page1.html",r1);

        String p2 = "D:\\Compiler2\\compiler\\screens\\page2.txt";
        Root r2 = visitTreeFromFile(p2);
        createHtmlFile("D:\\Compiler2\\compiler\\pages\\login.html",r2);


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

    public static void createHtmlFile(String fileName, Root root) {
        PrintWriter writer;
        try {
            writer = new PrintWriter(fileName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        writer.println(root.generateHtmlCode());
        writer.close();
    }
}

