package MyAST;
import org.antlr.v4.runtime.Token;

public class CallSCAST extends SingleCommandAST {
    public Token id;
    public ExpressionAST expressionAST;

    public CallSCAST(Token id, ExpressionAST expressionAST) {
        this.expressionAST = expressionAST;
        this.id = id;
    }
}
