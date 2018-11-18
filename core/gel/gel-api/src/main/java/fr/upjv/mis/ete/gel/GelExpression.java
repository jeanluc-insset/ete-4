package fr.upjv.mis.ete.gel;

import fr.upjv.mis.ete.mof.MofTypedElement;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Generated;



@Generated("ETE ete/src/main/mde/spec/class2interface.vm")
public interface GelExpression  extends  MofTypedElement  {






    public void setOperand(List<GelExpression> operand);
    public List<GelExpression> getOperand();
    public boolean addGelOperand(GelExpression anElement);
    public boolean removeGelOperand(GelExpression anElement);
    public Stream<GelExpression> getGelOperandAsStream();

}
