package fr.upjv.mis.ete.gel;

import fr.upjv.mis.ete.gel.GelStep;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Generated;



@Generated("ETE ete/src/main/mde/spec/class2interface.vm")
public interface GelSelf  extends  GelStep  {


    // Tagged value of symbol
    public default String getSymbol() {
        return "self";
    }


    // Tagged value of arity
    public default String getArity() {
        return "noop";
    }





}
