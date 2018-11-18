package fr.upjv.mis.ete.mof;


import fr.upjv.mis.ete.mof.MofElement;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2optional.vm")
public class MofNamedElementOptional  extends fr.upjv.mis.ete.mof.MofElementOptional  implements MofNamedElement {


    public static MofNamedElementOptional ofNullable(MofNamedElement inValue) {
        MofNamedElementOptional result = new MofNamedElementOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public MofNamedElement get() {
        return value;
    }


    //==========================================================================//




    public void setName(String inValue) {
        if (value != null) {
            value.setName(inValue);
        }
    }

    public String getName() {
        if (value == null) {
            return value.getName();
        }
        return value.getName();
    }





    public void setQualifiedName(String inValue) {
        if (value != null) {
            value.setQualifiedName(inValue);
        }
    }

    public String getQualifiedName() {
        if (value == null) {
            return value.getQualifiedName();
        }
        return value.getQualifiedName();
    }





    public void setVisibility(MofVisibilityKind inValue) {
        if (value != null) {
            value.setVisibility(inValue);
        }
    }

    public MofVisibilityKind getVisibility() {
        if (value == null) {
            return value.getVisibility();
        }
        return value.getVisibility();
    }







    //==========================================================================//


    private MofNamedElement    value;

}
