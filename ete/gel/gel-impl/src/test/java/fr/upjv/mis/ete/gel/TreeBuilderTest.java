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
    public void testAdd() throws InstantiationException, IllegalAccessException {
//        ExpressionBuilder expBuilder = new ExpressionBuilder();
//        GelExpression     expExpression = expBuilder.add(expBuilder.literal(2), expBuilder.literal(5));
//        testBuild("2 + 5", expExpression);
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
        expBuilder.checkEquals(expResult, result);
    }


}

