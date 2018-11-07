package fr.upjv.mis.ete.gel;


import fr.upjv.mis.GelParser;
import fr.upjv.mis.ete.gel.test.utils.ExpressionBuilder;
import java.util.Iterator;
import java.util.List;
import org.antlr.v4.runtime.ParserRuleContext;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jldeleage
 */
public class TreeBuilderTest {

    public TreeBuilderTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        TreeBuilder.initFactories();
    }

    @After
    public void tearDown() {
    }



    @Test
    public void testIntLiteral() throws Exception {
        ExpressionBuilder expBuilder = new ExpressionBuilder();
        GelExpression     expExpression = expBuilder.literal(2);
        testBuild("2", expExpression, expBuilder);
    }


    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        ExpressionBuilder expBuilder = new ExpressionBuilder();
        GelExpression     expExpression = expBuilder.add(expBuilder.literal(2), expBuilder.literal(5));
        testBuild("2 + 5", expExpression, expBuilder);
    }

    @Test
    public void testComplex() throws Exception {
        System.out.println("complex gel expression");
        ExpressionBuilder expBuilder = new ExpressionBuilder();
        GelExpression     expExpression = expBuilder.add(expBuilder.literal(2),
                expBuilder.mult(expBuilder.literal(5),expBuilder.literal(3)));
        testBuild("2 + 5 * 3", expExpression, expBuilder);
    }

    @Test
    public void testComplex2() throws Exception {
        System.out.println("complex gel expression 2");
        ExpressionBuilder expBuilder = new ExpressionBuilder();
        GelExpression     expExpression = expBuilder.add(
                expBuilder.mult(expBuilder.literal(5),expBuilder.literal(3)),
                expBuilder.literal(2));
        testBuild("5 * 3 + 1", expExpression, expBuilder);
    }

    @Test
    public void testComplex3() throws Exception {
        System.out.println("complex gel expression 3");
        ExpressionBuilder expBuilder = new ExpressionBuilder();
        GelExpression     expExpression = expBuilder.sub(
                expBuilder.sub(expBuilder.literal(5),expBuilder.literal(3)),
                expBuilder.literal(2));
        testBuild("5 - 3 - 2", expExpression, expBuilder);
    }

    @Test
    public void testComplex4() throws Exception {
        System.out.println("complex gel expression 4");
        ExpressionBuilder expBuilder = new ExpressionBuilder();
        GelExpression     expExpression = expBuilder.sub(
                expBuilder.literal(5), expBuilder.sub(expBuilder.literal(3),
                expBuilder.literal(2)));
        testBuild("5 - (3 - 2)", expExpression, expBuilder);
    }


    //==========================================================================//


    /**
     * Test tree built by a TreeBuilder for inExpression.
     */
    public void testBuild(String inExpression, GelExpression expResult, ExpressionBuilder expBuilder) throws Exception {
        System.out.println("build");
        Object inContext = null;
        TreeBuilder instance = new TreeBuilder();
        GelExpression result = instance.build(inExpression, inContext);
        if (!expBuilder.checkEquals(expResult, result)) {
            fail(result + " is different from " + expResult);
        }
    }


}

