package MyAST;
import org.antlr.v4.runtime.Token;

public class AssignSCAST extends SingleCommandAST {
    public Token id;
    public ExpressionAST expressionAST;
    public  AssignSCAST(Token id, ExpressionAST expressionAST){
        this.id = id;
        this.expressionAST = expressionAST;
    }
}
