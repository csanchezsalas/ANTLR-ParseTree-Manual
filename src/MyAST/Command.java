package MyAST;

import java.util.LinkedList;

public class Command extends AST {
    public SingleCommandAST singleCommandAST;
    public LinkedList<SingleCommandAST> singleCommandASTLinkedList;
    public Command(SingleCommandAST singleCommandAST, LinkedList singleCommandASTLinkedList ){
        this.singleCommandAST = singleCommandAST;
        this.singleCommandASTLinkedList = singleCommandASTLinkedList;
    }
}
