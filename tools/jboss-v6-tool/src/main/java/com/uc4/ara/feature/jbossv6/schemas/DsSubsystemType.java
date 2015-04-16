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
 * <p>Java class for dsSubsystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dsSubsystemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datasource" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="connection-url " type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="datasource-class" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="driver-class" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="driver-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="max-pool-size" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="min-pool-size" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="security-domain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="user-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="new-connection-sql" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="xa-datasource-class" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="xa-resource-timeout" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ds-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="jndi-name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "dsSubsystemType", propOrder = {
    "datasource"
})
public class DsSubsystemType {

    protected List<DsSubsystemType.Datasource> datasource;
    @XmlAttribute
    protected String name;

    /**
     * Gets the value of the datasource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datasource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatasource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DsSubsystemType.Datasource }
     * 
     * 
     */
    public List<DsSubsystemType.Datasource> getDatasource() {
        if (datasource == null) {
            datasource = new ArrayList<DsSubsystemType.Datasource>();
        }
        return this.datasource;
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
     *         &lt;element name="connection-url " type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="datasource-class" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="driver-class" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="driver-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="max-pool-size" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="min-pool-size" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="security-domain" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="user-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="new-connection-sql" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="xa-datasource-class" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="xa-resource-timeout" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ds-type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="jndi-name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "connectionUrl0020",
        "datasourceClass",
        "driverClass",
        "driverName",
        "enabled",
        "maxPoolSize",
        "minPoolSize",
        "securityDomain",
        "userName",
        "newConnectionSql",
        "xaDatasourceClass",
        "xaResourceTimeout"
    })
    public static class Datasource {

        @XmlElement(name = "connection-url ", required = true)
        protected String connectionUrl0020;
        @XmlElement(name = "datasource-class", required = true)
        protected String datasourceClass;
        @XmlElement(name = "driver-class", required = true)
        protected String driverClass;
        @XmlElement(name = "driver-name", required = true)
        protected String driverName;
        @XmlElement(required = true)
        protected String enabled;
        @XmlElement(name = "max-pool-size", required = true)
        protected String maxPoolSize;
        @XmlElement(name = "min-pool-size", required = true)
        protected String minPoolSize;
        @XmlElement(name = "security-domain", required = true)
        protected String securityDomain;
        @XmlElement(name = "user-name", required = true)
        protected String userName;
        @XmlElement(name = "new-connection-sql", required = true)
        protected String newConnectionSql;
        @XmlElement(name = "xa-datasource-class", required = true)
        protected String xaDatasourceClass;
        @XmlElement(name = "xa-resource-timeout", required = true)
        protected String xaResourceTimeout;
        @XmlAttribute(name = "ds-type")
        protected String dsType;
        @XmlAttribute(name = "jndi-name")
        protected String jndiName;

        /**
         * Gets the value of the connectionUrl0020 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConnectionUrl_0020() {
            return connectionUrl0020;
        }

        /**
         * Sets the value of the connectionUrl0020 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConnectionUrl_0020(String value) {
            this.connectionUrl0020 = value;
        }

        /**
         * Gets the value of the datasourceClass property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDatasourceClass() {
            return datasourceClass;
        }

        /**
         * Sets the value of the datasourceClass property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDatasourceClass(String value) {
            this.datasourceClass = value;
        }

        /**
         * Gets the value of the driverClass property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDriverClass() {
            return driverClass;
        }

        /**
         * Sets the value of the driverClass property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDriverClass(String value) {
            this.driverClass = value;
        }

        /**
         * Gets the value of the driverName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDriverName() {
            return driverName;
        }

        /**
         * Sets the value of the driverName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDriverName(String value) {
            this.driverName = value;
        }

        /**
         * Gets the value of the enabled property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnabled() {
            return enabled;
        }

        /**
         * Sets the value of the enabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnabled(String value) {
            this.enabled = value;
        }

        /**
         * Gets the value of the maxPoolSize property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaxPoolSize() {
            return maxPoolSize;
        }

        /**
         * Sets the value of the maxPoolSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaxPoolSize(String value) {
            this.maxPoolSize = value;
        }

        /**
         * Gets the value of the minPoolSize property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMinPoolSize() {
            return minPoolSize;
        }

        /**
         * Sets the value of the minPoolSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMinPoolSize(String value) {
            this.minPoolSize = value;
        }

        /**
         * Gets the value of the securityDomain property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecurityDomain() {
            return securityDomain;
        }

        /**
         * Sets the value of the securityDomain property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecurityDomain(String value) {
            this.securityDomain = value;
        }

        /**
         * Gets the value of the userName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserName() {
            return userName;
        }

        /**
         * Sets the value of the userName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserName(String value) {
            this.userName = value;
        }

        /**
         * Gets the value of the newConnectionSql property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewConnectionSql() {
            return newConnectionSql;
        }

        /**
         * Sets the value of the newConnectionSql property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewConnectionSql(String value) {
            this.newConnectionSql = value;
        }

        /**
         * Gets the value of the xaDatasourceClass property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXaDatasourceClass() {
            return xaDatasourceClass;
        }

        /**
         * Sets the value of the xaDatasourceClass property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXaDatasourceClass(String value) {
            this.xaDatasourceClass = value;
        }

        /**
         * Gets the value of the xaResourceTimeout property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXaResourceTimeout() {
            return xaResourceTimeout;
        }

        /**
         * Sets the value of the xaResourceTimeout property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXaResourceTimeout(String value) {
            this.xaResourceTimeout = value;
        }

        /**
         * Gets the value of the dsType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDsType() {
            return dsType;
        }

        /**
         * Sets the value of the dsType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDsType(String value) {
            this.dsType = value;
        }

        /**
         * Gets the value of the jndiName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJndiName() {
            return jndiName;
        }

        /**
         * Sets the value of the jndiName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJndiName(String value) {
            this.jndiName = value;
        }

    }

}
