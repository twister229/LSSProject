/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.lss.crawler;

import fpt.lss.entity.VideoCard;
import fpt.lss.jaxb.VideoCardJAXB;
import fpt.lss.utils.DBUtils;
import fpt.lss.utils.XMLUtils;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.math.BigInteger;
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
public class VideoCardCrawler {

    public static void main(String[] args) throws IOException {
        String url = "http://www.videocardbenchmark.net/gpu_list.php";
        String xsdPath = "src/java/fpt/lss/jaxb/schema.xsd";
        String gpuRowSelector = "tr[id^=gpu]";
        String gpuNameSelector = "td:eq(0)";
        String gpuMarkSelector = "td:eq(1)";

        File htmlOut = new File("D://Crawler//gpu.html");
        Document doc;
        if (!htmlOut.exists()) {
            doc = Jsoup.connect(url).timeout(10000).get();
            Writer writer = new PrintWriter(htmlOut, "UTF-8");
            writer.write(doc.html());
            writer.flush();
            writer.close();
        } else {
            doc = Jsoup.parse(htmlOut, "UTF-8");
        }

        Elements gpuRows = doc.select(gpuRowSelector);
        int total = gpuRows.size();
        System.out.println("TOTAL: " + total);
        int doneCount = 0;
        int errCount = 0;
        VideoCardJAXB gpuJAXB;
        VideoCard gpu;
        Element row;
        for (int i = 0; i < total; i++) {
            gpuJAXB = new VideoCardJAXB();
            row = gpuRows.get(i);
            gpuJAXB.setName(row.select(gpuNameSelector).get(0).text());
            gpuJAXB.setMark(new BigInteger(row.select(gpuMarkSelector).get(0).text()));
            if (XMLUtils.validateJAXBObject(gpuJAXB, xsdPath)) {
                try {
                    gpu = new VideoCard(gpuJAXB.getName(), gpuJAXB.getMark().intValue());
                    if (DBUtils.save(gpu) != null) {
                        doneCount++;
                        System.out.println("Done: " + doneCount + "/" + total);
                    } else {
                        errCount++;
                        System.out.println("Insert DB error!");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(VideoCardCrawler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalArgumentException ex) {
                    Logger.getLogger(VideoCardCrawler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(VideoCardCrawler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NamingException ex) {
                    Logger.getLogger(VideoCardCrawler.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                errCount++;
                System.out.println("Fail at: " + row.text());
            }
        }
        System.out.println("DONE: " + doneCount + "/" + total);
        System.out.println("ERROR: " + errCount + "/" + total);
    }

}
