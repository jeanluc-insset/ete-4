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
public class GelRegexLiteralOptional  extends fr.upjv.mis.ete.gel.GelLiteralOptional  implements GelRegexLiteral {


    public static GelRegexLiteralOptional ofNullable(GelRegexLiteral inValue) {
        GelRegexLiteralOptional result = new GelRegexLiteralOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public GelRegexLiteral get() {
        return value;
    }


    //==========================================================================//






    //==========================================================================//


    private GelRegexLiteral    value;

}
