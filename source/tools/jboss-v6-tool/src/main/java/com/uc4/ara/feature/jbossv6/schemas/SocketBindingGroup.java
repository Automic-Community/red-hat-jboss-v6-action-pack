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
 * <p>Java class for SocketBindingGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocketBindingGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="default-interface" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="socket-bindings">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="socket-binding" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="port" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "SocketBindingGroup", propOrder = {
    "defaultInterface",
    "socketBindings"
})
public class SocketBindingGroup {

    @XmlElement(name = "default-interface", required = true)
    protected String defaultInterface;
    @XmlElement(name = "socket-bindings", required = true)
    protected SocketBindingGroup.SocketBindings socketBindings;
    @XmlAttribute
    protected String name;

    /**
     * Gets the value of the defaultInterface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultInterface() {
        return defaultInterface;
    }

    /**
     * Sets the value of the defaultInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultInterface(String value) {
        this.defaultInterface = value;
    }

    /**
     * Gets the value of the socketBindings property.
     * 
     * @return
     *     possible object is
     *     {@link SocketBindingGroup.SocketBindings }
     *     
     */
    public SocketBindingGroup.SocketBindings getSocketBindings() {
        return socketBindings;
    }

    /**
     * Sets the value of the socketBindings property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocketBindingGroup.SocketBindings }
     *     
     */
    public void setSocketBindings(SocketBindingGroup.SocketBindings value) {
        this.socketBindings = value;
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
     *         &lt;element name="socket-binding" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="port" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "socketBinding"
    })
    public static class SocketBindings {

        @XmlElement(name = "socket-binding", nillable = true)
        protected List<SocketBindingGroup.SocketBindings.SocketBinding> socketBinding;
        @XmlAttribute
        protected String name;

        /**
         * Gets the value of the socketBinding property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the socketBinding property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSocketBinding().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SocketBindingGroup.SocketBindings.SocketBinding }
         * 
         * 
         */
        public List<SocketBindingGroup.SocketBindings.SocketBinding> getSocketBinding() {
            if (socketBinding == null) {
                socketBinding = new ArrayList<SocketBindingGroup.SocketBindings.SocketBinding>();
            }
            return this.socketBinding;
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
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="port" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SocketBinding {

            @XmlAttribute
            protected String name;
            @XmlAttribute
            protected String port;

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
             * Gets the value of the port property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPort() {
                return port;
            }

            /**
             * Sets the value of the port property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPort(String value) {
                this.port = value;
            }

        }

    }

}