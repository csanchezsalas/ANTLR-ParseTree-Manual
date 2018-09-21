package MyAST;

public class IfSCAST extends SingleCommandAST {
    public ExpressionAST expressionAST;
    public SingleCommandAST singleCommandASTTrue;
    public SingleCommandAST singleCommandASTFalse;

    public IfSCAST(ExpressionAST expressionAST, SingleCommandAST singleCommandASTTrue, SingleCommandAST singleCommandASTFalse) {
        this.expressionAST = expressionAST;
        this.singleCommandASTTrue = singleCommandASTTrue;
        this.singleCommandASTFalse = singleCommandASTFalse;
    }
}
