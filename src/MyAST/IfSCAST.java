package MyAST;

public class IfSCAST extends SingleCommandAST {
    ExpressionAST expressionAST;
    SingleCommandAST singleCommandASTTrue;
    SingleCommandAST singleCommandASTFalse;

    public IfSCAST(ExpressionAST expressionAST, SingleCommandAST singleCommandASTTrue, SingleCommandAST singleCommandASTFalse) {
        this.expressionAST = expressionAST;
        this.singleCommandASTTrue = singleCommandASTTrue;
        this.singleCommandASTFalse = singleCommandASTFalse;
    }
}
