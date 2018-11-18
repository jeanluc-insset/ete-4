package fr.upjv.mis.ete.gel;


import fr.upjv.mis.ete.gel.GelLiteral;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2optional.vm")
public class GelDateLiteralOptional  extends fr.upjv.mis.ete.gel.GelLiteralOptional  implements GelDateLiteral {


    public static GelDateLiteralOptional ofNullable(GelDateLiteral inValue) {
        GelDateLiteralOptional result = new GelDateLiteralOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public GelDateLiteral get() {
        return value;
    }


    //==========================================================================//






    //==========================================================================//


    private GelDateLiteral    value;

}
