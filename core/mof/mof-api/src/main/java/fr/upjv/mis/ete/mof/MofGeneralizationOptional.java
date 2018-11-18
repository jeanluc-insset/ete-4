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
public class MofGeneralizationOptional  implements MofGeneralization {


    public static MofGeneralizationOptional ofNullable(MofGeneralization inValue) {
        MofGeneralizationOptional result = new MofGeneralizationOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public MofGeneralization get() {
        return value;
    }


    //==========================================================================//




    public void setGeneral(MofClassifier inValue) {
        if (value != null) {
            value.setGeneral(inValue);
        }
    }

    public MofClassifier getGeneral() {
        if (value == null) {
            return MofClassifierOptional.ofNullable(value.getGeneral());
        }
        return MofClassifierOptional.ofNullable(value.getGeneral());
    }







    //==========================================================================//


    private MofGeneralization    value;

}
