//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.04 at 11:03:19 AM EDT 
//


package org.openfmb.xsd._2015._12.openfmb.batterymodule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.openfmb.xsd._2015._12.openfmb.commonmodule.Status;


/**
 * <p>Java class for BatteryStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatteryStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}Status">
 *       &lt;sequence>
 *         &lt;element name="isCharging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isConnected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateOfCharge" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatteryStatus", propOrder = {
    "isCharging",
    "isConnected",
    "mode",
    "stateOfCharge"
})
public class BatteryStatus
    extends Status
{

    protected Boolean isCharging;
    protected Boolean isConnected;
    protected String mode;
    protected Float stateOfCharge;

    /**
     * Gets the value of the isCharging property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCharging() {
        return isCharging;
    }

    /**
     * Sets the value of the isCharging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCharging(Boolean value) {
        this.isCharging = value;
    }

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

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the stateOfCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getStateOfCharge() {
        return stateOfCharge;
    }

    /**
     * Sets the value of the stateOfCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStateOfCharge(Float value) {
        this.stateOfCharge = value;
    }

}
