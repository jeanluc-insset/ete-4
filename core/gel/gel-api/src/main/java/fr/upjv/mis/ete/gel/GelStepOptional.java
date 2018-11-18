package fr.upjv.mis.ete.gel;


import fr.upjv.mis.ete.gel.GelExpression;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2optional.vm")
public class GelStepOptional  extends fr.upjv.mis.ete.gel.GelExpressionOptional  implements GelStep {


    public static GelStepOptional ofNullable(GelStep inValue) {
        GelStepOptional result = new GelStepOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public GelStep get() {
        return value;
    }


    //==========================================================================//




    public void setIdentifier(String inValue) {
        if (value != null) {
            value.setIdentifier(inValue);
        }
    }

    public String getIdentifier() {
        if (value == null) {
            return value.getIdentifier();
        }
        return value.getIdentifier();
    }







    //==========================================================================//


    private GelStep    value;

}
