package fr.upjv.mis.ete.mof;


import fr.upjv.mis.ete.mof.MofType;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2optional.vm")
public class MofClassifierOptional  extends fr.upjv.mis.ete.mof.MofTypeOptional  implements MofClassifier {


    public static MofClassifierOptional ofNullable(MofClassifier inValue) {
        MofClassifierOptional result = new MofClassifierOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public MofClassifier get() {
        return value;
    }


    //==========================================================================//




    public void setIsAbstract(Boolean inValue) {
        if (value != null) {
            value.setIsAbstract(inValue);
        }
    }

    public Boolean getIsAbstract() {
        if (value == null) {
            return value.getIsAbstract();
        }
        return value.getIsAbstract();
    }





    public void setGeneralization(List<MofGeneralization> generalization) {
        value.setGeneralization(generalization);
    }

    public List<MofGeneralization> getGeneralization() {
        if (value == null) {
            return Collections.EMPTY_LIST;
        }
        List<MofGeneralization> aux = value.getGeneralization();
        if (aux == null) {
            return Collections.EMPTY_LIST;
        }
        List<MofGeneralization> result = new LinkedList();
        for (MofGeneralization anElement : aux) {
            result.add(MofGeneralizationOptional.ofNullable(anElement));
        }
        return result;
    }

    public boolean addMofGeneralization(MofGeneralization anElement) {
        if (value != null) {
            return value.addMofGeneralization(anElement);
        }
        return false;
    }

    public boolean removeMofGeneralization(MofGeneralization anElement) {
        if (value != null) {
            return value.addMofGeneralization(anElement);
        }
        return false;
    }

    public Stream<MofGeneralization> getMofGeneralizationAsStream() {
        if (value == null) {
            return Stream.empty();
        }
        Collection<MofGeneralization> coll = value.getGeneralization();
        if (coll == null) {
            return Stream.empty();
        }
        return coll.stream();
    }





    //==========================================================================//


    private MofClassifier    value;

}
