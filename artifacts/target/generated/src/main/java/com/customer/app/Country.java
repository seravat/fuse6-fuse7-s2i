//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.01 at 04:22:38 PM WEST 
//


package com.customer.app;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Country - "A community of people composed of one or more nationalities and possessing a more or less defined territory and government." â€“ Merriam-Webster. An organization created to govern a country, which has the power to grant citizenship to its people.
 * 
 * <p>Java class for Country complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Country"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="countrycode" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Country", propOrder = {
    "countrycode"
})
@XmlRootElement(name = "Country")
public class Country
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Code countrycode;

    /**
     * Gets the value of the countrycode property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getCountrycode() {
        return countrycode;
    }

    /**
     * Sets the value of the countrycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setCountrycode(Code value) {
        this.countrycode = value;
    }

}
