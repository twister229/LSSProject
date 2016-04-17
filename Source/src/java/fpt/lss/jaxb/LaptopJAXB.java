
package fpt.lss.jaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LaptopJAXB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LaptopJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brandId" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cpu" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="cache" type="{http://xml.netbeans.org/schema/lss_cpu}CacheType"/>
 *         &lt;element name="ramSize" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="ramType" type="{http://xml.netbeans.org/schema/lss_cpu}RAMType"/>
 *         &lt;element name="ramBUS" type="{http://xml.netbeans.org/schema/lss_cpu}RAMBus"/>
 *         &lt;element name="hddStorage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="ssdStorage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="screenSize" type="{http://xml.netbeans.org/schema/lss_cpu}ScreenSize"/>
 *         &lt;element name="displayResolution" type="{http://xml.netbeans.org/schema/lss_cpu}DisplayResolution"/>
 *         &lt;element name="touch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="internalVideoCard" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="externalVideoCard" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="opticalDrive" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="osVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bluetooth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lan" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wifi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="webcam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cardPort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="battery" type="{http://xml.netbeans.org/schema/lss_cpu}Battery"/>
 *         &lt;element name="weight" type="{http://xml.netbeans.org/schema/lss_cpu}Weight"/>
 *         &lt;element name="warranty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="avatar" type="{http://xml.netbeans.org/schema/lss_cpu}LinkType"/>
 *         &lt;element name="sourceLink" type="{http://xml.netbeans.org/schema/lss_cpu}LinkType"/>
 *         &lt;element name="host" type="{http://xml.netbeans.org/schema/lss_cpu}LinkType"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LaptopJAXB", propOrder = {
    "brandId",
    "name",
    "cpu",
    "cache",
    "ramSize",
    "ramType",
    "ramBUS",
    "hddStorage",
    "ssdStorage",
    "screenSize",
    "displayResolution",
    "touch",
    "internalVideoCard",
    "externalVideoCard",
    "opticalDrive",
    "osVersion",
    "bluetooth",
    "port",
    "lan",
    "wifi",
    "webcam",
    "cardPort",
    "battery",
    "weight",
    "warranty",
    "size",
    "avatar",
    "sourceLink",
    "host",
    "price"
})
@XmlRootElement
public class LaptopJAXB {

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger brandId;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger cpu;
    @XmlElement(required = true, nillable = true)
    protected String cache;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger ramSize;
    @XmlElement(required = true, nillable = true)
    protected String ramType;
    @XmlElement(required = true, nillable = true)
    protected String ramBUS;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger hddStorage;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger ssdStorage;
    protected float screenSize;
    @XmlElement(required = true, nillable = true)
    protected String displayResolution;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean touch;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger internalVideoCard;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger externalVideoCard;
    @XmlElement(required = true, nillable = true)
    protected String opticalDrive;
    @XmlElement(required = true, nillable = true)
    protected String osVersion;
    @XmlElement(required = true, nillable = true)
    protected String bluetooth;
    @XmlElement(required = true, nillable = true)
    protected String port;
    @XmlElement(required = true, nillable = true)
    protected String lan;
    @XmlElement(required = true, nillable = true)
    protected String wifi;
    @XmlElement(required = true, nillable = true)
    protected String webcam;
    @XmlElement(required = true, nillable = true)
    protected String cardPort;
    @XmlElement(required = true, nillable = true)
    protected String battery;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float weight;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger warranty;
    @XmlElement(required = true, nillable = true)
    protected String size;
    @XmlElement(required = true)
    protected String avatar;
    @XmlElement(required = true)
    protected String sourceLink;
    @XmlElement(required = true)
    protected String host;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger price;

    /**
     * Gets the value of the brandId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBrandId() {
        return brandId;
    }

    /**
     * Sets the value of the brandId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBrandId(BigInteger value) {
        this.brandId = value;
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
     * Gets the value of the cpu property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCpu() {
        return cpu;
    }

    /**
     * Sets the value of the cpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCpu(BigInteger value) {
        this.cpu = value;
    }

    /**
     * Gets the value of the cache property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCache() {
        return cache;
    }

    /**
     * Sets the value of the cache property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCache(String value) {
        this.cache = value;
    }

    /**
     * Gets the value of the ramSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRamSize() {
        return ramSize;
    }

    /**
     * Sets the value of the ramSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRamSize(BigInteger value) {
        this.ramSize = value;
    }

    /**
     * Gets the value of the ramType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRamType() {
        return ramType;
    }

    /**
     * Sets the value of the ramType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRamType(String value) {
        this.ramType = value;
    }

    /**
     * Gets the value of the ramBUS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRamBUS() {
        return ramBUS;
    }

    /**
     * Sets the value of the ramBUS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRamBUS(String value) {
        this.ramBUS = value;
    }

    /**
     * Gets the value of the hddStorage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHddStorage() {
        return hddStorage;
    }

    /**
     * Sets the value of the hddStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHddStorage(BigInteger value) {
        this.hddStorage = value;
    }

    /**
     * Gets the value of the ssdStorage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSsdStorage() {
        return ssdStorage;
    }

    /**
     * Sets the value of the ssdStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSsdStorage(BigInteger value) {
        this.ssdStorage = value;
    }

    /**
     * Gets the value of the screenSize property.
     * 
     */
    public float getScreenSize() {
        return screenSize;
    }

    /**
     * Sets the value of the screenSize property.
     * 
     */
    public void setScreenSize(float value) {
        this.screenSize = value;
    }

    /**
     * Gets the value of the displayResolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayResolution() {
        return displayResolution;
    }

    /**
     * Sets the value of the displayResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayResolution(String value) {
        this.displayResolution = value;
    }

    /**
     * Gets the value of the touch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTouch() {
        return touch;
    }

    /**
     * Sets the value of the touch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTouch(Boolean value) {
        this.touch = value;
    }

    /**
     * Gets the value of the internalVideoCard property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInternalVideoCard() {
        return internalVideoCard;
    }

    /**
     * Sets the value of the internalVideoCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInternalVideoCard(BigInteger value) {
        this.internalVideoCard = value;
    }

    /**
     * Gets the value of the externalVideoCard property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExternalVideoCard() {
        return externalVideoCard;
    }

    /**
     * Sets the value of the externalVideoCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExternalVideoCard(BigInteger value) {
        this.externalVideoCard = value;
    }

    /**
     * Gets the value of the opticalDrive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpticalDrive() {
        return opticalDrive;
    }

    /**
     * Sets the value of the opticalDrive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpticalDrive(String value) {
        this.opticalDrive = value;
    }

    /**
     * Gets the value of the osVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * Sets the value of the osVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsVersion(String value) {
        this.osVersion = value;
    }

    /**
     * Gets the value of the bluetooth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBluetooth() {
        return bluetooth;
    }

    /**
     * Sets the value of the bluetooth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBluetooth(String value) {
        this.bluetooth = value;
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

    /**
     * Gets the value of the lan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLan() {
        return lan;
    }

    /**
     * Sets the value of the lan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLan(String value) {
        this.lan = value;
    }

    /**
     * Gets the value of the wifi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWifi() {
        return wifi;
    }

    /**
     * Sets the value of the wifi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWifi(String value) {
        this.wifi = value;
    }

    /**
     * Gets the value of the webcam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebcam() {
        return webcam;
    }

    /**
     * Sets the value of the webcam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebcam(String value) {
        this.webcam = value;
    }

    /**
     * Gets the value of the cardPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPort() {
        return cardPort;
    }

    /**
     * Sets the value of the cardPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPort(String value) {
        this.cardPort = value;
    }

    /**
     * Gets the value of the battery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBattery() {
        return battery;
    }

    /**
     * Sets the value of the battery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBattery(String value) {
        this.battery = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWeight(Float value) {
        this.weight = value;
    }

    /**
     * Gets the value of the warranty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWarranty() {
        return warranty;
    }

    /**
     * Sets the value of the warranty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWarranty(BigInteger value) {
        this.warranty = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Gets the value of the avatar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * Sets the value of the avatar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvatar(String value) {
        this.avatar = value;
    }

    /**
     * Gets the value of the sourceLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceLink() {
        return sourceLink;
    }

    /**
     * Sets the value of the sourceLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceLink(String value) {
        this.sourceLink = value;
    }

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrice(BigInteger value) {
        this.price = value;
    }

}
