package fr.upjv.mis.ete.gel;


import fr.upjv.mis.ete.gel.GelVariableDeclaration;
import fr.upjv.mis.ete.gel.GelStep;

import fr.insset.jeanluc.util.factory.FactoryMethods;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Generated;


@Generated("ETE ete/src/main/mde/spec/class2class.vm")
public class GelVariableRefImpl  extends fr.upjv.mis.ete.gel.GelStepImpl  implements GelVariableRef {



    public void setDeclaration(GelVariableDeclaration inValue) {
        declaration = inValue;
    }

    public GelVariableDeclaration getDeclaration() {
        return declaration;
    }







    //==========================================================================//


    private  GelVariableDeclaration  declaration;

}
