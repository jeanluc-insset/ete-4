package fr.upjv.mis.ete.mof;


import fr.upjv.mis.ete.mof.MofElement;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2optional.vm")
public class MofCommentOptional  extends fr.upjv.mis.ete.mof.MofElementOptional  implements MofComment {


    public static MofCommentOptional ofNullable(MofComment inValue) {
        MofCommentOptional result = new MofCommentOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public MofComment get() {
        return value;
    }


    //==========================================================================//




    public void setBody(String inValue) {
        if (value != null) {
            value.setBody(inValue);
        }
    }

    public String getBody() {
        if (value == null) {
            return value.getBody();
        }
        return value.getBody();
    }





    public void setAnnotatedElement(MofElement inValue) {
        if (value != null) {
            value.setAnnotatedElement(inValue);
        }
    }

    public MofElement getAnnotatedElement() {
        if (value == null) {
            return MofElementOptional.ofNullable(value.getAnnotatedElement());
        }
        return MofElementOptional.ofNullable(value.getAnnotatedElement());
    }







    //==========================================================================//


    private MofComment    value;

}
