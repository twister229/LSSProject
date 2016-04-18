/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.lss.dao;

import fpt.lss.entity.VideoCard;
import fpt.lss.utils.DBUtils;

/**
 *
 * @author HongLinh
 */
public class VideoCardDAO {

    public VideoCard getById(int id) {
        return DBUtils.fetchByKey(Integer.valueOf(id), VideoCard.class);
    }
}
