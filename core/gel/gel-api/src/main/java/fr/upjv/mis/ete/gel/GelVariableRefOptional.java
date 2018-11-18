package fr.upjv.mis.ete.gel;


import fr.upjv.mis.ete.gel.GelVariableDeclaration;
import fr.upjv.mis.ete.gel.GelStep;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2optional.vm")
public class GelVariableRefOptional  extends fr.upjv.mis.ete.gel.GelStepOptional  implements GelVariableRef {


    public static GelVariableRefOptional ofNullable(GelVariableRef inValue) {
        GelVariableRefOptional result = new GelVariableRefOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public GelVariableRef get() {
        return value;
    }


    //==========================================================================//




    public void setDeclaration(GelVariableDeclaration inValue) {
        if (value != null) {
            value.setDeclaration(inValue);
        }
    }

    public GelVariableDeclaration getDeclaration() {
        if (value == null) {
            return GelVariableDeclarationOptional.ofNullable(value.getDeclaration());
        }
        return GelVariableDeclarationOptional.ofNullable(value.getDeclaration());
    }







    //==========================================================================//


    private GelVariableRef    value;

}
