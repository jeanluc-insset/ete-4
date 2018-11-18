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
public class MofPackageOptional  extends fr.upjv.mis.ete.mof.MofPackageableElementOptional  implements MofPackage {


    public static MofPackageOptional ofNullable(MofPackage inValue) {
        MofPackageOptional result = new MofPackageOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public MofPackage get() {
        return value;
    }


    //==========================================================================//




    public void setPackagedElement(List<MofPackageableElement> packagedElement) {
        value.setPackagedElement(packagedElement);
    }

    public List<MofPackageableElement> getPackagedElement() {
        if (value == null) {
            return Collections.EMPTY_LIST;
        }
        List<MofPackageableElement> aux = value.getPackagedElement();
        if (aux == null) {
            return Collections.EMPTY_LIST;
        }
        List<MofPackageableElement> result = new LinkedList();
        for (MofPackageableElement anElement : aux) {
            result.add(MofPackageableElementOptional.ofNullable(anElement));
        }
        return result;
    }

    public boolean addMofPackagedElement(MofPackageableElement anElement) {
        if (value != null) {
            return value.addMofPackagedElement(anElement);
        }
        return false;
    }

    public boolean removeMofPackagedElement(MofPackageableElement anElement) {
        if (value != null) {
            return value.addMofPackagedElement(anElement);
        }
        return false;
    }

    public Stream<MofPackageableElement> getMofPackagedElementAsStream() {
        if (value == null) {
            return Stream.empty();
        }
        Collection<MofPackageableElement> coll = value.getPackagedElement();
        if (coll == null) {
            return Stream.empty();
        }
        return coll.stream();
    }



    public void setOwnedType(List<MofType> ownedType) {
        value.setOwnedType(ownedType);
    }

    public List<MofType> getOwnedType() {
        if (value == null) {
            return Collections.EMPTY_LIST;
        }
        List<MofType> aux = value.getOwnedType();
        if (aux == null) {
            return Collections.EMPTY_LIST;
        }
        List<MofType> result = new LinkedList();
        for (MofType anElement : aux) {
            result.add(MofTypeOptional.ofNullable(anElement));
        }
        return result;
    }

    public boolean addMofOwnedType(MofType anElement) {
        if (value != null) {
            return value.addMofOwnedType(anElement);
        }
        return false;
    }

    public boolean removeMofOwnedType(MofType anElement) {
        if (value != null) {
            return value.addMofOwnedType(anElement);
        }
        return false;
    }

    public Stream<MofType> getMofOwnedTypeAsStream() {
        if (value == null) {
            return Stream.empty();
        }
        Collection<MofType> coll = value.getOwnedType();
        if (coll == null) {
            return Stream.empty();
        }
        return coll.stream();
    }



    public void setNestedPackage(List<MofPackage> nestedPackage) {
        value.setNestedPackage(nestedPackage);
    }

    public List<MofPackage> getNestedPackage() {
        if (value == null) {
            return Collections.EMPTY_LIST;
        }
        List<MofPackage> aux = value.getNestedPackage();
        if (aux == null) {
            return Collections.EMPTY_LIST;
        }
        List<MofPackage> result = new LinkedList();
        for (MofPackage anElement : aux) {
            result.add(MofPackageOptional.ofNullable(anElement));
        }
        return result;
    }

    public boolean addMofNestedPackage(MofPackage anElement) {
        if (value != null) {
            return value.addMofNestedPackage(anElement);
        }
        return false;
    }

    public boolean removeMofNestedPackage(MofPackage anElement) {
        if (value != null) {
            return value.addMofNestedPackage(anElement);
        }
        return false;
    }

    public Stream<MofPackage> getMofNestedPackageAsStream() {
        if (value == null) {
            return Stream.empty();
        }
        Collection<MofPackage> coll = value.getNestedPackage();
        if (coll == null) {
            return Stream.empty();
        }
        return coll.stream();
    }



    public void setURI(String inValue) {
        if (value != null) {
            value.setURI(inValue);
        }
    }

    public String getURI() {
        if (value == null) {
            return value.getURI();
        }
        return value.getURI();
    }







    //==========================================================================//


    private MofPackage    value;

}
