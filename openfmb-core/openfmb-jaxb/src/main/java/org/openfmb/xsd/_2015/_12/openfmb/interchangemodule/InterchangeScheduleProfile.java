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
// Generated on: 2016.05.04 at 11:03:39 AM EDT 
//


package org.openfmb.xsd._2015._12.openfmb.interchangemodule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openfmb.xsd._2015._12.openfmb.commonmodule.Container;
import org.openfmb.xsd._2015._12.openfmb.commonmodule.PowerSystemResource;


/**
 * Set of values obtained from the meter.
 * 
 * <p>Java class for InterchangeScheduleProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterchangeScheduleProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}Container">
 *       &lt;sequence>
 *         &lt;element name="InterchangeSchedule" type="{http://openfmb.org/xsd/2015/12/openfmb/interchangemodule}InterchangeSchedule"/>
 *         &lt;element name="PowerSystemResource" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}PowerSystemResource"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterchangeScheduleProfile", propOrder = {
    "interchangeSchedule",
    "powerSystemResource"
})
public class InterchangeScheduleProfile
    extends Container
{

    @XmlElement(name = "InterchangeSchedule", required = true)
    protected InterchangeSchedule interchangeSchedule;
    @XmlElement(name = "PowerSystemResource", required = true)
    protected PowerSystemResource powerSystemResource;

    /**
     * Gets the value of the interchangeSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeSchedule }
     *     
     */
    public InterchangeSchedule getInterchangeSchedule() {
        return interchangeSchedule;
    }

    /**
     * Sets the value of the interchangeSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeSchedule }
     *     
     */
    public void setInterchangeSchedule(InterchangeSchedule value) {
        this.interchangeSchedule = value;
    }

    /**
     * Gets the value of the powerSystemResource property.
     * 
     * @return
     *     possible object is
     *     {@link PowerSystemResource }
     *     
     */
    public PowerSystemResource getPowerSystemResource() {
        return powerSystemResource;
    }

    /**
     * Sets the value of the powerSystemResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSystemResource }
     *     
     */
    public void setPowerSystemResource(PowerSystemResource value) {
        this.powerSystemResource = value;
    }

}
