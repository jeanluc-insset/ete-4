package fr.upjv.mis.ete.mof.io.api;



import fr.insset.jeanluc.util.visit.DynamicVisitor;
import static fr.upjv.mis.ete.mof.MofClass.CLASS;
import static fr.upjv.mis.ete.mof.MofInvariant.INVARIANT;
import fr.upjv.mis.ete.mof.MofModel;
import static fr.upjv.mis.ete.mof.MofOperation.OPERATION;
import static fr.upjv.mis.ete.mof.MofPackage.PACKAGE;
import static fr.upjv.mis.ete.mof.MofProperty.PROPERTY;
import static fr.upjv.mis.ete.mof.MofStereotype.STEREOTYPE;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;




/**
 * Many modellers use XMI or a custom XML format.<br>
 * This class provides an XML Document as source object.<br>
 * The XML document is built from the url content.<br>
 * Furthermore this class provides some utility methods to parse XML documents.
 *
 * @author jldeleage
 */
public abstract class XMLModelReader implements ModelReader {


//    @Override
//    public Object getSource(InputStream inInput) throws Exception {
//        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//        return builder.parse(inInput);
//    }

    @Override
    public Object  getSource(InputStream inInput) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            return builder.parse(inInput);
        }   catch (SAXException ex) {
            Logger.getLogger(XMLModelReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(XMLModelReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XMLModelReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //==========================================================================//


    public abstract String getPath(String inFor);


    public void readStereotypes(MofModel inoutModel, Object inSource) {
        try {
            getElements(getPath(STEREOTYPE), (Document)inSource);
        } catch (XPathExpressionException ex) {
            Logger.getLogger(XMLModelReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void readInvariants(MofModel inoutModel, Object inSource) {
        try {
            getElements(getPath(INVARIANT), (Document)inSource);
        } catch (XPathExpressionException ex) {
            Logger.getLogger(XMLModelReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void readOperations(MofModel inoutModel, Object inSource) {
        try {
            getElements(getPath(OPERATION), (Document)inSource);
        } catch (XPathExpressionException ex) {
            Logger.getLogger(XMLModelReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void readProperties(MofModel inoutModel, Object inSource) {
        try {
            getElements(getPath(PROPERTY), (Document)inSource);
        } catch (XPathExpressionException ex) {
            Logger.getLogger(XMLModelReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void readClasses(MofModel inoutModel, Object inSource) {
        try {
            getElements(getPath(CLASS), (Document)inSource);
        } catch (XPathExpressionException ex) {
            Logger.getLogger(XMLModelReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void readPackages(MofModel inoutModel, Object inSource) {
        try {
            getElements(getPath(PACKAGE), (Document)inSource);
        } catch (XPathExpressionException ex) {
            Logger.getLogger(XMLModelReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }




    //==========================================================================//


    protected static NodeList getElementsByType(String inType, Node inSubTreeRoot) throws XPathExpressionException {
        String path = "//*[@*[local-name()='type']='" + inType + "']";
        NodeList result = getElements(path, inSubTreeRoot);
        return result;
    }


    protected static NodeList getElements(String inPath, Node inSubTreeRoot) throws XPathExpressionException {
        XPathFactory factory = XPathFactory.newInstance();
        XPath path = factory.newXPath();
        NodeList result = (NodeList)path.evaluate(inPath, inSubTreeRoot, XPathConstants.NODESET);
        return result;
    }


    protected static String getStringValue(String inPath, Node inSubTreeRoot) throws XPathExpressionException {
        XPathFactory factory = XPathFactory.newInstance();
        XPath path = factory.newXPath();
        String result = (String)path.evaluate(inPath, inSubTreeRoot, XPathConstants.STRING);
        return result;
    }


    //==========================================================================//


    public Collection<DynamicVisitor> getVisitors() {
        return visitors;
    }


    public void addVisitor(DynamicVisitor inVisitor) {
        visitors.add(inVisitor);
    }

    public void removeVisitor(DynamicVisitor inVisitor) {
        visitors.remove(inVisitor);
    }


    //==========================================================================//


    private     Collection<DynamicVisitor>     visitors = new LinkedList<>();


}
