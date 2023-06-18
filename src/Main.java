
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
        //login screen
        String loginScreen = "D:\\Compiler2\\compiler\\screens\\login.txt";
        Root loginRoot = visitTreeFromFile(loginScreen);
        createHtmlFile("D:\\Compiler2\\compiler\\pages\\login.html",loginRoot);

        //Home screen
        String homeScreen = "D:\\Compiler2\\compiler\\screens\\home.txt";
        Root homeRoot = visitTreeFromFile(homeScreen);
        createHtmlFile("D:\\Compiler2\\compiler\\pages\\home.html",homeRoot);

        //Product screen
        String productScreen = "D:\\Compiler2\\compiler\\screens\\product.txt";
        Root productRoot = visitTreeFromFile(productScreen);
        createHtmlFile("D:\\Compiler2\\compiler\\pages\\product.html",productRoot);




        //test
        String page1 = "D:\\Compiler2\\compiler\\screens\\page1.txt";
        Root page1root = visitTreeFromFile(page1);
        createHtmlFile("D:\\Compiler2\\compiler\\pages\\page1.html",page1root);

        String page2 = "D:\\Compiler2\\compiler\\screens\\page2.txt";
        Root page2root = visitTreeFromFile(page2);
        createHtmlFile("D:\\Compiler2\\compiler\\pages\\page2.html",page2root);


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

