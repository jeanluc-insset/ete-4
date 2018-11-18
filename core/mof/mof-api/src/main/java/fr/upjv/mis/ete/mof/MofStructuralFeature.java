package fr.upjv.mis.ete.mof;

import fr.upjv.mis.ete.mof.MofTypedElement;
import fr.upjv.mis.ete.mof.MofMultiplicityElement;
import fr.upjv.mis.ete.mof.MofFeature;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Generated;



@Generated("ETE ete/src/main/mde/spec/class2interface.vm")
public interface MofStructuralFeature  extends  MofTypedElement, MofFeature, MofMultiplicityElement  {







    public void setIsReadOnly(Boolean isReadOnly);
    public Boolean getIsReadOnly();


}
