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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openfmb.xsd._2015._12.openfmb.interchangemodule package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OptimizedMicroGridMarket_QNAME = new QName("http://openfmb.org/xsd/2015/12/openfmb/interchangemodule", "OptimizedMicroGridMarket");
    private final static QName _InterchangeScheduleProfile_QNAME = new QName("http://openfmb.org/xsd/2015/12/openfmb/interchangemodule", "InterchangeScheduleProfile");
    private final static QName _Market_QNAME = new QName("http://openfmb.org/xsd/2015/12/openfmb/interchangemodule", "Market");
    private final static QName _MarketFactors_QNAME = new QName("http://openfmb.org/xsd/2015/12/openfmb/interchangemodule", "MarketFactors");
    private final static QName _InterchangeSchedule_QNAME = new QName("http://openfmb.org/xsd/2015/12/openfmb/interchangemodule", "InterchangeSchedule");
    private final static QName _MarketRun_QNAME = new QName("http://openfmb.org/xsd/2015/12/openfmb/interchangemodule", "MarketRun");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openfmb.xsd._2015._12.openfmb.interchangemodule
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OptimizedMicroGridMarket }
     * 
     */
    public OptimizedMicroGridMarket createOptimizedMicroGridMarket() {
        return new OptimizedMicroGridMarket();
    }

    /**
     * Create an instance of {@link InterchangeSchedule }
     * 
     */
    public InterchangeSchedule createInterchangeSchedule() {
        return new InterchangeSchedule();
    }

    /**
     * Create an instance of {@link InterchangeScheduleProfile }
     * 
     */
    public InterchangeScheduleProfile createInterchangeScheduleProfile() {
        return new InterchangeScheduleProfile();
    }

    /**
     * Create an instance of {@link MarketFactors }
     * 
     */
    public MarketFactors createMarketFactors() {
        return new MarketFactors();
    }

    /**
     * Create an instance of {@link MarketRun }
     * 
     */
    public MarketRun createMarketRun() {
        return new MarketRun();
    }

    /**
     * Create an instance of {@link Market }
     * 
     */
    public Market createMarket() {
        return new Market();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptimizedMicroGridMarket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openfmb.org/xsd/2015/12/openfmb/interchangemodule", name = "OptimizedMicroGridMarket")
    public JAXBElement<OptimizedMicroGridMarket> createOptimizedMicroGridMarket(OptimizedMicroGridMarket value) {
        return new JAXBElement<OptimizedMicroGridMarket>(_OptimizedMicroGridMarket_QNAME, OptimizedMicroGridMarket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterchangeScheduleProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openfmb.org/xsd/2015/12/openfmb/interchangemodule", name = "InterchangeScheduleProfile")
    public JAXBElement<InterchangeScheduleProfile> createInterchangeScheduleProfile(InterchangeScheduleProfile value) {
        return new JAXBElement<InterchangeScheduleProfile>(_InterchangeScheduleProfile_QNAME, InterchangeScheduleProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Market }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openfmb.org/xsd/2015/12/openfmb/interchangemodule", name = "Market")
    public JAXBElement<Market> createMarket(Market value) {
        return new JAXBElement<Market>(_Market_QNAME, Market.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketFactors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openfmb.org/xsd/2015/12/openfmb/interchangemodule", name = "MarketFactors")
    public JAXBElement<MarketFactors> createMarketFactors(MarketFactors value) {
        return new JAXBElement<MarketFactors>(_MarketFactors_QNAME, MarketFactors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterchangeSchedule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openfmb.org/xsd/2015/12/openfmb/interchangemodule", name = "InterchangeSchedule")
    public JAXBElement<InterchangeSchedule> createInterchangeSchedule(InterchangeSchedule value) {
        return new JAXBElement<InterchangeSchedule>(_InterchangeSchedule_QNAME, InterchangeSchedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketRun }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openfmb.org/xsd/2015/12/openfmb/interchangemodule", name = "MarketRun")
    public JAXBElement<MarketRun> createMarketRun(MarketRun value) {
        return new JAXBElement<MarketRun>(_MarketRun_QNAME, MarketRun.class, null, value);
    }

}
