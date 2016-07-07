//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.04 at 11:04:22 AM EDT 
//


package org.openfmb.xsd._2015._12.openfmb.weathermodule;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.openfmb.xsd._2015._12.openfmb.commonmodule.UnitSymbolKind;


/**
 * <p>Java class for Temperature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Temperature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unit" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}UnitSymbolKind" minOccurs="0"/>
 *         &lt;element name="TemperatureData" type="{http://openfmb.org/xsd/2015/12/openfmb/weathermodule}TemperatureData" maxOccurs="100" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Temperature", propOrder = {
    "unit",
    "temperatureData"
})
public class Temperature {

    @XmlSchemaType(name = "string")
    protected UnitSymbolKind unit;
    @XmlElement(name = "TemperatureData")
    protected List<TemperatureData> temperatureData;

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitSymbolKind }
     *     
     */
    public UnitSymbolKind getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitSymbolKind }
     *     
     */
    public void setUnit(UnitSymbolKind value) {
        this.unit = value;
    }

    /**
     * Gets the value of the temperatureData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temperatureData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemperatureData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemperatureData }
     * 
     * 
     */
    public List<TemperatureData> getTemperatureData() {
        if (temperatureData == null) {
            temperatureData = new ArrayList<TemperatureData>();
        }
        return this.temperatureData;
    }

}
