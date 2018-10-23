package com.umg.db;
import com.umg.utils.Constants;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus TP500L
 */
public class ConnectionDB {
    
    public Connection getConnection() throws InstantiationException, IllegalAccessException{
		
    	Connection c = null;
		
	try {
            
            Class.forName(Constants.CLASS_NAME).newInstance();
            c = DriverManager.getConnection(Constants.URL, Constants.USER, Constants.PASSWORD);
            System.out.println("CONECTADO");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("FALLO EN CONEXION");
            e.printStackTrace();
	}
            return c;
    }
	
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        ConnectionDB cnx = new ConnectionDB();
        
        cnx.getConnection();
    }
}
