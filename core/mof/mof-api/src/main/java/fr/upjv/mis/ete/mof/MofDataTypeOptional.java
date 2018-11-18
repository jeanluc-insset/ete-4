package fr.upjv.mis.ete.mof;


import fr.upjv.mis.ete.mof.MofClassifier;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2optional.vm")
public class MofDataTypeOptional  extends fr.upjv.mis.ete.mof.MofClassifierOptional  implements MofDataType {


    public static MofDataTypeOptional ofNullable(MofDataType inValue) {
        MofDataTypeOptional result = new MofDataTypeOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public MofDataType get() {
        return value;
    }


    //==========================================================================//






    //==========================================================================//


    private MofDataType    value;

}
