package fr.upjv.mis.ete.mof;



import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2optional.vm")
public class MofMultiplicityElementOptional  implements MofMultiplicityElement {


    public static MofMultiplicityElementOptional ofNullable(MofMultiplicityElement inValue) {
        MofMultiplicityElementOptional result = new MofMultiplicityElementOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public MofMultiplicityElement get() {
        return value;
    }


    //==========================================================================//




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


    private MofMultiplicityElement    value;

}
