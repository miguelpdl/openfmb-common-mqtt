//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.04 at 11:04:22 AM EDT 
//


package org.openfmb.xsd._2015._12.openfmb.weathermodule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openfmb.xsd._2015._12.openfmb.commonmodule.Container;


/**
 * <p>Java class for WeatherDataProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherDataProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}Container">
 *       &lt;sequence>
 *         &lt;element name="WeatherData" type="{http://openfmb.org/xsd/2015/12/openfmb/weathermodule}WeatherData"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherDataProfile", propOrder = {
    "weatherData"
})
public class WeatherDataProfile
    extends Container
{

    @XmlElement(name = "WeatherData", required = true)
    protected WeatherData weatherData;

    /**
     * Gets the value of the weatherData property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherData }
     *     
     */
    public WeatherData getWeatherData() {
        return weatherData;
    }

    /**
     * Sets the value of the weatherData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherData }
     *     
     */
    public void setWeatherData(WeatherData value) {
        this.weatherData = value;
    }

}
