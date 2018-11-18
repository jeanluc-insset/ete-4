package fr.upjv.mis.ete.mof;


import fr.upjv.mis.ete.mof.MofNamedElement;
import fr.upjv.mis.ete.mof.MofType;

import fr.insset.jeanluc.util.factory.FactoryMethods;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2class.vm")
public class MofTypedElementImpl  extends fr.upjv.mis.ete.mof.MofNamedElementImpl  implements MofTypedElement {



    public void setType(MofType inValue) {
        type = inValue;
    }

    public MofType getType() {
        return type;
    }







    //==========================================================================//


    private  MofType  type;

}
