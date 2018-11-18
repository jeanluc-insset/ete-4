package fr.upjv.mis.ete.mof;

import fr.upjv.mis.ete.mof.MofPackageableElement;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Generated;



@Generated("ETE ete/src/main/mde/spec/class2interface.vm")
public interface MofPackage  extends  MofPackageableElement  {







    public void setPackagedElement(List<MofPackageableElement> packagedElement);
    public List<MofPackageableElement> getPackagedElement();
    public boolean addMofPackagedElement(MofPackageableElement anElement);
    public boolean removeMofPackagedElement(MofPackageableElement anElement);
    public Stream<MofPackageableElement> getMofPackagedElementAsStream();


    public void setOwnedType(List<MofType> ownedType);
    public List<MofType> getOwnedType();
    public boolean addMofOwnedType(MofType anElement);
    public boolean removeMofOwnedType(MofType anElement);
    public Stream<MofType> getMofOwnedTypeAsStream();


    public void setNestedPackage(List<MofPackage> nestedPackage);
    public List<MofPackage> getNestedPackage();
    public boolean addMofNestedPackage(MofPackage anElement);
    public boolean removeMofNestedPackage(MofPackage anElement);
    public Stream<MofPackage> getMofNestedPackageAsStream();


    public void setURI(String URI);
    public String getURI();


}
