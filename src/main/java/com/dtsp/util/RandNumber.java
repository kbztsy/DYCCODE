package com.dtsp.util;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Component
public class RandNumber {
    public String RandStr15(){
        String uuid = UUID.randomUUID().toString().replaceAll("-","").substring(0,15);
        return uuid;
    }
    public BigDecimal RandInt10(){
        String intStr = "";
        for(int i=0;i<10;i++){
            int in = (int)(Math.random()*10);
            intStr+=in;
        }
        return new BigDecimal(Double.parseDouble(intStr));
    }
    public BigDecimal RandInt20(){
        String intStr = new Date().getTime()+"";
        for(int i=0;i<7;i++){
            int in = (int)(Math.random()*10);
            intStr += in;
        }
        return new BigDecimal(Double.parseDouble(intStr));
    }
}
