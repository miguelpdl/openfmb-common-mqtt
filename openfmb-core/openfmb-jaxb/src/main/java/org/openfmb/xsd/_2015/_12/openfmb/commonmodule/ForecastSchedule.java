//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.05 at 08:43:06 PM EDT 
//


package org.openfmb.xsd._2015._12.openfmb.commonmodule;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The forecast schedule has time points where the time between them varies.
 * 
 * <p>Java class for ForecastSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}BasicIntervalSchedule">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IrregularTimePoint" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}IrregularTimePoint" maxOccurs="100" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastSchedule", propOrder = {
    "version",
    "versionDateTime",
    "irregularTimePoint"
})
public class ForecastSchedule
    extends BasicIntervalSchedule
{

    protected String version;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar versionDateTime;
    @XmlElement(name = "IrregularTimePoint")
    protected List<IrregularTimePoint> irregularTimePoint;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the versionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionDateTime() {
        return versionDateTime;
    }

    /**
     * Sets the value of the versionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersionDateTime(XMLGregorianCalendar value) {
        this.versionDateTime = value;
    }

    /**
     * Gets the value of the irregularTimePoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the irregularTimePoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIrregularTimePoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IrregularTimePoint }
     * 
     * 
     */
    public List<IrregularTimePoint> getIrregularTimePoint() {
        if (irregularTimePoint == null) {
            irregularTimePoint = new ArrayList<IrregularTimePoint>();
        }
        return this.irregularTimePoint;
    }

}
