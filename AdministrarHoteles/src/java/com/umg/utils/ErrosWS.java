/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.utils;

/**
 *
 * @author Asus TP500L
 */
public class ErrosWS {
     private String code;
     private String description;

    public ErrosWS(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public ErrosWS() {
    }
     
     

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
     
     
     
     
}
