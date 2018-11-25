package fr.upjv.mis.ete.Gel;

import fr.insset.jeanluc.util.factory.FactoryMethods;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Generated;



@Generated("ETE ete/src/main/mde/spec/factory.vm")
public class GelFactories {

    public static void initFactories() {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        // operators
        registry.registerDefaultFactory("<", GelLessThanImpl.class);
        registry.registerDefaultFactory(GelLessThan.class, GelLessThanImpl.class);
        registry.registerDefaultFactory(".", GelNavImpl.class);
        registry.registerDefaultFactory(GelNav.class, GelNavImpl.class);
        registry.registerDefaultFactory("-", GelSubImpl.class);
        registry.registerDefaultFactory(GelSub.class, GelSubImpl.class);
        registry.registerDefaultFactory("/", GelModImpl.class);
        registry.registerDefaultFactory(GelMod.class, GelModImpl.class);
        registry.registerDefaultFactory("<=", GelLessOrEqualImpl.class);
        registry.registerDefaultFactory(GelLessOrEqual.class, GelLessOrEqualImpl.class);
        registry.registerDefaultFactory("", GelLessOrEqualImpl.class);
        registry.registerDefaultFactory(GelLessOrEqual.class, GelLessOrEqualImpl.class);
        registry.registerDefaultFactory("≤", GelLessOrEqualImpl.class);
        registry.registerDefaultFactory(GelLessOrEqual.class, GelLessOrEqualImpl.class);
        registry.registerDefaultFactory("->", GelCollOpImpl.class);
        registry.registerDefaultFactory(GelCollOp.class, GelCollOpImpl.class);
        registry.registerDefaultFactory(">=", GelGreaterOrEqualImpl.class);
        registry.registerDefaultFactory(GelGreaterOrEqual.class, GelGreaterOrEqualImpl.class);
        registry.registerDefaultFactory("≥", GelGreaterOrEqualImpl.class);
        registry.registerDefaultFactory(GelGreaterOrEqual.class, GelGreaterOrEqualImpl.class);
        registry.registerDefaultFactory("*", GelMultImpl.class);
        registry.registerDefaultFactory(GelMult.class, GelMultImpl.class);
        registry.registerDefaultFactory(">", GelGreaterThanImpl.class);
        registry.registerDefaultFactory(GelGreaterThan.class, GelGreaterThanImpl.class);
        registry.registerDefaultFactory("self", GelSelfImpl.class);
        registry.registerDefaultFactory(GelSelf.class, GelSelfImpl.class);
        registry.registerDefaultFactory("and", GelAndImpl.class);
        registry.registerDefaultFactory(GelAnd.class, GelAndImpl.class);
        registry.registerDefaultFactory("or", GelOrImpl.class);
        registry.registerDefaultFactory(GelOr.class, GelOrImpl.class);
        registry.registerDefaultFactory("+", GelAddImpl.class);
        registry.registerDefaultFactory(GelAdd.class, GelAddImpl.class);
        registry.registerDefaultFactory("xor", GelXorImpl.class);
        registry.registerDefaultFactory(GelXor.class, GelXorImpl.class);
        registry.registerDefaultFactory("variable", GelVariableRefImpl.class);
        registry.registerDefaultFactory(GelVariableRef.class, GelVariableRefImpl.class);
        registry.registerDefaultFactory("/", GelDivImpl.class);
        registry.registerDefaultFactory(GelDiv.class, GelDivImpl.class);
        // literals
        registry.registerDefaultFactory("regexLiteral", GelRegexLiteralImpl.class);
        registry.registerDefaultFactory("floatingPointLiteral", GelFloatingPointLiteralImpl.class);
        registry.registerDefaultFactory("booleanLiteral", GelBooleanLiteralImpl.class);
        registry.registerDefaultFactory("stringLiteral", GelStringLiteralImpl.class);
        registry.registerDefaultFactory("dateLiteral", GelDateLiteralImpl.class);
        registry.registerDefaultFactory("integerLiteral", GelIntegerLiteralImpl.class);
    }


}
