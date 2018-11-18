package fr.upjv.mis.ete.mof;


import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Generated;



@Generated("ETE ete/src/main/mde/spec/class2interface.vm")
public interface MofOperation  {







    public void setIsOrdered(Boolean isOrdered);
    public Boolean getIsOrdered();



    public void setIsUnique(Boolean isUnique);
    public Boolean getIsUnique();



    public void setLower(Integer lower);
    public Integer getLower();



    public void setUpper(Integer upper);
    public Integer getUpper();



    public void setOwnedParameter(List<MofParameter> ownedParameter);
    public List<MofParameter> getOwnedParameter();
    public boolean addMofOwnedParameter(MofParameter anElement);
    public boolean removeMofOwnedParameter(MofParameter anElement);
    public Stream<MofParameter> getMofOwnedParameterAsStream();


    public void setRaisedException(List<MofType> raisedException);
    public List<MofType> getRaisedException();
    public boolean addMofRaisedException(MofType anElement);
    public boolean removeMofRaisedException(MofType anElement);
    public Stream<MofType> getMofRaisedExceptionAsStream();

}
