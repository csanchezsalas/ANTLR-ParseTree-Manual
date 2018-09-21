/**
 * Christian Sánchez Salas - Tarea #3 Árbol Manual.
 * Compiladores e Intérpretes.
 * Septiembre, 2018.
 * Carné: 201204082.
 */
import MyAST.*;

import org.antlr.v4.runtime.Token;


import java.util.LinkedList;

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

    public CommandAST command(){

        SingleCommandAST resultSC = singleCommand();
        LinkedList<SingleCommandAST> resultSC_list = new LinkedList<>(); // CUANDO VIENEN  'N' VECES
        while(actualToken.getType()==Scanner.PyCOMA){
            accept(Scanner.PyCOMA);
            // singleCommand();
            SingleCommandAST resultSCItem = singleCommand();
            resultSC_list.add(resultSCItem); // lista indica que van uno o más singlecommands
        }
        CommandAST result = new CommandAST(resultSC, resultSC_list);
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
        // DESDE AQUÍ EMPIEZA LA TAREA:
        else if(actualToken.getType() == Scanner.WHILE){
            accept(Scanner.WHILE);
            ExpressionAST expressionAST = expression();
            accept(Scanner.DO);
            SingleCommandAST singleCommandASTDO = singleCommand();
            resultSC = new WhileSCAST(expressionAST, singleCommandASTDO);
        }
        // y todos los demás
        else if(actualToken.getType() == Scanner.LET){
            accept(Scanner.LET);
            DeclarationAST declarationAST = declaration();
            accept(Scanner.IN);
            SingleCommandAST singleCommandASTIN = singleCommand();
            resultSC = new LetSCAST(declarationAST, singleCommandASTIN);

        }
        else if(actualToken.getType() == Scanner.BEGIN){
            accept(Scanner.BEGIN);
            CommandAST commandAST = command();
            accept(Scanner.END);
            resultSC = new BeginSCAST(commandAST);

        }else{
            System.out.println("Error Sintáctico");
        }
        return resultSC;
    }

    public TypeDenoterAST typeDenoter(){
        TypeDenoterAST resultTD = null;
        Token id = actualToken;
        if (actualToken.getType() == Scanner.ID){
            accept(Scanner.ID);
        }else {
            System.out.println("Error Sintáctico");
        }
        resultTD = new TypeDenoterAST(id);
        return  resultTD;

    }

    public DeclarationAST declaration(){
        SingleDeclarationAST resultSD = singleDeclaration();
        LinkedList<SingleDeclarationAST> resultSD_list= new LinkedList<>();
        while(actualToken.getType()==Scanner.PyCOMA){
            accept(Scanner.PyCOMA);
            SingleDeclarationAST resultSDItem = singleDeclaration();
            resultSD_list.add(resultSDItem);
        }
        DeclarationAST resultDec = new DeclarationAST(resultSD, resultSD_list);
        return resultDec;
    }

    public SingleDeclarationAST singleDeclaration(){
        SingleDeclarationAST resultSD= null;
        if(actualToken.getType()==Scanner.CONST){
            accept(Scanner.CONST);
            Token id = actualToken;
            accept(Scanner.ID);
            accept(Scanner.VIR);
            ExpressionAST expressionAST = expression();
            resultSD = new ConstSDAST(id, expressionAST);

        }
        else if(actualToken.getType()==Scanner.VAR){
            accept(Scanner.VAR);
            Token id = actualToken;
            accept(Scanner.ID);
            accept(Scanner.DOSPUN);
            TypeDenoterAST typeDenoterAST = typeDenoter();
            resultSD = new VarSDAST(id, typeDenoterAST);


        }
        else{
            System.out.println("\nError\n");
        } return resultSD;
    }

    public PrimaryExpressionAST primaryExpression(){

        PrimaryExpressionAST primaryExpressionAST = null;
        Token token = actualToken;
        if (actualToken.getType()==Scanner.NUM){
            primaryExpressionAST = new LiteralPEAST(token);
            accept(Scanner.NUM);

        }
        else if(actualToken.getType()==Scanner.ID){
            primaryExpressionAST = new IdentifierPEAST(token);
            accept(Scanner.ID);
        }
        else if(actualToken.getType()==Scanner.PIZQ){
            accept(Scanner.PIZQ);
            ExpressionAST expressionAST = expression();
            accept(Scanner.PDER);
            primaryExpressionAST = new ExpressionPEAST(expressionAST);
        }
        else{
            System.out.println("\nError\n");
        } return primaryExpressionAST;
    }

    public ExpressionAST expression(){ 
        // actualToken = this.e.nextToken();
        PrimaryExpressionAST resultPE = primaryExpression();
        LinkedList<Token> tokenLinkedList = new LinkedList<>();
        LinkedList<PrimaryExpressionAST> resultPE_list = new LinkedList<>();
        Token token = actualToken;
        while((actualToken.getType()==Scanner.SUM)
                || (actualToken.getType() == Scanner.SUM)
                || (actualToken.getType() == Scanner.SUB)
                || (actualToken.getType() == Scanner.MUL)
                || (actualToken.getType() == Scanner.DIV)){
            if(actualToken.getType()==Scanner.SUM){
                token = actualToken;
                accept(Scanner.SUM);
                PrimaryExpressionAST resultPEItem = primaryExpression();
                resultPE_list.add(resultPEItem);
                tokenLinkedList.add(token);
                /*if(actualToken.getType()==Scanner.NUM){
                    accept(Scanner.NUM);
                }
                else if(actualToken.getType()==Scanner.ID){
                    accept(Scanner.ID);
                }
                else{
                    System.out.println("\nError\n");
                }*/

            }
            else if(actualToken.getType() == Scanner.SUB){
                token = actualToken;
                accept(Scanner.SUB);
                PrimaryExpressionAST resultPEItem = primaryExpression();
                resultPE_list.add(resultPEItem);
                tokenLinkedList.add(token);
                /*if(actualToken.getType()==Scanner.NUM){
                    accept(Scanner.NUM);
                }
                else if(actualToken.getType()==Scanner.ID){
                    accept(Scanner.ID);
                }
                else{
                    System.out.println("\nError\n");
                }*/

            }
            else if(actualToken.getType() == Scanner.MUL){
                token = actualToken;
                accept(Scanner.MUL);
                PrimaryExpressionAST resultPEItem = primaryExpression();
                resultPE_list.add(resultPEItem);
                tokenLinkedList.add(token);
                /*if(actualToken.getType()==Scanner.NUM){
                    accept(Scanner.NUM);
                }
                else if(actualToken.getType()==Scanner.ID){
                    accept(Scanner.ID);
                }
                else{
                    System.out.println("\nError\n");
                }*/

            }
            else if(actualToken.getType() == Scanner.DIV){
                token = actualToken;
                accept(Scanner.DIV);
                PrimaryExpressionAST resultPEItem = primaryExpression();
                resultPE_list.add(resultPEItem);
                tokenLinkedList.add(token);

                /*if(actualToken.getType()==Scanner.NUM){
                    accept(Scanner.NUM);
                }
                else if(actualToken.getType()==Scanner.ID){
                    accept(Scanner.ID);
                }
                else{
                    System.out.println("\nError\n");
                }*/

            }
            else{
                System.out.println("\nError\n");
            }


        }
        ExpressionAST result = new ExpressionAST(resultPE, tokenLinkedList, resultPE_list);
        return result;
        
    
    }
}
