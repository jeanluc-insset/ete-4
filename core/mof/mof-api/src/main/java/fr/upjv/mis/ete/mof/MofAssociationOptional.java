package fr.upjv.mis.ete.mof;



import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2optional.vm")
public class MofAssociationOptional  implements MofAssociation {


    public static MofAssociationOptional ofNullable(MofAssociation inValue) {
        MofAssociationOptional result = new MofAssociationOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public MofAssociation get() {
        return value;
    }


    //==========================================================================//






    //==========================================================================//


    private MofAssociation    value;

}
