/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class Student implements Serializable{
    
    private int id;
    private String fullname;
    private String phone;
    private String avg_mark;

    public Student() {
    }

    public Student(int id, String fullname, String phone, String avg_mark) {
        this.id = id;
        this.fullname = fullname;
        this.phone = phone;
        this.avg_mark = avg_mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvg_mark() {
        return avg_mark;
    }

    public void setAvg_mark(String avg_mark) {
        this.avg_mark = avg_mark;
    }
    
    
}
