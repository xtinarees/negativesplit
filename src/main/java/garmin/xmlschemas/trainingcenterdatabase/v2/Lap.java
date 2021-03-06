//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.09 at 12:20:23 PM MDT 
//


package garmin.xmlschemas.trainingcenterdatabase.v2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}TotalTimeSeconds"/>
 *         &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}DistanceMeters"/>
 *         &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}MaximumSpeed"/>
 *         &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Calories"/>
 *         &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}AverageHeartRateBpm"/>
 *         &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}MaximumHeartRateBpm"/>
 *         &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Intensity"/>
 *         &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}TriggerMethod"/>
 *         &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Track"/>
 *         &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Extensions"/>
 *       &lt;/sequence>
 *       &lt;attribute name="StartTime" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *             &lt;enumeration value="2012-05-19T11:08:07.000Z"/>
 *             &lt;enumeration value="2012-05-19T11:17:01.000Z"/>
 *             &lt;enumeration value="2012-05-19T11:25:43.000Z"/>
 *             &lt;enumeration value="2012-05-19T11:35:20.000Z"/>
 *             &lt;enumeration value="2012-05-19T11:43:42.000Z"/>
 *             &lt;enumeration value="2012-05-19T11:52:48.000Z"/>
 *             &lt;enumeration value="2012-05-19T12:01:28.000Z"/>
 *             &lt;enumeration value="2012-05-19T12:09:57.000Z"/>
 *             &lt;enumeration value="2012-05-19T12:18:32.000Z"/>
 *             &lt;enumeration value="2012-05-19T12:27:20.000Z"/>
 *             &lt;enumeration value="2012-05-19T12:36:13.000Z"/>
 *             &lt;enumeration value="2012-05-19T12:45:05.000Z"/>
 *             &lt;enumeration value="2012-05-19T12:54:01.000Z"/>
 *             &lt;enumeration value="2012-05-19T13:03:02.000Z"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "totalTimeSeconds",
    "distanceMeters",
    "maximumSpeed",
    "calories",
    "averageHeartRateBpm",
    "maximumHeartRateBpm",
    "intensity",
    "triggerMethod",
    "track",
    "extensions"
})
@XmlRootElement(name = "Lap")
public class Lap {

    @XmlElement(name = "TotalTimeSeconds", required = true)
    protected BigDecimal totalTimeSeconds;
    @XmlElement(name = "DistanceMeters", required = false)
    protected String distanceMeters;
    @XmlElement(name = "MaximumSpeed", required = true)
    protected BigDecimal maximumSpeed;
    @XmlElement(name = "Calories")
    protected byte calories;
    @XmlElement(name = "AverageHeartRateBpm", required = true)
    protected AverageHeartRateBpm averageHeartRateBpm;
    @XmlElement(name = "MaximumHeartRateBpm", required = true)
    protected MaximumHeartRateBpm maximumHeartRateBpm;
    @XmlElement(name = "Intensity", required = true)
    protected String intensity;
    @XmlElement(name = "TriggerMethod", required = true)
    protected String triggerMethod;
    @XmlElement(name = "Track", required = true)
    protected Track track;
    @XmlElement(name = "Extensions", required = true)
    protected Extensions extensions;
    @XmlAttribute(name = "StartTime", required = true)
    protected XMLGregorianCalendar startTime;

    /**
     * Gets the value of the totalTimeSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTimeSeconds() {
        return totalTimeSeconds;
    }

    /**
     * Sets the value of the totalTimeSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTimeSeconds(BigDecimal value) {
        this.totalTimeSeconds = value;
    }

    /**
     * Gets the value of the distanceMeters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceMeters() {
        return distanceMeters;
    }

    /**
     * Sets the value of the distanceMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceMeters(String value) {
        this.distanceMeters = value;
    }

    /**
     * Gets the value of the maximumSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumSpeed() {
        return maximumSpeed;
    }

    /**
     * Sets the value of the maximumSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumSpeed(BigDecimal value) {
        this.maximumSpeed = value;
    }

    /**
     * Gets the value of the calories property.
     * 
     */
    public byte getCalories() {
        return calories;
    }

    /**
     * Sets the value of the calories property.
     * 
     */
    public void setCalories(byte value) {
        this.calories = value;
    }

    /**
     * Gets the value of the averageHeartRateBpm property.
     * 
     * @return
     *     possible object is
     *     {@link AverageHeartRateBpm }
     *     
     */
    public AverageHeartRateBpm getAverageHeartRateBpm() {
        return averageHeartRateBpm;
    }

    /**
     * Sets the value of the averageHeartRateBpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AverageHeartRateBpm }
     *     
     */
    public void setAverageHeartRateBpm(AverageHeartRateBpm value) {
        this.averageHeartRateBpm = value;
    }

    /**
     * Gets the value of the maximumHeartRateBpm property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumHeartRateBpm }
     *     
     */
    public MaximumHeartRateBpm getMaximumHeartRateBpm() {
        return maximumHeartRateBpm;
    }

    /**
     * Sets the value of the maximumHeartRateBpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumHeartRateBpm }
     *     
     */
    public void setMaximumHeartRateBpm(MaximumHeartRateBpm value) {
        this.maximumHeartRateBpm = value;
    }

    /**
     * Gets the value of the intensity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntensity() {
        return intensity;
    }

    /**
     * Sets the value of the intensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntensity(String value) {
        this.intensity = value;
    }

    /**
     * Gets the value of the triggerMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggerMethod() {
        return triggerMethod;
    }

    /**
     * Sets the value of the triggerMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggerMethod(String value) {
        this.triggerMethod = value;
    }

    /**
     * Gets the value of the track property.
     * 
     * @return
     *     possible object is
     *     {@link Track }
     *     
     */
    public Track getTrack() {
        return track;
    }

    /**
     * Sets the value of the track property.
     * 
     * @param value
     *     allowed object is
     *     {@link Track }
     *     
     */
    public void setTrack(Track value) {
        this.track = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

}
