package fr.upjv.mis.ete.mof;


import fr.upjv.mis.ete.mof.MofClassifier;

import fr.insset.jeanluc.util.factory.FactoryMethods;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2class.vm")
public class MofGeneralizationImpl  implements MofGeneralization {



    public void setGeneral(MofClassifier inValue) {
        general = inValue;
    }

    public MofClassifier getGeneral() {
        return general;
    }







    //==========================================================================//


    private  MofClassifier  general;

}
