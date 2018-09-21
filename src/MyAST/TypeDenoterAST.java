package MyAST;

import org.antlr.v4.runtime.Token;

public class TypeDenoterAST extends AST {
    public Token id;

    public TypeDenoterAST(Token id) {
        this.id = id;
    }
}
