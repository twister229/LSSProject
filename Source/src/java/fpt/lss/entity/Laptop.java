/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.lss.entity;

import fpt.lss.annotation.Entity;
import fpt.lss.annotation.Key;
import fpt.lss.annotation.Table;
import fpt.lss.jaxb.LaptopJAXB;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import sun.nio.cs.ext.Big5;

/**
 *
 * @author HongLinh
 */
@Table(name = "Laptop")
public class Laptop {

    @Key(indentity = true)
    @Entity(name = "Id")
    private BigDecimal id;
    @Entity(name = "BrandId")
    private Integer brandId;
    @Entity(name = "Name")
    private String name;
    @Entity(name = "CPU")
    private Integer cpu;
    @Entity(name = "Cache")
    private String cache;
    @Entity(name = "RAMSize")
    private Integer ramSize;
    @Entity(name = "RAMType")
    private String ramType;
    @Entity(name = "RAMBus")
    private String ramBUS;
    @Entity(name = "HDDStorage")
    private Integer hddStorage;
    @Entity(name = "SSDStorage")
    private Integer ssdStorage;
    @Entity(name = "ScreenSize")
    private BigDecimal screenSize;
    @Entity(name = "DisplayResolution")
    private String displayResolution;
    @Entity(name = "Touch")
    private Boolean touch;
    @Entity(name = "InternalVideoCard")
    private Integer internalVideoCard;
    @Entity(name = "ExternalVideoCard")
    private Integer externalVideoCard;
    @Entity(name = "OpticalDrive")
    private String opticalDrive;
    @Entity(name = "OSVersion")
    private String osVersion;
    @Entity(name = "Bluetooth")
    private String bluetooth;
    @Entity(name = "Port")
    private String port;
    @Entity(name = "LAN")
    private String lan;
    @Entity(name = "Wifi")
    private String wifi;
    @Entity(name = "Webcam")
    private String webcam;
    @Entity(name = "CardPort")
    private String cardPort;
    @Entity(name = "Battery")
    private String battery;
    @Entity(name = "Weight")
    private BigDecimal weight;
    @Entity(name = "Warranty")
    private Integer warranty;
    @Entity(name = "Size")
    private String size;
    @Entity(name = "Avatar")
    private String avatar;
    @Entity(name = "SourceLink")
    private String sourceLink;

    public Laptop() {
    }

    public Laptop(Integer brandId, String name, Integer cpu, String cache, Integer ramSize,
            String ramType, String ramBUS, Integer hddStorage, Integer ssdStorage,
            BigDecimal screenSize, String displayResolution, Boolean touch, Integer internalVideoCard,
            Integer externalVideoCard, String opticalDrive, String osVersion, String bluetooth,
            String port, String lan, String wifi, String webcam, String cardPort, String battery,
            BigDecimal weight, Integer warranty, String size, String avatar, String sourceLink) {
        this.brandId = brandId;
        this.name = name;
        this.cpu = cpu;
        this.cache = cache;
        this.ramSize = ramSize;
        this.ramType = ramType;
        this.ramBUS = ramBUS;
        this.hddStorage = hddStorage;
        this.ssdStorage = ssdStorage;
        this.screenSize = screenSize;
        this.displayResolution = displayResolution;
        this.touch = touch;
        this.internalVideoCard = internalVideoCard;
        this.externalVideoCard = externalVideoCard;
        this.opticalDrive = opticalDrive;
        this.osVersion = osVersion;
        this.bluetooth = bluetooth;
        this.port = port;
        this.lan = lan;
        this.wifi = wifi;
        this.webcam = webcam;
        this.cardPort = cardPort;
        this.battery = battery;
        this.weight = weight;
        this.warranty = warranty;
        this.size = size;
        this.avatar = avatar;
        this.sourceLink = sourceLink;
    }

    public Laptop(LaptopJAXB lapJAXB) {
        this(lapJAXB.getBrandId().intValue(), lapJAXB.getName(), lapJAXB.getCpu().intValue(), lapJAXB.getCache(),
                lapJAXB.getRamSize().intValue(), lapJAXB.getRamType(), lapJAXB.getRamBUS(),
                (lapJAXB.getHddStorage() != null) ? lapJAXB.getHddStorage().intValue() : null,
                (lapJAXB.getSsdStorage() != null) ? lapJAXB.getSsdStorage().intValue() : null,
                new BigDecimal(Float.toString(lapJAXB.getScreenSize()), new MathContext(4, RoundingMode.HALF_UP)),
                lapJAXB.getDisplayResolution(), lapJAXB.isTouch(),
                (lapJAXB.getInternalVideoCard() != null) ? lapJAXB.getInternalVideoCard().intValue() : null,
                (lapJAXB.getExternalVideoCard() != null) ? lapJAXB.getExternalVideoCard().intValue() : null,
                lapJAXB.getOpticalDrive(), lapJAXB.getOsVersion(), lapJAXB.getBluetooth(), lapJAXB.getPort(),
                lapJAXB.getLan(), lapJAXB.getWifi(), lapJAXB.getWebcam(), lapJAXB.getCardPort(), lapJAXB.getBattery(),
                (lapJAXB.getWeight() == null) ? null : new BigDecimal(Float.toString(lapJAXB.getWeight()), new MathContext(4, RoundingMode.HALF_UP)),
                (lapJAXB.getWarranty() != null) ? lapJAXB.getWarranty().intValue() : null, lapJAXB.getSize(),
                lapJAXB.getAvatar(), lapJAXB.getSourceLink());
    }

    public BigDecimal getId() {
        return id;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    public Integer getRamSize() {
        return ramSize;
    }

    public void setRamSize(Integer ramSize) {
        this.ramSize = ramSize;
    }

    public String getRamType() {
        return ramType;
    }

    public void setRamType(String ramType) {
        this.ramType = ramType;
    }

    public String getRamBUS() {
        return ramBUS;
    }

    public void setRamBUS(String ramBUS) {
        this.ramBUS = ramBUS;
    }

    public Integer getHddStorage() {
        return hddStorage;
    }

    public void setHddStorage(Integer hddStorage) {
        this.hddStorage = hddStorage;
    }

    public Integer getSsdStorage() {
        return ssdStorage;
    }

    public void setSsdStorage(Integer ssdStorage) {
        this.ssdStorage = ssdStorage;
    }

    public BigDecimal getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(BigDecimal screenSize) {
        this.screenSize = screenSize;
    }

    public String getDisplayResolution() {
        return displayResolution;
    }

    public void setDisplayResolution(String displayResolution) {
        this.displayResolution = displayResolution;
    }

    public Boolean isTouch() {
        return touch;
    }

    public void setTouch(Boolean touch) {
        this.touch = touch;
    }

    public Integer getInternalVideoCard() {
        return internalVideoCard;
    }

    public void setInternalVideoCard(Integer internalVideoCard) {
        this.internalVideoCard = internalVideoCard;
    }

    public Integer getExternalVideoCard() {
        return externalVideoCard;
    }

    public void setExternalVideoCard(Integer externalVideoCard) {
        this.externalVideoCard = externalVideoCard;
    }

    public String getOpticalDrive() {
        return opticalDrive;
    }

    public void setOpticalDrive(String opticalDrive) {
        this.opticalDrive = opticalDrive;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getLan() {
        return lan;
    }

    public void setLan(String lan) {
        this.lan = lan;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public String getWebcam() {
        return webcam;
    }

    public void setWebcam(String webcam) {
        this.webcam = webcam;
    }

    public String getCardPort() {
        return cardPort;
    }

    public void setCardPort(String cardPort) {
        this.cardPort = cardPort;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Integer getWarranty() {
        return warranty;
    }

    public void setWarranty(Integer warranty) {
        this.warranty = warranty;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getSourceLink() {
        return sourceLink;
    }

    public void setSourceLink(String sourceLink) {
        this.sourceLink = sourceLink;
    }

}
