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
public class MofClassOptional  extends fr.upjv.mis.ete.mof.MofClassifierOptional  implements MofClass {


    public static MofClassOptional ofNullable(MofClass inValue) {
        MofClassOptional result = new MofClassOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public MofClass get() {
        return value;
    }


    //==========================================================================//




    public void setOwnedAttribute(List<MofProperty> ownedAttribute) {
        value.setOwnedAttribute(ownedAttribute);
    }

    public List<MofProperty> getOwnedAttribute() {
        if (value == null) {
            return Collections.EMPTY_LIST;
        }
        List<MofProperty> aux = value.getOwnedAttribute();
        if (aux == null) {
            return Collections.EMPTY_LIST;
        }
        List<MofProperty> result = new LinkedList();
        for (MofProperty anElement : aux) {
            result.add(MofPropertyOptional.ofNullable(anElement));
        }
        return result;
    }

    public boolean addMofOwnedAttribute(MofProperty anElement) {
        if (value != null) {
            return value.addMofOwnedAttribute(anElement);
        }
        return false;
    }

    public boolean removeMofOwnedAttribute(MofProperty anElement) {
        if (value != null) {
            return value.addMofOwnedAttribute(anElement);
        }
        return false;
    }

    public Stream<MofProperty> getMofOwnedAttributeAsStream() {
        if (value == null) {
            return Stream.empty();
        }
        Collection<MofProperty> coll = value.getOwnedAttribute();
        if (coll == null) {
            return Stream.empty();
        }
        return coll.stream();
    }



    public void setSuperclass(List<MofClass> superclass) {
        value.setSuperclass(superclass);
    }

    public List<MofClass> getSuperclass() {
        if (value == null) {
            return Collections.EMPTY_LIST;
        }
        List<MofClass> aux = value.getSuperclass();
        if (aux == null) {
            return Collections.EMPTY_LIST;
        }
        List<MofClass> result = new LinkedList();
        for (MofClass anElement : aux) {
            result.add(MofClassOptional.ofNullable(anElement));
        }
        return result;
    }

    public boolean addMofSuperclass(MofClass anElement) {
        if (value != null) {
            return value.addMofSuperclass(anElement);
        }
        return false;
    }

    public boolean removeMofSuperclass(MofClass anElement) {
        if (value != null) {
            return value.addMofSuperclass(anElement);
        }
        return false;
    }

    public Stream<MofClass> getMofSuperclassAsStream() {
        if (value == null) {
            return Stream.empty();
        }
        Collection<MofClass> coll = value.getSuperclass();
        if (coll == null) {
            return Stream.empty();
        }
        return coll.stream();
    }



    public void setOwnedOperation(List<MofOperation> ownedOperation) {
        value.setOwnedOperation(ownedOperation);
    }

    public List<MofOperation> getOwnedOperation() {
        if (value == null) {
            return Collections.EMPTY_LIST;
        }
        List<MofOperation> aux = value.getOwnedOperation();
        if (aux == null) {
            return Collections.EMPTY_LIST;
        }
        List<MofOperation> result = new LinkedList();
        for (MofOperation anElement : aux) {
            result.add(MofOperationOptional.ofNullable(anElement));
        }
        return result;
    }

    public boolean addMofOwnedOperation(MofOperation anElement) {
        if (value != null) {
            return value.addMofOwnedOperation(anElement);
        }
        return false;
    }

    public boolean removeMofOwnedOperation(MofOperation anElement) {
        if (value != null) {
            return value.addMofOwnedOperation(anElement);
        }
        return false;
    }

    public Stream<MofOperation> getMofOwnedOperationAsStream() {
        if (value == null) {
            return Stream.empty();
        }
        Collection<MofOperation> coll = value.getOwnedOperation();
        if (coll == null) {
            return Stream.empty();
        }
        return coll.stream();
    }





    //==========================================================================//


    private MofClass    value;

}
