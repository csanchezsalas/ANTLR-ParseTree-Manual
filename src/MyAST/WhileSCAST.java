package MyAST;

public class WhileSCAST extends SingleCommandAST {
    public ExpressionAST expressionAST;
    public SingleCommandAST singleCommandAST;

    public WhileSCAST(ExpressionAST expressionAST, SingleCommandAST singleCommandAST) {
        this.expressionAST = expressionAST;
        this.singleCommandAST = singleCommandAST;
    }
}
