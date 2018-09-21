// Generated from C:/Users/CHRISTIAN/Documents/GitHub/ANTLR-ParseTree-Manual\Parser2.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Parser2 extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PyCOMA=1, ASSIGN=2, PIZQ=3, PDER=4, VIR=5, DOSPUN=6, SUM=7, SUB=8, MUL=9, 
		DIV=10, IF=11, WHILE=12, LET=13, THEN=14, ELSE=15, IN=16, DO=17, BEGIN=18, 
		END=19, CONST=20, VAR=21, ID=22, NUM=23, WS=24, PLUS=25, MINUS=26, MULT=27;
	public static final int
		RULE_program = 0, RULE_commandAST = 1, RULE_singleCommand = 2, RULE_declaration = 3, 
		RULE_singleDeclaration = 4, RULE_typedenoter = 5, RULE_expression = 6, 
		RULE_primaryExpression = 7;
	public static final String[] ruleNames = {
		"program", "commandAST", "singleCommand", "declaration", "singleDeclaration", 
		"typedenoter", "expression", "primaryExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':='", "'('", "')'", "'~'", "':'", "'+'", "'-'", "'*'", 
		"'/'", "'if'", "'while'", "'let'", "'then'", "'else'", "'in'", "'do'", 
		"'begin'", "'end'", "'const'", "'var'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PyCOMA", "ASSIGN", "PIZQ", "PDER", "VIR", "DOSPUN", "SUM", "SUB", 
		"MUL", "DIV", "IF", "WHILE", "LET", "THEN", "ELSE", "IN", "DO", "BEGIN", 
		"END", "CONST", "VAR", "ID", "NUM", "WS", "PLUS", "MINUS", "MULT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Parser2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Parser2(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramASTContext extends ProgramContext {
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Parser2.EOF, 0); }
		public ProgramASTContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitProgramAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			_localctx = new ProgramASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			singleCommand();
			setState(17);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandASTContext extends ParserRuleContext {
		public CommandASTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandAST; }
	 
		public CommandASTContext() { }
		public void copyFrom(CommandASTContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CommandContext extends CommandASTContext {
		public List<SingleCommandContext> singleCommand() {
			return getRuleContexts(SingleCommandContext.class);
		}
		public SingleCommandContext singleCommand(int i) {
			return getRuleContext(SingleCommandContext.class,i);
		}
		public List<TerminalNode> PyCOMA() { return getTokens(Parser2.PyCOMA); }
		public TerminalNode PyCOMA(int i) {
			return getToken(Parser2.PyCOMA, i);
		}
		public CommandContext(CommandASTContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandASTContext commandAST() throws RecognitionException {
		CommandASTContext _localctx = new CommandASTContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_commandAST);
		int _la;
		try {
			_localctx = new CommandContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			singleCommand();
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PyCOMA) {
				{
				{
				setState(20);
				match(PyCOMA);
				setState(21);
				singleCommand();
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleCommandContext extends ParserRuleContext {
		public SingleCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleCommand; }
	 
		public SingleCommandContext() { }
		public void copyFrom(SingleCommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LetSCASTContext extends SingleCommandContext {
		public TerminalNode LET() { return getToken(Parser2.LET, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode IN() { return getToken(Parser2.IN, 0); }
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
		public LetSCASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitLetSCAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunCallSCASTContext extends SingleCommandContext {
		public TerminalNode PIZQ() { return getToken(Parser2.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(Parser2.PDER, 0); }
		public FunCallSCASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitFunCallSCAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignSCASTContext extends SingleCommandContext {
		public TerminalNode ID() { return getToken(Parser2.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Parser2.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignSCASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitAssignSCAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileSCASTContext extends SingleCommandContext {
		public TerminalNode WHILE() { return getToken(Parser2.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(Parser2.DO, 0); }
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
		public WhileSCASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitWhileSCAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfSCASTContext extends SingleCommandContext {
		public TerminalNode IF() { return getToken(Parser2.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(Parser2.THEN, 0); }
		public List<SingleCommandContext> singleCommand() {
			return getRuleContexts(SingleCommandContext.class);
		}
		public SingleCommandContext singleCommand(int i) {
			return getRuleContext(SingleCommandContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Parser2.ELSE, 0); }
		public IfSCASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitIfSCAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockSCASTContext extends SingleCommandContext {
		public TerminalNode BEGIN() { return getToken(Parser2.BEGIN, 0); }
		public CommandASTContext commandAST() {
			return getRuleContext(CommandASTContext.class,0);
		}
		public TerminalNode END() { return getToken(Parser2.END, 0); }
		public BlockSCASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitBlockSCAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleCommandContext singleCommand() throws RecognitionException {
		SingleCommandContext _localctx = new SingleCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleCommand);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AssignSCASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(ID);
				setState(28);
				match(ASSIGN);
				setState(29);
				expression();
				}
				break;
			case PIZQ:
				_localctx = new FunCallSCASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(PIZQ);
				setState(31);
				expression();
				setState(32);
				match(PDER);
				}
				break;
			case IF:
				_localctx = new IfSCASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				match(IF);
				setState(35);
				expression();
				setState(36);
				match(THEN);
				setState(37);
				singleCommand();
				setState(38);
				match(ELSE);
				setState(39);
				singleCommand();
				}
				break;
			case WHILE:
				_localctx = new WhileSCASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				match(WHILE);
				setState(42);
				expression();
				setState(43);
				match(DO);
				setState(44);
				singleCommand();
				}
				break;
			case LET:
				_localctx = new LetSCASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				match(LET);
				setState(47);
				declaration();
				setState(48);
				match(IN);
				setState(49);
				singleCommand();
				}
				break;
			case BEGIN:
				_localctx = new BlockSCASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				match(BEGIN);
				setState(52);
				commandAST();
				setState(53);
				match(END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationASTContext extends DeclarationContext {
		public List<SingleDeclarationContext> singleDeclaration() {
			return getRuleContexts(SingleDeclarationContext.class);
		}
		public SingleDeclarationContext singleDeclaration(int i) {
			return getRuleContext(SingleDeclarationContext.class,i);
		}
		public List<TerminalNode> PyCOMA() { return getTokens(Parser2.PyCOMA); }
		public TerminalNode PyCOMA(int i) {
			return getToken(Parser2.PyCOMA, i);
		}
		public DeclarationASTContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitDeclarationAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			_localctx = new DeclarationASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			singleDeclaration();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PyCOMA) {
				{
				{
				setState(58);
				match(PyCOMA);
				setState(59);
				singleDeclaration();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleDeclarationContext extends ParserRuleContext {
		public SingleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDeclaration; }
	 
		public SingleDeclarationContext() { }
		public void copyFrom(SingleDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstDeclASTContext extends SingleDeclarationContext {
		public TerminalNode CONST() { return getToken(Parser2.CONST, 0); }
		public TerminalNode ID() { return getToken(Parser2.ID, 0); }
		public TerminalNode VIR() { return getToken(Parser2.VIR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstDeclASTContext(SingleDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitConstDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclASTContext extends SingleDeclarationContext {
		public TerminalNode VAR() { return getToken(Parser2.VAR, 0); }
		public TerminalNode ID() { return getToken(Parser2.ID, 0); }
		public TerminalNode DOSPUN() { return getToken(Parser2.DOSPUN, 0); }
		public TypedenoterContext typedenoter() {
			return getRuleContext(TypedenoterContext.class,0);
		}
		public VarDeclASTContext(SingleDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitVarDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDeclarationContext singleDeclaration() throws RecognitionException {
		SingleDeclarationContext _localctx = new SingleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleDeclaration);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				_localctx = new ConstDeclASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(CONST);
				setState(66);
				match(ID);
				setState(67);
				match(VIR);
				setState(68);
				expression();
				}
				break;
			case VAR:
				_localctx = new VarDeclASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(VAR);
				setState(70);
				match(ID);
				setState(71);
				match(DOSPUN);
				setState(72);
				typedenoter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedenoterContext extends ParserRuleContext {
		public TypedenoterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedenoter; }
	 
		public TypedenoterContext() { }
		public void copyFrom(TypedenoterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypedenoterASTContext extends TypedenoterContext {
		public TerminalNode ID() { return getToken(Parser2.ID, 0); }
		public TypedenoterASTContext(TypedenoterContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitTypedenoterAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedenoterContext typedenoter() throws RecognitionException {
		TypedenoterContext _localctx = new TypedenoterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typedenoter);
		try {
			_localctx = new TypedenoterASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionASTContext extends ExpressionContext {
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(Parser2.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(Parser2.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(Parser2.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(Parser2.MINUS, i);
		}
		public List<TerminalNode> MULT() { return getTokens(Parser2.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(Parser2.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(Parser2.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(Parser2.DIV, i);
		}
		public ExpressionASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			_localctx = new ExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			primaryExpression();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << PLUS) | (1L << MINUS) | (1L << MULT))) != 0)) {
				{
				{
				setState(78);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << PLUS) | (1L << MINUS) | (1L << MULT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(79);
				primaryExpression();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumPEASTContext extends PrimaryExpressionContext {
		public TerminalNode NUM() { return getToken(Parser2.NUM, 0); }
		public NumPEASTContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitNumPEAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdPEASTContext extends PrimaryExpressionContext {
		public TerminalNode ID() { return getToken(Parser2.ID, 0); }
		public IdPEASTContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitIdPEAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GroupPEASTContext extends PrimaryExpressionContext {
		public TerminalNode PIZQ() { return getToken(Parser2.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(Parser2.PDER, 0); }
		public GroupPEASTContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitGroupPEAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primaryExpression);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new NumPEASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(NUM);
				}
				break;
			case ID:
				_localctx = new IdPEASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(ID);
				}
				break;
			case PIZQ:
				_localctx = new GroupPEASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(PIZQ);
				setState(88);
				expression();
				setState(89);
				match(PDER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35`\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4:\n\4\3\5\3\5\3\5\7\5?\n\5\f\5\16\5B\13\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6L\n\6\3\7\3\7\3\b\3\b\3\b\7\bS\n\b\f\b\16\bV\13\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t^\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\3\4\2\f\f"+
		"\33\35\2b\2\22\3\2\2\2\4\25\3\2\2\2\69\3\2\2\2\b;\3\2\2\2\nK\3\2\2\2\f"+
		"M\3\2\2\2\16O\3\2\2\2\20]\3\2\2\2\22\23\5\6\4\2\23\24\7\2\2\3\24\3\3\2"+
		"\2\2\25\32\5\6\4\2\26\27\7\3\2\2\27\31\5\6\4\2\30\26\3\2\2\2\31\34\3\2"+
		"\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\5\3\2\2\2\34\32\3\2\2\2\35\36\7\30"+
		"\2\2\36\37\7\4\2\2\37:\5\16\b\2 !\7\5\2\2!\"\5\16\b\2\"#\7\6\2\2#:\3\2"+
		"\2\2$%\7\r\2\2%&\5\16\b\2&\'\7\20\2\2\'(\5\6\4\2()\7\21\2\2)*\5\6\4\2"+
		"*:\3\2\2\2+,\7\16\2\2,-\5\16\b\2-.\7\23\2\2./\5\6\4\2/:\3\2\2\2\60\61"+
		"\7\17\2\2\61\62\5\b\5\2\62\63\7\22\2\2\63\64\5\6\4\2\64:\3\2\2\2\65\66"+
		"\7\24\2\2\66\67\5\4\3\2\678\7\25\2\28:\3\2\2\29\35\3\2\2\29 \3\2\2\29"+
		"$\3\2\2\29+\3\2\2\29\60\3\2\2\29\65\3\2\2\2:\7\3\2\2\2;@\5\n\6\2<=\7\3"+
		"\2\2=?\5\n\6\2><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\t\3\2\2\2B@\3"+
		"\2\2\2CD\7\26\2\2DE\7\30\2\2EF\7\7\2\2FL\5\16\b\2GH\7\27\2\2HI\7\30\2"+
		"\2IJ\7\b\2\2JL\5\f\7\2KC\3\2\2\2KG\3\2\2\2L\13\3\2\2\2MN\7\30\2\2N\r\3"+
		"\2\2\2OT\5\20\t\2PQ\t\2\2\2QS\5\20\t\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2T"+
		"U\3\2\2\2U\17\3\2\2\2VT\3\2\2\2W^\7\31\2\2X^\7\30\2\2YZ\7\5\2\2Z[\5\16"+
		"\b\2[\\\7\6\2\2\\^\3\2\2\2]W\3\2\2\2]X\3\2\2\2]Y\3\2\2\2^\21\3\2\2\2\b"+
		"\329@KT]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}