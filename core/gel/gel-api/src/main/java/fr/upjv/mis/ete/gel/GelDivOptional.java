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
public class GelDivOptional  extends fr.upjv.mis.ete.gel.GelExpressionOptional  implements GelDiv {


    public static GelDivOptional ofNullable(GelDiv inValue) {
        GelDivOptional result = new GelDivOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public GelDiv get() {
        return value;
    }


    //==========================================================================//






    //==========================================================================//


    private GelDiv    value;

}
