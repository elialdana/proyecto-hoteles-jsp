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
public class Constants {
    
    public final static String TYPE_STRING = "java.lang.String";
    public final static String CLASS_NAME = "com.mysql.cj.jdbc.Driver";
    public final static String URL = Constants.URL_BASE+Constants.SERVIDOR+Constants.PUERTO+Constants.BD;
    public final static String USER = "root";
    public final static String PASSWORD = "";
    public final static String ESQUEMA = "hotel";
    // Cadenas para formar URL
    public final static String URL_BASE = "jdbc:mysql://";
    public final static String SERVIDOR = "localhost:";
    public final static String PUERTO = "3306";
    public final static String BD = "/hotel?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
}
