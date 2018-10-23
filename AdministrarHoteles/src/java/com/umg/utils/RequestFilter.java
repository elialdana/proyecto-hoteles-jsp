package com.umg.utils;

import java.util.List;


/**
 * @author Asus TP500L
 * @version 1.0
 * @created 14-oct.-2018 3:06:38 a. m.
 */
public class RequestFilter {


    private String table;
    private Integer id ;
    private List<Filter>lstFilters;

    public RequestFilter() {
    }

    public RequestFilter(String table, List<Filter> lstFilters) {
        this.table = table;
        this.lstFilters = lstFilters;
    }

    
    
    public List<Filter> getLstFilters() {
        return lstFilters;
    }

    public void setLstFilters(List<Filter> lstFilters) {
        this.lstFilters = lstFilters;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
    
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

        
        
}