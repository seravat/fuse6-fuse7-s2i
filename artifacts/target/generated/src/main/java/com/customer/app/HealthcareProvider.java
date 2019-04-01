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
 * Healthcare Provider - A health care provider is an individual or an institution that provides preventive, curative, promotional or rehabilitative health care services in a systematic way to individuals, families or communities.
 * 
 * <p>Java class for HealthcareProvider complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HealthcareProvider"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="digitalcertificateid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="digitalcertificatedistinguishedname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.app.customer.com}ID" minOccurs="0"/&gt;
 *         &lt;element name="nationalproviderid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="providercategory" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="providerrole" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="publicdigitalcertificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.app.customer.com}Address" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.app.customer.com}ContactMechanism" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.app.customer.com}ContactMechanism" minOccurs="0"/&gt;
 *         &lt;element name="facsimile" type="{http://www.app.customer.com}ContactMechanism" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthcareProvider", propOrder = {
    "digitalcertificateid",
    "digitalcertificatedistinguishedname",
    "id",
    "nationalproviderid",
    "providercategory",
    "providerrole",
    "publicdigitalcertificate",
    "taxid",
    "address",
    "email",
    "phone",
    "facsimile"
})
@XmlRootElement(name = "HealthcareProvider")
public class HealthcareProvider
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String digitalcertificateid;
    protected String digitalcertificatedistinguishedname;
    protected ID id;
    protected String nationalproviderid;
    protected Code providercategory;
    protected Code providerrole;
    protected String publicdigitalcertificate;
    protected String taxid;
    protected Address address;
    protected ContactMechanism email;
    protected ContactMechanism phone;
    protected ContactMechanism facsimile;

    /**
     * Gets the value of the digitalcertificateid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalcertificateid() {
        return digitalcertificateid;
    }

    /**
     * Sets the value of the digitalcertificateid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalcertificateid(String value) {
        this.digitalcertificateid = value;
    }

    /**
     * Gets the value of the digitalcertificatedistinguishedname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalcertificatedistinguishedname() {
        return digitalcertificatedistinguishedname;
    }

    /**
     * Sets the value of the digitalcertificatedistinguishedname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalcertificatedistinguishedname(String value) {
        this.digitalcertificatedistinguishedname = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setId(ID value) {
        this.id = value;
    }

    /**
     * Gets the value of the nationalproviderid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalproviderid() {
        return nationalproviderid;
    }

    /**
     * Sets the value of the nationalproviderid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalproviderid(String value) {
        this.nationalproviderid = value;
    }

    /**
     * Gets the value of the providercategory property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getProvidercategory() {
        return providercategory;
    }

    /**
     * Sets the value of the providercategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setProvidercategory(Code value) {
        this.providercategory = value;
    }

    /**
     * Gets the value of the providerrole property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getProviderrole() {
        return providerrole;
    }

    /**
     * Sets the value of the providerrole property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setProviderrole(Code value) {
        this.providerrole = value;
    }

    /**
     * Gets the value of the publicdigitalcertificate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicdigitalcertificate() {
        return publicdigitalcertificate;
    }

    /**
     * Sets the value of the publicdigitalcertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicdigitalcertificate(String value) {
        this.publicdigitalcertificate = value;
    }

    /**
     * Gets the value of the taxid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxid() {
        return taxid;
    }

    /**
     * Sets the value of the taxid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxid(String value) {
        this.taxid = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link ContactMechanism }
     *     
     */
    public ContactMechanism getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMechanism }
     *     
     */
    public void setEmail(ContactMechanism value) {
        this.email = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link ContactMechanism }
     *     
     */
    public ContactMechanism getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMechanism }
     *     
     */
    public void setPhone(ContactMechanism value) {
        this.phone = value;
    }

    /**
     * Gets the value of the facsimile property.
     * 
     * @return
     *     possible object is
     *     {@link ContactMechanism }
     *     
     */
    public ContactMechanism getFacsimile() {
        return facsimile;
    }

    /**
     * Sets the value of the facsimile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMechanism }
     *     
     */
    public void setFacsimile(ContactMechanism value) {
        this.facsimile = value;
    }

}
