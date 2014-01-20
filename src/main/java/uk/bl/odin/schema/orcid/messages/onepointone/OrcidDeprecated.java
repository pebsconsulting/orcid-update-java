//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.20 at 12:59:45 PM GMT 
//

package uk.bl.odin.schema.orcid.messages.onepointone;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}deprecated-date"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}primary-record"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "deprecatedDate", "primaryRecord" })
@XmlRootElement(name = "orcid-deprecated")
public class OrcidDeprecated {

	@XmlElement(name = "deprecated-date", required = true)
	protected DeprecatedDate deprecatedDate;
	@XmlElement(name = "primary-record", required = true)
	protected PrimaryRecord primaryRecord;

	/**
	 * Gets the value of the deprecatedDate property.
	 * 
	 * @return possible object is {@link DeprecatedDate }
	 * 
	 */
	public DeprecatedDate getDeprecatedDate() {
		return deprecatedDate;
	}

	/**
	 * Sets the value of the deprecatedDate property.
	 * 
	 * @param value
	 *            allowed object is {@link DeprecatedDate }
	 * 
	 */
	public void setDeprecatedDate(DeprecatedDate value) {
		this.deprecatedDate = value;
	}

	/**
	 * Gets the value of the primaryRecord property.
	 * 
	 * @return possible object is {@link PrimaryRecord }
	 * 
	 */
	public PrimaryRecord getPrimaryRecord() {
		return primaryRecord;
	}

	/**
	 * Sets the value of the primaryRecord property.
	 * 
	 * @param value
	 *            allowed object is {@link PrimaryRecord }
	 * 
	 */
	public void setPrimaryRecord(PrimaryRecord value) {
		this.primaryRecord = value;
	}

}
