package fr.upjv.mis.ete.mof;

import fr.upjv.mis.ete.mof.MofElement;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Generated;



@Generated("ETE ete/src/main/mde/spec/class2interface.vm")
public interface MofNamedElement  extends  MofElement  {







    public void setName(String name);
    public String getName();



    public void setQualifiedName(String qualifiedName);
    public String getQualifiedName();



    public void setVisibility(MofVisibilityKind visibility);
    public MofVisibilityKind getVisibility();


}
