/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.lss.utils;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author HongLinh
 */
public class CrawlerUtils {

    public static String getTextValue(Element parentEle, String selector) {
        if (parentEle == null) {
            return null;
        }
        String result = "";
        Element ele = null;
        if (selector != null) {
            Elements elems;
            elems = parentEle.select(selector);
            if (elems == null) {
                return null;
            }
            for (int i = 0; i < elems.size(); i++) {
                ele = elems.get(i);
                if (i > 0) {
                    result += " ";
                }
                result += getTextValue(ele, null);
            }
        } else {
            result = parentEle.text().trim();
        }
        return result;
    }

    public static String getAttributeValue(Element parentEle, String selector, String attName) {
        if (parentEle == null || attName == null) {
            return null;
        }
        String result = "";
        Element ele = null;
        if (selector != null) {
            Elements elems = parentEle.select(selector);
            if (elems == null) {
                return null;
            }
            for (int i = 0; i < elems.size(); i++) {
                ele = elems.get(i);
                if (i > 0) {
                    result += " ";
                }
                result += getAttributeValue(ele, null, attName);
            }
        } else {
            result = parentEle.attr(attName).trim();
        }
        return result;
    }
}
