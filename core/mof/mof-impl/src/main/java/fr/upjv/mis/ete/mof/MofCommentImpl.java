package fr.upjv.mis.ete.mof;


import fr.upjv.mis.ete.mof.MofElement;

import fr.insset.jeanluc.util.factory.FactoryMethods;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2class.vm")
public class MofCommentImpl  extends fr.upjv.mis.ete.mof.MofElementImpl  implements MofComment {



    public void setBody(String inValue) {
        body = inValue;
    }

    public String getBody() {
        return body;
    }





    public void setAnnotatedElement(MofElement inValue) {
        annotatedElement = inValue;
    }

    public MofElement getAnnotatedElement() {
        return annotatedElement;
    }







    //==========================================================================//


    private  String  body;
    private  MofElement  annotatedElement;

}
