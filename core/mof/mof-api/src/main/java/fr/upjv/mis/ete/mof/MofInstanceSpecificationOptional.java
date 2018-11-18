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
public class MofInstanceSpecificationOptional  extends fr.upjv.mis.ete.mof.MofPackageableElementOptional  implements MofInstanceSpecification {


    public static MofInstanceSpecificationOptional ofNullable(MofInstanceSpecification inValue) {
        MofInstanceSpecificationOptional result = new MofInstanceSpecificationOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public MofInstanceSpecification get() {
        return value;
    }


    //==========================================================================//






    //==========================================================================//


    private MofInstanceSpecification    value;

}
