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
public class Filter {
    private String campo;
    private String value;
    private String type;

    public Filter() {
    }

    public Filter(String campo, String value, String type) {
        this.campo = campo;
        this.value = value;
        this.type = type;
    }

    
    
    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    


}
