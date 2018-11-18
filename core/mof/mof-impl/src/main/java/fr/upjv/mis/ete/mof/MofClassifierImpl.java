package fr.upjv.mis.ete.mof;


import fr.upjv.mis.ete.mof.MofType;

import fr.insset.jeanluc.util.factory.FactoryMethods;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2class.vm")
public class MofClassifierImpl  extends fr.upjv.mis.ete.mof.MofTypeImpl  implements MofClassifier {



    public void setIsAbstract(Boolean inValue) {
        isAbstract = inValue;
    }

    public Boolean getIsAbstract() {
        return isAbstract;
    }





    public void setGeneralization(List<MofGeneralization> generalization) {
        this.generalization = generalization;
    }

    public List<MofGeneralization> getGeneralization() {
        return generalization;
    }

    public boolean addMofGeneralization(MofGeneralization anElement) {
        if (generalization == null) {
            try {
                generalization = FactoryMethods.newList(MofGeneralization.class);
            } catch (Exception e) {
                Logger.getGlobal().log(Level.WARNING, "Unable to create a list");
            }
        }
        return generalization.add(anElement);
    }

    public boolean removeMofGeneralization(MofGeneralization anElement) {
        return generalization.remove(anElement);
    }

    public Stream<MofGeneralization> getMofGeneralizationAsStream() {
        return null;
    }





    //==========================================================================//


    private  Boolean  isAbstract;
    private  List<MofGeneralization> generalization;

}
