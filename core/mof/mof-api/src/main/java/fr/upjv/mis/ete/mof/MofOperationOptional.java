package fr.upjv.mis.ete.mof;



import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2optional.vm")
public class MofOperationOptional  implements MofOperation {


    public static MofOperationOptional ofNullable(MofOperation inValue) {
        MofOperationOptional result = new MofOperationOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public MofOperation get() {
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





    public void setOwnedParameter(List<MofParameter> ownedParameter) {
        value.setOwnedParameter(ownedParameter);
    }

    public List<MofParameter> getOwnedParameter() {
        if (value == null) {
            return Collections.EMPTY_LIST;
        }
        List<MofParameter> aux = value.getOwnedParameter();
        if (aux == null) {
            return Collections.EMPTY_LIST;
        }
        List<MofParameter> result = new LinkedList();
        for (MofParameter anElement : aux) {
            result.add(MofParameterOptional.ofNullable(anElement));
        }
        return result;
    }

    public boolean addMofOwnedParameter(MofParameter anElement) {
        if (value != null) {
            return value.addMofOwnedParameter(anElement);
        }
        return false;
    }

    public boolean removeMofOwnedParameter(MofParameter anElement) {
        if (value != null) {
            return value.addMofOwnedParameter(anElement);
        }
        return false;
    }

    public Stream<MofParameter> getMofOwnedParameterAsStream() {
        if (value == null) {
            return Stream.empty();
        }
        Collection<MofParameter> coll = value.getOwnedParameter();
        if (coll == null) {
            return Stream.empty();
        }
        return coll.stream();
    }



    public void setRaisedException(List<MofType> raisedException) {
        value.setRaisedException(raisedException);
    }

    public List<MofType> getRaisedException() {
        if (value == null) {
            return Collections.EMPTY_LIST;
        }
        List<MofType> aux = value.getRaisedException();
        if (aux == null) {
            return Collections.EMPTY_LIST;
        }
        List<MofType> result = new LinkedList();
        for (MofType anElement : aux) {
            result.add(MofTypeOptional.ofNullable(anElement));
        }
        return result;
    }

    public boolean addMofRaisedException(MofType anElement) {
        if (value != null) {
            return value.addMofRaisedException(anElement);
        }
        return false;
    }

    public boolean removeMofRaisedException(MofType anElement) {
        if (value != null) {
            return value.addMofRaisedException(anElement);
        }
        return false;
    }

    public Stream<MofType> getMofRaisedExceptionAsStream() {
        if (value == null) {
            return Stream.empty();
        }
        Collection<MofType> coll = value.getRaisedException();
        if (coll == null) {
            return Stream.empty();
        }
        return coll.stream();
    }





    //==========================================================================//


    private MofOperation    value;

}
