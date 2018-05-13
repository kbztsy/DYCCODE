package com.dtsp.util;

import org.springframework.stereotype.Component;

import java.util.Map;
@Component
public class RandNumber {
    public Long Randint(){
        String intStr = "";
        for(int i =0; i<10;i++){
          int in = (int)(Math.random()*9);
            intStr +=in;
        }
      return Long.parseLong(intStr);
    }
}
