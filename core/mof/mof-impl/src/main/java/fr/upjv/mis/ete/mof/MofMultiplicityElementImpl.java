package fr.upjv.mis.ete.mof;



import fr.insset.jeanluc.util.factory.FactoryMethods;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2class.vm")
public class MofMultiplicityElementImpl  implements MofMultiplicityElement {



    public void setIsOrdered(Boolean inValue) {
        isOrdered = inValue;
    }

    public Boolean getIsOrdered() {
        return isOrdered;
    }





    public void setIsUnique(Boolean inValue) {
        isUnique = inValue;
    }

    public Boolean getIsUnique() {
        return isUnique;
    }





    public void setLower(Integer inValue) {
        lower = inValue;
    }

    public Integer getLower() {
        return lower;
    }





    public void setUpper(Integer inValue) {
        upper = inValue;
    }

    public Integer getUpper() {
        return upper;
    }







    //==========================================================================//


    private  Boolean  isOrdered;
    private  Boolean  isUnique;
    private  Integer  lower;
    private  Integer  upper;

}
