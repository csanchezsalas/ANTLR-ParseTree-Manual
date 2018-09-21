package MyAST;

import org.antlr.v4.runtime.Token;

public class VarSDAST extends SingleDeclarationAST {
    public Token id;
    public TypeDenoterAST typeDenoterAST;

    public VarSDAST(Token id, TypeDenoterAST typeDenoterAST) {
        this.id = id;
        this.typeDenoterAST = typeDenoterAST;
    }
}
