/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.interfaces.service;

import com.umg.utils.ErrosWS;
import com.umg.utils.RequestFilter;

/**
 *
 * @author Asus TP500L
 */
public interface CreateService {
    public ErrosWS create(RequestFilter request);
}
