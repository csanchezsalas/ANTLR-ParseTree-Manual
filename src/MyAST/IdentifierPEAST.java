package MyAST;

import org.antlr.v4.runtime.Token;

public class IdentifierPEAST extends PrimaryExpressionAST {
    public Token id;

    public IdentifierPEAST(Token id) {
        this.id = id;
    }
}
