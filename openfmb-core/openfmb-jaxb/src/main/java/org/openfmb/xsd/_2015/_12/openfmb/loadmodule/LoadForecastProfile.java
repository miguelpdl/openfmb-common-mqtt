//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.04 at 11:03:45 AM EDT 
//


package org.openfmb.xsd._2015._12.openfmb.loadmodule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openfmb.xsd._2015._12.openfmb.commonmodule.Container;
import org.openfmb.xsd._2015._12.openfmb.commonmodule.ForecastSchedule;


/**
 * Load forecast.
 * 
 * <p>Java class for LoadForecastProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadForecastProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}Container">
 *       &lt;sequence>
 *         &lt;element name="EnergyConsumer" type="{http://openfmb.org/xsd/2015/12/openfmb/loadmodule}EnergyConsumer"/>
 *         &lt;element name="ForecastSchedule" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}ForecastSchedule"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadForecastProfile", propOrder = {
    "energyConsumer",
    "forecastSchedule"
})
public class LoadForecastProfile
    extends Container
{

    @XmlElement(name = "EnergyConsumer", required = true)
    protected EnergyConsumer energyConsumer;
    @XmlElement(name = "ForecastSchedule", required = true)
    protected ForecastSchedule forecastSchedule;

    /**
     * Gets the value of the energyConsumer property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyConsumer }
     *     
     */
    public EnergyConsumer getEnergyConsumer() {
        return energyConsumer;
    }

    /**
     * Sets the value of the energyConsumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyConsumer }
     *     
     */
    public void setEnergyConsumer(EnergyConsumer value) {
        this.energyConsumer = value;
    }

    /**
     * Gets the value of the forecastSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastSchedule }
     *     
     */
    public ForecastSchedule getForecastSchedule() {
        return forecastSchedule;
    }

    /**
     * Sets the value of the forecastSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastSchedule }
     *     
     */
    public void setForecastSchedule(ForecastSchedule value) {
        this.forecastSchedule = value;
    }

}
