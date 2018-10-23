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
public abstract class ErrorCodeWS {
    
    public static final ErrosWS ERROR_DATABASE_INSERT = new  ErrosWS("DB001","Error, al insertar en base de datos");
    public static final ErrosWS ERROR_DATABASE_UPDATE = new  ErrosWS("DB002","Error, al modificar en base de datos");
    public static final ErrosWS SUCCESSFUL_TRANSACTION = new  ErrosWS("0000","Transacción exitosa");
}
