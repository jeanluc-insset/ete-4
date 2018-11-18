package fr.upjv.mis.ete.mof;


import fr.upjv.mis.ete.mof.MofClassifier;

import fr.insset.jeanluc.util.factory.FactoryMethods;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2class.vm")
public class MofClassImpl  extends fr.upjv.mis.ete.mof.MofClassifierImpl  implements MofClass {



    public void setOwnedAttribute(List<MofProperty> ownedAttribute) {
        this.ownedAttribute = ownedAttribute;
    }

    public List<MofProperty> getOwnedAttribute() {
        return ownedAttribute;
    }

    public boolean addMofOwnedAttribute(MofProperty anElement) {
        if (ownedAttribute == null) {
            try {
                ownedAttribute = FactoryMethods.newList(MofProperty.class);
            } catch (Exception e) {
                Logger.getGlobal().log(Level.WARNING, "Unable to create a list");
            }
        }
        return ownedAttribute.add(anElement);
    }

    public boolean removeMofOwnedAttribute(MofProperty anElement) {
        return ownedAttribute.remove(anElement);
    }

    public Stream<MofProperty> getMofOwnedAttributeAsStream() {
        return null;
    }



    public void setSuperclass(List<MofClass> superclass) {
        this.superclass = superclass;
    }

    public List<MofClass> getSuperclass() {
        return superclass;
    }

    public boolean addMofSuperclass(MofClass anElement) {
        if (superclass == null) {
            try {
                superclass = FactoryMethods.newList(MofClass.class);
            } catch (Exception e) {
                Logger.getGlobal().log(Level.WARNING, "Unable to create a list");
            }
        }
        return superclass.add(anElement);
    }

    public boolean removeMofSuperclass(MofClass anElement) {
        return superclass.remove(anElement);
    }

    public Stream<MofClass> getMofSuperclassAsStream() {
        return null;
    }



    public void setOwnedOperation(List<MofOperation> ownedOperation) {
        this.ownedOperation = ownedOperation;
    }

    public List<MofOperation> getOwnedOperation() {
        return ownedOperation;
    }

    public boolean addMofOwnedOperation(MofOperation anElement) {
        if (ownedOperation == null) {
            try {
                ownedOperation = FactoryMethods.newList(MofOperation.class);
            } catch (Exception e) {
                Logger.getGlobal().log(Level.WARNING, "Unable to create a list");
            }
        }
        return ownedOperation.add(anElement);
    }

    public boolean removeMofOwnedOperation(MofOperation anElement) {
        return ownedOperation.remove(anElement);
    }

    public Stream<MofOperation> getMofOwnedOperationAsStream() {
        return null;
    }





    //==========================================================================//


    private  List<MofProperty> ownedAttribute;
    private  List<MofClass> superclass;
    private  List<MofOperation> ownedOperation;

}
