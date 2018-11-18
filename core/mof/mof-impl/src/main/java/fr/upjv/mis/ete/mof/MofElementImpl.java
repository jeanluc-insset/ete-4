package fr.upjv.mis.ete.mof;



import fr.insset.jeanluc.util.factory.FactoryMethods;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2class.vm")
public class MofElementImpl  implements MofElement {



    public void setOwnedComment(List<MofComment> ownedComment) {
        this.ownedComment = ownedComment;
    }

    public List<MofComment> getOwnedComment() {
        return ownedComment;
    }

    public boolean addMofOwnedComment(MofComment anElement) {
        if (ownedComment == null) {
            try {
                ownedComment = FactoryMethods.newList(MofComment.class);
            } catch (Exception e) {
                Logger.getGlobal().log(Level.WARNING, "Unable to create a list");
            }
        }
        return ownedComment.add(anElement);
    }

    public boolean removeMofOwnedComment(MofComment anElement) {
        return ownedComment.remove(anElement);
    }

    public Stream<MofComment> getMofOwnedCommentAsStream() {
        return null;
    }





    //==========================================================================//


    private  List<MofComment> ownedComment;

}
