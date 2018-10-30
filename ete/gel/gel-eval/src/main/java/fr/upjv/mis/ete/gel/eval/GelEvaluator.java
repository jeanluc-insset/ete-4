package fr.upjv.mis.ete.gel.eval;


import fr.insset.jeanluc.ete.gel.GelExpression;


/**
 *
 * @author jldeleage
 */
public interface GelEvaluator {

    public Object evaluate(String inExpression, Object inContext);
    public Object evaluate(GelExpression inExpression, Object inContext);


}
