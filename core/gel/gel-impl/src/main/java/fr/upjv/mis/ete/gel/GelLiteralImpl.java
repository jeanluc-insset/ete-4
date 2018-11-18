package fr.upjv.mis.ete.gel;


import fr.upjv.mis.ete.gel.GelExpression;

import fr.insset.jeanluc.util.factory.FactoryMethods;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2class.vm")
public class GelLiteralImpl  extends fr.upjv.mis.ete.gel.GelExpressionImpl  implements GelLiteral {



    public void setValue(String inValue) {
        value = inValue;
    }

    public String getValue() {
        return value;
    }







    //==========================================================================//


    private  String  value;

}
