package MyAST;

public class WhileSCAST extends SingleCommandAST {
    ExpressionAST expressionAST;
    SingleCommandAST singleCommandAST;

    public WhileSCAST(ExpressionAST expressionAST, SingleCommandAST singleCommandAST) {
        this.expressionAST = expressionAST;
        this.singleCommandAST = singleCommandAST;
    }
}
