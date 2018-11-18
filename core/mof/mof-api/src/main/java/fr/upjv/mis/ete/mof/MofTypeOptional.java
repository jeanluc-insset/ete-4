package fr.upjv.mis.ete.mof;


import fr.upjv.mis.ete.mof.MofPackageableElement;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2optional.vm")
public class MofTypeOptional  extends fr.upjv.mis.ete.mof.MofPackageableElementOptional  implements MofType {


    public static MofTypeOptional ofNullable(MofType inValue) {
        MofTypeOptional result = new MofTypeOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public MofType get() {
        return value;
    }


    //==========================================================================//






    //==========================================================================//


    private MofType    value;

}
