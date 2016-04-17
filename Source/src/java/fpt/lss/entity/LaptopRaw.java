/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.lss.entity;

import fpt.lss.annotation.Entity;
import fpt.lss.annotation.Key;
import fpt.lss.annotation.Table;

/**
 *
 * @author HongLinh
 */
@Table(name = "LaptopRaw")
public class LaptopRaw {

    @Key(indentity = true)
    @Entity(name = "Id")
    private int id;
    @Entity(name = "BrandId")
    private int brandId;
    @Entity(name = "Name")
    private String name;
    @Entity(name = "CPU")
    private String cpu;
    @Entity(name = "Cache")
    private String cache;
    @Entity(name = "RAM")
    private String ram;
    @Entity(name = "Storage")
    private String storage;
    @Entity(name = "Screen")
    private String screen;
    @Entity(name = "VideoCard")
    private String videoCard;
    @Entity(name = "OpticalDrive")
    private String opticalDrive;
    @Entity(name = "OSVersion")
    private String osVersion;
    @Entity(name = "Bluetooth")
    private String bluetooth;
    @Entity(name = "USBPort")
    private String usbPort;
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
    private String weight;
    @Entity(name = "Warranty")
    private String warranty;
    @Entity(name = "Size")
    private String size;
    @Entity(name = "Avatar")
    private String avatar;
    @Entity(name = "SourceLink")
    private String sourceLink;
    @Entity(name = "Price")
    private String price;
    @Entity(name = "Host")
    private String host;

    public LaptopRaw() {
    }

    public LaptopRaw(int brandId, String name, String cpu, String cache, String ram, String storage, String screen, String videoCard, String opticalDrive, String osVersion, String bluetooth, String usbPort, String lan, String wifi, String webcam, String cardPort, String battery, String weight, String warranty, String size, String avatar, String sourceLink, String price, String host) {
        this.brandId = brandId;
        this.name = name;
        this.cpu = cpu;
        this.cache = cache;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.videoCard = videoCard;
        this.opticalDrive = opticalDrive;
        this.osVersion = osVersion;
        this.bluetooth = bluetooth;
        this.usbPort = usbPort;
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
        this.price = price;
        this.host = host;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
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

    public String getUsbPort() {
        return usbPort;
    }

    public void setUsbPort(String usbPort) {
        this.usbPort = usbPort;
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

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

}
