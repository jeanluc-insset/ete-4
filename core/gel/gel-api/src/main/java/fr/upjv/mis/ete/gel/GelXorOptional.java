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
public class GelXorOptional  extends fr.upjv.mis.ete.gel.GelExpressionOptional  implements GelXor {


    public static GelXorOptional ofNullable(GelXor inValue) {
        GelXorOptional result = new GelXorOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public GelXor get() {
        return value;
    }


    //==========================================================================//






    //==========================================================================//


    private GelXor    value;

}
