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
// Generated on: 2016.05.04 at 11:03:51 AM EDT 
//


package org.openfmb.xsd._2015._12.openfmb.reclosermodule;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openfmb.xsd._2015._12.openfmb.reclosermodule package. 
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

    private final static QName _RecloserControl_QNAME = new QName("http://openfmb.org/xsd/2015/12/openfmb/reclosermodule", "RecloserControl");
    private final static QName _RecloserControlProfile_QNAME = new QName("http://openfmb.org/xsd/2015/12/openfmb/reclosermodule", "RecloserControlProfile");
    private final static QName _RecloserEventProfile_QNAME = new QName("http://openfmb.org/xsd/2015/12/openfmb/reclosermodule", "RecloserEventProfile");
    private final static QName _Recloser_QNAME = new QName("http://openfmb.org/xsd/2015/12/openfmb/reclosermodule", "Recloser");
    private final static QName _RecloserStatus_QNAME = new QName("http://openfmb.org/xsd/2015/12/openfmb/reclosermodule", "RecloserStatus");
    private final static QName _RecloserReadingProfile_QNAME = new QName("http://openfmb.org/xsd/2015/12/openfmb/reclosermodule", "RecloserReadingProfile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openfmb.xsd._2015._12.openfmb.reclosermodule
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RecloserControl }
     * 
     */
    public RecloserControl createRecloserControl() {
        return new RecloserControl();
    }

    /**
     * Create an instance of {@link RecloserEventProfile }
     * 
     */
    public RecloserEventProfile createRecloserEventProfile() {
        return new RecloserEventProfile();
    }

    /**
     * Create an instance of {@link Recloser }
     * 
     */
    public Recloser createRecloser() {
        return new Recloser();
    }

    /**
     * Create an instance of {@link RecloserControlProfile }
     * 
     */
    public RecloserControlProfile createRecloserControlProfile() {
        return new RecloserControlProfile();
    }

    /**
     * Create an instance of {@link RecloserReadingProfile }
     * 
     */
    public RecloserReadingProfile createRecloserReadingProfile() {
        return new RecloserReadingProfile();
    }

    /**
     * Create an instance of {@link RecloserStatus }
     * 
     */
    public RecloserStatus createRecloserStatus() {
        return new RecloserStatus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecloserControl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openfmb.org/xsd/2015/12/openfmb/reclosermodule", name = "RecloserControl")
    public JAXBElement<RecloserControl> createRecloserControl(RecloserControl value) {
        return new JAXBElement<RecloserControl>(_RecloserControl_QNAME, RecloserControl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecloserControlProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openfmb.org/xsd/2015/12/openfmb/reclosermodule", name = "RecloserControlProfile")
    public JAXBElement<RecloserControlProfile> createRecloserControlProfile(RecloserControlProfile value) {
        return new JAXBElement<RecloserControlProfile>(_RecloserControlProfile_QNAME, RecloserControlProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecloserEventProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openfmb.org/xsd/2015/12/openfmb/reclosermodule", name = "RecloserEventProfile")
    public JAXBElement<RecloserEventProfile> createRecloserEventProfile(RecloserEventProfile value) {
        return new JAXBElement<RecloserEventProfile>(_RecloserEventProfile_QNAME, RecloserEventProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Recloser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openfmb.org/xsd/2015/12/openfmb/reclosermodule", name = "Recloser")
    public JAXBElement<Recloser> createRecloser(Recloser value) {
        return new JAXBElement<Recloser>(_Recloser_QNAME, Recloser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecloserStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openfmb.org/xsd/2015/12/openfmb/reclosermodule", name = "RecloserStatus")
    public JAXBElement<RecloserStatus> createRecloserStatus(RecloserStatus value) {
        return new JAXBElement<RecloserStatus>(_RecloserStatus_QNAME, RecloserStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecloserReadingProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openfmb.org/xsd/2015/12/openfmb/reclosermodule", name = "RecloserReadingProfile")
    public JAXBElement<RecloserReadingProfile> createRecloserReadingProfile(RecloserReadingProfile value) {
        return new JAXBElement<RecloserReadingProfile>(_RecloserReadingProfile_QNAME, RecloserReadingProfile.class, null, value);
    }

}
