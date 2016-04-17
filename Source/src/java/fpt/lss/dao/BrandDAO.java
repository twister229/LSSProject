/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fpt.lss.dao;

import fpt.lss.entity.Brand;
import fpt.lss.utils.DBUtils;
import java.util.List;

/**
 *
 * @author HongLinh
 */
public class BrandDAO {
    public Brand getBrandById(int id) {
        return DBUtils.fetchByKey(id, Brand.class);
    }
    
    public List getAllBrand() {
        return DBUtils.fetchAll(Brand.class);
    }
}
