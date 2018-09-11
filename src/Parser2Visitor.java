// Generated from C:/Users/csanchezsalas/Documents/IdeaProjects/Alpha\Parser2.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Parser2}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Parser2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link Parser2#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramAST(Parser2.ProgramASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commandAST}
	 * labeled alternative in {@link Parser2#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandAST(Parser2.CommandASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignSCAST}
	 * labeled alternative in {@link Parser2#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignSCAST(Parser2.AssignSCASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funCallSCAST}
	 * labeled alternative in {@link Parser2#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCallSCAST(Parser2.FunCallSCASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifSCAST}
	 * labeled alternative in {@link Parser2#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfSCAST(Parser2.IfSCASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileSCAST}
	 * labeled alternative in {@link Parser2#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileSCAST(Parser2.WhileSCASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letSCAST}
	 * labeled alternative in {@link Parser2#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetSCAST(Parser2.LetSCASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockSCAST}
	 * labeled alternative in {@link Parser2#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockSCAST(Parser2.BlockSCASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationAST}
	 * labeled alternative in {@link Parser2#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationAST(Parser2.DeclarationASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constDeclAST}
	 * labeled alternative in {@link Parser2#singleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclAST(Parser2.ConstDeclASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclAST}
	 * labeled alternative in {@link Parser2#singleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclAST(Parser2.VarDeclASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typedenoterAST}
	 * labeled alternative in {@link Parser2#typedenoter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedenoterAST(Parser2.TypedenoterASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link Parser2#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAST(Parser2.ExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numPEAST}
	 * labeled alternative in {@link Parser2#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumPEAST(Parser2.NumPEASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idPEAST}
	 * labeled alternative in {@link Parser2#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdPEAST(Parser2.IdPEASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code groupPEAST}
	 * labeled alternative in {@link Parser2#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupPEAST(Parser2.GroupPEASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumOPAST}
	 * labeled alternative in {@link Parser2#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumOPAST(Parser2.SumOPASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subOPAST}
	 * labeled alternative in {@link Parser2#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubOPAST(Parser2.SubOPASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulOPAST}
	 * labeled alternative in {@link Parser2#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOPAST(Parser2.MulOPASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divOPAST}
	 * labeled alternative in {@link Parser2#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivOPAST(Parser2.DivOPASTContext ctx);
}