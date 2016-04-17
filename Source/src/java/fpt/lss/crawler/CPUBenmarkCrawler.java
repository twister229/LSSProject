/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.lss.crawler;

import fpt.lss.entity.CPU;
import fpt.lss.jaxb.CPUJAXB;
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
public class CPUBenmarkCrawler {

    public static void main(String[] args) throws IOException {
        String url = "https://www.cpubenchmark.net/cpu_list.php";
        String xsdPath = "src/java/fpt/lss/jaxb/schema.xsd";
        String cpuRowSelector = "tr[id^=cpu]";
        String cpuNameSelector = "td:eq(0)";
        String cpuMarkSelector = "td:eq(1)";

        File htmlOut = new File("D://Crawler//cpu.html");
        Document doc;
        if (!htmlOut.exists()) {
            doc = Jsoup.connect(url).timeout(20000).get();
            Writer writer = new PrintWriter(htmlOut, "UTF-8");
            writer.write(doc.html());
            writer.flush();
            writer.close();
        } else {
            doc = Jsoup.parse(htmlOut, "UTF-8");
        }

        Elements cpuRows = doc.select(cpuRowSelector);
        int total = cpuRows.size();
        System.out.println("TOTAL: " + total);
        int doneCount = 0;
        int errCount = 0;
        CPUJAXB cpuJAXB;
        CPU cpu;
        Element row;
        for (int i = 0; i < total; i++) {
            cpuJAXB = new CPUJAXB();
            row = cpuRows.get(i);
            cpuJAXB.setName(row.select(cpuNameSelector).get(0).text());
            cpuJAXB.setMark(new BigInteger(row.select(cpuMarkSelector).get(0).text()));
            if (XMLUtils.validateJAXBObject(cpuJAXB, xsdPath)) {
                try {
                    cpu = new CPU(cpuJAXB.getName(), cpuJAXB.getMark().intValue());
                    if (DBUtils.save(cpu) != null) {
                        doneCount++;
                        System.out.println("Done: " + doneCount + "/" + total);
                    } else {
                        errCount++;
                        System.out.println("Insert DB error!");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(CPUBenmarkCrawler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalArgumentException ex) {
                    Logger.getLogger(CPUBenmarkCrawler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(CPUBenmarkCrawler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NamingException ex) {
                    Logger.getLogger(CPUBenmarkCrawler.class.getName()).log(Level.SEVERE, null, ex);
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
