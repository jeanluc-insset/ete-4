package fr.upjv.mis.ete.gel;

import fr.upjv.mis.ete.gel.GelExpression;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Generated;



@Generated("ETE ete/src/main/mde/spec/class2interface.vm")
public interface GelAnd  extends  GelExpression  {


    // Tagged value of symbol
    public default String getSymbol() {
        return "and";
    }


    // Tagged value of arity
    public default String getArity() {
        return "2";
    }


    // Tagged value of isAssociative
    public default boolean getIsAssociative() {
        return true;
    }


    // Tagged value of priority
    public default int getPriority() {
        return 16;
    }





}
