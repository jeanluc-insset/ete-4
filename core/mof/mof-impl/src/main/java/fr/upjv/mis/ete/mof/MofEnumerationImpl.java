package fr.upjv.mis.ete.mof;


import fr.upjv.mis.ete.mof.MofDataType;

import fr.insset.jeanluc.util.factory.FactoryMethods;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2class.vm")
public class MofEnumerationImpl  extends fr.upjv.mis.ete.mof.MofDataTypeImpl  implements MofEnumeration {



    public void setOwnedLiteral(List<MofEnumerationLiteral> ownedLiteral) {
        this.ownedLiteral = ownedLiteral;
    }

    public List<MofEnumerationLiteral> getOwnedLiteral() {
        return ownedLiteral;
    }

    public boolean addMofOwnedLiteral(MofEnumerationLiteral anElement) {
        if (ownedLiteral == null) {
            try {
                ownedLiteral = FactoryMethods.newList(MofEnumerationLiteral.class);
            } catch (Exception e) {
                Logger.getGlobal().log(Level.WARNING, "Unable to create a list");
            }
        }
        return ownedLiteral.add(anElement);
    }

    public boolean removeMofOwnedLiteral(MofEnumerationLiteral anElement) {
        return ownedLiteral.remove(anElement);
    }

    public Stream<MofEnumerationLiteral> getMofOwnedLiteralAsStream() {
        return null;
    }





    //==========================================================================//


    private  List<MofEnumerationLiteral> ownedLiteral;

}
