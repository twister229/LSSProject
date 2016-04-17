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
@Table(name = "Laptop_Provider")
public class Laptop_Provider implements Serializable {

    @Key(indentity = true)
    @Entity(name = "Id")
    private BigDecimal id;
    @Entity(name = "LaptopId")
    private int laptopId;
    @Entity(name = "ProviderId")
    private int providerId;
    @Entity(name = "Price")
    private Double price;

    public Laptop_Provider() {
    }

    public Laptop_Provider(int laptopId, int providerId, Double price) {
        this.laptopId = laptopId;
        this.providerId = providerId;
        this.price = price;
    }

    public BigDecimal getId() {
        return id;
    }

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
