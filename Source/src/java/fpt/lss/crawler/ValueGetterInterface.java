/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fpt.lss.crawler;

import fpt.lss.entity.CPU;
import fpt.lss.entity.VideoCard;
import fpt.lss.jaxb.LaptopJAXB;
import fpt.lss.utils.DBUtils;
import java.math.BigInteger;
import java.util.List;
import org.jsoup.nodes.Document;

/**
 *
 * @author HongLinh
 */
public abstract class ValueGetterInterface {
    protected List<CPU> listCPU;
    protected List<VideoCard> listVideoCard;

    public ValueGetterInterface() {
        listCPU = DBUtils.fetchAll(CPU.class);
        listVideoCard = DBUtils.fetchAll(VideoCard.class);
    }
    
    protected abstract BigInteger getPrice(String priceStr);
    public abstract int getBrandId(String brandName);
    public abstract LaptopJAXB getLaptop(Document doc, SelectorInterface selector,
            String name, int brandId, String sourceLink, String avatar);
}
