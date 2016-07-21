//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.04 at 03:31:00 PM ICT 
//

package com.uc4.ara.feature.jbossv6.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for SessionBeanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionBeanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ejb-refs" type="{http://www.example.org/JBossV6SnapshotSchema}EjbResType"/>
 *         &lt;element name="res-refs" type="{http://www.example.org/JBossV6SnapshotSchema}ResourceRefType"/>
 *         &lt;element name="home" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="remote" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ejb-class" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="session-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transaction-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ejb-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionBeanType", propOrder = {
    "ejbRefs",
    "resRefs",
    "home",
    "remote",
    "ejbClass",
    "sessionType",
    "transactionType",
    "description"
})
public class SessionBeanType {

    @XmlElement(name = "ejb-refs", required = true)
    protected EjbResType ejbRefs;
    @XmlElement(name = "res-refs", required = true)
    protected ResourceRefType resRefs;
    @XmlElement(required = true)
    protected String home;
    @XmlElement(required = true)
    protected String remote;
    @XmlElement(name = "ejb-class", required = true)
    protected String ejbClass;
    @XmlElement(name = "session-type", required = true)
    protected String sessionType;
    @XmlElement(name = "transaction-type", required = true)
    protected String transactionType;
    @XmlElement(required = true)
    protected String description;
    @XmlAttribute(name = "ejb-name")
    protected String ejbName;

    /**
     * Gets the value of the ejbRefs property.
     * 
     * @return
     *     possible object is
     *     {@link EjbResType }
     *     
     */
    public EjbResType getEjbRefs() {
        return ejbRefs;
    }

    /**
     * Sets the value of the ejbRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EjbResType }
     *     
     */
    public void setEjbRefs(EjbResType value) {
        this.ejbRefs = value;
    }

    /**
     * Gets the value of the resRefs property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceRefType }
     *     
     */
    public ResourceRefType getResRefs() {
        return resRefs;
    }

    /**
     * Sets the value of the resRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceRefType }
     *     
     */
    public void setResRefs(ResourceRefType value) {
        this.resRefs = value;
    }

    /**
     * Gets the value of the home property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHome() {
        return home;
    }

    /**
     * Sets the value of the home property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHome(String value) {
        this.home = value;
    }

    /**
     * Gets the value of the remote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemote() {
        return remote;
    }

    /**
     * Sets the value of the remote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemote(String value) {
        this.remote = value;
    }

    /**
     * Gets the value of the ejbClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEjbClass() {
        return ejbClass;
    }

    /**
     * Sets the value of the ejbClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEjbClass(String value) {
        this.ejbClass = value;
    }

    /**
     * Gets the value of the sessionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionType() {
        return sessionType;
    }

    /**
     * Sets the value of the sessionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionType(String value) {
        this.sessionType = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the ejbName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEjbName() {
        return ejbName;
    }

    /**
     * Sets the value of the ejbName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEjbName(String value) {
        this.ejbName = value;
    }

}
