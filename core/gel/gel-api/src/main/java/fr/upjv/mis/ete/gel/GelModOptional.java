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
public class GelModOptional  extends fr.upjv.mis.ete.gel.GelExpressionOptional  implements GelMod {


    public static GelModOptional ofNullable(GelMod inValue) {
        GelModOptional result = new GelModOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public GelMod get() {
        return value;
    }


    //==========================================================================//






    //==========================================================================//


    private GelMod    value;

}
