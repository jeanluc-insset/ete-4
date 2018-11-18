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
public class GelLiteralOptional  extends fr.upjv.mis.ete.gel.GelExpressionOptional  implements GelLiteral {


    public static GelLiteralOptional ofNullable(GelLiteral inValue) {
        GelLiteralOptional result = new GelLiteralOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public GelLiteral get() {
        return value;
    }


    //==========================================================================//




    public void setValue(String inValue) {
        if (value != null) {
            value.setValue(inValue);
        }
    }

    public String getValue() {
        if (value == null) {
            return value.getValue();
        }
        return value.getValue();
    }







    //==========================================================================//


    private GelLiteral    value;

}
