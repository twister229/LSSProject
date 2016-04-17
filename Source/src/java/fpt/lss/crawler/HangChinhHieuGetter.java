/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.lss.crawler;

import fpt.lss.entity.CPU;
import fpt.lss.entity.VideoCard;
import fpt.lss.jaxb.LaptopJAXB;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author HongLinh
 */
public class HangChinhHieuGetter extends ValueGetterInterface {

    public HangChinhHieuGetter() {
        super();
    }

    @Override
    protected BigInteger getPrice(String priceStr) {
        BigInteger result = null;
        try {
            result = new BigInteger(priceStr.substring(0, priceStr.length() - 1).replaceAll(",", ""));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public int getBrandId(String brandName) {
        if (brandName.equals("Dell")) {
            return 1;
        } else if (brandName.equals("Asus")) {
            return 2;
        } else if (brandName.equals("Acer")) {
            return 3;
        } else if (brandName.equals("Lenovo")) {
            return 4;
        } else if (brandName.equals("HP")) {
            return 5;
        }
        return 0;
    }

    @Override
    public LaptopJAXB getLaptop(Document doc, SelectorInterface selector, String name, int brandId, String sourceLink, String avatar) {
        LaptopJAXB result = new LaptopJAXB();
        Elements listContentElems = doc.select(selector.getListContent());
        String field;
        String value;

        result.setName(name);
        result.setBrandId(BigInteger.valueOf(brandId));
        result.setSourceLink(sourceLink);
        result.setHost(selector.getHost());
        result.setAvatar(avatar);

        Element warrantyEle = doc.select(selector.getWarranty()).get(0);
        result.setWarranty(new BigInteger(getMatchesSubString(warrantyEle.text(), "[0-9]{2}")));
        Element priceEle = doc.select(selector.getPrice()).get(0);
        result.setPrice(getPrice(priceEle.text()));

        for (Element ele : listContentElems) {
            field = ele.select("td").get(0).text().trim();
            value = ele.select("td").get(1).text().trim();
            try {
                if (field.equals("Loại CPU")) {
                    result.setCpu(getCPUId(value));
                } else if (field.equals("Bộ nhớ đệm (Cache)")) {
                    result.setCache(value.toUpperCase());
                } else if (field.equals("Dung lượng RAM")) {
                    result.setRamSize(new BigInteger(getMatchesSubString(value, "[0-9]{1,2}")));
                } else if (field.equals("Loại RAM")) {
                    result.setRamType(value);
                } else if (field.equals("Tốc độ BUS")) {
                    result.setRamBUS(value);
                } else if (field.equals("Dung lượng đĩa cứng")) {
                    value += " ";
                    value = " " + value;
                    String tmp[] = value.split("\\+");
                    result.setHddStorage(getStorageSize(tmp[0].trim().toUpperCase()));
                    result.setSsdStorage(getStorageSize(tmp[1].trim().toUpperCase()));
                } else if (field.equals("Màn hình")) {
                    result.setScreenSize(Float.parseFloat(getMatchesSubString(value, "[0-9]{1,2}(\\.|,)?[0-9]*").replaceAll(",", ".")));
                } else if (field.equals("Độ phân giải")) {
                    String tmp = getMatchesSubString(value, "\\([\\s\\S]*\\)");
                    if (tmp != null) {
                        tmp = tmp.replaceAll("pixels", "").replaceAll(" ", "").replaceAll("\\(", "").replaceAll("\\)", "");
                    }
                    result.setDisplayResolution(tmp);
                } else if (field.equals("Cảm ứng")) {
                    if (value.equals("Có")) {
                        result.setTouch(Boolean.TRUE);
                    } else if (value.equals("Không")) {
                        result.setTouch(Boolean.FALSE);
                    }
                } else if (field.equals("Card đồ họa rời")) {
                    String tmp[] = value.split("\\+");
                    for (String str : tmp) {
                        setVideoCard(result, str);
                    }
                } else if (field.equals("Loại đĩa quang")) {
                    result.setOpticalDrive(value);
                } else if (field.equals("Cổng giao tiếp")) {
                    result.setPort(value);
                } else if (field.equals("Chuẩn LAN")) {
                    result.setLan(value);
                } else if (field.equals("Chuẩn Wifi")) {
                    result.setWifi(value);
                } else if (field.equals("Thông tin webcam")) {
                    result.setWebcam(value);
                } else if (field.equals("Loại thẻ nhớ thích hợp")) {
                    result.setCardPort(value);
                } else if (field.equals("Loại PIN")) {
                    result.setBattery(getMatchesSubString(value, "[0-9]{1,2}\\s*(?i)(cell)((?i)(s))?"));
                } else if (field.equals("Hệ điều hành kèm theo máy")) {
                    result.setOsVersion(value);
                } else if (field.equals("Trọng lượng")) {
                    result.setWeight(Float.parseFloat(getMatchesSubString(value.trim(), "[0-9]{1,2}(\\.|,)?[0-9]{0,2}").replaceAll(",", ".")));
                }
            } catch (Exception ex) {
                System.out.println("Link: " + sourceLink);
                ex.printStackTrace();
            }
        }
        return result;
    }

    private BigInteger getCPUId(String CPUType) {
        for (CPU cpu : listCPU) {
            if (cpu.getName().toUpperCase().contains(CPUType.toUpperCase())) {
                return BigInteger.valueOf(cpu.getId());
            }
        }
        return null;
    }
//    
//       private BigInteger getCPUId(String value) {
//        String tmp[];
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        int cpuId;
//        for (CPU cpu : listCPU) {
//            cpuId = cpu.getId();
//            tmp = cpu.getName().split(" ");
//            for (String s : tmp) {
//                if (containsSubstring(value, s)) {
//                    if (map.containsKey(cpuId)) {
//                        map.put(cpuId, map.get(cpuId) + 1);
//                    } else {
//                        map.put(cpuId, 1);
//                    }
//                }
//            }
//        }
//        BigInteger result = null;
//        int maxValue = 0;
//        int count = 0;
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() >= maxValue) {
//                if (entry.getValue() == maxValue) {
//                    count++;
//                } else {
//                    maxValue = entry.getValue();
//                    result = BigInteger.valueOf(entry.getKey());
//                    count = 1;
//                }
//            }
//        }
//
//        if (count > 1) {
//            System.out.println("Duplicate CPU: " + value);
//            return null;
//        }
//
//        return result;
//    }

    private void setVideoCard(LaptopJAXB lap, String value) {
        if (value.toUpperCase().contains("INTEL")) {
            String query = getMatchesSubString(value, "\\S*[0-9]{3,}\\S*");
            for (VideoCard videoCard : listVideoCard) {
                if (videoCard.getName().toUpperCase().contains("INTEL")
                        && containsSubstring(videoCard.getName(), query)) {
                    lap.setInternalVideoCard(BigInteger.valueOf(videoCard.getId()));
                    return;
                }
            }
        } else if (value.toUpperCase().contains("NVIDIA") || value.toUpperCase().contains("GEFORCE")) {
            String query = getMatchesSubString(value, "\\S*[0-9]{3,}\\S*");
            for (VideoCard videoCard : listVideoCard) {
                if (videoCard.getName().toUpperCase().contains("GEFORCE")
                        && containsSubstring(videoCard.getName(), query)) {
                    lap.setExternalVideoCard(BigInteger.valueOf(videoCard.getId()));
                    return;
                }
            }
        } else if (value.toUpperCase().contains("AMD") || value.toUpperCase().contains("RADEON")) {
            String query = getMatchesSubString(value, "\\S*[0-9]{3,}\\S*");
            for (VideoCard videoCard : listVideoCard) {
                if (videoCard.getName().toUpperCase().contains("RADEON")
                        && containsSubstring(videoCard.getName(), query)) {
                    lap.setExternalVideoCard(BigInteger.valueOf(videoCard.getId()));
                    return;
                }
            }
        }
    }

    private boolean containsSubstring(String str, String query) {
        String tmp[] = str.split(" ");
        for (String s : tmp) {
            if (s.equalsIgnoreCase(query)) {
                return true;
            }
        }
        return false;
    }

    private BigInteger getStorageSize(String value) {
        if (value.length() > 0) {
            String size = null;
            String pat = "[0-9]{1,3}(TB|GB)";
//            Pattern p = Pattern.compile(pat);
//            Matcher m = p.matcher(value);
//            while (m.find()) {
//                size = m.group();
//            }
            size = getMatchesSubString(value, pat);
            if (size != null && size.split("TB")[0].length() < size.length()) {
                return BigInteger.valueOf(Integer.parseInt(size.split("TB")[0]) * 1024);
            }
            if (size != null && size.split("GB")[0].length() < size.length()) {
                return BigInteger.valueOf(Integer.parseInt(size.split("GB")[0]));
            }
        }
        return null;
    }

    private String getMatchesSubString(String str, String patt) {
        Pattern p = Pattern.compile(patt);
        Matcher m = p.matcher(str);
        while (m.find()) {
            return m.group();
        }
        return null;
    }

}
