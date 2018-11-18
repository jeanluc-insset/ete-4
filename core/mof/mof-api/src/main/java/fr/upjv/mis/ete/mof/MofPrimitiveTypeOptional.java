package fr.upjv.mis.ete.mof;


import fr.upjv.mis.ete.mof.MofDataType;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2optional.vm")
public class MofPrimitiveTypeOptional  extends fr.upjv.mis.ete.mof.MofDataTypeOptional  implements MofPrimitiveType {


    public static MofPrimitiveTypeOptional ofNullable(MofPrimitiveType inValue) {
        MofPrimitiveTypeOptional result = new MofPrimitiveTypeOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public MofPrimitiveType get() {
        return value;
    }


    //==========================================================================//






    //==========================================================================//


    private MofPrimitiveType    value;

}
