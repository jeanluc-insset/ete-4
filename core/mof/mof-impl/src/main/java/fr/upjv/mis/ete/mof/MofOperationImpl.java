package fr.upjv.mis.ete.mof;



import fr.insset.jeanluc.util.factory.FactoryMethods;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2class.vm")
public class MofOperationImpl  implements MofOperation {



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





    public void setOwnedParameter(List<MofParameter> ownedParameter) {
        this.ownedParameter = ownedParameter;
    }

    public List<MofParameter> getOwnedParameter() {
        return ownedParameter;
    }

    public boolean addMofOwnedParameter(MofParameter anElement) {
        if (ownedParameter == null) {
            try {
                ownedParameter = FactoryMethods.newList(MofParameter.class);
            } catch (Exception e) {
                Logger.getGlobal().log(Level.WARNING, "Unable to create a list");
            }
        }
        return ownedParameter.add(anElement);
    }

    public boolean removeMofOwnedParameter(MofParameter anElement) {
        return ownedParameter.remove(anElement);
    }

    public Stream<MofParameter> getMofOwnedParameterAsStream() {
        return null;
    }



    public void setRaisedException(List<MofType> raisedException) {
        this.raisedException = raisedException;
    }

    public List<MofType> getRaisedException() {
        return raisedException;
    }

    public boolean addMofRaisedException(MofType anElement) {
        if (raisedException == null) {
            try {
                raisedException = FactoryMethods.newList(MofType.class);
            } catch (Exception e) {
                Logger.getGlobal().log(Level.WARNING, "Unable to create a list");
            }
        }
        return raisedException.add(anElement);
    }

    public boolean removeMofRaisedException(MofType anElement) {
        return raisedException.remove(anElement);
    }

    public Stream<MofType> getMofRaisedExceptionAsStream() {
        return null;
    }





    //==========================================================================//


    private  Boolean  isOrdered;
    private  Boolean  isUnique;
    private  Integer  lower;
    private  Integer  upper;
    private  List<MofParameter> ownedParameter;
    private  List<MofType> raisedException;

}
