package fr.upjv.mis.ete.mof;


import fr.upjv.mis.ete.mof.MofStructuralFeature;
import fr.upjv.mis.ete.mof.MofAssociation;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2optional.vm")
public class MofPropertyOptional  extends fr.upjv.mis.ete.mof.MofStructuralFeatureOptional  implements MofProperty {


    public static MofPropertyOptional ofNullable(MofProperty inValue) {
        MofPropertyOptional result = new MofPropertyOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public MofProperty get() {
        return value;
    }


    //==========================================================================//




    public void setAggregation(MofAggregationKind inValue) {
        if (value != null) {
            value.setAggregation(inValue);
        }
    }

    public MofAggregationKind getAggregation() {
        if (value == null) {
            return value.getAggregation();
        }
        return value.getAggregation();
    }





    public void setDefaultValue(String inValue) {
        if (value != null) {
            value.setDefaultValue(inValue);
        }
    }

    public String getDefaultValue() {
        if (value == null) {
            return value.getDefaultValue();
        }
        return value.getDefaultValue();
    }





    public void setIsComposite(Boolean inValue) {
        if (value != null) {
            value.setIsComposite(inValue);
        }
    }

    public Boolean getIsComposite() {
        if (value == null) {
            return value.getIsComposite();
        }
        return value.getIsComposite();
    }





    public void setIsDerived(Boolean inValue) {
        if (value != null) {
            value.setIsDerived(inValue);
        }
    }

    public Boolean getIsDerived() {
        if (value == null) {
            return value.getIsDerived();
        }
        return value.getIsDerived();
    }





    public void setAssociation(MofAssociation inValue) {
        if (value != null) {
            value.setAssociation(inValue);
        }
    }

    public MofAssociation getAssociation() {
        if (value == null) {
            return MofAssociationOptional.ofNullable(value.getAssociation());
        }
        return MofAssociationOptional.ofNullable(value.getAssociation());
    }





    public void setOwningAssociation(MofAssociation inValue) {
        if (value != null) {
            value.setOwningAssociation(inValue);
        }
    }

    public MofAssociation getOwningAssociation() {
        if (value == null) {
            return MofAssociationOptional.ofNullable(value.getOwningAssociation());
        }
        return MofAssociationOptional.ofNullable(value.getOwningAssociation());
    }







    //==========================================================================//


    private MofProperty    value;

}
