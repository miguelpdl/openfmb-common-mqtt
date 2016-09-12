/**
 * Copyright 2016 Duke Energy.
 *
 * Licensed to Duke Energy (www.duke-energy.com) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. Duke Energy
 * licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.04 at 11:03:32 AM EDT 
//


package org.openfmb.xsd._2015._12.openfmb.generationmodule;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openfmb.xsd._2015._12.openfmb.commonmodule.Container;
import org.openfmb.xsd._2015._12.openfmb.commonmodule.Reading;


/**
 * <p>Java class for GenerationReadingProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenerationReadingProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}Container">
 *       &lt;sequence>
 *         &lt;element name="GeneratingUnit" type="{http://openfmb.org/xsd/2015/12/openfmb/generationmodule}GeneratingUnit"/>
 *         &lt;element name="Readings" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}Reading" maxOccurs="100"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerationReadingProfile", propOrder = {
    "generatingUnit",
    "readings"
})
public class GenerationReadingProfile
    extends Container
{

    @XmlElement(name = "GeneratingUnit", required = true)
    protected GeneratingUnit generatingUnit;
    @XmlElement(name = "Readings", required = true)
    protected List<Reading> readings;

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

}
