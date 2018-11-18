// Generated from fr/upjv/mis/GelParser.g4 by ANTLR 4.7.1
package fr.upjv.mis;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GelParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GelParser#gelExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGelExpression(GelParser.GelExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#basicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicExpression(GelParser.BasicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#xorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorExpression(GelParser.XorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(GelParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(GelParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#notOrNotNotExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOrNotNotExpression(GelParser.NotOrNotNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#notExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(GelParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#affirmativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffirmativeExpression(GelParser.AffirmativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#greaterThanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanExpression(GelParser.GreaterThanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#greaterOrEqualExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterOrEqualExpression(GelParser.GreaterOrEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#lessThanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanExpression(GelParser.LessThanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#lessOrEqualExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessOrEqualExpression(GelParser.LessOrEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#compareExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpression(GelParser.CompareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#equalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpression(GelParser.EqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#differentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifferentExpression(GelParser.DifferentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#addOrSubExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOrSubExpression(GelParser.AddOrSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#addOrSubHalfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOrSubHalfExpression(GelParser.AddOrSubHalfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#addExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(GelParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#subExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(GelParser.SubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#multOrDivExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOrDivExpression(GelParser.MultOrDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#multOrDivHalfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOrDivHalfExpression(GelParser.MultOrDivHalfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#multExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpression(GelParser.MultExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#divExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpression(GelParser.DivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#modExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExpression(GelParser.ModExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(GelParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#parenthesisExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpression(GelParser.ParenthesisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#navExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavExpression(GelParser.NavExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#rightToLeft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightToLeft(GelParser.RightToLeftContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#leftToRight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftToRight(GelParser.LeftToRightContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#ofRightToLeft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOfRightToLeft(GelParser.OfRightToLeftContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#ofLeftToRight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOfLeftToRight(GelParser.OfLeftToRightContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(GelParser.StepContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#finalStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalStep(GelParser.FinalStepContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#oclIsNew}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclIsNew(GelParser.OclIsNewContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#oclIsTypeOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclIsTypeOf(GelParser.OclIsTypeOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#oclIsKindOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclIsKindOf(GelParser.OclIsKindOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GelParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#attributeNavExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeNavExpression(GelParser.AttributeNavExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#atPreExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtPreExpression(GelParser.AtPreExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#prefixedAtPreExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixedAtPreExpression(GelParser.PrefixedAtPreExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#postfixedAtPreExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixedAtPreExpression(GelParser.PostfixedAtPreExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#asTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsTypeExpression(GelParser.AsTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#methodNavExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodNavExpression(GelParser.MethodNavExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#collOpExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollOpExpression(GelParser.CollOpExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#variableRefExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableRefExpression(GelParser.VariableRefExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#variableOrMemberAtPre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableOrMemberAtPre(GelParser.VariableOrMemberAtPreContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(GelParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#variableDeclarationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationExpression(GelParser.VariableDeclarationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#typeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeExpression(GelParser.TypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#atomicTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicTypeExpression(GelParser.AtomicTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#sequenceTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceTypeExpression(GelParser.SequenceTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#bagTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBagTypeExpression(GelParser.BagTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#setTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTypeExpression(GelParser.SetTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#orderedSetTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedSetTypeExpression(GelParser.OrderedSetTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#oppExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOppExpression(GelParser.OppExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#selfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfExpression(GelParser.SelfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#variableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(GelParser.VariableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(GelParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(GelParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(GelParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(GelParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointLiteral(GelParser.FloatingPointLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(GelParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#dateLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateLiteral(GelParser.DateLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#characterLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterLiteral(GelParser.CharacterLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(GelParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#nullLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(GelParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#regexLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexLiteral(GelParser.RegexLiteralContext ctx);
}