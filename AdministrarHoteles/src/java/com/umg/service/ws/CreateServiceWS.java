/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.service.ws;

import com.umg.service.impl.CreateServiceImpl;
import com.umg.utils.ErrosWS;
import com.umg.utils.RequestFilter;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Asus TP500L
 */
@WebService(serviceName = "CreateService")
public class CreateServiceWS {

  final  CreateServiceImpl wsImpl = new CreateServiceImpl();

    @WebMethod(operationName = "create")
    public ErrosWS create(@WebParam(name = "request") RequestFilter request) {
       
        ErrosWS error = wsImpl.create(request);

        return error;
    }

}
