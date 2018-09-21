package MyAST;

import java.util.LinkedList;

public class CommandAST extends AST {
    public SingleCommandAST singleCommandAST;
    public LinkedList<SingleCommandAST> singleCommandASTLinkedList;
    public CommandAST(SingleCommandAST singleCommandAST, LinkedList singleCommandASTLinkedList ){
        this.singleCommandAST = singleCommandAST;
        this.singleCommandASTLinkedList = singleCommandASTLinkedList;
    }
}
