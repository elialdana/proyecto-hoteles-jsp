/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.service.impl;

import com.umg.dao.*;
import com.umg.interfaces.service.CreateService;
import com.umg.utils.Constants;
import com.umg.utils.ErrorCodeWS;
import com.umg.utils.ErrosWS;
import com.umg.utils.Filter;
import com.umg.utils.RequestFilter;
import java.util.List;

/**
 *
 * @author Asus TP500L
 */
public class CreateServiceImpl implements CreateService {

    private static final GenericDao dao = new GenericDao();

    @Override
    public ErrosWS create(RequestFilter request) {
        ErrosWS error = null;

        //TODO VALIDACIONES
        //GUARDAR
        String table = request.getTable();
        List<Filter> lstFilters = request.getLstFilters();

        String campos = "";
        String valores = "";
        int sizeCount = 1;
        int sizeEnd = 0;
        if (null != lstFilters && !lstFilters.isEmpty()) {
            sizeEnd = lstFilters.size();
            for (Filter f : lstFilters) {

                if (sizeEnd > sizeCount) {
                    campos += f.getCampo() + ", ";
                    valores += "'" + f.getValue() + "'" + ", ";
                } else {
                    campos += f.getCampo();
                    valores += "'" + f.getValue() + "'";
                }

                sizeCount++;

            }

        }
        //CONSTRUCCIÓN DE QUERY
        String query = "insert into "+Constants.ESQUEMA+"." + table + " ( " + campos + ") values (" + valores + ");";

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
