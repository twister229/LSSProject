/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fpt.lss.entity;

import fpt.lss.annotation.Entity;
import fpt.lss.annotation.Key;
import fpt.lss.annotation.Table;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author HongLinh
 */
@Table(name = "Brand")
public class Brand implements Serializable {
    @Entity(name = "Id")
    private Integer id;
    @Entity(name = "Name")
    private String name;

    public Brand() {
    }

    public Brand(String name) {
        this.name = name;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
