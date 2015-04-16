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
 * <p>Java class for DeploymentDescriptorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeploymentDescriptorsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ejb" type="{http://www.example.org/JBossV6SnapshotSchema}EjbDDType"/>
 *         &lt;element name="war" type="{http://www.example.org/JBossV6SnapshotSchema}WebDDType"/>
 *         &lt;element name="rar" type="{http://www.example.org/JBossV6SnapshotSchema}RarDDType"/>
 *         &lt;element name="sar" type="{http://www.example.org/JBossV6SnapshotSchema}SarDDType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="Deployment Descriptor" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeploymentDescriptorsType", propOrder = {
    "ejb",
    "war",
    "rar",
    "sar"
})
public class DeploymentDescriptorsType {

    @XmlElement(required = true)
    protected EjbDDType ejb;
    @XmlElement(required = true)
    protected WebDDType war;
    @XmlElement(required = true)
    protected RarDDType rar;
    @XmlElement(required = true)
    protected SarDDType sar;
    @XmlAttribute
    protected String name;

    /**
     * Gets the value of the ejb property.
     * 
     * @return
     *     possible object is
     *     {@link EjbDDType }
     *     
     */
    public EjbDDType getEjb() {
        return ejb;
    }

    /**
     * Sets the value of the ejb property.
     * 
     * @param value
     *     allowed object is
     *     {@link EjbDDType }
     *     
     */
    public void setEjb(EjbDDType value) {
        this.ejb = value;
    }

    /**
     * Gets the value of the war property.
     * 
     * @return
     *     possible object is
     *     {@link WebDDType }
     *     
     */
    public WebDDType getWar() {
        return war;
    }

    /**
     * Sets the value of the war property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebDDType }
     *     
     */
    public void setWar(WebDDType value) {
        this.war = value;
    }

    /**
     * Gets the value of the rar property.
     * 
     * @return
     *     possible object is
     *     {@link RarDDType }
     *     
     */
    public RarDDType getRar() {
        return rar;
    }

    /**
     * Sets the value of the rar property.
     * 
     * @param value
     *     allowed object is
     *     {@link RarDDType }
     *     
     */
    public void setRar(RarDDType value) {
        this.rar = value;
    }

    /**
     * Gets the value of the sar property.
     * 
     * @return
     *     possible object is
     *     {@link SarDDType }
     *     
     */
    public SarDDType getSar() {
        return sar;
    }

    /**
     * Sets the value of the sar property.
     * 
     * @param value
     *     allowed object is
     *     {@link SarDDType }
     *     
     */
    public void setSar(SarDDType value) {
        this.sar = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        if (name == null) {
            return "Deployment Descriptor";
        } else {
            return name;
        }
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
