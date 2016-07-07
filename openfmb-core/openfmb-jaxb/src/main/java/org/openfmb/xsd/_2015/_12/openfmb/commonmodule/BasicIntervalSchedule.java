//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.05 at 08:43:06 PM EDT 
//


package org.openfmb.xsd._2015._12.openfmb.commonmodule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Schedule of values at points in time.
 * 
 * <p>Java class for BasicIntervalSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicIntervalSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="value1Multiplier" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}UnitMultiplierKind" minOccurs="0"/>
 *         &lt;element name="value1Unit" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}UnitSymbolKind" minOccurs="0"/>
 *         &lt;element name="value2Multiplier" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}UnitMultiplierKind" minOccurs="0"/>
 *         &lt;element name="value2Unit" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}UnitSymbolKind" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicIntervalSchedule", propOrder = {
    "startTime",
    "value1Multiplier",
    "value1Unit",
    "value2Multiplier",
    "value2Unit"
})
@XmlSeeAlso({
    ForecastSchedule.class
})
public class BasicIntervalSchedule {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlSchemaType(name = "string")
    protected UnitMultiplierKind value1Multiplier;
    @XmlSchemaType(name = "string")
    protected UnitSymbolKind value1Unit;
    @XmlSchemaType(name = "string")
    protected UnitMultiplierKind value2Multiplier;
    @XmlSchemaType(name = "string")
    protected UnitSymbolKind value2Unit;

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the value1Multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link UnitMultiplierKind }
     *     
     */
    public UnitMultiplierKind getValue1Multiplier() {
        return value1Multiplier;
    }

    /**
     * Sets the value of the value1Multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitMultiplierKind }
     *     
     */
    public void setValue1Multiplier(UnitMultiplierKind value) {
        this.value1Multiplier = value;
    }

    /**
     * Gets the value of the value1Unit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitSymbolKind }
     *     
     */
    public UnitSymbolKind getValue1Unit() {
        return value1Unit;
    }

    /**
     * Sets the value of the value1Unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitSymbolKind }
     *     
     */
    public void setValue1Unit(UnitSymbolKind value) {
        this.value1Unit = value;
    }

    /**
     * Gets the value of the value2Multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link UnitMultiplierKind }
     *     
     */
    public UnitMultiplierKind getValue2Multiplier() {
        return value2Multiplier;
    }

    /**
     * Sets the value of the value2Multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitMultiplierKind }
     *     
     */
    public void setValue2Multiplier(UnitMultiplierKind value) {
        this.value2Multiplier = value;
    }

    /**
     * Gets the value of the value2Unit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitSymbolKind }
     *     
     */
    public UnitSymbolKind getValue2Unit() {
        return value2Unit;
    }

    /**
     * Sets the value of the value2Unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitSymbolKind }
     *     
     */
    public void setValue2Unit(UnitSymbolKind value) {
        this.value2Unit = value;
    }

}