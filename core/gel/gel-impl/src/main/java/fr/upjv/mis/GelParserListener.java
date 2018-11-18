// Generated from fr/upjv/mis/GelParser.g4 by ANTLR 4.7.1
package fr.upjv.mis;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GelParser}.
 */
public interface GelParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GelParser#gelExpression}.
	 * @param ctx the parse tree
	 */
	void enterGelExpression(GelParser.GelExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#gelExpression}.
	 * @param ctx the parse tree
	 */
	void exitGelExpression(GelParser.GelExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#basicExpression}.
	 * @param ctx the parse tree
	 */
	void enterBasicExpression(GelParser.BasicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#basicExpression}.
	 * @param ctx the parse tree
	 */
	void exitBasicExpression(GelParser.BasicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#xorExpression}.
	 * @param ctx the parse tree
	 */
	void enterXorExpression(GelParser.XorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#xorExpression}.
	 * @param ctx the parse tree
	 */
	void exitXorExpression(GelParser.XorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(GelParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(GelParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(GelParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(GelParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#notOrNotNotExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotOrNotNotExpression(GelParser.NotOrNotNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#notOrNotNotExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotOrNotNotExpression(GelParser.NotOrNotNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(GelParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(GelParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#affirmativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterAffirmativeExpression(GelParser.AffirmativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#affirmativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitAffirmativeExpression(GelParser.AffirmativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#greaterThanExpression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanExpression(GelParser.GreaterThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#greaterThanExpression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanExpression(GelParser.GreaterThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#greaterOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterOrEqualExpression(GelParser.GreaterOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#greaterOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterOrEqualExpression(GelParser.GreaterOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#lessThanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanExpression(GelParser.LessThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#lessThanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanExpression(GelParser.LessThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#lessOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void enterLessOrEqualExpression(GelParser.LessOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#lessOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void exitLessOrEqualExpression(GelParser.LessOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(GelParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(GelParser.CompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#equalExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpression(GelParser.EqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#equalExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpression(GelParser.EqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#differentExpression}.
	 * @param ctx the parse tree
	 */
	void enterDifferentExpression(GelParser.DifferentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#differentExpression}.
	 * @param ctx the parse tree
	 */
	void exitDifferentExpression(GelParser.DifferentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#addOrSubExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddOrSubExpression(GelParser.AddOrSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#addOrSubExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddOrSubExpression(GelParser.AddOrSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#addOrSubHalfExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddOrSubHalfExpression(GelParser.AddOrSubHalfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#addOrSubHalfExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddOrSubHalfExpression(GelParser.AddOrSubHalfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(GelParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(GelParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(GelParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(GelParser.SubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#multOrDivExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultOrDivExpression(GelParser.MultOrDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#multOrDivExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultOrDivExpression(GelParser.MultOrDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#multOrDivHalfExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultOrDivHalfExpression(GelParser.MultOrDivHalfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#multOrDivHalfExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultOrDivHalfExpression(GelParser.MultOrDivHalfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultExpression(GelParser.MultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultExpression(GelParser.MultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#divExpression}.
	 * @param ctx the parse tree
	 */
	void enterDivExpression(GelParser.DivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#divExpression}.
	 * @param ctx the parse tree
	 */
	void exitDivExpression(GelParser.DivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#modExpression}.
	 * @param ctx the parse tree
	 */
	void enterModExpression(GelParser.ModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#modExpression}.
	 * @param ctx the parse tree
	 */
	void exitModExpression(GelParser.ModExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(GelParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(GelParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#parenthesisExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(GelParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#parenthesisExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(GelParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#navExpression}.
	 * @param ctx the parse tree
	 */
	void enterNavExpression(GelParser.NavExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#navExpression}.
	 * @param ctx the parse tree
	 */
	void exitNavExpression(GelParser.NavExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#rightToLeft}.
	 * @param ctx the parse tree
	 */
	void enterRightToLeft(GelParser.RightToLeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#rightToLeft}.
	 * @param ctx the parse tree
	 */
	void exitRightToLeft(GelParser.RightToLeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#leftToRight}.
	 * @param ctx the parse tree
	 */
	void enterLeftToRight(GelParser.LeftToRightContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#leftToRight}.
	 * @param ctx the parse tree
	 */
	void exitLeftToRight(GelParser.LeftToRightContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#ofRightToLeft}.
	 * @param ctx the parse tree
	 */
	void enterOfRightToLeft(GelParser.OfRightToLeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#ofRightToLeft}.
	 * @param ctx the parse tree
	 */
	void exitOfRightToLeft(GelParser.OfRightToLeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#ofLeftToRight}.
	 * @param ctx the parse tree
	 */
	void enterOfLeftToRight(GelParser.OfLeftToRightContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#ofLeftToRight}.
	 * @param ctx the parse tree
	 */
	void exitOfLeftToRight(GelParser.OfLeftToRightContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(GelParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(GelParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#finalStep}.
	 * @param ctx the parse tree
	 */
	void enterFinalStep(GelParser.FinalStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#finalStep}.
	 * @param ctx the parse tree
	 */
	void exitFinalStep(GelParser.FinalStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#oclIsNew}.
	 * @param ctx the parse tree
	 */
	void enterOclIsNew(GelParser.OclIsNewContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#oclIsNew}.
	 * @param ctx the parse tree
	 */
	void exitOclIsNew(GelParser.OclIsNewContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#oclIsTypeOf}.
	 * @param ctx the parse tree
	 */
	void enterOclIsTypeOf(GelParser.OclIsTypeOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#oclIsTypeOf}.
	 * @param ctx the parse tree
	 */
	void exitOclIsTypeOf(GelParser.OclIsTypeOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#oclIsKindOf}.
	 * @param ctx the parse tree
	 */
	void enterOclIsKindOf(GelParser.OclIsKindOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#oclIsKindOf}.
	 * @param ctx the parse tree
	 */
	void exitOclIsKindOf(GelParser.OclIsKindOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GelParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GelParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#attributeNavExpression}.
	 * @param ctx the parse tree
	 */
	void enterAttributeNavExpression(GelParser.AttributeNavExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#attributeNavExpression}.
	 * @param ctx the parse tree
	 */
	void exitAttributeNavExpression(GelParser.AttributeNavExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#atPreExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtPreExpression(GelParser.AtPreExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#atPreExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtPreExpression(GelParser.AtPreExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#prefixedAtPreExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixedAtPreExpression(GelParser.PrefixedAtPreExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#prefixedAtPreExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixedAtPreExpression(GelParser.PrefixedAtPreExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#postfixedAtPreExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixedAtPreExpression(GelParser.PostfixedAtPreExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#postfixedAtPreExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixedAtPreExpression(GelParser.PostfixedAtPreExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#asTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterAsTypeExpression(GelParser.AsTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#asTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitAsTypeExpression(GelParser.AsTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#methodNavExpression}.
	 * @param ctx the parse tree
	 */
	void enterMethodNavExpression(GelParser.MethodNavExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#methodNavExpression}.
	 * @param ctx the parse tree
	 */
	void exitMethodNavExpression(GelParser.MethodNavExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#collOpExpression}.
	 * @param ctx the parse tree
	 */
	void enterCollOpExpression(GelParser.CollOpExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#collOpExpression}.
	 * @param ctx the parse tree
	 */
	void exitCollOpExpression(GelParser.CollOpExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#variableRefExpression}.
	 * @param ctx the parse tree
	 */
	void enterVariableRefExpression(GelParser.VariableRefExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#variableRefExpression}.
	 * @param ctx the parse tree
	 */
	void exitVariableRefExpression(GelParser.VariableRefExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#variableOrMemberAtPre}.
	 * @param ctx the parse tree
	 */
	void enterVariableOrMemberAtPre(GelParser.VariableOrMemberAtPreContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#variableOrMemberAtPre}.
	 * @param ctx the parse tree
	 */
	void exitVariableOrMemberAtPre(GelParser.VariableOrMemberAtPreContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(GelParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(GelParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#variableDeclarationExpression}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationExpression(GelParser.VariableDeclarationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#variableDeclarationExpression}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationExpression(GelParser.VariableDeclarationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeExpression(GelParser.TypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeExpression(GelParser.TypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#atomicTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeExpression(GelParser.AtomicTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#atomicTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeExpression(GelParser.AtomicTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#sequenceTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterSequenceTypeExpression(GelParser.SequenceTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#sequenceTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitSequenceTypeExpression(GelParser.SequenceTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#bagTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterBagTypeExpression(GelParser.BagTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#bagTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitBagTypeExpression(GelParser.BagTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#setTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterSetTypeExpression(GelParser.SetTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#setTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitSetTypeExpression(GelParser.SetTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#orderedSetTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderedSetTypeExpression(GelParser.OrderedSetTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#orderedSetTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderedSetTypeExpression(GelParser.OrderedSetTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#oppExpression}.
	 * @param ctx the parse tree
	 */
	void enterOppExpression(GelParser.OppExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#oppExpression}.
	 * @param ctx the parse tree
	 */
	void exitOppExpression(GelParser.OppExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#selfExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelfExpression(GelParser.SelfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#selfExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelfExpression(GelParser.SelfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(GelParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(GelParser.VariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(GelParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(GelParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(GelParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(GelParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(GelParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(GelParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(GelParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(GelParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointLiteral(GelParser.FloatingPointLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointLiteral(GelParser.FloatingPointLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(GelParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(GelParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#dateLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDateLiteral(GelParser.DateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#dateLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDateLiteral(GelParser.DateLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#characterLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCharacterLiteral(GelParser.CharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#characterLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCharacterLiteral(GelParser.CharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(GelParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(GelParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(GelParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(GelParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#regexLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRegexLiteral(GelParser.RegexLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#regexLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRegexLiteral(GelParser.RegexLiteralContext ctx);
}