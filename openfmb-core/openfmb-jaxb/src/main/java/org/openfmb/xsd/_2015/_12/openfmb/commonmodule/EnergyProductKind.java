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
// Generated on: 2016.05.05 at 08:43:06 PM EDT 
//


package org.openfmb.xsd._2015._12.openfmb.commonmodule;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyProductKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnergyProductKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FIRM"/>
 *     &lt;enumeration value="NFRM"/>
 *     &lt;enumeration value="DYN"/>
 *     &lt;enumeration value="WHL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnergyProductKind")
@XmlEnum
public enum EnergyProductKind {


    /**
     * Firm
     * 
     */
    FIRM,

    /**
     * Non Firm
     * 
     */
    NFRM,

    /**
     * Dynamic
     * 
     */
    DYN,

    /**
     * Wheeling
     * 
     */
    WHL;

    public String value() {
        return name();
    }

    public static EnergyProductKind fromValue(String v) {
        return valueOf(v);
    }

}
