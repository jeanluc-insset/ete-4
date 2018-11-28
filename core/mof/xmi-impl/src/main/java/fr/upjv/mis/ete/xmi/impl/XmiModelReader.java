package fr.upjv.mis.ete.xmi.impl;

import fr.insset.jeanluc.util.factory.AbstractFactory;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import fr.insset.jeanluc.util.visit.DynamicVisitor;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import fr.upjv.mis.ete.mof.MofNamedElement;
import fr.upjv.mis.ete.mof.MofModel;
import fr.upjv.mis.ete.mof.MofNamedElement;
import fr.upjv.mis.ete.mof.io.api.ModelReader;
import fr.upjv.mis.ete.mof.io.api.XMLModelReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author jldeleage
 */
public class XmiModelReader extends XMLModelReader {


    public final static String     PRIMITIVE_TYPE_PATH     = "//packagedElement[@*='uml:PrimitiveType']";
    public final static String     PACKAGE_PATH            = "uml:Package";
    public final static String     CLASS_PATH              = "//*[@*='uml:Package']/*[@*='uml:Class']";
    public final static String     ENUM_PATH               = "//*[@*='uml:Package']/*[@*='uml:Enumeration']";
    public final static String     ASSOCIATION_PATH        = "uml:Association";
    public final static String     PROPERTY_PATH           = "uml:Property";
    public final static String     OPERATION_PATH          = "uml:Operation";
    public final static String     INSTANCE_PATH           = "uml:InstanceSpecification";
    public final static String     SLOT_PATH               = "//slot";
    public final static String     INVARIANT_PATH          = ".//packagedElement/ownedRule";
    public final static String     PRECONDITION_PATH       = ".//ownedOperation/ownedRule[@*=../precondition/@*]";
    public final static String     POSTCONDITION_PATH      = ".//ownedOperation/ownedRule[@*=../postcondition/@*]";
    public final static String     CONSTRAINT_PATH         = ".//ownedOperation/ownedRule";
    public final static String     PROFILE_PATH            = "uml:Profile";
//    public final static String     PROFILE                 = MOF_PACKAGE;
    public final static String     STEREOTYPE_PATH         = "uml:Stereotype";
    public final static String     APPLIED_STEREOTYPE_PATH = ".//*[@base_Class]";
    public final static String     READER_VISITOR          = "reader_visitor";
    public final static String     XLIST                   = "xlist";



    public XmiModelReader() {
    }



//    @Override
//    public String getClassPath() {
//        return CLASS_PATH;
//    }
//
//    @Override
//    public String getStereotypePath() {
//        return STEREOTYPE_PATH;
//    }
//
//    @Override
//    public String getOperationPath() {
//        return OPERATION_PATH;
//    }
//
//    @Override
//    public String getPropertyPath() {
//        return PROPERTY_PATH;
//    }
//
//    @Override
//    public String getPackagePath() {
//        return PACKAGE_PATH;
//    }
//
//    @Override
//    public String getInvariantPath() {
//        return INVARIANT_PATH;
//    }
//
//    @Override
//    public String getPostConditionPath() {
//        return POSTCONDITION_PATH;
//    }
    


    //========================================================================//


    /**
     * Reads all elements described by inPath, using inNode as context.<br>
     * Each DOM element is converted into a NamedElement by the factory
     * associated to inType.<br>
     * Every element is added to its own parent in the model.
     * 
     * @param inNode
     * @param inModel
     * @param inPath
     * @param inType
     * @return
     * @throws IOException 
     */
    protected List<MofNamedElement> readElements(Node inNode, MofModel inModel,
                    String inPath, String inType) throws IOException {
        Logger      logger = Logger.getGlobal();
        try {
            NodeList elementsByType = getElementsByType(inPath, inNode);
            logger.log(Level.FINE, "Reading elements with " + inPath + " of type " + inType + " found " + elementsByType.getLength() + " elements");
            return _doReadElements(elementsByType, inNode, inModel, inPath, inType);
        } catch (XPathExpressionException ex) {
            Logger.getLogger(XmiModelReader.class.getName()).log(Level.INFO, null, ex);
            throw new IOException(ex);
        }
    }



    /**
     * Reads all elements matching the path, using inNode as context.<br>
     * Each DOM element is converted into a NamedElement by the factory
     * associated to inType.<br>
     * Every element is added to its own parent in the model.
     * 
     * @param inNode
     * @param inModel
     * @param inPath
     * @param inType
     * @return
     * @throws IOException 
     */
    protected List<MofNamedElement> readElementsByPath(Node inNode, MofModel inModel,
            String inPath, String inType) throws IOException {
        try {
            NodeList elementsByType = getElements(inPath, inNode);
            return _doReadElements(elementsByType, inNode, inModel, inPath, inType);
        } catch (XPathExpressionException ex) {
            Logger.getLogger(XmiModelReader.class.getName()).log(Level.FINE, null, ex);
            throw new IOException(ex);
        }
    }

    /**
     * Reads the elements in the node list. For each element, creates an
     * according named element and sets its name.<br>
     * The new named element is added to its parent.<br>
     * Then visitors are invoked for the new named element.
     * 
     * @param elements
     * @param inNode
     * @param inModel
     * @param inPath
     * @param inType
     * @return
     * @throws IOException 
     */
    protected List<MofNamedElement> _doReadElements(NodeList elements, Node inNode, MofModel inModel,
            String inPath, String inType) throws IOException {
        try {
            List<MofNamedElement> result = FactoryMethods.newList(MofNamedElement.class);
            AbstractFactory factory = FactoryRegistry.getRegistry().getFactory(inType);
            elements : for (int i=0 ; i<elements.getLength() ; i++) {
                Element domElement = (Element)elements.item(i);
                MofNamedElement newInstance = (MofNamedElement)factory.newInstance();
                String name = domElement.getAttribute("name");
                // TODO : we should read objects with empty name or no name.
                // Such objects can be associations
                if (null != name && !"".equals(name)) {
                    newInstance.setName(name);
                }
                String id = domElement.getAttribute("xmi:id");
                newInstance.setId(getModelId() + id);
                inModel.addMofElement(newInstance);
                Node parentNode = domElement.getParentNode();
                String parentId = getModelId() + (parentNode instanceof Element ? ((Element)parentNode).getAttribute("xmi:id"):"");
                MofNamedElement parentNamedElement = inModel.getElementById(parentId);
//                String parentName = parentNode instanceof Element ? ((Element)parentNode).getAttribute("name"):"";
//                PackageableElement parentElement = inModel.getElementByName(parentName);
                visitors : for (DynamicVisitor visitor : getVisitors()) {
                    try {
                        visitor.genericVisit(newInstance, parentNamedElement, inModel, domElement);
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                        Logger.getLogger(XmiModelReader.class.getName()).log(Level.FINE, null, ex);
                        Logger.getGlobal().log(Level.FINE, "Error when visiting {0} : {1}", new Object[]{newInstance.getName(), ex});
                        continue elements;
                    }
                }
                result.add(newInstance);
            }
            return result;
        } catch (InstantiationException ex) {
            Logger.getLogger(XmiModelReader.class.getName()).log(Level.FINE, null, ex);
            throw new IOException(ex);
        }
    }



    //==========================================================================//


    protected static int getModelId() {
        return modelId;
    }


    //==========================================================================//



    private     static  int     modelId;


}
