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
public class GelLessThanOptional  extends fr.upjv.mis.ete.gel.GelExpressionOptional  implements GelLessThan {


    public static GelLessThanOptional ofNullable(GelLessThan inValue) {
        GelLessThanOptional result = new GelLessThanOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public GelLessThan get() {
        return value;
    }


    //==========================================================================//






    //==========================================================================//


    private GelLessThan    value;

}
