package fr.upjv.mis.ete.mof;


import fr.upjv.mis.ete.mof.MofInstanceSpecification;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2optional.vm")
public class MofEnumerationLiteralOptional  extends fr.upjv.mis.ete.mof.MofInstanceSpecificationOptional  implements MofEnumerationLiteral {


    public static MofEnumerationLiteralOptional ofNullable(MofEnumerationLiteral inValue) {
        MofEnumerationLiteralOptional result = new MofEnumerationLiteralOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public MofEnumerationLiteral get() {
        return value;
    }


    //==========================================================================//






    //==========================================================================//


    private MofEnumerationLiteral    value;

}
