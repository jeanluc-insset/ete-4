package fr.upjv.mis.ete.mof;

import fr.upjv.mis.ete.mof.MofStructuralFeature;
import fr.upjv.mis.ete.mof.MofAssociation;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Generated;



@Generated("ETE ete/src/main/mde/spec/class2interface.vm")
public interface MofProperty  extends  MofStructuralFeature  {







    public void setAggregation(MofAggregationKind aggregation);
    public MofAggregationKind getAggregation();



    public void setDefaultValue(String defaultValue);
    public String getDefaultValue();



    public void setIsComposite(Boolean isComposite);
    public Boolean getIsComposite();



    public void setIsDerived(Boolean isDerived);
    public Boolean getIsDerived();



    public void setAssociation(MofAssociation association);
    public MofAssociation getAssociation();



    public void setOwningAssociation(MofAssociation owningAssociation);
    public MofAssociation getOwningAssociation();


}
