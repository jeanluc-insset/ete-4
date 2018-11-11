parser grammar BasicParser;



options {
    tokenVocab = BasicLexer;
}



//============================================================================//
// This grammar is an abstract grammar for any expression language            //
// A grammar which imports this one can override any rule to customize it to  //
// its own needs.                                                             //
// By convention, rules with "expression" as suffix are reflected by objects  //
// in the abstract syntax and are visitable by the abstract tree builder      //
// The objects in the abstract syntax must have the "kind" tag value which    //
// gives the template fragment to use in the abstract tree builder            // 
//============================================================================//




//============================================================================//
//                             E N T R Y P O I N T                            //
//============================================================================//



basicExpression :
    xorExpression
;


//============================================================================//
//                     L O G I C A L   O P E R A T I O N S                    //
//============================================================================//


xorExpression :
    (
    orExpression
    XOR
    )*
    orExpression
;


orExpression :
    (
    andExpression
    OR
    )*
    andExpression
;


andExpression :
    (
    notOrNotNotExpression
    AND
    )*
    notOrNotNotExpression
;


notOrNotNotExpression:
    notExpression
    |
    affirmativeExpression
;

// The grammar does not allow "not not xxxx"
notExpression : NOT affirmativeExpression;


//============================================================================//


// In this grammar, comparisons are not associative. One cannot write
// expressions such that
//      a > b > c
affirmativeExpression :
    greaterThanExpression
    |
    greaterOrEqualExpression
    |
    lessThanExpression
    |
    lessOrEqualExpression
    |
    compareExpression
;


greaterThanExpression : compareExpression GT compareExpression;
greaterOrEqualExpression : compareExpression GE compareExpression;
lessThanExpression : compareExpression LT compareExpression;
lessOrEqualExpression : compareExpression LE compareExpression;


// In this grammar, = and <> are not associative : one cannot write expressions
// such that
//      a = b = c
compareExpression
    : equalExpression
    | differentExpression
    | addOrSubExpression
;


equalExpression : addOrSubExpression EQUAL addOrSubExpression;

differentExpression : addOrSubExpression NOTEQUAL addOrSubExpression;



//==============================================================================//
//                  A R I T H M E T I C   O P E R A T I O N S                   //
//==============================================================================//


addOrSubExpression :
    multOrDivExpression
    addOrSubHalfExpression*
;


addOrSubHalfExpression :
    addExpression
    | subExpression
;


addExpression : ADD multOrDivExpression;
subExpression : SUB multOrDivExpression;



multOrDivExpression :
    operand
    multOrDivHalfExpression*
;

multOrDivHalfExpression :
    multExpression
    | divExpression
    | modExpression;

multExpression : MUL operand;
divExpression  : DIV operand;
modExpression  : MOD operand;



//============================================================================//
//                             N A V I G A T I O N                            //
//============================================================================//


operand
    : oppExpression
    | navExpression
    | literal
    | parenthesisExpression
;



parenthesisExpression:
    LPAREN basicExpression RPAREN
;


navExpression:
//    rightToLeft
    leftToRight
;

rightToLeft: 
    (
        step
        ofRightToLeft
    )*
    primitive
    finalStep ?
;


leftToRight:
    primitive
    (
        ofLeftToRight
        step
    )*
    finalStep?
;

ofRightToLeft : OF;
ofLeftToRight : OF;


step:
    attributeNavExpression
    | atPreExpression
    | asTypeExpression
    | methodNavExpression
    | collOpExpression
;


finalStep :
    oclIsNew | oclIsTypeOf | oclIsKindOf
;


oclIsNew    :   IS NEW;
oclIsTypeOf :   IS OF TYPE basicExpression;
oclIsKindOf :   IS OF KIND basicExpression;


primitive
    : selfExpression
    | variableOrMember
    | variableOrMemberAtPre
;




attributeNavExpression
    : identifier OF
;

atPreExpression
    : (THE | A) INITIAL identifier
;



asTypeExpression
    : AS TYPE basicExpression
;

methodNavExpression
    : functionCall OF
;

collOpExpression
    : functionCall OF
;


variableOrMember: identifier;

variableOrMemberAtPre: identifier ATPRE ;


functionCall :
    identifier LPAREN parameterList RPAREN
;


//----------------------------------------------------------------------------//



variableDeclarationExpression :
    identifier
    (   COLON typeExpression )?
;


typeExpression
    : atomicTypeExpression
    | sequenceTypeExpression
    | bagTypeExpression
    | setTypeExpression
    | orderedSetTypeExpression
;


atomicTypeExpression :
    Identifier
;

sequenceTypeExpression
    : SEQUENCE LPAREN typeExpression RPAREN
;

bagTypeExpression
    : BAG LPAREN typeExpression RPAREN
;

setTypeExpression
    : SET LPAREN typeExpression RPAREN
;

orderedSetTypeExpression
    : ORDERED SET LPAREN typeExpression RPAREN
;


//============================================================================//
//                                A T O M I C S                               //
//============================================================================//


oppExpression :
    SUB
    operand
;


selfExpression : THIS Identifier;


variableReference : THE Identifier;




parameterList:
    (
        ( basicExpression COMMA )* basicExpression
    )
    |
    ()
;


//----------------------------------------------------------------------------//
//                                   LITERALS                                 //
//----------------------------------------------------------------------------//


literal
    : integerLiteral
    | floatingPointLiteral
    | booleanLiteral
    | dateLiteral
    | characterLiteral
    | stringLiteral
    | regexLiteral
    | nullLiteral
;



identifier           : Identifier;
integerLiteral       : IntegerLiteral;
floatingPointLiteral : FloatingPointLiteral;
booleanLiteral       : BooleanLiteral;
dateLiteral          : DateLiteral;
characterLiteral     : CharacterLiteral;
stringLiteral        : StringLiteral;
nullLiteral          : NullLiteral;
regexLiteral         : RegexLiteral;

