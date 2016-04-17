/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.lss.crawler;

import fpt.lss.entity.Laptop;
import fpt.lss.entity.Laptop_Provider;
import fpt.lss.jaxb.LaptopJAXB;
import fpt.lss.utils.CrawlerUtils;
import fpt.lss.utils.DBUtils;
import fpt.lss.utils.XMLUtils;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author HongLinh
 */
public class LaptopCrawler {

    public static void main(String[] args) throws IOException {
        SelectorInterface selector = new HangChinhHieuSelector();
        ValueGetterInterface getter = new HangChinhHieuGetter();
        //get list Category
        Document docJsoup = Jsoup.connect(selector.getHost()).get();
        Elements listCateElems = docJsoup.select(selector.getListCategory());

        Elements listLapElems;

        int brandId = 0;
        String name = null;
        String avatar = null;
        String sourceLink = null;
        String host = selector.getHost();
        String cateLink = null;
        LaptopJAXB lap = null;
        Laptop lapEntity = null;
        Laptop_Provider lapProvi = null;
        int total = 0;
        int done = 0;
        for (Element cateEle : listCateElems) {
            //each ele is a tag <a>
            brandId = getter.getBrandId(cateEle.text().trim());
            cateLink = host + cateEle.attr("href");
            System.out.println("LINK: " + cateLink);
            if (brandId > 0 && cateLink != null) {
                docJsoup = Jsoup.connect(cateLink).get();
                listLapElems = docJsoup.select(selector.getListLaptop());
                Element lapEle;
                Elements listContent = null;
                total += listLapElems.size();
                for (int i = 0; i < listLapElems.size(); i++) {
                    try {
                        lap = new LaptopJAXB();
                        lapEle = listLapElems.get(i);
                        //get some infor before go to laptop detail page
                        name = CrawlerUtils.getTextValue(lapEle, selector.getName());
                        avatar = host + CrawlerUtils.getAttributeValue(lapEle, selector.getAvatar(), "src");
                        sourceLink = host + CrawlerUtils.getAttributeValue(lapEle, selector.getSourceLink(), "href");

                        //go to laptop detail page and get info
                        docJsoup = Jsoup.connect(sourceLink).get();
                        lap = getter.getLaptop(docJsoup, selector, name, brandId, sourceLink, avatar);
                        if (lap != null) {
                            if (XMLUtils.validateJAXBObject(lap, "src/java/fpt/lss/jaxb/schema.xsd")) {
                                lapEntity = new Laptop(lap);
                                lapEntity = DBUtils.save(lapEntity);
                                lapProvi = new Laptop_Provider(lapEntity.getId().intValue(), 1, lap.getPrice().doubleValue());
                                DBUtils.save(lapProvi);
                                done++;
                                System.out.println("Done: " + done + "/" + total);
                            }
                        }
                    } catch (SQLException ex) {
                        System.out.println("SQL ERROR: " + ex.getMessage());
                        System.out.println("Name: " + lap.getName());
                        System.out.println("Link: " + lap.getSourceLink());
//                        ex.printStackTrace();
                    } catch (IllegalArgumentException ex) {
                        Logger.getLogger(LaptopCrawler.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(LaptopCrawler.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (NamingException ex) {
                        Logger.getLogger(LaptopCrawler.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else {
                System.out.println("Invalid brand: " + cateEle.html());
            }
        }
        System.out.println("Total: " + total);
        System.out.println("Done: " + done);
    }

}
