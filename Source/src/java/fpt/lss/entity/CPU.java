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

/**
 *
 * @author HongLinh
 */
@Table(name = "CPU")
public class CPU implements Serializable {

    @Key(indentity = true)
    @Entity(name = "Id")
    private Integer id;
    @Entity(name = "Name")
    private String name;
    @Entity(name = "Mark")
    private int mark;

    public CPU() {
    }

    public CPU(String name, int mark) {
        this.name = name;
        this.mark = mark;
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

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

}
