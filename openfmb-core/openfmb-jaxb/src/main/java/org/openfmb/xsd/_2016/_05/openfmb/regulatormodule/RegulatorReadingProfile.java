//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.04 at 11:03:58 AM EDT 
//


package org.openfmb.xsd._2016._05.openfmb.regulatormodule;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openfmb.xsd._2015._12.openfmb.commonmodule.Container;
import org.openfmb.xsd._2015._12.openfmb.commonmodule.Reading;


/**
 * <p>Java class for RegulatorReadingProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegulatorReadingProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}Container">
 *       &lt;sequence>
 *         &lt;element name="Readings" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}Reading" maxOccurs="100"/>
 *         &lt;element name="ShuntSystem" type="{http://openfmb.org/xsd/2016/05/openfmb/regulatormodule}RegulatorSystem"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatorReadingProfile", propOrder = {
    "readings",
    "shuntSystem"
})
public class RegulatorReadingProfile
    extends Container
{

    @XmlElement(name = "Readings", required = true)
    protected List<Reading> readings;
    @XmlElement(name = "ShuntSystem", required = true)
    protected RegulatorSystem shuntSystem;

    /**
     * Gets the value of the readings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the readings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReadings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reading }
     * 
     * 
     */
    public List<Reading> getReadings() {
        if (readings == null) {
            readings = new ArrayList<Reading>();
        }
        return this.readings;
    }

    /**
     * Gets the value of the shuntSystem property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatorSystem }
     *     
     */
    public RegulatorSystem getShuntSystem() {
        return shuntSystem;
    }

    /**
     * Sets the value of the shuntSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatorSystem }
     *     
     */
    public void setShuntSystem(RegulatorSystem value) {
        this.shuntSystem = value;
    }

}
