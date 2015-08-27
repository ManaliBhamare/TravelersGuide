
package data.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="places" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="experiences" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operation", propOrder = {
    "places",
    "activities",
    "experiences"
})
public class Operation {

    protected String places;
    protected String activities;
    protected String experiences;

    /**
     * Gets the value of the places property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaces() {
        return places;
    }

    /**
     * Sets the value of the places property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaces(String value) {
        this.places = value;
    }

    /**
     * Gets the value of the activities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivities() {
        return activities;
    }

    /**
     * Sets the value of the activities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivities(String value) {
        this.activities = value;
    }

    /**
     * Gets the value of the experiences property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExperiences() {
        return experiences;
    }

    /**
     * Sets the value of the experiences property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExperiences(String value) {
        this.experiences = value;
    }

}
