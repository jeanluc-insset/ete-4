/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.upjv.mis.ete.gel.test.utils;

import fr.insset.jeanluc.util.factory.FactoryRegistry;
import fr.upjv.mis.ete.gel.GelExpression;
import fr.upjv.mis.ete.gel.GelNav;
import fr.upjv.mis.ete.mof.MofFeature;


/**
 * WARNING : in order to work, this class needs the factories to be initialized.
 *
 * @author jldeleage
 */
public class ExpressionBuilder {


    public GelExpression    navTo(MofFeature inTo) throws InstantiationException, IllegalAccessException {
        GelNav result = (GelNav) FactoryRegistry.newInstance(".");
        result.addGelOperand(current);
        result.setTarget(inTo);
        current = result;
        return result;
    }



    public GelExpression buildUnary(GelExpression inOperand, String inSymbol) throws InstantiationException, IllegalAccessException {
        GelExpression result = (GelExpression) FactoryRegistry.newInstance(inSymbol);
        result.addGelOperand(inOperand);
        return result;
    }



    public GelExpression buildBinary(GelExpression inLeft, GelExpression inRight, String inSymbol) throws InstantiationException, IllegalAccessException {
        GelExpression result = (GelExpression) FactoryRegistry.newInstance(inSymbol);
        result.addGelOperand(inLeft);
        result.addGelOperand(inRight);
        return result;
    }


    public GelExpression add(GelExpression inLeft, GelExpression inRight) throws InstantiationException, IllegalAccessException {
        return buildBinary(inLeft, inRight, "+");
    }


    private GelExpression       current;

}
