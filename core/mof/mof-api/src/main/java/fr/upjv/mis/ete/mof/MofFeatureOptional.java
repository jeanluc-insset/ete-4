package fr.upjv.mis.ete.mof;



import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2optional.vm")
public class MofFeatureOptional  implements MofFeature {


    public static MofFeatureOptional ofNullable(MofFeature inValue) {
        MofFeatureOptional result = new MofFeatureOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public MofFeature get() {
        return value;
    }


    //==========================================================================//






    //==========================================================================//


    private MofFeature    value;

}
