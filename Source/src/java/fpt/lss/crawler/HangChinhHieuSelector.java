/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.lss.crawler;

/**
 *
 * @author HongLinh
 */
public class HangChinhHieuSelector implements SelectorInterface {

    @Override
    public String getListCategory() {
        return "span:has(a[href=\"/danh-muc-hang-44\"]) > ul a";
    }

    @Override
    public String getListLaptop() {
        return "li.transition.san-pham";
    }

//    @Override
//    public int getBrandId(String brandName) {
//        if (brandName.equals("Dell")) {
//            return 1;
//        } else if (brandName.equals("Asus")) {
//            return 2;
//        } else if (brandName.equals("Acer")) {
//            return 3;
//        } else if (brandName.equals("Lenovo")) {
//            return 4;
//        } else if (brandName.equals("HP")) {
//            return 5;
//        }
//        return 0;
//    }
    @Override
    public String getName() {
        return "span.Details > span.name";
    }

    @Override
    public String getWarranty() {
        return "div.overview-product > div.details-product > ul > "
                + "li.li-list-details-product.li-thong-so > "
                + "ul.ul-km > li:nth-child(4) > div > ul > li:nth-child(3)";
    }

    @Override
    public String getAvatar() {
        return "img[src]";
    }

    @Override
    public String getSourceLink() {
        return "a[href]";
    }

    @Override
    public String getPrice() {
        return "div.details-product > ul > li.li-list-details-product.li-thong-so > ul.ul-km > li:nth-child(4) > div > div.price > span.new-price";
    }

    @Override
    public String getHost() {
        return "http://hangchinhhieu.vn";
    }

    @Override
    public String getListContent() {
        return "div.content-ts > table > tbody > tr";
    }

}
