package fr.upjv.mis.ete.mof;


import fr.upjv.mis.ete.mof.MofTypedElement;
import fr.upjv.mis.ete.mof.MofMultiplicityElement;
import fr.upjv.mis.ete.mof.MofFeature;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2optional.vm")
public class MofStructuralFeatureOptional  extends fr.upjv.mis.ete.mof.MofTypedElementOptional  implements MofStructuralFeature {


    public static MofStructuralFeatureOptional ofNullable(MofStructuralFeature inValue) {
        MofStructuralFeatureOptional result = new MofStructuralFeatureOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public MofStructuralFeature get() {
        return value;
    }


    //==========================================================================//




    public void setIsReadOnly(Boolean inValue) {
        if (value != null) {
            value.setIsReadOnly(inValue);
        }
    }

    public Boolean getIsReadOnly() {
        if (value == null) {
            return value.getIsReadOnly();
        }
        return value.getIsReadOnly();
    }






    public void setIsOrdered(Boolean inValue) {
        if (value != null) {
            value.setIsOrdered(inValue);
        }
    }

    public Boolean getIsOrdered() {
        if (value == null) {
            return value.getIsOrdered();
        }
        return value.getIsOrdered();
    }



    public void setIsUnique(Boolean inValue) {
        if (value != null) {
            value.setIsUnique(inValue);
        }
    }

    public Boolean getIsUnique() {
        if (value == null) {
            return value.getIsUnique();
        }
        return value.getIsUnique();
    }



    public void setLower(Integer inValue) {
        if (value != null) {
            value.setLower(inValue);
        }
    }

    public Integer getLower() {
        if (value == null) {
            return value.getLower();
        }
        return value.getLower();
    }



    public void setUpper(Integer inValue) {
        if (value != null) {
            value.setUpper(inValue);
        }
    }

    public Integer getUpper() {
        if (value == null) {
            return value.getUpper();
        }
        return value.getUpper();
    }




    //==========================================================================//


    private MofStructuralFeature    value;

}
