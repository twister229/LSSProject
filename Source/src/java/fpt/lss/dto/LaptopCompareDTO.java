/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.lss.dto;

import fpt.lss.dao.CPUDAO;
import fpt.lss.dao.VideoCardDAO;
import fpt.lss.entity.CPU;
import fpt.lss.entity.Laptop;
import fpt.lss.entity.VideoCard;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;

/**
 *
 * @author HongLinh
 */
public class LaptopCompareDTO implements Serializable {

    private final int defaultVideoCard = 311;
    private int id;
    private String name;
    private String avatar;
    private Map.Entry<String, Integer> cpu;
    private int ramSize;
    private int hddSize;
    private int ssdSize;
    private Map.Entry<String, Integer> videoCard;
    private float screenSize;
    private float weight;
    private CPUDAO cpuDAO;
    private VideoCardDAO videoCardDAO;

    public LaptopCompareDTO() {
        cpuDAO = new CPUDAO();
        videoCardDAO = new VideoCardDAO();
    }

    public LaptopCompareDTO(int id, String name, String avatar, Map.Entry<String, Integer> cpu,
            int ramSize, int hhdSize, int ssdSize, Map.Entry<String, Integer> videoCard,
            float screenSize, float weight) {
        this();
        this.id = id;
        this.name = name;
        this.avatar = avatar;
        this.cpu = cpu;
        this.ramSize = ramSize;
        this.hddSize = hhdSize;
        this.ssdSize = ssdSize;
        this.videoCard = videoCard;
        this.screenSize = screenSize;
        this.weight = weight;
    }

    public LaptopCompareDTO(Laptop lap) {
        this();
        this.id = lap.getId();
        this.name = lap.getName();
        this.avatar = lap.getAvatar();
        this.cpu = getCPU(lap);
        this.ramSize = lap.getRamSize();
        if (lap.getHddStorage() != null) {
            this.hddSize = lap.getHddStorage();
        }
        if (lap.getSsdStorage() != null) {
            this.ssdSize = lap.getSsdStorage();
        }
        this.videoCard = getVideoCard(lap);
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Map.Entry<String, Integer> getCpu() {
        return cpu;
    }

    public void setCpu(Map.Entry<String, Integer> cpu) {
        this.cpu = cpu;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hhdSize) {
        this.hddSize = hhdSize;
    }

    public int getSsdSize() {
        return ssdSize;
    }

    public void setSsdSize(int ssdSize) {
        this.ssdSize = ssdSize;
    }

    public Map.Entry<String, Integer> getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(Map.Entry<String, Integer> videoCard) {
        this.videoCard = videoCard;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

}
