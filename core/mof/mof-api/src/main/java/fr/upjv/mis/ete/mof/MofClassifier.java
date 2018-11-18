package fr.upjv.mis.ete.mof;

import fr.upjv.mis.ete.mof.MofType;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Generated;



@Generated("ETE ete/src/main/mde/spec/class2interface.vm")
public interface MofClassifier  extends  MofType  {







    public void setIsAbstract(Boolean isAbstract);
    public Boolean getIsAbstract();



    public void setGeneralization(List<MofGeneralization> generalization);
    public List<MofGeneralization> getGeneralization();
    public boolean addMofGeneralization(MofGeneralization anElement);
    public boolean removeMofGeneralization(MofGeneralization anElement);
    public Stream<MofGeneralization> getMofGeneralizationAsStream();

}
