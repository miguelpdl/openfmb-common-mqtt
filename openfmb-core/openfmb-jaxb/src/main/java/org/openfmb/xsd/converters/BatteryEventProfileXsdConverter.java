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
package org.openfmb.xsd.converters;

import java.io.ByteArrayOutputStream;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.stream.StreamSource;

import org.openfmb.xsd._2015._12.openfmb.batterymodule.BatteryEventProfile;
import org.openfmb.xsd._2015._12.openfmb.batterymodule.ObjectFactory;
import org.openfmb.xsd.converters.gson.XMLGregorianCalendarConverter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * This class handles all of the conversions between the XML message
 * formats, JSON message formats and POJO objects for the OpenFMB
 * BatteryEventProfile structure.
 * 
 * @author Dwayne Bradley
 * @version 1.0
 */
public class BatteryEventProfileXsdConverter
{
	private static Gson toJsonConverter = null;
	private static Gson toJsonPrettyPrintConverter = null;
	private static Gson fromJsonConverter = null;
	
	static
	{
		GsonBuilder toGsonBuilder = new GsonBuilder()
	            .registerTypeAdapter(XMLGregorianCalendar.class, new XMLGregorianCalendarConverter.Serializer())
		        ;
		
		toJsonConverter = toGsonBuilder.create();
		toJsonPrettyPrintConverter = toGsonBuilder.setPrettyPrinting().create();
		
		GsonBuilder fromGsonBuilder = new GsonBuilder()
	            .registerTypeAdapter(XMLGregorianCalendar.class, new XMLGregorianCalendarConverter.Deserializer())
		        ;
		
		fromJsonConverter = fromGsonBuilder.create();
	}
	
	private BatteryEventProfileXsdConverter()
	{
		// Just prevent anyone from creating an instance of this class.
	}
	
	/**
	 * This method takes a POJO BatteryEventProfile object and translates it 
	 * into its corresponding XML representation based on the XSD definition.
	 * 
	 * @param pojo POJO object
	 * 
	 * @return XML string representing the BatteryEventProfile pojo
	 * 
	 * @throws DatatypeConfigurationException
	 * @throws JAXBException
	 */
	public static String convertPojo(BatteryEventProfile pojo)
			throws DatatypeConfigurationException, JAXBException
	{
		return convertPojoToXml(pojo);
	}
	
	/**
	 * This method takes a POJO BatteryEventProfile object and translates it 
	 * into its corresponding XML or JSON representation based on the XSD definition.
	 * 
	 * @param pojo POJO object
	 * @param format Convert the output to either XML or JSON
	 * 
	 * @return XML or JSON string representing the BatteryEventProfile pojo
	 * 
	 * @throws DatatypeConfigurationException
	 * @throws JAXBException
	 */
	public static String convertPojo(BatteryEventProfile pojo, XsdConverterFormat format)
			throws DatatypeConfigurationException, JAXBException
	{
		switch (format)
		{
			case XML:
				return convertPojoToXml(pojo);
			case JSON:
				return convertPojoToJson(pojo);
			default:
				return null;
		}
	}
	
	/**
	 * This method takes a POJO BatteryEventProfile object and translates it 
	 * into its corresponding XML representation based on the XSD definition.
	 * 
	 * @param pojo POJO object
	 * @param prettyPrintOutput Flag to indicate whether or not for format the returned string
	 * 
	 * @return XML string representing the BatteryEventProfile pojo
	 * 
	 * @throws DatatypeConfigurationException
	 * @throws JAXBException
	 */
	public static String convertPojo(BatteryEventProfile pojo, boolean prettyPrintOutput)
			throws DatatypeConfigurationException, JAXBException
	{
		return convertPojoToXml(pojo, prettyPrintOutput);
	}
	
	/**
	 * This method takes a POJO BatteryEventProfile object and translates it 
	 * into its corresponding XML or JSON representation based on the XSD definition.
	 * 
	 * @param pojo POJO object
	 * @param format Convert the output to either XML or JSON
	 * @param prettyPrintOutput Flag to indicate whether or not to "pretty print" the returned string
	 * 
	 * @return XML string representing the BatteryEventProfile pojo
	 * 
	 * @throws DatatypeConfigurationException
	 * @throws JAXBException
	 */
	public static String convertPojo(BatteryEventProfile pojo, XsdConverterFormat format, boolean prettyPrintOutput)
			throws DatatypeConfigurationException, JAXBException
	{
		switch (format)
		{
			case XML:
				return convertPojoToXml(pojo, prettyPrintOutput);
			case JSON:
				return convertPojoToJson(pojo, prettyPrintOutput);
			default:
				return null;
		}
	}
	
	/**
	 * This method takes an XML representation of a BatteryEventProfile object
	 * and converts it into a POJO object.
	 * 
	 * @param input XML representation of a BatteryEventProfile object
	 * 
	 * @return POJO BatteryEventProfile object
	 * 
	 * @throws DatatypeConfigurationException
	 * @throws JAXBException
	 */
	public static BatteryEventProfile convertToPojo(String input)
			throws DatatypeConfigurationException, JAXBException
	{
		return convertXmlToPojo(input);
	}
	
	/**
	 * This method takes an XML or JSON representation of a BatteryEventProfile object
	 * and converts it into a POJO object.
	 * 
	 * @param input XML representation of a BatteryEventProfile object
	 * @param format Indicates if the input string is either XML or JSON
	 * 
	 * @return POJO BatteryEventProfile object
	 * 
	 * @throws DatatypeConfigurationException
	 * @throws JAXBException
	 */
	public static BatteryEventProfile convertToPojo(String input, XsdConverterFormat format)
			throws DatatypeConfigurationException, JAXBException
	{
		switch (format)
		{
			case XML:
				return convertXmlToPojo(input);
			case JSON:
				return convertJsonToPojo(input);
			default:
				return null;
		}
	}
	
	/**
	 * This method takes a POJO BatteryEventProfile object and translates it 
	 * into its corresponding XML representation based on the XSD definition.
	 * 
	 * @param pojo POJO object
	 * 
	 * @return XML string representing
	 */
	public static String convertPojoToXml(BatteryEventProfile pojo)
			throws DatatypeConfigurationException, JAXBException
	{
		return convertPojoToXml(pojo, false);
	}
	
	/**
	 * This method takes a POJO BatteryEventProfile object and translates it 
	 * into its corresponding XML representation based on the XSD definition.
	 * 
	 * @param pojo POJO object
	 * @param formatXml Flag to indicate whether or not for format the returned XML
	 * 
	 * @return XML string representing
	 */
	public static String convertPojoToXml(BatteryEventProfile pojo, boolean formatXml)
			throws DatatypeConfigurationException, JAXBException
	{
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		
		JAXBContext jaxbContext = JAXBContext.newInstance(BatteryEventProfile.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, formatXml);
		
		ObjectFactory objFactory = new ObjectFactory();
		
		jaxbMarshaller.marshal(objFactory.createBatteryEventProfile(pojo), stream);
		
		return new String(stream.toByteArray());
	}
	
	/**
	 * This method takes an XML representation of a BatteryEventProfile object
	 * and converts it into a POJO object.
	 * 
	 * @param xml XML representation of a BatteryEventProfile object
	 * 
	 * @return JAXB BatteryEventProfile object
	 * 
	 * @throws DatatypeConfigurationException
	 * @throws JAXBException
	 */
	public static BatteryEventProfile convertXmlToPojo(String xml)
			throws DatatypeConfigurationException, JAXBException
	{
		StringReader reader = new StringReader(xml);
		
		JAXBContext jaxbContext = JAXBContext.newInstance(BatteryEventProfile.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		
		JAXBElement<BatteryEventProfile> root =
				jaxbUnmarshaller.unmarshal(new StreamSource(reader),
										   BatteryEventProfile.class);
		
		return root.getValue();
	}
	
	/**
	 * This method takes an XML representation of a BatteryEventProfile object
	 * and converts it into a JSON representation.
	 * 
	 * @param xml XML representation of a BatteryEventProfile object
	 * 
	 * @return String containing the corresponding JSON representation of the BatteryEventProfile
	 * 
	 * @throws DatatypeConfigurationException
	 * @throws JAXBException
	 */
	public static String convertXmlToJson(String xml)
			throws DatatypeConfigurationException, JAXBException
	{
		return convertXmlToJson(xml, false);
	}
	
	/**
	 * This method takes an XML representation of a BatteryEventProfile object
	 * and converts it into a JSON representation.
	 * 
	 * @param xml XML representation of a BatteryEventProfile object
	 * @param formatJson Flag to indicate whether or not for format the returned JSON
	 * 
	 * @return String containing the corresponding JSON representation of the BatteryEventProfile
	 * 
	 * @throws DatatypeConfigurationException
	 * @throws JAXBException
	 */
	public static String convertXmlToJson(String xml, boolean formatJson)
			throws DatatypeConfigurationException, JAXBException
	{
		return convertPojoToJson(convertXmlToPojo(xml), formatJson);
	}
	
	/**
	 * This method takes a POJO BatteryEventProfile object and translates it 
	 * into its corresponding JSON representation.
	 * 
	 * @param pojo BatteryEventProfile POJO object
	 * 
	 * @return String containing the corresponding JSON representation of the BatteryEventProfile
	 */
	public static String convertPojoToJson(BatteryEventProfile pojo)
			throws DatatypeConfigurationException, JAXBException
	{
		return convertPojoToJson(pojo, false);
	}
	
	/**
	 * This method takes a POJO BatteryEventProfile object and translates it 
	 * into its corresponding JSON representation.
	 * 
	 * @param pojo BatteryEventProfile POJO object
	 * @param formatJson Flag to indicate whether or not for format the returned JSON
	 * 
	 * @return String containing the corresponding JSON representation of the BatteryEventProfile
	 */
	public static String convertPojoToJson(BatteryEventProfile pojo, boolean formatJson)
			throws DatatypeConfigurationException
	{
		if (formatJson)
		{
			return BatteryEventProfileXsdConverter.toJsonPrettyPrintConverter.toJson(pojo);
		}
		else
		{
			return BatteryEventProfileXsdConverter.toJsonConverter.toJson(pojo);
		}
	}
	
	/**
	 * This method takes an JSON representation of a BatteryEventProfile object
	 * and converts it into a XML representation.
	 * 
	 * @param json JSON representation of a BatteryEventProfile object
	 * 
	 * @return String containing the corresponding XML representation of the BatteryEventProfile
	 * 
	 * @throws DatatypeConfigurationException
	 * @throws JAXBException
	 */
	public static String convertJsonToXml(String json)
			throws DatatypeConfigurationException, JAXBException
	{
		return convertJsonToXml(json, false);
	}
	
	/**
	 * This method takes an JSON representation of a BatteryEventProfile object
	 * and converts it into a XML representation.
	 * 
	 * @param json JSON representation of a BatteryEventProfile object
	 * @param formatXml Flag to indicate whether or not for format the returned XML
	 * 
	 * @return String containing the corresponding XML representation of the BatteryEventProfile
	 * 
	 * @throws DatatypeConfigurationException
	 * @throws JAXBException
	 */
	public static String convertJsonToXml(String json, boolean formatXml)
			throws DatatypeConfigurationException, JAXBException
	{
		return convertPojoToXml(convertJsonToPojo(json), formatXml);
	}
	
	/**
	 * This method takes an JSON representation of a BatteryEventProfile object
	 * and converts it into a POJO object.
	 * 
	 * @param json JSON representation of a BatteryEventProfile object
	 * 
	 * @return POJO BatteryEventProfile object
	 * 
	 * @throws DatatypeConfigurationException
	 * @throws JAXBException
	 */
	public static BatteryEventProfile convertJsonToPojo(String json)
			throws DatatypeConfigurationException
	{
		return BatteryEventProfileXsdConverter.fromJsonConverter.fromJson(json, BatteryEventProfile.class);
	}
}
