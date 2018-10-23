/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.validation;

import com.umg.utils.Constants;

/**
 *
 * @author Asus TP500L
 */
public abstract  class PrepareDB {
       
    public static String get(String value , String type){
        
        if(Constants.TYPE_STRING.equals(type)){
            
            return "'"+value+"'";
        }
        
        
        return value;
    }
}
