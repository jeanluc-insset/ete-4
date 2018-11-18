package fr.upjv.mis.ete.gel;


import fr.upjv.mis.ete.mof.MofFeature;
import fr.upjv.mis.ete.gel.GelExpression;

import fr.insset.jeanluc.util.factory.FactoryMethods;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2class.vm")
public class GelCollOpImpl  extends fr.upjv.mis.ete.gel.GelExpressionImpl  implements GelCollOp {



    public void setOperation(MofFeature inValue) {
        operation = inValue;
    }

    public MofFeature getOperation() {
        return operation;
    }







    //==========================================================================//


    private  MofFeature  operation;

}
