package fr.upjv.mis.ete.gel;


import fr.upjv.mis.ete.mof.MofTypedElement;

import fr.insset.jeanluc.util.factory.FactoryMethods;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2class.vm")
public class GelExpressionImpl  extends fr.upjv.mis.ete.mof.MofTypedElementImpl  implements GelExpression {



    public void setOperand(List<GelExpression> operand) {
        this.operand = operand;
    }

    public List<GelExpression> getOperand() {
        return operand;
    }

    public boolean addGelOperand(GelExpression anElement) {
        if (operand == null) {
            try {
                operand = FactoryMethods.newList(GelExpression.class);
            } catch (Exception e) {
                Logger.getGlobal().log(Level.WARNING, "Unable to create a list");
            }
        }
        return operand.add(anElement);
    }

    public boolean removeGelOperand(GelExpression anElement) {
        return operand.remove(anElement);
    }

    public Stream<GelExpression> getGelOperandAsStream() {
        return null;
    }





    //==========================================================================//


    private  List<GelExpression> operand;

}
