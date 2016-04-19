package fpt.lss.dto;

import fpt.lss.dao.CPUDAO;
import fpt.lss.dao.VideoCardDAO;
import fpt.lss.entity.CPU;
import fpt.lss.entity.Laptop;
import fpt.lss.entity.VideoCard;
import java.math.BigInteger;
import java.util.AbstractMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for LaptopCompareJAXB complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="LaptopCompareJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="avatar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cpuName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cpuMark" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="ramSize" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="hddSize" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="ssdSize" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="videoCardName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="videoCardMark" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="screenSize" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LaptopCompareJAXB", propOrder = {
    "id",
    "name",
    "avatar",
    "cpuName",
    "cpuMark",
    "ramSize",
    "hddSize",
    "ssdSize",
    "videoCardName",
    "videoCardMark",
    "screenSize",
    "weight"
})
public class LaptopCompareJAXB {

    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String avatar;
    @XmlElement(required = true)
    protected String cpuName;
    @XmlElement(required = true)
    protected BigInteger cpuMark;
    @XmlElement(required = true)
    protected BigInteger ramSize;
    @XmlElement(required = true)
    protected BigInteger hddSize;
    @XmlElement(required = true)
    protected BigInteger ssdSize;
    @XmlElement(required = true)
    protected String videoCardName;
    @XmlElement(required = true)
    protected BigInteger videoCardMark;
    protected float screenSize;
    protected float weight;
    @XmlTransient
    private CPUDAO cpuDAO;
    @XmlTransient
    private VideoCardDAO videoCardDAO;
    @XmlTransient
    private final int defaultVideoCard = 311;

    public LaptopCompareJAXB() {
        cpuDAO = new CPUDAO();
        videoCardDAO = new VideoCardDAO();
    }

    public LaptopCompareJAXB(BigInteger id, String name, String avatar, String cpuName,
            BigInteger cpuMark, BigInteger ramSize, BigInteger hddSize, BigInteger ssdSize,
            String videoCardName, BigInteger videoCardMark, float screenSize, float weight) {
        this();
        this.id = id;
        this.name = name;
        this.avatar = avatar;
        this.cpuName = cpuName;
        this.cpuMark = cpuMark;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.ssdSize = ssdSize;
        this.videoCardName = videoCardName;
        this.videoCardMark = videoCardMark;
        this.screenSize = screenSize;
        this.weight = weight;
    }

    public LaptopCompareJAXB(LaptopCompareDTO dto) {
        this();
        this.id = BigInteger.valueOf(dto.getId());
        this.name = dto.getName();
        this.avatar = dto.getAvatar();
        this.cpuName = dto.getCpu().getKey();
        this.cpuMark = BigInteger.valueOf(dto.getCpu().getValue());
        this.ramSize = BigInteger.valueOf(dto.getRamSize());
        this.hddSize = BigInteger.valueOf(dto.getHddSize());
        this.ssdSize = BigInteger.valueOf(dto.getSsdSize());
        this.videoCardName = dto.getVideoCard().getKey();
        this.videoCardMark = BigInteger.valueOf(dto.getVideoCard().getValue());
        this.screenSize = dto.getScreenSize();
        this.weight = dto.getWeight();
    }

    public LaptopCompareJAXB(Laptop lap) {
        this();
        this.id = BigInteger.valueOf(lap.getId());
        this.name = lap.getName();
        this.avatar = lap.getAvatar();
        this.cpuName = getCPU(lap).getKey();
        this.cpuMark = BigInteger.valueOf(getCPU(lap).getValue());
        this.ramSize = BigInteger.valueOf(lap.getRamSize());
        if (lap.getHddStorage() != null) {
            this.hddSize = BigInteger.valueOf(lap.getHddStorage());
        }
        if (lap.getSsdStorage() != null) {
            this.ssdSize = BigInteger.valueOf(lap.getSsdStorage());
        }
        this.videoCardName = getVideoCard(lap).getKey();
        this.videoCardMark = BigInteger.valueOf(getVideoCard(lap).getValue());
        if (lap.getScreenSize() != null) {
            this.screenSize = lap.getScreenSize().floatValue();
        }
        if (lap.getWeight() != null) {
            this.weight = lap.getWeight().floatValue();
        }
    }

    private Map.Entry<String, Integer> getCPU(Laptop lap) {
        CPU cpu = cpuDAO.getById(lap.getCpu());
        return new AbstractMap.SimpleEntry<String, Integer>(cpu.getName(), cpu.getMark());
    }

    private Map.Entry<String, Integer> getVideoCard(Laptop lap) {
        int videoId = defaultVideoCard;
        if (lap.getExternalVideoCard() != null) {
            videoId = lap.getExternalVideoCard();
        } else if (lap.getInternalVideoCard() != null) {
            videoId = lap.getInternalVideoCard();
        }
        VideoCard result = videoCardDAO.getById(videoId);
        return new AbstractMap.SimpleEntry<String, Integer>(result.getName(), result.getMark());
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the avatar property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * Sets the value of the avatar property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setAvatar(String value) {
        this.avatar = value;
    }

    /**
     * Gets the value of the cpuName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCpuName() {
        return cpuName;
    }

    /**
     * Sets the value of the cpuName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCpuName(String value) {
        this.cpuName = value;
    }

    /**
     * Gets the value of the cpuMark property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getCpuMark() {
        return cpuMark;
    }

    /**
     * Sets the value of the cpuMark property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setCpuMark(BigInteger value) {
        this.cpuMark = value;
    }

    /**
     * Gets the value of the ramSize property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getRamSize() {
        return ramSize;
    }

    /**
     * Sets the value of the ramSize property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setRamSize(BigInteger value) {
        this.ramSize = value;
    }

    /**
     * Gets the value of the hddSize property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getHddSize() {
        return hddSize;
    }

    /**
     * Sets the value of the hddSize property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setHddSize(BigInteger value) {
        this.hddSize = value;
    }

    /**
     * Gets the value of the ssdSize property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getSsdSize() {
        return ssdSize;
    }

    /**
     * Sets the value of the ssdSize property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setSsdSize(BigInteger value) {
        this.ssdSize = value;
    }

    /**
     * Gets the value of the videoCardName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getVideoCardName() {
        return videoCardName;
    }

    /**
     * Sets the value of the videoCardName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setVideoCardName(String value) {
        this.videoCardName = value;
    }

    /**
     * Gets the value of the videoCardMark property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getVideoCardMark() {
        return videoCardMark;
    }

    /**
     * Sets the value of the videoCardMark property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setVideoCardMark(BigInteger value) {
        this.videoCardMark = value;
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
     * Gets the value of the weight property.
     *
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     *
     */
    public void setWeight(float value) {
        this.weight = value;
    }

}
