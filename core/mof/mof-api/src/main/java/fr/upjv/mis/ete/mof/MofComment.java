package fr.upjv.mis.ete.mof;

import fr.upjv.mis.ete.mof.MofElement;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Generated;



@Generated("ETE ete/src/main/mde/spec/class2interface.vm")
public interface MofComment  extends  MofElement  {







    public void setBody(String body);
    public String getBody();



    public void setAnnotatedElement(MofElement annotatedElement);
    public MofElement getAnnotatedElement();


}
