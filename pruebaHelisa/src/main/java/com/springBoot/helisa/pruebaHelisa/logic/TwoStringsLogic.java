/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springBoot.helisa.pruebaHelisa.logic;

import com.springBoot.helisa.pruebaHelisa.model.StringsModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author raphael.lara
 */
@Component
public class TwoStringsLogic {

    public List<String> resolveStrings(StringsModel data) {
        int index=0;
        List< String> listResult = new ArrayList<>();
        if (data == null || data.getListStrings().isEmpty()) {

            return listResult;
        }
        for (int i = 0; i < data.getNumber(); i++) {
        
            boolean result;
            if (data.getListStrings().get(index).length() == data.getListStrings().get(index+1).length()) {
                
                result = validate(data.getListStrings().get(index), data.getListStrings().get(index+1));
            } else {
                result = validate(data.getListStrings().get(index).length() < data.getListStrings().get(index+1).length()
                        ? data.getListStrings().get(index)
                        : data.getListStrings().get(index+1),
                        data.getListStrings().get(index).length() > data.getListStrings().get(index+1).length()
                        ? data.getListStrings().get(index)
                        : data.getListStrings().get(index+1));
            }
            listResult.add(result ? "YES" : "NO");
            index = index+2;

        }
        return listResult;

    }

    private boolean validate(String shortString, String longString) {
       System.out.println("shortString -> "+shortString);
        if(shortString.length() == 0){
            return false;
        }
        
        if(longString.contains(String.valueOf(shortString.charAt(shortString.length()-1)))){
            return true;
        }
        
         else{
            return validate (shortString.substring(0, shortString.length()-1),longString);
        }
        
    }

}
