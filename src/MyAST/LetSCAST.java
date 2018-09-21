package MyAST;

public class LetSCAST extends SingleCommandAST {
    public DeclarationAST declarationAST;
    public SingleCommandAST singleCommandASTIN;

    public LetSCAST(DeclarationAST declarationAST, SingleCommandAST singleCommandAST) {
        this.declarationAST = declarationAST;
        this.singleCommandASTIN = singleCommandAST;
    }
}
