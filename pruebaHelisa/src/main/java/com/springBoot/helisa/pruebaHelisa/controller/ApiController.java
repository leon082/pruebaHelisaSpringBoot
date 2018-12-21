/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springBoot.helisa.pruebaHelisa.controller;

import com.springBoot.helisa.pruebaHelisa.logic.MinimumSwapsLogic;
import com.springBoot.helisa.pruebaHelisa.logic.TwoStringsLogic;
import com.springBoot.helisa.pruebaHelisa.model.MinimumSwapsModel;
import com.springBoot.helisa.pruebaHelisa.model.StringsModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author raphael.lara
 * Ruta para probar los services
 * http://localhost:8080/swagger-ui.html
 */
@RestController
@RequestMapping(value = "/services")
public class ApiController {

    @Autowired
    private TwoStringsLogic stringsLogic;
    @Autowired
    private MinimumSwapsLogic minimunSwaps;
/*
    Json de request ejemplo
    {
"number": 3,
  "listStrings": [
    "hello",
    "world",
    "hi",
    "world",
     "wi",
    "world"
  ]
  
}
    
    Json de salida que retornaria:
    
    [
  "YES",
  "NO",
  "YES"
] */
    @PostMapping(value = "/resolveStrings")
    public List<String> resolveStringsLogic(@RequestBody StringsModel data) {
        return stringsLogic.resolveStrings(data);
    }
/*
    json request
    {
  "listNumbers": [
    2,
3,
4,
1,
5
  ],
  "size": 5
}
    
    json response
    {3}
    
    */
   @PostMapping(value = "/resolveMinimumSwaps")
    public String resolveMinimumSwaps(@RequestBody MinimumSwapsModel data) {
        return minimunSwaps.resolvMinimumSwaps(data);
    }

}
