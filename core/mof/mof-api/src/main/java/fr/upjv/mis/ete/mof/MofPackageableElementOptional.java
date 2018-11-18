package fr.upjv.mis.ete.mof;


import fr.upjv.mis.ete.mof.MofNamedElement;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2optional.vm")
public class MofPackageableElementOptional  extends fr.upjv.mis.ete.mof.MofNamedElementOptional  implements MofPackageableElement {


    public static MofPackageableElementOptional ofNullable(MofPackageableElement inValue) {
        MofPackageableElementOptional result = new MofPackageableElementOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public MofPackageableElement get() {
        return value;
    }


    //==========================================================================//






    //==========================================================================//


    private MofPackageableElement    value;

}
