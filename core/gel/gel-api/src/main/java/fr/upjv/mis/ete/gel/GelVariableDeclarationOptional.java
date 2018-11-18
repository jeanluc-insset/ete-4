package fr.upjv.mis.ete.gel;


import fr.upjv.mis.ete.gel.GelExpression;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2optional.vm")
public class GelVariableDeclarationOptional  extends fr.upjv.mis.ete.gel.GelExpressionOptional  implements GelVariableDeclaration {


    public static GelVariableDeclarationOptional ofNullable(GelVariableDeclaration inValue) {
        GelVariableDeclarationOptional result = new GelVariableDeclarationOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public GelVariableDeclaration get() {
        return value;
    }


    //==========================================================================//




    public void setIdentifier(String inValue) {
        if (value != null) {
            value.setIdentifier(inValue);
        }
    }

    public String getIdentifier() {
        if (value == null) {
            return value.getIdentifier();
        }
        return value.getIdentifier();
    }





    public void setValue(GelExpression inValue) {
        if (value != null) {
            value.setValue(inValue);
        }
    }

    public GelExpression getValue() {
        if (value == null) {
            return GelExpressionOptional.ofNullable(value.getValue());
        }
        return GelExpressionOptional.ofNullable(value.getValue());
    }







    //==========================================================================//


    private GelVariableDeclaration    value;

}
