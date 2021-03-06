//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.04 at 03:31:00 PM ICT 
//

package com.uc4.ara.feature.jbossv6.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for WebDDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebDDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="display-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="distributable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="session-timeout" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="servlets">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="servlet" type="{http://www.example.org/JBossV6SnapshotSchema}ServletType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="res-refs" type="{http://www.example.org/JBossV6SnapshotSchema}ResourceRefType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebDDType", propOrder = {
    "displayName",
    "distributable",
    "sessionTimeout",
    "description",
    "servlets",
    "resRefs"
})
public class WebDDType {

    @XmlElement(name = "display-name", required = true)
    protected String displayName;
    @XmlElement(required = true)
    protected String distributable;
    @XmlElement(name = "session-timeout", required = true)
    protected String sessionTimeout;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected WebDDType.Servlets servlets;
    @XmlElement(name = "res-refs", required = true)
    protected ResourceRefType resRefs;
    @XmlAttribute
    protected String name;

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the distributable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributable() {
        return distributable;
    }

    /**
     * Sets the value of the distributable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributable(String value) {
        this.distributable = value;
    }

    /**
     * Gets the value of the sessionTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionTimeout() {
        return sessionTimeout;
    }

    /**
     * Sets the value of the sessionTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionTimeout(String value) {
        this.sessionTimeout = value;
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
     * Gets the value of the servlets property.
     * 
     * @return
     *     possible object is
     *     {@link WebDDType.Servlets }
     *     
     */
    public WebDDType.Servlets getServlets() {
        return servlets;
    }

    /**
     * Sets the value of the servlets property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebDDType.Servlets }
     *     
     */
    public void setServlets(WebDDType.Servlets value) {
        this.servlets = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
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

    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="servlet" type="{http://www.example.org/JBossV6SnapshotSchema}ServletType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "servlet"
    })
    public static class Servlets {

        @XmlElement(nillable = true)
        protected List<ServletType> servlet;
        @XmlAttribute
        protected String name;

        /**
         * Gets the value of the servlet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the servlet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServlet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServletType }
         * 
         * 
         */
        public List<ServletType> getServlet() {
            if (servlet == null) {
                servlet = new ArrayList<ServletType>();
            }
            return this.servlet;
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
            return name;
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

}
