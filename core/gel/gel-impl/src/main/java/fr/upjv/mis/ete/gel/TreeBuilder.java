package fr.upjv.mis.ete.gel;


import fr.insset.jeanluc.util.factory.FactoryRegistry;
import fr.upjv.mis.GelLexer;
import fr.upjv.mis.GelParser;
import fr.upjv.mis.GelParser.GelExpressionContext;
import fr.upjv.mis.GelParserBaseVisitor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Generated;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;



/**
 * Creates an abstract tree from a gel expression.<br>
 * Uses the default Gel parser provided by antlr.
 *
 * @author jldeleage
 */
@Generated("ete/gel/gel-spec/src/main/mde/treebuilder.vm")
public class TreeBuilder extends GelParserBaseVisitor<GelExpression> {


    public static void initFactories() {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        // operators
        registry.registerDefaultFactory("+", GelAddImpl.class);
        registry.registerDefaultFactory("<", GelLessThanImpl.class);
        registry.registerDefaultFactory("and", GelAndImpl.class);
        registry.registerDefaultFactory(">", GelGreaterThanImpl.class);
        registry.registerDefaultFactory("*", GelMultImpl.class);
        registry.registerDefaultFactory("-", GelSubImpl.class);
        registry.registerDefaultFactory("<=", GelLessOrEqualImpl.class);
        registry.registerDefaultFactory("", GelLessOrEqualImpl.class);
        registry.registerDefaultFactory("≤", GelLessOrEqualImpl.class);
        registry.registerDefaultFactory("->", GelCollOpImpl.class);
        registry.registerDefaultFactory("or", GelOrImpl.class);
        registry.registerDefaultFactory("/", GelModImpl.class);
        registry.registerDefaultFactory(">=", GelGreaterOrEqualImpl.class);
        registry.registerDefaultFactory("≥", GelGreaterOrEqualImpl.class);
        registry.registerDefaultFactory("self", GelSelfImpl.class);
        registry.registerDefaultFactory("variable", GelVariableRefImpl.class);
        registry.registerDefaultFactory("xor", GelXorImpl.class);
        registry.registerDefaultFactory("/", GelDivImpl.class);
        registry.registerDefaultFactory(".", GelNavImpl.class);
        // literals
        registry.registerDefaultFactory("stringLiteral", GelStringLiteralImpl.class);
        registry.registerDefaultFactory("integerLiteral", GelIntegerLiteralImpl.class);
        registry.registerDefaultFactory("floatingPointLiteral", GelFloatingPointLiteralImpl.class);
        registry.registerDefaultFactory("booleanLiteral", GelBooleanLiteralImpl.class);
        registry.registerDefaultFactory("regexLiteral", GelRegexLiteralImpl.class);
        registry.registerDefaultFactory("dateLiteral", GelDateLiteralImpl.class);
    }


    public TreeBuilder() {
        TreeBuilder.initFactories();
    }


    public GelExpression build(String inExpression, Object inContext) {
        GelLexer lexer = null;
        CodePointCharStream input = CharStreams.fromString(inExpression);
        lexer = new GelLexer(input);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        GelParser parser = new GelParser(commonTokenStream);
        GelParser.GelExpressionContext gelExpression = parser.gelExpression();
        stack.push(new Context());
        return visit(gelExpression);
    }


    //==========================================================================//


    @Override
    public GelExpression visit(ParseTree tree) {
        switch (((ParserRuleContext) tree).getChildCount()) {
            case 1:
                return super.visit(tree);
            case 3:
                return visitBinary((ParserRuleContext) tree);
        }
        return super.visit(tree);
    }



    //==========================================================================//


    protected GelExpression visitBinary(ParserRuleContext inContext) {
        List<ParseTree>     children = inContext.children;
        GelExpression result = visit(children.get(0));
        if (children.size() > 1) {
            try {
                GelExpression left = result;
                GelExpression right = visit(children.get(2));
                String symbol = children.get(1).getText();
                result = (GelExpression) FactoryRegistry.newInstance(symbol);
                result.addGelOperand(left);
                result.addGelOperand(right);
            } catch (InstantiationException ex) {
                Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }


    protected GelExpression visitHalf(ParserRuleContext inContext) {
        List<ParseTree>     children = inContext.children;
        GelExpression result;
        GelExpression left = stack.peek().expression;
        GelExpression right = visit(children.get(1));
        String symbol = children.get(0).getText();
        try {
            result = (GelExpression) FactoryRegistry.newInstance(symbol);
            result.addGelOperand(left);
            result.addGelOperand(right);
            stack.peek().expression = result;
            return result;
        } catch (InstantiationException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


    @Override
    public GelExpression visitParenthesisExpression(GelParser.ParenthesisExpressionContext ctx) {
        stack.push(new Context());
        GelExpression result = super.visitParenthesisExpression(ctx);
        result = stack.pop().expression;
        return result;
    }



    //==========================================================================//


    // arity : half
    // symbol : +
    @Override
    public GelExpression visitAddExpression(GelParser.AddExpressionContext ctx) {
        return visitHalf(ctx);
    }

    // arity : 2
    // symbol : <
    @Override
    public GelExpression visitLessThanExpression(GelParser.LessThanExpressionContext ctx) {
        return visitBinary(ctx);
    }

    // arity : 2
    // symbol : and
    @Override
    public GelExpression visitAndExpression(GelParser.AndExpressionContext ctx) {
        return visitBinary(ctx);
    }

    // arity : 2
    // symbol : >
    @Override
    public GelExpression visitGreaterThanExpression(GelParser.GreaterThanExpressionContext ctx) {
        return visitBinary(ctx);
    }

    // arity : half
    // symbol : *
    @Override
    public GelExpression visitMultExpression(GelParser.MultExpressionContext ctx) {
        return visitHalf(ctx);
    }

    // arity : half
    // symbol : -
    @Override
    public GelExpression visitSubExpression(GelParser.SubExpressionContext ctx) {
        return visitHalf(ctx);
    }

    // arity : 2
    // symbol : <=  ≤
    @Override
    public GelExpression visitLessOrEqualExpression(GelParser.LessOrEqualExpressionContext ctx) {
        return visitBinary(ctx);
    }

    // arity : 1
    // symbol : ->
    @Override
    public GelExpression visitCollOpExpression(GelParser.CollOpExpressionContext ctx) {
        return null;
    }

    // arity : 2
    // symbol : or
    @Override
    public GelExpression visitOrExpression(GelParser.OrExpressionContext ctx) {
        return visitBinary(ctx);
    }

    // arity : half
    // symbol : /
    @Override
    public GelExpression visitModExpression(GelParser.ModExpressionContext ctx) {
        return visitHalf(ctx);
    }

    // arity : 2
    // symbol : >= ≥
    @Override
    public GelExpression visitGreaterOrEqualExpression(GelParser.GreaterOrEqualExpressionContext ctx) {
        return visitBinary(ctx);
    }

    // arity : noop
    // symbol : self
    @Override
    public GelExpression visitSelfExpression(GelParser.SelfExpressionContext ctx) {
        return null;
    }

    // arity : noop
    // symbol : variable
    @Override
    public GelExpression visitVariableRefExpression(GelParser.VariableRefExpressionContext ctx) {
        return null;
    }

    // arity : 2
    // symbol : xor
    @Override
    public GelExpression visitXorExpression(GelParser.XorExpressionContext ctx) {
        return visitBinary(ctx);
    }

    // arity : half
    // symbol : /
    @Override
    public GelExpression visitDivExpression(GelParser.DivExpressionContext ctx) {
        return visitHalf(ctx);
    }

    // arity : nav
    // symbol : .
    @Override
    public GelExpression visitNavExpression(GelParser.NavExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        System.out.println("class of navigation : " + ctx.getClass().getName());
        for (ParseTree aChild : children) {
            System.out.println("    child class of navigation expression " + aChild.getClass().getName());
        }
        return super.visitNavExpression(ctx);
    }



    //==========================================================================//


    @Override
    public GelExpression visitStringLiteral(GelParser.StringLiteralContext ctx) {
        try {
            GelLiteral result = (GelLiteral) FactoryRegistry.newInstance("stringLiteral");
            result.setValue(ctx.getText());
            stack.peek().expression = result;
            return result;
        } catch (InstantiationException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        // We should return a specific GelExpression stating the error
        return null;
    }

    @Override
    public GelExpression visitIntegerLiteral(GelParser.IntegerLiteralContext ctx) {
        try {
            GelLiteral result = (GelLiteral) FactoryRegistry.newInstance("integerLiteral");
            result.setValue(ctx.getText());
            stack.peek().expression = result;
            return result;
        } catch (InstantiationException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        // We should return a specific GelExpression stating the error
        return null;
    }

    @Override
    public GelExpression visitFloatingPointLiteral(GelParser.FloatingPointLiteralContext ctx) {
        try {
            GelLiteral result = (GelLiteral) FactoryRegistry.newInstance("floatingPointLiteral");
            result.setValue(ctx.getText());
            stack.peek().expression = result;
            return result;
        } catch (InstantiationException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        // We should return a specific GelExpression stating the error
        return null;
    }

    @Override
    public GelExpression visitBooleanLiteral(GelParser.BooleanLiteralContext ctx) {
        try {
            GelLiteral result = (GelLiteral) FactoryRegistry.newInstance("booleanLiteral");
            result.setValue(ctx.getText());
            stack.peek().expression = result;
            return result;
        } catch (InstantiationException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        // We should return a specific GelExpression stating the error
        return null;
    }

    @Override
    public GelExpression visitRegexLiteral(GelParser.RegexLiteralContext ctx) {
        try {
            GelLiteral result = (GelLiteral) FactoryRegistry.newInstance("regexLiteral");
            result.setValue(ctx.getText());
            stack.peek().expression = result;
            return result;
        } catch (InstantiationException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        // We should return a specific GelExpression stating the error
        return null;
    }

    @Override
    public GelExpression visitDateLiteral(GelParser.DateLiteralContext ctx) {
        try {
            GelLiteral result = (GelLiteral) FactoryRegistry.newInstance("dateLiteral");
            result.setValue(ctx.getText());
            stack.peek().expression = result;
            return result;
        } catch (InstantiationException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        // We should return a specific GelExpression stating the error
        return null;
    }




    //==========================================================================//


//    protected GelExpression resolve(GelExpression partialNavigation, String inIdentifier) {
//        try {
//            GelNav result = (GelNav) FactoryRegistry.newInstance(".");
//            if (partialNavigation != null) {
//                result.addGelOperand(partialNavigation);
//            }
//            result.setIdentifier(inIdentifier);
//            return result;
//        } catch (InstantiationException | IllegalAccessException ex) {
//            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
//            throw new RuntimeException(ex);
//        }
//    }


    @Override
    public GelExpression visitLeftToRight(GelParser.LeftToRightContext ctx) {
        List<ParseTree> children = ctx.children;
        GelExpression partialNavigation = null;
        for (ParseTree aChild : children) {
            System.out.println("    " + aChild.getText() + " is in navigation expression, its class is " + aChild.getClass().getName());
            GelExpression childVisit = visit(aChild);
            if (childVisit != null) {
                System.out.println("        it is a navigation...");
                if (partialNavigation != null) {
                    childVisit.addGelOperand(partialNavigation);
                }
                partialNavigation = childVisit;
            }
        }
        return partialNavigation;
    }

    @Override
    public GelExpression visitRightToLeft(GelParser.RightToLeftContext ctx) {
        List<ParseTree> children = ctx.children;
        for (ParseTree aChild : children) {
            System.out.println("    child class of navigation expression " + aChild.getClass().getName());
        }
        return null;
    }

    @Override
    public GelExpression visitStart(GelParser.StartContext ctx) {
        try {
            GelNav result = (GelNav) FactoryRegistry.newInstance(".");
            result.setIdentifier(ctx.getText());
            return result;
        } catch (InstantiationException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return super.visitStart(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GelExpression visitFinalStep(GelParser.FinalStepContext ctx) {
        try {
            GelNav result = (GelNav) FactoryRegistry.newInstance(".");
            result.setIdentifier(ctx.getText());
            return result;
        } catch (InstantiationException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return super.visitFinalStep(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GelExpression visitStep(GelParser.StepContext ctx) {
        try {
            GelNav result = (GelNav) FactoryRegistry.newInstance(".");
            result.setIdentifier(ctx.getText());
            return result;
        } catch (InstantiationException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return super.visitStep(ctx); //To change body of generated methods, choose Tools | Templates.
    }






    //==========================================================================//


    /**
     * Utility class to keep track of sub expressions parsing
     */
    private class Context {
        public      GelExpression       expression;
    }



    //==========================================================================//



    private     Stack<Context>      stack = new Stack<>();

}

