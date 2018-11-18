package fr.upjv.mis.ete.gel;

import fr.upjv.mis.ete.gel.GelExpression;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Generated;



@Generated("ETE ete/src/main/mde/spec/class2interface.vm")
public interface GelVariableDeclaration  extends  GelExpression  {






    public void setIdentifier(String identifier);
    public String getIdentifier();



    public void setValue(GelExpression value);
    public GelExpression getValue();


}
