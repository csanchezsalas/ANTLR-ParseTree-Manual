package MyAST;

import java.util.LinkedList;

public class DeclarationAST extends AST{
    public SingleDeclarationAST singleDeclarationAST;
    public LinkedList<SingleDeclarationAST> singleDeclarationASTLinkedList;

    public DeclarationAST(SingleDeclarationAST singleDeclarationAST, LinkedList<SingleDeclarationAST> singleDeclarationASTLinkedList) {
        this.singleDeclarationAST = singleDeclarationAST;
        this.singleDeclarationASTLinkedList = singleDeclarationASTLinkedList;
    }
}
