/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.service.impl;

import com.umg.dao.*;
import com.umg.interfaces.service.CreateService;
import com.umg.interfaces.service.UpdateService;
import com.umg.utils.Constants;
import com.umg.utils.ErrorCodeWS;
import com.umg.utils.ErrosWS;
import com.umg.utils.Filter;
import com.umg.utils.RequestFilter;
import com.umg.validation.PrepareDB;
import java.util.List;

/**
 *
 * @author Asus TP500L
 */
public class UpdateServiceImpl implements UpdateService {

    private static final GenericDao dao = new GenericDao();

    @Override
    public ErrosWS update(RequestFilter request) {
        ErrosWS error = null;

        //TODO VALIDACIONES
        //GUARDAR
        String table = request.getTable();
        List<Filter> lstFilters = request.getLstFilters();
        Integer id = request.getId();
        String modify = "";
        int sizeCount = 1;
        int sizeEnd = 0;
        if (null != lstFilters && !lstFilters.isEmpty()) {
            sizeEnd = lstFilters.size();
            for (Filter f : lstFilters) {

                if (sizeEnd > sizeCount) {
                    modify += f.getCampo() + " = "+PrepareDB.get(f.getValue() , f.getType()) + ", ";

                } else {
                    modify += f.getCampo() + " = "+PrepareDB.get(f.getValue() , f.getType()) ;
                }

                sizeCount++;

            }

        }
        //CONSTRUCCIÓN DE QUERY
        String query = "update  "+Constants.ESQUEMA+"." + table +  " SET "+modify +"WHERE id = "+id;

        //EJECUTANDO EN BASE DE DATOS
        boolean result = dao.execute(query);
        if (!result) {
            error = ErrorCodeWS.ERROR_DATABASE_INSERT;
            return error;
        }
        System.out.println("consumiento ws crear " + query);
        error = ErrorCodeWS.SUCCESSFUL_TRANSACTION;
        return error;
    }

}
