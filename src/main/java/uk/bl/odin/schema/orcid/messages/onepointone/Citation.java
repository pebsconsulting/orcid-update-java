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
import javax.xml.bind.annotation.XmlType;

/**
 * Container for a work citation. Citations may be fielded (e.g., RIS, BibTeX),
 * or may be textual (APA, MLA, Chicago, etc.) The required work-citation-type
 * element indicates the format of the citation.
 * 
 * 
 * <p>
 * Java class for citation complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="citation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="work-citation-type" type="{http://www.orcid.org/ns/orcid}citation-type"/>
 *         &lt;element name="citation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citation", propOrder = { "workCitationType", "citation" })
public class Citation {

	@XmlElement(name = "work-citation-type", required = true, defaultValue = "formatted-unspecified")
	protected CitationType workCitationType;
	@XmlElement(required = true)
	protected String citation;

	/**
	 * Gets the value of the workCitationType property.
	 * 
	 * @return possible object is {@link CitationType }
	 * 
	 */
	public CitationType getWorkCitationType() {
		return workCitationType;
	}

	/**
	 * Sets the value of the workCitationType property.
	 * 
	 * @param value
	 *            allowed object is {@link CitationType }
	 * 
	 */
	public void setWorkCitationType(CitationType value) {
		this.workCitationType = value;
	}

	/**
	 * Gets the value of the citation property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCitation() {
		return citation;
	}

	/**
	 * Sets the value of the citation property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCitation(String value) {
		this.citation = value;
	}

}
