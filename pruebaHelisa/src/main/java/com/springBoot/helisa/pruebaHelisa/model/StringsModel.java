/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springBoot.helisa.pruebaHelisa.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author raphael.lara
 */
public class StringsModel implements Serializable {
    
    private int number;
    private List<String> listStrings;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<String> getListStrings() {
        return listStrings;
    }

    public void setListStrings(List<String> listStrings) {
        this.listStrings = listStrings;
    }
    
    
    
}
