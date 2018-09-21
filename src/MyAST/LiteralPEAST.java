package MyAST;

import org.antlr.v4.runtime.Token;

public class LiteralPEAST extends PrimaryExpressionAST {
    public Token literal;

    public LiteralPEAST(Token literal) {
        this.literal = literal;
    }
}
