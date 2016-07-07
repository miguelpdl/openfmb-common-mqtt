//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.04 at 11:03:32 AM EDT 
//


package org.openfmb.xsd._2015._12.openfmb.generationmodule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openfmb.xsd._2015._12.openfmb.commonmodule.Container;


/**
 * <p>Java class for GenerationControlProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenerationControlProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}Container">
 *       &lt;sequence>
 *         &lt;element name="GeneratingUnit" type="{http://openfmb.org/xsd/2015/12/openfmb/generationmodule}GeneratingUnit"/>
 *         &lt;element name="GenerationControl" type="{http://openfmb.org/xsd/2015/12/openfmb/generationmodule}GenerationControl"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerationControlProfile", propOrder = {
    "generatingUnit",
    "generationControl"
})
public class GenerationControlProfile
    extends Container
{

    @XmlElement(name = "GeneratingUnit", required = true)
    protected GeneratingUnit generatingUnit;
    @XmlElement(name = "GenerationControl", required = true)
    protected GenerationControl generationControl;

    /**
     * Gets the value of the generatingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link GeneratingUnit }
     *     
     */
    public GeneratingUnit getGeneratingUnit() {
        return generatingUnit;
    }

    /**
     * Sets the value of the generatingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneratingUnit }
     *     
     */
    public void setGeneratingUnit(GeneratingUnit value) {
        this.generatingUnit = value;
    }

    /**
     * Gets the value of the generationControl property.
     * 
     * @return
     *     possible object is
     *     {@link GenerationControl }
     *     
     */
    public GenerationControl getGenerationControl() {
        return generationControl;
    }

    /**
     * Sets the value of the generationControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenerationControl }
     *     
     */
    public void setGenerationControl(GenerationControl value) {
        this.generationControl = value;
    }

}
