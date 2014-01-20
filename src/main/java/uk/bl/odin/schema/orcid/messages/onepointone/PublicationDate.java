//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.20 at 12:59:45 PM GMT 
//

package uk.bl.odin.schema.orcid.messages.onepointone;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *     &lt;extension base="{http://www.orcid.org/ns/orcid}fuzzy-date">
 *       &lt;attribute name="media-type" type="{http://www.orcid.org/ns/orcid}media-type" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "publication-date")
public class PublicationDate extends FuzzyDate {

	@XmlAttribute(name = "media-type")
	protected MediaType mediaType;

	/**
	 * Gets the value of the mediaType property.
	 * 
	 * @return possible object is {@link MediaType }
	 * 
	 */
	public MediaType getMediaType() {
		return mediaType;
	}

	/**
	 * Sets the value of the mediaType property.
	 * 
	 * @param value
	 *            allowed object is {@link MediaType }
	 * 
	 */
	public void setMediaType(MediaType value) {
		this.mediaType = value;
	}

}
