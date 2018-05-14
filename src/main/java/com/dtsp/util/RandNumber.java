package com.dtsp.util;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class RandNumber {
    public BigDecimal RandInt20(){
        String intStr = "";
        for(int i=0;i<20;i++){
            int in = (int)(Math.random()*9);
            intStr += in;
        }
        return new BigDecimal(Double.parseDouble(intStr));
    }
}
