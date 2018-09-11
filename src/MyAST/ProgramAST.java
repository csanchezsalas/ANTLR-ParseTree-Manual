package MyAST;

public class ProgramAST extends AST {
    private SingleCommandAST singleCommandAST;

    public SingleCommandAST getSingleCommandAST() {
        return singleCommandAST;
    }

    public void setSingleCommandAST(SingleCommandAST singleCommandAST) {
        this.singleCommandAST = singleCommandAST;
    }

    public ProgramAST( SingleCommandAST singleCommandAST){
        this.singleCommandAST = singleCommandAST;

    }
}
