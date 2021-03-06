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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Person Participate in Pension Scheme
 * 
 * <p>Java class for PersonPension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonPension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pensionnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pensionexpirationdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonPension", propOrder = {
    "pensionnumber",
    "pensionexpirationdate"
})
@XmlRootElement(name = "PersonPension")
public class PersonPension
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String pensionnumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pensionexpirationdate;

    /**
     * Gets the value of the pensionnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPensionnumber() {
        return pensionnumber;
    }

    /**
     * Sets the value of the pensionnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPensionnumber(String value) {
        this.pensionnumber = value;
    }

    /**
     * Gets the value of the pensionexpirationdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPensionexpirationdate() {
        return pensionexpirationdate;
    }

    /**
     * Sets the value of the pensionexpirationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPensionexpirationdate(XMLGregorianCalendar value) {
        this.pensionexpirationdate = value;
    }

}
