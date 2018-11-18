package fr.upjv.mis.ete.mof;



import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2optional.vm")
public class MofElementOptional  implements MofElement {


    public static MofElementOptional ofNullable(MofElement inValue) {
        MofElementOptional result = new MofElementOptional();
        result.value = inValue;
        return result;
    }


    public boolean isPresent() {
        return value != null;
    }


    public MofElement get() {
        return value;
    }


    //==========================================================================//




    public void setOwnedComment(List<MofComment> ownedComment) {
        value.setOwnedComment(ownedComment);
    }

    public List<MofComment> getOwnedComment() {
        if (value == null) {
            return Collections.EMPTY_LIST;
        }
        List<MofComment> aux = value.getOwnedComment();
        if (aux == null) {
            return Collections.EMPTY_LIST;
        }
        List<MofComment> result = new LinkedList();
        for (MofComment anElement : aux) {
            result.add(MofCommentOptional.ofNullable(anElement));
        }
        return result;
    }

    public boolean addMofOwnedComment(MofComment anElement) {
        if (value != null) {
            return value.addMofOwnedComment(anElement);
        }
        return false;
    }

    public boolean removeMofOwnedComment(MofComment anElement) {
        if (value != null) {
            return value.addMofOwnedComment(anElement);
        }
        return false;
    }

    public Stream<MofComment> getMofOwnedCommentAsStream() {
        if (value == null) {
            return Stream.empty();
        }
        Collection<MofComment> coll = value.getOwnedComment();
        if (coll == null) {
            return Stream.empty();
        }
        return coll.stream();
    }





    //==========================================================================//


    private MofElement    value;

}
