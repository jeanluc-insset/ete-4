package fr.upjv.mis.ete.mof;

import fr.upjv.mis.ete.mof.MofClassifier;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Generated;



@Generated("ETE ete/src/main/mde/spec/class2interface.vm")
public interface MofClass  extends  MofClassifier  {


    public default $tagType.name getRelation() {
        return superclass;
    }

    // Tagged value of relation
    public default String getRelation() {
        return "superclass";
    }







    public void setOwnedAttribute(List<MofProperty> ownedAttribute);
    public List<MofProperty> getOwnedAttribute();
    public boolean addMofOwnedAttribute(MofProperty anElement);
    public boolean removeMofOwnedAttribute(MofProperty anElement);
    public Stream<MofProperty> getMofOwnedAttributeAsStream();
    public default List<MofProperty> getAllOwnedAttribute() {
        List<MofProperty>   result = getOwnedAttribute();
        for (MofClass aSuperItem : getSuperclass()) {
            result.addAll(aSuperItem.getAllOwnedAttribute());
        }
        return result;
    }


    public void setSuperclass(List<MofClass> superclass);
    public List<MofClass> getSuperclass();
    public boolean addMofSuperclass(MofClass anElement);
    public boolean removeMofSuperclass(MofClass anElement);
    public Stream<MofClass> getMofSuperclassAsStream();
    public default List<MofClass> getAllSuperclass() {
        List<MofClass>   result = getSuperclass();
        for (MofClass aSuperItem : getSuperclass()) {
            result.addAll(aSuperItem.getAllSuperclass());
        }
        return result;
    }


    public void setOwnedOperation(List<MofOperation> ownedOperation);
    public List<MofOperation> getOwnedOperation();
    public boolean addMofOwnedOperation(MofOperation anElement);
    public boolean removeMofOwnedOperation(MofOperation anElement);
    public Stream<MofOperation> getMofOwnedOperationAsStream();
    public default List<MofOperation> getAllOwnedOperation() {
        List<MofOperation>   result = getOwnedOperation();
        for (MofClass aSuperItem : getSuperclass()) {
            result.addAll(aSuperItem.getAllOwnedOperation());
        }
        return result;
    }

}
