
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateEnterpriseRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateEnterpriseRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callerInfo" type="{http://webservice.index.mdm.sun.com/}callerInfo" minOccurs="0"/&gt;
 *         &lt;element name="eoBean" type="{http://webservice.index.mdm.sun.com/}enterprisePerson" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateEnterpriseRecord", propOrder = {
    "callerInfo",
    "eoBean"
})
@XmlRootElement(name = "updateEnterpriseRecord")
public class UpdateEnterpriseRecord
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected CallerInfo callerInfo;
    protected EnterprisePerson eoBean;

    /**
     * Gets the value of the callerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CallerInfo }
     *     
     */
    public CallerInfo getCallerInfo() {
        return callerInfo;
    }

    /**
     * Sets the value of the callerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallerInfo }
     *     
     */
    public void setCallerInfo(CallerInfo value) {
        this.callerInfo = value;
    }

    public boolean isSetCallerInfo() {
        return (this.callerInfo!= null);
    }

    /**
     * Gets the value of the eoBean property.
     * 
     * @return
     *     possible object is
     *     {@link EnterprisePerson }
     *     
     */
    public EnterprisePerson getEoBean() {
        return eoBean;
    }

    /**
     * Sets the value of the eoBean property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterprisePerson }
     *     
     */
    public void setEoBean(EnterprisePerson value) {
        this.eoBean = value;
    }

    public boolean isSetEoBean() {
        return (this.eoBean!= null);
    }

}
