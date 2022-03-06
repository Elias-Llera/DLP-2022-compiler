// Generated from C:/Users/Elías/IdeaProjects/DLP compiler/src/parser\Pmm.g4 by ANTLR 4.9.2
package parser;

import ast.*;
import ast.definition.*;
import ast.expression.*;
import ast.expression.binary.*;
import ast.expression.unary.*;
import ast.expression.value.*;
import ast.statement.*;
import ast.type.*;
import parser.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, INT_CONSTANT=37, REAL_CONSTANT=38, 
		CHAR_CONSTANT=39, ID=40, TRASH=41;
	public static final int
		RULE_program = 0, RULE_variable_definition = 1, RULE_funtion_definition = 2, 
		RULE_statement = 3, RULE_body = 4, RULE_expression = 5, RULE_built_in_type = 6, 
		RULE_type = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "variable_definition", "funtion_definition", "statement", 
			"body", "expression", "built_in_type", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "':'", "';'", "'def'", "'('", "')'", "'{'", "'}'", "'print'", 
			"'input'", "'='", "'if'", "'else'", "'while'", "'return'", "'['", "']'", 
			"'.'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>='", "'>'", "'<='", 
			"'<'", "'!='", "'=='", "'&&'", "'||'", "'char'", "'int'", "'double'", 
			"'struct'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "ID", "TRASH"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public AstNode ast;
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			((ProgramContext)_localctx).type = type();
			 ((ProgramContext)_localctx).ast =  ((ProgramContext)_localctx).type.ast; 
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

	public static class Variable_definitionContext extends ParserRuleContext {
		public List<VariableDefinition> ast = new ArrayList<>();
		public List<String> names = new ArrayList<>();
		public Token id1;
		public Token id2;
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public Variable_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVariable_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_definitionContext variable_definition() throws RecognitionException {
		Variable_definitionContext _localctx = new Variable_definitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variable_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			((Variable_definitionContext)_localctx).id1 = match(ID);
			 _localctx.names.add((((Variable_definitionContext)_localctx).id1!=null?((Variable_definitionContext)_localctx).id1.getText():null)); 
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(21);
				match(T__0);
				setState(22);
				((Variable_definitionContext)_localctx).id2 = match(ID);
				 _localctx.names.add((((Variable_definitionContext)_localctx).id2!=null?((Variable_definitionContext)_localctx).id2.getText():null)); 
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			match(T__1);
			setState(30);
			((Variable_definitionContext)_localctx).type = type();
			setState(31);
			match(T__2);
			 _localctx.names.forEach( name-> _localctx.ast.add(new VariableDefinition(name, ((Variable_definitionContext)_localctx).type.ast, ((Variable_definitionContext)_localctx).id1.getLine(), ((Variable_definitionContext)_localctx).id1.getCharPositionInLine()+1))); 
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

	public static class Funtion_definitionContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public List<VariableDefinition> variableDefinitions = new ArrayList<>();
		public Token idFunction;
		public Token id1;
		public Built_in_typeContext t1;
		public Token id2;
		public Built_in_typeContext t2;
		public TypeContext type;
		public Variable_definitionContext variable_definition;
		public StatementContext statement;
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<Variable_definitionContext> variable_definition() {
			return getRuleContexts(Variable_definitionContext.class);
		}
		public Variable_definitionContext variable_definition(int i) {
			return getRuleContext(Variable_definitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Built_in_typeContext> built_in_type() {
			return getRuleContexts(Built_in_typeContext.class);
		}
		public Built_in_typeContext built_in_type(int i) {
			return getRuleContext(Built_in_typeContext.class,i);
		}
		public Funtion_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funtion_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFuntion_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funtion_definitionContext funtion_definition() throws RecognitionException {
		Funtion_definitionContext _localctx = new Funtion_definitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funtion_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__3);
			setState(35);
			((Funtion_definitionContext)_localctx).idFunction = match(ID);
			setState(36);
			match(T__4);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(37);
				((Funtion_definitionContext)_localctx).id1 = match(ID);
				setState(38);
				match(T__1);
				setState(39);
				((Funtion_definitionContext)_localctx).t1 = built_in_type();
				 _localctx.variableDefinitions.add(new VariableDefinition((((Funtion_definitionContext)_localctx).id1!=null?((Funtion_definitionContext)_localctx).id1.getText():null), ((Funtion_definitionContext)_localctx).t1.ast, ((Funtion_definitionContext)_localctx).id1.getLine(), ((Funtion_definitionContext)_localctx).id1.getCharPositionInLine()+1)); 
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(41);
					match(T__0);
					setState(42);
					((Funtion_definitionContext)_localctx).id2 = match(ID);
					setState(43);
					match(T__1);
					setState(44);
					((Funtion_definitionContext)_localctx).t2 = built_in_type();
					 _localctx.variableDefinitions.add(new VariableDefinition((((Funtion_definitionContext)_localctx).id2!=null?((Funtion_definitionContext)_localctx).id2.getText():null), ((Funtion_definitionContext)_localctx).t2.ast, ((Funtion_definitionContext)_localctx).id2.getLine(), ((Funtion_definitionContext)_localctx).id2.getCharPositionInLine()+1)); 
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(54);
			match(T__5);
			setState(55);
			match(T__1);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) {
				{
				setState(56);
				((Funtion_definitionContext)_localctx).type = type();
				}
			}

			 ((Funtion_definitionContext)_localctx).ast =  new FunctionDefinition((((Funtion_definitionContext)_localctx).idFunction!=null?((Funtion_definitionContext)_localctx).idFunction.getText():null), ((Funtion_definitionContext)_localctx).type.ast, ((Funtion_definitionContext)_localctx).idFunction.getLine(), ((Funtion_definitionContext)_localctx).idFunction.getCharPositionInLine()+1); 
			setState(60);
			match(T__6);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61);
					((Funtion_definitionContext)_localctx).variable_definition = variable_definition();
					_localctx.ast.addVariableDefinitions(((Funtion_definitionContext)_localctx).variable_definition.ast);
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
				{
				{
				setState(69);
				((Funtion_definitionContext)_localctx).statement = statement();
				_localctx.ast.addStatements(((Funtion_definitionContext)_localctx).statement.ast);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(T__7);

			        _localctx.ast.addVariableDefinitions(_localctx.variableDefinitions);
			    
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

	public static class StatementContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();
		public ExpressionContext ex1;
		public ExpressionContext ex2;
		public ExpressionContext expression;
		public BodyContext b1;
		public BodyContext b2;
		public BodyContext body;
		public Token ID;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(T__8);
				setState(81);
				((StatementContext)_localctx).ex1 = expression(0);
				 _localctx.ast.add(new Print(((StatementContext)_localctx).ex1.ast, ((StatementContext)_localctx).ex1.ast.getLine(), ((StatementContext)_localctx).ex1.ast.getColumn())); 
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(83);
					match(T__0);
					setState(84);
					((StatementContext)_localctx).ex2 = expression(0);
					 _localctx.ast.add(new Print(((StatementContext)_localctx).ex2.ast, ((StatementContext)_localctx).ex2.ast.getLine(), ((StatementContext)_localctx).ex2.ast.getColumn())); 
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(T__9);
				setState(95);
				((StatementContext)_localctx).expression = expression(0);
				setState(96);
				match(T__2);

				            _localctx.ast.add(new Input(((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).expression.ast.getLine(), ((StatementContext)_localctx).expression.ast.getColumn()));
				         
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				((StatementContext)_localctx).ex1 = expression(0);
				setState(100);
				match(T__10);
				setState(101);
				((StatementContext)_localctx).ex2 = expression(0);
				setState(102);
				match(T__2);

				            _localctx.ast.add(new Assignment(((StatementContext)_localctx).ex1.ast, ((StatementContext)_localctx).ex2.ast, ((StatementContext)_localctx).ex1.ast.getLine(), ((StatementContext)_localctx).ex1.ast.getColumn()));
				         
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(T__11);
				setState(106);
				((StatementContext)_localctx).expression = expression(0);
				setState(107);
				match(T__1);
				setState(108);
				((StatementContext)_localctx).b1 = body();
				setState(111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(109);
					match(T__12);
					setState(110);
					((StatementContext)_localctx).b2 = body();
					}
					break;
				}

				            IfElse ifElse;
				            if(((StatementContext)_localctx).b2.ast != null){
				                ifElse = new IfElse(((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).b1.ast, ((StatementContext)_localctx).b2.ast, ((StatementContext)_localctx).expression.ast.getLine(), ((StatementContext)_localctx).expression.ast.getColumn());
				            } else {
				                ifElse = new IfElse(((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).b1.ast, ((StatementContext)_localctx).expression.ast.getLine(), ((StatementContext)_localctx).expression.ast.getColumn());
				            }
				            _localctx.ast.add(ifElse);
				         
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				match(T__13);
				setState(116);
				((StatementContext)_localctx).expression = expression(0);
				setState(117);
				match(T__1);
				setState(118);
				((StatementContext)_localctx).body = body();

				            _localctx.ast.add(new While(((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).body.ast, ((StatementContext)_localctx).expression.ast.getLine(), ((StatementContext)_localctx).expression.ast.getColumn()));
				         
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(121);
				match(T__14);
				setState(122);
				((StatementContext)_localctx).expression = expression(0);
				setState(123);
				match(T__2);

				            _localctx.ast.add(new Return(((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).expression.ast.getLine(), ((StatementContext)_localctx).expression.ast.getColumn()));
				         
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(126);
				((StatementContext)_localctx).ID = match(ID);

				                                    int line, column;
				                                    line = ((StatementContext)_localctx).ID.getLine();
				                                    column = ((StatementContext)_localctx).ID.getCharPositionInLine()+1;
				                                    FunctionInvocation functionInvocation = new FunctionInvocation(
				                                                                                new Variable((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), line, column),
				                                                                                line, column);
				                               
				setState(128);
				match(T__4);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					setState(129);
					((StatementContext)_localctx).ex1 = expression(0);
					 functionInvocation.addParameter(((StatementContext)_localctx).ex1.ast); 
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(131);
						match(T__0);
						setState(132);
						((StatementContext)_localctx).ex2 = expression(0);
						 functionInvocation.addParameter(((StatementContext)_localctx).ex2.ast); 
						}
						}
						setState(139);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(142);
				match(T__5);
				setState(143);
				match(T__2);

				                _localctx.ast.add(functionInvocation);
				            
				}
				break;
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

	public static class BodyContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_body);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(T__6);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					{
					setState(148);
					((BodyContext)_localctx).statement = statement();
					 _localctx.ast.addAll(((BodyContext)_localctx).statement.ast); 
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				match(T__7);
				}
				break;
			case T__4:
			case T__8:
			case T__9:
			case T__11:
			case T__13:
			case T__14:
			case T__18:
			case T__19:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				((BodyContext)_localctx).statement = statement();
				 _localctx.ast.addAll(((BodyContext)_localctx).statement.ast); 
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext ex1;
		public ExpressionContext ex;
		public Token INT_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token REAL_CONSTANT;
		public Token ID;
		public ExpressionContext expression;
		public ExpressionContext ex2;
		public Built_in_typeContext built_in_type;
		public Token OP;
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Built_in_typeContext built_in_type() {
			return getRuleContext(Built_in_typeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(163);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);

				                ((ExpressionContext)_localctx).ast =  new IntLiteral(LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)),
				                    ((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1);
				            
				}
				break;
			case 2:
				{
				setState(165);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);

				                ((ExpressionContext)_localctx).ast =  new CharLiteral(LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)),
				                    ((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1);
				            
				}
				break;
			case 3:
				{
				setState(167);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);

				                ((ExpressionContext)_localctx).ast =  new DoubleLiteral(LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)),
				                    ((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1);
				            
				}
				break;
			case 4:
				{
				setState(169);
				((ExpressionContext)_localctx).ID = match(ID);

				                ((ExpressionContext)_localctx).ast =  new Variable((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null),
				                   ((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1);
				            
				}
				break;
			case 5:
				{
				setState(171);
				((ExpressionContext)_localctx).ID = match(ID);

				                                    int line, column;
				                                    line = ((ExpressionContext)_localctx).ID.getLine();
				                                    column = ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1;
				                                    FunctionInvocation functionInvocation = new FunctionInvocation(
				                                                                                new Variable((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), line, column),
				                                                                                line, column);
				                               
				setState(173);
				match(T__4);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					setState(174);
					((ExpressionContext)_localctx).ex1 = ((ExpressionContext)_localctx).expression = expression(0);
					 functionInvocation.addParameter(((ExpressionContext)_localctx).ex1.ast); 
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(176);
						match(T__0);
						setState(177);
						((ExpressionContext)_localctx).ex2 = ((ExpressionContext)_localctx).expression = expression(0);
						 functionInvocation.addParameter(((ExpressionContext)_localctx).ex2.ast); 
						}
						}
						setState(184);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(187);
				match(T__5);

				                ((ExpressionContext)_localctx).ast =  functionInvocation;
				            
				}
				break;
			case 6:
				{
				setState(189);
				match(T__4);
				setState(190);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(191);
				match(T__5);

				                ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				            
				}
				break;
			case 7:
				{
				setState(194);
				match(T__4);
				setState(195);
				((ExpressionContext)_localctx).built_in_type = built_in_type();
				setState(196);
				match(T__5);
				setState(197);
				((ExpressionContext)_localctx).expression = expression(7);

				                ((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).built_in_type.ast, ((ExpressionContext)_localctx).expression.ast,
				                    ((ExpressionContext)_localctx).expression.ast.getLine(), ((ExpressionContext)_localctx).expression.ast.getColumn());
				            
				}
				break;
			case 8:
				{
				setState(200);
				match(T__18);
				setState(201);
				((ExpressionContext)_localctx).expression = expression(6);

				                ((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).expression.ast,
				                    ((ExpressionContext)_localctx).expression.ast.getLine(), ((ExpressionContext)_localctx).expression.ast.getColumn());
				            
				}
				break;
			case 9:
				{
				setState(204);
				match(T__19);
				setState(205);
				((ExpressionContext)_localctx).expression = expression(5);

				                ((ExpressionContext)_localctx).ast =  new Negation(((ExpressionContext)_localctx).expression.ast,
				                    ((ExpressionContext)_localctx).expression.ast.getLine(), ((ExpressionContext)_localctx).expression.ast.getColumn());
				            
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(240);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(210);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(211);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(212);
						((ExpressionContext)_localctx).ex2 = ((ExpressionContext)_localctx).expression = expression(5);

						                          ((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).ex1.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).ex2.ast,
						                              ((ExpressionContext)_localctx).ex1.ast.getLine(), ((ExpressionContext)_localctx).ex1.ast.getColumn());
						                      
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(215);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(216);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__23) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(217);
						((ExpressionContext)_localctx).ex2 = ((ExpressionContext)_localctx).expression = expression(4);

						                          ((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).ex1.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).ex2.ast,
						                              ((ExpressionContext)_localctx).ex1.ast.getLine(), ((ExpressionContext)_localctx).ex1.ast.getColumn());
						                      
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(220);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(221);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(222);
						((ExpressionContext)_localctx).ex2 = ((ExpressionContext)_localctx).expression = expression(3);

						                          ((ExpressionContext)_localctx).ast =  new Comparisson(((ExpressionContext)_localctx).ex1.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).ex2.ast,
						                              ((ExpressionContext)_localctx).ex1.ast.getLine(), ((ExpressionContext)_localctx).ex1.ast.getColumn());
						                      
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(225);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(226);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__30 || _la==T__31) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(227);
						((ExpressionContext)_localctx).ex2 = ((ExpressionContext)_localctx).expression = expression(2);

						                          ((ExpressionContext)_localctx).ast =  new Logical(((ExpressionContext)_localctx).ex1.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).ex2.ast,
						                              ((ExpressionContext)_localctx).ex1.ast.getLine(), ((ExpressionContext)_localctx).ex1.ast.getColumn());
						                      
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(231);
						match(T__15);
						setState(232);
						((ExpressionContext)_localctx).ex2 = ((ExpressionContext)_localctx).expression = expression(0);
						setState(233);
						match(T__16);

						                          ((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).ex1.ast, ((ExpressionContext)_localctx).ex2.ast,
						                              ((ExpressionContext)_localctx).ex1.ast.getLine(), ((ExpressionContext)_localctx).ex1.ast.getColumn());
						                      
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ex = _prevctx;
						_localctx.ex = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(236);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(237);
						match(T__17);
						setState(238);
						((ExpressionContext)_localctx).ID = match(ID);

						                          ((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).ex.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null),
						                              ((ExpressionContext)_localctx).ex.ast.getLine(), ((ExpressionContext)_localctx).ex.ast.getColumn());
						                      
						}
						break;
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Built_in_typeContext extends ParserRuleContext {
		public Type ast;
		public Built_in_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_built_in_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitBuilt_in_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Built_in_typeContext built_in_type() throws RecognitionException {
		Built_in_typeContext _localctx = new Built_in_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_built_in_type);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(T__32);

				                    ((Built_in_typeContext)_localctx).ast =  CharType.getInstance();
				                
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(T__33);

				                    ((Built_in_typeContext)_localctx).ast =  IntegerType.getInstance();
				                
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(T__34);

				                    ((Built_in_typeContext)_localctx).ast =  DoubleType.getInstance();
				                
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

	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public Built_in_typeContext built_in_type;
		public Token lineMarker;
		public Token INT_CONSTANT;
		public TypeContext type;
		public Token struct_keyword;
		public Token ID;
		public Built_in_typeContext built_in_type() {
			return getRuleContext(Built_in_typeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				((TypeContext)_localctx).built_in_type = built_in_type();

				        ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).built_in_type.ast;
				    
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				((TypeContext)_localctx).lineMarker = match(T__15);
				setState(257);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(258);
				match(T__16);
				setState(259);
				((TypeContext)_localctx).type = type();

				        ((TypeContext)_localctx).ast =  new ArrayType(LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)), ((TypeContext)_localctx).type.ast,
				            ((TypeContext)_localctx).lineMarker.getLine(), ((TypeContext)_localctx).lineMarker.getCharPositionInLine()+1);
				    
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				((TypeContext)_localctx).struct_keyword = match(T__35);
				 RecordType record = new RecordType(((TypeContext)_localctx).struct_keyword.getLine(), ((TypeContext)_localctx).struct_keyword.getCharPositionInLine()+1); 
				setState(264);
				match(T__6);
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(265);
					((TypeContext)_localctx).ID = match(ID);
					setState(266);
					match(T__1);
					setState(267);
					((TypeContext)_localctx).type = type();
					setState(268);
					match(T__2);
					 record.addField(new RecordField(((TypeContext)_localctx).type.ast, (((TypeContext)_localctx).ID!=null?((TypeContext)_localctx).ID.getText():null))); 
					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(276);
				match(T__7);

				        ((TypeContext)_localctx).ast =  record;
				      
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u011b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\62\n\4\f\4\16\4\65"+
		"\13\4\5\4\67\n\4\3\4\3\4\3\4\5\4<\n\4\3\4\3\4\3\4\3\4\3\4\7\4C\n\4\f\4"+
		"\16\4F\13\4\3\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5r\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5\u008a\n\5\f\5\16\5\u008d\13\5\5\5\u008f\n\5\3\5\3\5\3\5\5\5"+
		"\u0094\n\5\3\6\3\6\3\6\3\6\7\6\u009a\n\6\f\6\16\6\u009d\13\6\3\6\3\6\3"+
		"\6\3\6\5\6\u00a3\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7\u00b7\n\7\f\7\16\7\u00ba\13\7\5\7\u00bc\n\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u00d3\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7\u00f3\n\7\f\7\16\7\u00f6\13\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u00fe\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\7\t\u0112\n\t\f\t\16\t\u0115\13\t\3\t\3\t\5\t\u0119\n\t\3"+
		"\t\2\3\f\n\2\4\6\b\n\f\16\20\2\6\3\2\27\31\4\2\25\25\32\32\3\2\33 \3\2"+
		"!\"\2\u0139\2\22\3\2\2\2\4\25\3\2\2\2\6$\3\2\2\2\b\u0093\3\2\2\2\n\u00a2"+
		"\3\2\2\2\f\u00d2\3\2\2\2\16\u00fd\3\2\2\2\20\u0118\3\2\2\2\22\23\5\20"+
		"\t\2\23\24\b\2\1\2\24\3\3\2\2\2\25\26\7*\2\2\26\34\b\3\1\2\27\30\7\3\2"+
		"\2\30\31\7*\2\2\31\33\b\3\1\2\32\27\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2"+
		"\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7\4\2\2 !\5\20\t\2!\""+
		"\7\5\2\2\"#\b\3\1\2#\5\3\2\2\2$%\7\6\2\2%&\7*\2\2&\66\7\7\2\2\'(\7*\2"+
		"\2()\7\4\2\2)*\5\16\b\2*\63\b\4\1\2+,\7\3\2\2,-\7*\2\2-.\7\4\2\2./\5\16"+
		"\b\2/\60\b\4\1\2\60\62\3\2\2\2\61+\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2"+
		"\63\64\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\66\'\3\2\2\2\66\67\3\2\2\2"+
		"\678\3\2\2\289\7\b\2\29;\7\4\2\2:<\5\20\t\2;:\3\2\2\2;<\3\2\2\2<=\3\2"+
		"\2\2=>\b\4\1\2>D\7\t\2\2?@\5\4\3\2@A\b\4\1\2AC\3\2\2\2B?\3\2\2\2CF\3\2"+
		"\2\2DB\3\2\2\2DE\3\2\2\2EL\3\2\2\2FD\3\2\2\2GH\5\b\5\2HI\b\4\1\2IK\3\2"+
		"\2\2JG\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\n"+
		"\2\2PQ\b\4\1\2Q\7\3\2\2\2RS\7\13\2\2ST\5\f\7\2T[\b\5\1\2UV\7\3\2\2VW\5"+
		"\f\7\2WX\b\5\1\2XZ\3\2\2\2YU\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\"+
		"^\3\2\2\2][\3\2\2\2^_\7\5\2\2_\u0094\3\2\2\2`a\7\f\2\2ab\5\f\7\2bc\7\5"+
		"\2\2cd\b\5\1\2d\u0094\3\2\2\2ef\5\f\7\2fg\7\r\2\2gh\5\f\7\2hi\7\5\2\2"+
		"ij\b\5\1\2j\u0094\3\2\2\2kl\7\16\2\2lm\5\f\7\2mn\7\4\2\2nq\5\n\6\2op\7"+
		"\17\2\2pr\5\n\6\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\b\5\1\2t\u0094\3\2\2"+
		"\2uv\7\20\2\2vw\5\f\7\2wx\7\4\2\2xy\5\n\6\2yz\b\5\1\2z\u0094\3\2\2\2{"+
		"|\7\21\2\2|}\5\f\7\2}~\7\5\2\2~\177\b\5\1\2\177\u0094\3\2\2\2\u0080\u0081"+
		"\7*\2\2\u0081\u0082\b\5\1\2\u0082\u008e\7\7\2\2\u0083\u0084\5\f\7\2\u0084"+
		"\u008b\b\5\1\2\u0085\u0086\7\3\2\2\u0086\u0087\5\f\7\2\u0087\u0088\b\5"+
		"\1\2\u0088\u008a\3\2\2\2\u0089\u0085\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u0083\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\7\b\2\2\u0091\u0092\7\5\2\2\u0092\u0094\b\5\1\2\u0093R\3\2\2\2"+
		"\u0093`\3\2\2\2\u0093e\3\2\2\2\u0093k\3\2\2\2\u0093u\3\2\2\2\u0093{\3"+
		"\2\2\2\u0093\u0080\3\2\2\2\u0094\t\3\2\2\2\u0095\u009b\7\t\2\2\u0096\u0097"+
		"\5\b\5\2\u0097\u0098\b\6\1\2\u0098\u009a\3\2\2\2\u0099\u0096\3\2\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009e\u00a3\7\n\2\2\u009f\u00a0\5\b\5\2\u00a0"+
		"\u00a1\b\6\1\2\u00a1\u00a3\3\2\2\2\u00a2\u0095\3\2\2\2\u00a2\u009f\3\2"+
		"\2\2\u00a3\13\3\2\2\2\u00a4\u00a5\b\7\1\2\u00a5\u00a6\7\'\2\2\u00a6\u00d3"+
		"\b\7\1\2\u00a7\u00a8\7)\2\2\u00a8\u00d3\b\7\1\2\u00a9\u00aa\7(\2\2\u00aa"+
		"\u00d3\b\7\1\2\u00ab\u00ac\7*\2\2\u00ac\u00d3\b\7\1\2\u00ad\u00ae\7*\2"+
		"\2\u00ae\u00af\b\7\1\2\u00af\u00bb\7\7\2\2\u00b0\u00b1\5\f\7\2\u00b1\u00b8"+
		"\b\7\1\2\u00b2\u00b3\7\3\2\2\u00b3\u00b4\5\f\7\2\u00b4\u00b5\b\7\1\2\u00b5"+
		"\u00b7\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00b0\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\b"+
		"\2\2\u00be\u00d3\b\7\1\2\u00bf\u00c0\7\7\2\2\u00c0\u00c1\5\f\7\2\u00c1"+
		"\u00c2\7\b\2\2\u00c2\u00c3\b\7\1\2\u00c3\u00d3\3\2\2\2\u00c4\u00c5\7\7"+
		"\2\2\u00c5\u00c6\5\16\b\2\u00c6\u00c7\7\b\2\2\u00c7\u00c8\5\f\7\t\u00c8"+
		"\u00c9\b\7\1\2\u00c9\u00d3\3\2\2\2\u00ca\u00cb\7\25\2\2\u00cb\u00cc\5"+
		"\f\7\b\u00cc\u00cd\b\7\1\2\u00cd\u00d3\3\2\2\2\u00ce\u00cf\7\26\2\2\u00cf"+
		"\u00d0\5\f\7\7\u00d0\u00d1\b\7\1\2\u00d1\u00d3\3\2\2\2\u00d2\u00a4\3\2"+
		"\2\2\u00d2\u00a7\3\2\2\2\u00d2\u00a9\3\2\2\2\u00d2\u00ab\3\2\2\2\u00d2"+
		"\u00ad\3\2\2\2\u00d2\u00bf\3\2\2\2\u00d2\u00c4\3\2\2\2\u00d2\u00ca\3\2"+
		"\2\2\u00d2\u00ce\3\2\2\2\u00d3\u00f4\3\2\2\2\u00d4\u00d5\f\6\2\2\u00d5"+
		"\u00d6\t\2\2\2\u00d6\u00d7\5\f\7\7\u00d7\u00d8\b\7\1\2\u00d8\u00f3\3\2"+
		"\2\2\u00d9\u00da\f\5\2\2\u00da\u00db\t\3\2\2\u00db\u00dc\5\f\7\6\u00dc"+
		"\u00dd\b\7\1\2\u00dd\u00f3\3\2\2\2\u00de\u00df\f\4\2\2\u00df\u00e0\t\4"+
		"\2\2\u00e0\u00e1\5\f\7\5\u00e1\u00e2\b\7\1\2\u00e2\u00f3\3\2\2\2\u00e3"+
		"\u00e4\f\3\2\2\u00e4\u00e5\t\5\2\2\u00e5\u00e6\5\f\7\4\u00e6\u00e7\b\7"+
		"\1\2\u00e7\u00f3\3\2\2\2\u00e8\u00e9\f\13\2\2\u00e9\u00ea\7\22\2\2\u00ea"+
		"\u00eb\5\f\7\2\u00eb\u00ec\7\23\2\2\u00ec\u00ed\b\7\1\2\u00ed\u00f3\3"+
		"\2\2\2\u00ee\u00ef\f\n\2\2\u00ef\u00f0\7\24\2\2\u00f0\u00f1\7*\2\2\u00f1"+
		"\u00f3\b\7\1\2\u00f2\u00d4\3\2\2\2\u00f2\u00d9\3\2\2\2\u00f2\u00de\3\2"+
		"\2\2\u00f2\u00e3\3\2\2\2\u00f2\u00e8\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\r\3\2\2\2"+
		"\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7#\2\2\u00f8\u00fe\b\b\1\2\u00f9\u00fa"+
		"\7$\2\2\u00fa\u00fe\b\b\1\2\u00fb\u00fc\7%\2\2\u00fc\u00fe\b\b\1\2\u00fd"+
		"\u00f7\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\17\3\2\2"+
		"\2\u00ff\u0100\5\16\b\2\u0100\u0101\b\t\1\2\u0101\u0119\3\2\2\2\u0102"+
		"\u0103\7\22\2\2\u0103\u0104\7\'\2\2\u0104\u0105\7\23\2\2\u0105\u0106\5"+
		"\20\t\2\u0106\u0107\b\t\1\2\u0107\u0119\3\2\2\2\u0108\u0109\7&\2\2\u0109"+
		"\u010a\b\t\1\2\u010a\u0113\7\t\2\2\u010b\u010c\7*\2\2\u010c\u010d\7\4"+
		"\2\2\u010d\u010e\5\20\t\2\u010e\u010f\7\5\2\2\u010f\u0110\b\t\1\2\u0110"+
		"\u0112\3\2\2\2\u0111\u010b\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116"+
		"\u0117\7\n\2\2\u0117\u0119\b\t\1\2\u0118\u00ff\3\2\2\2\u0118\u0102\3\2"+
		"\2\2\u0118\u0108\3\2\2\2\u0119\21\3\2\2\2\27\34\63\66;DL[q\u008b\u008e"+
		"\u0093\u009b\u00a2\u00b8\u00bb\u00d2\u00f2\u00f4\u00fd\u0113\u0118";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}