//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.05 at 08:43:06 PM EDT 
//


package org.openfmb.xsd._2015._12.openfmb.commonmodule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * String measurement
 * 
 * <p>Java class for BooleanMeasurement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BooleanMeasurement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measurementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mRID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phases" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}PhaseCodeKind" minOccurs="0"/>
 *         &lt;element name="BooleanMeasurementValue" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}BooleanMeasurementValue"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BooleanMeasurement", propOrder = {
    "description",
    "measurementType",
    "mrid",
    "name",
    "phases",
    "booleanMeasurementValue"
})
public class BooleanMeasurement {

    protected String description;
    protected String measurementType;
    @XmlElement(name = "mRID")
    protected String mrid;
    protected String name;
    @XmlSchemaType(name = "string")
    protected PhaseCodeKind phases;
    @XmlElement(name = "BooleanMeasurementValue", required = true)
    protected BooleanMeasurementValue booleanMeasurementValue;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the measurementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementType() {
        return measurementType;
    }

    /**
     * Sets the value of the measurementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementType(String value) {
        this.measurementType = value;
    }

    /**
     * Gets the value of the mrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRID() {
        return mrid;
    }

    /**
     * Sets the value of the mrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRID(String value) {
        this.mrid = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the phases property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCodeKind }
     *     
     */
    public PhaseCodeKind getPhases() {
        return phases;
    }

    /**
     * Sets the value of the phases property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCodeKind }
     *     
     */
    public void setPhases(PhaseCodeKind value) {
        this.phases = value;
    }

    /**
     * Gets the value of the booleanMeasurementValue property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanMeasurementValue }
     *     
     */
    public BooleanMeasurementValue getBooleanMeasurementValue() {
        return booleanMeasurementValue;
    }

    /**
     * Sets the value of the booleanMeasurementValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanMeasurementValue }
     *     
     */
    public void setBooleanMeasurementValue(BooleanMeasurementValue value) {
        this.booleanMeasurementValue = value;
    }

}