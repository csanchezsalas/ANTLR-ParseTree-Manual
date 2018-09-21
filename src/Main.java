/**
 * Christian Sánchez Salas - Tarea #3 Árbol Manual.
 * Compiladores e Intérpretes.
 * Septiembre, 2018.
 * Carné: 201204082.
 */
import MyAST.AST;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import javax.swing.*;
import java.io.FileReader;
import java.util.List;



public class Main {
    public static void main(String[] args){
        Scanner inst = null;
        Parser2 parser = null;
        ParseTree tree=null;

        //ANTLRInputStream input=null;
        CharStream input=null;
        CommonTokenStream tokens = null;
       // MyErrorListener errorListener = null;
        try {
            //input = new ANTLRInputStream(new FileReader("test.txt"));
            input = CharStreams.fromFileName("test.txt");
            inst = new Scanner(input);
            ParserManual parserManual = new ParserManual(inst);
            AST myTree = parserManual.program();
            System.out.println('H');
            // tokens = new CommonTokenStream(inst);
           /* parser = new Parser2(inst);
            errorListener = new MyErrorListener();

            inst.removeErrorListeners();
            inst.addErrorListener( errorListener );

            parser.removeErrorListeners();
            parser.addErrorListener ( errorListener );

            try {
                tree = parser.program();
            }
            catch(RecognitionException e){
                System.out.println("Error!!!");
                e.printStackTrace();
            }
            //se imprime el arbol
            if (errorListener.hasErrors() == false) {
                System.out.println("Compilación Exitosa!!\n");
                java.util.concurrent.Future<JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree, parser);
                treeGUI.get().setVisible(true);
            }
            else {
                System.out.println("Compilación Fallida!!\n");
                System.out.println(errorListener.toString());
            }
*/
        }
        catch(Exception e){System.out.println("No hay archivo");e.printStackTrace();}
        /*List<Token> lista = (List<Token>) inst.getAllTokens();

        for (Token t : lista)

            System.out.println(t.getType() + ":" + t.getText() + "\n");

        inst = new Scanner(input);
        //inst.reset();*/

    }

}
