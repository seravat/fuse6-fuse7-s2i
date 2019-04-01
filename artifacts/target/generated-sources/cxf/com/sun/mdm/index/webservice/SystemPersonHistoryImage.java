
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for systemPersonHistoryImage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systemPersonHistoryImage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.index.mdm.sun.com/}systemPerson"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemPersonHistoryImage", propOrder = {
    "euid"
})
public class SystemPersonHistoryImage
    extends SystemPerson
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "EUID")
    protected String euid;

    /**
     * Gets the value of the euid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEUID() {
        return euid;
    }

    /**
     * Sets the value of the euid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEUID(String value) {
        this.euid = value;
    }

    public boolean isSetEUID() {
        return (this.euid!= null);
    }

}
