import MyAST.ProgramAST;
import MyAST.SingleCommandAST;
import org.antlr.v4.runtime.Token;
import MyAST.*;

import java.util.LinkedList;

/**
 * Created by oviquez on 21/8/2018.
 */
public class ParserManual {

    private Scanner e;
    private Token actualToken;

    public ParserManual(Scanner e){
        this.e = e;
        actualToken=this.e.nextToken();
    }

    private void accept(int expected){
        if (expected != actualToken.getType())
            System.out.println("Error Sintáctico");
        actualToken = this.e.nextToken();
    }

    public ProgramAST program(){
        SingleCommandAST resultSC = singleCommand();
        ProgramAST result;
        result = new ProgramAST(resultSC);
        // singleCommand();
        return  result;
    }

    public Command command(){

        SingleCommandAST resultSC = singleCommand();
        LinkedList<SingleCommandAST> resultSC_list = new LinkedList<>();
        while(actualToken.getType()==Scanner.PyCOMA){
            accept(Scanner.PyCOMA);
            singleCommand();
            SingleCommandAST resultSCItem = singleCommand();
            resultSC_list.add(resultSCItem); // lista indica que van uno o más singlecommands
        }
        Command result = new Command(resultSC, resultSC_list);
        return result;
    }

    public SingleCommandAST singleCommand(){
        SingleCommandAST resultSC = null;
        if (actualToken.getType() == Scanner.ID){
            Token id = actualToken;
            accept(Scanner.ID);
            if (actualToken.getType()==Scanner.ASSIGN){
                accept(Scanner.ASSIGN);
                ExpressionAST expressionAST = expression();
                resultSC = new AssignSCAST(id, expressionAST);

            }
            else if (actualToken.getType() == Scanner.PIZQ){
                accept(Scanner.PIZQ);
                ExpressionAST expressionAST = expression();
                accept(Scanner.PDER);

                resultSC = new CallSCAST(id, expressionAST);
            }
            else
                System.out.println("Error Sintáctico");
        }
        else if(actualToken.getType() == Scanner.IF){
            accept(Scanner.IF);
            ExpressionAST expressionAST = expression();
            accept(Scanner.THEN);
            SingleCommandAST singleCommandASTTrue = singleCommand();
            accept(Scanner.ELSE);
            SingleCommandAST singleCommandASTFalse = singleCommand();
            resultSC = new IfSCAST(expressionAST, singleCommandASTTrue, singleCommandASTFalse);
        }
        else if(actualToken.getType() == Scanner.WHILE){
            accept(Scanner.WHILE);
            expression();
            accept(Scanner.DO);
            singleCommand();
        }
        // y todos los demás
        else{
            System.out.println("Error Sintáctico");
        }
        return resultSC;
    }

    public ExpressionAST expression(){ actualToken = this.e.nextToken(); return null;}
}
