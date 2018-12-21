/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springBoot.helisa.pruebaHelisa.logic;

import com.springBoot.helisa.pruebaHelisa.model.MinimumSwapsModel;
import org.springframework.stereotype.Component;

/**
 *
 * @author raphael.lara
 */
@Component
public class MinimumSwapsLogic {

    public String resolvMinimumSwaps(MinimumSwapsModel data) {
        int swap = 0;
        
        boolean visited[] = new boolean[data.getSize()];

        for (int i = 0; i < data.getSize(); i++) {
            int j = i, cycle = 0;

            while (!visited[j]) {
                visited[j] = true;
                j = data.getArrayNumbers()[j] - 1;
                System.out.println("J -> "+j);
                cycle++;
            }
            System.out.println("Cycle -> "+cycle);
            if (cycle != 0) {
                swap += cycle - 1;
            }
        }
        return String.valueOf(swap);
        
    }

}
