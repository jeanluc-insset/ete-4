package fr.upjv.mis.ete.gel;


import fr.upjv.mis.ete.mof.MofTypedElement;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2optional.vm")
public class GelExpressionOptional  extends fr.upjv.mis.ete.mof.MofTypedElementOptional  implements GelExpression {


    public static GelExpressionOptional ofNullable(GelExpression inValue) {
        GelExpressionOptional result = new GelExpressionOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public GelExpression get() {
        return value;
    }


    //==========================================================================//




    public void setOperand(List<GelExpression> operand) {
        value.setOperand(operand);
    }

    public List<GelExpression> getOperand() {
        if (value == null) {
            return Collections.EMPTY_LIST;
        }
        List<GelExpression> aux = value.getOperand();
        if (aux == null) {
            return Collections.EMPTY_LIST;
        }
        List<GelExpression> result = new LinkedList();
        for (GelExpression anElement : aux) {
            result.add(GelExpressionOptional.ofNullable(anElement));
        }
        return result;
    }

    public boolean addGelOperand(GelExpression anElement) {
        if (value != null) {
            return value.addGelOperand(anElement);
        }
        return false;
    }

    public boolean removeGelOperand(GelExpression anElement) {
        if (value != null) {
            return value.addGelOperand(anElement);
        }
        return false;
    }

    public Stream<GelExpression> getGelOperandAsStream() {
        if (value == null) {
            return Stream.empty();
        }
        Collection<GelExpression> coll = value.getOperand();
        if (coll == null) {
            return Stream.empty();
        }
        return coll.stream();
    }





    //==========================================================================//


    private GelExpression    value;

}
