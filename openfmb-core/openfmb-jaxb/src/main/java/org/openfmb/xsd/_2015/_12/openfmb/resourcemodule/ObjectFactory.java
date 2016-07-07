//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.04 at 11:04:04 AM EDT 
//


package org.openfmb.xsd._2015._12.openfmb.resourcemodule;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openfmb.xsd._2015._12.openfmb.resourcemodule package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResourceStatusProfile_QNAME = new QName("http://openfmb.org/xsd/2015/12/openfmb/resourcemodule", "ResourceStatusProfile");
    private final static QName _ResourceReadingProfile_QNAME = new QName("http://openfmb.org/xsd/2015/12/openfmb/resourcemodule", "ResourceReadingProfile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openfmb.xsd._2015._12.openfmb.resourcemodule
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResourceStatusProfile }
     * 
     */
    public ResourceStatusProfile createResourceStatusProfile() {
        return new ResourceStatusProfile();
    }

    /**
     * Create an instance of {@link ResourceReadingProfile }
     * 
     */
    public ResourceReadingProfile createResourceReadingProfile() {
        return new ResourceReadingProfile();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceStatusProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openfmb.org/xsd/2015/12/openfmb/resourcemodule", name = "ResourceStatusProfile")
    public JAXBElement<ResourceStatusProfile> createResourceStatusProfile(ResourceStatusProfile value) {
        return new JAXBElement<ResourceStatusProfile>(_ResourceStatusProfile_QNAME, ResourceStatusProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceReadingProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openfmb.org/xsd/2015/12/openfmb/resourcemodule", name = "ResourceReadingProfile")
    public JAXBElement<ResourceReadingProfile> createResourceReadingProfile(ResourceReadingProfile value) {
        return new JAXBElement<ResourceReadingProfile>(_ResourceReadingProfile_QNAME, ResourceReadingProfile.class, null, value);
    }

}
