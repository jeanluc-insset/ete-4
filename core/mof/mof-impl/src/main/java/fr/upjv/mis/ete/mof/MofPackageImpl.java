package fr.upjv.mis.ete.mof;


import fr.upjv.mis.ete.mof.MofPackageableElement;

import fr.insset.jeanluc.util.factory.FactoryMethods;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2class.vm")
public class MofPackageImpl  extends fr.upjv.mis.ete.mof.MofPackageableElementImpl  implements MofPackage {



    public void setPackagedElement(List<MofPackageableElement> packagedElement) {
        this.packagedElement = packagedElement;
    }

    public List<MofPackageableElement> getPackagedElement() {
        return packagedElement;
    }

    public boolean addMofPackagedElement(MofPackageableElement anElement) {
        if (packagedElement == null) {
            try {
                packagedElement = FactoryMethods.newList(MofPackageableElement.class);
            } catch (Exception e) {
                Logger.getGlobal().log(Level.WARNING, "Unable to create a list");
            }
        }
        return packagedElement.add(anElement);
    }

    public boolean removeMofPackagedElement(MofPackageableElement anElement) {
        return packagedElement.remove(anElement);
    }

    public Stream<MofPackageableElement> getMofPackagedElementAsStream() {
        return null;
    }



    public void setOwnedType(List<MofType> ownedType) {
        this.ownedType = ownedType;
    }

    public List<MofType> getOwnedType() {
        return ownedType;
    }

    public boolean addMofOwnedType(MofType anElement) {
        if (ownedType == null) {
            try {
                ownedType = FactoryMethods.newList(MofType.class);
            } catch (Exception e) {
                Logger.getGlobal().log(Level.WARNING, "Unable to create a list");
            }
        }
        return ownedType.add(anElement);
    }

    public boolean removeMofOwnedType(MofType anElement) {
        return ownedType.remove(anElement);
    }

    public Stream<MofType> getMofOwnedTypeAsStream() {
        return null;
    }



    public void setNestedPackage(List<MofPackage> nestedPackage) {
        this.nestedPackage = nestedPackage;
    }

    public List<MofPackage> getNestedPackage() {
        return nestedPackage;
    }

    public boolean addMofNestedPackage(MofPackage anElement) {
        if (nestedPackage == null) {
            try {
                nestedPackage = FactoryMethods.newList(MofPackage.class);
            } catch (Exception e) {
                Logger.getGlobal().log(Level.WARNING, "Unable to create a list");
            }
        }
        return nestedPackage.add(anElement);
    }

    public boolean removeMofNestedPackage(MofPackage anElement) {
        return nestedPackage.remove(anElement);
    }

    public Stream<MofPackage> getMofNestedPackageAsStream() {
        return null;
    }



    public void setURI(String inValue) {
        URI = inValue;
    }

    public String getURI() {
        return URI;
    }







    //==========================================================================//


    private  List<MofPackageableElement> packagedElement;
    private  List<MofType> ownedType;
    private  List<MofPackage> nestedPackage;
    private  String  URI;

}
