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
public class GelVariableDeclarationImpl  extends fr.upjv.mis.ete.gel.GelExpressionImpl  implements GelVariableDeclaration {



    public void setIdentifier(String inValue) {
        identifier = inValue;
    }

    public String getIdentifier() {
        return identifier;
    }





    public void setValue(GelExpression inValue) {
        value = inValue;
    }

    public GelExpression getValue() {
        return value;
    }







    //==========================================================================//


    private  String  identifier;
    private  GelExpression  value;

}
