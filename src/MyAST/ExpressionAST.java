package MyAST;

import org.antlr.v4.runtime.Token;

import java.util.LinkedList;

public class ExpressionAST extends AST{
    public PrimaryExpressionAST primaryExpressionAST;
    public LinkedList<Token> tokenLinkedList; // operator // lista de operators
    public LinkedList<PrimaryExpressionAST> primaryExpressionASTLinkedList;

    public ExpressionAST(PrimaryExpressionAST primaryExpressionAST, LinkedList<Token> tokenLinkedList, LinkedList<PrimaryExpressionAST> primaryExpressionASTLinkedList) {
        this.primaryExpressionAST = primaryExpressionAST;
        this.tokenLinkedList = tokenLinkedList;
        this.primaryExpressionASTLinkedList = primaryExpressionASTLinkedList;
    }
}
