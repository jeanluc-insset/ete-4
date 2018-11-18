package fr.upjv.mis.ete.mof;


import fr.upjv.mis.ete.mof.MofElement;

import fr.insset.jeanluc.util.factory.FactoryMethods;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2class.vm")
public class MofNamedElementImpl  extends fr.upjv.mis.ete.mof.MofElementImpl  implements MofNamedElement {



    public void setName(String inValue) {
        name = inValue;
    }

    public String getName() {
        return name;
    }





    public void setQualifiedName(String inValue) {
        qualifiedName = inValue;
    }

    public String getQualifiedName() {
        return qualifiedName;
    }





    public void setVisibility(MofVisibilityKind inValue) {
        visibility = inValue;
    }

    public MofVisibilityKind getVisibility() {
        return visibility;
    }







    //==========================================================================//


    private  String  name;
    private  String  qualifiedName;
    private  MofVisibilityKind  visibility;

}
