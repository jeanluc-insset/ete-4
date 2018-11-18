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
public class GelGreaterThanOptional  extends fr.upjv.mis.ete.gel.GelExpressionOptional  implements GelGreaterThan {


    public static GelGreaterThanOptional ofNullable(GelGreaterThan inValue) {
        GelGreaterThanOptional result = new GelGreaterThanOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public GelGreaterThan get() {
        return value;
    }


    //==========================================================================//






    //==========================================================================//


    private GelGreaterThan    value;

}
