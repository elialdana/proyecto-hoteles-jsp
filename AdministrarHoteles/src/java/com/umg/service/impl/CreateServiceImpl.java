/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.service.impl;

import com.umg.interfaces.service.CreateService;
import com.umg.utils.ErrosWS;
import com.umg.utils.Filter;
import com.umg.utils.RequestFilter;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Asus TP500L
 */
@WebService(serviceName = "CreateService")
public class CreateServiceImpl implements CreateService{

    @WebMethod(operationName = "create")
    @Override
    public ErrosWS create(@WebParam(name = "request") RequestFilter request) {
        //TODO VALIDACIONES
        //GUARDAR
        String table = request.getTable();
        List<Filter>lstFilters = request.getLstFilters();
   
        String campos =null;
        String valores = null;
        int sizeCount = 0; 
        int sizeEnd = 0;
        if(null != lstFilters && !lstFilters.isEmpty()){
            sizeEnd = lstFilters.size();
             for (Filter f : lstFilters) {
                 
                if(sizeEnd != sizeCount){
                    campos+=f.getCampo()+", ";
                    valores+=f.getValue()+", ";
                }else{
                    campos+=f.getCampo();
                    valores+=f.getValue();
                }

                  sizeCount++;    
             
              }
             
        }
        //CONSTRUCCIÓN DE QUERY
        String query ="insert into "+table+" (ID, "+campos+") values ("+valores+")";    
        
        
        System.out.println("consumiento ws crear "+query);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        
    }

   

}
