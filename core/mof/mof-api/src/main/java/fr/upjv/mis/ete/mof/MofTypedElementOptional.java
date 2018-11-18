package fr.upjv.mis.ete.mof;


import fr.upjv.mis.ete.mof.MofNamedElement;
import fr.upjv.mis.ete.mof.MofType;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2optional.vm")
public class MofTypedElementOptional  extends fr.upjv.mis.ete.mof.MofNamedElementOptional  implements MofTypedElement {


    public static MofTypedElementOptional ofNullable(MofTypedElement inValue) {
        MofTypedElementOptional result = new MofTypedElementOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public MofTypedElement get() {
        return value;
    }


    //==========================================================================//




    public void setType(MofType inValue) {
        if (value != null) {
            value.setType(inValue);
        }
    }

    public MofType getType() {
        if (value == null) {
            return MofTypeOptional.ofNullable(value.getType());
        }
        return MofTypeOptional.ofNullable(value.getType());
    }







    //==========================================================================//


    private MofTypedElement    value;

}
