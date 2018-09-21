package MyAST;

public class ExpressionPEAST extends PrimaryExpressionAST {
    public ExpressionAST expressionAST;

    public ExpressionPEAST(ExpressionAST expressionAST) {
        this.expressionAST = expressionAST;
    }
}
