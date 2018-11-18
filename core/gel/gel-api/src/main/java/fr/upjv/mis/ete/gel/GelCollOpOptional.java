package fr.upjv.mis.ete.gel;


import fr.upjv.mis.ete.mof.MofFeature;
import fr.upjv.mis.ete.gel.GelExpression;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2optional.vm")
public class GelCollOpOptional  extends fr.upjv.mis.ete.gel.GelExpressionOptional  implements GelCollOp {


    public static GelCollOpOptional ofNullable(GelCollOp inValue) {
        GelCollOpOptional result = new GelCollOpOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public GelCollOp get() {
        return value;
    }


    //==========================================================================//




    public void setOperation(MofFeature inValue) {
        if (value != null) {
            value.setOperation(inValue);
        }
    }

    public MofFeature getOperation() {
        if (value == null) {
            return value.getOperation();
        }
        return value.getOperation();
    }







    //==========================================================================//


    private GelCollOp    value;

}
