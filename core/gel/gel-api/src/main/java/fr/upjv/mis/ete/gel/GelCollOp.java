package fr.upjv.mis.ete.gel;

import fr.upjv.mis.ete.mof.MofFeature;
import fr.upjv.mis.ete.gel.GelExpression;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Generated;



@Generated("ETE ete/src/main/mde/spec/class2interface.vm")
public interface GelCollOp  extends  GelExpression  {


    // Tagged value of symbol
    public default String getSymbol() {
        return "->";
    }


    // Tagged value of arity
    public default String getArity() {
        return "1";
    }


    // Tagged value of isAssociative
    public default boolean getIsAssociative() {
        return false;
    }


    // Tagged value of priority
    public default int getPriority() {
        return 50;
    }






    public void setOperation(MofFeature operation);
    public MofFeature getOperation();


}
