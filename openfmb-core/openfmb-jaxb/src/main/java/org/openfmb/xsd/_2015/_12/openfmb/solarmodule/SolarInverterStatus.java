//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.04 at 11:04:19 AM EDT 
//


package org.openfmb.xsd._2015._12.openfmb.solarmodule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.openfmb.xsd._2015._12.openfmb.commonmodule.Status;


/**
 * <p>Java class for SolarInverterStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SolarInverterStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}Status">
 *       &lt;sequence>
 *         &lt;element name="isConnected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolarInverterStatus", propOrder = {
    "isConnected"
})
public class SolarInverterStatus
    extends Status
{

    protected Boolean isConnected;

    /**
     * Gets the value of the isConnected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsConnected() {
        return isConnected;
    }

    /**
     * Sets the value of the isConnected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsConnected(Boolean value) {
        this.isConnected = value;
    }

}