package fr.upjv.mis.ete.mof;


import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Generated;



@Generated("ETE ete/src/main/mde/spec/class2interface.vm")
public interface MofElement  {







    public void setOwnedComment(List<MofComment> ownedComment);
    public List<MofComment> getOwnedComment();
    public boolean addMofOwnedComment(MofComment anElement);
    public boolean removeMofOwnedComment(MofComment anElement);
    public Stream<MofComment> getMofOwnedCommentAsStream();

}
