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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.openfmb.xsd._2015._12.openfmb.commonmodule.Curve;
import org.openfmb.xsd._2015._12.openfmb.commonmodule.EnergyProductKind;
import org.openfmb.xsd._2015._12.openfmb.commonmodule.InterTieDirectionKind;
import org.openfmb.xsd._2015._12.openfmb.commonmodule.MarketProductKind;


/**
 * Interchange schedule class to hold information for interchange schedules such as import export type, energy type, and etc.
 * 
 * <p>Java class for InterchangeSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterchangeSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}Curve">
 *       &lt;sequence>
 *         &lt;element name="directionType" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}InterTieDirectionKind" minOccurs="0"/>
 *         &lt;element name="energyType" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}MarketProductKind" minOccurs="0"/>
 *         &lt;element name="intervalLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="scheduleType" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}EnergyProductKind" minOccurs="0"/>
 *         &lt;element name="OptimizedMicroGridMarket" type="{http://openfmb.org/xsd/2015/12/openfmb/interchangemodule}OptimizedMicroGridMarket" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterchangeSchedule", propOrder = {
    "directionType",
    "energyType",
    "intervalLength",
    "scheduleType",
    "optimizedMicroGridMarket"
})
public class InterchangeSchedule
    extends Curve
{

    @XmlSchemaType(name = "string")
    protected InterTieDirectionKind directionType;
    @XmlSchemaType(name = "string")
    protected MarketProductKind energyType;
    protected Integer intervalLength;
    @XmlSchemaType(name = "string")
    protected EnergyProductKind scheduleType;
    @XmlElement(name = "OptimizedMicroGridMarket")
    protected OptimizedMicroGridMarket optimizedMicroGridMarket;

    /**
     * Gets the value of the directionType property.
     * 
     * @return
     *     possible object is
     *     {@link InterTieDirectionKind }
     *     
     */
    public InterTieDirectionKind getDirectionType() {
        return directionType;
    }

    /**
     * Sets the value of the directionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterTieDirectionKind }
     *     
     */
    public void setDirectionType(InterTieDirectionKind value) {
        this.directionType = value;
    }

    /**
     * Gets the value of the energyType property.
     * 
     * @return
     *     possible object is
     *     {@link MarketProductKind }
     *     
     */
    public MarketProductKind getEnergyType() {
        return energyType;
    }

    /**
     * Sets the value of the energyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketProductKind }
     *     
     */
    public void setEnergyType(MarketProductKind value) {
        this.energyType = value;
    }

    /**
     * Gets the value of the intervalLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntervalLength() {
        return intervalLength;
    }

    /**
     * Sets the value of the intervalLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntervalLength(Integer value) {
        this.intervalLength = value;
    }

    /**
     * Gets the value of the scheduleType property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyProductKind }
     *     
     */
    public EnergyProductKind getScheduleType() {
        return scheduleType;
    }

    /**
     * Sets the value of the scheduleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyProductKind }
     *     
     */
    public void setScheduleType(EnergyProductKind value) {
        this.scheduleType = value;
    }

    /**
     * Gets the value of the optimizedMicroGridMarket property.
     * 
     * @return
     *     possible object is
     *     {@link OptimizedMicroGridMarket }
     *     
     */
    public OptimizedMicroGridMarket getOptimizedMicroGridMarket() {
        return optimizedMicroGridMarket;
    }

    /**
     * Sets the value of the optimizedMicroGridMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptimizedMicroGridMarket }
     *     
     */
    public void setOptimizedMicroGridMarket(OptimizedMicroGridMarket value) {
        this.optimizedMicroGridMarket = value;
    }

}
