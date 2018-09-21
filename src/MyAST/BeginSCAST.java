package MyAST;

public class BeginSCAST extends SingleCommandAST {
    public CommandAST commandAST;

    public BeginSCAST(CommandAST commandAST) {
        this.commandAST = commandAST;
    }
}
