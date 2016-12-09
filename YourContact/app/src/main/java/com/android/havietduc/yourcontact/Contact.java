package com.android.havietduc.yourcontact;

import java.io.Serializable;

/**
 * Created by havietduc on 12/1/16.
 */

public class Contact implements Serializable{
   private int id;
    private String fname;
    private String phone;
    private String email;
    private String addr;


    public Contact() {
    }

    public Contact(int id, String fname, String phone, String email, String addr) {
        this.id = id;
        this.fname = fname;
        this.phone = phone;
        this.email = email;
        this.addr = addr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
