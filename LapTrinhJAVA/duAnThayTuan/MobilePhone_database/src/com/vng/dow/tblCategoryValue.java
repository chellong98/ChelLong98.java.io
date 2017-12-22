/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vng.dow;

/**
 *
 * @author Long Nguyen Nhat
 */
public class tblCategoryValue {
    private int IDCategoryValue;
    private int CategoryID;
    private int Value;
    private int number;
    private String version;
    private int IdParentld;
    private Object ValueMapping;

    public int getIDCategoryValue() {
        return IDCategoryValue;
    }

    public void setIDCategoryValue(int IDCategoryValue) {
        this.IDCategoryValue = IDCategoryValue;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int CategoryID) {
        this.CategoryID = CategoryID;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int Value) {
        this.Value = Value;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getIdParentld() {
        return IdParentld;
    }

    public void setIdParentld(int IdParentld) {
        this.IdParentld = IdParentld;
    }

    public Object getValueMapping() {
        return ValueMapping;
    }

    public void setValueMapping(Object ValueMapping) {
        this.ValueMapping = ValueMapping;
    }
    
    
}
