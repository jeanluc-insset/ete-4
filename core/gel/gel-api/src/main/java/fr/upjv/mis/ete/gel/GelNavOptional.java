package fr.upjv.mis.ete.gel;


import fr.upjv.mis.ete.gel.GelStep;
import fr.upjv.mis.ete.mof.MofFeature;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2optional.vm")
public class GelNavOptional  extends fr.upjv.mis.ete.gel.GelStepOptional  implements GelNav {


    public static GelNavOptional ofNullable(GelNav inValue) {
        GelNavOptional result = new GelNavOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public GelNav get() {
        return value;
    }


    //==========================================================================//




    public void setTarget(MofFeature inValue) {
        if (value != null) {
            value.setTarget(inValue);
        }
    }

    public MofFeature getTarget() {
        if (value == null) {
            return value.getTarget();
        }
        return value.getTarget();
    }







    //==========================================================================//


    private GelNav    value;

}
