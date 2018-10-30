parser grammar GelParser;




//============================================================================//
//                                 P A R S E R                                //
//============================================================================//
// This grammar is an abstract grammar for any natural language               //
// Any grammar which imports this one can override any rule to customize it   //
// to its own needs.                                                          //
// By convention, rules with "expression" as suffix are reflected by objects  //
// in the abstract syntax and are visitable by the abstract tree builder      //
// The objects in the abstract syntax must have the "kind" tag value which    //
// gives the template fragment to use in the abstract tree builder            // 
//============================================================================//


import BasicParser;


options {
     tokenVocab = GelLexer;
}




//============================================================================//
//                             E N T R Y P O I N T                            //
//============================================================================//


gelExpression :
    basicExpression
;


//============================================================================//
//                             N A V I G A T I O N                            //
//============================================================================//



