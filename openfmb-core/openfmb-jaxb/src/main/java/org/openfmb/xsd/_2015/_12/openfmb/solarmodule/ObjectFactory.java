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
// Generated on: 2016.05.04 at 11:04:19 AM EDT 
//


package org.openfmb.xsd._2015._12.openfmb.solarmodule;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openfmb.xsd._2015._12.openfmb.solarmodule package. 
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

    private final static QName _SolarForecastProfile_QNAME = new QName("http://openfmb.org/xsd/2015/12/openfmb/solarmodule", "SolarForecastProfile");
    private final static QName _SolarEventProfile_QNAME = new QName("http://openfmb.org/xsd/2015/12/openfmb/solarmodule", "SolarEventProfile");
    private final static QName _SolarCapability_QNAME = new QName("http://openfmb.org/xsd/2015/12/openfmb/solarmodule", "SolarCapability");
    private final static QName _SolarInverter_QNAME = new QName("http://openfmb.org/xsd/2015/12/openfmb/solarmodule", "SolarInverter");
    private final static QName _SolarInverterStatus_QNAME = new QName("http://openfmb.org/xsd/2015/12/openfmb/solarmodule", "SolarInverterStatus");
    private final static QName _SolarCapabilityProfile_QNAME = new QName("http://openfmb.org/xsd/2015/12/openfmb/solarmodule", "SolarCapabilityProfile");
    private final static QName _SolarControl_QNAME = new QName("http://openfmb.org/xsd/2015/12/openfmb/solarmodule", "SolarControl");
    private final static QName _SolarReadingProfile_QNAME = new QName("http://openfmb.org/xsd/2015/12/openfmb/solarmodule", "SolarReadingProfile");
    private final static QName _SolarControlProfile_QNAME = new QName("http://openfmb.org/xsd/2015/12/openfmb/solarmodule", "SolarControlProfile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openfmb.xsd._2015._12.openfmb.solarmodule
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SolarEventProfile }
     * 
     */
    public SolarEventProfile createSolarEventProfile() {
        return new SolarEventProfile();
    }

    /**
     * Create an instance of {@link SolarCapabilityProfile }
     * 
     */
    public SolarCapabilityProfile createSolarCapabilityProfile() {
        return new SolarCapabilityProfile();
    }

    /**
     * Create an instance of {@link SolarReadingProfile }
     * 
     */
    public SolarReadingProfile createSolarReadingProfile() {
        return new SolarReadingProfile();
    }

    /**
     * Create an instance of {@link SolarControlProfile }
     * 
     */
    public SolarControlProfile createSolarControlProfile() {
        return new SolarControlProfile();
    }

    /**
     * Create an instance of {@link SolarInverterStatus }
     * 
     */
    public SolarInverterStatus createSolarInverterStatus() {
        return new SolarInverterStatus();
    }

    /**
     * Create an instance of {@link SolarInverter }
     * 
     */
    public SolarInverter createSolarInverter() {
        return new SolarInverter();
    }

    /**
     * Create an instance of {@link SolarForecastProfile }
     * 
     */
    public SolarForecastProfile createSolarForecastProfile() {
        return new SolarForecastProfile();
    }

    /**
     * Create an instance of {@link SolarControl }
     * 
     */
    public SolarControl createSolarControl() {
        return new SolarControl();
    }

    /**
     * Create an instance of {@link SolarCapability }
     * 
     */
    public SolarCapability createSolarCapability() {
        return new SolarCapability();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolarForecastProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openfmb.org/xsd/2015/12/openfmb/solarmodule", name = "SolarForecastProfile")
    public JAXBElement<SolarForecastProfile> createSolarForecastProfile(SolarForecastProfile value) {
        return new JAXBElement<SolarForecastProfile>(_SolarForecastProfile_QNAME, SolarForecastProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolarEventProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openfmb.org/xsd/2015/12/openfmb/solarmodule", name = "SolarEventProfile")
    public JAXBElement<SolarEventProfile> createSolarEventProfile(SolarEventProfile value) {
        return new JAXBElement<SolarEventProfile>(_SolarEventProfile_QNAME, SolarEventProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolarCapability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openfmb.org/xsd/2015/12/openfmb/solarmodule", name = "SolarCapability")
    public JAXBElement<SolarCapability> createSolarCapability(SolarCapability value) {
        return new JAXBElement<SolarCapability>(_SolarCapability_QNAME, SolarCapability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolarInverter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openfmb.org/xsd/2015/12/openfmb/solarmodule", name = "SolarInverter")
    public JAXBElement<SolarInverter> createSolarInverter(SolarInverter value) {
        return new JAXBElement<SolarInverter>(_SolarInverter_QNAME, SolarInverter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolarInverterStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openfmb.org/xsd/2015/12/openfmb/solarmodule", name = "SolarInverterStatus")
    public JAXBElement<SolarInverterStatus> createSolarInverterStatus(SolarInverterStatus value) {
        return new JAXBElement<SolarInverterStatus>(_SolarInverterStatus_QNAME, SolarInverterStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolarCapabilityProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openfmb.org/xsd/2015/12/openfmb/solarmodule", name = "SolarCapabilityProfile")
    public JAXBElement<SolarCapabilityProfile> createSolarCapabilityProfile(SolarCapabilityProfile value) {
        return new JAXBElement<SolarCapabilityProfile>(_SolarCapabilityProfile_QNAME, SolarCapabilityProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolarControl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openfmb.org/xsd/2015/12/openfmb/solarmodule", name = "SolarControl")
    public JAXBElement<SolarControl> createSolarControl(SolarControl value) {
        return new JAXBElement<SolarControl>(_SolarControl_QNAME, SolarControl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolarReadingProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openfmb.org/xsd/2015/12/openfmb/solarmodule", name = "SolarReadingProfile")
    public JAXBElement<SolarReadingProfile> createSolarReadingProfile(SolarReadingProfile value) {
        return new JAXBElement<SolarReadingProfile>(_SolarReadingProfile_QNAME, SolarReadingProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolarControlProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openfmb.org/xsd/2015/12/openfmb/solarmodule", name = "SolarControlProfile")
    public JAXBElement<SolarControlProfile> createSolarControlProfile(SolarControlProfile value) {
        return new JAXBElement<SolarControlProfile>(_SolarControlProfile_QNAME, SolarControlProfile.class, null, value);
    }

}
