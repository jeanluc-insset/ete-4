package fr.upjv.mis.ete.mof;


import fr.upjv.mis.ete.mof.MofStructuralFeature;
import fr.upjv.mis.ete.mof.MofAssociation;

import fr.insset.jeanluc.util.factory.FactoryMethods;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2class.vm")
public class MofPropertyImpl  extends fr.upjv.mis.ete.mof.MofStructuralFeatureImpl  implements MofProperty {



    public void setAggregation(MofAggregationKind inValue) {
        aggregation = inValue;
    }

    public MofAggregationKind getAggregation() {
        return aggregation;
    }





    public void setDefaultValue(String inValue) {
        defaultValue = inValue;
    }

    public String getDefaultValue() {
        return defaultValue;
    }





    public void setIsComposite(Boolean inValue) {
        isComposite = inValue;
    }

    public Boolean getIsComposite() {
        return isComposite;
    }





    public void setIsDerived(Boolean inValue) {
        isDerived = inValue;
    }

    public Boolean getIsDerived() {
        return isDerived;
    }





    public void setAssociation(MofAssociation inValue) {
        association = inValue;
    }

    public MofAssociation getAssociation() {
        return association;
    }





    public void setOwningAssociation(MofAssociation inValue) {
        owningAssociation = inValue;
    }

    public MofAssociation getOwningAssociation() {
        return owningAssociation;
    }







    //==========================================================================//


    private  MofAggregationKind  aggregation;
    private  String  defaultValue;
    private  Boolean  isComposite;
    private  Boolean  isDerived;
    private  MofAssociation  association;
    private  MofAssociation  owningAssociation;

}
