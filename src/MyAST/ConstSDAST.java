package MyAST;

import org.antlr.v4.runtime.Token;

public class ConstSDAST extends SingleDeclarationAST{
    public Token id;
    public ExpressionAST expressionAST;
    public  ConstSDAST(Token id, ExpressionAST expressionAST){
        this.id = id;
        this.expressionAST = expressionAST;
    }
}
