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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.openfmb.xsd._2015._12.openfmb.commonmodule.IdentifiedObject;


/**
 * Market (e.g. Day Ahead Market, RealTime Market) with a description of the the Market operation control parameters.
 * 
 * <p>Java class for Market complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Market">
 *   &lt;complexContent>
 *     &lt;extension base="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}IdentifiedObject">
 *       &lt;sequence>
 *         &lt;element name="actualEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="actualStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dst" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="localTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeIntervalLength" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="tradingDay" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tradingPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketFactors" type="{http://openfmb.org/xsd/2015/12/openfmb/interchangemodule}MarketFactors" maxOccurs="100" minOccurs="0"/>
 *         &lt;element name="MarketRun" type="{http://openfmb.org/xsd/2015/12/openfmb/interchangemodule}MarketRun" maxOccurs="100" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Market", propOrder = {
    "actualEnd",
    "actualStart",
    "dst",
    "end",
    "localTimeZone",
    "start",
    "status",
    "timeIntervalLength",
    "tradingDay",
    "tradingPeriod",
    "marketFactors",
    "marketRun"
})
@XmlSeeAlso({
    OptimizedMicroGridMarket.class
})
public class Market
    extends IdentifiedObject
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualEnd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualStart;
    protected Boolean dst;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar end;
    protected String localTimeZone;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar start;
    protected String status;
    protected Float timeIntervalLength;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tradingDay;
    protected String tradingPeriod;
    @XmlElement(name = "MarketFactors")
    protected List<MarketFactors> marketFactors;
    @XmlElement(name = "MarketRun")
    protected List<MarketRun> marketRun;

    /**
     * Gets the value of the actualEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualEnd() {
        return actualEnd;
    }

    /**
     * Sets the value of the actualEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualEnd(XMLGregorianCalendar value) {
        this.actualEnd = value;
    }

    /**
     * Gets the value of the actualStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualStart() {
        return actualStart;
    }

    /**
     * Sets the value of the actualStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualStart(XMLGregorianCalendar value) {
        this.actualStart = value;
    }

    /**
     * Gets the value of the dst property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDst() {
        return dst;
    }

    /**
     * Sets the value of the dst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDst(Boolean value) {
        this.dst = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnd(XMLGregorianCalendar value) {
        this.end = value;
    }

    /**
     * Gets the value of the localTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTimeZone() {
        return localTimeZone;
    }

    /**
     * Sets the value of the localTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTimeZone(String value) {
        this.localTimeZone = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the timeIntervalLength property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTimeIntervalLength() {
        return timeIntervalLength;
    }

    /**
     * Sets the value of the timeIntervalLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTimeIntervalLength(Float value) {
        this.timeIntervalLength = value;
    }

    /**
     * Gets the value of the tradingDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradingDay() {
        return tradingDay;
    }

    /**
     * Sets the value of the tradingDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTradingDay(XMLGregorianCalendar value) {
        this.tradingDay = value;
    }

    /**
     * Gets the value of the tradingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradingPeriod() {
        return tradingPeriod;
    }

    /**
     * Sets the value of the tradingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradingPeriod(String value) {
        this.tradingPeriod = value;
    }

    /**
     * Gets the value of the marketFactors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketFactors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketFactors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketFactors }
     * 
     * 
     */
    public List<MarketFactors> getMarketFactors() {
        if (marketFactors == null) {
            marketFactors = new ArrayList<MarketFactors>();
        }
        return this.marketFactors;
    }

    /**
     * Gets the value of the marketRun property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketRun property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketRun().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketRun }
     * 
     * 
     */
    public List<MarketRun> getMarketRun() {
        if (marketRun == null) {
            marketRun = new ArrayList<MarketRun>();
        }
        return this.marketRun;
    }

}
