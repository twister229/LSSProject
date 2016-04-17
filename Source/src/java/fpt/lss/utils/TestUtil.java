/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fpt.lss.utils;

import fpt.lss.jaxb.GenerateJAXBClass;

/**
 *
 * @author HongLinh
 */
public class TestUtil {
    
    public static void main(String[] args) {
        System.out.println(getPrice("13,299,000₫"));
    }
    
    public static int getPrice(String priceStr) {
        return Integer.parseInt(priceStr.substring(0, priceStr.length() - 1).replaceAll(",", ""));
    }
}
