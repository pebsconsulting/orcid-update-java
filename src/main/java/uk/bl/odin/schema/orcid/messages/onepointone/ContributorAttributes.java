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
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}contributor-sequence" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}contributor-role" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "contributorSequence", "contributorRole" })
@XmlRootElement(name = "contributor-attributes")
public class ContributorAttributes {

	@XmlElement(name = "contributor-sequence")
	protected String contributorSequence;
	@XmlElement(name = "contributor-role")
	protected String contributorRole;

	/**
	 * Gets the value of the contributorSequence property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContributorSequence() {
		return contributorSequence;
	}

	/**
	 * Sets the value of the contributorSequence property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setContributorSequence(String value) {
		this.contributorSequence = value;
	}

	/**
	 * Gets the value of the contributorRole property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContributorRole() {
		return contributorRole;
	}

	/**
	 * Sets the value of the contributorRole property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setContributorRole(String value) {
		this.contributorRole = value;
	}

}
