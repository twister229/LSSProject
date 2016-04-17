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
import java.sql.Date;

/**
 *
 * @author HongLinh
 */
@Table(name = "StudentInfo")
public class Student implements Serializable {

    @Key
    @Entity(name = "Code")
    private String code;
    @Entity(name = "Name")
    private String name;
    @Entity(name = "BirthDate")
    private Date birthdate;
    @Entity(name = "Email")
    private String email;

    public Student() {
    }

    public Student(String code, String name, Date birthday, String email) {
        this.code = code;
        this.name = name;
        this.birthdate = birthday;
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthdate;
    }

    public void setBirthday(Date birthday) {
        this.birthdate = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
