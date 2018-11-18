package fr.upjv.mis.ete.mof;

import fr.upjv.mis.ete.mof.MofDataType;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Generated;



@Generated("ETE ete/src/main/mde/spec/class2interface.vm")
public interface MofEnumeration  extends  MofDataType  {







    public void setOwnedLiteral(List<MofEnumerationLiteral> ownedLiteral);
    public List<MofEnumerationLiteral> getOwnedLiteral();
    public boolean addMofOwnedLiteral(MofEnumerationLiteral anElement);
    public boolean removeMofOwnedLiteral(MofEnumerationLiteral anElement);
    public Stream<MofEnumerationLiteral> getMofOwnedLiteralAsStream();

}
