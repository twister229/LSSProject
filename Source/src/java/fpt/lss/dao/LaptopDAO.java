/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fpt.lss.dao;

import fpt.lss.entity.Laptop;
import fpt.lss.utils.DBUtils;
import java.math.BigDecimal;
import java.util.List;


/**
 *
 * @author HongLinh
 */
public class LaptopDAO {
    public List<Laptop> getLaptopByBrandId(int brandId) {
        String query = "WHERE BrandId = ?";
        List<Laptop> result = DBUtils.fetchByQuery(query, Laptop.class, BigDecimal.valueOf(brandId));
        return result;
    }
}
