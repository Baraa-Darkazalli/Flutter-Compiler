
import Ast.Root;
import Visitor.BaseVisitor;
import gen.LexerFile;
import gen.ParserFile;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {


        String source="../screens/page1.txt";
        CharStream cs=fromFileName(source);
        LexerFile lexer=new LexerFile(cs);
        CommonTokenStream token=new CommonTokenStream(lexer);
        ParserFile parser=new ParserFile(token);
        ParseTree tree=parser.root();
        Root doc=(Root) new BaseVisitor().visit(tree);


    }
}
