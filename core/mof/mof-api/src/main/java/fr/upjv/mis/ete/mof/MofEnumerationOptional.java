package fr.upjv.mis.ete.mof;


import fr.upjv.mis.ete.mof.MofDataType;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2optional.vm")
public class MofEnumerationOptional  extends fr.upjv.mis.ete.mof.MofDataTypeOptional  implements MofEnumeration {


    public static MofEnumerationOptional ofNullable(MofEnumeration inValue) {
        MofEnumerationOptional result = new MofEnumerationOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public MofEnumeration get() {
        return value;
    }


    //==========================================================================//




    public void setOwnedLiteral(List<MofEnumerationLiteral> ownedLiteral) {
        value.setOwnedLiteral(ownedLiteral);
    }

    public List<MofEnumerationLiteral> getOwnedLiteral() {
        if (value == null) {
            return Collections.EMPTY_LIST;
        }
        List<MofEnumerationLiteral> aux = value.getOwnedLiteral();
        if (aux == null) {
            return Collections.EMPTY_LIST;
        }
        List<MofEnumerationLiteral> result = new LinkedList();
        for (MofEnumerationLiteral anElement : aux) {
            result.add(MofEnumerationLiteralOptional.ofNullable(anElement));
        }
        return result;
    }

    public boolean addMofOwnedLiteral(MofEnumerationLiteral anElement) {
        if (value != null) {
            return value.addMofOwnedLiteral(anElement);
        }
        return false;
    }

    public boolean removeMofOwnedLiteral(MofEnumerationLiteral anElement) {
        if (value != null) {
            return value.addMofOwnedLiteral(anElement);
        }
        return false;
    }

    public Stream<MofEnumerationLiteral> getMofOwnedLiteralAsStream() {
        if (value == null) {
            return Stream.empty();
        }
        Collection<MofEnumerationLiteral> coll = value.getOwnedLiteral();
        if (coll == null) {
            return Stream.empty();
        }
        return coll.stream();
    }





    //==========================================================================//


    private MofEnumeration    value;

}
